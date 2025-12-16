package com.avito.android.advert_core.map;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.U0;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertMapItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/map/b;", "LTV0/b;", "Lcom/avito/android/advert_core/map/g;", "Lcom/avito/android/advert_core/map/AdvertMapItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements TV0.b<g, AdvertMapItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f83749a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AvitoMarkerIconFactory f83750b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final U0 f83751c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<i> f83752d = new g.a<>(R.layout.advert_map_view_root, new a());

    /* compiled from: AdvertMapItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/map/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/map/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            b bVar = b.this;
            if (bVar.f83751c.v().invoke().booleanValue()) {
                Thread.currentThread().setContextClassLoader(view2.getContext().getClassLoader());
            }
            return new i(view2, bVar.f83750b, bVar.f83751c.v().invoke().booleanValue());
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k AvitoMarkerIconFactory avitoMarkerIconFactory, @Y61.k U0 u02) {
        this.f83749a = dVar;
        this.f83750b = avitoMarkerIconFactory;
        this.f83751c = u02;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f83749a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<i> b() {
        return this.f83752d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertMapItem;
    }
}
