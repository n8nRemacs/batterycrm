package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import androidx.core.content.d;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzj {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f351546a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f351547b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f351548c;
    public static final /* synthetic */ int zza = 0;

    static {
        String str = Build.HARDWARE;
        f351547b = new String[]{"media", (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        f351548c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public static void b(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzi zziVar) throws IOException {
        IOException iOException;
        File dataDir;
        boolean z12 = true;
        final String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        final FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        try {
            StructStat structStat = (StructStat) new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Os.fstat(fileDescriptor);
                }
            }.call();
            long j12 = structStat.st_dev;
            long j13 = structStat.st_ino;
            OsConstants.S_ISLNK(structStat.st_mode);
            try {
                StructStat structStat2 = (StructStat) new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Os.lstat(canonicalPath);
                    }
                }.call();
                long j14 = structStat2.st_dev;
                long j15 = structStat2.st_ino;
                if (OsConstants.S_ISLNK(structStat2.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (j12 != j14 || j13 != j15) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                    zzi zziVar2 = zzi.zza;
                    zziVar.getClass();
                    File dataDir2 = d.getDataDir(context);
                    if (dataDir2 == null ? !canonicalPath.startsWith(a(Environment.getDataDirectory())) : !canonicalPath.startsWith(a(dataDir2))) {
                        Context contextCreateDeviceProtectedStorageContext = d.createDeviceProtectedStorageContext(context);
                        if (contextCreateDeviceProtectedStorageContext == null || (dataDir = d.getDataDir(contextCreateDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(a(dataDir))) {
                            try {
                                File[] fileArr = (File[]) new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        String[] strArr = zzj.f351546a;
                                        return d.getExternalFilesDirs(context, null);
                                    }
                                }.call();
                                int length = fileArr.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < length) {
                                        File file = fileArr[i12];
                                        if (file != null && canonicalPath.startsWith(a(file))) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        try {
                                            File[] fileArr2 = (File[]) new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzd
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    String[] strArr = zzj.f351546a;
                                                    return d.getExternalCacheDirs(context);
                                                }
                                            }.call();
                                            int length2 = fileArr2.length;
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < length2) {
                                                    File file2 = fileArr2[i13];
                                                    if (file2 != null && canonicalPath.startsWith(a(file2))) {
                                                        break;
                                                    } else {
                                                        i13++;
                                                    }
                                                } else {
                                                    z12 = false;
                                                    break;
                                                }
                                            }
                                        } catch (NullPointerException e12) {
                                            throw e12;
                                        } catch (Exception e13) {
                                            throw new RuntimeException(e13);
                                        }
                                    }
                                }
                            } catch (NullPointerException e14) {
                                throw e14;
                            } catch (Exception e15) {
                                throw new RuntimeException(e15);
                            }
                        }
                    }
                    if (z12 == zziVar.f351518a) {
                        return;
                    }
                }
                throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
            } finally {
            }
        } finally {
        }
    }

    public static boolean c(Context context, Uri uri, zzi zziVar) {
        int i12;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                return !zziVar.f351518a;
            }
        }
        zzr zzrVar = new zzr(uri, providerInfoResolveContentProvider, authority);
        zzaq zzaqVar = zziVar.f351519b;
        int size = zzaqVar.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i12 = 3;
                break;
            }
            int iA2 = ((zzs) zzaqVar.get(i13)).a(context, zzrVar) - 1;
            i13++;
            if (iA2 == 1) {
                i12 = 2;
                break;
            }
        }
        if (i12 - 1 == 1) {
            return false;
        }
        boolean zEquals = context.getPackageName().equals(providerInfoResolveContentProvider.packageName);
        boolean z12 = zziVar.f351518a;
        if (zEquals) {
            return z12;
        }
        if (z12) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = f351547b;
            int length = strArr.length;
            for (int i14 = 0; i14 < 2; i14++) {
                if (strArr[i14].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = f351548c;
            int length2 = strArr2.length;
            for (int i15 = 0; i15 < 3; i15++) {
                if (strArr2[i15].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = f351546a;
            for (int i16 = 0; i16 < 6; i16++) {
                String str = strArr3[i16];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        zzi zziVar = zzi.zza;
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uri, "r");
        }
        if ("content".equals(scheme)) {
            if (!c(context, uri, zziVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                return assetFileDescriptorOpenAssetFileDescriptor;
            }
            throw new FileNotFoundException("Content resolver returned null value.");
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
        try {
            b(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uri, zziVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e12) {
            try {
                assetFileDescriptorOpenAssetFileDescriptor2.close();
            } catch (IOException e13) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e12, e13);
            }
            throw e12;
        } catch (IOException e14) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e14);
            try {
                assetFileDescriptorOpenAssetFileDescriptor2.close();
                throw fileNotFoundException;
            } catch (IOException e15) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e15);
                throw fileNotFoundException;
            }
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzi zziVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uri);
        }
        if ("content".equals(scheme)) {
            if (!c(context, uri, zziVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new FileNotFoundException("Content resolver returned null value.");
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uri.getPath()).getCanonicalFile()), "r");
            try {
                b(context, parcelFileDescriptorOpenFileDescriptor, uri, zziVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e12) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e13) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e12, e13);
                }
                throw e12;
            } catch (IOException e14) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e14);
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw fileNotFoundException;
                } catch (IOException e15) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e15);
                    throw fileNotFoundException;
                }
            }
        } catch (IOException e16) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e16);
            throw fileNotFoundException2;
        }
    }
}
