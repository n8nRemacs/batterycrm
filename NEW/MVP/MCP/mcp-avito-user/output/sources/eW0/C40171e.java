package ew0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.short_term_rent.deeplink.PromoCode;
import ew0.AbstractC40168b;
import ew0.InterfaceC40167a;
import ew0.InterfaceC40173g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lew0/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C40171e extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f395466g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C40171e f395467h = new C40171e(null, new c.a(""), null, false, new C40172f(com.avito.android.printable_text.b.f(""), new AbstractC40168b.C11115b("", ""), InterfaceC40167a.b.f395452a, InterfaceC40173g.b.f395490a, com.avito.android.printable_text.b.f(""), false));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b f395468b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f395469c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f395470d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f395471e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C40172f f395472f;

    /* compiled from: PromoCodeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lew0/e$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PromoCodeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/e$b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.e$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f395473a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f395474b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f395475c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f395476d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f395477e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final List<PromoCode> f395478f;

        public b(@l List list, long j12, @k String str, @k String str2, @l String str3, @l String str4) {
            this.f395473a = j12;
            this.f395474b = str;
            this.f395475c = str2;
            this.f395476d = str3;
            this.f395477e = str4;
            this.f395478f = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f395473a == bVar.f395473a && L.f(this.f395474b, bVar.f395474b) && L.f(this.f395475c, bVar.f395475c) && L.f(this.f395476d, bVar.f395476d) && L.f(this.f395477e, bVar.f395477e) && L.f(this.f395478f, bVar.f395478f);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(Long.hashCode(this.f395473a) * 31, 31, this.f395474b), 31, this.f395475c);
            String str = this.f395476d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f395477e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PromoCode> list = this.f395478f;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitialParams(itemId=");
            sb2.append(this.f395473a);
            sb2.append(", title=");
            sb2.append(this.f395474b);
            sb2.append(", buttonTitle=");
            sb2.append(this.f395475c);
            sb2.append(", inputHint=");
            sb2.append(this.f395476d);
            sb2.append(", bookingContext=");
            sb2.append(this.f395477e);
            sb2.append(", promoCodes=");
            return H.p(sb2, this.f395478f, ')');
        }
    }

    /* compiled from: PromoCodeState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lew0/e$c;", "", "a", "b", "c", "Lew0/e$c$a;", "Lew0/e$c$b;", "Lew0/e$c$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.e$c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395479a;

        /* compiled from: PromoCodeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/e$c$a;", "Lew0/e$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ew0.e$c$a */
        public static final /* data */ class a extends c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f395480b;

            public a(@k String str) {
                super(str, null);
                this.f395480b = str;
            }

            @Override // ew0.C40171e.c
            @k
            /* renamed from: a, reason: from getter */
            public final String getF395479a() {
                return this.f395480b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f395480b, ((a) obj).f395480b);
            }

            public final int hashCode() {
                return this.f395480b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Regular(text="), this.f395480b, ')');
            }
        }

        /* compiled from: PromoCodeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/e$c$b;", "Lew0/e$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ew0.e$c$b */
        public static final /* data */ class b extends c {
            @Override // ew0.C40171e.c
            @k
            /* renamed from: a */
            public final String getF395479a() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "WithDescription(text=null, description=null)";
            }
        }

        /* compiled from: PromoCodeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/e$c$c;", "Lew0/e$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ew0.e$c$c, reason: collision with other inner class name */
        public static final /* data */ class C11117c extends c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f395481b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f395482c;

            public C11117c(@k String str, @k String str2) {
                super(str, null);
                this.f395481b = str;
                this.f395482c = str2;
            }

            @Override // ew0.C40171e.c
            @k
            /* renamed from: a, reason: from getter */
            public final String getF395479a() {
                return this.f395481b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11117c)) {
                    return false;
                }
                C11117c c11117c = (C11117c) obj;
                return L.f(this.f395481b, c11117c.f395481b) && L.f(this.f395482c, c11117c.f395482c);
            }

            public final int hashCode() {
                return this.f395482c.hashCode() + (this.f395481b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("WithError(text=");
                sb2.append(this.f395481b);
                sb2.append(", error=");
                return C22026a.c(sb2, this.f395482c, ')');
            }
        }

        public c(String str, C42822w c42822w) {
            this.f395479a = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public String getF395479a() {
            return this.f395479a;
        }
    }

    public C40171e(@l b bVar, @k c cVar, @l Integer num, boolean z12, @k C40172f c40172f) {
        this.f395468b = bVar;
        this.f395469c = cVar;
        this.f395470d = num;
        this.f395471e = z12;
        this.f395472f = c40172f;
    }

    public static C40171e a(C40171e c40171e, b bVar, c cVar, Integer num, boolean z12, C40172f c40172f, int i12) {
        if ((i12 & 1) != 0) {
            bVar = c40171e.f395468b;
        }
        b bVar2 = bVar;
        if ((i12 & 2) != 0) {
            cVar = c40171e.f395469c;
        }
        c cVar2 = cVar;
        if ((i12 & 4) != 0) {
            num = c40171e.f395470d;
        }
        Integer num2 = num;
        if ((i12 & 8) != 0) {
            z12 = c40171e.f395471e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            c40172f = c40171e.f395472f;
        }
        c40171e.getClass();
        return new C40171e(bVar2, cVar2, num2, z13, c40172f);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40171e)) {
            return false;
        }
        C40171e c40171e = (C40171e) obj;
        return L.f(this.f395468b, c40171e.f395468b) && L.f(this.f395469c, c40171e.f395469c) && L.f(this.f395470d, c40171e.f395470d) && this.f395471e == c40171e.f395471e && L.f(this.f395472f, c40171e.f395472f);
    }

    public final int hashCode() {
        b bVar = this.f395468b;
        int iHashCode = (this.f395469c.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31;
        Integer num = this.f395470d;
        return this.f395472f.hashCode() + r.i((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f395471e);
    }

    @k
    public final String toString() {
        return "PromoCodeState(initialParams=" + this.f395468b + ", inputState=" + this.f395469c + ", selectedPromoCodeIndex=" + this.f395470d + ", isLoading=" + this.f395471e + ", viewState=" + this.f395472f + ')';
    }
}
