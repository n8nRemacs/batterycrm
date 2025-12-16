package com.avito.android.personal_banner.feature.mvi;

import Z60.c;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_banner.feature.mvi.BannerActor$processLoadingChanges$$inlined$flatMapLatest$1", f = "BannerActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Z60.c>, a.b.c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f215675q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f215676r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f215677s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f215678t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f215679u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a.C6453a f215680v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Continuation continuation, a aVar, Y41.a aVar2, a.C6453a c6453a) {
        super(3, continuation);
        this.f215678t = aVar;
        this.f215679u = aVar2;
        this.f215680v = c6453a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Z60.c> interfaceC43172j, a.b.c cVar, Continuation<? super G0> continuation) {
        l lVar = new l(continuation, this.f215678t, this.f215679u, this.f215680v);
        lVar.f215676r = interfaceC43172j;
        lVar.f215677s = cVar;
        return lVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i c43210w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f215675q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f215676r;
            if (!(((a.b.c) this.f215677s) instanceof a.b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            BannerState bannerState = (BannerState) this.f215679u.invoke();
            BannerContext bannerContext = (BannerContext) this.f215680v.f215612b.f92114c.getValue();
            a aVar = this.f215678t;
            aVar.getClass();
            if (bannerContext instanceof BannerContext.Info) {
                c43210w = C43175k.I(aVar.f215609a.a(), new C43137a0(new o(2, null), new m(C43175k.G(new n(aVar, (BannerContext.Info) bannerContext, bannerState, null)))));
            } else {
                if (!(bannerContext instanceof BannerContext.None)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(c.e.f19924a);
            }
            this.f215675q = 1;
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
