package Sq;

import Y61.k;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComparisonItemFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSq/h;", "LSq/g;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f15159a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC15213a f15160b;

    @Inject
    public h(@k d dVar, @k InterfaceC15213a interfaceC15213a) {
        this.f15159a = dVar;
        this.f15160b = interfaceC15213a;
    }

    @Override // Sq.g
    @k
    public final j a(@k ComparisonResponse comparisonResponse, boolean z12) {
        return new j(comparisonResponse.getHeaderText(), this.f15159a.a(comparisonResponse), this.f15160b.a(comparisonResponse, z12));
    }
}
