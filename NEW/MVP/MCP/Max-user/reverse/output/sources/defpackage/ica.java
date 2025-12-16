package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public enum ica {
    ;

    public static boolean a = false;

    public static void a() {
        File[] fileArrListFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new hca(0));
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old temp lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static int c() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return 2;
        }
        if (property.contains("Mac")) {
            return 3;
        }
        if (property.contains("Windows")) {
            return 1;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return 4;
        }
        throw new UnsupportedOperationException("Unsupported operating system: ".concat(property));
    }

    public static String d() {
        String str;
        int iC = c();
        StringBuilder sbN = az1.n("/", ica.class.getPackage().getName().replace('.', '/'), "/");
        if (iC == 1) {
            str = "win32";
        } else if (iC == 2) {
            str = "linux";
        } else if (iC == 3) {
            str = "darwin";
        } else {
            if (iC != 4) {
                throw null;
            }
            str = "solaris";
        }
        sbN.append(str);
        sbN.append("/");
        sbN.append(System.getProperty("os.arch"));
        sbN.append("/liblz4-java.");
        sbN.append(vb9.b(iC));
        return sbN.toString();
    }

    public static ica valueOf(String str) {
        u45.r(Enum.valueOf(ica.class, str));
        throw null;
    }
}
