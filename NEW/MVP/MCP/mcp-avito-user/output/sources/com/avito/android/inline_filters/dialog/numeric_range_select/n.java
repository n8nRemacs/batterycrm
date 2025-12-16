package com.avito.android.inline_filters.dialog.numeric_range_select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class n extends N implements Y41.l<List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f171922l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f171923m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f171924n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter, Y41.a<G0> aVar) {
        super(1);
        this.f171922l = (N) pVar;
        this.f171923m = filter;
        this.f171924n = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        this.f171922l.invoke(this.f171923m, new InlineFilterValue.InlineFilterNumericRangeSelectValue(list2.get(0), list2.get(1)));
        ((q) this.f171924n).invoke();
        return G0.f406611a;
    }
}
