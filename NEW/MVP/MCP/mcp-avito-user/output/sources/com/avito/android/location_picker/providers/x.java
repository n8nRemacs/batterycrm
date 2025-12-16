package com.avito.android.location_picker.providers;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: LocationPickerPublishAnalyticsProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/x;", "Lcom/avito/android/location_picker/providers/w;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f182483a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f182484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f182485c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f182486d;

    @Inject
    public x(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f182483a = interfaceC28373a;
        this.f182484b = c50213a;
    }

    @Override // com.avito.android.location_picker.providers.w
    public final void a(@Y61.k LocationPickerState locationPickerState) {
        this.f182483a.c(new ParametrizedClickStreamEvent(2356, 4, g(locationPickerState), null, 8, null));
    }

    @Override // com.avito.android.location_picker.providers.w
    public final void b(@Y61.k LocationPickerState locationPickerState) {
        if (this.f182485c) {
            return;
        }
        this.f182485c = true;
        this.f182483a.c(new ParametrizedClickStreamEvent(2351, 4, g(locationPickerState), null, 8, null));
    }

    @Override // com.avito.android.location_picker.providers.w
    public final void c(@Y61.k LocationPickerState locationPickerState) {
        this.f182483a.c(new ParametrizedClickStreamEvent(2681, 1, g(locationPickerState), null, 8, null));
    }

    @Override // com.avito.android.location_picker.providers.w
    public final void d(@Y61.k LocationPickerState locationPickerState) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(g(locationPickerState));
        linkedHashMap.put(AddressParameter.TYPE, locationPickerState.f182361f);
        linkedHashMap.put("success", String.valueOf(!locationPickerState.f182368m.isEmpty()));
        this.f182483a.c(new ParametrizedClickStreamEvent(2685, 1, linkedHashMap, null, 8, null));
    }

    @Override // com.avito.android.location_picker.providers.w
    public final void e(@Y61.k LocationPickerState locationPickerState) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(g(locationPickerState));
        linkedHashMap.put(AddressParameter.TYPE, locationPickerState.f182361f);
        this.f182483a.c(new ParametrizedClickStreamEvent(2357, 6, linkedHashMap, null, 8, null));
    }

    @Override // com.avito.android.location_picker.providers.w
    public final void f(@Y61.k LocationPickerState locationPickerState) {
        if (this.f182486d) {
            return;
        }
        this.f182486d = true;
        this.f182483a.c(new ParametrizedClickStreamEvent(2350, 4, g(locationPickerState), null, 8, null));
    }

    public final LinkedHashMap g(LocationPickerState locationPickerState) {
        Q q12;
        Q q13 = new Q("geo", C42745f0.U(Double.valueOf(locationPickerState.f182358c.getLatitude()), Double.valueOf(locationPickerState.f182358c.getLongitude())));
        String str = locationPickerState.f182357b;
        if (str != null) {
            q12 = new Q("iid", str);
        } else {
            C50213a c50213a = this.f182484b;
            q12 = !(c50213a.f443210b.length() == 0) ? new Q("esid", c50213a.b()) : new Q("esid", "");
        }
        return P0.j(q13, q12);
    }
}
