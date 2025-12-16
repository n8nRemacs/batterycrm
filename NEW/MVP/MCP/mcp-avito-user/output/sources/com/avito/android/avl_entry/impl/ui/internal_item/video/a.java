package com.avito.android.avl_entry.impl.ui.internal_item.video;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShortVideosWidgetCarouselItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/video/a;", "LTV0/b;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/video/i;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem$VideoItem;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<i, ShortVideosWidgetCarouselItem.VideoItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f98582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f98583b = new g.a<>(R.layout.avl_entry_item_widget_carousel, C2958a.f98584l);

    /* compiled from: ShortVideosWidgetCarouselItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/avl_entry/impl/ui/internal_item/video/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/avl_entry/impl/ui/internal_item/video/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.avl_entry.impl.ui.internal_item.video.a$a, reason: collision with other inner class name */
    public static final class C2958a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2958a f98584l = new C2958a();

        public C2958a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f98582a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f98582a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f98583b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ShortVideosWidgetCarouselItem.VideoItem;
    }
}
