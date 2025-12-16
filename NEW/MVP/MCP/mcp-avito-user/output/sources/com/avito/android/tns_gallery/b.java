package com.avito.android.tns_gallery;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TnsGalleryItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tns_gallery/b;", "LTV0/b;", "Lcom/avito/android/tns_gallery/n;", "Lcom/avito/android/tns_gallery/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<n, com.avito.android.tns_gallery.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f301524a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f301525b = new g.a<>(R.layout.tns_gallery_item_image, a.f301526l);

    /* compiled from: TnsGalleryItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tns_gallery/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tns_gallery/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, q> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f301526l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final q invoke(ViewGroup viewGroup, View view) {
            return new q(view);
        }
    }

    public b(@Y61.k f fVar) {
        this.f301524a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f301524a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f301525b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.tns_gallery.a;
    }
}
