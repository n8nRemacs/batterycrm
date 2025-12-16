package com.avito.android.extended_profile_widgets.adapter.carousel;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vB.InterfaceC49187a;

/* compiled from: CarouselItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/b;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/carousel/h;", "Lcom/avito/android/extended_profile_widgets/adapter/carousel/CarouselItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<h, CarouselItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f154289a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f154290b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f154291c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f154292d = new g.a<>(R.layout.extended_profile_carousel_item, new a());

    /* compiled from: CarouselItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/carousel/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/carousel/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new i(view, bVar.f154290b, bVar.f154291c);
        }
    }

    @Inject
    public b(@k d dVar, @InterfaceC49187a @k com.avito.konveyor.a aVar, @InterfaceC49187a @k com.avito.konveyor.adapter.h hVar) {
        this.f154289a = dVar;
        this.f154290b = aVar;
        this.f154291c = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154289a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f154292d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CarouselItem;
    }
}
