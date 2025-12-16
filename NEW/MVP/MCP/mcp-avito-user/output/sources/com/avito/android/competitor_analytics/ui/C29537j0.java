package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.competitor_analytics.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CompetitorAnalyticsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.competitor_analytics.ui.CompetitorAnalyticsScreenKt$CompetitorAnalyticsScreen$4$2$1", f = "CompetitorAnalyticsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.competitor_analytics.ui.j0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29537j0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f124801q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29537j0(InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f124801q = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29537j0(this.f124801q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C29537j0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((Y41.l) this.f124801q.getF42167b()).invoke(a.h.f124463a);
        return kotlin.G0.f406611a;
    }
}
