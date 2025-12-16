package com.avito.android.service_order_map.serviceordermap;

import kotlin.Metadata;

/* compiled from: ServiceOrderMapView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapView;", "", "ZoomLevel", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceOrderMapView {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceOrderMapView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapView$ZoomLevel;", "", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ZoomLevel {

        /* renamed from: c, reason: collision with root package name */
        public static final ZoomLevel f278614c;

        /* renamed from: d, reason: collision with root package name */
        public static final ZoomLevel f278615d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ZoomLevel[] f278616e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278617f;

        /* renamed from: b, reason: collision with root package name */
        public final float f278618b;

        static {
            ZoomLevel zoomLevel = new ZoomLevel(17.0f, "Building", 0);
            f278614c = zoomLevel;
            ZoomLevel zoomLevel2 = new ZoomLevel(11.0f, "Town", 1);
            f278615d = zoomLevel2;
            ZoomLevel[] zoomLevelArr = {zoomLevel, zoomLevel2};
            f278616e = zoomLevelArr;
            f278617f = kotlin.enums.c.a(zoomLevelArr);
        }

        public ZoomLevel(float f12, String str, int i12) {
            this.f278618b = f12;
        }

        public static ZoomLevel valueOf(String str) {
            return (ZoomLevel) Enum.valueOf(ZoomLevel.class, str);
        }

        public static ZoomLevel[] values() {
            return (ZoomLevel[]) f278616e.clone();
        }
    }
}
