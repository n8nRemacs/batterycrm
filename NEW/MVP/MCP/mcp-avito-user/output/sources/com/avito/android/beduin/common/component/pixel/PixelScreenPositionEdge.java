package com.avito.android.beduin.common.component.pixel;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinPixelModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionEdge;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PixelScreenPositionEdge {

    @com.google.gson.annotations.c("bottom")
    public static final PixelScreenPositionEdge BOTTOM;

    @com.google.gson.annotations.c("top")
    public static final PixelScreenPositionEdge TOP;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PixelScreenPositionEdge[] f102098b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102099c;

    static {
        PixelScreenPositionEdge pixelScreenPositionEdge = new PixelScreenPositionEdge("TOP", 0);
        TOP = pixelScreenPositionEdge;
        PixelScreenPositionEdge pixelScreenPositionEdge2 = new PixelScreenPositionEdge("BOTTOM", 1);
        BOTTOM = pixelScreenPositionEdge2;
        PixelScreenPositionEdge[] pixelScreenPositionEdgeArr = {pixelScreenPositionEdge, pixelScreenPositionEdge2};
        f102098b = pixelScreenPositionEdgeArr;
        f102099c = kotlin.enums.c.a(pixelScreenPositionEdgeArr);
    }

    private PixelScreenPositionEdge(String str, int i12) {
    }

    public static PixelScreenPositionEdge valueOf(String str) {
        return (PixelScreenPositionEdge) Enum.valueOf(PixelScreenPositionEdge.class, str);
    }

    public static PixelScreenPositionEdge[] values() {
        return (PixelScreenPositionEdge[]) f102098b.clone();
    }
}
