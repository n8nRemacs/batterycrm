package com.avito.android.extended_profile_widgets.adapter.gallery;

import TV0.g;
import Y41.p;
import Y61.k;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/gallery/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/gallery/h;", "Lcom/avito/android/extended_profile_widgets/adapter/gallery/GalleryItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<h, GalleryItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f154396a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f154397b;

    /* compiled from: GalleryItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/gallery/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/gallery/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.gallery.a$a, reason: collision with other inner class name */
    public static final class C4513a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f154398l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4513a(Activity activity) {
            super(2);
            this.f154398l = activity;
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(this.f154398l, view);
        }
    }

    @Inject
    public a(@k c cVar, @k Activity activity) {
        this.f154396a = cVar;
        this.f154397b = new g.a<>(R.layout.extended_profile_gallery_item, new C4513a(activity));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154396a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f154397b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof GalleryItem;
    }
}
