package is;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cpx_promo.v2.compose.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoPriceInputState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lis/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: is.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C42098c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f405318g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C42098c f405319h = new C42098c("", null, null, "", null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405320b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f405321c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f405322d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f405323e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a.C3789a f405324f;

    /* compiled from: CpxPromoPriceInputState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lis/c$a;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: is.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpxPromoPriceInputState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis/c$b;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: is.c$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f405325a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f405326b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f405327c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f405328d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f405329e;

        public b(@l String str, @l String str2, boolean z12, @l String str3, boolean z13) {
            this.f405325a = str;
            this.f405326b = str2;
            this.f405327c = str3;
            this.f405328d = z12;
            this.f405329e = z13;
        }

        public static b a(b bVar, String str, String str2, boolean z12, boolean z13, int i12) {
            if ((i12 & 1) != 0) {
                str = bVar.f405325a;
            }
            String str3 = str;
            if ((i12 & 2) != 0) {
                str2 = bVar.f405326b;
            }
            String str4 = str2;
            String str5 = bVar.f405327c;
            if ((i12 & 8) != 0) {
                z12 = bVar.f405328d;
            }
            boolean z14 = z12;
            if ((i12 & 16) != 0) {
                z13 = bVar.f405329e;
            }
            bVar.getClass();
            return new b(str3, str4, z14, str5, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f405325a, bVar.f405325a) && L.f(this.f405326b, bVar.f405326b) && L.f(this.f405327c, bVar.f405327c) && this.f405328d == bVar.f405328d && this.f405329e == bVar.f405329e;
        }

        public final int hashCode() {
            String str = this.f405325a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f405326b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f405327c;
            return Boolean.hashCode(this.f405329e) + r.i((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f405328d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputState(value=");
            sb2.append(this.f405325a);
            sb2.append(", hint=");
            sb2.append(this.f405326b);
            sb2.append(", placeholder=");
            sb2.append(this.f405327c);
            sb2.append(", isValueValid=");
            sb2.append(this.f405328d);
            sb2.append(", showError=");
            return r.x(sb2, this.f405329e, ')');
        }
    }

    public C42098c(@k String str, @l String str2, @l b bVar, @k String str3, @l a.C3789a c3789a) {
        this.f405320b = str;
        this.f405321c = str2;
        this.f405322d = bVar;
        this.f405323e = str3;
        this.f405324f = c3789a;
    }

    public static C42098c a(C42098c c42098c, b bVar) {
        String str = c42098c.f405320b;
        String str2 = c42098c.f405321c;
        String str3 = c42098c.f405323e;
        a.C3789a c3789a = c42098c.f405324f;
        c42098c.getClass();
        return new C42098c(str, str2, bVar, str3, c3789a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42098c)) {
            return false;
        }
        C42098c c42098c = (C42098c) obj;
        return L.f(this.f405320b, c42098c.f405320b) && L.f(this.f405321c, c42098c.f405321c) && L.f(this.f405322d, c42098c.f405322d) && L.f(this.f405323e, c42098c.f405323e) && L.f(this.f405324f, c42098c.f405324f);
    }

    public final int hashCode() {
        int iHashCode = this.f405320b.hashCode() * 31;
        String str = this.f405321c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f405322d;
        int iD2 = H.d((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f405323e);
        a.C3789a c3789a = this.f405324f;
        return iD2 + (c3789a != null ? c3789a.f127402e.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CpxPromoPriceInputState(title=" + this.f405320b + ", subtitle=" + this.f405321c + ", inputState=" + this.f405322d + ", buttonText=" + this.f405323e + ", cashbackBannerData=" + this.f405324f + ')';
    }
}
