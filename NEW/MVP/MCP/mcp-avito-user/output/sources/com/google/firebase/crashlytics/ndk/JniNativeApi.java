package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
class JniNativeApi implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f361489b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f361490c = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Context f361491a;

    static {
        boolean z12;
        try {
            System.loadLibrary("crashlytics");
            z12 = true;
        } catch (UnsatisfiedLinkError e12) {
            com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
            e12.getLocalizedMessage();
            dVar.b();
            z12 = false;
        }
        f361489b = z12;
    }

    public JniNativeApi(Context context) {
        this.f361491a = context;
    }

    @TargetApi(21)
    public static void a(ArrayList arrayList, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(arrayList, strArr);
        }
        File file = new File(applicationInfo.dataDir, AK.c.k("files/splitcompat/", Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode), "/verified-splits"));
        boolean zExists = file.exists();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        if (!zExists) {
            file.getAbsolutePath();
            dVar.a(3);
            return;
        }
        File[] fileArrListFiles = file.listFiles(f361490c);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        file.getAbsolutePath();
        dVar.a(3);
        for (File file2 : fileArrListFiles) {
            file2.getName();
            dVar.a(3);
            arrayList.add(file2.getAbsolutePath());
        }
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    public final boolean b(AssetManager assetManager, String str) throws PackageManager.NameNotFoundException {
        String str2 = Build.CPU_ABI;
        Context context = this.f361491a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 9216);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            a(arrayList, packageInfo);
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str2).getPath());
                if (str2.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str2.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str2);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            String[] strArr2 = {TextUtils.join(str4, arrayList), TextUtils.join(str4, arrayList2)};
            return f361489b && nativeInit(new String[]{strArr2[0], strArr2[1], str}, assetManager);
        } catch (PackageManager.NameNotFoundException e12) {
            com.google.firebase.crashlytics.internal.d.f361031a.b();
            throw new RuntimeException(e12);
        }
    }
}
