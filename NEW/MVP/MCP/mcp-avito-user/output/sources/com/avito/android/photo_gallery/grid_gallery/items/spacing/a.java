package com.avito.android.photo_gallery.grid_gallery.items.spacing;

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

/* compiled from: GridGallerySpacingBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/spacing/a;", "LTV0/b;", "Lcom/avito/android/photo_gallery/grid_gallery/items/spacing/e;", "Lcom/avito/android/photo_gallery/grid_gallery/items/spacing/GridGallerySpacingItem;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<e, GridGallerySpacingItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f217298a;

    /* compiled from: GridGallerySpacingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_gallery/grid_gallery/items/spacing/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_gallery/grid_gallery/items/spacing/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_gallery.grid_gallery.items.spacing.a$a, reason: collision with other inner class name */
    public static final class C6520a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6520a f217299l = new C6520a();

        public C6520a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f217298a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f217298a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.grid_gallery_item_spacing, C6520a.f217299l);
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof GridGallerySpacingItem;
    }
}
