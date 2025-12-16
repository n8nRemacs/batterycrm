package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f362293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NZ0.a f362294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f362295d;

    public /* synthetic */ e(j jVar, NZ0.a aVar, C37028k c37028k) {
        this.f362293b = jVar;
        this.f362294c = aVar;
        this.f362295d = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f362293b;
        NZ0.a aVar = this.f362294c;
        C37028k c37028k = this.f362295d;
        jVar.getClass();
        try {
            com.google.mlkit.common.sdkinternal.model.d dVar = new com.google.mlkit.common.sdkinternal.model.d(jVar.f362301a);
            ModelType modelType = ModelType.f362327d;
            String str = aVar.f11599a;
            C36729v.j(str);
            synchronized (dVar) {
                com.google.mlkit.common.sdkinternal.model.d.a(dVar.c(str, modelType, false));
                com.google.mlkit.common.sdkinternal.model.d.a(dVar.c(str, modelType, true));
            }
            c37028k.b(null);
        } catch (RuntimeException e12) {
            c37028k.a(new MlKitException(13, "Internal error has occurred when executing ML Kit tasks", e12));
        }
    }
}
