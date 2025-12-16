package com.avito.android.serp.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.design.widget.ClickableGalleryPager;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertItemDoubleBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/video_snippet/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/video_snippet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34733g extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, com.avito.android.serp.adapter.video_snippet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.server_time.h f269992l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Locale f269993m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.video_snippets.g f269994n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C34735h f269995o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34733g(com.avito.android.server_time.h hVar, Locale locale, com.avito.android.video_snippets.g gVar, C34735h c34735h) {
        super(2);
        this.f269992l = hVar;
        this.f269993m = locale;
        this.f269994n = gVar;
        this.f269995o = c34735h;
    }

    @Override // Y41.p
    public final com.avito.android.serp.adapter.video_snippet.d invoke(ViewGroup viewGroup, View view) {
        com.avito.android.serp.adapter.video_snippet.d dVar = new com.avito.android.serp.adapter.video_snippet.d(view, this.f269992l, this.f269993m, AsyncViewportTracker.ViewContext.f430415e, this.f269994n, null, 32, null);
        C34735h c34735h = this.f269995o;
        float f273949a = c34735h.f270126b.getF273949a() / c34735h.f270126b.getF273950b();
        C34731f c34731f = dVar.f273694c;
        com.avito.android.serp.adapter.serp_advert_card.B b12 = c34731f.f269948b;
        if (f273949a > 0.0f) {
            ClickableGalleryPager clickableGalleryPager = b12.f271759f;
            clickableGalleryPager.getLayoutParams().height = -2;
            clickableGalleryPager.setRatio(f273949a);
        } else {
            b12.getClass();
        }
        c34731f.f269948b.f271752b0 = true;
        return dVar;
    }
}
