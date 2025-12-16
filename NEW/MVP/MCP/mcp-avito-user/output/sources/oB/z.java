package oB;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTab;
import com.avito.android.extended_profile_widgets.adapter.search.search_button.SearchButtonItem;
import com.avito.android.extended_profile_widgets.adapter.search.search_load_error.SearchLoadErrorItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LoB/z;", "LoB/k;", "a", "b", "c", "d", "e", "f", "g", "LoB/z$a;", "LoB/z$b;", "LoB/z$c;", "LoB/z$d;", "LoB/z$e;", "LoB/z$f;", "LoB/z$g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface z extends k {

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LoB/z$a;", "LoB/z;", "a", "b", "LoB/z$a$a;", "LoB/z$a$b;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends z {

        /* compiled from: ExtendedProfileWidgetAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$a$a;", "LoB/z$a;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oB.z$a$a, reason: collision with other inner class name */
        public static final class C12170a implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ShortcutNavigationItem f419540b;

            public C12170a(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
                this.f419540b = shortcutNavigationItem;
            }
        }

        /* compiled from: ExtendedProfileWidgetAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$a$b;", "LoB/z$a;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f419541b;

            public b(@Y61.k String str) {
                this.f419541b = str;
            }
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LoB/z$b;", "LoB/z;", "a", "b", "c", "LoB/z$b$a;", "LoB/z$b$b;", "LoB/z$b$c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends z {

        /* compiled from: ExtendedProfileWidgetAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoB/z$b$a;", "LoB/z$b;", "<init>", "()V", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f419542b = new a();
        }

        /* compiled from: ExtendedProfileWidgetAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$b$b;", "LoB/z$b;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oB.z$b$b, reason: collision with other inner class name */
        public static final class C12171b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f419543b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f419544c;

            public C12171b(@Y61.k String str, boolean z12) {
                this.f419543b = str;
                this.f419544c = z12;
            }
        }

        /* compiled from: ExtendedProfileWidgetAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoB/z$b$c;", "LoB/z$b;", "<init>", "()V", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f419545b = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1447665136;
            }

            @Y61.k
            public final String toString() {
                return "ShowSuggests";
            }
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$c;", "LoB/z;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements z {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchButtonItem f419546b;

        public c(@Y61.k SearchButtonItem searchButtonItem) {
            this.f419546b = searchButtonItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f419546b, ((c) obj).f419546b);
        }

        public final int hashCode() {
            return this.f419546b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SearchButtonAction(item=" + this.f419546b + ')';
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$d;", "LoB/z;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements z {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f419547b;

        public d(@Y61.k DeepLink deepLink) {
            this.f419547b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f419547b, ((d) obj).f419547b);
        }

        public final int hashCode() {
            return this.f419547b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SearchCorrectionItemAction(deepLink="), this.f419547b, ')');
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$e;", "LoB/z;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements z {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f419548b;

        public e(@Y61.k DeepLink deepLink) {
            this.f419548b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f419548b, ((e) obj).f419548b);
        }

        public final int hashCode() {
            return this.f419548b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SearchGeoClickAction(deepLink="), this.f419548b, ')');
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$f;", "LoB/z;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements z {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchLoadErrorItem f419549b;

        public f(@Y61.k SearchLoadErrorItem searchLoadErrorItem) {
            this.f419549b = searchLoadErrorItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f419549b, ((f) obj).f419549b);
        }

        public final int hashCode() {
            return this.f419549b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SearchLoadErrorAction(item=" + this.f419549b + ')';
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/z$g;", "LoB/z;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements z {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ExtendedProfileSearchTab f419550b;

        public g(@Y61.k ExtendedProfileSearchTab extendedProfileSearchTab) {
            this.f419550b = extendedProfileSearchTab;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f419550b, ((g) obj).f419550b);
        }

        public final int hashCode() {
            return this.f419550b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SearchTabClickAction(tab=" + this.f419550b + ')';
        }
    }
}
