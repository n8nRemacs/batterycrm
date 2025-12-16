package Vd0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.search.Theme;
import javax.inject.Inject;
import kotlin.Metadata;
import nF.C44245a;

/* compiled from: HistoricalSuggestNewItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LVd0/a;", "Lcom/avito/android/category_parameters/e;", "LVd0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vd0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15666a extends com.avito.android.category_parameters.e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C0 f17319a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C44245a f17320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k f17321c = new com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k(null, null, 3, null);

    @Inject
    public C15666a(@k C0 c02, @k C44245a c44245a) {
        this.f17319a = c02;
        this.f17320b = c44245a;
    }

    @Override // Vd0.d
    public final void c(@k com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k kVar) {
        this.f17321c = kVar;
    }

    @Override // com.avito.android.category_parameters.e
    @l
    public final com.avito.conveyor_item.a d(@k CategoryParameter categoryParameter, @l Theme theme) {
        boolean z12 = categoryParameter instanceof AddressParameter;
        AddressParameter addressParameter = z12 ? (AddressParameter) categoryParameter : null;
        if (addressParameter == null) {
            return null;
        }
        C0 c02 = this.f17319a;
        boolean zCe = c02.Ce();
        Integer categoryId = c02.f231861Y.getNavigation().getCategoryId();
        boolean z13 = categoryId != null && categoryId.intValue() == 4;
        boolean z14 = addressParameter.getFlowType() != AddressParameter.GeoFlowType.HISTORICAL_SUGGEST;
        if (zCe || z13 || z14 || !this.f17320b.v().invoke().booleanValue()) {
            return null;
        }
        com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k kVar = this.f17321c;
        AddressParameter addressParameter2 = z12 ? (AddressParameter) categoryParameter : null;
        com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k kVar2 = new com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k(addressParameter2 != null ? addressParameter2.getValue() : null, kVar.f233278b);
        this.f17321c = kVar2;
        return kVar2;
    }

    @Override // Vd0.d
    @k
    /* renamed from: get, reason: from getter */
    public final com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k getF17321c() {
        return this.f17321c;
    }
}
