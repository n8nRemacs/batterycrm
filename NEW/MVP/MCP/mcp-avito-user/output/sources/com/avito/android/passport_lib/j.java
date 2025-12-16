package com.avito.android.passport_lib;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PassportProfilesUpdateRepository.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport_lib/j;", "Lcom/avito/android/passport_lib/h;", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f213924a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f213925b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public j(@Y61.k n nVar) {
        this.f213924a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.passport_lib.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.passport_lib.i
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.passport_lib.i r0 = (com.avito.android.passport_lib.i) r0
            int r1 = r0.f213923t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213923t = r1
            goto L18
        L13:
            com.avito.android.passport_lib.i r0 = new com.avito.android.passport_lib.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f213921r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f213923t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.passport_lib.j r0 = r0.f213920q
            kotlin.C42729a0.b(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            com.avito.android.passport_lib.n r5 = r4.f213924a
            com.avito.android.passport_lib.o r5 = r5.a()
            kotlinx.coroutines.flow.t0 r5 = kotlinx.coroutines.flow.C43175k.V(r5, r3)
            r0.f213920q = r4
            r0.f213923t = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.C43175k.X(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            com.jakewharton.rxrelay3.c<kotlin.G0> r5 = r0.f213925b
            kotlin.G0 r0 = kotlin.G0.f406611a
            r5.accept(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport_lib.j.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.passport_lib.h
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF213925b() {
        return this.f213925b;
    }
}
