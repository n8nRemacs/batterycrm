package com.avito.android.krop;

import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.krop.ZoomableImageView;
import com.avito.android.krop.e;
import com.avito.android.krop.h;
import com.avito.android.krop.util.SizeF;
import com.avito.android.krop.util.Transformation;
import j.D;
import j.l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: KropView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0002()B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/avito/android/krop/KropView;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/krop/e$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Q;", "Landroid/graphics/RectF;", "", "getCropRect", "()Lkotlin/Q;", "scale", "Lkotlin/G0;", "setZoom", "(F)V", "setMaxScale", "setMinScale", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "Lcom/avito/android/krop/util/Transformation;", "transformation", "setTransformation", "(Lcom/avito/android/krop/util/Transformation;)V", "getTransformation", "()Lcom/avito/android/krop/util/Transformation;", "getCroppedBitmap", "()Landroid/graphics/Bitmap;", "Lcom/avito/android/krop/KropView$a;", "l", "Lcom/avito/android/krop/KropView$a;", "getTransformationListener", "()Lcom/avito/android/krop/KropView$a;", "setTransformationListener", "(Lcom/avito/android/krop/KropView$a;)V", "transformationListener", "SavedState", "a", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class KropView extends FrameLayout implements e.a {

    /* renamed from: b, reason: collision with root package name */
    public final RectF f174746b;

    /* renamed from: c, reason: collision with root package name */
    public int f174747c;

    /* renamed from: d, reason: collision with root package name */
    public int f174748d;

    /* renamed from: e, reason: collision with root package name */
    public int f174749e;

    /* renamed from: f, reason: collision with root package name */
    public int f174750f;

    /* renamed from: g, reason: collision with root package name */
    public int f174751g;

    /* renamed from: h, reason: collision with root package name */
    @D
    public final int f174752h;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f174753i;

    /* renamed from: j, reason: collision with root package name */
    public final ZoomableImageView f174754j;

    /* renamed from: k, reason: collision with root package name */
    public e f174755k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    public a transformationListener;

    /* compiled from: KropView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/KropView$a;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void a();
    }

    public KropView(@Y61.k Context context, @Y61.k AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.f174746b = new RectF();
        this.f174748d = 1;
        this.f174749e = 1;
        TypedArray typedArray = null;
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c.f174837a);
            try {
                this.f174747c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, this.f174747c);
                this.f174748d = typedArrayObtainStyledAttributes.getInteger(0, this.f174748d);
                this.f174749e = typedArrayObtainStyledAttributes.getInteger(1, this.f174749e);
                this.f174751g = typedArrayObtainStyledAttributes.getInteger(5, this.f174751g);
                this.f174750f = typedArrayObtainStyledAttributes.getColor(4, this.f174750f);
                this.f174752h = typedArrayObtainStyledAttributes.getResourceId(3, this.f174752h);
                typedArrayObtainStyledAttributes.recycle();
                ZoomableImageView zoomableImageView = new ZoomableImageView(context);
                this.f174754j = zoomableImageView;
                zoomableImageView.setImageMoveListener(new b(this));
                addView(this.f174754j);
                int i12 = this.f174751g;
                this.f174751g = i12;
                this.f174755k = i12 != 0 ? new RectOverlay(getContext(), null, 2, null) : new OvalOverlay(getContext(), null, 2, null);
                c();
            } catch (Throwable th2) {
                th = th2;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final Q<RectF, Float> getCropRect() {
        RectF rectF = new RectF();
        if (this.f174753i == null) {
            return new Q<>(rectF, Float.valueOf(1.0f));
        }
        RectF imageBounds$krop_release = this.f174754j.getImageBounds$krop_release();
        float width = r1.getWidth() / imageBounds$krop_release.width();
        rectF.left = (-imageBounds$krop_release.left) * width;
        rectF.top = (-imageBounds$krop_release.top) * width;
        float f12 = -imageBounds$krop_release.left;
        RectF rectF2 = this.f174746b;
        rectF.right = (rectF2.width() + f12) * width;
        rectF.bottom = (rectF2.height() + (-imageBounds$krop_release.top)) * width;
        return new Q<>(rectF, Float.valueOf(width));
    }

    @Override // com.avito.android.krop.e.a
    public final void a() {
        float f12;
        float f13;
        int measuredWidth = this.f174755k.getMeasuredWidth();
        int measuredHeight = this.f174755k.getMeasuredHeight();
        RectF rectF = this.f174746b;
        int i12 = this.f174747c;
        int i13 = this.f174748d;
        int i14 = this.f174749e;
        float f14 = measuredWidth;
        float f15 = f14 * 0.5f;
        float f16 = measuredHeight;
        float f17 = 0.5f * f16;
        float f18 = i12 * 2.0f;
        float f19 = f14 - f18;
        float f22 = f16 - f18;
        if (f19 < f22) {
            f13 = (i14 * f19) / i13;
            f12 = f19;
        } else {
            f12 = f19 > f22 ? (i13 * f22) / i14 : f19;
            f13 = f22;
        }
        float f23 = (f19 * f13) / f12;
        if (f23 > f22) {
            f19 = (f12 * f22) / f13;
        } else {
            f22 = f23;
        }
        float f24 = 2;
        float f25 = f19 / f24;
        rectF.left = f15 - f25;
        float f26 = f22 / f24;
        rectF.top = f17 - f26;
        rectF.right = f15 + f25;
        rectF.bottom = f17 + f26;
        this.f174755k.f174835d = rectF;
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(this.f174755k.getLeft() - getLeft(), this.f174755k.getTop() - getTop());
        ZoomableImageView zoomableImageView = this.f174754j;
        zoomableImageView.f174790z = rectF2;
        float fWidth = rectF2.width();
        SizeF sizeF = zoomableImageView.f174781q;
        sizeF.f174843b = fWidth;
        sizeF.f174844c = zoomableImageView.f174790z.height();
        RectF rectF3 = zoomableImageView.f174790z;
        int i15 = (int) rectF3.left;
        int i16 = (int) rectF3.top;
        zoomableImageView.setPadding(i15, i16, i15, i16);
        zoomableImageView.d();
        this.f174754j.requestLayout();
        invalidate();
    }

    public final void b(int i12, int i13) {
        this.f174748d = i12;
        this.f174749e = i13;
        this.f174755k.requestLayout();
        ZoomableImageView zoomableImageView = this.f174754j;
        zoomableImageView.currentZoom = 1.0f;
        zoomableImageView.d();
        invalidate();
    }

    public final void c() {
        this.f174755k.setOverlayColor(this.f174750f);
        if (getChildCount() > 1) {
            removeViewAt(1);
        }
        if (this.f174755k.getParent() == null) {
            addView(this.f174755k, 1);
        }
        this.f174755k.setMeasureListener(this);
    }

    @l
    @l0
    public final Bitmap getCroppedBitmap() {
        Q<RectF, Float> cropRect = getCropRect();
        RectF rectF = cropRect.f406619b;
        float fFloatValue = cropRect.f406620c.floatValue();
        Bitmap bitmap = this.f174753i;
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix(this.f174754j.getImageMatrix());
        matrix.postScale(fFloatValue, fFloatValue);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    @Y61.k
    public final Transformation getTransformation() {
        return this.f174754j.getTransformation();
    }

    @l
    public final a getTransformationListener() {
        return this.transformationListener;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.f174754j.invalidate();
        this.f174755k.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f174752h != 0) {
            View viewFindViewById = getRootView().findViewById(this.f174752h);
            if (!(viewFindViewById instanceof e)) {
                viewFindViewById = null;
            }
            e eVar = (e) viewFindViewById;
            if (eVar == null) {
                throw new IllegalStateException("Overlay should instantiate OverlayView class");
            }
            this.f174751g = -1;
            this.f174755k = eVar;
            c();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Y61.k Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f174747c = savedState.f174757b;
        this.f174748d = savedState.f174758c;
        this.f174749e = savedState.f174759d;
        this.f174750f = savedState.f174760e;
        this.f174751g = savedState.f174761f;
        this.f174754j.onRestoreInstanceState(savedState.f174762g);
        this.f174755k.setOverlayColor(this.f174750f);
    }

    @Override // android.view.View
    @Y61.k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f174747c, this.f174748d, this.f174749e, this.f174750f, this.f174751g, (ZoomableImageView.SavedState) this.f174754j.onSaveInstanceState());
    }

    public final void setBitmap(@Y61.k Bitmap bitmap) {
        this.f174753i = bitmap;
        this.f174754j.setImageBitmap(bitmap);
    }

    public final void setMaxScale(float scale) {
        this.f174754j.setMaxZoom(scale);
    }

    public final void setMinScale(float scale) {
        this.f174754j.setMinZoom(scale);
    }

    public final void setTransformation(@Y61.k Transformation transformation) {
        this.f174754j.setTransformation(transformation);
    }

    public final void setTransformationListener(@l a aVar) {
        this.transformationListener = aVar;
    }

    public final void setZoom(float scale) {
        ZoomableImageView zoomableImageView = this.f174754j;
        zoomableImageView.m(scale, 0.5f, 0.5f, zoomableImageView.f174776l);
    }

    /* compiled from: KropView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/krop/KropView$SavedState;", "Landroid/view/View$BaseSavedState;", "CREATOR", "a", "krop_release"}, k = 1, mv = {1, 4, 0})
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        public final int f174757b;

        /* renamed from: c, reason: collision with root package name */
        public final int f174758c;

        /* renamed from: d, reason: collision with root package name */
        public final int f174759d;

        /* renamed from: e, reason: collision with root package name */
        public final int f174760e;

        /* renamed from: f, reason: collision with root package name */
        public final int f174761f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Parcelable f174762g;

        /* compiled from: KropView.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/krop/KropView$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/krop/KropView$SavedState;", "<init>", "()V", "krop_release"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.avito.android.krop.KropView$SavedState$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public Companion() {
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        public SavedState(@Y61.k Parcelable parcelable, int i12, int i13, int i14, int i15, int i16, @Y61.k ZoomableImageView.SavedState savedState) {
            super(parcelable);
            this.f174757b = i12;
            this.f174758c = i13;
            this.f174759d = i14;
            this.f174760e = i15;
            this.f174761f = i16;
            this.f174762g = savedState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f174757b);
            parcel.writeInt(this.f174758c);
            parcel.writeInt(this.f174759d);
            parcel.writeInt(this.f174760e);
            parcel.writeInt(this.f174761f);
            parcel.writeParcelable(this.f174762g, i12);
        }

        public SavedState(@Y61.k Parcel parcel) {
            super(parcel);
            this.f174757b = parcel.readInt();
            this.f174758c = parcel.readInt();
            this.f174759d = parcel.readInt();
            this.f174760e = parcel.readInt();
            this.f174761f = parcel.readInt();
            this.f174762g = parcel.readParcelable(SavedState.class.getClassLoader());
        }
    }
}
