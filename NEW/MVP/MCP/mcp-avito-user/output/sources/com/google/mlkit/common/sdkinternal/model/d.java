package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.C36713l;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.common.sdkinternal.ModelType;
import j.N;
import j.k0;
import j.l0;
import java.io.File;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final C36713l f362346b = new C36713l("ModelFileHelper", "");

    /* renamed from: c, reason: collision with root package name */
    @N
    @k0
    public static final String f362347c = "com.google.mlkit.translate.models";

    /* renamed from: d, reason: collision with root package name */
    @N
    @k0
    public static final String f362348d = "com.google.mlkit.custom.models";

    /* renamed from: e, reason: collision with root package name */
    @k0
    public static final String f362349e = "com.google.mlkit.base.models";

    /* renamed from: a, reason: collision with root package name */
    public final C37642k f362350a;

    public d(@N C37642k c37642k) {
        this.f362350a = c37642k;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    @RX0.a
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@j.P java.io.File r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7.isDirectory()
            r2 = 1
            if (r1 == 0) goto L29
            java.io.File[] r1 = r7.listFiles()
            com.google.android.gms.common.internal.C36729v.j(r1)
            int r3 = r1.length
            r4 = r0
            r5 = r2
        L15:
            if (r4 >= r3) goto L27
            r6 = r1[r4]
            if (r5 == 0) goto L23
            boolean r5 = a(r6)
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r0
        L24:
            int r4 = r4 + 1
            goto L15
        L27:
            if (r5 == 0) goto L30
        L29:
            boolean r7 = r7.delete()
            if (r7 == 0) goto L30
            return r2
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.d.a(java.io.File):boolean");
    }

    @RX0.a
    @l0
    public static int b(@N File file) {
        File[] fileArrListFiles = file.listFiles();
        int iMax = -1;
        if (fileArrListFiles != null && (fileArrListFiles.length) != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    iMax = Math.max(iMax, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    f362346b.a("Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return iMax;
    }

    @N
    @RX0.a
    @l0
    public final File c(@N String str, @N ModelType modelType, boolean z12) {
        String str2;
        int iOrdinal = modelType.ordinal();
        if (iOrdinal == 1) {
            str2 = f362349e;
        } else if (iOrdinal == 2) {
            str2 = f362347c;
        } else {
            if (iOrdinal != 4) {
                throw new IllegalArgumentException(AK.c.k("Unknown model type ", modelType.name(), ". Cannot find a dir to store the downloaded model."));
            }
            str2 = f362348d;
        }
        File file = new File(this.f362350a.b().getNoBackupFilesDir(), str2);
        if (z12) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    @N
    @RX0.a
    @l0
    public final File d(@N String str, @N String str2) throws MlKitException {
        File fileE = e(str, ModelType.f362327d, true);
        if (fileE.exists() && fileE.isFile() && !fileE.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(fileE.getAbsolutePath())), 13);
        }
        if (!fileE.exists()) {
            f362346b.a("Temp labels folder does not exist, creating one: ".concat(String.valueOf(fileE.getAbsolutePath())));
            if (!fileE.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(fileE, str2);
    }

    @l0
    public final File e(@N String str, @N ModelType modelType, boolean z12) throws MlKitException {
        File fileC = c(str, modelType, z12);
        if (!fileC.exists()) {
            f362346b.a("model folder does not exist, creating one: ".concat(String.valueOf(fileC.getAbsolutePath())));
            if (!fileC.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(fileC)), 13);
            }
        } else if (!fileC.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(fileC)), 6);
        }
        return fileC;
    }
}
