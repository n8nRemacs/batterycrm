package com.avito.android.personal_banner.feature.mvi;

import Z60.c;
import com.avito.android.personal_banner.feature.mvi.a;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BannerActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/a$b$a;", "action", "Lkotlinx/coroutines/flow/i;", "LZ60/c;", "<anonymous>", "(Lcom/avito/android/personal_banner/feature/mvi/a$b$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_banner.feature.mvi.BannerActor$processDefaultChanges$1", f = "BannerActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class h extends SuspendLambda implements Y41.p<a.b.InterfaceC6454a, Continuation<? super InterfaceC43160i<? extends Z60.c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f215658q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f215659r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<BannerState> f215660s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Y41.a<BannerState> aVar2, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f215659r = aVar;
        this.f215660s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f215659r, this.f215660s, continuation);
        hVar.f215658q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(a.b.InterfaceC6454a interfaceC6454a, Continuation<? super InterfaceC43160i<? extends Z60.c>> continuation) {
        return ((h) create(interfaceC6454a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        a.b.InterfaceC6454a interfaceC6454a = (a.b.InterfaceC6454a) this.f215658q;
        if (!(interfaceC6454a instanceof a.b.C6455b)) {
            throw new NoWhenBranchMatchedException();
        }
        BannerState bannerStateInvoke = this.f215660s.invoke();
        this.f215659r.getClass();
        ((a.b.C6455b) interfaceC6454a).getClass();
        BannerState.BannerData bannerData = bannerStateInvoke.f215641e;
        BannerState.BannerData.Content content = bannerData instanceof BannerState.BannerData.Content ? (BannerState.BannerData.Content) bannerData : null;
        return L.f(content != null ? content.f215643c : null, null) ? new C43210w(new c.a()) : new C43210w(c.e.f19924a);
    }
}
