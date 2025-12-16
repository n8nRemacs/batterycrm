package com.avito.android.lib.design.tab_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.view.C22829k0;
import androidx.core.view.C22832m;
import androidx.core.view.C22833m0;
import androidx.core.view.J0;
import com.avito.android.R;
import com.avito.android.advert.item.parking.i;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.U;
import j.r;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabBarLayout.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003()*J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u0004\u0018\u00010\f\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u0003H\u0086\b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/TabBarLayout;", "Landroid/widget/LinearLayout;", "", "Lcom/avito/android/lib/design/tab_bar/b;", "items", "Lkotlin/G0;", "setTabs", "(Ljava/util/Set;)V", "tabBarItem", "setSelectedTab", "(Lcom/avito/android/lib/design/tab_bar/b;)V", "T", "Lcom/avito/android/lib/design/tab_bar/a;", "getTabView", "()Lcom/avito/android/lib/design/tab_bar/a;", "Lcom/avito/android/lib/design/tab_bar/TabBarLayout$b;", "d", "Lcom/avito/android/lib/design/tab_bar/TabBarLayout$b;", "getOnTabClickListener", "()Lcom/avito/android/lib/design/tab_bar/TabBarLayout$b;", "setOnTabClickListener", "(Lcom/avito/android/lib/design/tab_bar/TabBarLayout$b;)V", "onTabClickListener", "", "e", "Z", "isTabsTitlesShown", "()Z", "setTabsTitlesShown", "(Z)V", "f", "isPresent", "setPresent", "", "<set-?>", "g", "I", "getLocationInWindowY", "()I", "locationInWindowY", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TabBarLayout extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f180679h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @r
    public static final int f180680i = 300;

    /* renamed from: j, reason: collision with root package name */
    @r
    public static final int f180681j = 360;

    /* renamed from: k, reason: collision with root package name */
    @r
    public static final int f180682k = 640;

    /* renamed from: l, reason: collision with root package name */
    public static Y41.a<a.C5305a> f180683l;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.button.c f180684b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C22832m f180685c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public b onTabClickListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isTabsTitlesShown;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isPresent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int locationInWindowY;

    /* compiled from: TabBarLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/TabBarLayout$a;", "", "<init>", "()V", "", "MAX_WIDTH_PHONE_DP", "I", "MAX_WIDTH_TABLET_DP", "MAX_WIDTH_TABLET_TITLES_DP", "", "TOAST_BAR_ANCHOR_TAG", "Ljava/lang/String;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TabBarLayout.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/TabBarLayout$a$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.tab_bar.TabBarLayout$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5305a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f180690a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f180691b;

            public C5305a(boolean z12, boolean z13) {
                this.f180690a = z12;
                this.f180691b = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5305a)) {
                    return false;
                }
                C5305a c5305a = (C5305a) obj;
                return this.f180690a == c5305a.f180690a && this.f180691b == c5305a.f180691b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f180691b) + (Boolean.hashCode(this.f180690a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("TabBarRe23Config(isEnabled=");
                sb2.append(this.f180690a);
                sb2.append(", isWithTitles=");
                return androidx.appcompat.app.r.x(sb2, this.f180691b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @l
        public static TabBarLayout a(@k Context context) {
            Window window;
            View decorView;
            TabBarLayout tabBarLayout;
            Activity activityA = C35835l0.a(context);
            if (activityA == null || (window = activityA.getWindow()) == null || (decorView = window.getDecorView()) == null || (tabBarLayout = (TabBarLayout) decorView.findViewWithTag("TabBarLayoutAsToastBarAnchor")) == null || !tabBarLayout.isPresent) {
                return null;
            }
            return tabBarLayout;
        }

        @U
        public static int b(@k Context context) {
            return context.getResources().getDimensionPixelSize(R.dimen.tab_bar_content_behind_padding_bottom) - context.getResources().getDimensionPixelSize(R.dimen.tab_bar_margin_bottom);
        }

        public static boolean c() {
            Y41.a<C5305a> aVar = TabBarLayout.f180683l;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.invoke().f180690a;
        }

        public static void d(a aVar, View view) {
            aVar.getClass();
            if (!c() || a(view.getContext()) == null) {
                return;
            }
            D6.c(view, null, null, null, Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(R.dimen.tab_bar_content_behind_padding_bottom)), 7);
        }

        public static void e(a aVar, View view, int i12, int i13) {
            if ((i13 & 1) != 0) {
                i12 = 0;
            }
            boolean z12 = (i13 & 2) == 0;
            aVar.getClass();
            if (!c() || a(view.getContext()) == null) {
                return;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (z12 ? b(view.getContext()) : com.avito.android.actions_sheet.a.d(view, R.dimen.tab_bar_content_behind_padding_bottom)) + i12);
        }

        public a() {
        }
    }

    /* compiled from: TabBarLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/TabBarLayout$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(@k com.avito.android.lib.design.tab_bar.b bVar);

        void b(@k com.avito.android.lib.design.tab_bar.b bVar);
    }

    /* compiled from: TabBarLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/TabBarLayout$c;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        public final View a(MotionEvent motionEvent) {
            Iterator<View> it = new C22829k0(TabBarLayout.this).iterator();
            View view = null;
            float f12 = Float.MAX_VALUE;
            while (true) {
                C22833m0 c22833m0 = (C22833m0) it;
                if (!c22833m0.hasNext()) {
                    return view;
                }
                View view2 = (View) c22833m0.next();
                if (view2 instanceof com.avito.android.lib.design.tab_bar.a) {
                    float fAbs = Math.abs(motionEvent.getX() - view2.getLeft());
                    float fAbs2 = Math.abs(motionEvent.getX() - view2.getRight());
                    if (fAbs < f12) {
                        view = view2;
                        f12 = fAbs;
                    }
                    if (fAbs2 < f12) {
                        view = view2;
                        f12 = fAbs2;
                    }
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(@k MotionEvent motionEvent) {
            View viewA = a(motionEvent);
            if (viewA != null) {
                viewA.performLongClick();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@k MotionEvent motionEvent) {
            View viewA = a(motionEvent);
            if (viewA == null) {
                return true;
            }
            viewA.performClick();
            return true;
        }
    }

    @j
    public TabBarLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @l
    public final com.avito.android.lib.design.tab_bar.a a(@k com.avito.android.lib.design.tab_bar.b bVar) {
        KeyEvent.Callback next;
        Iterator<View> it = new C22829k0(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KeyEvent.Callback callback = (View) next;
            if ((callback instanceof com.avito.android.lib.design.tab_bar.a) && ((com.avito.android.lib.design.tab_bar.a) callback).getTabBarItem().getClass() == bVar.getClass()) {
                break;
            }
        }
        if (next instanceof com.avito.android.lib.design.tab_bar.a) {
            return (com.avito.android.lib.design.tab_bar.a) next;
        }
        return null;
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        this.f180684b.a(canvas, this);
        super.draw(canvas);
    }

    public final int getLocationInWindowY() {
        return this.locationInWindowY;
    }

    @l
    public final b getOnTabClickListener() {
        return this.onTabClickListener;
    }

    public final <T extends com.avito.android.lib.design.tab_bar.b> com.avito.android.lib.design.tab_bar.a getTabView() {
        Iterator<View> it = new C22829k0(this).iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) it.next();
            if (callback instanceof com.avito.android.lib.design.tab_bar.a) {
                ((com.avito.android.lib.design.tab_bar.a) callback).getTabBarItem();
                L.l();
                throw null;
            }
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, getContext().getResources().getBoolean(R.bool.is_tablet) ? this.isTabsTitlesShown ? y6.b(f180682k) : y6.b(f180681j) : this.isTabsTitlesShown ? size : y6.b(f180680i)), View.MeasureSpec.getMode(i12)), i13);
        this.f180684b.d(this);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        this.f180685c.a(motionEvent);
        return true;
    }

    public final void setOnTabClickListener(@l b bVar) {
        this.onTabClickListener = bVar;
    }

    public final void setPresent(boolean z12) {
        this.isPresent = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelectedTab(@k com.avito.android.lib.design.tab_bar.b tabBarItem) {
        Iterator<View> it = new C22829k0(this).iterator();
        while (it.hasNext()) {
            View next = it.next();
            next.setSelected((next instanceof com.avito.android.lib.design.tab_bar.a) && ((com.avito.android.lib.design.tab_bar.a) next).getTabBarItem().getClass() == tabBarItem.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, com.avito.android.lib.design.tab_bar.TabBarLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.avito.android.lib.design.tab_bar.d] */
    public final void setTabs(@k Set<? extends com.avito.android.lib.design.tab_bar.b> items) {
        removeAllViews();
        LinearLayout.LayoutParams layoutParams = this.isTabsTitlesShown ? new LinearLayout.LayoutParams(0, -2, 1.0f) : new LinearLayout.LayoutParams(-2, -2);
        int i12 = 0;
        for (Object obj : items) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.android.lib.design.tab_bar.b bVar = (com.avito.android.lib.design.tab_bar.b) obj;
            com.avito.android.lib.design.tab_bar.c dVar = this.isTabsTitlesShown ? new d(getContext(), null, 0, 6, null) : new com.avito.android.lib.design.tab_bar.c(getContext(), null, 0, 6, null);
            dVar.setTabBarItem(bVar);
            dVar.setOnClickListener(new h(7, (Object) this, dVar));
            dVar.setOnLongClickListener(new i(2, this, dVar));
            addView(dVar, layoutParams);
            if (!this.isTabsTitlesShown && i12 < items.size() - 1) {
                addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
            }
            i12 = i13;
        }
    }

    public final void setTabsTitlesShown(boolean z12) {
        this.isTabsTitlesShown = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabBarLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        Window window;
        View decorView;
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        if ((i13 & 4) != 0) {
            f180679h.getClass();
            Y41.a<a.C5305a> aVar = f180683l;
            i12 = (aVar == null ? null : aVar).invoke().f180691b ? R.attr.tabBarDefaultWhiteWithTitles : R.attr.tabBarDefaultWhite;
        }
        super(context, attributeSet, i12);
        com.avito.android.lib.design.button.c cVar = new com.avito.android.lib.design.button.c();
        this.f180684b = cVar;
        this.f180685c = new C22832m(context, new c(), null);
        setOrientation(0);
        setClipToPadding(false);
        setClipChildren(false);
        setTag("TabBarLayoutAsToastBarAnchor");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178930K0, i12, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int color = androidx.core.content.d.getColor(context, R.color.tab_bar_background);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        setBackground(gradientDrawable);
        cVar.f(context, typedArrayObtainStyledAttributes, 5, 6, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new e(context, this));
            return;
        }
        Activity activityA = C35835l0.a(context);
        if (activityA == null || (window = activityA.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        int height = (decorView.getHeight() - J0.s(null, decorView.getRootWindowInsets()).e(7).f44778d) - getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.locationInWindowY = height - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }
}
