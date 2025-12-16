package com.avito.android.photo_gallery;

import android.os.Bundle;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideoStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_gallery.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33196i extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f217457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f217458m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GalleryFragmentType f217459n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f217460o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Screen f217461p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f217462q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f217463r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f217464s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q.g f217465t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q.b f217466u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeVideoStatus f217467v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PinchToZoomSource f217468w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f217469x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Image f217470y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Float f217471z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33196i(Image image, boolean z12, GalleryFragmentType galleryFragmentType, boolean z13, Screen screen, boolean z14, String str, String str2, q.g gVar, q.b bVar, NativeVideoStatus nativeVideoStatus, PinchToZoomSource pinchToZoomSource, String str3, Image image2, Float f12) {
        super(1);
        this.f217457l = image;
        this.f217458m = z12;
        this.f217459n = galleryFragmentType;
        this.f217460o = z13;
        this.f217461p = screen;
        this.f217462q = z14;
        this.f217463r = str;
        this.f217464s = str2;
        this.f217465t = gVar;
        this.f217466u = bVar;
        this.f217467v = nativeVideoStatus;
        this.f217468w = pinchToZoomSource;
        this.f217469x = str3;
        this.f217470y = image2;
        this.f217471z = f12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putParcelable("image", this.f217457l);
        bundle2.putBoolean("crop", this.f217458m);
        bundle2.putSerializable("type", this.f217459n);
        bundle2.putBoolean("fastOpen", this.f217460o);
        bundle2.putParcelable("screen", this.f217461p);
        bundle2.putBoolean("should_track_metrics", this.f217462q);
        bundle2.putString("screen_tracker_id", this.f217463r);
        bundle2.putString("advertId", this.f217464s);
        q.g gVar = this.f217465t;
        bundle2.putParcelable("teaser", gVar != null ? gVar.f216769a : null);
        q.b bVar = this.f217466u;
        bundle2.putParcelable("beduin_teaser", bVar != null ? bVar.f216764a : null);
        bundle2.putParcelable("native_video_status", this.f217467v);
        PinchToZoomSource pinchToZoomSource = this.f217468w;
        bundle2.putString("pinch_to_zoom_source", pinchToZoomSource != null ? pinchToZoomSource.name() : null);
        bundle2.putString("pinch_to_zoom_source", pinchToZoomSource != null ? pinchToZoomSource.name() : null);
        bundle2.putString("search_context", this.f217469x);
        bundle2.putParcelable("divide_image", this.f217470y);
        Float f12 = this.f217471z;
        if (f12 != null) {
            bundle2.putFloat("ratio", f12.floatValue());
        }
        return G0.f406611a;
    }
}
