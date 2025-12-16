package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.serpomap_behavior.SwitchSerpMapButtonState;
import com.avito.android.serp.adapter.l1;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class q {

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final b f112363s = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f112364a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f112365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final z f112366c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final x f112367d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final y f112368e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C f112369f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f112370g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final w f112371h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final B f112372i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final i f112373j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final g f112374k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final d f112375l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final e f112376m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final InlineAction.Predefined.State f112377n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final v f112378o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final f f112379p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final A f112380q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final u f112381r;

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112382a;

        public a(boolean z12) {
            this.f112382a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f112382a == ((a) obj).f112382a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112382a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("BottomEntryPointState(isVisible="), this.f112382a, ')');
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$b;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$c;", "", "a", "b", "Lcom/avito/android/bxcontent/mvi/entity/q$c$a;", "Lcom/avito/android/bxcontent/mvi/entity/q$c$b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: BxContentViewState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$c$a;", "Lcom/avito/android/bxcontent/mvi/entity/q$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<l1> f112383a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<C29126a.b> f112384b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Y61.k List<? extends l1> list, @Y61.k List<C29126a.b> list2) {
                this.f112383a = list;
                this.f112384b = list2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f112383a, aVar.f112383a) && L.f(this.f112384b, aVar.f112384b);
            }

            public final int hashCode() {
                return this.f112384b.hashCode() + (this.f112383a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BeduinV2(headingList=");
                sb2.append(this.f112383a);
                sb2.append(", nativeBlocks=");
                return H.p(sb2, this.f112384b, ')');
            }
        }

        /* compiled from: BxContentViewState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$c$b;", "Lcom/avito/android/bxcontent/mvi/entity/q$c;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public static final a f112385e = new a(null);

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<l1> f112386a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<l1> f112387b;

            /* renamed from: c, reason: collision with root package name */
            public final int f112388c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final ArrayList f112389d;

            /* compiled from: BxContentViewState.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$c$b$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                public a() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(@Y61.k List<? extends l1> list, @Y61.k List<? extends l1> list2, int i12) {
                this.f112386a = list;
                this.f112387b = list2;
                this.f112388c = i12;
                this.f112389d = C42745f0.h0(list2, list);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f112386a, bVar.f112386a) && L.f(this.f112387b, bVar.f112387b) && this.f112388c == bVar.f112388c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f112388c) + H.e(this.f112386a.hashCode() * 31, 31, this.f112387b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Native(headingList=");
                sb2.append(this.f112386a);
                sb2.append(", currentFeedContentItems=");
                sb2.append(this.f112387b);
                sb2.append(", bottomSheetState=");
                return androidx.appcompat.app.r.t(sb2, this.f112388c, ')');
            }
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$d;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NavigationState f112390a;

        public d(@Y61.k NavigationState navigationState) {
            this.f112390a = navigationState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f112390a, ((d) obj).f112390a);
        }

        public final int hashCode() {
            return this.f112390a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ScreenNavigationState(navigationState=" + this.f112390a + ')';
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$e;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<ShortcutNavigationItem> f112391a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112392b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@Y61.k List<? extends ShortcutNavigationItem> list, boolean z12) {
            this.f112391a = list;
            this.f112392b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f112391a, eVar.f112391a) && this.f112392b == eVar.f112392b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112392b) + (this.f112391a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShortcutState(items=");
            sb2.append(this.f112391a);
            sb2.append(", showShortcutUpperBlock=");
            return androidx.appcompat.app.r.x(sb2, this.f112392b, ')');
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$f;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SwitchSerpMapButtonState f112393a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112394b;

        public f(@Y61.k SwitchSerpMapButtonState switchSerpMapButtonState, boolean z12) {
            this.f112393a = switchSerpMapButtonState;
            this.f112394b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f112393a, fVar.f112393a) && this.f112394b == fVar.f112394b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112394b) + (this.f112393a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SwitchSerpMapButtonViewState(buttonState=");
            sb2.append(this.f112393a);
            sb2.append(", isNewSerpMapAvailable=");
            return androidx.appcompat.app.r.x(sb2, this.f112394b, ')');
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$g;", "", "a", "b", "Lcom/avito/android/bxcontent/mvi/entity/q$g$a;", "Lcom/avito/android/bxcontent/mvi/entity/q$g$b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface g {

        /* compiled from: BxContentViewState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$g$a;", "Lcom/avito/android/bxcontent/mvi/entity/q$g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements g {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ToolbarConfig f112395a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final ToolbarShareButton f112396b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f112397c;

            public a(@Y61.k ToolbarConfig toolbarConfig, @Y61.l ToolbarShareButton toolbarShareButton, boolean z12) {
                this.f112395a = toolbarConfig;
                this.f112396b = toolbarShareButton;
                this.f112397c = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f112395a, aVar.f112395a) && L.f(this.f112396b, aVar.f112396b) && this.f112397c == aVar.f112397c;
            }

            public final int hashCode() {
                int iHashCode = this.f112395a.hashCode() * 31;
                ToolbarShareButton toolbarShareButton = this.f112396b;
                return Boolean.hashCode(this.f112397c) + ((iHashCode + (toolbarShareButton == null ? 0 : toolbarShareButton.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ColoredToolbarState(config=");
                sb2.append(this.f112395a);
                sb2.append(", shareButton=");
                sb2.append(this.f112396b);
                sb2.append(", isSearchOpened=");
                return androidx.appcompat.app.r.x(sb2, this.f112397c, ')');
            }
        }

        /* compiled from: BxContentViewState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$g$b;", "Lcom/avito/android/bxcontent/mvi/entity/q$g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements g {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final NavigationBarStyle f112398a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f112399b;

            public b(@Y61.k NavigationBarStyle navigationBarStyle, boolean z12) {
                this.f112398a = navigationBarStyle;
                this.f112399b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f112398a, bVar.f112398a) && this.f112399b == bVar.f112399b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f112399b) + (this.f112398a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigationBarState(style=");
                sb2.append(this.f112398a);
                sb2.append(", isSearchOpened=");
                return androidx.appcompat.app.r.x(sb2, this.f112399b, ')');
            }
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$h;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f112400a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112401b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f112402c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f112403d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final SerpDisplayType f112404e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final PresentationType f112405f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final LoadState f112406g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f112407h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f112408i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f112409j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f112410k;

        public h(@Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k PresentationType presentationType, @Y61.k LoadState loadState, boolean z13, boolean z14, boolean z15) {
            this.f112400a = searchParams;
            this.f112401b = str;
            this.f112402c = str2;
            this.f112403d = z12;
            this.f112404e = serpDisplayType;
            this.f112405f = presentationType;
            this.f112406g = loadState;
            this.f112407h = z13;
            this.f112408i = z14;
            this.f112409j = z15;
            this.f112410k = C35800g5.a(new C35792f5(str));
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f112400a, hVar.f112400a) && L.f(this.f112401b, hVar.f112401b) && L.f(this.f112402c, hVar.f112402c) && this.f112403d == hVar.f112403d && this.f112404e == hVar.f112404e && this.f112405f == hVar.f112405f && this.f112406g == hVar.f112406g && this.f112407h == hVar.f112407h && this.f112408i == hVar.f112408i && this.f112409j == hVar.f112409j;
        }

        public final int hashCode() {
            int iHashCode = this.f112400a.hashCode() * 31;
            String str = this.f112401b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f112402c;
            return Boolean.hashCode(this.f112409j) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f112406g.hashCode() + ((this.f112405f.hashCode() + com.avito.android.actions_sheet.a.h(this.f112404e, androidx.appcompat.app.r.i((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f112403d), 31)) * 31)) * 31, 31, this.f112407h), 31, this.f112408i);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UtilsState(searchParams=");
            sb2.append(this.f112400a);
            sb2.append(", context=");
            sb2.append(this.f112401b);
            sb2.append(", xHash=");
            sb2.append(this.f112402c);
            sb2.append(", isVerticalMain=");
            sb2.append(this.f112403d);
            sb2.append(", displayType=");
            sb2.append(this.f112404e);
            sb2.append(", presentationType=");
            sb2.append(this.f112405f);
            sb2.append(", loadingState=");
            sb2.append(this.f112406g);
            sb2.append(", isActionHorizontalBlockLoadedWithInlines=");
            sb2.append(this.f112407h);
            sb2.append(", isLottieProgressOverlayVisible=");
            sb2.append(this.f112408i);
            sb2.append(", isSnippetRedesign=");
            return androidx.appcompat.app.r.x(sb2, this.f112409j, ')');
        }
    }

    /* compiled from: BxContentViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/q$i;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final l1 f112411a;

        public i(@Y61.l l1 l1Var) {
            this.f112411a = l1Var;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f112411a, ((i) obj).f112411a);
        }

        public final int hashCode() {
            l1 l1Var = this.f112411a;
            if (l1Var == null) {
                return 0;
            }
            return l1Var.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VerticalToolbarState(item=" + this.f112411a + ')';
        }
    }

    public q(@Y61.k h hVar, @Y61.k c cVar, @Y61.l z zVar, @Y61.l x xVar, @Y61.l y yVar, @Y61.k C c12, @Y61.k a aVar, @Y61.k w wVar, @Y61.l B b12, @Y61.l i iVar, @Y61.l g gVar, @Y61.k d dVar, @Y61.l e eVar, @Y61.l InlineAction.Predefined.State state, @Y61.k v vVar, @Y61.l f fVar, @Y61.l A a12, @Y61.l u uVar) {
        this.f112364a = hVar;
        this.f112365b = cVar;
        this.f112366c = zVar;
        this.f112367d = xVar;
        this.f112368e = yVar;
        this.f112369f = c12;
        this.f112370g = aVar;
        this.f112371h = wVar;
        this.f112372i = b12;
        this.f112373j = iVar;
        this.f112374k = gVar;
        this.f112375l = dVar;
        this.f112376m = eVar;
        this.f112377n = state;
        this.f112378o = vVar;
        this.f112379p = fVar;
        this.f112380q = a12;
        this.f112381r = uVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f112364a, qVar.f112364a) && L.f(this.f112365b, qVar.f112365b) && L.f(this.f112366c, qVar.f112366c) && L.f(this.f112367d, qVar.f112367d) && L.f(this.f112368e, qVar.f112368e) && L.f(this.f112369f, qVar.f112369f) && L.f(this.f112370g, qVar.f112370g) && L.f(this.f112371h, qVar.f112371h) && L.f(this.f112372i, qVar.f112372i) && L.f(this.f112373j, qVar.f112373j) && L.f(this.f112374k, qVar.f112374k) && L.f(this.f112375l, qVar.f112375l) && L.f(this.f112376m, qVar.f112376m) && this.f112377n == qVar.f112377n && L.f(this.f112378o, qVar.f112378o) && L.f(this.f112379p, qVar.f112379p) && L.f(this.f112380q, qVar.f112380q) && L.f(this.f112381r, qVar.f112381r);
    }

    public final int hashCode() {
        int iHashCode = (this.f112365b.hashCode() + (this.f112364a.hashCode() * 31)) * 31;
        z zVar = this.f112366c;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        x xVar = this.f112367d;
        int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        y yVar = this.f112368e;
        int iHashCode4 = (this.f112371h.hashCode() + androidx.appcompat.app.r.i((this.f112369f.hashCode() + ((iHashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31)) * 31, 31, this.f112370g.f112382a)) * 31;
        B b12 = this.f112372i;
        int iHashCode5 = (iHashCode4 + (b12 == null ? 0 : b12.hashCode())) * 31;
        i iVar = this.f112373j;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        g gVar = this.f112374k;
        int iHashCode7 = (this.f112375l.f112390a.hashCode() + ((iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        e eVar = this.f112376m;
        int iHashCode8 = (iHashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        InlineAction.Predefined.State state = this.f112377n;
        int iHashCode9 = (this.f112378o.hashCode() + ((iHashCode8 + (state == null ? 0 : state.hashCode())) * 31)) * 31;
        f fVar = this.f112379p;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        A a12 = this.f112380q;
        int iHashCode11 = (iHashCode10 + (a12 == null ? 0 : a12.hashCode())) * 31;
        u uVar = this.f112381r;
        return iHashCode11 + (uVar != null ? uVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BxContentViewState(utils=" + this.f112364a + ", contentState=" + this.f112365b + ", searchPromoHeaderState=" + this.f112366c + ", heroBannerState=" + this.f112367d + ", recsReloadState=" + this.f112368e + ", universalButtonState=" + this.f112369f + ", bottomEntryPointState=" + this.f112370g + ", headerBarState=" + this.f112371h + ", udfToolbar=" + this.f112372i + ", verticalToolbarState=" + this.f112373j + ", toolbarState=" + this.f112374k + ", screenNavigationState=" + this.f112375l + ", shortcutState=" + this.f112376m + ", subscriptionInlineActionState=" + this.f112377n + ", floatingPromoWidgetState=" + this.f112378o + ", switchSerpMapButtonViewState=" + this.f112379p + ", serpMapSelectDatesButtonState=" + this.f112380q + ", filterHintToastState=" + this.f112381r + ')';
    }
}
