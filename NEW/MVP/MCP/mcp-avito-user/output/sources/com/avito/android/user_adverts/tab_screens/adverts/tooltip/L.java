package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue$queueTooltips$$inlined$flatMapLatest$1", f = "UserAdvertsTooltipsQueue.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class L extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC35694d>, UserAdvertsListState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315594q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f315595r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f315596s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f315597t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p f315598u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Continuation continuation, P p12, Y41.p pVar) {
        super(3, continuation);
        this.f315597t = p12;
        this.f315598u = pVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC35694d> interfaceC43172j, UserAdvertsListState userAdvertsListState, Continuation<? super G0> continuation) {
        L l12 = new L(continuation, this.f315597t, this.f315598u);
        l12.f315595r = interfaceC43172j;
        l12.f315596s = userAdvertsListState;
        return l12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315594q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f315595r;
            C43210w c43210w = new C43210w((UserAdvertsListState) this.f315596s);
            P p12 = this.f315597t;
            D d12 = new D(C43175k.G(new E(c43210w, p12, null)), p12);
            R0 r02 = p12.f315618c;
            InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), new C43197r1(new N(p12, null), C43175k.I(r02.b(), new M(this.f315598u, C43175k.I(r02.c(), d12)))));
            this.f315594q = 1;
            if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
