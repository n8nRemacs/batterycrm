package com.avito.android.multigeo_flow.full_list.view;

import Q20.a;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoFullListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoFullListFragment f206950l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddressItem f206951m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JobMultiGeoFullListFragment jobMultiGeoFullListFragment, AddressItem addressItem) {
        super(0);
        this.f206950l = jobMultiGeoFullListFragment;
        this.f206951m = addressItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
        this.f206950l.r5().accept(new a.g(this.f206951m));
        return G0.f406611a;
    }
}
