package com.avito.android.serp.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.design.widget.ClickableGalleryPager;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertItemGridRedesignNoCardBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "rootView", "Lcom/avito/android/serp/adapter/video_snippet/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/video_snippet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34747n extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, com.avito.android.serp.adapter.video_snippet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f270439l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f270440m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.video_snippets.g f270441n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34747n(com.avito.android.server_time.h hVar, Locale locale, com.avito.android.video_snippets.g gVar) {
        super(2);
        this.f270439l = hVar;
        this.f270440m = locale;
        this.f270441n = gVar;
    }

    @Override // Y41.p
    public final com.avito.android.serp.adapter.video_snippet.d invoke(ViewGroup viewGroup, View view) {
        com.avito.android.serp.adapter.video_snippet.d dVar = new com.avito.android.serp.adapter.video_snippet.d(view, this.f270439l, this.f270440m, AsyncViewportTracker.ViewContext.f430413c, this.f270441n, null, 32, null);
        C34731f c34731f = dVar.f273694c;
        com.avito.android.serp.adapter.serp_advert_card.B b12 = c34731f.f269948b;
        b12.f271752b0 = false;
        ClickableGalleryPager clickableGalleryPager = b12.f271759f;
        clickableGalleryPager.getLayoutParams().height = -2;
        clickableGalleryPager.setRatio(1.0f);
        com.avito.android.lib.util.v.b(dVar.f273697f, R.dimen.advert_grid_gallery_redesign_old_rounded_corner_size);
        c34731f.f269948b.g();
        return dVar;
    }
}
