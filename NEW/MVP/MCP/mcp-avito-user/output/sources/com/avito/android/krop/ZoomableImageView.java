package com.avito.android.krop;

import Y41.p;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.app.r;
import com.avito.android.krop.util.ScaleAfterRotationStyle;
import com.avito.android.krop.util.SizeF;
import com.avito.android.krop.util.Transformation;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ZoomableImageView.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u00012\u00020\u0002:\tcdefghijkJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010O\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010KR\u0013\u0010S\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bT\u0010%R$\u0010Z\u001a\u00020F2\u0006\u0010V\u001a\u00020F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010K\"\u0004\bX\u0010YR$\u0010^\u001a\u00020F2\u0006\u0010[\u001a\u00020F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010YR\u0014\u0010`\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010KR\u0014\u0010b\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010K¨\u0006l"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView;", "Landroid/widget/ImageView;", "Lcom/avito/android/krop/i;", "", "resId", "Lkotlin/G0;", "setImageResource", "(I)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "setImageURI", "(Landroid/net/Uri;)V", "Landroid/widget/ImageView$ScaleType;", "type", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "img", "setZoom", "(Lcom/avito/android/krop/ZoomableImageView;)V", "Lcom/avito/android/krop/util/Transformation;", "getTransformation", "()Lcom/avito/android/krop/util/Transformation;", "transformation", "setTransformation", "(Lcom/avito/android/krop/util/Transformation;)V", "Landroid/graphics/RectF;", "getImageBounds$krop_release", "()Landroid/graphics/RectF;", "getImageBounds", "Lcom/avito/android/krop/util/c;", "getFocusOffset", "()Lcom/avito/android/krop/util/c;", "Lcom/avito/android/krop/util/d;", "getDisplayedBounds", "()Lcom/avito/android/krop/util/d;", "getCurrentBounds", "Landroid/view/GestureDetector$OnDoubleTapListener;", "w", "Landroid/view/GestureDetector$OnDoubleTapListener;", "getDoubleTapListener", "()Landroid/view/GestureDetector$OnDoubleTapListener;", "setDoubleTapListener", "(Landroid/view/GestureDetector$OnDoubleTapListener;)V", "doubleTapListener", "Landroid/view/View$OnTouchListener;", "x", "Landroid/view/View$OnTouchListener;", "getUserTouchListener", "()Landroid/view/View$OnTouchListener;", "setUserTouchListener", "(Landroid/view/View$OnTouchListener;)V", "userTouchListener", "Lcom/avito/android/krop/ZoomableImageView$e;", "y", "Lcom/avito/android/krop/ZoomableImageView$e;", "getImageMoveListener", "()Lcom/avito/android/krop/ZoomableImageView$e;", "setImageMoveListener", "(Lcom/avito/android/krop/ZoomableImageView$e;)V", "imageMoveListener", "", "<set-?>", "A", "F", "getRotationAngle$krop_release", "()F", "rotationAngle", "B", "getCurrentZoom", "currentZoom", "Landroid/graphics/PointF;", "getScrollPosition", "()Landroid/graphics/PointF;", "scrollPosition", "getZoomedRect", "zoomedRect", "max", "getMaxZoom", "setMaxZoom", "(F)V", "maxZoom", "min", "getMinZoom", "setMinZoom", "minZoom", "getImageWidth", "imageWidth", "getImageHeight", "imageHeight", "a", "b", "c", "d", "e", "SavedState", "f", "g", "h", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class ZoomableImageView extends ImageView implements com.avito.android.krop.i {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f174763C = 0;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public float rotationAngle;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public float currentZoom;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f174766b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f174767c;

    /* renamed from: d, reason: collision with root package name */
    public g f174768d;

    /* renamed from: e, reason: collision with root package name */
    public float f174769e;

    /* renamed from: f, reason: collision with root package name */
    public float f174770f;

    /* renamed from: g, reason: collision with root package name */
    public float f174771g;

    /* renamed from: h, reason: collision with root package name */
    public float f174772h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f174773i;

    /* renamed from: j, reason: collision with root package name */
    public c f174774j;

    /* renamed from: k, reason: collision with root package name */
    public final PointF f174775k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView.ScaleType f174776l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f174777m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f174778n;

    /* renamed from: o, reason: collision with root package name */
    public h f174779o;

    /* renamed from: p, reason: collision with root package name */
    public Transformation f174780p;

    /* renamed from: q, reason: collision with root package name */
    public final SizeF f174781q;

    /* renamed from: r, reason: collision with root package name */
    public SizeF f174782r;

    /* renamed from: s, reason: collision with root package name */
    public final SizeF f174783s;

    /* renamed from: t, reason: collision with root package name */
    public SizeF f174784t;

    /* renamed from: u, reason: collision with root package name */
    public final ScaleGestureDetector f174785u;

    /* renamed from: v, reason: collision with root package name */
    public final GestureDetector f174786v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public GestureDetector.OnDoubleTapListener doubleTapListener;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public View.OnTouchListener userTouchListener;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public e imageMoveListener;

    /* renamed from: z, reason: collision with root package name */
    public RectF f174790z;

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$a;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
    @TargetApi(9)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public OverScroller f174799a;

        public a() {
            throw null;
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$c;", "Ljava/lang/Runnable;", "krop_release"}, k = 1, mv = {1, 4, 0})
    public final class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public a f174812b;

        /* renamed from: c, reason: collision with root package name */
        public int f174813c;

        /* renamed from: d, reason: collision with root package name */
        public int f174814d;

        public c(int i12, int i13) {
            int i14;
            int imageWidth;
            int i15;
            int imageHeight;
            int i16;
            ZoomableImageView.this.f174768d = g.f174821e;
            Context context = ZoomableImageView.this.getContext();
            a aVar = new a();
            aVar.f174799a = new OverScroller(context);
            this.f174812b = aVar;
            ZoomableImageView.this.f174766b.getValues(ZoomableImageView.this.f174773i);
            float[] fArr = ZoomableImageView.this.f174773i;
            int i17 = (int) fArr[2];
            int i18 = (int) fArr[5];
            double dSin = Math.sin(Math.toRadians(ZoomableImageView.this.getRotationAngle()));
            double dCos = Math.cos(Math.toRadians(ZoomableImageView.this.getRotationAngle()));
            float imageWidth2 = ZoomableImageView.this.getImageWidth();
            SizeF sizeF = ZoomableImageView.this.f174781q;
            if (imageWidth2 > sizeF.f174843b) {
                double d12 = (-ZoomableImageView.this.getImageWidth()) * dCos;
                double d13 = 0;
                Double dValueOf = dCos <= d13 ? null : Double.valueOf(d12);
                double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
                Double dValueOf2 = dCos >= d13 ? null : Double.valueOf(d12);
                double dDoubleValue2 = dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d;
                double imageHeight2 = ZoomableImageView.this.getImageHeight() * dSin;
                Double dValueOf3 = dSin >= d13 ? null : Double.valueOf(imageHeight2);
                double dDoubleValue3 = dValueOf3 != null ? dValueOf3.doubleValue() : 0.0d;
                Double dValueOf4 = dSin <= d13 ? null : Double.valueOf(imageHeight2);
                double dDoubleValue4 = dValueOf4 != null ? dValueOf4.doubleValue() : 0.0d;
                imageWidth = (int) (ZoomableImageView.this.getImageWidth() + dDoubleValue2 + dDoubleValue4);
                i14 = (int) (sizeF.f174843b + dDoubleValue + dDoubleValue3);
            } else {
                i14 = i17;
                imageWidth = i14;
            }
            if (ZoomableImageView.this.getImageHeight() > sizeF.f174844c) {
                double d14 = (-ZoomableImageView.this.getImageHeight()) * dCos;
                i15 = i14;
                double d15 = 0;
                Double dValueOf5 = dCos <= d15 ? null : Double.valueOf(d14);
                double dDoubleValue5 = dValueOf5 != null ? dValueOf5.doubleValue() : 0.0d;
                Double dValueOf6 = dCos >= d15 ? null : Double.valueOf(d14);
                double dDoubleValue6 = dValueOf6 != null ? dValueOf6.doubleValue() : 0.0d;
                double d16 = (-ZoomableImageView.this.getImageWidth()) * dSin;
                Double dValueOf7 = dSin <= d15 ? null : Double.valueOf(d16);
                double dDoubleValue7 = dValueOf7 != null ? dValueOf7.doubleValue() : 0.0d;
                Double dValueOf8 = dSin < d15 ? Double.valueOf(d16) : null;
                imageHeight = (int) (ZoomableImageView.this.getImageHeight() + (dValueOf8 != null ? dValueOf8.doubleValue() : 0.0d) + dDoubleValue6);
                i16 = (int) (sizeF.f174844c + dDoubleValue7 + dDoubleValue5);
            } else {
                i15 = i14;
                imageHeight = i18;
                i16 = imageHeight;
            }
            a aVar2 = this.f174812b;
            if (aVar2 != null) {
                aVar2.f174799a.fling(i17, i18, i12, i13, i15, imageWidth, i16, imageHeight);
            }
            this.f174813c = i17;
            this.f174814d = i18;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            e imageMoveListener = zoomableImageView.getImageMoveListener();
            if (imageMoveListener != null) {
                imageMoveListener.a();
            }
            a aVar = this.f174812b;
            if (aVar != null && aVar.f174799a.isFinished()) {
                this.f174812b = null;
                return;
            }
            a aVar2 = this.f174812b;
            if (aVar2 != null) {
                OverScroller overScroller = aVar2.f174799a;
                overScroller.computeScrollOffset();
                if (overScroller.computeScrollOffset()) {
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    int i12 = currX - this.f174813c;
                    int i13 = currY - this.f174814d;
                    this.f174813c = currX;
                    this.f174814d = currY;
                    zoomableImageView.f174766b.postTranslate(i12, i13);
                    zoomableImageView.f();
                    zoomableImageView.i();
                    zoomableImageView.postOnAnimation(this);
                }
            }
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$d;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "krop_release"}, k = 1, mv = {1, 4, 0})
    public final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(@Y61.k MotionEvent motionEvent) {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            GestureDetector.OnDoubleTapListener doubleTapListener = zoomableImageView.getDoubleTapListener();
            boolean zOnDoubleTap = doubleTapListener != null ? doubleTapListener.onDoubleTap(motionEvent) : false;
            if (zoomableImageView.f174768d != g.f174818b) {
                return zOnDoubleTap;
            }
            float currentZoom = zoomableImageView.getCurrentZoom();
            ZoomableImageView zoomableImageView2 = ZoomableImageView.this;
            float f12 = zoomableImageView2.f174769e;
            zoomableImageView.postOnAnimation(new b(zoomableImageView2, currentZoom == f12 ? zoomableImageView2.f174770f : f12, motionEvent.getX(), motionEvent.getY(), false, 0.0f, false, 48, null));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(@Y61.k MotionEvent motionEvent) {
            GestureDetector.OnDoubleTapListener doubleTapListener = ZoomableImageView.this.getDoubleTapListener();
            if (doubleTapListener != null) {
                return doubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(@Y61.k MotionEvent motionEvent, @Y61.k MotionEvent motionEvent2, float f12, float f13) {
            a aVar;
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            c cVar = zoomableImageView.f174774j;
            if (cVar != null && (aVar = cVar.f174812b) != null) {
                ZoomableImageView.this.f174768d = g.f174818b;
                aVar.f174799a.forceFinished(true);
            }
            c cVar2 = zoomableImageView.new c((int) f12, (int) f13);
            zoomableImageView.f174774j = cVar2;
            zoomableImageView.postOnAnimation(cVar2);
            return super.onFling(motionEvent, motionEvent2, f12, f13);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(@Y61.k MotionEvent motionEvent) {
            ZoomableImageView.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@Y61.k MotionEvent motionEvent) {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            GestureDetector.OnDoubleTapListener doubleTapListener = zoomableImageView.getDoubleTapListener();
            return doubleTapListener != null ? doubleTapListener.onSingleTapConfirmed(motionEvent) : zoomableImageView.performClick();
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$e;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
    public interface e {
        void a();
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$f;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "krop_release"}, k = 1, mv = {1, 4, 0})
    public final class f extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public f() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(@Y61.k ScaleGestureDetector scaleGestureDetector) {
            double scaleFactor = scaleGestureDetector.getScaleFactor();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            int i12 = ZoomableImageView.f174763C;
            ZoomableImageView.this.l(scaleFactor, focusX, focusY, true);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            zoomableImageView.r();
            e imageMoveListener = zoomableImageView.getImageMoveListener();
            if (imageMoveListener == null) {
                return true;
            }
            imageMoveListener.a();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(@Y61.k ScaleGestureDetector scaleGestureDetector) {
            ZoomableImageView.this.f174768d = g.f174820d;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0018 A[PHI: r2
  0x0018: PHI (r2v3 float) = (r2v0 float), (r2v1 float) binds: [B:3:0x0016, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onScaleEnd(@Y61.k android.view.ScaleGestureDetector r15) {
            /*
                r14 = this;
                super.onScaleEnd(r15)
                com.avito.android.krop.ZoomableImageView$g r15 = com.avito.android.krop.ZoomableImageView.g.f174818b
                com.avito.android.krop.ZoomableImageView r0 = com.avito.android.krop.ZoomableImageView.this
                r0.f174768d = r15
                float r15 = r0.getCurrentZoom()
                float r1 = r0.getCurrentZoom()
                float r2 = r0.f174770f
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                r3 = 1
                if (r1 <= 0) goto L1a
            L18:
                r6 = r2
                goto L27
            L1a:
                float r1 = r0.getCurrentZoom()
                float r2 = r0.f174769e
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L25
                goto L18
            L25:
                r3 = 0
                r6 = r15
            L27:
                if (r3 == 0) goto L46
                com.avito.android.krop.ZoomableImageView$b r15 = new com.avito.android.krop.ZoomableImageView$b
                com.avito.android.krop.ZoomableImageView r5 = com.avito.android.krop.ZoomableImageView.this
                com.avito.android.krop.util.SizeF r1 = r5.f174781q
                float r2 = r1.f174843b
                r3 = 2
                float r3 = (float) r3
                float r7 = r2 / r3
                float r1 = r1.f174844c
                float r8 = r1 / r3
                r12 = 48
                r13 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r4 = r15
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r0.postOnAnimation(r15)
            L46:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.krop.ZoomableImageView.f.onScaleEnd(android.view.ScaleGestureDetector):void");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$g;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
    public static final class g {

        /* renamed from: b, reason: collision with root package name */
        public static final g f174818b;

        /* renamed from: c, reason: collision with root package name */
        public static final g f174819c;

        /* renamed from: d, reason: collision with root package name */
        public static final g f174820d;

        /* renamed from: e, reason: collision with root package name */
        public static final g f174821e;

        /* renamed from: f, reason: collision with root package name */
        public static final g f174822f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ g[] f174823g;

        static {
            g gVar = new g("NONE", 0);
            f174818b = gVar;
            g gVar2 = new g("DRAG", 1);
            f174819c = gVar2;
            g gVar3 = new g("ZOOM", 2);
            f174820d = gVar3;
            g gVar4 = new g("FLING", 3);
            f174821e = gVar4;
            g gVar5 = new g("ANIMATE_ZOOM", 4);
            f174822f = gVar5;
            f174823g = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f174823g.clone();
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$h;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        public final float f174824a;

        /* renamed from: b, reason: collision with root package name */
        public final float f174825b;

        /* renamed from: c, reason: collision with root package name */
        public final float f174826c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ImageView.ScaleType f174827d;

        public h(float f12, float f13, float f14, @Y61.k ImageView.ScaleType scaleType) {
            this.f174824a = f12;
            this.f174825b = f13;
            this.f174826c = f14;
            this.f174827d = scaleType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f174824a, hVar.f174824a) == 0 && Float.compare(this.f174825b, hVar.f174825b) == 0 && Float.compare(this.f174826c, hVar.f174826c) == 0 && L.f(this.f174827d, hVar.f174827d);
        }

        public final int hashCode() {
            int iFloatToIntBits = (Float.floatToIntBits(this.f174826c) + ((Float.floatToIntBits(this.f174825b) + (Float.floatToIntBits(this.f174824a) * 31)) * 31)) * 31;
            ImageView.ScaleType scaleType = this.f174827d;
            return iFloatToIntBits + (scaleType != null ? scaleType.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ZoomVariables(scale=" + this.f174824a + ", focusX=" + this.f174825b + ", focusY=" + this.f174826c + ", scaleType=" + this.f174827d + ")";
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/krop/util/c;", "Lcom/avito/android/krop/util/a;", "vector", "invoke", "(Lcom/avito/android/krop/util/c;Lcom/avito/android/krop/util/a;)Lcom/avito/android/krop/util/c;", "followLine"}, k = 3, mv = {1, 4, 0})
    public static final class i extends N implements p<com.avito.android.krop.util.c, com.avito.android.krop.util.a, com.avito.android.krop.util.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f174828l = new i();

        public i() {
            super(2);
        }

        @Y61.k
        public static com.avito.android.krop.util.c a(@Y61.k com.avito.android.krop.util.c cVar, @Y61.k com.avito.android.krop.util.a aVar) {
            com.avito.android.krop.util.c cVar2 = aVar.f174849b;
            float f12 = cVar2.f174850a;
            com.avito.android.krop.util.c cVar3 = aVar.f174848a;
            return cVar.a(Float.valueOf(f12 - cVar3.f174850a).floatValue(), Float.valueOf(cVar2.f174851b - cVar3.f174851b).floatValue());
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ com.avito.android.krop.util.c invoke(com.avito.android.krop.util.c cVar, com.avito.android.krop.util.a aVar) {
            return a(cVar, aVar);
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "deltaScale", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class j extends N implements Y41.l<Float, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            double dFloatValue = f12.floatValue();
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            SizeF sizeF = zoomableImageView.f174781q;
            float f13 = 2;
            zoomableImageView.l(dFloatValue, sizeF.f174843b / f13, sizeF.f174844c / f13, false);
            zoomableImageView.f();
            zoomableImageView.setMinZoom(zoomableImageView.getCurrentZoom());
            return G0.f406611a;
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "deltaScale", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class k extends N implements Y41.l<Float, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            float fMin = Math.min(zoomableImageView.f174770f, zoomableImageView.getCurrentZoom() * fFloatValue);
            SizeF sizeF = zoomableImageView.f174781q;
            float f13 = 2;
            zoomableImageView.postOnAnimation(zoomableImageView.new b(fMin, sizeF.f174843b / f13, sizeF.f174844c / f13, true, 200.0f, false));
            zoomableImageView.setMinZoom(fMin);
            return G0.f406611a;
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/krop/util/a;", "Lcom/avito/android/krop/util/c;", "invoke", "(Lcom/avito/android/krop/util/a;)Lcom/avito/android/krop/util/c;", "getVectorDistantPoint"}, k = 3, mv = {1, 4, 0})
    public static final class l extends N implements Y41.l<com.avito.android.krop.util.a, com.avito.android.krop.util.c> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.avito.android.krop.util.c invoke(@Y61.k com.avito.android.krop.util.a aVar) {
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            float fMax = Math.max(zoomableImageView.getImageWidth(), zoomableImageView.getImageHeight());
            com.avito.android.krop.util.c cVar = aVar.f174849b;
            float f12 = cVar.f174850a;
            com.avito.android.krop.util.c cVar2 = aVar.f174848a;
            float f13 = cVar2.f174850a;
            float f14 = f12 - f13;
            if (f14 == 0.0f) {
                return new com.avito.android.krop.util.c(f13, fMax);
            }
            float f15 = (cVar.f174851b - cVar2.f174851b) / f14;
            float fSignum = Math.signum(f14) * fMax;
            return new com.avito.android.krop.util.c(cVar2.f174850a + fSignum, cVar2.f174851b + (f15 * fSignum));
        }
    }

    public ZoomableImageView(@Y61.k Context context) {
        super(context);
        this.f174775k = new PointF();
        this.f174781q = new SizeF(0.0f, 0.0f, 3, null);
        this.f174782r = new SizeF(0.0f, 0.0f, 3, null);
        this.f174783s = new SizeF(0.0f, 0.0f, 3, null);
        this.f174784t = new SizeF(0.0f, 0.0f, 3, null);
        setClickable(true);
        this.f174785u = new ScaleGestureDetector(context, new f());
        this.f174786v = new GestureDetector(context, new d());
        this.f174766b = new Matrix();
        this.f174767c = new Matrix();
        this.f174773i = new float[9];
        this.currentZoom = 1.0f;
        this.f174776l = ImageView.ScaleType.CENTER_CROP;
        this.f174769e = 1.0f;
        this.f174770f = 5.0f;
        this.f174771g = 0.75f;
        this.f174772h = 6.25f;
        i();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f174768d = g.f174818b;
        this.f174778n = false;
    }

    public static final PointF c(ZoomableImageView zoomableImageView, float f12, float f13) {
        zoomableImageView.f174766b.getValues(zoomableImageView.f174773i);
        return new PointF((zoomableImageView.getImageWidth() * (f12 / zoomableImageView.getDrawable().getIntrinsicWidth())) + zoomableImageView.f174773i[2], (zoomableImageView.getImageHeight() * (f13 / zoomableImageView.getDrawable().getIntrinsicHeight())) + zoomableImageView.f174773i[5]);
    }

    private final com.avito.android.krop.util.d getCurrentBounds() {
        return g(this.f174766b);
    }

    private final com.avito.android.krop.util.d getDisplayedBounds() {
        return g(getImageMatrix());
    }

    private final com.avito.android.krop.util.c getFocusOffset() {
        com.avito.android.krop.util.d currentBounds = getCurrentBounds();
        com.avito.android.krop.util.c cVarA = currentBounds != null ? currentBounds.a() : new com.avito.android.krop.util.c(this.f174790z.centerX(), this.f174790z.centerY());
        return new com.avito.android.krop.util.c(cVarA.f174850a - this.f174790z.centerX(), cVarA.f174851b - this.f174790z.centerY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageHeight() {
        return this.f174783s.f174844c * this.currentZoom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageWidth() {
        return this.f174783s.f174843b * this.currentZoom;
    }

    public static float h(float f12, float f13, float f14) {
        float f15;
        float f16;
        if (f14 <= f13) {
            f16 = f13 - f14;
            f15 = 0.0f;
        } else {
            f15 = f13 - f14;
            f16 = 0.0f;
        }
        if (f12 < f15) {
            return (-f12) + f15;
        }
        if (f12 > f16) {
            return (-f12) + f16;
        }
        return 0.0f;
    }

    public static com.avito.android.krop.util.d o(@Y61.k RectF rectF) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        com.avito.android.krop.util.c cVar = new com.avito.android.krop.util.c(f12, f13);
        float f14 = rectF.right;
        com.avito.android.krop.util.c cVar2 = new com.avito.android.krop.util.c(f14, f13);
        float f15 = rectF.bottom;
        return new com.avito.android.krop.util.d(cVar, cVar2, new com.avito.android.krop.util.c(f14, f15), new com.avito.android.krop.util.c(f12, f15));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i12) {
        this.f174766b.getValues(this.f174773i);
        float f12 = this.f174773i[2];
        float imageWidth = getImageWidth();
        SizeF sizeF = this.f174781q;
        if (imageWidth < sizeF.f174843b) {
            return false;
        }
        if (f12 < -1 || i12 >= 0) {
            return (Math.abs(f12) + sizeF.f174843b) + 1.0f < getImageWidth() || i12 <= 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.krop.ZoomableImageView.d():void");
    }

    public final void e() {
        f();
        if (this.rotationAngle != 0.0f) {
            return;
        }
        this.f174766b.getValues(this.f174773i);
        float imageWidth = getImageWidth();
        SizeF sizeF = this.f174781q;
        float f12 = sizeF.f174843b;
        if (imageWidth < f12) {
            this.f174773i[2] = (f12 - getImageWidth()) / 2;
        }
        float imageHeight = getImageHeight();
        float f13 = sizeF.f174844c;
        if (imageHeight < f13) {
            this.f174773i[5] = (f13 - getImageHeight()) / 2;
        }
        this.f174766b.setValues(this.f174773i);
    }

    public final void f() {
        Object next;
        if (this.rotationAngle == 0.0f) {
            this.f174766b.getValues(this.f174773i);
            float[] fArr = this.f174773i;
            float f12 = fArr[2];
            float f13 = fArr[5];
            SizeF sizeF = this.f174781q;
            float fH2 = h(f12, sizeF.f174843b, getImageWidth());
            float fH3 = h(f13, sizeF.f174844c, getImageHeight());
            if (fH2 == 0.0f && fH3 == 0.0f) {
                return;
            }
            this.f174766b.postTranslate(fH2, fH3);
            return;
        }
        com.avito.android.krop.util.d currentBounds = getCurrentBounds();
        if (currentBounds != null) {
            com.avito.android.krop.util.d dVarO = o(this.f174790z);
            if (currentBounds.d(dVarO)) {
                return;
            }
            com.avito.android.krop.util.c cVarA = dVarO.a();
            com.avito.android.krop.util.c cVarA2 = currentBounds.a();
            float f14 = cVarA2.f174850a;
            float f15 = cVarA.f174850a;
            float f16 = f14 - f15;
            float f17 = cVarA2.f174851b;
            float f18 = cVarA.f174851b;
            float f19 = f17 - f18;
            com.avito.android.krop.util.c cVarA3 = dVarO.f174852a.a(f16, f19);
            com.avito.android.krop.util.c cVarA4 = dVarO.f174853b.a(f16, f19);
            com.avito.android.krop.util.c cVarA5 = dVarO.f174854c.a(f16, f19);
            com.avito.android.krop.util.c cVarA6 = dVarO.f174855d.a(f16, f19);
            com.avito.android.krop.util.d dVar = new com.avito.android.krop.util.d(cVarA3, cVarA4, cVarA5, cVarA6);
            List<com.avito.android.krop.util.a> listB = currentBounds.b();
            List listU = C42745f0.U(cVarA3, cVarA4, cVarA5, cVarA6);
            List list = listU;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.avito.android.krop.util.a) C42745f0.Q(listB)).c((com.avito.android.krop.util.c) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            Object next2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float fB2 = ((com.avito.android.krop.util.a) next).b();
                    do {
                        Object next3 = it2.next();
                        float fB3 = ((com.avito.android.krop.util.a) next3).b();
                        if (Float.compare(fB2, fB3) > 0) {
                            next = next3;
                            fB2 = fB3;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            if (next == null) {
                L.k();
                throw null;
            }
            com.avito.android.krop.util.a aVar = (com.avito.android.krop.util.a) next;
            int iIndexOf = listU.indexOf(aVar.f174848a) + 1;
            ArrayList arrayList2 = new ArrayList();
            if (iIndexOf != listU.size()) {
                arrayList2.addAll(listU.subList(iIndexOf, listU.size()));
            }
            arrayList2.addAll(listU.subList(0, iIndexOf));
            if (arrayList2.size() != listB.size()) {
                throw new IllegalStateException("Expected borders and heights sets to be same size");
            }
            i iVar = i.f174828l;
            com.avito.android.krop.util.c cVarA7 = dVar.a();
            iVar.getClass();
            com.avito.android.krop.util.c cVarA8 = i.a(cVarA7, aVar);
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                com.avito.android.krop.util.c cVar = (com.avito.android.krop.util.c) it3.next();
                i.f174828l.getClass();
                arrayList3.add(i.a(cVar, aVar));
            }
            ArrayList<com.avito.android.krop.util.c> arrayList4 = new ArrayList(arrayList3);
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it4 = listB.iterator();
            com.avito.android.krop.util.c cVar2 = null;
            while (it4.hasNext()) {
                com.avito.android.krop.util.a aVarC = ((com.avito.android.krop.util.a) it4.next()).c((com.avito.android.krop.util.c) arrayList4.remove(0));
                i.f174828l.getClass();
                cVarA8 = i.a(cVarA8, aVarC);
                ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList4, 10));
                for (com.avito.android.krop.util.c cVar3 : arrayList4) {
                    i.f174828l.getClass();
                    arrayList6.add(i.a(cVar3, aVarC));
                }
                arrayList4 = new ArrayList(arrayList6);
                if (cVar2 != null) {
                    arrayList5.add(new com.avito.android.krop.util.a(cVar2, cVarA8));
                }
                cVar2 = cVarA8;
            }
            if (cVar2 != null) {
                arrayList5.add(new com.avito.android.krop.util.a(cVar2, ((com.avito.android.krop.util.a) C42745f0.E(arrayList5)).f174848a));
            }
            ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                com.avito.android.krop.util.a aVar2 = (com.avito.android.krop.util.a) it5.next();
                com.avito.android.krop.util.a aVarC2 = aVar2.c(cVarA);
                float fB4 = aVar2.b();
                com.avito.android.krop.util.c cVar4 = aVar2.f174848a;
                com.avito.android.krop.util.c cVar5 = aVarC2.f174849b;
                float fB5 = new com.avito.android.krop.util.a(cVar4, cVar5).b();
                com.avito.android.krop.util.c cVar6 = aVar2.f174849b;
                float fB6 = new com.avito.android.krop.util.a(cVar6, cVar5).b();
                if (Math.abs((fB5 + fB6) - fB4) >= 1) {
                    if (fB5 > fB6) {
                        cVar4 = cVar6;
                    }
                    cVar5 = cVar4;
                }
                arrayList7.add(cVar5);
            }
            Iterator it6 = arrayList7.iterator();
            if (it6.hasNext()) {
                next2 = it6.next();
                if (it6.hasNext()) {
                    float fB7 = new com.avito.android.krop.util.a((com.avito.android.krop.util.c) next2, cVarA).b();
                    do {
                        Object next4 = it6.next();
                        float fB8 = new com.avito.android.krop.util.a((com.avito.android.krop.util.c) next4, cVarA).b();
                        if (Float.compare(fB7, fB8) > 0) {
                            next2 = next4;
                            fB7 = fB8;
                        }
                    } while (it6.hasNext());
                }
            }
            com.avito.android.krop.util.c cVar7 = (com.avito.android.krop.util.c) next2;
            if (cVar7 != null) {
                this.f174766b.postTranslate(f15 - cVar7.f174850a, f18 - cVar7.f174851b);
            }
        }
    }

    public final com.avito.android.krop.util.d g(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            return null;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float[] fArr = {0.0f, 0.0f, intrinsicWidth, 0.0f, intrinsicWidth, intrinsicHeight, 0.0f, intrinsicHeight};
        matrix.mapPoints(fArr);
        return new com.avito.android.krop.util.d(new com.avito.android.krop.util.c(fArr[0] + getPaddingLeft(), fArr[1] + getPaddingTop()), new com.avito.android.krop.util.c(fArr[2] + getPaddingRight(), fArr[3] + getPaddingTop()), new com.avito.android.krop.util.c(fArr[4] + getPaddingRight(), fArr[5] + getPaddingBottom()), new com.avito.android.krop.util.c(fArr[6] + getPaddingLeft(), fArr[7] + getPaddingBottom()));
    }

    public final float getCurrentZoom() {
        return this.currentZoom;
    }

    @Y61.l
    public final GestureDetector.OnDoubleTapListener getDoubleTapListener() {
        return this.doubleTapListener;
    }

    @Y61.k
    public final RectF getImageBounds$krop_release() {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            return new RectF();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        getImageMatrix().mapRect(rectF2, rectF);
        return new RectF(rectF2);
    }

    @Y61.l
    public final e getImageMoveListener() {
        return this.imageMoveListener;
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final float getF174770f() {
        return this.f174770f;
    }

    /* renamed from: getMinZoom, reason: from getter */
    public final float getF174769e() {
        return this.f174769e;
    }

    /* renamed from: getRotationAngle$krop_release, reason: from getter */
    public final float getRotationAngle() {
        return this.rotationAngle;
    }

    @Override // android.widget.ImageView
    @Y61.k
    public ImageView.ScaleType getScaleType() {
        return this.f174776l;
    }

    @Y61.l
    public final PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        SizeF sizeF = this.f174781q;
        float f12 = 2;
        PointF pointFP = p(sizeF.f174843b / f12, sizeF.f174844c / f12, true);
        pointFP.x /= intrinsicWidth;
        pointFP.y /= intrinsicHeight;
        return pointFP;
    }

    @Y61.k
    public final Transformation getTransformation() {
        com.avito.android.krop.util.c focusOffset = getFocusOffset();
        return new Transformation(this.currentZoom, new PointF(focusOffset.f174850a, focusOffset.f174851b), this.rotationAngle);
    }

    @Y61.l
    public final View.OnTouchListener getUserTouchListener() {
        return this.userTouchListener;
    }

    @Y61.k
    public final RectF getZoomedRect() {
        if (this.f174776l == ImageView.ScaleType.FIT_XY) {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        }
        PointF pointFP = p(0.0f, 0.0f, true);
        SizeF sizeF = this.f174781q;
        PointF pointFP2 = p(sizeF.f174843b, sizeF.f174844c, true);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        return new RectF(pointFP.x / intrinsicWidth, pointFP.y / intrinsicHeight, pointFP2.x / intrinsicWidth, pointFP2.y / intrinsicHeight);
    }

    public final void i() {
        setImageMatrix(this.f174766b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(float f12, @Y61.k ScaleAfterRotationStyle scaleAfterRotationStyle) {
        com.avito.android.krop.util.d currentBounds;
        Y41.l jVar;
        com.avito.android.krop.util.d currentBounds2;
        if (f12 == 0.0f || (currentBounds = getCurrentBounds()) == null) {
            return;
        }
        com.avito.android.krop.util.c cVarA = currentBounds.a();
        Matrix matrix = new Matrix(this.f174766b);
        matrix.postTranslate(-cVarA.f174850a, -cVarA.f174851b);
        matrix.postRotate(f12);
        com.avito.android.krop.util.d dVarG = g(matrix);
        Float f13 = null;
        if (dVarG == null) {
            L.k();
            throw null;
        }
        com.avito.android.krop.util.c cVarA2 = dVarG.a();
        this.f174766b.postTranslate(-this.f174790z.centerX(), -this.f174790z.centerY());
        this.f174766b.postRotate(f12);
        this.f174766b.postTranslate(this.f174790z.centerX() - cVarA2.f174850a, this.f174790z.centerY() - cVarA2.f174851b);
        this.rotationAngle = (this.rotationAngle + f12) % 360;
        int iOrdinal = scaleAfterRotationStyle.ordinal();
        if (iOrdinal == 0) {
            jVar = null;
        } else if (iOrdinal == 1) {
            jVar = new j();
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = new k();
        }
        if (jVar != null && (currentBounds2 = getCurrentBounds()) != null) {
            if (currentBounds2.d(o(this.f174790z))) {
                r();
            } else {
                com.avito.android.krop.util.c cVar = new com.avito.android.krop.util.c(this.f174790z.centerX(), this.f174790z.centerY());
                RectF rectF = this.f174790z;
                float f14 = rectF.left;
                float f15 = rectF.top;
                com.avito.android.krop.util.a aVar = new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f14, f15));
                float f16 = rectF.bottom;
                com.avito.android.krop.util.a aVar2 = new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f14, f16));
                float f17 = rectF.right;
                List<com.avito.android.krop.util.a> listU = C42745f0.U(aVar, aVar2, new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f17, f15)), new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f17, f16)));
                List<com.avito.android.krop.util.a> listB = currentBounds2.b();
                ArrayList arrayList = new ArrayList();
                for (com.avito.android.krop.util.a aVar3 : listU) {
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        com.avito.android.krop.util.c cVarA3 = aVar3.a((com.avito.android.krop.util.a) it.next());
                        if (cVarA3 != null) {
                            arrayList.add(new Q(cVarA3, aVar3));
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Q q12 = (Q) it2.next();
                    arrayList2.add(Float.valueOf(((com.avito.android.krop.util.a) q12.f406620c).b() / new com.avito.android.krop.util.a(cVar, (com.avito.android.krop.util.c) q12.f406619b).b()));
                }
                Float fX2 = C42745f0.X(arrayList2);
                if (fX2 != null && fX2.floatValue() > 1.0f) {
                    f13 = fX2;
                }
                if (f13 != null) {
                    jVar.invoke(Float.valueOf(f13.floatValue()));
                }
            }
        }
        i();
        e eVar = this.imageMoveListener;
        if (eVar != null) {
            eVar.a();
        }
    }

    public final void k() {
        SizeF sizeF = this.f174781q;
        if (sizeF.f174844c == 0.0f || sizeF.f174843b == 0.0f) {
            return;
        }
        this.f174766b.getValues(this.f174773i);
        this.f174767c.setValues(this.f174773i);
        SizeF sizeF2 = this.f174784t;
        SizeF sizeF3 = this.f174783s;
        sizeF2.f174844c = sizeF3.f174844c;
        sizeF2.f174843b = sizeF3.f174843b;
        SizeF sizeF4 = this.f174782r;
        sizeF4.f174844c = sizeF.f174844c;
        sizeF4.f174843b = sizeF.f174843b;
    }

    public final void l(double d12, float f12, float f13, boolean z12) {
        float f14;
        float f15;
        if (z12) {
            f14 = this.f174771g;
            f15 = this.f174772h;
        } else {
            f14 = this.f174769e;
            f15 = this.f174770f;
        }
        float f16 = this.currentZoom;
        float f17 = ((float) d12) * f16;
        this.currentZoom = f17;
        if (f17 > f15) {
            this.currentZoom = f15;
            d12 = f15 / f16;
        } else if (f17 < f14) {
            this.currentZoom = f14;
            d12 = f14 / f16;
        }
        float f18 = (float) d12;
        this.f174766b.postScale(f18, f18, f12, f13);
        e();
    }

    @X41.j
    public final void m(float f12, float f13, float f14, @Y61.k ImageView.ScaleType scaleType) {
        if (!this.f174778n) {
            this.f174779o = new h(f12, f13, f14, scaleType);
            return;
        }
        if (scaleType != this.f174776l) {
            setScaleType(scaleType);
        }
        this.currentZoom = 1.0f;
        d();
        double d12 = f12;
        SizeF sizeF = this.f174781q;
        float f15 = 2;
        l(d12, sizeF.f174843b / f15, sizeF.f174844c / f15, true);
        this.f174766b.getValues(this.f174773i);
        this.f174773i[2] = -((f13 * getImageWidth()) - (sizeF.f174843b / f15));
        this.f174773i[5] = -((f14 * getImageHeight()) - (sizeF.f174844c / f15));
        this.f174766b.setValues(this.f174773i);
        f();
        i();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        this.f174778n = true;
        this.f174777m = true;
        h hVar = this.f174779o;
        if (hVar != null) {
            m(hVar.f174824a, hVar.f174825b, hVar.f174826c, hVar.f174827d);
            this.f174779o = null;
        }
        Transformation transformation = this.f174780p;
        if (transformation != null) {
            setTransformation(transformation);
            this.f174780p = null;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode == Integer.MIN_VALUE) {
            intrinsicWidth = Math.min(intrinsicWidth, size);
        } else if (mode != 0) {
            intrinsicWidth = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            intrinsicHeight = Math.min(intrinsicHeight, size2);
        } else if (mode2 != 0) {
            intrinsicHeight = size2;
        }
        setMeasuredDimension(intrinsicWidth, intrinsicHeight);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.k Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentZoom = savedState.f174791b;
        this.rotationAngle = savedState.f174792c;
        setMaxZoom(savedState.f174793d);
        setMinZoom(savedState.f174794e);
        float[] fArr = savedState.f174795f;
        this.f174773i = fArr;
        this.f174784t = savedState.f174796g;
        this.f174782r = savedState.f174797h;
        this.f174777m = savedState.f174798i;
        this.f174767c.setValues(fArr);
    }

    @Override // android.view.View
    @Y61.k
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        this.f174766b.getValues(this.f174773i);
        return new SavedState(parcelableOnSaveInstanceState, this.currentZoom, this.rotationAngle, getF174770f(), getF174769e(), this.f174773i, this.f174783s, this.f174781q, this.f174777m);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(@Y61.k android.view.MotionEvent r9) {
        /*
            r8 = this;
            android.graphics.RectF r0 = r8.f174790z
            float r1 = r0.left
            float r1 = -r1
            float r0 = r0.top
            float r0 = -r0
            r9.offsetLocation(r1, r0)
            android.view.ScaleGestureDetector r0 = r8.f174785u
            r0.onTouchEvent(r9)
            android.view.GestureDetector r0 = r8.f174786v
            r0.onTouchEvent(r9)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r9.getX()
            float r2 = r9.getY()
            r0.<init>(r1, r2)
            com.avito.android.krop.ZoomableImageView$g r1 = r8.f174768d
            com.avito.android.krop.ZoomableImageView$g r2 = com.avito.android.krop.ZoomableImageView.g.f174818b
            com.avito.android.krop.ZoomableImageView$g r3 = com.avito.android.krop.ZoomableImageView.g.f174819c
            r4 = 1
            if (r1 == r2) goto L31
            if (r1 == r3) goto L31
            com.avito.android.krop.ZoomableImageView$g r5 = com.avito.android.krop.ZoomableImageView.g.f174821e
            if (r1 != r5) goto Lad
        L31:
            int r1 = r9.getAction()
            android.graphics.PointF r5 = r8.f174775k
            if (r1 == 0) goto L8e
            if (r1 == r4) goto L81
            r6 = 2
            if (r1 == r6) goto L42
            r0 = 6
            if (r1 == r0) goto L81
            goto Lad
        L42:
            com.avito.android.krop.ZoomableImageView$g r1 = r8.f174768d
            if (r1 != r3) goto Lad
            float r1 = r0.x
            float r2 = r5.x
            float r1 = r1 - r2
            float r2 = r0.y
            float r3 = r5.y
            float r2 = r2 - r3
            com.avito.android.krop.util.SizeF r3 = r8.f174781q
            float r6 = r3.f174843b
            float r7 = r8.getImageWidth()
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r7 = 0
            if (r6 > 0) goto L5e
            r1 = r7
        L5e:
            float r3 = r3.f174844c
            float r6 = r8.getImageHeight()
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 > 0) goto L69
            r2 = r7
        L69:
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L71
            int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r3 == 0) goto L79
        L71:
            android.graphics.Matrix r3 = r8.f174766b
            r3.postTranslate(r1, r2)
            r8.f()
        L79:
            float r1 = r0.x
            float r0 = r0.y
            r5.set(r1, r0)
            goto Lad
        L81:
            r8.f174768d = r2
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto Lad
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto Lad
        L8e:
            android.view.ViewParent r1 = r8.getParent()
            if (r1 == 0) goto L97
            r1.requestDisallowInterceptTouchEvent(r4)
        L97:
            r5.set(r0)
            com.avito.android.krop.ZoomableImageView$c r0 = r8.f174774j
            if (r0 == 0) goto Lab
            com.avito.android.krop.ZoomableImageView$a r1 = r0.f174812b
            if (r1 == 0) goto Lab
            com.avito.android.krop.ZoomableImageView r0 = com.avito.android.krop.ZoomableImageView.this
            r0.f174768d = r2
            android.widget.OverScroller r0 = r1.f174799a
            r0.forceFinished(r4)
        Lab:
            r8.f174768d = r3
        Lad:
            r8.i()
            android.view.View$OnTouchListener r0 = r8.userTouchListener
            if (r0 == 0) goto Lb7
            r0.onTouch(r8, r9)
        Lb7:
            com.avito.android.krop.ZoomableImageView$e r9 = r8.imageMoveListener
            if (r9 == 0) goto Lbe
            r9.a()
        Lbe:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.krop.ZoomableImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final PointF p(float f12, float f13, boolean z12) {
        this.f174766b.getValues(this.f174773i);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float[] fArr = this.f174773i;
        float f14 = fArr[2];
        float f15 = fArr[5];
        float imageWidth = ((f12 - f14) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f13 - f15) * intrinsicHeight) / getImageHeight();
        if (z12) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    public final void q(float f12, float f13, float f14, float f15, float f16, int i12, int i13) {
        if (f14 < f16) {
            float[] fArr = this.f174773i;
            fArr[i12] = (f16 - (i13 * fArr[0])) * 0.5f;
        } else {
            if (f12 > 0) {
                this.f174773i[i12] = -((f14 - f16) / 2);
                return;
            }
            float f17 = 2;
            this.f174773i[i12] = -(((((f15 / f17) + Math.abs(f12)) / f13) * f14) - (f16 / f17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        com.avito.android.krop.util.d currentBounds = getCurrentBounds();
        if (currentBounds == null || !currentBounds.d(o(this.f174790z))) {
            return;
        }
        l lVar = new l();
        com.avito.android.krop.util.c cVar = new com.avito.android.krop.util.c(this.f174790z.centerX(), this.f174790z.centerY());
        RectF rectF = this.f174790z;
        float f12 = rectF.left;
        float f13 = rectF.top;
        com.avito.android.krop.util.a aVar = new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f12, f13));
        float f14 = rectF.bottom;
        com.avito.android.krop.util.a aVar2 = new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f12, f14));
        float f15 = rectF.right;
        List<com.avito.android.krop.util.a> listU = C42745f0.U(aVar, aVar2, new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f15, f13)), new com.avito.android.krop.util.a(cVar, new com.avito.android.krop.util.c(f15, f14)));
        ArrayList arrayList = new ArrayList(C42745f0.q(listU, 10));
        for (com.avito.android.krop.util.a aVar3 : listU) {
            arrayList.add(new Q(aVar3.f174849b, new com.avito.android.krop.util.a(aVar3.f174848a, lVar.invoke(aVar3))));
        }
        List<com.avito.android.krop.util.a> listB = currentBounds.b();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            com.avito.android.krop.util.c cVar2 = (com.avito.android.krop.util.c) q12.f406619b;
            com.avito.android.krop.util.a aVar4 = (com.avito.android.krop.util.a) q12.f406620c;
            Iterator<T> it2 = listB.iterator();
            while (it2.hasNext()) {
                com.avito.android.krop.util.c cVarA = aVar4.a((com.avito.android.krop.util.a) it2.next());
                if (cVarA != null) {
                    arrayList2.add(new Q(cVar2, new com.avito.android.krop.util.a(cVar, cVarA)));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Q q13 = (Q) it3.next();
            arrayList3.add(Float.valueOf(((com.avito.android.krop.util.a) q13.f406620c).b() / new com.avito.android.krop.util.a(cVar, (com.avito.android.krop.util.c) q13.f406619b).b()));
        }
        Float fB02 = C42745f0.b0(arrayList3);
        Float f16 = null;
        if (fB02 != null) {
            if (fB02.floatValue() <= 1.0f) {
                fB02 = null;
            }
            f16 = fB02;
        }
        if (f16 != null) {
            setMinZoom(Math.max(this.currentZoom / f16.floatValue(), 1.0f));
        }
    }

    public final void setDoubleTapListener(@Y61.l GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.doubleTapListener = onDoubleTapListener;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Y61.k Bitmap bm) {
        super.setImageBitmap(bm);
        k();
        d();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Y61.l Drawable drawable) {
        super.setImageDrawable(drawable);
        k();
        d();
    }

    public final void setImageMoveListener(@Y61.l e eVar) {
        this.imageMoveListener = eVar;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        k();
        d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Y61.l Uri uri) {
        super.setImageURI(uri);
        k();
        d();
    }

    public final void setMaxZoom(float f12) {
        this.f174770f = f12;
        this.f174772h = f12 * 1.25f;
    }

    public final void setMinZoom(float f12) {
        this.f174769e = f12;
        this.f174771g = f12 * 0.75f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Y61.k ImageView.ScaleType type) {
        if (type == ImageView.ScaleType.FIT_START || type == ImageView.ScaleType.FIT_END) {
            throw new UnsupportedOperationException("ZoomableImageView does not support FIT_START or FIT_END");
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (type == scaleType) {
            super.setScaleType(scaleType);
            return;
        }
        this.f174776l = type;
        if (this.f174778n) {
            setZoom(this);
        }
    }

    public final void setTransformation(@Y61.k Transformation transformation) {
        if (!this.f174778n) {
            this.f174780p = transformation;
            return;
        }
        m(transformation.f174845b, 0.5f, 0.5f, this.f174776l);
        j(transformation.f174847d, ScaleAfterRotationStyle.f174840c);
        PointF pointF = transformation.f174846c;
        this.f174766b.postTranslate(pointF.x, pointF.y);
        i();
    }

    public final void setUserTouchListener(@Y61.l View.OnTouchListener onTouchListener) {
        this.userTouchListener = onTouchListener;
    }

    @X41.j
    public final void setZoom(float f12) {
        m(f12, 0.5f, 0.5f, this.f174776l);
    }

    public final void setZoom(@Y61.k ZoomableImageView img) {
        PointF scrollPosition = img.getScrollPosition();
        if (scrollPosition != null) {
            m(img.currentZoom, scrollPosition.x, scrollPosition.y, img.getScaleType());
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$SavedState;", "Landroid/view/View$BaseSavedState;", "b", "krop_release"}, k = 1, mv = {1, 4, 0})
    public static final class SavedState extends View.BaseSavedState {

        @X41.f
        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public final float f174791b;

        /* renamed from: c, reason: collision with root package name */
        public final float f174792c;

        /* renamed from: d, reason: collision with root package name */
        public final float f174793d;

        /* renamed from: e, reason: collision with root package name */
        public final float f174794e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final float[] f174795f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final SizeF f174796g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final SizeF f174797h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f174798i;

        /* compiled from: ZoomableImageView.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/krop/ZoomableImageView$SavedState$a", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/krop/ZoomableImageView$SavedState;", "krop_release"}, k = 1, mv = {1, 4, 0})
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        /* compiled from: ZoomableImageView.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$SavedState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/krop/ZoomableImageView$SavedState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "krop_release"}, k = 1, mv = {1, 4, 0})
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }
        }

        static {
            new b(null);
            CREATOR = new a();
        }

        public SavedState(@Y61.k Parcelable parcelable, float f12, float f13, float f14, float f15, @Y61.k float[] fArr, @Y61.k SizeF sizeF, @Y61.k SizeF sizeF2, boolean z12) {
            super(parcelable);
            this.f174791b = f12;
            this.f174792c = f13;
            this.f174793d = f14;
            this.f174794e = f15;
            this.f174795f = fArr;
            this.f174796g = sizeF;
            this.f174797h = sizeF2;
            this.f174798i = z12;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeFloat(this.f174791b);
            parcel.writeFloat(this.f174792c);
            parcel.writeFloat(this.f174793d);
            parcel.writeFloat(this.f174794e);
            parcel.writeFloatArray(this.f174795f);
            parcel.writeParcelable(this.f174796g, i12);
            parcel.writeParcelable(this.f174797h, i12);
            parcel.writeInt(this.f174798i ? 1 : 0);
        }

        public SavedState(@Y61.k Parcel parcel) {
            super(parcel);
            this.f174791b = parcel.readFloat();
            this.f174792c = parcel.readFloat();
            this.f174793d = parcel.readFloat();
            this.f174794e = parcel.readFloat();
            this.f174795f = parcel.createFloatArray();
            this.f174796g = (SizeF) parcel.readParcelable(SizeF.class.getClassLoader());
            this.f174797h = (SizeF) parcel.readParcelable(SizeF.class.getClassLoader());
            this.f174798i = parcel.readInt() == 1;
        }
    }

    /* compiled from: ZoomableImageView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/ZoomableImageView$b;", "Ljava/lang/Runnable;", "krop_release"}, k = 1, mv = {1, 4, 0})
    public final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final long f174800b;

        /* renamed from: c, reason: collision with root package name */
        public final float f174801c;

        /* renamed from: d, reason: collision with root package name */
        public final float f174802d;

        /* renamed from: e, reason: collision with root package name */
        public final float f174803e;

        /* renamed from: f, reason: collision with root package name */
        public final AccelerateDecelerateInterpolator f174804f;

        /* renamed from: g, reason: collision with root package name */
        public final PointF f174805g;

        /* renamed from: h, reason: collision with root package name */
        public final PointF f174806h;

        /* renamed from: i, reason: collision with root package name */
        public final float f174807i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f174808j;

        /* renamed from: k, reason: collision with root package name */
        public final float f174809k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f174810l;

        public b(float f12, float f13, float f14, boolean z12, float f15, boolean z13) {
            this.f174807i = f12;
            this.f174808j = z12;
            this.f174809k = f15;
            this.f174810l = z13;
            this.f174804f = new AccelerateDecelerateInterpolator();
            ZoomableImageView.this.f174768d = g.f174822f;
            this.f174800b = System.currentTimeMillis();
            this.f174801c = ZoomableImageView.this.getCurrentZoom();
            PointF pointFP = ZoomableImageView.this.p(f13, f14, false);
            float f16 = pointFP.x;
            this.f174802d = f16;
            float f17 = pointFP.y;
            this.f174803e = f17;
            this.f174805g = ZoomableImageView.c(ZoomableImageView.this, f16, f17);
            SizeF sizeF = ZoomableImageView.this.f174781q;
            float f18 = 2;
            this.f174806h = new PointF(sizeF.f174843b / f18, sizeF.f174844c / f18);
        }

        @Override // java.lang.Runnable
        public final void run() {
            float interpolation = this.f174804f.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.f174800b) / this.f174809k));
            float f12 = this.f174807i;
            float f13 = this.f174801c;
            double dC2 = r.c(f12, f13, interpolation, f13);
            ZoomableImageView zoomableImageView = ZoomableImageView.this;
            double currentZoom = dC2 / zoomableImageView.getCurrentZoom();
            ZoomableImageView.this.l(currentZoom, this.f174802d, this.f174803e, this.f174808j);
            boolean z12 = Math.abs(currentZoom - ((double) 1.0f)) < ((double) 0.001f);
            boolean z13 = this.f174810l;
            boolean z14 = !z13 && z12;
            float f14 = z14 ? 1 - interpolation : 1.0f;
            PointF pointF = this.f174805g;
            float f15 = pointF.x;
            PointF pointF2 = this.f174806h;
            float fC2 = r.c(pointF2.x, f15, interpolation, f15);
            float f16 = pointF.y;
            float fC3 = r.c(pointF2.y, f16, interpolation, f16);
            PointF pointFC = ZoomableImageView.c(zoomableImageView, this.f174802d, this.f174803e);
            zoomableImageView.f174766b.postTranslate((fC2 - pointFC.x) * f14, (fC3 - pointFC.y) * f14);
            boolean z15 = interpolation >= ((float) 1);
            if (z13 || (z14 && z15)) {
                zoomableImageView.e();
            }
            zoomableImageView.i();
            e imageMoveListener = zoomableImageView.getImageMoveListener();
            if (imageMoveListener != null) {
                imageMoveListener.a();
            }
            if (z15) {
                zoomableImageView.f174768d = g.f174818b;
            } else {
                zoomableImageView.postOnAnimation(this);
            }
        }

        public /* synthetic */ b(ZoomableImageView zoomableImageView, float f12, float f13, float f14, boolean z12, float f15, boolean z13, int i12, C42822w c42822w) {
            this(f12, f13, f14, z12, (i12 & 16) != 0 ? 300.0f : f15, (i12 & 32) != 0 ? true : z13);
        }
    }
}
