package com.avito.android.extended_profile_selection_create.select;

import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSelectionCreateView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateView$initInlineFilters$1", f = "ExtendedProfileSelectionCreateView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class s extends SuspendLambda implements Y41.p<InlineFiltersGeo, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152413q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f152414r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(H h12, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f152414r = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f152414r, continuation);
        sVar.f152413q = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InlineFiltersGeo inlineFiltersGeo, Continuation<? super G0> continuation) {
        return ((s) create(inlineFiltersGeo, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = ((InlineFiltersGeo) this.f152413q).f283362a;
        H h12 = this.f152414r;
        h12.f152010h.o1(null, ((ExtendedProfileSelectionCreateState) ((ExtendedProfileSelectionCreateFragment.e) h12.f152007e).invoke()).f152343d, str, null);
        return G0.f406611a;
    }
}
