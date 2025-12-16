package hx;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.developments_catalog.residential_complex_search.ResidentialComplexActivity;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DevelopmentsCatalogIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhx/b;", "Lhx/a;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C41185b implements InterfaceC41184a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f398304a;

    @Inject
    public C41185b(@k Application application) {
        this.f398304a = application;
    }

    @Override // hx.InterfaceC41184a
    @k
    public final Intent a(@l Double d12, @l Double d13, boolean z12) {
        new ResidentialComplexActivity.a();
        Intent intent = new Intent(this.f398304a, (Class<?>) ResidentialComplexActivity.class);
        if (d12 != null) {
            intent.putExtra("lat", d12.doubleValue());
        }
        if (d13 != null) {
            intent.putExtra(AddressParameter.Value.LNG, d13.doubleValue());
        }
        intent.putExtra("button_item", z12);
        return intent;
    }
}
