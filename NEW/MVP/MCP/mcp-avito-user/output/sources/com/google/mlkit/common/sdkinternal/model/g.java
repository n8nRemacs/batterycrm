package com.google.mlkit.common.sdkinternal.model;

import android.annotation.SuppressLint;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.internal.mlkit_common.zznf;
import com.google.android.gms.internal.mlkit_common.zznl;
import com.google.android.gms.internal.mlkit_common.zzsv;
import com.google.android.gms.internal.mlkit_common.zztd;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.common.sdkinternal.ModelType;
import j.N;
import j.P;
import j.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    public static final C36713l f362364e = new C36713l("RemoteModelFileManager", "");

    /* renamed from: a, reason: collision with root package name */
    public final String f362365a;

    /* renamed from: b, reason: collision with root package name */
    public final ModelType f362366b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.mlkit.common.internal.model.d f362367c;

    /* renamed from: d, reason: collision with root package name */
    public final d f362368d;

    @SuppressLint({"FirebaseLambdaLast"})
    public g(@N C37642k c37642k, @N NZ0.d dVar, @N d dVar2, @N com.google.mlkit.common.internal.model.d dVar3) {
        String strA;
        ModelType modelType = dVar.f11600b;
        this.f362366b = modelType;
        if (modelType == ModelType.f362326c) {
            strA = dVar.f11599a;
            if (strA == null) {
                strA = (String) NZ0.d.f11598c.get(null);
            }
        } else {
            strA = dVar.a();
        }
        this.f362365a = strA;
        com.google.firebase.components.b<?> bVar = com.google.mlkit.common.sdkinternal.p.f362380b;
        this.f362368d = dVar2;
        this.f362367c = dVar3;
    }

    @RX0.a
    @P
    @l0
    public final synchronized File a(@N ParcelFileDescriptor parcelFileDescriptor, @N String str, @N NZ0.d dVar) {
        File file;
        MlKitException mlKitException;
        file = new File(this.f362368d.e(this.f362365a, this.f362366b, true), "to_be_validated_model.tmp");
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i12 = autoCloseInputStream.read(bArr);
                        if (i12 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i12);
                    }
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    autoCloseInputStream.close();
                    boolean zA2 = com.google.mlkit.common.internal.model.c.a(file, str);
                    if (!zA2) {
                        if (zA2) {
                            mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                        } else {
                            f362364e.a("Hash does not match with expected: ".concat(str));
                            zztd.zzb("common").zzf(zzsv.zzg(), dVar, zznf.MODEL_HASH_MISMATCH, true, this.f362366b, zznl.SUCCEEDED);
                            mlKitException = new MlKitException("Hash does not match with expected", 102);
                        }
                        if (file.delete()) {
                            throw mlKitException;
                        }
                        f362364e.a("Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                        throw mlKitException;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    autoCloseInputStream.close();
                } catch (Throwable th5) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                    } catch (Exception unused2) {
                    }
                }
                throw th4;
            }
        } catch (IOException e12) {
            f362364e.b("Failed to copy downloaded model file to private folder: ".concat(e12.toString()));
            return null;
        }
        return this.f362367c.a(file);
    }
}
