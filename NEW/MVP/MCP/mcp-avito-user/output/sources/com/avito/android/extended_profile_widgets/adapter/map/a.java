package com.avito.android.extended_profile_widgets.adapter.map;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MapItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/map/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/map/g;", "Lcom/avito/android/extended_profile_widgets/adapter/map/MapItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<g, MapItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f154547a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AvitoMarkerIconFactory f154548b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f154549c = new g.a<>(R.layout.extended_profile_map_item, new C4519a());

    /* compiled from: MapItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/map/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/map/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.map.a$a, reason: collision with other inner class name */
    public static final class C4519a extends N implements p<ViewGroup, View, h> {
        public C4519a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            Thread.currentThread().setContextClassLoader(view2.getContext().getClassLoader());
            return new h(view2, a.this.f154548b);
        }
    }

    @Inject
    public a(@k c cVar, @k AvitoMarkerIconFactory avitoMarkerIconFactory) {
        this.f154547a = cVar;
        this.f154548b = avitoMarkerIconFactory;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154547a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f154549c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof MapItem) && !((MapItem) aVar).f154546f;
    }
}
