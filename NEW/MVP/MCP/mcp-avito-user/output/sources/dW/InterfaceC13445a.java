package Dw;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomDevelopmentAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LDw/a;", "", "a", "b", "c", "d", "e", "f", "LDw/a$a;", "LDw/a$b;", "LDw/a$c;", "LDw/a$d;", "LDw/a$e;", "LDw/a$f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13445a {

    /* compiled from: DealRoomDevelopmentAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDw/a$a;", "LDw/a;", "a", "b", "LDw/a$a$a;", "LDw/a$a$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.a$a, reason: collision with other inner class name */
    public interface InterfaceC0201a extends InterfaceC13445a {

        /* compiled from: DealRoomDevelopmentAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/a$a$a;", "LDw/a$a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dw.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0202a implements InterfaceC0201a {

            /* renamed from: a, reason: collision with root package name */
            public final long f3521a;

            public C0202a(long j12) {
                this.f3521a = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0202a) && this.f3521a == ((C0202a) obj).f3521a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f3521a);
            }

            @k
            public final String toString() {
                return r.u(new StringBuilder("OnBookButtonClicked(lotId="), this.f3521a, ')');
            }
        }

        /* compiled from: DealRoomDevelopmentAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/a$a$b;", "LDw/a$a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dw.a$a$b */
        public static final /* data */ class b implements InterfaceC0201a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f3522a;

            public b(@k String str) {
                this.f3522a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f3522a, ((b) obj).f3522a);
            }

            public final int hashCode() {
                return this.f3522a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("OnShowPriceCommissionTooltipClicked(tooltipText="), this.f3522a, ')');
            }
        }
    }

    /* compiled from: DealRoomDevelopmentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/a$b;", "LDw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.a$b */
    public static final /* data */ class b implements InterfaceC13445a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f3523a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 713689384;
        }

        @k
        public final String toString() {
            return "OnClientFixationButtonClicked";
        }
    }

    /* compiled from: DealRoomDevelopmentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/a$c;", "LDw/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.a$c */
    public static final /* data */ class c implements InterfaceC13445a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC14249c f3524a;

        public c(@k InterfaceC14249c interfaceC14249c) {
            this.f3524a = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3524a, ((c) obj).f3524a);
        }

        public final int hashCode() {
            return this.f3524a.hashCode();
        }

        @k
        public final String toString() {
            return "OnDeeplinkResult(result=" + this.f3524a + ')';
        }
    }

    /* compiled from: DealRoomDevelopmentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/a$d;", "LDw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.a$d */
    public static final /* data */ class d implements InterfaceC13445a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f3525a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -82744543;
        }

        @k
        public final String toString() {
            return "OnFindFlatButtonClicked";
        }
    }

    /* compiled from: DealRoomDevelopmentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/a$e;", "LDw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.a$e */
    public static final /* data */ class e implements InterfaceC13445a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f3526a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1106484722;
        }

        @k
        public final String toString() {
            return "OnMainContentDeveloperPageLinkClicked";
        }
    }

    /* compiled from: DealRoomDevelopmentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/a$f;", "LDw/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.a$f */
    public static final /* data */ class f implements InterfaceC13445a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f3527a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1805988410;
        }

        @k
        public final String toString() {
            return "OnToolbarNavigationClicked";
        }
    }
}
