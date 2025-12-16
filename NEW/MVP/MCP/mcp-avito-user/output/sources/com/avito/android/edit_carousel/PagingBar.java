package com.avito.android.edit_carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_carousel.PagingBar;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.util.F5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: PagingBar.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bJ#\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/edit_carousel/PagingBar;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "onPageSelectedListener", "setOnPageSelectedListener", "(LY41/l;)V", "getShowMoreItemWidth", "()I", "showMoreItemWidth", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PagingBar extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f146221q = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f146222b;

    /* renamed from: c, reason: collision with root package name */
    public final int f146223c;

    /* renamed from: d, reason: collision with root package name */
    public final int f146224d;

    /* renamed from: e, reason: collision with root package name */
    public final long f146225e;

    /* renamed from: f, reason: collision with root package name */
    public final int f146226f;

    /* renamed from: g, reason: collision with root package name */
    public int f146227g;

    /* renamed from: h, reason: collision with root package name */
    public int f146228h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f146229i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public Object f146230j;

    /* renamed from: k, reason: collision with root package name */
    public final int f146231k;

    /* renamed from: l, reason: collision with root package name */
    public int f146232l;

    /* renamed from: m, reason: collision with root package name */
    public int f146233m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f146234n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public Object f146235o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final SegmentedControl f146236p;

    /* compiled from: PagingBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/PagingBar$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f146237a;

        /* renamed from: b, reason: collision with root package name */
        public final int f146238b;

        public a(@Y61.k String str, int i12) {
            this.f146237a = str;
            this.f146238b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f146237a, aVar.f146237a) && this.f146238b == aVar.f146238b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f146238b) + (this.f146237a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(label=");
            sb2.append(this.f146237a);
            sb2.append(", pageNumber=");
            return androidx.appcompat.app.r.t(sb2, this.f146238b, ')');
        }
    }

    @X41.j
    public PagingBar(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final int getShowMoreItemWidth() {
        return this.f146231k + this.f146222b + this.f146223c + this.f146224d;
    }

    public final ArrayList a(int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        List listM0 = C42745f0.M0(i13 > i14 ? kotlin.ranges.s.k(i13, i14) : new kotlin.ranges.l(i13, i14, 1));
        int size = listM0.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= size) {
                break;
            }
            int iIntValue = ((Number) listM0.get(i15)).intValue();
            int iD2 = d(iIntValue);
            if (getShowMoreItemWidth() + iD2 > i12 - i16 && iIntValue != i14) {
                arrayList.add(new a("...", iIntValue));
                break;
            }
            arrayList.add(new a(String.valueOf(iIntValue), iIntValue));
            i16 += iD2;
            i15++;
        }
        if (i13 > i14) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public final ArrayList b(int i12, int i13) {
        int iD2;
        ArrayList arrayList = new ArrayList();
        int showMoreItemWidth = (getShowMoreItemWidth() * 2) + d(i13);
        arrayList.add(new a(String.valueOf(i13), i13));
        int i14 = i13 - 1;
        int i15 = i13 + 1;
        while (showMoreItemWidth <= i12 && i14 > 1 && i15 < this.f146232l && i12 - showMoreItemWidth > (iD2 = d(i14))) {
            arrayList.add(0, new a(String.valueOf(i14), i14));
            int i16 = showMoreItemWidth + iD2;
            i14--;
            int iD3 = d(i15);
            if (i12 - i16 <= iD3) {
                break;
            }
            arrayList.add(new a(String.valueOf(i15), i15));
            showMoreItemWidth = i16 + iD3;
            i15++;
        }
        arrayList.add(0, new a("...", i14));
        arrayList.add(new a("...", i15));
        return arrayList;
    }

    public final int c(List<Integer> list) {
        Iterator<T> it = list.iterator();
        int iD2 = 0;
        while (it.hasNext()) {
            iD2 += d(((Number) it.next()).intValue());
        }
        return iD2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int d(int i12) {
        return ((Number) this.f146230j.get(String.valueOf(i12).length() - 1)).intValue() + this.f146222b + this.f146223c + this.f146224d + this.f146226f;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    public final void e() {
        final ArrayList arrayList;
        Collection collectionH0;
        int i12 = this.f146228h;
        if (i12 == 0) {
            return;
        }
        if (i12 == -1) {
            List listM0 = C42745f0.M0(new kotlin.ranges.l(1, this.f146232l, 1));
            arrayList = new ArrayList(C42745f0.q(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                arrayList.add(new a(String.valueOf(iIntValue), iIntValue));
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(new a("1", 1));
            arrayList.add(new a(String.valueOf(this.f146232l), this.f146232l));
            int iD2 = (this.f146228h - d(1)) - d(this.f146232l);
            int i13 = this.f146232l;
            int i14 = i13 - 1;
            int i15 = this.f146233m;
            if (i15 == 1) {
                collectionH0 = a(iD2, 2, i14);
            } else if (i15 == i13) {
                collectionH0 = a(iD2, i14, 2);
            } else {
                int i16 = i13 - i15;
                int i17 = i15 - 1;
                if (i16 > i17) {
                    int iC2 = c(C42745f0.M0(new kotlin.ranges.l(2, this.f146233m, 1)));
                    collectionH0 = getShowMoreItemWidth() + iC2 <= iD2 ? C42745f0.h0(a(iD2 - iC2, this.f146233m + 1, i14), a(iD2, this.f146233m, 2)) : b(iD2, this.f146233m);
                } else if (i16 <= i17) {
                    int iC3 = c(C42745f0.M0(kotlin.ranges.s.r(i15, i13)));
                    collectionH0 = getShowMoreItemWidth() + iC3 <= iD2 ? C42745f0.h0(a(iD2, this.f146233m, i14), a(iD2 - iC3, this.f146233m - 1, 2)) : b(iD2, this.f146233m);
                } else {
                    collectionH0 = C42784z0.f406748b;
                }
            }
            arrayList.addAll(1, collectionH0);
        }
        if (arrayList.size() > 1) {
            Iterator it2 = arrayList.iterator();
            final int i18 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i18 = -1;
                    break;
                } else if (((a) it2.next()).f146238b == this.f146233m) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 == -1 || i18 > arrayList.size() - 1) {
                i18 = 0;
            }
            if (L.f(this.f146235o, arrayList)) {
                this.f146236p.s(i18, false, false);
                return;
            }
            long j12 = this.f146235o.isEmpty() ? 0L : this.f146225e;
            this.f146235o = arrayList;
            postDelayed(new Runnable() { // from class: com.avito.android.edit_carousel.z
                @Override // java.lang.Runnable
                public final void run() {
                    int i19 = PagingBar.f146221q;
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PagingBar.a) it3.next()).f146237a);
                    }
                    this.f146565b.f146236p.q(i18, arrayList3);
                }
            }, j12);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        if (this.f146227g > View.MeasureSpec.getSize(i12)) {
            this.f146228h = View.MeasureSpec.getSize(i12);
        } else {
            this.f146228h = -1;
            i12 = View.MeasureSpec.makeMeasureSpec(this.f146227g, 1073741824);
        }
        super.onMeasure(i12, i13);
    }

    public final void setOnPageSelectedListener(@Y61.l Y41.l<? super Integer, G0> onPageSelectedListener) {
        this.f146234n = onPageSelectedListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PagingBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.segmentedControl : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_SegmentedControl : i13;
        super(context, attributeSet, i12);
        this.f146226f = y6.b(1);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f146230j = c42784z0;
        this.f146233m = 1;
        this.f146235o = c42784z0;
        SegmentedControl segmentedControl = new SegmentedControl(context, attributeSet, i12, i13);
        segmentedControl.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 3));
        segmentedControl.setOnSegmentClickListener(new A(this));
        this.f146236p = segmentedControl;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178999v0, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            F5 f5F = C48065c.f(typedArrayObtainStyledAttributes.getResourceId(0, 0), context);
            Paint paint = new Paint();
            Float f12 = f5F.f318607d;
            if (f12 != null) {
                paint.setTextSize(f12.floatValue());
            }
            Typeface typeface = f5F.f318604a;
            if (typeface != null) {
                paint.setTypeface(typeface);
            }
            this.f146229i = paint;
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.f146222b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.f146222b);
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            this.f146223c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.f146222b);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f146224d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, y6.b(0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.f146225e = typedArrayObtainStyledAttributes.getInt(12, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = this.f146229i;
        this.f146231k = (int) (paint2 != null ? paint2 : null).measureText("...");
        addView(segmentedControl);
    }
}
