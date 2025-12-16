package com.avito.android.user_adverts.root_screen.adverts_host.panel_view;

import Y41.p;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: PanelView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_view.PanelView$scrollToPosition$1", f = "PanelView.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313688q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f313689r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h.g f313690s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, h.g gVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f313689r = hVar;
        this.f313690s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f313689r, this.f313690s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313688q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f313688q = 1;
            if (C43131e0.b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        h hVar = this.f313689r;
        AppBarLayout appBarLayout = hVar.f313669e;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
        hVar.f313668d.F0(this.f313690s.f313686b);
        return G0.f406611a;
    }
}
