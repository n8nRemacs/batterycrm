package com.avito.android.extended_profile_selection_create.select;

import android.view.View;
import com.avito.android.remote.model.search.Header;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSelectionCreateView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoaded", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateView$initInlineFilters$6", f = "ExtendedProfileSelectionCreateView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class x extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152430q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f152431r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(H h12, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f152431r = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        x xVar = new x(this.f152431r, continuation);
        xVar.f152430q = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        return ((x) create(bool, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Result result;
        Header header;
        Integer selectedFiltersCount;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        boolean zBooleanValue = ((Boolean) this.f152430q).booleanValue();
        H h12 = this.f152431r;
        if (zBooleanValue) {
            h12.f152010h.s1();
            InlineFilters inlineFiltersU1 = h12.f152010h.getF172427u();
            int iIntValue = (inlineFiltersU1 == null || (result = inlineFiltersU1.getResult()) == null || (header = result.getHeader()) == null || (selectedFiltersCount = header.getSelectedFiltersCount()) == null) ? 0 : selectedFiltersCount.intValue();
            View view = h12.f152019q.f153392j;
            if (view != null) {
                D6.G(view, iIntValue > 0);
            }
            D6.H(h12.f152015m.f283473b);
            H.a(h12, h12.f151999C);
        } else {
            D6.w(h12.f152015m.f283473b);
            h12.b(h12.f151998B);
            h12.c(0);
        }
        return G0.f406611a;
    }
}
