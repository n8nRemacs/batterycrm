package ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import j.InterfaceC42156l;
import j.N;
import j.P;
import ru.tinkoff.scrollingpagerindicator.b;

/* loaded from: classes9.dex */
public class ScrollingPagerIndicator extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f437109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f437110c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437111d;

    /* renamed from: e, reason: collision with root package name */
    public final int f437112e;

    /* renamed from: f, reason: collision with root package name */
    public final int f437113f;

    /* renamed from: g, reason: collision with root package name */
    public int f437114g;

    /* renamed from: h, reason: collision with root package name */
    public int f437115h;

    /* renamed from: i, reason: collision with root package name */
    public int f437116i;

    /* renamed from: j, reason: collision with root package name */
    public float f437117j;

    /* renamed from: k, reason: collision with root package name */
    public float f437118k;

    /* renamed from: l, reason: collision with root package name */
    public float f437119l;

    /* renamed from: m, reason: collision with root package name */
    public SparseArray<Float> f437120m;

    /* renamed from: n, reason: collision with root package name */
    public int f437121n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f437122o;

    /* renamed from: p, reason: collision with root package name */
    public final ArgbEvaluator f437123p;

    /* renamed from: q, reason: collision with root package name */
    @InterfaceC42156l
    public int f437124q;

    /* renamed from: r, reason: collision with root package name */
    @InterfaceC42156l
    public int f437125r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f437126s;

    /* renamed from: t, reason: collision with root package name */
    public Runnable f437127t;

    /* renamed from: u, reason: collision with root package name */
    public e f437128u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f437129v;

    public @interface a {
    }

    public interface b<T> {
    }

    public ScrollingPagerIndicator(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.scrollingPagerIndicatorStyle);
        this.f437123p = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.d.f437130a, R.attr.scrollingPagerIndicatorStyle, R.style.ScrollingPagerIndicator);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.f437124q = color;
        this.f437125r = typedArrayObtainStyledAttributes.getColor(2, color);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f437111d = dimensionPixelSize;
        this.f437112e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.f437110c = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : -1;
        this.f437113f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0) + dimensionPixelSize;
        this.f437126s = typedArrayObtainStyledAttributes.getBoolean(6, false);
        int i12 = typedArrayObtainStyledAttributes.getInt(8, 0);
        setVisibleDotCount(i12);
        this.f437115h = typedArrayObtainStyledAttributes.getInt(9, 2);
        this.f437116i = typedArrayObtainStyledAttributes.getInt(7, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f437122o = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i12);
            d(0.0f, i12 / 2);
        }
    }

    private int getDotCount() {
        return (!this.f437126s || this.f437121n <= this.f437114g) ? this.f437121n : this.f437109b;
    }

    public final void a(float f12, int i12) {
        int i13 = this.f437121n;
        int i14 = this.f437114g;
        if (i13 <= i14) {
            this.f437117j = 0.0f;
            return;
        }
        boolean z12 = this.f437126s;
        int i15 = this.f437113f;
        if (z12 || i13 <= i14) {
            this.f437117j = ((i15 * f12) + c(this.f437109b / 2)) - (this.f437118k / 2.0f);
            return;
        }
        this.f437117j = ((i15 * f12) + c(i12)) - (this.f437118k / 2.0f);
        int i16 = this.f437114g / 2;
        float fC2 = c((getDotCount() - 1) - i16);
        if ((this.f437118k / 2.0f) + this.f437117j < c(i16)) {
            this.f437117j = c(i16) - (this.f437118k / 2.0f);
            return;
        }
        float f13 = this.f437117j;
        float f14 = this.f437118k;
        if ((f14 / 2.0f) + f13 > fC2) {
            this.f437117j = fC2 - (f14 / 2.0f);
        }
    }

    public final void b(@N Object obj, @N e eVar) {
        e eVar2 = this.f437128u;
        if (eVar2 != null) {
            eVar2.f437138d.unregisterAdapterDataObserver(eVar2.f437140f);
            eVar2.f437136b.v0(eVar2.f437139e);
            eVar2.f437143i = 0;
            this.f437128u = null;
            this.f437127t = null;
        }
        this.f437129v = false;
        RecyclerView recyclerView = (RecyclerView) obj;
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (recyclerView.getAdapter() == null) {
            throw new IllegalStateException("RecyclerView has not Adapter attached");
        }
        eVar.f437137c = (LinearLayoutManager) recyclerView.getLayoutManager();
        eVar.f437136b = recyclerView;
        eVar.f437138d = recyclerView.getAdapter();
        eVar.f437135a = this;
        c cVar = new c(eVar, this);
        eVar.f437140f = cVar;
        eVar.f437138d.registerAdapterDataObserver(cVar);
        setDotCount(eVar.f437138d.getItemCount());
        eVar.f();
        d dVar = new d(eVar, this);
        eVar.f437139e = dVar;
        eVar.f437136b.o(dVar);
        this.f437128u = eVar;
        this.f437127t = new f(this, obj, eVar);
    }

    public final float c(int i12) {
        return this.f437119l + (i12 * this.f437113f);
    }

    public final void d(float f12, int i12) {
        int i13;
        if (f12 < 0.0f || f12 > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        }
        if (i12 < 0 || (i12 != 0 && i12 >= this.f437121n)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        if (!this.f437126s || ((i13 = this.f437121n) <= this.f437114g && i13 > 1)) {
            this.f437120m.clear();
            if (this.f437116i == 0) {
                f(f12, i12);
                int i14 = this.f437121n;
                if (i12 < i14 - 1) {
                    f(1.0f - f12, i12 + 1);
                } else if (i14 > 1) {
                    f(1.0f - f12, 0);
                }
            } else {
                f(f12, i12 - 1);
                f(1.0f - f12, i12);
            }
            invalidate();
        }
        if (this.f437116i == 0) {
            a(f12, i12);
        } else {
            a(f12, i12 - 1);
        }
        invalidate();
    }

    public final void e() {
        Runnable runnable = this.f437127t;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public final void f(float f12, int i12) {
        if (this.f437120m == null || getDotCount() == 0) {
            return;
        }
        float fAbs = 1.0f - Math.abs(f12);
        if (fAbs == 0.0f) {
            this.f437120m.remove(i12);
        } else {
            this.f437120m.put(i12, Float.valueOf(fAbs));
        }
    }

    @InterfaceC42156l
    public int getDotColor() {
        return this.f437124q;
    }

    @a
    public int getOrientation() {
        return this.f437116i;
    }

    @InterfaceC42156l
    public int getSelectedDotColor() {
        return this.f437125r;
    }

    public int getVisibleDotCount() {
        return this.f437114g;
    }

    public int getVisibleDotThreshold() {
        return this.f437115h;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f437116i
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r5.f437113f
            int r4 = r5.f437112e
            if (r0 != 0) goto L38
            boolean r6 = r5.isInEditMode()
            if (r6 == 0) goto L19
            int r6 = r5.f437114g
        L14:
            int r6 = r6 + (-1)
            int r6 = r6 * r3
            int r6 = r6 + r4
            goto L22
        L19:
            int r6 = r5.f437121n
            int r0 = r5.f437114g
            if (r6 < r0) goto L14
            float r6 = r5.f437118k
            int r6 = (int) r6
        L22:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r2) goto L31
            if (r0 == r1) goto L2f
            goto L35
        L2f:
            r4 = r7
            goto L35
        L31:
            int r4 = java.lang.Math.min(r4, r7)
        L35:
            r7 = r4
        L36:
            r4 = r6
            goto L5f
        L38:
            boolean r7 = r5.isInEditMode()
            if (r7 == 0) goto L45
            int r7 = r5.f437114g
        L40:
            int r7 = r7 + (-1)
            int r7 = r7 * r3
            int r7 = r7 + r4
            goto L4e
        L45:
            int r7 = r5.f437121n
            int r0 = r5.f437114g
            if (r7 < r0) goto L40
            float r7 = r5.f437118k
            int r7 = (int) r7
        L4e:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            if (r0 == r2) goto L5b
            if (r0 == r1) goto L36
            goto L5f
        L5b:
            int r4 = java.lang.Math.min(r4, r6)
        L5f:
            r5.setMeasuredDimension(r4, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public void setCurrentPosition(int i12) {
        if (i12 != 0 && (i12 < 0 || i12 >= this.f437121n)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.f437121n == 0) {
            return;
        }
        a(0.0f, i12);
        if (!this.f437126s || this.f437121n < this.f437114g) {
            this.f437120m.clear();
            this.f437120m.put(i12, Float.valueOf(1.0f));
            invalidate();
        }
    }

    public void setDotColor(@InterfaceC42156l int i12) {
        this.f437124q = i12;
        invalidate();
    }

    public void setDotCount(int i12) {
        if (this.f437121n == i12 && this.f437129v) {
            return;
        }
        this.f437121n = i12;
        this.f437129v = true;
        this.f437120m = new SparseArray<>();
        if (i12 < this.f437115h) {
            requestLayout();
            invalidate();
            return;
        }
        boolean z12 = this.f437126s;
        int i13 = this.f437112e;
        this.f437119l = (!z12 || this.f437121n <= this.f437114g) ? i13 / 2 : 0.0f;
        this.f437118k = ((this.f437114g - 1) * this.f437113f) + i13;
        requestLayout();
        invalidate();
    }

    public void setLooped(boolean z12) {
        this.f437126s = z12;
        e();
        invalidate();
    }

    public void setOrientation(@a int i12) {
        this.f437116i = i12;
        if (this.f437127t != null) {
            e();
        } else {
            requestLayout();
        }
    }

    public void setSelectedDotColor(@InterfaceC42156l int i12) {
        this.f437125r = i12;
        invalidate();
    }

    public void setVisibleDotCount(int i12) {
        if (i12 % 2 == 0) {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
        this.f437114g = i12;
        this.f437109b = i12 + 2;
        if (this.f437127t != null) {
            e();
        } else {
            requestLayout();
        }
    }

    public void setVisibleDotThreshold(int i12) {
        this.f437115h = i12;
        if (this.f437127t != null) {
            e();
        } else {
            requestLayout();
        }
    }
}
