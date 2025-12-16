package com.avito.android.delivery_tarifikator.presentation.main_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorMainScreenInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.domain.TarifikatorMainScreenInteractorImpl$loadTarifikatorFlow$1", f = "TarifikatorMainScreenInteractor.kt", i = {0, 1}, l = {107, 108, 110, 116}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super TarifikatorMainInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135591q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135592r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f135593s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f135594t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, boolean z12, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f135593s = fVar;
        this.f135594t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        g gVar = new g(this.f135593s, this.f135594t, continuation);
        gVar.f135592r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TarifikatorMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f135591q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.C42729a0.b(r7)
            goto L8a
        L21:
            java.lang.Object r1 = r6.f135592r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L58
        L29:
            java.lang.Object r1 = r6.f135592r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L49
        L31:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f135592r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TermsLoadingStarted r1 = new com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TermsLoadingStarted
            r1.<init>()
            r6.f135592r = r7
            r6.f135591q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L48
            return r0
        L48:
            r1 = r7
        L49:
            com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f r7 = r6.f135593s
            com.avito.android.delivery_tarifikator.domain.k r7 = r7.f135580a
            r6.f135592r = r1
            r6.f135591q = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            com.avito.android.delivery_tarifikator.domain.j r7 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29814j) r7
            boolean r4 = r7 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29814j.a
            r5 = 0
            if (r4 == 0) goto L75
            com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$LoadingFailed r2 = new com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$LoadingFailed
            com.avito.android.delivery_tarifikator.domain.j$a r7 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29814j.a) r7
            java.lang.Throwable r7 = r7.f135293a
            boolean r4 = r6.f135594t
            r2.<init>(r7, r4)
            r6.f135592r = r5
            r6.f135591q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L8a
            return r0
        L75:
            com.avito.android.delivery_tarifikator.domain.j$b r3 = com.avito.android.delivery_tarifikator.domain.InterfaceC29814j.b.f135294a
            boolean r7 = kotlin.jvm.internal.L.f(r7, r3)
            if (r7 == 0) goto L8a
            com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$LoadingSuccess r7 = com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction.LoadingSuccess.f135644b
            r6.f135592r = r5
            r6.f135591q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L8a
            return r0
        L8a:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
