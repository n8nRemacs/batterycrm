package com.google.mlkit.common.internal.model;

import androidx.camera.core.Q;
import com.google.android.gms.common.internal.C36713l;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.common.sdkinternal.ModelType;
import j.N;
import j.P;
import java.io.File;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class d implements com.google.mlkit.common.sdkinternal.model.h {

    /* renamed from: c, reason: collision with root package name */
    public static final C36713l f362290c = new C36713l("CustomModelFileMover", "");

    /* renamed from: a, reason: collision with root package name */
    public final String f362291a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.mlkit.common.sdkinternal.model.d f362292b;

    public d(@N C37642k c37642k, @N String str) {
        this.f362291a = str;
        this.f362292b = new com.google.mlkit.common.sdkinternal.model.d(c37642k);
    }

    public static boolean b(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        boolean zRenameTo = file.renameTo(file2);
        C36713l c36713l = f362290c;
        if (zRenameTo) {
            c36713l.a(Q.a("Moved file from ", absolutePath, " to ", absolutePath2, " successfully"));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        c36713l.a(Q.a("Move file to ", absolutePath2, " failed, remove the temp file ", absolutePath, "."));
        if (!file.delete()) {
            c36713l.a("Failed to delete the temp file: ".concat(String.valueOf(absolutePath)));
        }
        return false;
    }

    @P
    public final File a(File file) throws MlKitException {
        File file2;
        ModelType modelType = ModelType.f362327d;
        com.google.mlkit.common.sdkinternal.model.d dVar = this.f362292b;
        String str = this.f362291a;
        File fileE = dVar.e(str, modelType, false);
        File file3 = new File(new File(fileE, String.valueOf(com.google.mlkit.common.sdkinternal.model.d.b(fileE) + 1)), "model.tflite");
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        File file4 = null;
        if (!b(file, file3)) {
            return null;
        }
        File fileD = dVar.d(str, "labels.txt");
        if (fileD.exists()) {
            file2 = new File(parentFile, "labels.txt");
            if (!b(fileD, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File fileD2 = dVar.d(str, "manifest.json");
        if (fileD2.exists()) {
            File file5 = new File(parentFile, "manifest.json");
            if (!b(fileD2, file5)) {
                return null;
            }
            file4 = file5;
        }
        return (file2 == null && file4 == null) ? file3 : parentFile;
    }
}
