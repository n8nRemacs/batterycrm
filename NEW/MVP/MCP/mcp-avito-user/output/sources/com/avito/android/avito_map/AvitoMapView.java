package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoMapView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ+\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isInterceptEnabled", "", "()Z", "setInterceptEnabled", "(Z)V", "getAvitoMapPointFromPx", "Lcom/avito/android/avito_map/AvitoMapPoint;", "x", "", "y", "avitoMap", "Lcom/avito/android/avito_map/AvitoMap;", "(Ljava/lang/Float;Ljava/lang/Float;Lcom/avito/android/avito_map/AvitoMap;)Lcom/avito/android/avito_map/AvitoMapPoint;", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "DrawingTouch", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class AvitoMapView extends FrameLayout {
    private boolean isInterceptEnabled;

    /* compiled from: AvitoMapView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapView$DrawingTouch;", "", "x", "", "y", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getX", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getY", "drawingFinished", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DrawingTouch {

        @l
        private final Float x;

        @l
        private final Float y;

        /* JADX WARN: Multi-variable type inference failed */
        public DrawingTouch() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean drawingFinished() {
            return this.x == null || this.y == null;
        }

        @l
        public final Float getX() {
            return this.x;
        }

        @l
        public final Float getY() {
            return this.y;
        }

        public DrawingTouch(@l Float f12, @l Float f13) {
            this.x = f12;
            this.y = f13;
        }

        public /* synthetic */ DrawingTouch(Float f12, Float f13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : f12, (i12 & 2) != 0 ? null : f13);
        }
    }

    public AvitoMapView(@k Context context) {
        this(context, null);
    }

    @l
    public final AvitoMapPoint getAvitoMapPointFromPx(@l Float x12, @l Float y12, @l AvitoMap avitoMap) {
        if (x12 == null || y12 == null || avitoMap == null) {
            return null;
        }
        double latitude = avitoMap.getMapBounds().getTopLeft().getLatitude();
        double latitude2 = avitoMap.getMapBounds().getBottomRight().getLatitude();
        double longitude = avitoMap.getMapBounds().getTopLeft().getLongitude();
        return new AvitoMapPoint((y12.floatValue() * ((latitude2 - latitude) / getHeight())) + latitude, (x12.floatValue() * ((avitoMap.getMapBounds().getBottomRight().getLongitude() - longitude) / getWidth())) + longitude, null, 4, null);
    }

    /* renamed from: isInterceptEnabled, reason: from getter */
    public final boolean getIsInterceptEnabled() {
        return this.isInterceptEnabled;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@k MotionEvent event) {
        if (this.isInterceptEnabled) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void setInterceptEnabled(boolean z12) {
        this.isInterceptEnabled = z12;
    }

    public AvitoMapView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvitoMapView(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
    }
}
