package com.google.mlkit.common.internal.model;

import android.util.Log;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.internal.mlkit_common.zznf;
import com.google.android.gms.internal.mlkit_common.zznl;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.internal.mlkit_common.zzsv;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements InterfaceC37027j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.mlkit.common.sdkinternal.model.f f362297a;

    @Override // com.google.android.gms.tasks.InterfaceC37027j
    public final Task a(Object obj) {
        String str;
        String strB;
        com.google.mlkit.common.sdkinternal.model.f fVar = this.f362297a;
        fVar.getClass();
        fVar.f362359g.zzf(zzsv.zzg(), fVar.f362357e, zznf.NO_ERROR, false, ModelType.f362325b, zznl.EXPLICITLY_REQUESTED);
        try {
            fVar.d();
            e = null;
        } catch (MlKitException e12) {
            e = e12;
        }
        try {
            Integer numB = fVar.b();
            Long lA2 = fVar.a();
            String strA = fVar.f362357e.a();
            ModelType modelType = ModelType.f362325b;
            ModelType modelType2 = fVar.f362358f;
            com.google.mlkit.common.sdkinternal.model.d dVar = fVar.f362361i;
            boolean zExists = false;
            if (modelType2 == modelType) {
                dVar.getClass();
            } else {
                File fileE = dVar.e(strA, modelType2, false);
                int iB2 = com.google.mlkit.common.sdkinternal.model.d.b(fileE);
                if (iB2 == -1) {
                    str = null;
                } else {
                    str = fileE.getAbsolutePath() + "/" + iB2;
                }
                if (str != null) {
                    File file = new File(str);
                    if (file.exists()) {
                        File file2 = new File(file, "model.tflite");
                        String strConcat = "Model file path: ".concat(String.valueOf(file2.getAbsolutePath()));
                        C36713l c36713l = com.google.mlkit.common.sdkinternal.model.d.f362346b;
                        if (Log.isLoggable(c36713l.f349447a, 4)) {
                            c36713l.d(strConcat);
                        }
                        zExists = file2.exists();
                    }
                }
            }
            if (!zExists && (numB == null || numB.intValue() != 8)) {
                if (numB != null && numB.intValue() == 16) {
                    MlKitException mlKitExceptionG = fVar.g(lA2);
                    fVar.c();
                    return C37030m.e(mlKitExceptionG);
                }
                if (numB != null && ((numB.intValue() == 4 || numB.intValue() == 2 || numB.intValue() == 1) && lA2 != null)) {
                    synchronized (fVar) {
                        strB = fVar.f362360h.b(fVar.f362357e);
                    }
                    if (strB != null) {
                        zzss zzssVar = fVar.f362359g;
                        zzsj zzsjVarZzg = zzsv.zzg();
                        NZ0.d dVar2 = fVar.f362357e;
                        zzssVar.zzf(zzsjVarZzg, dVar2, zznf.NO_ERROR, false, dVar2.f11600b, zznl.DOWNLOADING);
                        return fVar.e(lA2.longValue());
                    }
                }
                return C37030m.e(new MlKitException(13, "Failed to schedule the download task", e));
            }
            return C37030m.f(null);
        } catch (MlKitException e13) {
            return C37030m.e(new MlKitException(13, "Failed to ensure the model is downloaded.", e13));
        }
    }
}
