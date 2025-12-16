package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import fJ0.InterfaceC40301a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LfJ0/a$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoadAction$1", f = "UserAdvertsListActor.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35681l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC40301a.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315443q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315444r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35670a f315445s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35681l(C35670a c35670a, Continuation<? super C35681l> continuation) {
        super(2, continuation);
        this.f315445s = c35670a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35681l c35681l = new C35681l(this.f315445s, continuation);
        c35681l.f315444r = obj;
        return c35681l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40301a.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35681l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315443q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f315444r;
            this.f315445s.getClass();
            InterfaceC40301a.b.C11139a c11139a = InterfaceC40301a.b.C11139a.f395813a;
            this.f315443q = 1;
            if (interfaceC43172j.emit(c11139a, this) == coroutine_suspended) {
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
