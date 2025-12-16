package com.github.luben.zstd.util;

import AK.c;
import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public enum Native {
    ;

    private static final String libname = "libzstd-jni-1.5.6-6";
    private static final String libnameShort = "zstd-jni-1.5.6-6";
    private static final String nativePathOverride = "ZstdNativePath";
    private static final String tempFolderOverride = "ZstdTempFolder";
    private static final String errorMsg = c.s(new StringBuilder("Unsupported OS/arch, cannot find "), resourceName(), " or load zstd-jni-1.5.6-6 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.6-6 in your system.");
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        loaded.set(true);
    }

    public static synchronized boolean isLoaded() {
        return loaded.get();
    }

    private static String libExtension() {
        return (osName().contains("os_x") || osName().contains("darwin")) ? "dylib" : osName().contains("win") ? "dll" : "so";
    }

    public static synchronized void load() {
        try {
            String property = System.getProperty(tempFolderOverride);
            if (property == null) {
                load(null);
            } else {
                load(new File(property));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osArch() {
        return System.getProperty("os.arch");
    }

    private static String osName() {
        String strReplace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        return strReplace.startsWith("win") ? "win" : strReplace.startsWith("mac") ? "darwin" : strReplace;
    }

    private static String resourceName() {
        return "/" + osName() + "/" + osArch() + "/libzstd-jni-1.5.6-6." + libExtension();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, Catch: all -> 0x0026, REMOVE, SYNTHETIC, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x001c, B:18:0x003a, B:20:0x0042, B:48:0x00cd, B:50:0x00d2, B:51:0x00d5, B:53:0x00db, B:72:0x014c, B:74:0x0151, B:76:0x0156, B:78:0x015c, B:79:0x015f, B:24:0x004f, B:25:0x0075, B:15:0x0029), top: B:86:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151 A[Catch: all -> 0x0026, IOException -> 0x015f, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x001c, B:18:0x003a, B:20:0x0042, B:48:0x00cd, B:50:0x00d2, B:51:0x00d5, B:53:0x00db, B:72:0x014c, B:74:0x0151, B:76:0x0156, B:78:0x015c, B:79:0x015f, B:24:0x004f, B:25:0x0075, B:15:0x0029), top: B:86:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156 A[Catch: all -> 0x0026, IOException -> 0x015f, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x001c, B:18:0x003a, B:20:0x0042, B:48:0x00cd, B:50:0x00d2, B:51:0x00d5, B:53:0x00db, B:72:0x014c, B:74:0x0151, B:76:0x0156, B:78:0x015c, B:79:0x015f, B:24:0x004f, B:25:0x0075, B:15:0x0029), top: B:86:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void load(java.io.File r9) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.util.Native.load(java.io.File):void");
    }
}
