package com.avito.android.pinch_to_zoom;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinchToZoomSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/pinch_to_zoom/PinchToZoomSource;", "", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinchToZoomSource {

    /* renamed from: c, reason: collision with root package name */
    public static final PinchToZoomSource f219964c;

    /* renamed from: d, reason: collision with root package name */
    public static final PinchToZoomSource f219965d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PinchToZoomSource[] f219966e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f219967f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f219968b;

    static {
        PinchToZoomSource pinchToZoomSource = new PinchToZoomSource("RICH_SNIPPET", 0, "rich_snippet");
        f219964c = pinchToZoomSource;
        PinchToZoomSource pinchToZoomSource2 = new PinchToZoomSource("ADVERT_DETAILS", 1, "item_gallery");
        f219965d = pinchToZoomSource2;
        PinchToZoomSource[] pinchToZoomSourceArr = {pinchToZoomSource, pinchToZoomSource2};
        f219966e = pinchToZoomSourceArr;
        f219967f = kotlin.enums.c.a(pinchToZoomSourceArr);
    }

    public PinchToZoomSource(String str, int i12, String str2) {
        this.f219968b = str2;
    }

    public static PinchToZoomSource valueOf(String str) {
        return (PinchToZoomSource) Enum.valueOf(PinchToZoomSource.class, str);
    }

    public static PinchToZoomSource[] values() {
        return (PinchToZoomSource[]) f219966e.clone();
    }
}
