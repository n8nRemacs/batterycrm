package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedTabIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f113074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f113075m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Filter f113076n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, b bVar, Filter filter) {
        super(1);
        this.f113074l = arrayList;
        this.f113075m = bVar;
        this.f113076n = filter;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Filter.InnerOptions.Options options;
        String id2;
        int iIntValue = num.intValue();
        ArrayList arrayList = this.f113074l;
        if (arrayList != null && (options = (Filter.InnerOptions.Options) C42745f0.K(iIntValue, arrayList)) != null) {
            List<? extends ParcelableEntity<String>> listSingletonList = Collections.singletonList(options);
            int i12 = b.f113056o;
            b bVar = this.f113075m;
            bVar.getClass();
            Filter filter = this.f113076n;
            if (filter != null && (id2 = filter.getId()) != null) {
                bVar.f113059d.k(id2, listSingletonList);
            }
        }
        return G0.f406611a;
    }
}
