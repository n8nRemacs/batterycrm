package com.avito.android.profile_settings_extended.adapter.carousel;

import TV0.g;
import Wb0.InterfaceC15739a;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedSettingsCarouselItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/a;", "LTV0/b;", "Lcom/avito/android/profile_settings_extended/adapter/carousel/l;", "Lcom/avito/android/profile_settings_extended/adapter/carousel/ExtendedSettingsCarouselItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<l, ExtendedSettingsCarouselItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f229299a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f229300b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f229301c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f229302d = new g.a<>(R.layout.ext_profile_settings_carousel_item, new C6975a());

    /* compiled from: ExtendedSettingsCarouselItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile_settings_extended/adapter/carousel/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile_settings_extended/adapter/carousel/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_settings_extended.adapter.carousel.a$a, reason: collision with other inner class name */
    public static final class C6975a extends N implements Y41.p<ViewGroup, View, m> {
        public C6975a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new m(view, aVar.f229300b, aVar.f229301c);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @InterfaceC15739a @Y61.k com.avito.konveyor.a aVar, @InterfaceC15739a @Y61.k com.avito.konveyor.adapter.h hVar) {
        this.f229299a = cVar;
        this.f229300b = aVar;
        this.f229301c = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f229299a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f229302d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ExtendedSettingsCarouselItem;
    }
}
