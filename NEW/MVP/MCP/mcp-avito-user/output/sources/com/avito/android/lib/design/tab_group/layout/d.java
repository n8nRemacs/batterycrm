package com.avito.android.lib.design.tab_group.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.util.y;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.d;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.util.p6;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import j.InterfaceC42156l;
import j.U;
import j.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import lY0.C43707b;

/* compiled from: TabGroupLayout.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001:\u00046789J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0006R\u001f\u0010\u001a\u001a\u00060\u0015R\u00020\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0006R(\u0010&\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0004\b!\u0010\u001c\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010\u0006R$\u0010-\u001a\f\u0012\b\u0012\u00060(R\u00020\u00000'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u001c\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b2\u0010\u001c\u0012\u0004\b3\u0010%R\u0014\u00105\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001e¨\u0006:"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d;", "Landroid/widget/HorizontalScrollView;", "", "color", "Lkotlin/G0;", "setSelectedTabIndicatorColor", "(I)V", "height", "setSelectedTabIndicatorHeight", "", "tabIndicatorFullWidth", "setTabIndicatorFullWidth", "(Z)V", "", "elevation", "setElevation", "(F)V", "setDefaultHeight", "position", "setScrollPosition", "setSelectedTabView", "Lcom/avito/android/lib/design/tab_group/layout/d$b;", "f", "Lkotlin/C;", "getSlidingTabIndicator", "()Lcom/avito/android/lib/design/tab_group/layout/d$b;", "slidingTabIndicator", "g", "I", "getContentInsetStart", "()I", "setContentInsetStart", "contentInsetStart", "i", "getMode", "setMode", "getMode$annotations", "()V", "mode", "Landroidx/core/util/y$a;", "Lcom/avito/android/lib/design/tab_group/layout/d$d;", "m", "Landroidx/core/util/y$a;", "getTabViewPool", "()Landroidx/core/util/y$a;", "tabViewPool", "getTabCount", "tabCount", "getSelectedTabPosition", "selectedTabPosition", "tabGravity", "getTabGravity$annotations", "getTabScrollRange", "tabScrollRange", "a", "b", "c", "d", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"RestrictedApi", "CustomViewStyleable", "CustomColorsKotlin", "PrivateResource"})
@ViewPager.d
/* loaded from: classes14.dex */
public class d extends HorizontalScrollView {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f180758n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @r
    public static final int f180759o = 48;

    /* renamed from: p, reason: collision with root package name */
    @r
    public static final int f180760p = 24;

    /* renamed from: q, reason: collision with root package name */
    @r
    public static final int f180761q = 16;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final y.c f180762r = new y.c(16);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList<c> f180763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public c f180764c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RectF f180765d;

    /* renamed from: e, reason: collision with root package name */
    public int f180766e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C slidingTabIndicator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int contentInsetStart;

    /* renamed from: h, reason: collision with root package name */
    public final int f180769h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int mode;

    /* renamed from: j, reason: collision with root package name */
    public boolean f180771j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ArrayList<com.avito.android.lib.design.tab_group.layout.b> f180772k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public ValueAnimator f180773l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final y.b f180774m;

    /* compiled from: TabGroupLayout.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "I", "DEFAULT_HEIGHT", "DEF_STYLE_RES", "GRAVITY_CENTER", "GRAVITY_FILL", "GRAVITY_START", "INDICATOR_GRAVITY_BOTTOM", "INDICATOR_GRAVITY_CENTER", "INDICATOR_GRAVITY_STRETCH", "INDICATOR_GRAVITY_TOP", "", "LOG_TAG", "Ljava/lang/String;", "MIN_INDICATOR_WIDTH", "MODE_AUTO", "MODE_FIXED", "MODE_SCROLLABLE", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TabGroupLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d$c;", "", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f180791a = true;

        /* renamed from: b, reason: collision with root package name */
        public int f180792b = -1;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public View f180793c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public d f180794d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public C5316d f180795e;

        /* compiled from: TabGroupLayout.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d$c$a;", "", "<init>", "()V", "", "INVALID_POSITION", "I", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public void a() {
            this.f180794d = null;
            this.f180795e = null;
            this.f180792b = -1;
            this.f180793c = null;
        }

        public final void b() {
            d dVar = this.f180794d;
            if (dVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (dVar != null) {
                a aVar = d.f180758n;
                dVar.o(this, true);
            }
        }
    }

    /* compiled from: TabGroupLayout.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0096\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d$d;", "Landroid/widget/LinearLayout;", "", "selected", "Lkotlin/G0;", "setSelected", "(Z)V", "Lcom/avito/android/lib/design/tab_group/layout/d$c;", NotificationOpenAtTab.TAB, "setTab", "(Lcom/avito/android/lib/design/tab_group/layout/d$c;)V", "getTab", "()Lcom/avito/android/lib/design/tab_group/layout/d$c;", "Landroid/view/View;", "c", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.tab_group.layout.d$d, reason: collision with other inner class name */
    public class C5316d extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public c f180796b;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        public View customView;

        public C5316d(@Y61.k d dVar, Context context) {
            super(context);
            setGravity(48);
            a aVar = d.f180758n;
            dVar.getClass();
            setOrientation(1);
            setClickable(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() {
            /*
                r3 = this;
                com.avito.android.lib.design.tab_group.layout.d$c r0 = r3.f180796b
                r1 = 0
                if (r0 == 0) goto L8
                android.view.View r2 = r0.f180793c
                goto L9
            L8:
                r2 = r1
            L9:
                if (r2 == 0) goto L1e
                android.view.ViewParent r1 = r2.getParent()
                if (r1 == r3) goto L1b
                if (r1 == 0) goto L18
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r1.removeView(r2)
            L18:
                r3.addView(r2)
            L1b:
                r3.customView = r2
                goto L27
            L1e:
                android.view.View r2 = r3.customView
                if (r2 == 0) goto L27
                r3.removeView(r2)
                r3.customView = r1
            L27:
                if (r0 == 0) goto L3f
                com.avito.android.lib.design.tab_group.layout.d r1 = r0.f180794d
                if (r1 == 0) goto L37
                int r1 = r1.getSelectedTabPosition()
                int r0 = r0.f180792b
                if (r1 != r0) goto L3f
                r0 = 1
                goto L40
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L3f:
                r0 = 0
            L40:
                r3.setSelected(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tab_group.layout.d.C5316d.a():void");
        }

        @Y61.l
        public final View getCustomView() {
            return this.customView;
        }

        @Y61.l
        /* renamed from: getTab, reason: from getter */
        public final c getF180796b() {
            return this.f180796b;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@Y61.k AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            androidx.core.view.accessibility.f fVar = new androidx.core.view.accessibility.f(accessibilityNodeInfo);
            c cVar = this.f180796b;
            fVar.n(cVar != null ? f.g.a(0, 1, cVar.f180792b, 1, isSelected()) : null);
            if (isSelected()) {
                fVar.l(false);
                fVar.h(f.a.f45004g);
            }
            fVar.r("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        @SuppressLint({"Range"})
        public final void onMeasure(int i12, int i13) {
            if (View.MeasureSpec.getMode(i12) == 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE, BeduinInputModel.MIN_TEXT_VERSION);
            }
            super.onMeasure(i12, i13);
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f180796b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            c cVar = this.f180796b;
            if (cVar != null) {
                cVar.b();
            }
            return true;
        }

        public final void setCustomView(@Y61.l View view) {
            this.customView = view;
        }

        @Override // android.view.View
        @SuppressLint({"ObsoleteSdkInt"})
        public void setSelected(boolean selected) {
            isSelected();
            super.setSelected(selected);
            View view = this.customView;
            if (view == null) {
                return;
            }
            view.setSelected(selected);
        }

        public final void setTab(@Y61.l c tab) {
            if (tab != this.f180796b) {
                this.f180796b = tab;
                a();
            }
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f180798b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f180799c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f180800d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f180801e;

        public e(c cVar, c cVar2, d dVar, boolean z12) {
            this.f180798b = cVar;
            this.f180799c = cVar2;
            this.f180800d = dVar;
            this.f180801e = z12;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int size;
            view.removeOnLayoutChangeListener(this);
            d dVar = this.f180800d;
            c cVar = this.f180798b;
            c cVar2 = this.f180799c;
            if (cVar == cVar2) {
                ArrayList<com.avito.android.lib.design.tab_group.layout.b> arrayList = dVar.f180772k;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i22 = size2 - 1;
                        arrayList.get(size2).getClass();
                        if (i22 < 0) {
                            break;
                        } else {
                            size2 = i22;
                        }
                    }
                }
                d.a(dVar, cVar2.f180792b);
                return;
            }
            int i23 = cVar2.f180792b;
            if (this.f180801e) {
                if ((cVar == null || cVar.f180792b == -1) && i23 != -1) {
                    dVar.setScrollPosition(i23);
                } else {
                    d.a(dVar, i23);
                }
                if (i23 != -1) {
                    dVar.setSelectedTabView(i23);
                }
            }
            dVar.f180764c = cVar2;
            ArrayList<com.avito.android.lib.design.tab_group.layout.b> arrayList2 = dVar.f180772k;
            if (cVar != null && arrayList2.size() - 1 >= 0) {
                while (true) {
                    int i24 = size - 1;
                    arrayList2.get(size).getClass();
                    if (i24 < 0) {
                        break;
                    } else {
                        size = i24;
                    }
                }
            }
            int size3 = arrayList2.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i25 = size3 - 1;
                arrayList2.get(size3).a(cVar2);
                if (i25 < 0) {
                    return;
                } else {
                    size3 = i25;
                }
            }
        }
    }

    /* compiled from: TabGroupLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d$b;", "Lcom/avito/android/lib/design/tab_group/layout/d;", "invoke", "()Lcom/avito/android/lib/design/tab_group/layout/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<b> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final b invoke() {
            return d.this.h();
        }
    }

    @X41.j
    public d(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static final void a(d dVar, int i12) {
        ValueAnimator valueAnimator;
        if (i12 == -1) {
            dVar.getClass();
            return;
        }
        if (dVar.getWindowToken() != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (dVar.isLaidOut()) {
                b slidingTabIndicator = dVar.getSlidingTabIndicator();
                slidingTabIndicator.getClass();
                p6 p6Var = new p6(slidingTabIndicator);
                while (p6Var.hasNext()) {
                    if (((View) p6Var.next()).getWidth() <= 0) {
                    }
                }
                int scrollX = dVar.getScrollX();
                int iG2 = dVar.g(0.0f, i12);
                int i13 = dVar.f180769h;
                if (scrollX != iG2) {
                    if (dVar.f180773l == null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.setInterpolator(C43707b.f413880b);
                        valueAnimator2.setDuration(i13);
                        valueAnimator2.addUpdateListener(new AV.a(dVar, 11));
                        dVar.f180773l = valueAnimator2;
                    }
                    ValueAnimator valueAnimator3 = dVar.f180773l;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setIntValues(scrollX, iG2);
                        valueAnimator3.start();
                    }
                }
                b slidingTabIndicator2 = dVar.getSlidingTabIndicator();
                ValueAnimator valueAnimator4 = slidingTabIndicator2.f180783i;
                if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = slidingTabIndicator2.f180783i) != null) {
                    valueAnimator.cancel();
                }
                slidingTabIndicator2.c(i12, i13, true);
                return;
            }
        }
        dVar.setScrollPosition(i12);
    }

    @Y61.k
    public static final y.a<c> getTabPool() {
        f180758n.getClass();
        return f180762r;
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((getSlidingTabIndicator().getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollPosition(int position) {
        p(position, 0.0f, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedTabView(int position) {
        int childCount = getSlidingTabIndicator().getChildCount();
        if (position < childCount) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = getSlidingTabIndicator().getChildAt(i12);
                boolean z12 = true;
                childAt.setSelected(i12 == position);
                if (i12 != position) {
                    z12 = false;
                }
                childAt.setActivated(z12);
                i12++;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(@Y61.k View view) {
        f(view);
    }

    public final void d(@Y61.l com.avito.android.lib.design.tab_group.layout.b bVar) {
        ArrayList<com.avito.android.lib.design.tab_group.layout.b> arrayList = this.f180772k;
        if (C42745f0.r(arrayList, bVar) || bVar == null) {
            return;
        }
        arrayList.add(bVar);
    }

    public final void e(@Y61.k c cVar, boolean z12) {
        ArrayList<c> arrayList = this.f180763b;
        int size = arrayList.size();
        if (cVar.f180794d != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        cVar.f180792b = size;
        arrayList.add(size, cVar);
        int size2 = arrayList.size();
        for (int i12 = size + 1; i12 < size2; i12++) {
            arrayList.get(i12).f180792b = i12;
        }
        C5316d c5316d = cVar.f180795e;
        if (c5316d != null) {
            c5316d.setSelected(false);
        }
        if (c5316d != null) {
            c5316d.setActivated(false);
        }
        b slidingTabIndicator = getSlidingTabIndicator();
        int i13 = cVar.f180792b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.mode == 1) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        slidingTabIndicator.addView(c5316d, i13, layoutParams);
        if (z12) {
            cVar.b();
        }
    }

    public final void f(View view) {
        if (!(view instanceof com.google.android.material.tabs.d)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        e(k(), this.f180763b.isEmpty());
    }

    public final int g(float f12, int i12) {
        int i13 = this.mode;
        if (i13 != 0 && i13 != 2) {
            return 0;
        }
        View childAt = getSlidingTabIndicator().getChildAt(i12);
        int i14 = i12 + 1;
        View childAt2 = i14 < getSlidingTabIndicator().getChildCount() ? getSlidingTabIndicator().getChildAt(i14) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        if (childAt == null) {
            return 0;
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i15 = (int) ((width + width2) * 0.5f * f12);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return getLayoutDirection() == 0 ? left + i15 : left - i15;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final int getContentInsetStart() {
        return this.contentInsetStart;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getSelectedTabPosition() {
        c cVar = this.f180764c;
        if (cVar != null) {
            return cVar.f180792b;
        }
        return -1;
    }

    @Y61.k
    public final b getSlidingTabIndicator() {
        return (b) this.slidingTabIndicator.getValue();
    }

    public final int getTabCount() {
        return this.f180763b.size();
    }

    @Y61.k
    public final y.a<C5316d> getTabViewPool() {
        return this.f180774m;
    }

    @Y61.k
    public b h() {
        return new b(getContext());
    }

    @Y61.k
    public c i() {
        c cVar = (c) f180762r.b();
        return cVar == null ? new c() : cVar;
    }

    @Y61.l
    public final c j(int i12) {
        if (i12 < 0 || i12 >= getTabCount()) {
            return null;
        }
        return this.f180763b.get(i12);
    }

    @Y61.k
    public c k() {
        c cVarI = i();
        cVarI.f180794d = this;
        C5316d c5316d = (C5316d) this.f180774m.b();
        if (c5316d == null) {
            c5316d = new C5316d(this, getContext());
        }
        c5316d.setTab(cVarI);
        c5316d.setFocusable(true);
        cVarI.f180795e = c5316d;
        return cVarI;
    }

    public final void l() {
        int childCount = getSlidingTabIndicator().getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                break;
            }
            C5316d c5316d = (C5316d) getSlidingTabIndicator().getChildAt(childCount);
            getSlidingTabIndicator().removeViewAt(childCount);
            c5316d.setTab(null);
            c5316d.setSelected(false);
            this.f180774m.a(c5316d);
            requestLayout();
        }
        ArrayList<c> arrayList = this.f180763b;
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            next.a();
            f180762r.a(next);
        }
        arrayList.clear();
        this.f180764c = null;
    }

    public final void m(@Y61.l com.avito.android.lib.design.tab_group.layout.b bVar) {
        v0.a(this.f180772k).remove(bVar);
    }

    public final void n(int i12) {
        c cVar = (c) C42745f0.K(Math.max(0, i12), this.f180763b);
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void o(@Y61.l c cVar, boolean z12) {
        int size;
        if (cVar == null || !cVar.f180791a) {
            return;
        }
        c cVar2 = this.f180764c;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new e(cVar2, cVar, this, z12));
        } else {
            ArrayList<com.avito.android.lib.design.tab_group.layout.b> arrayList = this.f180772k;
            if (cVar2 == cVar) {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        arrayList.get(size2).getClass();
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                a(this, cVar.f180792b);
            } else {
                int i13 = cVar.f180792b;
                if (z12) {
                    if ((cVar2 == null || cVar2.f180792b == -1) && i13 != -1) {
                        setScrollPosition(i13);
                    } else {
                        a(this, i13);
                    }
                    if (i13 != -1) {
                        setSelectedTabView(i13);
                    }
                }
                this.f180764c = cVar;
                if (cVar2 != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i14 = size - 1;
                        arrayList.get(size).getClass();
                        if (i14 < 0) {
                            break;
                        } else {
                            size = i14;
                        }
                    }
                }
                int size3 = arrayList.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i15 = size3 - 1;
                        arrayList.get(size3).a(cVar);
                        if (i15 < 0) {
                            break;
                        } else {
                            size3 = i15;
                        }
                    }
                }
            }
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (isLaidOut()) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.d(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@Y61.k AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new androidx.core.view.accessibility.f(accessibilityNodeInfo).m(f.C1754f.a(1, getTabCount(), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.f180766e
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L20
            if (r1 == 0) goto L11
            goto L33
        L11:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L33
        L20:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L33
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L33
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L33:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L7d
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.mode
            if (r0 == 0) goto L55
            if (r0 == r5) goto L4a
            r1 = 2
            if (r0 == r1) goto L55
            goto L7d
        L4a:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L7d
            goto L5f
        L55:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L7d
        L5f:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tab_group.layout.d.onMeasure(int, int):void");
    }

    public final void p(int i12, float f12, boolean z12, boolean z13) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        Float fValueOf = Float.valueOf(f12);
        if (f12 == Float.NaN) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        int iB2 = kotlin.math.b.b(i12 + fFloatValue);
        if (iB2 < 0 || iB2 >= getSlidingTabIndicator().getChildCount()) {
            return;
        }
        if (z13) {
            b slidingTabIndicator = getSlidingTabIndicator();
            ValueAnimator valueAnimator3 = slidingTabIndicator.f180783i;
            if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = slidingTabIndicator.f180783i) != null) {
                valueAnimator2.cancel();
            }
            slidingTabIndicator.selectedPosition = i12;
            slidingTabIndicator.selectionOffset = fFloatValue;
            if (!slidingTabIndicator.isLaidOut() || slidingTabIndicator.isLayoutRequested()) {
                slidingTabIndicator.addOnLayoutChangeListener(new com.avito.android.lib.design.tab_group.layout.e(slidingTabIndicator));
            } else {
                slidingTabIndicator.b();
            }
        }
        ValueAnimator valueAnimator4 = this.f180773l;
        if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.f180773l) != null) {
            valueAnimator.cancel();
        }
        scrollTo(g(fFloatValue, i12), 0);
        if (z12) {
            setSelectedTabView(iB2);
        }
    }

    public final void r(boolean z12) {
        int childCount = getSlidingTabIndicator().getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getSlidingTabIndicator().getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.mode == 1) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z12) {
                childAt.requestLayout();
            }
        }
    }

    public final void setContentInsetStart(int i12) {
        this.contentInsetStart = i12;
    }

    public final void setDefaultHeight(@U int height) {
        this.f180766e = height;
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        com.google.android.material.shape.m.b(this, elevation);
    }

    public final void setMode(int i12) {
        this.mode = i12;
    }

    public final void setSelectedTabIndicatorColor(@InterfaceC42156l int color) {
        getSlidingTabIndicator().setSelectedIndicatorColor(color);
    }

    public final void setSelectedTabIndicatorHeight(int height) {
        getSlidingTabIndicator().setSelectedIndicatorHeight(height);
    }

    public final void setTabIndicatorFullWidth(boolean tabIndicatorFullWidth) {
        this.f180771j = tabIndicatorFullWidth;
        b slidingTabIndicator = getSlidingTabIndicator();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        slidingTabIndicator.postInvalidateOnAnimation();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.tabStyle : i12);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(@Y61.k View view, int i12) {
        f(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @Y61.k
    public final FrameLayout.LayoutParams generateLayoutParams(@Y61.k AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(@Y61.k View view, @Y61.k ViewGroup.LayoutParams layoutParams) {
        f(view);
    }

    @X41.j
    public d(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(BY0.a.a(context, attributeSet, i12, 0), attributeSet, i12);
        this.f180763b = new ArrayList<>();
        this.f180765d = new RectF();
        this.slidingTabIndicator = C42727D.c(new f());
        this.f180772k = new ArrayList<>();
        this.f180774m = new y.b(12);
        setHorizontalScrollBarEnabled(false);
        super.addView(getSlidingTabIndicator(), 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = d.n.f178932L0;
        G.a(context, attributeSet, i12, 0);
        G.b(context, attributeSet, iArr, i12, 0, 8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i12, 0);
        getSlidingTabIndicator().setIndicatorGravity(0);
        this.f180769h = 300;
        typedArrayObtainStyledAttributes.recycle();
        this.f180766e = f180759o;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(@Y61.k View view, int i12, @Y61.k ViewGroup.LayoutParams layoutParams) {
        f(view);
    }

    /* compiled from: TabGroupLayout.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\f\b\u0096\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u00020\u00028B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\f\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/d$b;", "Landroid/widget/LinearLayout;", "", "color", "Lkotlin/G0;", "setSelectedIndicatorColor", "(I)V", "gravity", "setIndicatorGravity", "height", "setSelectedIndicatorHeight", "e", "I", "getSelectedPosition", "()I", "setSelectedPosition", "selectedPosition", "", "f", "F", "getSelectionOffset", "()F", "setSelectionOffset", "(F)V", "selectionOffset", "l", "getTabIndicatorGravity$annotations", "()V", "tabIndicatorGravity", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public class b extends LinearLayout {

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f180775n = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f180776b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Paint f180777c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final GradientDrawable f180778d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int selectedPosition;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public float selectionOffset;

        /* renamed from: g, reason: collision with root package name */
        public int f180781g;

        /* renamed from: h, reason: collision with root package name */
        public int f180782h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public ValueAnimator f180783i;

        /* renamed from: j, reason: collision with root package name */
        public int f180784j;

        /* renamed from: k, reason: collision with root package name */
        public int f180785k;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        public int tabIndicatorGravity;

        /* compiled from: View.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                view.removeOnLayoutChangeListener(this);
                int i22 = b.f180775n;
                b.this.b();
            }
        }

        /* compiled from: TabGroupLayout.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/tab_group/layout/d$b$b", "Landroid/animation/AnimatorListenerAdapter;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.tab_group.layout.d$b$b, reason: collision with other inner class name */
        public static final class C5315b extends AnimatorListenerAdapter {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f180790b;

            public C5315b(int i12) {
                this.f180790b = i12;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(@Y61.k Animator animator) {
                int i12 = this.f180790b;
                b bVar = b.this;
                bVar.setSelectedPosition(i12);
                bVar.setSelectionOffset(0.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(@Y61.k Animator animator) {
                b.this.setSelectedPosition(this.f180790b);
            }
        }

        public b(@Y61.l Context context) {
            super(context);
            this.f180777c = new Paint();
            this.f180778d = new GradientDrawable();
            this.selectedPosition = -1;
            this.f180781g = -1;
            this.f180782h = -1;
            this.f180784j = -1;
            this.f180785k = -1;
        }

        public void a(@Y61.k C5316d c5316d, @Y61.k RectF rectF) {
            int width = c5316d.getWidth();
            int iB2 = (int) O.b(d.f180760p, getContext());
            if (width < iB2) {
                width = iB2;
            }
            int right = (c5316d.getRight() + c5316d.getLeft()) / 2;
            int i12 = width / 2;
            rectF.set(right - i12, 0.0f, right + i12, 0.0f);
        }

        public final void b() {
            int left;
            int right;
            View childAt = getChildAt(this.selectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                d dVar = d.this;
                boolean z12 = dVar.f180771j;
                RectF rectF = dVar.f180765d;
                if (!z12 && (childAt instanceof C5316d)) {
                    a((C5316d) childAt, rectF);
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                if (this.selectionOffset > 0.0f && this.selectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.selectedPosition + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    if (!dVar.f180771j && (childAt2 instanceof C5316d)) {
                        a((C5316d) childAt2, rectF);
                        left2 = (int) rectF.left;
                        right2 = (int) rectF.right;
                    }
                    float f12 = this.selectionOffset;
                    float f13 = left2 * f12;
                    float f14 = 1.0f - f12;
                    left = (int) ((left * f14) + f13);
                    right = (int) ((f14 * right) + (f12 * right2));
                }
            }
            if (left == this.f180781g && right == this.f180782h) {
                return;
            }
            this.f180781g = left;
            this.f180782h = right;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }

        public final void c(int i12, int i13, boolean z12) {
            View childAt = getChildAt(i12);
            if (childAt == null) {
                if (!isLaidOut() || isLayoutRequested()) {
                    addOnLayoutChangeListener(new a());
                    return;
                } else {
                    b();
                    return;
                }
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            d dVar = d.this;
            if (!dVar.f180771j && (childAt instanceof C5316d)) {
                RectF rectF = dVar.f180765d;
                a((C5316d) childAt, rectF);
                int i14 = (int) rectF.left;
                right = (int) rectF.right;
                left = i14;
            }
            int i15 = this.f180781g;
            int i16 = this.f180782h;
            if (i15 == left && i16 == right) {
                return;
            }
            if (z12) {
                this.f180784j = i15;
                this.f180785k = i16;
            }
            AV.d dVar2 = new AV.d(this, left, right, 1);
            if (!z12) {
                ValueAnimator valueAnimator = this.f180783i;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator2 = this.f180783i;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(dVar2);
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator3 = new ValueAnimator();
            valueAnimator3.setInterpolator(C43707b.f413880b);
            valueAnimator3.setDuration(i13);
            valueAnimator3.setFloatValues(0.0f, 1.0f);
            valueAnimator3.addUpdateListener(dVar2);
            valueAnimator3.addListener(new C5315b(i12));
            valueAnimator3.start();
            this.f180783i = valueAnimator3;
        }

        @Override // android.view.View
        @SuppressLint({"ObsoleteSdkInt"})
        public void draw(@Y61.k Canvas canvas) {
            int height = this.f180776b;
            int height2 = 0;
            if (height < 0) {
                height = 0;
            }
            int i12 = this.tabIndicatorGravity;
            if (i12 == 0) {
                height2 = getHeight() - height;
                height = getHeight();
            } else if (i12 == 1) {
                height2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i12 != 2) {
                height = i12 != 3 ? 0 : getHeight();
            }
            int i13 = this.f180782h;
            int i14 = this.f180781g;
            if (i14 >= 0 && i14 < i13) {
                Drawable drawableMutate = this.f180778d.mutate();
                drawableMutate.setBounds(this.f180781g, height2, this.f180782h, height);
                drawableMutate.setTint(this.f180777c.getColor());
                drawableMutate.draw(canvas);
            }
            super.draw(canvas);
        }

        public final int getSelectedPosition() {
            return this.selectedPosition;
        }

        public final float getSelectionOffset() {
            return this.selectionOffset;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
            super.onLayout(z12, i12, i13, i14, i15);
            ValueAnimator valueAnimator = this.f180783i;
            if (valueAnimator == null || valueAnimator == null || !valueAnimator.isRunning()) {
                b();
            } else {
                c(this.selectedPosition, -1, false);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            super.onMeasure(i12, i13);
            if (View.MeasureSpec.getMode(i12) != 1073741824) {
                return;
            }
            d dVar = d.this;
            dVar.getClass();
            if (dVar.getMode() == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                Context context = getContext();
                d.f180758n.getClass();
                boolean z12 = true;
                if (iMax * childCount <= getMeasuredWidth() - (((int) O.b(d.f180761q, context)) * 2)) {
                    boolean z13 = false;
                    for (int i15 = 0; i15 < childCount; i15++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i15).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z13 = true;
                        }
                    }
                    z12 = z13;
                } else {
                    dVar.r(false);
                }
                if (z12) {
                    super.onMeasure(i12, i13);
                }
            }
        }

        public final void setIndicatorGravity(int gravity) {
            if (this.tabIndicatorGravity != gravity) {
                this.tabIndicatorGravity = gravity;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }

        public final void setSelectedIndicatorColor(int color) {
            Paint paint = this.f180777c;
            if (paint.getColor() != color) {
                paint.setColor(color);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }

        public final void setSelectedIndicatorHeight(int height) {
            if (this.f180776b != height) {
                this.f180776b = height;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }

        public final void setSelectedPosition(int i12) {
            this.selectedPosition = i12;
        }

        public final void setSelectionOffset(float f12) {
            this.selectionOffset = f12;
        }

        private static /* synthetic */ void getTabIndicatorGravity$annotations() {
        }
    }

    public static /* synthetic */ void getMode$annotations() {
    }

    private static /* synthetic */ void getTabGravity$annotations() {
    }
}
