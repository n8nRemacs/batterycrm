package com.avito.android.user_adverts.root_screen.adverts_host.service_freemium;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ServiceFreemiumViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.ServiceFreemiumViewModelImpl$show$1", f = "ServiceFreemiumViewModel.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313831q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f313832r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f313832r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f313832r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f313831q
            r2 = 1
            com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.d r3 = r4.f313832r
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.C42729a0.b(r5)
            goto L2f
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            kotlin.C42729a0.b(r5)
            com.avito.android.account.E r5 = r3.f313833E
            boolean r5 = r5.b()
            if (r5 == 0) goto L32
            r4.f313831q = r2
            com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b r5 = r3.f313834J
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.a r5 = (com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.a) r5
            goto L33
        L32:
            r5 = 0
        L33:
            if (r5 == 0) goto L4c
            kotlinx.coroutines.flow.Z1<RI0.b> r0 = r3.f313837M
        L37:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            RI0.b r2 = (RI0.b) r2
            RI0.b$b r2 = new RI0.b$b
            com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a r3 = r5.f313839a
            r2.<init>(r3)
            boolean r1 = r0.N3(r1, r2)
            if (r1 == 0) goto L37
            goto L5d
        L4c:
            kotlinx.coroutines.flow.Z1<RI0.b> r5 = r3.f313837M
        L4e:
            java.lang.Object r0 = r5.getValue()
            r1 = r0
            RI0.b r1 = (RI0.b) r1
            RI0.b$a r1 = RI0.b.a.f14303a
            boolean r0 = r5.N3(r0, r1)
            if (r0 == 0) goto L4e
        L5d:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
