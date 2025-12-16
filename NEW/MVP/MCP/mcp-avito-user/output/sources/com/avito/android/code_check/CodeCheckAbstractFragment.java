package com.avito.android.code_check;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check_public.a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.ui.fragments.BaseFragment;
import j.D;
import j.I;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import qK0.C47313c;

/* compiled from: CodeCheckAbstractFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/CodeCheckAbstractFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/deep_linking/links/w;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CodeCheckAbstractFragment extends BaseFragment implements InterfaceC28477j.b, w {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f118595r0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f118596n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f118597o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118598p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118599q0;

    static {
        Y y12 = new Y(CodeCheckAbstractFragment.class, "scroll", "getScroll()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f118595r0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CodeCheckAbstractFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var)};
    }

    public CodeCheckAbstractFragment() {
        this(0, 0, 0, 7, null);
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        p.a(this, new a.InterfaceC3494a.b(deepLink, null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        r5().e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        int i12;
        super.onViewCreated(view, bundle);
        u5(view);
        s5();
        t5();
        View viewFindViewById = view.findViewById(this.f118596n0);
        C47313c c47313c = this.f118598p0;
        kotlin.reflect.n<Object>[] nVarArr = f118595r0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        NavBar navBar = (NavBar) view.findViewById(this.f118597o0);
        com.avito.android.code_check_public.screen.b bVar = q5().getF119334b().f119387c;
        if (bVar != null) {
            int iOrdinal = bVar.f119331b.ordinal();
            if (iOrdinal == 0) {
                i12 = R.attr.ic_arrowBack24;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.ic_close24;
            }
            navBar.c(i12, new v(this, bVar));
            com.avito.android.code_check_public.screen.a aVar = bVar.f119332c;
            if (aVar != null) {
                com.avito.android.lib.design.text_view.a aVarB = navBar.b(aVar.f119328a);
                aVarB.setOnClickListener(new com.avito.android.body_condition.h(14, this, aVar));
                Resources resources = aVarB.getResources();
                ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
                aVarB.setTextColor(resources.getColor(R.color.gray54, null));
                navBar.setActions(aVarB);
            }
        }
        C47313c c47313c2 = this.f118599q0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, navBar);
        r5().d();
    }

    @Y61.k
    public abstract com.avito.android.code_check_public.screen.h q5();

    @Y61.k
    public abstract ScreenPerformanceTracker r5();

    public abstract void s5();

    public abstract void t5();

    public abstract void u5(@Y61.k View view);

    @Y61.k
    public final com.avito.android.lib.design.toast_bar.k v5(@Y61.l PrintableText printableText, @Y61.l ApiError apiError, @Y61.l Throwable th2) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        C47313c c47313c = this.f118598p0;
        kotlin.reflect.n<Object> nVar = f118595r0[0];
        View view = (View) c47313c.a();
        PrintableText printableTextC = printableText == null ? com.avito.android.printable_text.b.c(R.string.code_check_default_error, new Serializable[0]) : printableText;
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        f.c.f125255c.getClass();
        return com.avito.android.component.toast.c.b(cVar, view, printableTextC, null, null, null, f.c.a.a(apiError, th2), 0, toastBarPosition, null, false, false, null, null, 4014);
    }

    @Y61.k
    public final void w5(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        C47313c c47313c = this.f118598p0;
        kotlin.reflect.n<Object> nVar = f118595r0[0];
        com.avito.android.component.toast.c.b(cVar, (View) c47313c.a(), printableText, null, null, null, null, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4030);
    }

    public /* synthetic */ CodeCheckAbstractFragment(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }

    public CodeCheckAbstractFragment(@I int i12, @D int i13, @D int i14) {
        super(i12);
        this.f118596n0 = i13;
        this.f118597o0 = i14;
        this.f118598p0 = new C47313c(null, 1, null);
        this.f118599q0 = new C47313c(null, 1, null);
    }
}
