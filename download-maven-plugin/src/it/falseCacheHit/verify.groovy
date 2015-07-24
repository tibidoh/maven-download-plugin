import junit.framework.Assert

File f1 = new File(basedir, "sub2/target/file");
File f2 = new File(basedir, "sub3/target/file");

Assert.assertFalse(
        "File contents must differ, as sources are different",
        f1.text == f2.text)


