package com.avito.android.cyclic_gallery_widget.image_carousel.native_video;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarouselNativeVideoBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/a;", "LTV0/b;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/e;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/b;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<e, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f132044a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f132045b = new g.a<>(R.layout.cyclic_gallery_widget_public_gallery_native_video_item, C3954a.f132046l);

    /* compiled from: CarouselNativeVideoBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cyclic_gallery_widget.image_carousel.native_video.a$a, reason: collision with other inner class name */
    public static final class C3954a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3954a f132046l = new C3954a();

        public C3954a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    public a(@k d dVar) {
        this.f132044a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f132044a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f132045b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof b;
    }
}
