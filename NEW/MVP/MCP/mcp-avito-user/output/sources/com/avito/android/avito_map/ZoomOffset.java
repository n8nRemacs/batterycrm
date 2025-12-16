package com.avito.android.avito_map;

import kotlin.Metadata;

/* compiled from: AvitoMapBoundsBuilder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B'\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nR\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/avito/android/avito_map/ZoomOffset;", "", "()V", "offset", "", "(I)V", "top", "bottom", "left", "right", "(IIII)V", "<set-?>", "getBottom", "()I", "getLeft", "getRight", "getTop", "Companion", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ZoomOffset {
    private static final int DEFAULT_ZOOM_OFFSET = 30;
    private int bottom;
    private int left;
    private int right;
    private int top;

    public ZoomOffset() {
        this.top = DEFAULT_ZOOM_OFFSET;
        this.bottom = DEFAULT_ZOOM_OFFSET;
        this.left = DEFAULT_ZOOM_OFFSET;
        this.right = DEFAULT_ZOOM_OFFSET;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public ZoomOffset(int i12) {
        this.top = i12;
        this.bottom = i12;
        this.left = i12;
        this.right = i12;
    }

    public ZoomOffset(int i12, int i13, int i14, int i15) {
        this.top = i12;
        this.bottom = i13;
        this.left = i14;
        this.right = i15;
    }
}
