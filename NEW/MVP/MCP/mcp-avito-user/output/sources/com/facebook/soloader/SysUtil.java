package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes16.dex */
public final class SysUtil {

    @InterfaceC36428e
    @TargetApi(14)
    public static class Api14Utils {
        public static String a() throws NoSuchMethodException, SecurityException {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e12) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e12);
                }
            }
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
    }

    @InterfaceC36428e
    @TargetApi(21)
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @InterfaceC36428e
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j12) throws IOException, ErrnoException {
            int i12;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j12);
            } catch (ErrnoException e12) {
                if (e12.errno != OsConstants.EOPNOTSUPP && (i12 = e12.errno) != OsConstants.ENOSYS && i12 != OsConstants.EINVAL) {
                    throw new IOException(e12.toString(), e12);
                }
            }
        }

        @InterfaceC36428e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add("arm64-v8a");
                    treeSet.add("x86_64");
                } else {
                    treeSet.add("armeabi-v7a");
                    treeSet.add("x86");
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e12) {
                String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e12.errno), e12.getMessage());
                return Build.SUPPORTED_ABIS;
            }
        }

        @InterfaceC36428e
        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @InterfaceC36428e
    @TargetApi(23)
    public static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        @InterfaceC36428e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add("arm64-v8a");
                treeSet.add("x86_64");
            } else {
                treeSet.add("armeabi-v7a");
                treeSet.add("x86");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @InterfaceC36428e
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            parentFile.toString();
        }
        if (!file.delete() && file.exists()) {
            throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file, "Could not delete file "));
        }
    }

    public static void b(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException(androidx.compose.ui.graphics.colorspace.e.j(file, "cannot list directory "));
            }
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
            return;
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @I41.h
    public static s c(File file, File file2, boolean z12) {
        s sVar = null;
        boolean z13 = true;
        try {
            if (z12) {
                return new s(file2, false);
            }
            s sVar2 = new s(file2, true);
            if (sVar2.f340896c != null) {
                return sVar2;
            }
            sVar2.close();
            return null;
        } catch (FileNotFoundException e12) {
            try {
                if (!file.setWritable(true)) {
                    throw e12;
                }
                if (z12) {
                    s sVar3 = new s(file2, false);
                    if (!file.setWritable(false)) {
                        file.getCanonicalPath();
                    }
                    return sVar3;
                }
                s sVar4 = new s(file2, true);
                if (sVar4.f340896c == null) {
                    sVar4.close();
                } else {
                    sVar = sVar4;
                }
                if (!file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                return sVar;
            } catch (Throwable th2) {
                th = th2;
                if (z13 && !file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z13 = false;
            if (z13) {
                file.getCanonicalPath();
            }
            throw th;
        }
    }

    public static boolean d(int i12, Context context) throws IOException {
        if (i12 == 2) {
            ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement != null && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getName().contains("/lib")) {
                        z = zipEntryNextElement.getMethod() == 0;
                        zipFile.close();
                    }
                }
                zipFile.close();
                return false;
            } catch (Throwable th2) {
                try {
                    zipFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (context == null || (context.getApplicationInfo().flags & 268435456) != 0) {
            z = false;
        }
        return z;
    }
}
