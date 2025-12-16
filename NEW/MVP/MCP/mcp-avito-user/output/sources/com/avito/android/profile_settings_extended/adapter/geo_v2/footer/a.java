package com.avito.android.profile_settings_extended.adapter.geo_v2.footer;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedSettingsGeoV2FooterItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/a;", "LTV0/b;", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/c;", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/ExtendedSettingsGeoV2FooterItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<c, ExtendedSettingsGeoV2FooterItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f229496a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<d> f229497b = new g.a<>(R.layout.ext_profile_settings_geo_v2_footer_item, C6982a.f229498l);

    /* compiled from: ExtendedSettingsGeoV2FooterItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_settings_extended.adapter.geo_v2.footer.a$a, reason: collision with other inner class name */
    public static final class C6982a extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6982a f229498l = new C6982a();

        public C6982a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view);
        }
    }

    @Inject
    public a(@k e eVar) {
        this.f229496a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f229496a;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f229497b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ExtendedSettingsGeoV2FooterItem;
    }
}
