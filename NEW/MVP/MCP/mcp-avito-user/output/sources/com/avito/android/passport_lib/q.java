package com.avito.android.passport_lib;

import com.avito.android.account.G;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.y;

/* compiled from: PassportStateRepository.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport_lib/q;", "Lcom/avito/android/passport_lib/n;", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<I50.a> f213942a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f213943b;

    @Inject
    public q(@Y61.k h31.e<I50.a> eVar, @Y61.k G g12) {
        this.f213942a = eVar;
        this.f213943b = g12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.passport_lib.q r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.avito.android.passport_lib.p
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.passport_lib.p r0 = (com.avito.android.passport_lib.p) r0
            int r1 = r0.f213941s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f213941s = r1
            goto L1b
        L16:
            com.avito.android.passport_lib.p r0 = new com.avito.android.passport_lib.p
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f213939q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f213941s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Exception -> L6c
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            h31.e<I50.a> r5 = r5.f213942a     // Catch: java.lang.Exception -> L6c
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Exception -> L6c
            I50.a r5 = (I50.a) r5     // Catch: java.lang.Exception -> L6c
            r0.f213941s = r3     // Catch: java.lang.Exception -> L6c
            java.lang.Object r6 = r5.h(r0)     // Catch: java.lang.Exception -> L6c
            if (r6 != r1) goto L49
            goto L72
        L49:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6     // Catch: java.lang.Exception -> L6c
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success     // Catch: java.lang.Exception -> L6c
            if (r5 == 0) goto L65
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6     // Catch: java.lang.Exception -> L6c
            java.lang.Object r5 = r6.getResult()     // Catch: java.lang.Exception -> L6c
            K50.h r5 = (K50.h) r5     // Catch: java.lang.Exception -> L6c
            com.avito.android.passport_lib.m r6 = new com.avito.android.passport_lib.m     // Catch: java.lang.Exception -> L6c
            boolean r0 = r5.getEnabled()     // Catch: java.lang.Exception -> L6c
            boolean r5 = r5.getIsMultiPassport()     // Catch: java.lang.Exception -> L6c
            r6.<init>(r0, r5)     // Catch: java.lang.Exception -> L6c
            goto L6a
        L65:
            com.avito.android.passport_lib.m r6 = new com.avito.android.passport_lib.m     // Catch: java.lang.Exception -> L6c
            r6.<init>(r4, r4)     // Catch: java.lang.Exception -> L6c
        L6a:
            r1 = r6
            goto L72
        L6c:
            com.avito.android.passport_lib.m r5 = new com.avito.android.passport_lib.m
            r5.<init>(r4, r4)
            r1 = r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport_lib.q.b(com.avito.android.passport_lib.q, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.passport_lib.n
    @Y61.k
    public final o a() {
        return new o(y.a(this.f213943b.g()), this);
    }
}
