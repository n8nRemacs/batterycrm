package com.avito.android.photo_gallery_carousel.items.beduin_teaser;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import bj.InterfaceC25659b;
import com.avito.android.R;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryBeduinItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/a;", "LTV0/b;", "Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/e;", "Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/GalleryBeduinItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<e, GalleryBeduinItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f217886a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f217887b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC25659b f217888c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC39737b f217889d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f217890e = new g.a<>(R.layout.carousel_photo_gallery_beduin_teaser_item, new C6533a());

    /* compiled from: GalleryBeduinItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_gallery_carousel.items.beduin_teaser.a$a, reason: collision with other inner class name */
    public static final class C6533a extends N implements p<ViewGroup, View, f> {
        public C6533a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new f(view, aVar.f217888c, aVar.f217889d.F(), aVar.f217887b);
        }
    }

    @Inject
    public a(@k c cVar, @k InterfaceC40691b interfaceC40691b, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39737b interfaceC39737b) {
        this.f217886a = cVar;
        this.f217887b = interfaceC40691b;
        this.f217888c = interfaceC25659b;
        this.f217889d = interfaceC39737b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f217886a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f217890e;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof GalleryBeduinItem;
    }
}
