package Iw;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import oi0.C44783b;

/* compiled from: LocationGroupAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LIw/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LIw/a$a;", "LIw/a$b;", "LIw/a$c;", "LIw/a$d;", "LIw/a$e;", "LIw/a$f;", "LIw/a$g;", "LIw/a$h;", "LIw/a$i;", "LIw/a$j;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC14163a {

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$a;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0493a implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0493a f8608a = new C0493a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0493a);
        }

        public final int hashCode() {
            return -486131278;
        }

        @k
        public final String toString() {
            return "OnApplyButtonClicked";
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$b;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$b */
    public static final /* data */ class b implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f8609a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1761964558;
        }

        @k
        public final String toString() {
            return "OnDistrictsCleared";
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIw/a$c;", "LIw/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$c */
    public static final /* data */ class c implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f8610a;

        public c(@k List<String> list) {
            this.f8610a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f8610a, ((c) obj).f8610a);
        }

        public final int hashCode() {
            return this.f8610a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OnDistrictsSelected(districtIds="), this.f8610a, ')');
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIw/a$d;", "LIw/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$d */
    public static final /* data */ class d implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C44783b f8611a;

        public d(@k C44783b c44783b) {
            this.f8611a = c44783b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f8611a, ((d) obj).f8611a);
        }

        public final int hashCode() {
            return this.f8611a.hashCode();
        }

        @k
        public final String toString() {
            return "OnLocationSelected(location=" + this.f8611a + ')';
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$e;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$e */
    public static final /* data */ class e implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f8612a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 848960959;
        }

        @k
        public final String toString() {
            return "OnMetroStationsCleared";
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIw/a$f;", "LIw/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$f */
    public static final /* data */ class f implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f8613a;

        public f(@k List<String> list) {
            this.f8613a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f8613a, ((f) obj).f8613a);
        }

        public final int hashCode() {
            return this.f8613a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OnMetroStationsSelected(metroStationIds="), this.f8613a, ')');
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$g;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$g */
    public static final /* data */ class g implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f8614a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1404267355;
        }

        @k
        public final String toString() {
            return "OnRefreshButtonClicked";
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$h;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$h */
    public static final /* data */ class h implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f8615a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1070232945;
        }

        @k
        public final String toString() {
            return "OnResetButtonClicked";
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$i;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$i */
    public static final /* data */ class i implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f8616a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1673150243;
        }

        @k
        public final String toString() {
            return "OnScreenClosed";
        }
    }

    /* compiled from: LocationGroupAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/a$j;", "LIw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.a$j */
    public static final /* data */ class j implements InterfaceC14163a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f8617a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1933151676;
        }

        @k
        public final String toString() {
            return "OnScreenLoaded";
        }
    }
}
