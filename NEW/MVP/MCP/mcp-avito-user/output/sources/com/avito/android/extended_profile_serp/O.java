package com.avito.android.extended_profile_serp;

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

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoaded", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpView$initInlineFilters$6", f = "ExtendedProfileSerpView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class O extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152565q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f152566r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(F f12, Continuation<? super O> continuation) {
        super(2, continuation);
        this.f152566r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        O o12 = new O(this.f152566r, continuation);
        o12.f152565q = obj;
        return o12;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        return ((O) create(bool, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Result result;
        Header header;
        Integer selectedFiltersCount;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        boolean zBooleanValue = ((Boolean) this.f152565q).booleanValue();
        F f12 = this.f152566r;
        if (zBooleanValue) {
            f12.f152534k.s1();
            InlineFilters f172427u = f12.f152534k.getF172427u();
            int iIntValue = (f172427u == null || (result = f172427u.getResult()) == null || (header = result.getHeader()) == null || (selectedFiltersCount = header.getSelectedFiltersCount()) == null) ? 0 : selectedFiltersCount.intValue();
            View view = f12.f152547x.f153392j;
            if (view != null) {
                D6.G(view, iIntValue > 0);
            }
            f12.f152520E = true;
            D6.H(f12.f152543t.f283473b);
            F.a(f12, f12.f152519D);
        } else {
            f12.f152520E = false;
            D6.w(f12.f152543t.f283473b);
            f12.c(f12.f152518C);
            f12.e(0);
        }
        return G0.f406611a;
    }
}
