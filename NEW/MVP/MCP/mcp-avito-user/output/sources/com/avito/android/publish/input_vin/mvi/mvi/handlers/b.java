package com.avito.android.publish.input_vin.mvi.mvi.handlers;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.validation.l1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ne0.C44387d;
import ne0.InterfaceC44385b;

/* compiled from: PublishButtonClickHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lne0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.mvi.handlers.PublishButtonClickHandler$handleUnavailableState$1", f = "PublishButtonClickHandler.kt", i = {0}, l = {64, 65, 72, 74}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC44385b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236686q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f236687r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l1.b.C9896b f236688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C44387d f236689t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f236690u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l1.b.C9896b c9896b, C44387d c44387d, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f236688s = c9896b;
        this.f236689t = c44387d;
        this.f236690u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f236688s, this.f236689t, this.f236690u, continuation);
        bVar.f236687r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC44385b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f236686q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.avito.android.publish.input_vin.mvi.mvi.handlers.a r6 = r10.f236690u
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            kotlin.C42729a0.b(r11)
            goto Lad
        L24:
            java.lang.Object r1 = r10.f236687r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L60
        L2c:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f236687r
            r1 = r11
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.validation.l1$b$b r11 = r10.f236688s
            boolean r7 = r11.f319396b
            java.util.ArrayList r8 = r11.f319397c
            ne0.d r9 = r10.f236689t
            if (r7 == 0) goto L75
            int r7 = r9.f415264c
            if (r7 != 0) goto L75
            com.avito.android.publish.analytics.v r11 = r6.f236677f
            com.avito.android.publish.C0 r2 = r6.f236672a
            com.avito.android.publish.PublishState r3 = r2.f231861Y
            com.avito.android.remote.model.Navigation r3 = r3.getNavigation()
            java.lang.String r2 = r2.ne()
            r11.F0(r8, r3, r2)
            ne0.b$i r11 = ne0.InterfaceC44385b.i.f415240a
            r10.f236687r = r1
            r10.f236686q = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L60
            return r0
        L60:
            ne0.b$f r11 = new ne0.b$f
            me0.a r2 = r6.f236678g
            java.lang.String r2 = r2.f414654b
            r11.<init>(r2)
            r2 = 0
            r10.f236687r = r2
            r10.f236686q = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lad
            return r0
        L75:
            boolean r11 = r11.f319395a
            if (r11 == 0) goto L9c
            com.avito.android.publish.analytics.v r11 = r6.f236677f
            com.avito.android.publish.C0 r2 = r6.f236672a
            com.avito.android.publish.PublishState r4 = r2.f231861Y
            com.avito.android.remote.model.Navigation r4 = r4.getNavigation()
            java.lang.String r2 = r2.ne()
            r11.F0(r8, r4, r2)
            ne0.b$f r11 = new ne0.b$f
            me0.a r2 = r6.f236678g
            java.lang.String r2 = r2.f414653a
            r11.<init>(r2)
            r10.f236686q = r3
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lad
            return r0
        L9c:
            com.avito.android.publish.input_vin.mvi.z r11 = r6.f236679h
            java.lang.String r3 = r9.f415262a
            kotlinx.coroutines.flow.i r11 = r11.a(r3)
            r10.f236686q = r2
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.input_vin.mvi.mvi.handlers.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
