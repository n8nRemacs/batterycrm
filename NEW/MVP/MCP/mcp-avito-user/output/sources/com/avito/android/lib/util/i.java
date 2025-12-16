package com.avito.android.lib.util;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.F0;
import androidx.core.view.J0;
import androidx.core.view.q0;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import j.D;
import j.InterfaceC42155k;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/util/i;", "", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f181373a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f181374b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f181375c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f181376d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42155k
    public static final boolean f181377e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f181378f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f181379g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f181380h;

    /* compiled from: EdgeToEdgeHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/i$a;", "Lkotlin/properties/h;", "Landroid/view/View;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements kotlin.properties.h<View, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final int f181381b;

        public a(@D int i12) {
            this.f181381b = i12;
        }

        @Y61.k
        public final Integer a(@Y61.k View view) {
            Object tag = view.getTag(this.f181381b);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            return Integer.valueOf(num != null ? num.intValue() : 0);
        }

        @Override // kotlin.properties.g
        public final /* bridge */ /* synthetic */ Object getValue(Object obj, kotlin.reflect.n nVar) {
            throw null;
        }

        @Override // kotlin.properties.h
        public final /* bridge */ /* synthetic */ void setValue(View view, kotlin.reflect.n nVar, Integer num) {
            throw null;
        }
    }

    static {
        a0 a0Var = new a0("navBarInset", "getNavBarInset(Landroid/view/View;)I", i.class);
        n0 n0Var = m0.f406844a;
        f181374b = new kotlin.reflect.n[]{n0Var.f(a0Var), n0Var.f(new a0("targetKeyboardInset", "getTargetKeyboardInset(Landroid/view/View;)I", i.class)), n0Var.f(new a0("currentAnimatedKeyboardInset", "getCurrentAnimatedKeyboardInset(Landroid/view/View;)I", i.class))};
        f181373a = new i();
        f181375c = 135;
        f181376d = 8;
        f181377e = Build.VERSION.SDK_INT >= 35;
        f181378f = new a(R.id.edge_to_edge_nav_bar_inset);
        f181379g = new a(R.id.edge_to_edge_target_keyboard_inset);
        f181380h = new a(R.id.edge_to_edge_current_animated_inset_bottom);
    }

    public static void a(@Y61.k Window window) {
        if (f181377e) {
            return;
        }
        F0.a(window, false);
        if (Build.VERSION.SDK_INT >= 35) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    public static int b(View view) {
        kotlin.reflect.n<Object> nVar = f181374b[2];
        return f181380h.a(view).intValue();
    }

    public static int c(View view) {
        kotlin.reflect.n<Object> nVar = f181374b[0];
        return f181378f.a(view).intValue();
    }

    @Y61.l
    public static C22771k d(@Y61.k View view) {
        Window window;
        J0 j0O;
        Activity activityA = C35835l0.a(view.getContext());
        if (activityA == null || (window = activityA.getWindow()) == null || (j0O = C22823h0.o(window.getDecorView())) == null) {
            return null;
        }
        return j0O.e(f181375c);
    }

    public static int e(View view) {
        kotlin.reflect.n<Object> nVar = f181374b[1];
        return f181379g.a(view).intValue();
    }

    public static void f(i iVar, View view) {
        iVar.getClass();
        l lVar = new l(view);
        if (f181377e) {
            C22823h0.R(view, new k(view, lVar));
        }
    }

    public static void g(i iVar, View view) {
        iVar.getClass();
        C22823h0.K(view, new h(view, new o(new n(4, view, q0.class, "updatePadding", "updatePadding(Landroid/view/View;IIII)V", 1), false), view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom(), false));
    }

    public static void h(i iVar, View view, Y41.r rVar, int i12) {
        iVar.getClass();
        C22823h0.K(view, new h(view, new o(rVar, false), 0, 0, 0, 0, false));
    }

    public static void i(@Y61.k View view, boolean z12) {
        if (f181377e) {
            C22823h0.K(view, new h(view, new o(new n(4, view, q0.class, "updatePadding", "updatePadding(Landroid/view/View;IIII)V", 1), z12), view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom(), z12));
        }
    }

    public static void j(i iVar, View view) {
        iVar.getClass();
        if (f181377e) {
            C22823h0.K(view, new h(view, new o(new n(4, view, q0.class, "updatePadding", "updatePadding(Landroid/view/View;IIII)V", 1), false), view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom(), false));
        }
    }

    public static void k(i iVar, ViewGroup viewGroup, Y41.r rVar) {
        iVar.getClass();
        if (f181377e) {
            h(iVar, viewGroup, rVar, 1);
        }
    }
}
