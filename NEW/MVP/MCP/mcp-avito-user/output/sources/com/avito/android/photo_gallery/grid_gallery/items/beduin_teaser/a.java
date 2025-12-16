package com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridGalleryBeduinTeaserBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/a;", "LTV0/b;", "Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/f;", "Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<f, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f217230a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f217231b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC25659b f217232c;

    /* compiled from: GridGalleryBeduinTeaserBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser.a$a, reason: collision with other inner class name */
    public static final class C6516a extends N implements p<ViewGroup, View, g> {
        public C6516a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            InterfaceC40691b interfaceC40691b = aVar.f217231b;
            InterfaceC25659b interfaceC25659b = aVar.f217232c;
            return new g(view2, interfaceC40691b, interfaceC25659b.b(null), interfaceC25659b.b(null), interfaceC25659b.b(null));
        }
    }

    @Inject
    public a(@k d dVar, @k InterfaceC40691b interfaceC40691b, @k InterfaceC25659b interfaceC25659b) {
        this.f217230a = dVar;
        this.f217231b = interfaceC40691b;
        this.f217232c = interfaceC25659b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f217230a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.grid_gallery_item_beduin_teaser, new C6516a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
