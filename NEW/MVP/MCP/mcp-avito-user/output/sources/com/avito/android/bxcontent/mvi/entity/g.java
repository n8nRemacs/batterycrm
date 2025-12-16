package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.runtime.C22026a;
import com.avito.android.bxcontent.InterfaceC28963b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.onboarding.model.BxOnboardingStep;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import com.avito.android.search_ux_feedback.remote.SearchRemoteFeedbackEvent;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:8\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789\u0082\u0001\u0002:;¨\u0006<"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a0", "b0", "c0", "d0", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface g {

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$A;", "Lcom/avito/android/bxcontent/mvi/entity/g;", "Lcom/avito/android/bxcontent/b$a;", "Lcom/avito/android/bxcontent/mvi/entity/g$c;", "Lcom/avito/android/bxcontent/mvi/entity/g$k;", "Lcom/avito/android/bxcontent/mvi/entity/g$l;", "Lcom/avito/android/bxcontent/mvi/entity/g$m;", "Lcom/avito/android/bxcontent/mvi/entity/g$r;", "Lcom/avito/android/bxcontent/mvi/entity/g$y;", "Lcom/avito/android/bxcontent/mvi/entity/g$D;", "Lcom/avito/android/bxcontent/mvi/entity/g$Z;", "Lcom/avito/android/bxcontent/mvi/entity/g$b0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface A extends g, InterfaceC28963b.a {
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$B;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class B implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BeduinOneTimeEvent f112201a;

        public B(@Y61.k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f112201a = beduinOneTimeEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof B) && kotlin.jvm.internal.L.f(this.f112201a, ((B) obj).f112201a);
        }

        public final int hashCode() {
            return this.f112201a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ProxyBeduinFeatureOneTimeEvent(event=" + this.f112201a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001-\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$C;", "Lcom/avito/android/bxcontent/mvi/entity/g;", "Lcom/avito/android/bxcontent/b$b;", "Lcom/avito/android/bxcontent/mvi/entity/g$a;", "Lcom/avito/android/bxcontent/mvi/entity/g$b;", "Lcom/avito/android/bxcontent/mvi/entity/g$d;", "Lcom/avito/android/bxcontent/mvi/entity/g$e;", "Lcom/avito/android/bxcontent/mvi/entity/g$f;", "Lcom/avito/android/bxcontent/mvi/entity/g$g;", "Lcom/avito/android/bxcontent/mvi/entity/g$h;", "Lcom/avito/android/bxcontent/mvi/entity/g$i;", "Lcom/avito/android/bxcontent/mvi/entity/g$j;", "Lcom/avito/android/bxcontent/mvi/entity/g$n;", "Lcom/avito/android/bxcontent/mvi/entity/g$o;", "Lcom/avito/android/bxcontent/mvi/entity/g$p;", "Lcom/avito/android/bxcontent/mvi/entity/g$q;", "Lcom/avito/android/bxcontent/mvi/entity/g$s;", "Lcom/avito/android/bxcontent/mvi/entity/g$t;", "Lcom/avito/android/bxcontent/mvi/entity/g$u;", "Lcom/avito/android/bxcontent/mvi/entity/g$v;", "Lcom/avito/android/bxcontent/mvi/entity/g$w;", "Lcom/avito/android/bxcontent/mvi/entity/g$x;", "Lcom/avito/android/bxcontent/mvi/entity/g$z;", "Lcom/avito/android/bxcontent/mvi/entity/g$B;", "Lcom/avito/android/bxcontent/mvi/entity/g$E;", "Lcom/avito/android/bxcontent/mvi/entity/g$F;", "Lcom/avito/android/bxcontent/mvi/entity/g$G;", "Lcom/avito/android/bxcontent/mvi/entity/g$H;", "Lcom/avito/android/bxcontent/mvi/entity/g$I;", "Lcom/avito/android/bxcontent/mvi/entity/g$J;", "Lcom/avito/android/bxcontent/mvi/entity/g$K;", "Lcom/avito/android/bxcontent/mvi/entity/g$L;", "Lcom/avito/android/bxcontent/mvi/entity/g$M;", "Lcom/avito/android/bxcontent/mvi/entity/g$N;", "Lcom/avito/android/bxcontent/mvi/entity/g$O;", "Lcom/avito/android/bxcontent/mvi/entity/g$P;", "Lcom/avito/android/bxcontent/mvi/entity/g$Q;", "Lcom/avito/android/bxcontent/mvi/entity/g$R;", "Lcom/avito/android/bxcontent/mvi/entity/g$S;", "Lcom/avito/android/bxcontent/mvi/entity/g$T;", "Lcom/avito/android/bxcontent/mvi/entity/g$U;", "Lcom/avito/android/bxcontent/mvi/entity/g$V;", "Lcom/avito/android/bxcontent/mvi/entity/g$W;", "Lcom/avito/android/bxcontent/mvi/entity/g$X;", "Lcom/avito/android/bxcontent/mvi/entity/g$Y;", "Lcom/avito/android/bxcontent/mvi/entity/g$a0;", "Lcom/avito/android/bxcontent/mvi/entity/g$c0;", "Lcom/avito/android/bxcontent/mvi/entity/g$d0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface C extends g, InterfaceC28963b.InterfaceC3268b {
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$D;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class D implements A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112202a;

        public D(@Y61.k String str) {
            this.f112202a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && kotlin.jvm.internal.L.f(this.f112202a, ((D) obj).f112202a);
        }

        public final int hashCode() {
            return this.f112202a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("RenderBeduinContent(json="), this.f112202a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$E;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class E implements C {

        /* renamed from: a, reason: collision with root package name */
        public final int f112203a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Onboarding f112204b;

        public E(int i12, @Y61.k Onboarding onboarding) {
            this.f112203a = i12;
            this.f112204b = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof E)) {
                return false;
            }
            E e12 = (E) obj;
            return this.f112203a == e12.f112203a && kotlin.jvm.internal.L.f(this.f112204b, e12.f112204b);
        }

        public final int hashCode() {
            return this.f112204b.hashCode() + (Integer.hashCode(this.f112203a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "RequestPrepareViewForOnboarding(position=" + this.f112203a + ", onboarding=" + this.f112204b + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$F;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class F implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final F f112205a = new F();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof F);
        }

        public final int hashCode() {
            return -1270564445;
        }

        @Y61.k
        public final String toString() {
            return "ResetSectionTagsPosition";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$G;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class G implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final G f112206a = new G();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof G);
        }

        public final int hashCode() {
            return 708934482;
        }

        @Y61.k
        public final String toString() {
            return "ResetVerticalFilter";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$H;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class H implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final H f112207a = new H();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof H);
        }

        public final int hashCode() {
            return -241176914;
        }

        @Y61.k
        public final String toString() {
            return "RestartFromLauncher";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$I;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class I implements C {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112208a;

        public I(boolean z12) {
            this.f112208a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I) && this.f112208a == ((I) obj).f112208a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112208a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ScrollToStart(onNextUpdate="), this.f112208a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$J;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class J implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final J f112209a = new J();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof J);
        }

        public final int hashCode() {
            return 2006455223;
        }

        @Y61.k
        public final String toString() {
            return "SelectDatesButtonClicked";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$K;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class K implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BxContentBusiness360.Toast f112210a;

        public K(@Y61.k BxContentBusiness360.Toast toast) {
            this.f112210a = toast;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof K) && kotlin.jvm.internal.L.f(this.f112210a, ((K) obj).f112210a);
        }

        public final int hashCode() {
            return this.f112210a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowBusiness360Toast(toast=" + this.f112210a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$M;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class M implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.bxcontent.last_search_tooltip.a f112214a;

        public M(@Y61.k com.avito.android.bxcontent.last_search_tooltip.a aVar) {
            this.f112214a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof M) && kotlin.jvm.internal.L.f(this.f112214a, ((M) obj).f112214a);
        }

        public final int hashCode() {
            return this.f112214a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowLastSearchTooltip(tooltip=" + this.f112214a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$N;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class N implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final SearchParams f112215a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final NavigationBarStyle f112216b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final BxContentBusiness360.ReplaceMain f112217c;

        public N(@Y61.l SearchParams searchParams, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l BxContentBusiness360.ReplaceMain replaceMain) {
            this.f112215a = searchParams;
            this.f112216b = navigationBarStyle;
            this.f112217c = replaceMain;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof N)) {
                return false;
            }
            N n12 = (N) obj;
            return kotlin.jvm.internal.L.f(this.f112215a, n12.f112215a) && kotlin.jvm.internal.L.f(this.f112216b, n12.f112216b) && kotlin.jvm.internal.L.f(this.f112217c, n12.f112217c);
        }

        public final int hashCode() {
            SearchParams searchParams = this.f112215a;
            int iHashCode = (searchParams == null ? 0 : searchParams.hashCode()) * 31;
            NavigationBarStyle navigationBarStyle = this.f112216b;
            int iHashCode2 = (iHashCode + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
            BxContentBusiness360.ReplaceMain replaceMain = this.f112217c;
            return iHashCode2 + (replaceMain != null ? replaceMain.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ShowOnboardings(searchParams=" + this.f112215a + ", navigationBarStyle=" + this.f112216b + ", business360=" + this.f112217c + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$O;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class O implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter.AutoShowPresetFiltersDialog f112218a;

        public O(@Y61.k Filter.AutoShowPresetFiltersDialog autoShowPresetFiltersDialog) {
            this.f112218a = autoShowPresetFiltersDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof O) && kotlin.jvm.internal.L.f(this.f112218a, ((O) obj).f112218a);
        }

        public final int hashCode() {
            return this.f112218a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowPersonalFiltersChangeDialog(dialog=" + this.f112218a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$P;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class P implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ProgressInfoToastBarData f112219a;

        public P(@Y61.k ProgressInfoToastBarData progressInfoToastBarData) {
            this.f112219a = progressInfoToastBarData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof P) && kotlin.jvm.internal.L.f(this.f112219a, ((P) obj).f112219a);
        }

        public final int hashCode() {
            return this.f112219a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowProgressToast(progressToastData=" + this.f112219a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$Q;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Q implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<UxFeedbackConfigOld> f112220a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchRemoteFeedbackEvent f112221b;

        public Q(@Y61.k List list, @Y61.k SearchRemoteFeedbackEvent searchRemoteFeedbackEvent) {
            this.f112220a = list;
            this.f112221b = searchRemoteFeedbackEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Q)) {
                return false;
            }
            Q q12 = (Q) obj;
            return kotlin.jvm.internal.L.f(this.f112220a, q12.f112220a) && this.f112221b.equals(q12.f112221b);
        }

        public final int hashCode() {
            return this.f112221b.hashCode() + (this.f112220a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowRemoteUxFeedbackByEvent(uxFeedbackConfigs=" + this.f112220a + ", remoteFeedbackEvent=" + this.f112221b + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$R;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class R implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainExitOnboarding f112222a;

        public R(@Y61.k ReplaceMainExitOnboarding replaceMainExitOnboarding) {
            this.f112222a = replaceMainExitOnboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof R) && kotlin.jvm.internal.L.f(this.f112222a, ((R) obj).f112222a);
        }

        public final int hashCode() {
            return this.f112222a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowReplaceMainExitOnboarding(onboarding=" + this.f112222a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$T;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class T implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112228a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f112229b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f112230c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f112231d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f112232e;

        public T(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
            this.f112228a = str;
            this.f112229b = str2;
            this.f112230c = aVar;
            this.f112231d = aVar2;
            this.f112232e = aVar3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof T)) {
                return false;
            }
            T t12 = (T) obj;
            return kotlin.jvm.internal.L.f(this.f112228a, t12.f112228a) && kotlin.jvm.internal.L.f(this.f112229b, t12.f112229b) && kotlin.jvm.internal.L.f(this.f112230c, t12.f112230c) && kotlin.jvm.internal.L.f(this.f112231d, t12.f112231d) && kotlin.jvm.internal.L.f(this.f112232e, t12.f112232e);
        }

        public final int hashCode() {
            return this.f112232e.hashCode() + androidx.appcompat.app.r.h(androidx.appcompat.app.r.h(androidx.compose.foundation.H.d(this.f112228a.hashCode() * 31, 31, this.f112229b), 31, this.f112230c), 31, this.f112231d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSerpAdvertScrollToast(title=");
            sb2.append(this.f112228a);
            sb2.append(", subtitle=");
            sb2.append(this.f112229b);
            sb2.append(", onDismiss=");
            sb2.append(this.f112230c);
            sb2.append(", onShow=");
            sb2.append(this.f112231d);
            sb2.append(", onClose=");
            return androidx.appcompat.app.r.v(sb2, this.f112232e, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$U;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class U implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f112233a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f112234b;

        public U(@Y61.k PrintableText printableText, @Y61.k com.avito.android.component.toast.f fVar) {
            this.f112233a = printableText;
            this.f112234b = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof U)) {
                return false;
            }
            U u12 = (U) obj;
            return kotlin.jvm.internal.L.f(this.f112233a, u12.f112233a) && kotlin.jvm.internal.L.f(this.f112234b, u12.f112234b);
        }

        public final int hashCode() {
            return this.f112234b.hashCode() + (this.f112233a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowToast(message=" + this.f112233a + ", type=" + this.f112234b + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$V;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class V implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UxFeedbackConfig f112235a;

        public V(@Y61.k UxFeedbackConfig uxFeedbackConfig) {
            this.f112235a = uxFeedbackConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof V) && kotlin.jvm.internal.L.f(this.f112235a, ((V) obj).f112235a);
        }

        public final int hashCode() {
            return this.f112235a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowUxFeedbackWithConfig(uxFeedbackConfig=" + this.f112235a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$W;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class W implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f112236a;

        public W(@Y61.k SearchParams searchParams) {
            this.f112236a = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof W) && kotlin.jvm.internal.L.f(this.f112236a, ((W) obj).f112236a);
        }

        public final int hashCode() {
            return this.f112236a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return f.m(new StringBuilder("SkipBottomSheetOnboarding(searchParams="), this.f112236a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$X;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class X implements C {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112237a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112238b;

        public X(boolean z12, boolean z13) {
            this.f112237a = z12;
            this.f112238b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof X)) {
                return false;
            }
            X x12 = (X) obj;
            return this.f112237a == x12.f112237a && this.f112238b == x12.f112238b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112238b) + (Boolean.hashCode(this.f112237a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInlineActions(isVisible=");
            sb2.append(this.f112237a);
            sb2.append(", shouldInvalidate=");
            return androidx.appcompat.app.r.x(sb2, this.f112238b, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$Y;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Y implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final InlineFilters f112239a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchParams f112240b;

        public Y(@Y61.l InlineFilters inlineFilters, @Y61.k SearchParams searchParams) {
            this.f112239a = inlineFilters;
            this.f112240b = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Y)) {
                return false;
            }
            Y y12 = (Y) obj;
            return kotlin.jvm.internal.L.f(this.f112239a, y12.f112239a) && kotlin.jvm.internal.L.f(this.f112240b, y12.f112240b);
        }

        public final int hashCode() {
            InlineFilters inlineFilters = this.f112239a;
            return this.f112240b.hashCode() + ((inlineFilters == null ? 0 : inlineFilters.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInlines(inlineFilters=");
            sb2.append(this.f112239a);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f112240b, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$Z;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Z implements A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f112241a;

        public Z(@Y61.l String str) {
            this.f112241a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Z) && kotlin.jvm.internal.L.f(this.f112241a, ((Z) obj).f112241a);
        }

        public final int hashCode() {
            String str = this.f112241a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateNewSerpMapInteraction(newSerpMapInteraction="), this.f112241a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$a;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$a, reason: case insensitive filesystem */
    public static final /* data */ class C29169a implements C {

        /* renamed from: a, reason: collision with root package name */
        public final float f112242a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112243b;

        public C29169a(float f12, boolean z12) {
            this.f112242a = f12;
            this.f112243b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29169a)) {
                return false;
            }
            C29169a c29169a = (C29169a) obj;
            return Float.compare(this.f112242a, c29169a.f112242a) == 0 && this.f112243b == c29169a.f112243b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112243b) + (Float.hashCode(this.f112242a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnimatePromoHeaderToolbar(offset=");
            sb2.append(this.f112242a);
            sb2.append(", isAnimateBackground=");
            return androidx.appcompat.app.r.x(sb2, this.f112243b, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$a0;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "a", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a0 implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f112244a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final LinkedHashMap f112245b;

        /* compiled from: BxContentOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$a0$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f112246a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Long f112247b;

            /* renamed from: c, reason: collision with root package name */
            public final float f112248c;

            /* renamed from: d, reason: collision with root package name */
            public final int f112249d;

            public a() {
                this(false, null, 0.0f, 0, 15, null);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f112246a == aVar.f112246a && kotlin.jvm.internal.L.f(this.f112247b, aVar.f112247b) && Float.compare(this.f112248c, aVar.f112248c) == 0 && this.f112249d == aVar.f112249d;
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f112246a) * 31;
                Long l12 = this.f112247b;
                return Integer.hashCode(this.f112249d) + androidx.appcompat.app.r.d(this.f112248c, (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PlaybackSettings(isCommercial=");
                sb2.append(this.f112246a);
                sb2.append(", videoPositionMs=");
                sb2.append(this.f112247b);
                sb2.append(", videoVolume=");
                sb2.append(this.f112248c);
                sb2.append(", videoRepeatMode=");
                return androidx.appcompat.app.r.t(sb2, this.f112249d, ')');
            }

            public a(boolean z12, @Y61.l Long l12, float f12, int i12) {
                this.f112246a = z12;
                this.f112247b = l12;
                this.f112248c = f12;
                this.f112249d = i12;
            }

            public /* synthetic */ a(boolean z12, Long l12, float f12, int i12, int i13, C42822w c42822w) {
                this((i13 & 1) != 0 ? false : z12, (i13 & 2) != 0 ? 0L : l12, (i13 & 4) != 0 ? 0.0f : f12, (i13 & 8) != 0 ? 0 : i12);
            }
        }

        /* compiled from: BxContentOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$a0$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f112250a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f112251b;

            /* renamed from: c, reason: collision with root package name */
            public final int f112252c;

            public b(@Y61.k String str, @Y61.k String str2, int i12) {
                this.f112250a = str;
                this.f112251b = str2;
                this.f112252c = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.L.f(this.f112250a, bVar.f112250a) && kotlin.jvm.internal.L.f(this.f112251b, bVar.f112251b) && this.f112252c == bVar.f112252c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f112252c) + androidx.compose.foundation.H.d(this.f112250a.hashCode() * 31, 31, this.f112251b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VideoItemData(itemId=");
                sb2.append(this.f112250a);
                sb2.append(", videoUrl=");
                sb2.append(this.f112251b);
                sb2.append(", position=");
                return androidx.appcompat.app.r.t(sb2, this.f112252c, ')');
            }
        }

        public a0(@Y61.k ArrayList arrayList, @Y61.l LinkedHashMap linkedHashMap) {
            this.f112244a = arrayList;
            this.f112245b = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.f112244a.equals(a0Var.f112244a) && kotlin.jvm.internal.L.f(this.f112245b, a0Var.f112245b);
        }

        public final int hashCode() {
            int iHashCode = this.f112244a.hashCode() * 31;
            LinkedHashMap linkedHashMap = this.f112245b;
            return iHashCode + (linkedHashMap == null ? 0 : linkedHashMap.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdatePlaybackSnippets(idsRange=");
            sb2.append(this.f112244a);
            sb2.append(", playbackSettings=");
            return org.webrtc.h.e(sb2, this.f112245b, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$b;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$b, reason: case insensitive filesystem */
    public static final /* data */ class C29170b implements C {

        /* renamed from: a, reason: collision with root package name */
        public final float f112253a;

        public C29170b(float f12) {
            this.f112253a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29170b) && Float.compare(this.f112253a, ((C29170b) obj).f112253a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f112253a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f112253a, new StringBuilder("AnimateToolbar(offset="));
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$b0;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b0 implements A {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112254a;

        public b0(boolean z12) {
            this.f112254a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f112254a == ((b0) obj).f112254a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112254a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateScrollToTopButtonVisibility(isVisible="), this.f112254a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$c;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$c, reason: case insensitive filesystem */
    public static final /* data */ class C29171c implements A {

        /* renamed from: a, reason: collision with root package name */
        public final int f112255a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112256b;

        public C29171c(int i12, boolean z12) {
            this.f112255a = i12;
            this.f112256b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29171c)) {
                return false;
            }
            C29171c c29171c = (C29171c) obj;
            return this.f112255a == c29171c.f112255a && this.f112256b == c29171c.f112256b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112256b) + (Integer.hashCode(this.f112255a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetStateChanged(newState=");
            sb2.append(this.f112255a);
            sb2.append(", isGesture=");
            return androidx.appcompat.app.r.x(sb2, this.f112256b, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$c0;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c0 implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.search.p f112257a;

        public c0(@Y61.k com.avito.android.search.p pVar) {
            this.f112257a = pVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && kotlin.jvm.internal.L.f(this.f112257a, ((c0) obj).f112257a);
        }

        public final int hashCode() {
            return this.f112257a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateSuggestionsParams(suggestionsRemoteParams=" + this.f112257a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$d;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$d, reason: case insensitive filesystem */
    public static final /* data */ class C29172d implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BxOnboardingStep.View f112258a;

        public C29172d(@Y61.k BxOnboardingStep.View view) {
            this.f112258a = view;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29172d) && kotlin.jvm.internal.L.f(this.f112258a, ((C29172d) obj).f112258a);
        }

        public final int hashCode() {
            return this.f112258a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BxOnboardingStepShow(step=" + this.f112258a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$d0;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d0 implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarColors f112259a;

        public d0(@Y61.k UdfToolbarColors udfToolbarColors) {
            this.f112259a = udfToolbarColors;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && kotlin.jvm.internal.L.f(this.f112259a, ((d0) obj).f112259a);
        }

        public final int hashCode() {
            return this.f112259a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateUdfToolbarColors(colors=" + this.f112259a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$e;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$e, reason: case insensitive filesystem */
    public static final /* data */ class C29173e implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29173e f112260a = new C29173e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29173e);
        }

        public final int hashCode() {
            return 556503934;
        }

        @Y61.k
        public final String toString() {
            return "CloseSearchBar";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$f;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$f, reason: case insensitive filesystem */
    public static final /* data */ class C29174f implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29174f f112261a = new C29174f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29174f);
        }

        public final int hashCode() {
            return 1287282747;
        }

        @Y61.k
        public final String toString() {
            return "CloseVerticalFilter";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$g;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$g, reason: collision with other inner class name */
    public static final /* data */ class C3303g implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C3303g f112262a = new C3303g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C3303g);
        }

        public final int hashCode() {
            return 1543154269;
        }

        @Y61.k
        public final String toString() {
            return "ExitSpace";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$h;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$h, reason: case insensitive filesystem */
    public static final /* data */ class C29175h implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29175h f112263a = new C29175h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29175h);
        }

        public final int hashCode() {
            return -314796904;
        }

        @Y61.k
        public final String toString() {
            return "LeaveScreen";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$i;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$i, reason: case insensitive filesystem */
    public static final /* data */ class C29176i implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MainStartOnboardingStep f112264a;

        public C29176i(@Y61.k MainStartOnboardingStep mainStartOnboardingStep) {
            this.f112264a = mainStartOnboardingStep;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29176i) && kotlin.jvm.internal.L.f(this.f112264a, ((C29176i) obj).f112264a);
        }

        public final int hashCode() {
            return this.f112264a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MainStartOnboardingStepShow(step=" + this.f112264a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$j;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$j, reason: case insensitive filesystem */
    public static final /* data */ class C29177j implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112265a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112266b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PresentationType f112267c;

        public C29177j(@Y61.k String str, @Y61.l String str2, @Y61.k PresentationType presentationType) {
            this.f112265a = str;
            this.f112266b = str2;
            this.f112267c = presentationType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29177j)) {
                return false;
            }
            C29177j c29177j = (C29177j) obj;
            return kotlin.jvm.internal.L.f(this.f112265a, c29177j.f112265a) && kotlin.jvm.internal.L.f(this.f112266b, c29177j.f112266b) && this.f112267c == c29177j.f112267c;
        }

        public final int hashCode() {
            int iHashCode = this.f112265a.hashCode() * 31;
            String str = this.f112266b;
            return this.f112267c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "NotificationLocationChanged(locationId=" + this.f112265a + ", geoSessionId=" + this.f112266b + ", presentationType=" + this.f112267c + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$k;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$k, reason: case insensitive filesystem */
    public static final /* data */ class C29178k implements A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InlineAction.Predefined.State f112268a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112269b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f112270c;

        public C29178k(@Y61.k InlineAction.Predefined.State state, @Y61.l String str, boolean z12) {
            this.f112268a = state;
            this.f112269b = str;
            this.f112270c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29178k)) {
                return false;
            }
            C29178k c29178k = (C29178k) obj;
            return this.f112268a == c29178k.f112268a && kotlin.jvm.internal.L.f(this.f112269b, c29178k.f112269b) && this.f112270c == c29178k.f112270c;
        }

        public final int hashCode() {
            int iHashCode = this.f112268a.hashCode() * 31;
            String str = this.f112269b;
            return Boolean.hashCode(this.f112270c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyFeaturesAboutSubscriptionsState(state=");
            sb2.append(this.f112268a);
            sb2.append(", filterId=");
            sb2.append(this.f112269b);
            sb2.append(", isSubscribed=");
            return androidx.appcompat.app.r.x(sb2, this.f112270c, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$l;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$l, reason: case insensitive filesystem */
    public static final /* data */ class C29179l implements A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29179l f112271a = new C29179l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29179l);
        }

        public final int hashCode() {
            return 190025173;
        }

        @Y61.k
        public final String toString() {
            return "NotifyFeaturesSearchParamsChanged";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$m;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$m, reason: case insensitive filesystem */
    public static final /* data */ class C29180m implements A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29180m f112272a = new C29180m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29180m);
        }

        public final int hashCode() {
            return 740763687;
        }

        @Y61.k
        public final String toString() {
            return "NotifyFeaturesSerpLoad";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$n;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$n, reason: case insensitive filesystem */
    public static final /* data */ class C29181n implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoBlogArticle f112273a;

        public C29181n(@Y61.k AvitoBlogArticle avitoBlogArticle) {
            this.f112273a = avitoBlogArticle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29181n) && kotlin.jvm.internal.L.f(this.f112273a, ((C29181n) obj).f112273a);
        }

        public final int hashCode() {
            return this.f112273a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAvitoBlog(avitoBlogArticle=" + this.f112273a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$o;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$o, reason: case insensitive filesystem */
    public static final /* data */ class C29182o implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f112274a;

        public C29182o(@Y61.l DeepLink deepLink) {
            this.f112274a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29182o) && kotlin.jvm.internal.L.f(this.f112274a, ((C29182o) obj).f112274a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f112274a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenBottomSheetOnboarding(link="), this.f112274a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$p;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$p, reason: case insensitive filesystem */
    public static final class C29183p implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RubricatorRefinedItem.SerpRubricatorCategoryItem f112275a;

        public C29183p(@Y61.k RubricatorRefinedItem.SerpRubricatorCategoryItem serpRubricatorCategoryItem) {
            this.f112275a = serpRubricatorCategoryItem;
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$q;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$q, reason: case insensitive filesystem */
    public static final /* data */ class C29184q implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DealConfirmationSheet f112276a;

        public C29184q(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
            this.f112276a = dealConfirmationSheet;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29184q) && kotlin.jvm.internal.L.f(this.f112276a, ((C29184q) obj).f112276a);
        }

        public final int hashCode() {
            return this.f112276a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenDealConfirmation(sheetInfo=" + this.f112276a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$r;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$r, reason: case insensitive filesystem */
    public static final /* data */ class C29185r implements A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f112277a;

        public C29185r(@Y61.k DeepLink deepLink) {
            this.f112277a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29185r) && kotlin.jvm.internal.L.f(this.f112277a, ((C29185r) obj).f112277a);
        }

        public final int hashCode() {
            return this.f112277a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(link="), this.f112277a, ')');
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$u;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$u, reason: case insensitive filesystem */
    public static final /* data */ class C29188u implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29188u f112286a = new C29188u();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29188u);
        }

        public final int hashCode() {
            return -394871603;
        }

        @Y61.k
        public final String toString() {
            return "OpenMainScreenOnBackToAvoidAppLeaving";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$v;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$v, reason: case insensitive filesystem */
    public static final /* data */ class C29189v implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<UxFeedbackConfigOld> f112287a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112288b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final SearchSuggestInternalShowLink f112289c;

        public C29189v() {
            this(null, false, null, 7, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29189v)) {
                return false;
            }
            C29189v c29189v = (C29189v) obj;
            return kotlin.jvm.internal.L.f(this.f112287a, c29189v.f112287a) && this.f112288b == c29189v.f112288b && kotlin.jvm.internal.L.f(this.f112289c, c29189v.f112289c);
        }

        public final int hashCode() {
            List<UxFeedbackConfigOld> list = this.f112287a;
            int i12 = androidx.appcompat.app.r.i((list == null ? 0 : list.hashCode()) * 31, 31, this.f112288b);
            SearchSuggestInternalShowLink searchSuggestInternalShowLink = this.f112289c;
            return i12 + (searchSuggestInternalShowLink != null ? searchSuggestInternalShowLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "OpenSearchBar(uxFeedbackConfigs=" + this.f112287a + ", autoOpenSuggest=" + this.f112288b + ", searchSuggestLink=" + this.f112289c + ')';
        }

        public C29189v(@Y61.l List<UxFeedbackConfigOld> list, boolean z12, @Y61.l SearchSuggestInternalShowLink searchSuggestInternalShowLink) {
            this.f112287a = list;
            this.f112288b = z12;
            this.f112289c = searchSuggestInternalShowLink;
        }

        public /* synthetic */ C29189v(List list, boolean z12, SearchSuggestInternalShowLink searchSuggestInternalShowLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : searchSuggestInternalShowLink);
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$w;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$w, reason: case insensitive filesystem */
    public static final class C29190w implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RubricatorRefinedItem.SerpRubricatorServiceItem f112290a;

        public C29190w(@Y61.k RubricatorRefinedItem.SerpRubricatorServiceItem serpRubricatorServiceItem) {
            this.f112290a = serpRubricatorServiceItem;
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$x;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$x, reason: case insensitive filesystem */
    public static final /* data */ class C29191x implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ToolbarShareButton f112291a;

        public C29191x(@Y61.k ToolbarShareButton toolbarShareButton) {
            this.f112291a = toolbarShareButton;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29191x) && kotlin.jvm.internal.L.f(this.f112291a, ((C29191x) obj).f112291a);
        }

        public final int hashCode() {
            return this.f112291a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSharingDialog(toolbarShareButton=" + this.f112291a + ')';
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$y;", "Lcom/avito/android/bxcontent/mvi/entity/g$A;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$y, reason: case insensitive filesystem */
    public static final /* data */ class C29192y implements A {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29192y)) {
                return false;
            }
            ((C29192y) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -1217487446;
        }

        @Y61.k
        public final String toString() {
            return "PanelStateChanged(newState=hidden)";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$z;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$z, reason: case insensitive filesystem */
    public static final /* data */ class C29193z implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29193z f112292a = new C29193z();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29193z);
        }

        public final int hashCode() {
            return 100259992;
        }

        @Y61.k
        public final String toString() {
            return "PrepareRecsReload";
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$L;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class L implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f112211a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112212b;

        /* renamed from: c, reason: collision with root package name */
        public final int f112213c;

        public L(int i12, @Y61.l String str, @Y61.l Throwable th2) {
            this.f112211a = th2;
            this.f112212b = str;
            this.f112213c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof L)) {
                return false;
            }
            L l12 = (L) obj;
            return kotlin.jvm.internal.L.f(this.f112211a, l12.f112211a) && kotlin.jvm.internal.L.f(this.f112212b, l12.f112212b) && this.f112213c == l12.f112213c;
        }

        public final int hashCode() {
            Throwable th2 = this.f112211a;
            int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
            String str = this.f112212b;
            return Integer.hashCode(this.f112213c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(error=");
            sb2.append(this.f112211a);
            sb2.append(", message=");
            sb2.append(this.f112212b);
            sb2.append(", page=");
            return androidx.appcompat.app.r.t(sb2, this.f112213c, ')');
        }

        public /* synthetic */ L(Throwable th2, String str, int i12, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : str, (i13 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$s;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$s, reason: case insensitive filesystem */
    public static final /* data */ class C29186s implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Filter f112278a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchParams f112279b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PresentationType f112280c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f112281d;

        public C29186s(@Y61.l Filter filter, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str) {
            this.f112278a = filter;
            this.f112279b = searchParams;
            this.f112280c = presentationType;
            this.f112281d = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29186s)) {
                return false;
            }
            C29186s c29186s = (C29186s) obj;
            return kotlin.jvm.internal.L.f(this.f112278a, c29186s.f112278a) && kotlin.jvm.internal.L.f(this.f112279b, c29186s.f112279b) && this.f112280c == c29186s.f112280c && kotlin.jvm.internal.L.f(this.f112281d, c29186s.f112281d);
        }

        public final int hashCode() {
            Filter filter = this.f112278a;
            int iHashCode = (this.f112279b.hashCode() + ((filter == null ? 0 : filter.hashCode()) * 31)) * 31;
            PresentationType presentationType = this.f112280c;
            int iHashCode2 = (iHashCode + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
            String str = this.f112281d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilter(filter=");
            sb2.append(this.f112278a);
            sb2.append(", searchParams=");
            sb2.append(this.f112279b);
            sb2.append(", presentationType=");
            sb2.append(this.f112280c);
            sb2.append(", context=");
            return C22026a.c(sb2, this.f112281d, ')');
        }

        public /* synthetic */ C29186s(Filter filter, SearchParams searchParams, PresentationType presentationType, String str, int i12, C42822w c42822w) {
            this(filter, searchParams, (i12 & 4) != 0 ? null : presentationType, (i12 & 8) != 0 ? null : str);
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$t;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.g$t, reason: case insensitive filesystem */
    public static final /* data */ class C29187t implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112282a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchParams f112283b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PresentationType f112284c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f112285d;

        public C29187t(@Y61.l PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.k String str, @Y61.l String str2) {
            this.f112282a = str;
            this.f112283b = searchParams;
            this.f112284c = presentationType;
            this.f112285d = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29187t)) {
                return false;
            }
            C29187t c29187t = (C29187t) obj;
            return kotlin.jvm.internal.L.f(this.f112282a, c29187t.f112282a) && kotlin.jvm.internal.L.f(this.f112283b, c29187t.f112283b) && this.f112284c == c29187t.f112284c && kotlin.jvm.internal.L.f(this.f112285d, c29187t.f112285d);
        }

        public final int hashCode() {
            int iHashCode = (this.f112283b.hashCode() + (this.f112282a.hashCode() * 31)) * 31;
            PresentationType presentationType = this.f112284c;
            int iHashCode2 = (iHashCode + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
            String str = this.f112285d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilterWithId(filterId=");
            sb2.append(this.f112282a);
            sb2.append(", searchParams=");
            sb2.append(this.f112283b);
            sb2.append(", presentationType=");
            sb2.append(this.f112284c);
            sb2.append(", context=");
            return C22026a.c(sb2, this.f112285d, ')');
        }

        public /* synthetic */ C29187t(String str, SearchParams searchParams, PresentationType presentationType, String str2, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : presentationType, searchParams, str, (i12 & 8) != 0 ? null : str2);
        }
    }

    /* compiled from: BxContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/g$S;", "Lcom/avito/android/bxcontent/mvi/entity/g$C;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class S implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f112223a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112224b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f112225c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PresentationType f112226d;

        /* renamed from: e, reason: collision with root package name */
        public final int f112227e;

        public S(int i12, @Y61.k PresentationType presentationType, @Y61.l String str, @Y61.l Throwable th2, boolean z12) {
            this.f112223a = th2;
            this.f112224b = str;
            this.f112225c = z12;
            this.f112226d = presentationType;
            this.f112227e = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof S)) {
                return false;
            }
            S s5 = (S) obj;
            return kotlin.jvm.internal.L.f(this.f112223a, s5.f112223a) && kotlin.jvm.internal.L.f(this.f112224b, s5.f112224b) && this.f112225c == s5.f112225c && this.f112226d == s5.f112226d && this.f112227e == s5.f112227e;
        }

        public final int hashCode() {
            Throwable th2 = this.f112223a;
            int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
            String str = this.f112224b;
            return Integer.hashCode(this.f112227e) + ((this.f112226d.hashCode() + androidx.appcompat.app.r.i((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f112225c)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSavedSearchError(error=");
            sb2.append(this.f112223a);
            sb2.append(", message=");
            sb2.append(this.f112224b);
            sb2.append(", isNewSerpMapInteraction=");
            sb2.append(this.f112225c);
            sb2.append(", presentationType=");
            sb2.append(this.f112226d);
            sb2.append(", page=");
            return androidx.appcompat.app.r.t(sb2, this.f112227e, ')');
        }

        public /* synthetic */ S(Throwable th2, String str, boolean z12, PresentationType presentationType, int i12, int i13, C42822w c42822w) {
            this(i12, presentationType, (i13 & 2) != 0 ? null : str, (i13 & 1) != 0 ? null : th2, z12);
        }
    }
}
