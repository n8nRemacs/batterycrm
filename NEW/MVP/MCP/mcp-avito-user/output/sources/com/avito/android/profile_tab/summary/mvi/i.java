package com.avito.android.profile_tab.summary.mvi;

import Dc0.e;
import Y41.q;
import com.avito.android.profile_tab.summary.e;
import com.avito.android.profile_tab.summary.mvi.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_tab.summary.mvi.ProfileSummaryActor$processPrivateStateChanges$$inlined$flatMapLatest$1", f = "ProfileSummaryActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class i extends SuspendLambda implements q<InterfaceC43172j<? super Dc0.e>, a.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230915q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f230916r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f230917s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a f230918t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f230919u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Continuation continuation, Y41.a aVar, a aVar2) {
        super(3, continuation);
        this.f230918t = aVar;
        this.f230919u = aVar2;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Dc0.e> interfaceC43172j, a.b bVar, Continuation<? super G0> continuation) {
        i iVar = new i(continuation, this.f230918t, this.f230919u);
        iVar.f230916r = interfaceC43172j;
        iVar.f230917s = bVar;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i c43210w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230915q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f230916r;
            a.b bVar = (a.b) this.f230917s;
            this.f230918t.invoke();
            a aVar = this.f230919u;
            aVar.getClass();
            com.avito.android.profile_tab.summary.e eVar = bVar.f230887a;
            if (eVar instanceof e.a) {
                c43210w = C43175k.I(aVar.f230879a.a(), new C43137a0(new d(2, null), new b(C43175k.G(new c(aVar, null)))));
            } else {
                if (!(eVar instanceof e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(e.c.f3274a);
            }
            this.f230915q = 1;
            if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
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
