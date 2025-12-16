package iX;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LiX/a;", "", "a", "b", "c", "d", "e", "LiX/a$a;", "LiX/a$b;", "LiX/a$c;", "LiX/a$d;", "LiX/a$e;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC41355a {

    /* compiled from: CriteriaAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiX/a$a;", "LiX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11379a implements InterfaceC41355a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.loyalty.ui.criteria.items.card.a f398531a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f398532b;

        public C11379a(@k com.avito.android.loyalty.ui.criteria.items.card.a aVar, boolean z12) {
            this.f398531a = aVar;
            this.f398532b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11379a)) {
                return false;
            }
            C11379a c11379a = (C11379a) obj;
            return L.f(this.f398531a, c11379a.f398531a) && this.f398532b == c11379a.f398532b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f398532b) + (this.f398531a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CardClick(cardItem=");
            sb2.append(this.f398531a);
            sb2.append(", expanded=");
            return r.x(sb2, this.f398532b, ')');
        }
    }

    /* compiled from: CriteriaAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiX/a$b;", "LiX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.a$b */
    public static final /* data */ class b implements InterfaceC41355a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f398533a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -193795716;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CriteriaAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiX/a$c;", "LiX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.a$c */
    public static final /* data */ class c implements InterfaceC41355a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f398534a;

        public c(@k DeepLink deepLink) {
            this.f398534a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398534a, ((c) obj).f398534a);
        }

        public final int hashCode() {
            return this.f398534a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f398534a, ')');
        }
    }

    /* compiled from: CriteriaAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiX/a$d;", "LiX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.a$d */
    public static final /* data */ class d implements InterfaceC41355a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398535a;

        public d(@k String str) {
            this.f398535a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f398535a, ((d) obj).f398535a);
        }

        public final int hashCode() {
            return this.f398535a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f398535a, ')');
        }
    }

    /* compiled from: CriteriaAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiX/a$e;", "LiX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.a$e */
    public static final /* data */ class e implements InterfaceC41355a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f398536a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 482339541;
        }

        @k
        public final String toString() {
            return "RequestData";
        }
    }
}
