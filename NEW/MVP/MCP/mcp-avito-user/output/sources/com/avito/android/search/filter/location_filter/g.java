package com.avito.android.search.filter.location_filter;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LocationFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<P2<? super ParametersTreeWithAdditional>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f263636l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f263637m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f263638n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<ParcelableEntity<String>> f263639o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f263640p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l0.a aVar, r rVar, String str, List<? extends ParcelableEntity<String>> list, String str2) {
        super(1);
        this.f263636l = aVar;
        this.f263637m = rVar;
        this.f263638n = str;
        this.f263639o = list;
        this.f263640p = str2;
    }

    @Override // Y41.l
    public final G0 invoke(P2<? super ParametersTreeWithAdditional> p22) {
        P2<? super ParametersTreeWithAdditional> p23 = p22;
        l0.a aVar = this.f263636l;
        if (!aVar.f406838b && (p23 instanceof P2.b)) {
            aVar.f406838b = true;
            List<ParcelableEntity<String>> list = this.f263639o;
            this.f263637m.t(this.f263638n, this.f263640p, list);
        }
        return G0.f406611a;
    }
}
