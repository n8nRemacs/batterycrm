package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LXI0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processAdvertSelected$1", f = "UserAdvertsListActor.kt", i = {}, l = {141, 140}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35675f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super XI0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315418q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35670a f315420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItemDomain f315421t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35675f(C35670a c35670a, UserAdvertItemDomain userAdvertItemDomain, Continuation<? super C35675f> continuation) {
        super(2, continuation);
        this.f315420s = c35670a;
        this.f315421t = userAdvertItemDomain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35675f c35675f = new C35675f(this.f315420s, this.f315421t, continuation);
        c35675f.f315419r = obj;
        return c35675f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super XI0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35675f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315418q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f315419r;
            com.avito.android.user_adverts.tab_actions.host.domain.f fVar = this.f315420s.f315273b;
            XI0.a aVar = new XI0.a(this.f315421t.f315031b);
            this.f315419r = interfaceC43172j;
            this.f315418q = 1;
            obj = fVar.a(aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f315419r;
            C42729a0.b(obj);
        }
        this.f315419r = null;
        this.f315418q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
