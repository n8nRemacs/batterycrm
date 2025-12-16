package com.avito.android.profile_settings_extended.adapter.geo;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedSettingsGeoItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo/e;", "LTV0/b;", "Lcom/avito/android/profile_settings_extended/adapter/geo/l;", "Lcom/avito/android/profile_settings_extended/adapter/geo/ExtendedSettingsGeoItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.b<l, ExtendedSettingsGeoItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f229463a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f229464b = new g.a<>(R.layout.ext_profile_settings_geo_item, a.f229465l);

    /* compiled from: ExtendedSettingsGeoItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile_settings_extended/adapter/geo/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile_settings_extended/adapter/geo/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, m> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f229465l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view);
        }
    }

    @Inject
    public e(@Y61.k g gVar) {
        this.f229463a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f229463a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f229464b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ExtendedSettingsGeoItem;
    }
}
