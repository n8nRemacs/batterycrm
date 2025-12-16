package com.avito.android.autoteka.data.choosingProduct;

import Cj0.g;
import Y61.k;
import Y61.l;
import com.avito.android.autoteka.data.i;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaChoosingPurchaseInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/choosingProduct/c;", "Lcom/avito/android/autoteka/data/choosingProduct/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f96107a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public TypedResult<g> f96108b;

    @Inject
    public c(@k i iVar) {
        this.f96107a = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, com.avito.android.remote.model.TypedResult<Cj0.g>] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, com.avito.android.remote.model.TypedResult, com.avito.android.remote.model.TypedResult<Cj0.g>] */
    @Override // com.avito.android.autoteka.data.choosingProduct.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.lang.String r9, boolean r10, @Y61.k java.lang.String r11, @Y61.l java.lang.Long r12, boolean r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.avito.android.autoteka.data.choosingProduct.b
            if (r0 == 0) goto L14
            r0 = r14
            com.avito.android.autoteka.data.choosingProduct.b r0 = (com.avito.android.autoteka.data.choosingProduct.b) r0
            int r1 = r0.f96106u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f96106u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.autoteka.data.choosingProduct.b r0 = new com.avito.android.autoteka.data.choosingProduct.b
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f96104s
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f96106u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            com.avito.android.autoteka.data.choosingProduct.c r9 = r6.f96102q
            kotlin.C42729a0.b(r14)
            goto L9d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.jvm.internal.l0$h r9 = r6.f96103r
            com.avito.android.autoteka.data.choosingProduct.c r10 = r6.f96102q
            kotlin.C42729a0.b(r14)
            goto L79
        L41:
            kotlin.C42729a0.b(r14)
            com.avito.android.remote.model.TypedResult<Cj0.g> r14 = r8.f96108b
            r1 = 0
            java.lang.String r4 = "1"
            com.avito.android.autoteka.data.i r5 = r8.f96107a
            if (r14 == 0) goto L83
            kotlin.jvm.internal.l0$h r7 = new kotlin.jvm.internal.l0$h
            r7.<init>()
            r7.f406842b = r14
            if (r10 != 0) goto L5c
            com.avito.android.remote.model.TypedResult<Cj0.g> r10 = r8.f96108b
            boolean r10 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto L80
        L5c:
            r6.f96102q = r8
            r6.f96103r = r7
            r6.f96106u = r3
            r5.getClass()
            if (r13 == 0) goto L69
            r10 = r4
            goto L6a
        L69:
            r10 = r1
        L6a:
            yj0.a r1 = r5.f96124b
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r10
            java.lang.Object r14 = r1.c(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L77
            return r0
        L77:
            r10 = r8
            r9 = r7
        L79:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            r10.f96108b = r14
            r9.f406842b = r14
            r7 = r9
        L80:
            T r9 = r7.f406842b
            return r9
        L83:
            r6.f96102q = r8
            r6.f96106u = r2
            r5.getClass()
            if (r13 == 0) goto L8e
            r10 = r4
            goto L8f
        L8e:
            r10 = r1
        L8f:
            yj0.a r1 = r5.f96124b
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r10
            java.lang.Object r14 = r1.c(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L9c
            return r0
        L9c:
            r9 = r8
        L9d:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            r9.f96108b = r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.choosingProduct.c.a(java.lang.String, boolean, java.lang.String, java.lang.Long, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
