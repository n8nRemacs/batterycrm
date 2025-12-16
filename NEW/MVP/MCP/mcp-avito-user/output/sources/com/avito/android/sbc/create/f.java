package com.avito.android.sbc.create;

import Xo0.InterfaceC17032a;
import androidx.compose.runtime.internal.P;
import ap0.C23649a;
import ap0.C23650b;
import com.avito.android.remote.model.TypedResult;
import ep0.C40143a;
import ep0.C40144b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CreateDiscountDispatchInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/f;", "Lcom/avito/android/sbc/create/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC17032a> f259183a;

    @Inject
    public f(@Y61.k h31.e<InterfaceC17032a> eVar) {
        this.f259183a = eVar;
    }

    @Override // com.avito.android.sbc.create.c
    @Y61.l
    public final Object a(long j12, @Y61.l Long l12, long j13, long j14, @Y61.k String str, long j15, @Y61.k Continuation<? super TypedResult<C23649a>> continuation) {
        return this.f259183a.get().b(new C23650b(j12, l12, j13, j14, str, j15), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.sbc.create.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r7, @Y61.k java.lang.String r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.sbc.create.e
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.sbc.create.e r0 = (com.avito.android.sbc.create.e) r0
            int r1 = r0.f259182s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259182s = r1
            goto L18
        L13:
            com.avito.android.sbc.create.e r0 = new com.avito.android.sbc.create.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f259180q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f259182s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r9)
            goto L4f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r9)
            java.lang.Long r7 = kotlin.text.C43066x.z0(r7)
            if (r7 == 0) goto L54
            long r4 = r7.longValue()
            h31.e<Xo0.a> r7 = r6.f259183a
            java.lang.Object r7 = r7.get()
            Xo0.a r7 = (Xo0.InterfaceC17032a) r7
            r0.f259182s = r3
            java.lang.Object r9 = r7.f(r8, r4, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            if (r9 == 0) goto L54
            return r9
        L54:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid itemId value"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.f.b(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.sbc.create.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r7, @Y61.l java.lang.String r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.sbc.create.d
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.sbc.create.d r0 = (com.avito.android.sbc.create.d) r0
            int r1 = r0.f259179s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259179s = r1
            goto L18
        L13:
            com.avito.android.sbc.create.d r0 = new com.avito.android.sbc.create.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f259177q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f259179s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r9)
            goto L4f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r9)
            java.lang.Long r7 = kotlin.text.C43066x.z0(r7)
            if (r7 == 0) goto L54
            long r4 = r7.longValue()
            h31.e<Xo0.a> r7 = r6.f259183a
            java.lang.Object r7 = r7.get()
            Xo0.a r7 = (Xo0.InterfaceC17032a) r7
            r0.f259179s = r3
            java.lang.Object r9 = r7.d(r8, r4, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            if (r9 == 0) goto L54
            return r9
        L54:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid itemId value"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.f.c(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.sbc.create.c
    @Y61.l
    public final Object d(long j12, @Y61.l Long l12, @Y61.l Long l13, long j13, @Y61.k Continuation<? super TypedResult<C40143a>> continuation) {
        return this.f259183a.get().g(new C40144b(l13, j13, new ep0.c(l12, j12)), continuation);
    }

    @Override // com.avito.android.sbc.create.c
    @Y61.l
    public final Object e(long j12, long j13, @Y61.k String str, @Y61.l Long l12, @Y61.l Long l13, @Y61.k ContinuationImpl continuationImpl) {
        return this.f259183a.get().e(l12, j12, l13, str, j13, Boxing.boxBoolean(false), continuationImpl);
    }
}
