package ww;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BigFiltersAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lww/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lww/a$a;", "Lww/a$b;", "Lww/a$c;", "Lww/a$d;", "Lww/a$e;", "Lww/a$f;", "Lww/a$g;", "Lww/a$h;", "Lww/a$i;", "Lww/a$j;", "Lww/a$k;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ww.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49690a {

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/a$a;", "Lww/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12836a implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12836a f441858a = new C12836a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12836a);
        }

        public final int hashCode() {
            return -200057070;
        }

        @Y61.k
        public final String toString() {
            return "OnApplyButtonClicked";
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/a$b;", "Lww/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$b */
    public static final /* data */ class b implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441859a;

        public b(boolean z12) {
            this.f441859a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f441859a == ((b) obj).f441859a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441859a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("OnKeyboardVisibilityChanged(isVisible="), this.f441859a, ')');
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/a$c;", "Lww/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$c */
    public static final /* data */ class c implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f441860a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -981705731;
        }

        @Y61.k
        public final String toString() {
            return "OnLocationGroupParameterClicked";
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/a$d;", "Lww/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$d */
    public static final /* data */ class d implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InlineFilterValue.InlineFilterDeveloperDevelopmentValue f441861a;

        public d(@Y61.k InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue) {
            this.f441861a = inlineFilterDeveloperDevelopmentValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f441861a, ((d) obj).f441861a);
        }

        public final int hashCode() {
            return this.f441861a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnNewDeveloperDevelopmentValueSelected(value=" + this.f441861a + ')';
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/a$e;", "Lww/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$e */
    public static final /* data */ class e implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InlineFilterValue.InlineFilterNumericRangeValue f441862a;

        public e(@Y61.k InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue) {
            this.f441862a = inlineFilterNumericRangeValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f441862a, ((e) obj).f441862a);
        }

        public final int hashCode() {
            return this.f441862a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnNewQuarterValueSelected(value=" + this.f441862a + ')';
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/a$f;", "Lww/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$f */
    public static final /* data */ class f implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.conveyor_item.a f441863a;

        public f(@Y61.k com.avito.conveyor_item.a aVar) {
            this.f441863a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f441863a, ((f) obj).f441863a);
        }

        public final int hashCode() {
            return this.f441863a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnParameterValueChanged(item=" + this.f441863a + ')';
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/a$g;", "Lww/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$g */
    public static final /* data */ class g implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f441864a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1364860411;
        }

        @Y61.k
        public final String toString() {
            return "OnRefreshButtonClicked";
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/a$h;", "Lww/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$h */
    public static final /* data */ class h implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f441865a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1954385885;
        }

        @Y61.k
        public final String toString() {
            return "OnRefreshSearchResultCountTriggered";
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/a$i;", "Lww/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$i */
    public static final /* data */ class i implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f441866a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1356307153;
        }

        @Y61.k
        public final String toString() {
            return "OnResetButtonClicked";
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/a$j;", "Lww/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$j */
    public static final /* data */ class j implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f441867a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 149306140;
        }

        @Y61.k
        public final String toString() {
            return "OnScreenLoaded";
        }
    }

    /* compiled from: BigFiltersAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/a$k;", "Lww/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.a$k */
    public static final /* data */ class k implements InterfaceC49690a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f441868a;

        public k(@Y61.k SearchParams searchParams) {
            this.f441868a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f441868a, ((k) obj).f441868a);
        }

        public final int hashCode() {
            return this.f441868a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.bxcontent.mvi.entity.f.m(new StringBuilder("OnSearchParamsUpdated(searchParams="), this.f441868a, ')');
        }
    }
}
