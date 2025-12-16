package com.avito.android.user_stats.extended_user_stats;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.view.C23038g0;
import androidx.view.InterfaceC23040h0;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.lib.design.floating_container.b;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.select.SelectResult;
import com.avito.android.select.bottom_sheet.SelectBottomSheetActivity;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsFragment;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import com.avito.android.user_stats.extended_user_stats.I;
import com.avito.android.user_stats.extended_user_stats.J;
import com.avito.android.user_stats.extended_user_stats.metrics.a;
import com.avito.android.user_stats.extended_user_stats.metrics.item.DataMetrics;
import com.avito.android.user_stats.extended_user_stats.tabs.tab_item.UserStatsTabItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.O2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedUserStatsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/user_stats/extended_user_stats/di/b;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/f;", "<init>", "()V", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExtendedUserStatsFragment extends TabBaseFragment implements K<com.avito.android.user_stats.extended_user_stats.di.b>, InterfaceC28477j.b, com.avito.android.user_stats.extended_user_stats.list_search_dialog.f {

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final a f317014I0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f317015A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f317016B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f317017C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f317018D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<UserStatsTabItem> f317019E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f317020F0;

    /* renamed from: G0, reason: collision with root package name */
    public com.avito.android.user_stats.extended_user_stats.di.b f317021G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final QJ0.c f317022H0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f317023t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ExtendedUserStatsViewModel f317024u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public StrBookingIntentFactory f317025v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public lE.g f317026w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f317027x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.c f317028y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public SK0.b f317029z0;

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001f¨\u0006&"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsFragment$a;", "", "<init>", "()V", "", "REQ_KEY_CHART_SETTINGS", "Ljava/lang/String;", "REQ_KEY_CLEAN_CONSTRUCTOR", "REQ_KEY_CLEAN_EXPENSES", "REQ_KEY_CONFIG", "REQ_KEY_COSTS", "REQ_KEY_DYNAMICS", "REQ_KEY_DYNAMICS_AND_COST", "REQ_KEY_DYNAMICS_CONFIG", "REQ_KEY_END_DATE", "REQ_KEY_EXPENSES_CLEAN", "REQ_KEY_EXPENSES_DATA", "REQ_KEY_INDICATOR", "REQ_KEY_INDICATOR_AND_COST", "REQ_KEY_ITEM_ID", "REQ_KEY_METRIC", "REQ_KEY_SELECT_CONSTRUCTOR", "REQ_KEY_SELECT_EXPENSES", "REQ_KEY_SPACES", "REQ_KEY_SPLIT", "REQ_KEY_START_DATE", "REQ_KEY_TABS", "REQ_KEY_TABS_DATA", "REQ_KEY_TAB_POSITION", "", "REQ_SELECT_CATEGORIES", "I", "REQ_SELECT_DATES", "REQ_SELECT_EMPLOYEES", "REQ_SELECT_LOCATIONS", "REQ_SELECT_METRICS", "REQ_SELECT_SPACES", "REQ_SELECT_SPENDINGS", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ExtendedUserStatsViewModel extendedUserStatsViewModel = ExtendedUserStatsFragment.this.f317024u0;
            if (extendedUserStatsViewModel == null) {
                extendedUserStatsViewModel = null;
            }
            extendedUserStatsViewModel.O();
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            ExtendedUserStatsViewModel extendedUserStatsViewModel = ExtendedUserStatsFragment.this.f317024u0;
            if (extendedUserStatsViewModel == null) {
                extendedUserStatsViewModel = null;
            }
            List<String> list = extendedUserStatsViewModel.f317077p0;
            if (list == null || (str = (String) C42745f0.G(list)) == null) {
                str = "";
            }
            OJ0.a aVar = new OJ0.a(ExtendedUserStatsViewModel.se(extendedUserStatsViewModel.te()), str);
            InterfaceC28373a interfaceC28373a = extendedUserStatsViewModel.f317045J;
            interfaceC28373a.c(aVar);
            int iTe = extendedUserStatsViewModel.te();
            interfaceC28373a.c(new OJ0.o(iTe != 0 ? iTe != 1 ? "expenses" : "trends" : "main results", ExtendedUserStatsViewModel.se(extendedUserStatsViewModel.te())));
            extendedUserStatsViewModel.f317077p0 = C42784z0.f406748b;
            extendedUserStatsViewModel.f317057V = null;
            C23038g0<ExtendedUserStatsViewModel.f> c23038g0 = extendedUserStatsViewModel.f317054S;
            ExtendedUserStatsViewModel.f value = c23038g0.getValue();
            c23038g0.postValue(value != null ? new ExtendedUserStatsViewModel.f(value.f317113a, value.f317114b, value.f317115c, null) : null);
            extendedUserStatsViewModel.O();
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f317033c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f317034d;

        public d(View view, r rVar) {
            this.f317033c = view;
            this.f317034d = rVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String strSe;
            String str;
            int iIntValue = ((Number) obj).intValue();
            ExtendedUserStatsFragment extendedUserStatsFragment = ExtendedUserStatsFragment.this;
            ExtendedUserStatsViewModel extendedUserStatsViewModel = extendedUserStatsFragment.f317024u0;
            if (extendedUserStatsViewModel == null) {
                extendedUserStatsViewModel = null;
            }
            if (iIntValue != extendedUserStatsViewModel.te()) {
                if (iIntValue == 0) {
                    strSe = "main results";
                } else if (iIntValue != 1) {
                    strSe = "expenses";
                } else {
                    m mVar = extendedUserStatsViewModel.f317047L;
                    boolean zC2 = mVar.f317272a.c("IS_SHOWN_TOOLTIP");
                    com.avito.android.util.architecture_components.D<I> d12 = extendedUserStatsViewModel.f317056U;
                    if (!zC2) {
                        d12.postValue(I.j.f317144a);
                        SharedPreferences.Editor editorEdit = mVar.f317272a.getF316a().edit();
                        editorEdit.putBoolean("IS_SHOWN_TOOLTIP", true);
                        editorEdit.apply();
                    }
                    if (mVar.a(2, "IS_SHOWN_SPACES_TOOLTIP")) {
                        d12.postValue(I.h.f317141a);
                    }
                    strSe = "trends";
                }
                List<String> list = extendedUserStatsViewModel.f317077p0;
                if (list == null || (str = (String) C42745f0.G(list)) == null) {
                    str = "";
                }
                if (O2.a(extendedUserStatsViewModel.f317077p0)) {
                    strSe = ExtendedUserStatsViewModel.se(iIntValue);
                }
                extendedUserStatsViewModel.f317045J.c(new OJ0.y(strSe, str));
            }
            extendedUserStatsViewModel.f317044E.e(Integer.valueOf(iIntValue), "state.selected_tab.index");
            this.f317033c.postDelayed(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(extendedUserStatsFragment, 1), 300L);
            this.f317034d.b();
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            com.avito.android.deeplink_handler.handler.composite.a aVar = ExtendedUserStatsFragment.this.f317017C0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ExtendedUserStatsFragment.this.requireActivity().onBackPressed();
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$ConfigType;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$ConfigType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f2  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r41) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 1520
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsFragment.g.accept(java.lang.Object):void");
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$ConfigType;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$ConfigType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ExtendedUserStatsViewModel.ConfigType configType = (ExtendedUserStatsViewModel.ConfigType) obj;
            ExtendedUserStatsViewModel extendedUserStatsViewModel = ExtendedUserStatsFragment.this.f317024u0;
            if (extendedUserStatsViewModel == null) {
                extendedUserStatsViewModel = null;
            }
            extendedUserStatsViewModel.ue(configType, false);
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$f;", "kotlin.jvm.PlatformType", "tabsState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<ExtendedUserStatsViewModel.f, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f317039l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(1);
            this.f317039l = rVar;
        }

        @Override // Y41.l
        public final G0 invoke(ExtendedUserStatsViewModel.f fVar) throws Resources.NotFoundException {
            int i12;
            a.AbstractC5270a bVar;
            ExtendedUserStatsViewModel.f fVar2 = fVar;
            r rVar = this.f317039l;
            com.avito.android.lib.deprecated_design.tab.adapter.j<UserStatsTabItem> jVar = rVar.f317312b;
            int count = jVar.getCount();
            List<String> list = fVar2.f317113a;
            int size = list.size();
            AvitoTabLayout avitoTabLayout = rVar.f317316f;
            SafeViewPager safeViewPager = rVar.f317317g;
            if (count != size) {
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (String str : list2) {
                    arrayList.add(new UserStatsTabItem(str, str));
                }
                jVar.E5(arrayList);
                if (safeViewPager.getAdapter() == null) {
                    safeViewPager.setAdapter(new QJ0.a(rVar.f317313c.getChildFragmentManager(), 1));
                    safeViewPager.setOffscreenPageLimit(3);
                }
                androidx.viewpager.widget.a adapter = safeViewPager.getAdapter();
                if (adapter != null) {
                    adapter.h();
                }
                com.avito.android.lib.deprecated_design.tab.adapter.g<?, ?> gVarC = com.avito.android.lib.deprecated_design.tab.l.c(avitoTabLayout);
                if (gVarC != null) {
                    gVarC.d();
                }
            } else {
                int i13 = 0;
                for (Object obj : list) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    String str2 = (String) obj;
                    c.i iVarJ = avitoTabLayout.j(i13);
                    if (iVarJ != null) {
                        iVarJ.c(str2);
                    }
                    i13 = i14;
                }
            }
            int selectedTabPosition = avitoTabLayout.getSelectedTabPosition();
            int i15 = fVar2.f317114b;
            if (selectedTabPosition != i15) {
                androidx.viewpager.widget.a adapter2 = safeViewPager.getAdapter();
                if ((adapter2 != null ? adapter2.c() : 0) > i15) {
                    safeViewPager.x(i15, false);
                }
            }
            View view = rVar.f317311a;
            FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            FloatingContainer floatingContainer = frameLayout != null ? (FloatingContainer) frameLayout.findViewWithTag("TAG_FLOATING_CONTAINER") : null;
            List<Action> list3 = fVar2.f317116d;
            List<Action> list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                if (floatingContainer != null) {
                    frameLayout.removeView(floatingContainer);
                }
            } else if (floatingContainer == null) {
                Context context = avitoTabLayout.getContext();
                FloatingContainer floatingContainer2 = new FloatingContainer(context, null, 0, 0, 6, null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                floatingContainer2.setLayoutParams(layoutParams);
                floatingContainer2.setTag("TAG_FLOATING_CONTAINER");
                if (frameLayout != null) {
                    frameLayout.addView(floatingContainer2);
                }
                Action action = (Action) C42745f0.E(list3);
                UU.a aVar = new UU.a(action.getTitle(), null, false, false, false, new t(rVar, action), null, null, null, false, 990, null);
                if (list3.size() == 1) {
                    bVar = new a.AbstractC5270a.b(aVar);
                    i12 = R.attr.floatingContainerOneButtonPrimary;
                } else {
                    Action action2 = list3.get(1);
                    a.AbstractC5270a.c cVar = new a.AbstractC5270a.c(aVar, new UU.a(action2.getTitle(), null, false, false, false, new s(rVar, action2), null, null, null, false, 990, null));
                    i12 = R.attr.floatingContainerTwoVerticalButton;
                    bVar = cVar;
                }
                b.a aVar2 = com.avito.android.lib.design.floating_container.b.f179184i;
                int iJ2 = C35835l0.j(i12, context);
                aVar2.getClass();
                floatingContainer2.setStyle(b.a.b(iJ2, context));
                floatingContainer2.setState(new com.avito.android.lib.design.floating_container.a(bVar));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$c;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<ExtendedUserStatsViewModel.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f317040l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar) {
            super(1);
            this.f317040l = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.c r23) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsFragment.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/I;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<I, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f317042m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r rVar) {
            super(1);
            this.f317042m = rVar;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // Y41.l
        public final G0 invoke(I i12) {
            I i13 = i12;
            boolean z12 = i13 instanceof I.d;
            ExtendedUserStatsFragment extendedUserStatsFragment = ExtendedUserStatsFragment.this;
            if (z12) {
                ExtendedUserStatsViewModel.a aVar = ((I.d) i13).f317138a;
                StrBookingIntentFactory strBookingIntentFactory = extendedUserStatsFragment.f317025v0;
                StrBookingIntentFactory strBookingIntentFactory2 = strBookingIntentFactory != null ? strBookingIntentFactory : null;
                QJ0.c cVar = extendedUserStatsFragment.f317022H0;
                cVar.getClass();
                Date date = new Date(aVar.f317100c.getTimeInMillis());
                Calendar calendar = Calendar.getInstance();
                com.avito.android.util.K.a(calendar);
                cVar.f13675a.startActivityForResult(strBookingIntentFactory2.c(new Date(aVar.f317098a.getTimeInMillis()), new Date(aVar.f317099b.getTimeInMillis()), date, new Date(calendar.getTimeInMillis())), 5);
            } else if (i13 instanceof I.b) {
                a aVar2 = ExtendedUserStatsFragment.f317014I0;
                Bundle bundle = new Bundle();
                bundle.putBoolean("requestKeyExpensesClean", true);
                extendedUserStatsFragment.getChildFragmentManager().o0(bundle, "requestKeyCleanExpenses");
                extendedUserStatsFragment.getChildFragmentManager().o0(bundle, "requestKeyCleanConstructor");
            } else {
                boolean z13 = i13 instanceof I.j;
                r rVar = this.f317042m;
                LinearLayout linearLayout = rVar.f317319i;
                if (z13) {
                    ExtendedUserStatsViewModel.ConfigType configType = ExtendedUserStatsViewModel.ConfigType.f317086c;
                    View viewFindViewWithTag = linearLayout.findViewWithTag("SETTINGS");
                    if (viewFindViewWithTag != null) {
                        viewFindViewWithTag.postDelayed(new q(viewFindViewWithTag, rVar), 100L);
                    }
                } else if (i13 instanceof I.h) {
                    C35735g c35735g = new C35735g(0, extendedUserStatsFragment, ExtendedUserStatsFragment.class, "clickCloseSpaceTooltip", "clickCloseSpaceTooltip()V", 0);
                    View viewFindViewWithTag2 = linearLayout.findViewWithTag("SPACES");
                    if (viewFindViewWithTag2 != null) {
                        rVar.f317318h.post(new Me.m(rVar, viewFindViewWithTag2, c35735g, 27));
                    }
                } else if (i13 instanceof I.c) {
                    rVar.f317331u = true;
                } else if (i13 instanceof I.g) {
                    ((I.g) i13).getClass();
                    a aVar3 = ExtendedUserStatsFragment.f317014I0;
                    extendedUserStatsFragment.startActivityForResult(new Intent(extendedUserStatsFragment.requireContext(), (Class<?>) SelectBottomSheetActivity.class).putExtra("select_arguments", (Parcelable) null), 0);
                } else if (i13 instanceof I.e) {
                    com.avito.konveyor.adapter.j jVar = extendedUserStatsFragment.f317027x0;
                    if (jVar == null) {
                        jVar = null;
                    }
                    com.avito.konveyor.adapter.a aVar4 = extendedUserStatsFragment.f317015A0;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.c cVar2 = extendedUserStatsFragment.f317028y0;
                    if (cVar2 == null) {
                        cVar2 = null;
                    }
                    new com.avito.android.user_stats.extended_user_stats.list_search_dialog.d(jVar, aVar4, cVar2, ((I.e) i13).f317139a, extendedUserStatsFragment).e(extendedUserStatsFragment.requireContext());
                } else if (i13 instanceof I.a) {
                    I.a aVar5 = (I.a) i13;
                    StatsConfig statsConfig = aVar5.f317134a;
                    a aVar6 = ExtendedUserStatsFragment.f317014I0;
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("requestConfig", statsConfig);
                    String str = aVar5.f317135b;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1923010907:
                                if (str.equals("requestKeyIndicatorAndCost")) {
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyIndicator");
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyCosts");
                                    break;
                                }
                                break;
                            case -1833384928:
                                if (str.equals("requestKeyDynamicsAndCost")) {
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyDynamics");
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyCosts");
                                    break;
                                }
                                break;
                            case -1767710049:
                                if (str.equals("requestKeyIndicator")) {
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyIndicator");
                                    break;
                                }
                                break;
                            case -1230817578:
                                if (str.equals("requestKeyCosts")) {
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyCosts");
                                    break;
                                }
                                break;
                            case 716484996:
                                if (str.equals("requestKeyDynamics")) {
                                    extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyDynamics");
                                    break;
                                }
                                break;
                        }
                    } else {
                        extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyIndicator");
                        extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyDynamics");
                        extendedUserStatsFragment.getChildFragmentManager().o0(bundle2, "requestKeyCosts");
                    }
                } else if (i13 instanceof I.f) {
                    DataMetrics dataMetrics = ((I.f) i13).f317140a;
                    a aVar7 = ExtendedUserStatsFragment.f317014I0;
                    a.C9847a c9847a = com.avito.android.user_stats.extended_user_stats.metrics.a.f317273i;
                    C35737i c35737i = new C35737i(extendedUserStatsFragment);
                    c9847a.getClass();
                    com.avito.android.user_stats.extended_user_stats.metrics.a aVar8 = new com.avito.android.user_stats.extended_user_stats.metrics.a(null);
                    c35737i.invoke(aVar8);
                    Context contextRequireContext = extendedUserStatsFragment.requireContext();
                    com.avito.android.util.text.a aVar9 = extendedUserStatsFragment.f317016B0;
                    com.avito.android.lib.util.g.a(aVar8.a(dataMetrics, contextRequireContext, aVar9 != null ? aVar9 : null));
                } else if (i13 instanceof I.i) {
                    I.i iVar = (I.i) i13;
                    ArrayList arrayList = iVar.f317142a;
                    a aVar10 = ExtendedUserStatsFragment.f317014I0;
                    J.a aVar11 = J.f317145c;
                    com.avito.android.user_stats.extended_user_stats.k kVar = new com.avito.android.user_stats.extended_user_stats.k(arrayList, extendedUserStatsFragment, iVar.f317143b);
                    aVar11.getClass();
                    J j12 = new J(null);
                    kVar.invoke(j12);
                    Context contextRequireContext2 = extendedUserStatsFragment.requireContext();
                    com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextRequireContext2, 0);
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(contextRequireContext2);
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.items_spending_container, (ViewGroup) null);
                    dVar.G(viewInflate, true);
                    com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                    com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                    View viewFindViewById = viewInflate.findViewById(R.id.items_container_spending);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    LinearLayout linearLayout2 = (LinearLayout) viewFindViewById;
                    linearLayout2.removeAllViews();
                    ArrayList<com.avito.android.lib.design.bottom_sheet.k> arrayList2 = j12.f317146a;
                    if (arrayList2 != null) {
                        for (com.avito.android.lib.design.bottom_sheet.k kVar2 : arrayList2) {
                            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.user_stats_item_spending_dialog, (ViewGroup) null);
                            View viewFindViewById2 = viewInflate2.findViewById(R.id.tv_item_spending);
                            if (viewFindViewById2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                            }
                            TextView textView = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate2.findViewById(R.id.iv_item_spending);
                            if (viewFindViewById3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                            }
                            ImageView imageView = (ImageView) viewFindViewById3;
                            textView.setText(kVar2.f178542b);
                            Drawable drawable = kVar2.f178552l;
                            imageView.setVisibility(drawable != null ? 0 : 8);
                            imageView.setImageDrawable(drawable);
                            if (drawable != null) {
                                drawable.setTint(C35835l0.d(R.attr.black, imageView.getContext()));
                            }
                            viewInflate2.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(j12, kVar2, dVar, 20));
                            linearLayout2.addView(viewInflate2);
                        }
                    }
                    com.avito.android.lib.util.g.a(dVar);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedUserStatsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f317043b;

        /* JADX WARN: Multi-variable type inference failed */
        public l(Y41.l lVar) {
            this.f317043b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f317043b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f317043b;
        }

        public final int hashCode() {
            return this.f317043b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f317043b.invoke(obj);
        }
    }

    public ExtendedUserStatsFragment() {
        super(0, 1, null);
        this.f317018D0 = new NavigationState(false, null, 2, null);
        this.f317019E0 = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
        this.f317020F0 = new io.reactivex.rxjava3.disposables.c();
        this.f317022H0 = new QJ0.c(this);
    }

    public final void D5(Bundle bundle) {
        Object next;
        List<ExtendedUserStatsViewModel.b> list;
        String string = bundle.getString("requestKeyExpensesData");
        ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317024u0;
        if (extendedUserStatsViewModel == null) {
            extendedUserStatsViewModel = null;
        }
        if (string == null) {
            extendedUserStatsViewModel.getClass();
            extendedUserStatsViewModel.ue(ExtendedUserStatsViewModel.ConfigType.f317086c, true);
            return;
        }
        C23038g0<ExtendedUserStatsViewModel.c> c23038g0 = extendedUserStatsViewModel.f317055T;
        ExtendedUserStatsViewModel.c value = c23038g0.getValue();
        ArrayList arrayList = (value == null || (list = value.f317106a) == null) ? null : new ArrayList(list);
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ExtendedUserStatsViewModel.b) next).f317103c == ExtendedUserStatsViewModel.ConfigType.f317086c) {
                    break;
                }
            }
        }
        ExtendedUserStatsViewModel.b bVar = (ExtendedUserStatsViewModel.b) next;
        ExtendedUserStatsViewModel.b bVarA = bVar != null ? ExtendedUserStatsViewModel.b.a(bVar, null, false, string, 21) : null;
        if (bVarA != null) {
            arrayList.set(0, bVarA);
            ExtendedUserStatsViewModel.c value2 = c23038g0.getValue();
            c23038g0.postValue(value2 != null ? ExtendedUserStatsViewModel.c.a(value2, arrayList) : null);
        }
    }

    @Override // com.avito.android.user_stats.extended_user_stats.list_search_dialog.f
    public final void a3(@Y61.k SelectResult selectResult, int i12) {
        ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317024u0;
        if (extendedUserStatsViewModel == null) {
            extendedUserStatsViewModel = null;
        }
        ExtendedUserStatsViewModel.we(extendedUserStatsViewModel, i12, selectResult, null, null, null, 28);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i13 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("check_in_date");
        Date date = serializableExtra instanceof Date ? (Date) serializableExtra : null;
        Serializable serializableExtra2 = intent.getSerializableExtra("check_out_date");
        Date date2 = serializableExtra2 instanceof Date ? (Date) serializableExtra2 : null;
        SelectResult selectResult = (SelectResult) intent.getParcelableExtra("select_result");
        ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317024u0;
        ExtendedUserStatsViewModel.we(extendedUserStatsViewModel != null ? extendedUserStatsViewModel : null, i12, selectResult, date, date2, null, 16);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.user_stats.extended_user_stats.di.b bVarA = com.avito.android.user_stats.extended_user_stats.di.a.a().a(cv.c.b(this), this, com.avito.android.analytics.screens.s.c(this), getResources(), (com.avito.android.user_stats.extended_user_stats.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_stats.extended_user_stats.di.c.class));
        this.f317021G0 = bVarA;
        bVarA.ha(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.user_stats_extended, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        String string;
        String string2;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        super.onViewCreated(view, bundle);
        lE.g gVar = this.f317026w0;
        lE.g gVar2 = gVar != null ? gVar : null;
        SK0.b bVar = this.f317029z0;
        SK0.b bVar2 = bVar != null ? bVar : null;
        com.avito.android.util.text.a aVar = this.f317016B0;
        com.avito.android.util.text.a aVar2 = aVar != null ? aVar : null;
        InterfaceC28373a interfaceC28373a = this.f317023t0;
        r rVar = new r(view, this.f317019E0, this, gVar2, bVar2, aVar2, interfaceC28373a != null ? interfaceC28373a : null);
        io.reactivex.rxjava3.disposables.c cVar = this.f317020F0;
        cVar.e();
        cVar.b(rVar.f317310B.t0(new b()));
        cVar.b(rVar.f317336z.t0(new c()));
        cVar.b(rVar.f317334x.t0(new d(view, rVar)));
        cVar.b(rVar.f317335y.t0(new e()));
        cVar.b(rVar.f317309A.t0(new f()));
        cVar.b(rVar.f317332v.t0(new g()));
        cVar.b(rVar.f317333w.t0(new h()));
        Bundle arguments = getArguments();
        long j12 = arguments != null ? arguments.getLong("requestKeyStartDate", 0L) : 0L;
        Bundle arguments2 = getArguments();
        long j13 = arguments2 != null ? arguments2.getLong("requestKeyEndDate", 0L) : 0L;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("requestKeyMetric")) == null) {
            string = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string2 = arguments4.getString("requestKeyViews")) == null) {
            string2 = "";
        }
        Bundle arguments5 = getArguments();
        List<String> listM0 = (arguments5 == null || (stringArrayList2 = arguments5.getStringArrayList("requestKeyItemId")) == null) ? null : C42745f0.M0(stringArrayList2);
        Bundle arguments6 = getArguments();
        List listM02 = (arguments6 == null || (stringArrayList = arguments6.getStringArrayList("requestKeySpaces")) == null) ? null : C42745f0.M0(stringArrayList);
        ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317024u0;
        if (extendedUserStatsViewModel == null) {
            extendedUserStatsViewModel = null;
        }
        long j14 = 1000;
        long j15 = j12 * j14;
        long j16 = j13 * j14;
        extendedUserStatsViewModel.f317075n0 = string;
        extendedUserStatsViewModel.f317076o0 = string2;
        extendedUserStatsViewModel.f317077p0 = listM0;
        if (listM02 != null) {
            Iterator it = listM02.iterator();
            while (it.hasNext()) {
                extendedUserStatsViewModel.f317067f0.add(new NameIdEntity((String) it.next(), null));
            }
        }
        Calendar calendar = extendedUserStatsViewModel.f317061Z;
        Calendar calendar2 = extendedUserStatsViewModel.f317060Y;
        if (j15 == 0 || j16 == 0) {
            calendar2.add(5, -29);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
        } else {
            calendar2.setTimeInMillis(j15);
            calendar.setTimeInMillis(j15);
            extendedUserStatsViewModel.f317063b0.setTimeInMillis(j16);
            extendedUserStatsViewModel.f317062a0.setTimeInMillis(j16);
        }
        extendedUserStatsViewModel.O();
        if (O2.a(listM0)) {
            lE.g gVar3 = this.f317026w0;
            if (gVar3 == null) {
                gVar3 = null;
            }
            gVar3.getClass();
            kotlin.reflect.n<Object> nVar = lE.g.f413657e[2];
            if (((Boolean) gVar3.f413660d.a().invoke()).booleanValue()) {
                InterfaceC28373a interfaceC28373a2 = this.f317023t0;
                if (interfaceC28373a2 == null) {
                    interfaceC28373a2 = null;
                }
                interfaceC28373a2.c(new OJ0.q((String) C42745f0.E(listM0)));
            }
        } else {
            String str = string.length() == 0 ? "main results" : "trends";
            InterfaceC28373a interfaceC28373a3 = this.f317023t0;
            if (interfaceC28373a3 == null) {
                interfaceC28373a3 = null;
            }
            interfaceC28373a3.c(new OJ0.o(str, ""));
        }
        final int i12 = 0;
        getChildFragmentManager().p0("requestKeyTabs", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.user_stats.extended_user_stats.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedUserStatsFragment f317221c;

            {
                this.f317221c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str2) throws Resources.NotFoundException {
                fW0.x xVar;
                Object next;
                List<fW0.x> listJ;
                Object next2;
                List<ExtendedUserStatsViewModel.b> list;
                ExtendedUserStatsFragment extendedUserStatsFragment = this.f317221c;
                switch (i12) {
                    case 0:
                        ExtendedUserStatsViewModel extendedUserStatsViewModel2 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel2 == null) {
                            extendedUserStatsViewModel2 = null;
                        }
                        extendedUserStatsViewModel2.O();
                        ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("requestKeyTabsData");
                        Bundle arguments7 = extendedUserStatsFragment.getArguments();
                        Integer numValueOf = arguments7 != null ? Integer.valueOf(arguments7.getInt("requestKeyTabsPosition", 0)) : null;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel3 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel3 == null) {
                            extendedUserStatsViewModel3 = null;
                        }
                        List<String> listM03 = stringArrayList3 != null ? C42745f0.M0(stringArrayList3) : null;
                        extendedUserStatsViewModel3.getClass();
                        String str3 = listM03 != null ? (String) C42745f0.G(listM03) : null;
                        if (str3 == null || str3.length() == 0) {
                            extendedUserStatsViewModel3.ye(numValueOf);
                            return;
                        } else {
                            extendedUserStatsViewModel3.ze(listM03, numValueOf);
                            return;
                        }
                    case 1:
                        ExtendedUserStatsFragment.a aVar3 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    case 2:
                        ExtendedUserStatsFragment.a aVar4 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    default:
                        ExtendedUserStatsFragment.a aVar5 = ExtendedUserStatsFragment.f317014I0;
                        Parcelable parcelable = bundle2.getParcelable("requestConfig");
                        if (parcelable == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        StatsConfig statsConfig = (StatsConfig) parcelable;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel4 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel4 == null) {
                            extendedUserStatsViewModel4 = null;
                        }
                        C23038g0<ExtendedUserStatsViewModel.c> c23038g0 = extendedUserStatsViewModel4.f317055T;
                        ExtendedUserStatsViewModel.c value = c23038g0.getValue();
                        ArrayList arrayList = (value == null || (list = value.f317106a) == null) ? null : new ArrayList(list);
                        if (arrayList != null) {
                            String str4 = (String) C42745f0.E(statsConfig.f317158h);
                            fW0.h hVar = extendedUserStatsViewModel4.f317057V;
                            if (hVar == null || (listJ = hVar.j()) == null) {
                                xVar = null;
                            } else {
                                Iterator<T> it2 = listJ.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (L.f(((fW0.x) next2).getSlug(), str4)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                xVar = (fW0.x) next2;
                            }
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (((ExtendedUserStatsViewModel.b) next).f317103c == ExtendedUserStatsViewModel.ConfigType.f317092i) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            ExtendedUserStatsViewModel.b bVar3 = (ExtendedUserStatsViewModel.b) next;
                            if (!L.f(bVar3 != null ? bVar3.f317101a : null, xVar != null ? xVar.getName() : null)) {
                                extendedUserStatsViewModel4.oe(arrayList, new SelectResult("10", Collections.singletonList(new NameIdEntity(str4, xVar != null ? xVar.getName() : null)), null, 4, null), ExtendedUserStatsViewModel.ConfigType.f317092i, extendedUserStatsViewModel4.f317071j0, R.string.user_stats_costs, R.plurals.user_stats_config_counter_employees, "metrics", 1, null);
                                c23038g0.postValue(ExtendedUserStatsViewModel.c.a(value, arrayList));
                            }
                        }
                        extendedUserStatsViewModel4.f317073l0 = statsConfig;
                        Long l12 = statsConfig.f317152b;
                        if (l12 != null) {
                            extendedUserStatsViewModel4.f317060Y.setTimeInMillis(l12.longValue());
                        }
                        extendedUserStatsViewModel4.f317063b0.setTimeInMillis(statsConfig.f317153c);
                        extendedUserStatsViewModel4.f317056U.postValue(new I.a(statsConfig, "requestKeyIndicatorAndCost"));
                        return;
                }
            }
        });
        final int i13 = 1;
        getChildFragmentManager().p0("requestKeySelectExpenses", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.user_stats.extended_user_stats.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedUserStatsFragment f317221c;

            {
                this.f317221c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str2) throws Resources.NotFoundException {
                fW0.x xVar;
                Object next;
                List<fW0.x> listJ;
                Object next2;
                List<ExtendedUserStatsViewModel.b> list;
                ExtendedUserStatsFragment extendedUserStatsFragment = this.f317221c;
                switch (i13) {
                    case 0:
                        ExtendedUserStatsViewModel extendedUserStatsViewModel2 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel2 == null) {
                            extendedUserStatsViewModel2 = null;
                        }
                        extendedUserStatsViewModel2.O();
                        ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("requestKeyTabsData");
                        Bundle arguments7 = extendedUserStatsFragment.getArguments();
                        Integer numValueOf = arguments7 != null ? Integer.valueOf(arguments7.getInt("requestKeyTabsPosition", 0)) : null;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel3 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel3 == null) {
                            extendedUserStatsViewModel3 = null;
                        }
                        List<String> listM03 = stringArrayList3 != null ? C42745f0.M0(stringArrayList3) : null;
                        extendedUserStatsViewModel3.getClass();
                        String str3 = listM03 != null ? (String) C42745f0.G(listM03) : null;
                        if (str3 == null || str3.length() == 0) {
                            extendedUserStatsViewModel3.ye(numValueOf);
                            return;
                        } else {
                            extendedUserStatsViewModel3.ze(listM03, numValueOf);
                            return;
                        }
                    case 1:
                        ExtendedUserStatsFragment.a aVar3 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    case 2:
                        ExtendedUserStatsFragment.a aVar4 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    default:
                        ExtendedUserStatsFragment.a aVar5 = ExtendedUserStatsFragment.f317014I0;
                        Parcelable parcelable = bundle2.getParcelable("requestConfig");
                        if (parcelable == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        StatsConfig statsConfig = (StatsConfig) parcelable;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel4 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel4 == null) {
                            extendedUserStatsViewModel4 = null;
                        }
                        C23038g0<ExtendedUserStatsViewModel.c> c23038g0 = extendedUserStatsViewModel4.f317055T;
                        ExtendedUserStatsViewModel.c value = c23038g0.getValue();
                        ArrayList arrayList = (value == null || (list = value.f317106a) == null) ? null : new ArrayList(list);
                        if (arrayList != null) {
                            String str4 = (String) C42745f0.E(statsConfig.f317158h);
                            fW0.h hVar = extendedUserStatsViewModel4.f317057V;
                            if (hVar == null || (listJ = hVar.j()) == null) {
                                xVar = null;
                            } else {
                                Iterator<T> it2 = listJ.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (L.f(((fW0.x) next2).getSlug(), str4)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                xVar = (fW0.x) next2;
                            }
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (((ExtendedUserStatsViewModel.b) next).f317103c == ExtendedUserStatsViewModel.ConfigType.f317092i) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            ExtendedUserStatsViewModel.b bVar3 = (ExtendedUserStatsViewModel.b) next;
                            if (!L.f(bVar3 != null ? bVar3.f317101a : null, xVar != null ? xVar.getName() : null)) {
                                extendedUserStatsViewModel4.oe(arrayList, new SelectResult("10", Collections.singletonList(new NameIdEntity(str4, xVar != null ? xVar.getName() : null)), null, 4, null), ExtendedUserStatsViewModel.ConfigType.f317092i, extendedUserStatsViewModel4.f317071j0, R.string.user_stats_costs, R.plurals.user_stats_config_counter_employees, "metrics", 1, null);
                                c23038g0.postValue(ExtendedUserStatsViewModel.c.a(value, arrayList));
                            }
                        }
                        extendedUserStatsViewModel4.f317073l0 = statsConfig;
                        Long l12 = statsConfig.f317152b;
                        if (l12 != null) {
                            extendedUserStatsViewModel4.f317060Y.setTimeInMillis(l12.longValue());
                        }
                        extendedUserStatsViewModel4.f317063b0.setTimeInMillis(statsConfig.f317153c);
                        extendedUserStatsViewModel4.f317056U.postValue(new I.a(statsConfig, "requestKeyIndicatorAndCost"));
                        return;
                }
            }
        });
        final int i14 = 2;
        getChildFragmentManager().p0("requestKeySelectConstructor", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.user_stats.extended_user_stats.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedUserStatsFragment f317221c;

            {
                this.f317221c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str2) throws Resources.NotFoundException {
                fW0.x xVar;
                Object next;
                List<fW0.x> listJ;
                Object next2;
                List<ExtendedUserStatsViewModel.b> list;
                ExtendedUserStatsFragment extendedUserStatsFragment = this.f317221c;
                switch (i14) {
                    case 0:
                        ExtendedUserStatsViewModel extendedUserStatsViewModel2 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel2 == null) {
                            extendedUserStatsViewModel2 = null;
                        }
                        extendedUserStatsViewModel2.O();
                        ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("requestKeyTabsData");
                        Bundle arguments7 = extendedUserStatsFragment.getArguments();
                        Integer numValueOf = arguments7 != null ? Integer.valueOf(arguments7.getInt("requestKeyTabsPosition", 0)) : null;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel3 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel3 == null) {
                            extendedUserStatsViewModel3 = null;
                        }
                        List<String> listM03 = stringArrayList3 != null ? C42745f0.M0(stringArrayList3) : null;
                        extendedUserStatsViewModel3.getClass();
                        String str3 = listM03 != null ? (String) C42745f0.G(listM03) : null;
                        if (str3 == null || str3.length() == 0) {
                            extendedUserStatsViewModel3.ye(numValueOf);
                            return;
                        } else {
                            extendedUserStatsViewModel3.ze(listM03, numValueOf);
                            return;
                        }
                    case 1:
                        ExtendedUserStatsFragment.a aVar3 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    case 2:
                        ExtendedUserStatsFragment.a aVar4 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    default:
                        ExtendedUserStatsFragment.a aVar5 = ExtendedUserStatsFragment.f317014I0;
                        Parcelable parcelable = bundle2.getParcelable("requestConfig");
                        if (parcelable == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        StatsConfig statsConfig = (StatsConfig) parcelable;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel4 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel4 == null) {
                            extendedUserStatsViewModel4 = null;
                        }
                        C23038g0<ExtendedUserStatsViewModel.c> c23038g0 = extendedUserStatsViewModel4.f317055T;
                        ExtendedUserStatsViewModel.c value = c23038g0.getValue();
                        ArrayList arrayList = (value == null || (list = value.f317106a) == null) ? null : new ArrayList(list);
                        if (arrayList != null) {
                            String str4 = (String) C42745f0.E(statsConfig.f317158h);
                            fW0.h hVar = extendedUserStatsViewModel4.f317057V;
                            if (hVar == null || (listJ = hVar.j()) == null) {
                                xVar = null;
                            } else {
                                Iterator<T> it2 = listJ.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (L.f(((fW0.x) next2).getSlug(), str4)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                xVar = (fW0.x) next2;
                            }
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (((ExtendedUserStatsViewModel.b) next).f317103c == ExtendedUserStatsViewModel.ConfigType.f317092i) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            ExtendedUserStatsViewModel.b bVar3 = (ExtendedUserStatsViewModel.b) next;
                            if (!L.f(bVar3 != null ? bVar3.f317101a : null, xVar != null ? xVar.getName() : null)) {
                                extendedUserStatsViewModel4.oe(arrayList, new SelectResult("10", Collections.singletonList(new NameIdEntity(str4, xVar != null ? xVar.getName() : null)), null, 4, null), ExtendedUserStatsViewModel.ConfigType.f317092i, extendedUserStatsViewModel4.f317071j0, R.string.user_stats_costs, R.plurals.user_stats_config_counter_employees, "metrics", 1, null);
                                c23038g0.postValue(ExtendedUserStatsViewModel.c.a(value, arrayList));
                            }
                        }
                        extendedUserStatsViewModel4.f317073l0 = statsConfig;
                        Long l12 = statsConfig.f317152b;
                        if (l12 != null) {
                            extendedUserStatsViewModel4.f317060Y.setTimeInMillis(l12.longValue());
                        }
                        extendedUserStatsViewModel4.f317063b0.setTimeInMillis(statsConfig.f317153c);
                        extendedUserStatsViewModel4.f317056U.postValue(new I.a(statsConfig, "requestKeyIndicatorAndCost"));
                        return;
                }
            }
        });
        final int i15 = 3;
        getChildFragmentManager().p0("requestKeyDynamicsConfig", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.user_stats.extended_user_stats.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedUserStatsFragment f317221c;

            {
                this.f317221c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str2) throws Resources.NotFoundException {
                fW0.x xVar;
                Object next;
                List<fW0.x> listJ;
                Object next2;
                List<ExtendedUserStatsViewModel.b> list;
                ExtendedUserStatsFragment extendedUserStatsFragment = this.f317221c;
                switch (i15) {
                    case 0:
                        ExtendedUserStatsViewModel extendedUserStatsViewModel2 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel2 == null) {
                            extendedUserStatsViewModel2 = null;
                        }
                        extendedUserStatsViewModel2.O();
                        ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("requestKeyTabsData");
                        Bundle arguments7 = extendedUserStatsFragment.getArguments();
                        Integer numValueOf = arguments7 != null ? Integer.valueOf(arguments7.getInt("requestKeyTabsPosition", 0)) : null;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel3 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel3 == null) {
                            extendedUserStatsViewModel3 = null;
                        }
                        List<String> listM03 = stringArrayList3 != null ? C42745f0.M0(stringArrayList3) : null;
                        extendedUserStatsViewModel3.getClass();
                        String str3 = listM03 != null ? (String) C42745f0.G(listM03) : null;
                        if (str3 == null || str3.length() == 0) {
                            extendedUserStatsViewModel3.ye(numValueOf);
                            return;
                        } else {
                            extendedUserStatsViewModel3.ze(listM03, numValueOf);
                            return;
                        }
                    case 1:
                        ExtendedUserStatsFragment.a aVar3 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    case 2:
                        ExtendedUserStatsFragment.a aVar4 = ExtendedUserStatsFragment.f317014I0;
                        extendedUserStatsFragment.D5(bundle2);
                        return;
                    default:
                        ExtendedUserStatsFragment.a aVar5 = ExtendedUserStatsFragment.f317014I0;
                        Parcelable parcelable = bundle2.getParcelable("requestConfig");
                        if (parcelable == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        StatsConfig statsConfig = (StatsConfig) parcelable;
                        ExtendedUserStatsViewModel extendedUserStatsViewModel4 = extendedUserStatsFragment.f317024u0;
                        if (extendedUserStatsViewModel4 == null) {
                            extendedUserStatsViewModel4 = null;
                        }
                        C23038g0<ExtendedUserStatsViewModel.c> c23038g0 = extendedUserStatsViewModel4.f317055T;
                        ExtendedUserStatsViewModel.c value = c23038g0.getValue();
                        ArrayList arrayList = (value == null || (list = value.f317106a) == null) ? null : new ArrayList(list);
                        if (arrayList != null) {
                            String str4 = (String) C42745f0.E(statsConfig.f317158h);
                            fW0.h hVar = extendedUserStatsViewModel4.f317057V;
                            if (hVar == null || (listJ = hVar.j()) == null) {
                                xVar = null;
                            } else {
                                Iterator<T> it2 = listJ.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (L.f(((fW0.x) next2).getSlug(), str4)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                xVar = (fW0.x) next2;
                            }
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (((ExtendedUserStatsViewModel.b) next).f317103c == ExtendedUserStatsViewModel.ConfigType.f317092i) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            ExtendedUserStatsViewModel.b bVar3 = (ExtendedUserStatsViewModel.b) next;
                            if (!L.f(bVar3 != null ? bVar3.f317101a : null, xVar != null ? xVar.getName() : null)) {
                                extendedUserStatsViewModel4.oe(arrayList, new SelectResult("10", Collections.singletonList(new NameIdEntity(str4, xVar != null ? xVar.getName() : null)), null, 4, null), ExtendedUserStatsViewModel.ConfigType.f317092i, extendedUserStatsViewModel4.f317071j0, R.string.user_stats_costs, R.plurals.user_stats_config_counter_employees, "metrics", 1, null);
                                c23038g0.postValue(ExtendedUserStatsViewModel.c.a(value, arrayList));
                            }
                        }
                        extendedUserStatsViewModel4.f317073l0 = statsConfig;
                        Long l12 = statsConfig.f317152b;
                        if (l12 != null) {
                            extendedUserStatsViewModel4.f317060Y.setTimeInMillis(l12.longValue());
                        }
                        extendedUserStatsViewModel4.f317063b0.setTimeInMillis(statsConfig.f317153c);
                        extendedUserStatsViewModel4.f317056U.postValue(new I.a(statsConfig, "requestKeyIndicatorAndCost"));
                        return;
                }
            }
        });
        ExtendedUserStatsViewModel extendedUserStatsViewModel2 = this.f317024u0;
        if (extendedUserStatsViewModel2 == null) {
            extendedUserStatsViewModel2 = null;
        }
        extendedUserStatsViewModel2.f317079r0.observe(getViewLifecycleOwner(), new l(new i(rVar)));
        ExtendedUserStatsViewModel extendedUserStatsViewModel3 = this.f317024u0;
        if (extendedUserStatsViewModel3 == null) {
            extendedUserStatsViewModel3 = null;
        }
        extendedUserStatsViewModel3.f317080s0.observe(getViewLifecycleOwner(), new l(new j(rVar)));
        ExtendedUserStatsViewModel extendedUserStatsViewModel4 = this.f317024u0;
        (extendedUserStatsViewModel4 != null ? extendedUserStatsViewModel4 : null).f317078q0.observe(getViewLifecycleOwner(), new l(new k(rVar)));
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.user_stats.extended_user_stats.di.b bVar = this.f317021G0;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF81198U0() {
        return this.f317018D0;
    }
}
