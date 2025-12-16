package com.avito.android.photo_picker.gallery.gallery_list;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryItemBluePrint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/gallery/gallery_list/a;", "LTV0/b;", "Lcom/avito/android/photo_picker/gallery/gallery_list/h;", "Lcom/avito/android/photo_picker/gallery/gallery_list/k;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<h, k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f219525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f219526b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<i> f219527c = new g.a<>(R.layout.item_gallery_photo, C6602a.f219528l);

    /* compiled from: GalleryItemBluePrint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_picker/gallery/gallery_list/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_picker/gallery/gallery_list/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_picker.gallery.gallery_list.a$a, reason: collision with other inner class name */
    public static final class C6602a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6602a f219528l = new C6602a();

        public C6602a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar, boolean z12) {
        this.f219525a = cVar;
        this.f219526b = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f219525a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<i> b() {
        return this.f219527c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof k) && !this.f219526b;
    }
}
