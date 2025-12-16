package com.avito.android.inline_filters;

import com.avito.android.InterfaceC31096k2;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.avito.android.util.Kundle;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/w;", "", "b", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC31062w {

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.w$a */
    public static final class a {
    }

    void I();

    @Y61.k
    com.jakewharton.rxrelay3.c V0();

    @Y61.l
    List<String> W0();

    void X0(@Y61.l SearchParams searchParams);

    void Y0();

    void Z0(@Y61.l BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a<G0> aVar);

    void a1();

    @Y61.k
    com.jakewharton.rxrelay3.c b1();

    void c1();

    @Y61.k
    Kundle d0();

    @Y61.k
    com.jakewharton.rxrelay3.c d1();

    void e1();

    void f1();

    void g1();

    void h1(@Y61.l Y41.a<b> aVar);

    void i1(@Y61.l NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding);

    void j1(@Y61.l SearchParams searchParams);

    void k1(@Y61.l List<String> list);

    @Y61.k
    com.jakewharton.rxrelay3.b l1();

    void m1(@Y61.l InlineFilters inlineFilters);

    void n1(@Y61.l BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a<G0> aVar);

    void o1(@Y61.l PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.k String str, @Y61.l String str2);

    void onPause();

    void onResume();

    @Y61.k
    com.jakewharton.rxrelay3.b p1();

    void q(@Y61.k List list);

    void q1(@Y61.l NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding);

    @Y61.l
    InlineActions r1();

    void s1();

    void setSubscribed(boolean z12);

    void t1(@Y61.l String str);

    @Y61.l
    InlineFilters u1();

    void v1();

    void w1(@Y61.k InterfaceC34996m interfaceC34996m, @Y61.k InlineFilterDialogOpener inlineFilterDialogOpener, @Y61.l InterfaceC31096k2 interfaceC31096k2, @Y61.l DN.a aVar, @Y61.l PN.a aVar2);

    void x1(@Y61.l InlineActions inlineActions);

    void y1(@Y61.l Filter filter, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str);

    void z1(@Y61.l SearchParams searchParams, @Y61.l String str);

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/w$b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.w$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f172374a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final PresentationType f172375b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f172376c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f172377d;

        public b(@Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str, boolean z12) {
            this.f172374a = searchParams;
            this.f172375b = presentationType;
            this.f172376c = str;
            this.f172377d = z12;
        }

        public /* synthetic */ b(SearchParams searchParams, PresentationType presentationType, String str, boolean z12, int i12, C42822w c42822w) {
            this(searchParams, presentationType, str, (i12 & 8) != 0 ? true : z12);
        }
    }
}
