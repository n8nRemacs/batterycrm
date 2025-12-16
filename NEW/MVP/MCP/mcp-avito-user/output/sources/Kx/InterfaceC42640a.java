package kX;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaGrayAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LkX/a;", "", "a", "b", "c", "d", "e", "LkX/a$a;", "LkX/a$b;", "LkX/a$c;", "LkX/a$d;", "LkX/a$e;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kX.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC42640a {

    /* compiled from: CriteriaGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkX/a$a;", "LkX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11618a implements InterfaceC42640a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.loyalty.ui.criteria.items.card.a f406358a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f406359b;

        public C11618a(@k com.avito.android.loyalty.ui.criteria.items.card.a aVar, boolean z12) {
            this.f406358a = aVar;
            this.f406359b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11618a)) {
                return false;
            }
            C11618a c11618a = (C11618a) obj;
            return L.f(this.f406358a, c11618a.f406358a) && this.f406359b == c11618a.f406359b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f406359b) + (this.f406358a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CardClick(cardItem=");
            sb2.append(this.f406358a);
            sb2.append(", expanded=");
            return r.x(sb2, this.f406359b, ')');
        }
    }

    /* compiled from: CriteriaGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/a$b;", "LkX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.a$b */
    public static final /* data */ class b implements InterfaceC42640a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f406360a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1302780515;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CriteriaGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkX/a$c;", "LkX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.a$c */
    public static final /* data */ class c implements InterfaceC42640a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f406361a;

        public c(@k DeepLink deepLink) {
            this.f406361a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f406361a, ((c) obj).f406361a);
        }

        public final int hashCode() {
            return this.f406361a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f406361a, ')');
        }
    }

    /* compiled from: CriteriaGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkX/a$d;", "LkX/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.a$d */
    public static final /* data */ class d implements InterfaceC42640a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406362a;

        public d(@k String str) {
            this.f406362a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f406362a, ((d) obj).f406362a);
        }

        public final int hashCode() {
            return this.f406362a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f406362a, ')');
        }
    }

    /* compiled from: CriteriaGrayAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/a$e;", "LkX/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.a$e */
    public static final /* data */ class e implements InterfaceC42640a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f406363a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 946258190;
        }

        @k
        public final String toString() {
            return "RequestData";
        }
    }
}
