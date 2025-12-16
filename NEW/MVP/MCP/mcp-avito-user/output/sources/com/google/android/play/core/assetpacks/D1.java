package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class D1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f358105a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static ArrayList a(File file, File file2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.C1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return D1.f358105a.matcher(str).matches();
            }
        });
        if (fileArrListFiles != null) {
            File[] fileArr2 = new File[fileArrListFiles.length];
            int i12 = 0;
            while (true) {
                int length = fileArrListFiles.length;
                if (i12 >= length) {
                    fileArr = fileArr2;
                    break;
                }
                File file3 = fileArrListFiles[i12];
                int i13 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i13 > length || fileArr2[i13] != null) {
                    break;
                }
                fileArr2[i13] = file3;
                i12++;
            }
            throw new C37184v0("Metadata folder ordering corrupt.");
        }
        fileArr = new File[0];
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    String str = new C37123g0(fileInputStream).a().f358283a;
                    if (str == null) {
                        throw new C37184v0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, str);
                    if (!file5.exists()) {
                        throw new C37184v0("Missing asset file " + file5.getCanonicalPath() + " during slice reconstruction.");
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
