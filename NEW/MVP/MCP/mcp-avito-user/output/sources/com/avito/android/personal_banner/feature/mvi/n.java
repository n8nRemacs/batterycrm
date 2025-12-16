package com.avito.android.personal_banner.feature.mvi;

import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BannerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LY60/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_banner.feature.mvi.BannerActor$requestBanner$1", f = "BannerActor.kt", i = {}, l = {130, 130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Y60.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f215686q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f215687r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f215688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BannerContext.Info f215689t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BannerState f215690u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, BannerContext.Info info, BannerState bannerState, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f215688s = aVar;
        this.f215689t = info;
        this.f215690u = bannerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f215688s, this.f215689t, this.f215690u, continuation);
        nVar.f215687r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Y60.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f215686q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f215687r;
            String str = this.f215690u.f215638b;
            this.f215687r = interfaceC43172j;
            this.f215686q = 1;
            a aVar = this.f215688s;
            aVar.getClass();
            BannerContext.Info info = this.f215689t;
            obj = aVar.f215610b.a(new Y60.a(info.f215594b, str, info.f215595c), this);
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
            interfaceC43172j = (InterfaceC43172j) this.f215687r;
            C42729a0.b(obj);
        }
        this.f215687r = null;
        this.f215686q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
