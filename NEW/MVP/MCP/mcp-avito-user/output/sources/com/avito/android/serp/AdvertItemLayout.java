package com.avito.android.serp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import hw.InterfaceC41177b;
import kG0.C42580a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertItemLayout.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/avito/android/serp/AdvertItemLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getRecommendationItemHeight", "()I", "heightRatio", "Lkotlin/G0;", "setHeightRatio", "(I)V", "widthRatio", "setWidthRatio", "a", "b", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdvertItemLayout extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public View f268305A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public View f268306B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public View f268307C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public View f268308D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public View f268309E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public View f268310F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final b f268311G;

    /* renamed from: H, reason: collision with root package name */
    public final int f268312H;

    /* renamed from: I, reason: collision with root package name */
    public final int f268313I;

    /* renamed from: J, reason: collision with root package name */
    public final int f268314J;

    /* renamed from: K, reason: collision with root package name */
    public final int f268315K;

    /* renamed from: L, reason: collision with root package name */
    public final int f268316L;

    /* renamed from: M, reason: collision with root package name */
    public final int f268317M;

    /* renamed from: N, reason: collision with root package name */
    public final int f268318N;

    /* renamed from: O, reason: collision with root package name */
    public final int f268319O;

    /* renamed from: P, reason: collision with root package name */
    public final int f268320P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f268321Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f268322R;

    /* renamed from: S, reason: collision with root package name */
    public final int f268323S;

    /* renamed from: T, reason: collision with root package name */
    public final int f268324T;

    /* renamed from: U, reason: collision with root package name */
    public final int f268325U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f268326V;

    /* renamed from: W, reason: collision with root package name */
    public int f268327W;

    /* renamed from: b, reason: collision with root package name */
    public final int f268328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268329c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f268330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f268331e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268332f;

    /* renamed from: g, reason: collision with root package name */
    public final int f268333g;

    /* renamed from: h, reason: collision with root package name */
    public int f268334h;

    /* renamed from: i, reason: collision with root package name */
    public int f268335i;

    /* renamed from: j, reason: collision with root package name */
    public View f268336j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public View f268337k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public View f268338l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public View f268339m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public View f268340n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public View f268341o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public View f268342p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public View f268343q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public View f268344r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public View f268345s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public View f268346t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public View f268347u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public View f268348v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public View f268349w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public View f268350x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public View f268351y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public View f268352z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertItemLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/AdvertItemLayout$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f268353b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f268354c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f268355d;

        static {
            a aVar = new a("TOP", 0);
            f268353b = aVar;
            a[] aVarArr = {aVar, new a("LEFT", 1)};
            f268354c = aVarArr;
            f268355d = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f268354c.clone();
        }
    }

    /* compiled from: AdvertItemLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/AdvertItemLayout$b;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f268356a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f268357b;
    }

    /* compiled from: AdvertItemLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.f268353b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AdvertItemLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268330d = a.f268353b;
        this.f268332f = R.id.image;
        b bVar = new b();
        bVar.f268356a = 0;
        bVar.f268357b = false;
        this.f268311G = bVar;
        this.f268312H = getResources().getDimensionPixelOffset(R.dimen.advert_between_text_margin);
        this.f268313I = getResources().getDimensionPixelOffset(R.dimen.advert_call_button_margin);
        this.f268314J = getResources().getDimensionPixelOffset(R.dimen.advert_distance_text_margin);
        this.f268315K = getResources().getDimensionPixelOffset(R.dimen.advert_between_icon_margin);
        this.f268316L = getResources().getDimensionPixelOffset(R.dimen.advert_icon_border_margin);
        this.f268317M = getResources().getDimensionPixelOffset(R.dimen.card_badge_margin_left);
        this.f268318N = getResources().getDimensionPixelOffset(R.dimen.card_favorites_margin);
        this.f268319O = getResources().getDimensionPixelOffset(R.dimen.advert_page_indicator_bottom_margin);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406213c, 0, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 1) {
                this.f268328b = typedArrayObtainStyledAttributes.getInt(index, this.f268328b);
            } else if (index == 0) {
                this.f268329c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268329c);
            } else if (index == 7) {
                this.f268330d = a.values()[typedArrayObtainStyledAttributes.getInt(index, this.f268330d.ordinal())];
            } else if (index == 14) {
                this.f268331e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0);
            } else if (index == 5) {
                this.f268332f = typedArrayObtainStyledAttributes.getResourceId(index, this.f268332f);
            } else if (index == 3) {
                this.f268333g = typedArrayObtainStyledAttributes.getInt(index, this.f268333g);
            } else if (index == 9) {
                this.f268334h = typedArrayObtainStyledAttributes.getInt(index, this.f268334h);
            } else if (index == 4) {
                this.f268335i = typedArrayObtainStyledAttributes.getInt(index, this.f268335i);
            } else if (index == 11) {
                this.f268320P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268320P);
            } else if (index == 12) {
                this.f268321Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268321Q);
            } else if (index == 13) {
                this.f268322R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268322R);
            } else if (index == 2) {
                this.f268325U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268325U);
            } else if (index == 6) {
                this.f268323S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268323S);
            } else if (index == 8) {
                this.f268324T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f268324T);
            } else if (index == 10) {
                this.f268326V = typedArrayObtainStyledAttributes.getBoolean(index, this.f268326V);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int a(View view) {
        if (view == null || view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static void b(View view, int i12, b bVar, int i13, boolean z12) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() <= 0) {
            return;
        }
        if (bVar.f268357b) {
            bVar.f268356a += i13;
        }
        view.layout(i12, bVar.f268356a, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + bVar.f268356a);
        bVar.f268356a = view.getMeasuredHeight() + bVar.f268356a;
        bVar.f268357b = z12;
    }

    public static void c(View view, b bVar, int i12, boolean z12) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() <= 0) {
            return;
        }
        if (bVar.f268357b) {
            bVar.f268356a += i12;
        }
        bVar.f268356a = view.getMeasuredHeight() + bVar.f268356a;
        bVar.f268357b = z12;
    }

    private final int getRecommendationItemHeight() {
        int i12 = this.f268327W;
        if (i12 > 0) {
            return i12;
        }
        TextView textView = (TextView) this.f268342p;
        TextView textView2 = (TextView) this.f268343q;
        TextView textView3 = (TextView) this.f268350x;
        int lineHeight = (this.f268312H * 2) + textView2.getLineHeight() + (textView.getLineHeight() * 2) + this.f268331e + this.f268324T + textView3.getLineHeight();
        this.f268327W = lineHeight;
        return lineHeight;
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        int id2 = view.getId();
        if (id2 == this.f268332f) {
            this.f268336j = view;
            return;
        }
        if (id2 == R.id.page_indicator) {
            this.f268337k = view;
            return;
        }
        if (id2 == R.id.btn_favorite) {
            this.f268338l = view;
            return;
        }
        if (id2 == R.id.safe_deal) {
            this.f268339m = view;
            return;
        }
        if (id2 == R.id.verified_seller) {
            this.f268340n = view;
            return;
        }
        if (id2 == R.id.delivery) {
            this.f268341o = view;
            return;
        }
        if (id2 == R.id.title) {
            this.f268342p = view;
            return;
        }
        if (id2 == R.id.extra_description) {
            this.f268346t = view;
            return;
        }
        if (id2 == R.id.price) {
            this.f268343q = view;
            return;
        }
        if (id2 == R.id.price_without_discount) {
            this.f268344r = view;
            return;
        }
        if (id2 == R.id.discount_layout) {
            this.f268345s = view;
            return;
        }
        if (id2 == R.id.description) {
            this.f268347u = view;
            return;
        }
        if (id2 == R.id.shop_name) {
            this.f268348v = view;
            return;
        }
        if (id2 == R.id.verification) {
            this.f268349w = view;
            return;
        }
        if (id2 == R.id.location) {
            this.f268350x = view;
            return;
        }
        if (id2 == R.id.distance) {
            this.f268351y = view;
            return;
        }
        if (id2 == R.id.address) {
            this.f268352z = view;
            return;
        }
        if (id2 == R.id.date) {
            this.f268305A = view;
            return;
        }
        if (id2 == R.id.call_button) {
            this.f268306B = view;
            return;
        }
        if (id2 == R.id.badge) {
            this.f268307C = view;
            return;
        }
        if (id2 == R.id.badge_bar) {
            this.f268308D = view;
        } else if (id2 == R.id.marketplace_instock) {
            this.f268309E = view;
        } else if (id2 == R.id.marketplace_trust_factor) {
            this.f268310F = view;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredWidth;
        int i16;
        int measuredHeight;
        int i17;
        int measuredWidth2;
        View view = this.f268336j;
        if (view == null) {
            view = null;
        }
        int measuredWidth3 = view.getMeasuredWidth();
        View view2 = this.f268336j;
        if (view2 == null) {
            view2 = null;
        }
        int measuredHeight2 = view2.getMeasuredHeight();
        View view3 = this.f268336j;
        if (view3 == null) {
            view3 = null;
        }
        view3.layout(this.f268323S, this.f268324T, measuredWidth3, measuredHeight2);
        View view4 = this.f268338l;
        if (view4 != null && view4.getVisibility() != 8) {
            int measuredWidth4 = measuredWidth3 - view4.getMeasuredWidth();
            View view5 = this.f268336j;
            if (view5 == null) {
                view5 = null;
            }
            int measuredHeight3 = view5.getMeasuredHeight() + this.f268318N;
            view4.layout(measuredWidth4, measuredHeight3, view4.getMeasuredWidth() + measuredWidth4, view4.getMeasuredHeight() + measuredHeight3);
        }
        View view6 = this.f268337k;
        if (view6 != null && view6.getVisibility() != 8 && view6.getMeasuredHeight() > 0) {
            int measuredWidth5 = (measuredWidth3 - view6.getMeasuredWidth()) / 2;
            int i18 = measuredHeight2 - this.f268319O;
            view6.layout(measuredWidth5, i18 - view6.getMeasuredHeight(), view6.getMeasuredWidth() + measuredWidth5, i18);
        }
        int i19 = this.f268316L;
        int measuredWidth6 = measuredWidth3 - i19;
        int i22 = measuredHeight2 - i19;
        View view7 = this.f268341o;
        int i23 = this.f268315K;
        if (view7 != null && view7.getVisibility() != 8) {
            view7.layout(measuredWidth6 - view7.getMeasuredWidth(), i22 - view7.getMeasuredHeight(), measuredWidth6, i22);
            measuredWidth6 -= view7.getMeasuredWidth() - i23;
        }
        View view8 = this.f268340n;
        if (view8 != null && view8.getVisibility() != 8) {
            view8.layout(measuredWidth6 - view8.getMeasuredWidth(), i22 - view8.getMeasuredHeight(), measuredWidth6, i22);
            measuredWidth6 -= view8.getMeasuredWidth() - i23;
        }
        View view9 = this.f268339m;
        if (view9 != null && view9.getVisibility() != 8) {
            view9.layout(measuredWidth6 - view9.getMeasuredWidth(), i22 - view9.getMeasuredHeight(), measuredWidth6, i22);
            view9.getMeasuredWidth();
        }
        View view10 = this.f268307C;
        int i24 = this.f268317M;
        if (view10 != null && view10.getVisibility() != 8) {
            int i25 = this.f268323S + i24;
            int i26 = measuredHeight2 - i24;
            view10.layout(i25, i26 - view10.getMeasuredHeight(), view10.getMeasuredWidth() + i25, i26);
        }
        View view11 = this.f268308D;
        if (view11 != null && view11.getVisibility() != 8) {
            int i27 = measuredHeight2 - i24;
            view11.layout(this.f268323S + i24, i27 - view11.getMeasuredHeight(), measuredWidth3 - i24, i27);
        }
        int iOrdinal = this.f268330d.ordinal();
        if (iOrdinal == 0) {
            measuredWidth = this.f268321Q;
            i16 = this.f268323S;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            View view12 = this.f268336j;
            if (view12 == null) {
                view12 = null;
            }
            measuredWidth = view12.getMeasuredWidth() + this.f268329c;
            i16 = this.f268323S;
        }
        int i28 = measuredWidth + i16;
        int iOrdinal2 = this.f268330d.ordinal();
        if (iOrdinal2 == 0) {
            View view13 = this.f268336j;
            measuredHeight = (view13 != null ? view13 : null).getMeasuredHeight();
            i17 = this.f268331e;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            measuredHeight = this.f268331e;
            i17 = this.f268324T;
        }
        int i29 = measuredHeight + i17;
        b bVar = this.f268311G;
        bVar.f268356a = i29;
        bVar.f268357b = false;
        View view14 = this.f268342p;
        int i32 = this.f268312H;
        b(view14, i28, bVar, i32, true);
        b(this.f268343q, i28, bVar, i32, true);
        b(this.f268344r, i28, bVar, i32, true);
        b(this.f268345s, i28, bVar, i32, false);
        b(this.f268347u, i28, bVar, i32, true);
        b(this.f268348v, i28, bVar, i32, false);
        b(this.f268349w, i28, bVar, i32, false);
        b(this.f268346t, i28, bVar, i32, false);
        int iMax = Math.max(a(this.f268350x), a(this.f268351y));
        if (iMax > 0) {
            if (bVar.f268357b) {
                bVar.f268356a += i32;
            }
            View view15 = this.f268350x;
            if (view15 == null || view15.getVisibility() == 8 || view15.getMeasuredWidth() <= 0) {
                measuredWidth2 = i28;
            } else {
                view15.layout(i28, bVar.f268356a, view15.getMeasuredWidth() + i28, view15.getMeasuredHeight() + bVar.f268356a);
                measuredWidth2 = view15.getMeasuredWidth() + this.f268314J + i28;
            }
            View view16 = this.f268351y;
            if (view16 != null && view16.getVisibility() != 8 && view16.getMeasuredWidth() > 0) {
                view16.layout(measuredWidth2, bVar.f268356a, view16.getMeasuredWidth() + measuredWidth2, view16.getMeasuredHeight() + bVar.f268356a);
            }
            bVar.f268356a += iMax;
            bVar.f268357b = false;
        }
        b(this.f268352z, i28, bVar, i32, false);
        b(this.f268309E, i28, bVar, i32, false);
        b(this.f268310F, i28, bVar, i32, false);
        b(this.f268305A, i28, bVar, i32, false);
        View view17 = this.f268306B;
        if (view17 == null || view17.getVisibility() == 8 || view17.getMeasuredHeight() <= 0) {
            return;
        }
        int i33 = i15 - i13;
        view17.layout(i28, (i33 - view17.getMeasuredHeight()) - this.f268320P, view17.getMeasuredWidth() + i28, i33 - this.f268320P);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.AdvertItemLayout.onMeasure(int, int):void");
    }

    public final void setHeightRatio(int heightRatio) {
        this.f268335i = heightRatio;
        requestLayout();
    }

    public final void setWidthRatio(int widthRatio) {
        this.f268334h = widthRatio;
        requestLayout();
    }
}
