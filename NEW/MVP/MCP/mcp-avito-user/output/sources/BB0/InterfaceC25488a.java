package bB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpaInfoAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LbB0/a;", "", "a", "b", "c", "d", "e", "f", "g", "LbB0/a$a;", "LbB0/a$b;", "LbB0/a$c;", "LbB0/a$d;", "LbB0/a$e;", "LbB0/a$f;", "LbB0/a$g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC25488a {

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbB0/a$a;", "LbB0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$a, reason: collision with other inner class name */
    public static final class C1995a implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1995a f56980a = new C1995a();
    }

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/a$b;", "LbB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$b */
    public static final /* data */ class b implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.tariff.cpa.info.ui.items.balance_info.a f56981a;

        public b(@k com.avito.android.tariff.cpa.info.ui.items.balance_info.a aVar) {
            this.f56981a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f56981a, ((b) obj).f56981a);
        }

        public final int hashCode() {
            return this.f56981a.hashCode();
        }

        @k
        public final String toString() {
            return "BalanceClicks(data=" + this.f56981a + ')';
        }
    }

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/a$c;", "LbB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$c */
    public static final /* data */ class c implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f56982a;

        public c(@k DeepLink deepLink) {
            this.f56982a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f56982a, ((c) obj).f56982a);
        }

        public final int hashCode() {
            return this.f56982a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicks(deeplink="), this.f56982a, ')');
        }
    }

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/a$d;", "LbB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$d */
    public static final /* data */ class d implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56983a;

        public d(@k String str) {
            this.f56983a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f56983a, ((d) obj).f56983a);
        }

        public final int hashCode() {
            return this.f56983a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(input="), this.f56983a, ')');
        }
    }

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbB0/a$e;", "LbB0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$e */
    public static final class e implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f56984a = new e();
    }

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbB0/a$f;", "LbB0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$f */
    public static final class f implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f56985a = new f();
    }

    /* compiled from: CpaInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/a$g;", "LbB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.a$g */
    public static final /* data */ class g implements InterfaceC25488a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56986a;

        public g(@k String str) {
            this.f56986a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f56986a, ((g) obj).f56986a);
        }

        public final int hashCode() {
            return this.f56986a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendAdvance(advance="), this.f56986a, ')');
        }
    }
}
