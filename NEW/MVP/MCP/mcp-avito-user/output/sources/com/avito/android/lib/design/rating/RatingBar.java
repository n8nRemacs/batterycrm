package com.avito.android.lib.design.rating;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingBar.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001SJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004\"\u0004\b\u0013\u0010\u000eR*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0004\"\u0004\b\u0017\u0010\u000eR*\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\u000eR.\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0004\"\u0004\b1\u0010\u000eR\"\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0004\"\u0004\b5\u0010\u000eR\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0004\"\u0004\b9\u0010\u000eR*\u0010>\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0011\u001a\u0004\b<\u0010\u0004\"\u0004\b=\u0010\u000eR\"\u0010B\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010N\u001a\u00020C2\u0006\u0010\u000f\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u0014\u0010P\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0004R\u0014\u0010R\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0004¨\u0006T"}, d2 = {"Lcom/avito/android/lib/design/rating/RatingBar;", "Landroid/view/View;", "", "getSuggestedMinimumHeight", "()I", "getSuggestedMinimumWidth", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "setSelectedDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setUnselectedDrawable", "color", "setBackgroundColor", "(I)V", "value", "b", "I", "getRatingBackgroundColor", "setRatingBackgroundColor", "ratingBackgroundColor", "c", "getSelectedColor", "setSelectedColor", "selectedColor", "d", "getUnselectedColor", "setUnselectedColor", "unselectedColor", "Lcom/avito/android/lib/design/rating/RatingBar$a;", "e", "Lcom/avito/android/lib/design/rating/RatingBar$a;", "getListener", "()Lcom/avito/android/lib/design/rating/RatingBar$a;", "setListener", "(Lcom/avito/android/lib/design/rating/RatingBar$a;)V", "listener", "", "f", "Z", "isClickEnabled", "()Z", "setClickEnabled", "(Z)V", "g", "isIndicator", "setIndicator", "h", "getDividerWidthPx", "setDividerWidthPx", "dividerWidthPx", "i", "getStarWidth", "setStarWidth", "starWidth", "j", "getStarHeight", "setStarHeight", "starHeight", "k", "getNumStars", "setNumStars", "numStars", "l", "getFloatingRatingIsEnabled", "setFloatingRatingIsEnabled", "floatingRatingIsEnabled", "", "m", "F", "getDefaultRating", "()F", "setDefaultRating", "(F)V", "defaultRating", "n", "getRating", "setRating", "rating", "getDesiredWidth", "desiredWidth", "getDesiredHeight", "desiredHeight", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RatingBar extends View {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int ratingBackgroundColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int selectedColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int unselectedColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public a listener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isClickEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isIndicator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int dividerWidthPx;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int starWidth;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int starHeight;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int numStars;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean floatingRatingIsEnabled;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float defaultRating;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float rating;

    /* renamed from: o, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.rating.a f180162o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f180163p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public Drawable f180164q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public Drawable f180165r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public Rect[] f180166s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final GestureDetector f180167t;

    /* compiled from: RatingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/rating/RatingBar$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(int i12);
    }

    @j
    public RatingBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static int b(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i12, size) : i12;
    }

    private final int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
    }

    private final int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
    }

    public final void a() {
        Rect rect;
        this.f180162o = null;
        float f12 = 2;
        int iB2 = kotlin.math.b.b(this.rating * f12);
        int i12 = iB2 / 2;
        if (!this.floatingRatingIsEnabled || iB2 % 2 == 0 || (rect = (Rect) C42756l.F(i12, this.f180166s)) == null) {
            return;
        }
        float f13 = rect.right - rect.left;
        Path path = new Path();
        float f14 = rect.left;
        float f15 = f13 / f12;
        float f16 = rect.bottom;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(f14, rect.top, f14 + f15, f16, direction);
        Path path2 = new Path();
        float f17 = rect.left;
        path2.addRect(f17 + f15, rect.top, f17 + f13, rect.bottom, direction);
        this.f180162o = new com.avito.android.lib.design.rating.a(i12, path, path2);
    }

    public final float getDefaultRating() {
        return this.defaultRating;
    }

    public final int getDividerWidthPx() {
        return this.dividerWidthPx;
    }

    public final boolean getFloatingRatingIsEnabled() {
        return this.floatingRatingIsEnabled;
    }

    @l
    public final a getListener() {
        return this.listener;
    }

    public final int getNumStars() {
        return this.numStars;
    }

    public final float getRating() {
        return this.rating;
    }

    public final int getRatingBackgroundColor() {
        return this.ratingBackgroundColor;
    }

    public final int getSelectedColor() {
        return this.selectedColor;
    }

    public final int getStarHeight() {
        return this.starHeight;
    }

    public final int getStarWidth() {
        return this.starWidth;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int i12 = this.starHeight;
        return i12 != 0 ? i12 : super.getSuggestedMinimumHeight();
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i12 = this.starWidth;
        if (i12 == 0) {
            return super.getSuggestedMinimumWidth();
        }
        int i13 = this.numStars;
        return H.b(i13, 1, this.dividerWidthPx, i12 * i13);
    }

    public final int getUnselectedColor() {
        return this.unselectedColor;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        Drawable background = getBackground();
        if (background != null) {
            background.setBounds(0, 0, getWidth(), getHeight());
            background.draw(canvas);
        }
        com.avito.android.lib.design.rating.a aVar = this.f180162o;
        int iB2 = kotlin.math.b.b(this.rating * 2) / 2;
        int i12 = this.numStars;
        for (int i13 = 0; i13 < i12; i13++) {
            Rect rect = this.f180166s[i13];
            int iMin = Math.min(rect.width(), rect.height());
            int iWidth = (rect.width() - iMin) / 2;
            int iHeight = (rect.height() - iMin) / 2;
            int i14 = rect.left + iWidth;
            int i15 = rect.top + iHeight;
            int i16 = rect.right - iWidth;
            int i17 = rect.bottom - iHeight;
            if ((i13 == 0 && this.rating > 0.0f && iB2 <= 1) || i13 < iB2) {
                Drawable drawable = this.f180164q;
                drawable.setBounds(i14, i15, i16, i17);
                drawable.draw(canvas);
            } else if (aVar == null || aVar.f180168a != i13) {
                Drawable drawable2 = this.f180165r;
                drawable2.setBounds(i14, i15, i16, i17);
                drawable2.draw(canvas);
            } else {
                Drawable drawable3 = this.f180164q;
                Path path = aVar.f180169b;
                canvas.save();
                canvas.clipPath(path);
                drawable3.setBounds(i14, i15, i16, i17);
                drawable3.draw(canvas);
                canvas.restore();
                Drawable drawable4 = this.f180165r;
                Path path2 = aVar.f180170c;
                canvas.save();
                canvas.clipPath(path2);
                drawable4.setBounds(i14, i15, i16, i17);
                drawable4.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        int iB2 = b(getDesiredWidth(), i12);
        int iB3 = b(getDesiredHeight(), i13);
        if (iB2 == 0 && iB3 == 0) {
            setMinimumHeight(this.f180165r.getMinimumHeight());
            setMinimumWidth((int) ((getMinimumHeight() * this.numStars) + ((r1 - 1) * this.dividerWidthPx)));
        } else if (iB2 > 0 && iB3 == 0) {
            int i14 = this.dividerWidthPx;
            setMinimumHeight((int) ((iB2 - ((r2 - 1) * i14)) / this.numStars));
        } else if (iB2 == 0 && iB3 > 0) {
            setMinimumWidth((int) ((iB3 * this.numStars) + ((r1 - 1) * this.dividerWidthPx)));
        }
        int iB4 = b(getDesiredWidth(), i12);
        int iB5 = b(getDesiredHeight(), i13);
        setMeasuredDimension(iB4, getPaddingBottom() + getPaddingTop() + iB5);
        float f12 = iB4;
        float f13 = iB5;
        float f14 = (this.numStars * f13) + ((r0 - 1) * this.dividerWidthPx);
        Float fValueOf = Float.valueOf(f14);
        if (f14 > f12) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : f12;
        RectF rectF = new RectF(0.0f, 0.0f, fFloatValue / this.numStars, f13);
        float f15 = 2;
        float fWidth = (f12 / f15) - (fFloatValue / f15);
        float fHeight = ((f13 / f15) - (rectF.height() / f15)) + getPaddingTop();
        int i15 = this.numStars;
        for (int i16 = 0; i16 < i15; i16++) {
            this.f180166s[i16].set((int) fWidth, (int) fHeight, (int) (rectF.width() + fWidth), ((int) (rectF.height() + fHeight)) - getPaddingBottom());
            fWidth += rectF.width();
        }
        a();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        boolean z12;
        a aVar;
        if (!this.isClickEnabled) {
            return super.onTouchEvent(motionEvent);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i12 = 0;
        if (this.isIndicator) {
            return false;
        }
        int x12 = (int) motionEvent.getX();
        int y12 = (int) motionEvent.getY();
        Rect[] rectArr = this.f180166s;
        int length = rectArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                z12 = false;
                break;
            }
            if (rectArr[i13].contains(x12, y12)) {
                z12 = true;
                break;
            }
            i13++;
        }
        boolean z13 = this.f180163p;
        if (!z13 || z12) {
            int x13 = (int) motionEvent.getX();
            motionEvent.getY();
            Rect[] rectArr2 = this.f180166s;
            int length2 = rectArr2.length;
            while (true) {
                if (i12 >= length2) {
                    i12 = -1;
                    break;
                }
                Rect rect = rectArr2[i12];
                if (rect.contains(x13, rect.centerY())) {
                    break;
                }
                i12++;
            }
            float f12 = i12 + 1;
            Float fValueOf = Float.valueOf(f12);
            if (f12 <= 0.0f || f12 == this.rating) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                setRating(fValueOf.floatValue());
            }
        } else {
            float f13 = this.rating;
            float f14 = this.defaultRating;
            if (f13 != f14) {
                setRating(f14);
            }
        }
        if (this.f180167t.onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && ((!z13 || z12) && (aVar = this.listener) != null)) {
            aVar.a((int) this.rating);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(color);
        setRatingBackgroundColor(color);
    }

    public final void setClickEnabled(boolean z12) {
        this.isClickEnabled = z12;
    }

    public final void setDefaultRating(float f12) {
        this.defaultRating = f12;
    }

    public final void setDividerWidthPx(int i12) {
        this.dividerWidthPx = i12;
    }

    public final void setFloatingRatingIsEnabled(boolean z12) {
        this.floatingRatingIsEnabled = z12;
    }

    public final void setIndicator(boolean z12) {
        this.isIndicator = z12;
    }

    public final void setListener(@l a aVar) {
        this.listener = aVar;
        if (aVar != null) {
            this.isIndicator = false;
        }
    }

    public final void setNumStars(int i12) {
        this.numStars = i12;
        Rect[] rectArr = new Rect[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            rectArr[i13] = new Rect();
        }
        this.f180166s = rectArr;
        requestLayout();
    }

    public final void setRating(float f12) {
        if (!this.floatingRatingIsEnabled) {
            f12 = kotlin.math.b.b(f12);
        }
        boolean z12 = this.rating == f12;
        this.rating = f12;
        if (!z12) {
            a();
            invalidate();
        }
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a((int) this.rating);
        }
    }

    public final void setRatingBackgroundColor(int i12) {
        this.f180165r.setColorFilter(c.a(this.unselectedColor, i12));
        this.ratingBackgroundColor = i12;
    }

    public final void setSelectedColor(int i12) {
        this.f180164q.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_ATOP));
        this.selectedColor = i12;
    }

    public final void setSelectedDrawable(@k Drawable drawable) {
        this.f180164q = drawable.mutate();
        setSelectedColor(this.selectedColor);
    }

    public final void setStarHeight(int i12) {
        this.starHeight = i12;
    }

    public final void setStarWidth(int i12) {
        this.starWidth = i12;
    }

    public final void setUnselectedColor(int i12) {
        this.f180165r.setColorFilter(c.a(i12, this.ratingBackgroundColor));
        this.unselectedColor = i12;
    }

    public final void setUnselectedDrawable(@k Drawable drawable) {
        this.f180165r = drawable.mutate();
        setUnselectedColor(this.unselectedColor);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RatingBar(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.selectedColor = C35835l0.d(R.attr.orange, context);
        this.unselectedColor = C35835l0.d(R.attr.warmGray12, context);
        this.isClickEnabled = true;
        this.isIndicator = true;
        this.numStars = 5;
        this.f180164q = context.getDrawable(R.drawable.design_rating_star_large).mutate();
        this.f180165r = context.getDrawable(R.drawable.design_rating_star_large).mutate();
        int i14 = this.numStars;
        Rect[] rectArr = new Rect[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            rectArr[i15] = new Rect();
        }
        this.f180166s = rectArr;
        this.f180167t = new GestureDetector(context, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178993s0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        if (drawable != null) {
            setSelectedDrawable(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(6);
        if (drawable2 != null) {
            setUnselectedDrawable(drawable2);
        }
        setRatingBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, this.ratingBackgroundColor));
        setSelectedColor(typedArrayObtainStyledAttributes.getColor(7, this.selectedColor));
        setUnselectedColor(typedArrayObtainStyledAttributes.getColor(10, this.unselectedColor));
        this.isIndicator = typedArrayObtainStyledAttributes.getBoolean(3, this.isIndicator);
        this.dividerWidthPx = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.dividerWidthPx);
        setNumStars(typedArrayObtainStyledAttributes.getInteger(4, this.numStars));
        this.f180163p = typedArrayObtainStyledAttributes.getBoolean(2, this.f180163p);
        this.defaultRating = typedArrayObtainStyledAttributes.getFloat(5, this.rating);
        this.starHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, this.starHeight);
        this.starWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, this.starWidth);
        setRating(this.defaultRating);
        typedArrayObtainStyledAttributes.recycle();
    }
}
