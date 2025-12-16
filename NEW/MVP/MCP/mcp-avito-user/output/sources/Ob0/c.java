package oB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceManualState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LoB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final d f419557i = new d(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f419558j = new c(null, null, null, null, null, false, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f419559b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f419560c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f419561d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InterfaceC12174c f419562e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ButtonAction f419563f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f419564g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f419565h;

    /* compiled from: CpxConfigureAdvanceManualState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f419566a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f419567b;

        public a(float f12, @k e eVar) {
            this.f419566a = f12;
            this.f419567b = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f419566a, aVar.f419566a) == 0 && L.f(this.f419567b, aVar.f419567b);
        }

        public final int hashCode() {
            return this.f419567b.hashCode() + (Float.hashCode(this.f419566a) * 31);
        }

        @k
        public final String toString() {
            return "Actions(price=" + this.f419566a + ", messagePlurals=" + this.f419567b + ')';
        }
    }

    /* compiled from: CpxConfigureAdvanceManualState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f419568a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f419569b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f419570c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f419571d;

        public b(int i12, @k String str, @l String str2, @k String str3) {
            this.f419568a = i12;
            this.f419569b = str;
            this.f419570c = str2;
            this.f419571d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f419568a == bVar.f419568a && L.f(this.f419569b, bVar.f419569b) && L.f(this.f419570c, bVar.f419570c) && L.f(this.f419571d, bVar.f419571d);
        }

        public final int hashCode() {
            int iD2 = H.d(Integer.hashCode(this.f419568a) * 31, 31, this.f419569b);
            String str = this.f419570c;
            return this.f419571d.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvanceParams(minValue=");
            sb2.append(this.f419568a);
            sb2.append(", minValueMessage=");
            sb2.append(this.f419569b);
            sb2.append(", placeholder=");
            sb2.append(this.f419570c);
            sb2.append(", currency=");
            return C22026a.c(sb2, this.f419571d, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceManualState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LoB0/c$c;", "", "a", "b", "c", "d", "LoB0/c$c$a;", "LoB0/c$c$b;", "LoB0/c$c$c;", "LoB0/c$c$d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oB0.c$c, reason: collision with other inner class name */
    public interface InterfaceC12174c {

        /* compiled from: CpxConfigureAdvanceManualState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$c$a;", "LoB0/c$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oB0.c$c$a */
        public static final /* data */ class a implements InterfaceC12174c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f419572a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f419573b;

            public a(@l String str, @l String str2) {
                this.f419572a = str;
                this.f419573b = str2;
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: a, reason: from getter */
            public final String getF419578a() {
                return this.f419572a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f419572a, aVar.f419572a) && L.f(this.f419573b, aVar.f419573b);
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: getLabel, reason: from getter */
            public final String getF419579b() {
                return this.f419573b;
            }

            public final int hashCode() {
                String str = this.f419572a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f419573b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Empty(advance=");
                sb2.append(this.f419572a);
                sb2.append(", label=");
                return C22026a.c(sb2, this.f419573b, ')');
            }
        }

        /* compiled from: CpxConfigureAdvanceManualState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$c$b;", "LoB0/c$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oB0.c$c$b */
        public static final /* data */ class b implements InterfaceC12174c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f419574a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f419575b;

            public b(@l String str, @l String str2) {
                this.f419574a = str;
                this.f419575b = str2;
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: a, reason: from getter */
            public final String getF419578a() {
                return this.f419574a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f419574a, bVar.f419574a) && L.f(this.f419575b, bVar.f419575b);
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: getLabel, reason: from getter */
            public final String getF419579b() {
                return this.f419575b;
            }

            public final int hashCode() {
                String str = this.f419574a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f419575b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(advance=");
                sb2.append(this.f419574a);
                sb2.append(", label=");
                return C22026a.c(sb2, this.f419575b, ')');
            }
        }

        /* compiled from: CpxConfigureAdvanceManualState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$c$c;", "LoB0/c$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oB0.c$c$c, reason: collision with other inner class name */
        public static final /* data */ class C12175c implements InterfaceC12174c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f419576a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f419577b;

            public C12175c(@l String str, @l String str2) {
                this.f419576a = str;
                this.f419577b = str2;
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: a, reason: from getter */
            public final String getF419578a() {
                return this.f419576a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12175c)) {
                    return false;
                }
                C12175c c12175c = (C12175c) obj;
                return L.f(this.f419576a, c12175c.f419576a) && L.f(this.f419577b, c12175c.f419577b);
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: getLabel, reason: from getter */
            public final String getF419579b() {
                return this.f419577b;
            }

            public final int hashCode() {
                String str = this.f419576a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f419577b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Valid(advance=");
                sb2.append(this.f419576a);
                sb2.append(", label=");
                return C22026a.c(sb2, this.f419577b, ')');
            }
        }

        /* compiled from: CpxConfigureAdvanceManualState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$c$d;", "LoB0/c$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oB0.c$c$d */
        public static final /* data */ class d implements InterfaceC12174c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f419578a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f419579b;

            public d(@l String str, @l String str2) {
                this.f419578a = str;
                this.f419579b = str2;
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: a, reason: from getter */
            public final String getF419578a() {
                return this.f419578a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f419578a, dVar.f419578a) && L.f(this.f419579b, dVar.f419579b);
            }

            @Override // oB0.c.InterfaceC12174c
            @l
            /* renamed from: getLabel, reason: from getter */
            public final String getF419579b() {
                return this.f419579b;
            }

            public final int hashCode() {
                String str = this.f419578a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f419579b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ValidCpc(advance=");
                sb2.append(this.f419578a);
                sb2.append(", label=");
                return C22026a.c(sb2, this.f419579b, ')');
            }
        }

        @l
        /* renamed from: a */
        String getF419578a();

        @l
        /* renamed from: getLabel */
        String getF419579b();
    }

    /* compiled from: CpxConfigureAdvanceManualState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoB0/c$d;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: CpxConfigureAdvanceManualState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/c$e;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f419580a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f419581b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f419582c;

        public e(@k String str, @k String str2, @k String str3) {
            this.f419580a = str;
            this.f419581b = str2;
            this.f419582c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f419580a, eVar.f419580a) && L.f(this.f419581b, eVar.f419581b) && L.f(this.f419582c, eVar.f419582c);
        }

        public final int hashCode() {
            return this.f419582c.hashCode() + H.d(this.f419580a.hashCode() * 31, 31, this.f419581b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MessagePlurals(one=");
            sb2.append(this.f419580a);
            sb2.append(", few=");
            sb2.append(this.f419581b);
            sb2.append(", other=");
            return C22026a.c(sb2, this.f419582c, ')');
        }
    }

    public c(@l AttributedText attributedText, @l b bVar, @l a aVar, @l InterfaceC12174c interfaceC12174c, @l ButtonAction buttonAction, boolean z12, boolean z13) {
        this.f419559b = attributedText;
        this.f419560c = bVar;
        this.f419561d = aVar;
        this.f419562e = interfaceC12174c;
        this.f419563f = buttonAction;
        this.f419564g = z12;
        this.f419565h = z13;
    }

    public static c a(c cVar, AttributedText attributedText, b bVar, a aVar, InterfaceC12174c interfaceC12174c, ButtonAction buttonAction, boolean z12, boolean z13, int i12) {
        AttributedText attributedText2 = (i12 & 1) != 0 ? cVar.f419559b : attributedText;
        b bVar2 = (i12 & 2) != 0 ? cVar.f419560c : bVar;
        a aVar2 = (i12 & 4) != 0 ? cVar.f419561d : aVar;
        InterfaceC12174c interfaceC12174c2 = (i12 & 8) != 0 ? cVar.f419562e : interfaceC12174c;
        ButtonAction buttonAction2 = (i12 & 16) != 0 ? cVar.f419563f : buttonAction;
        boolean z14 = (i12 & 32) != 0 ? cVar.f419564g : z12;
        boolean z15 = (i12 & 64) != 0 ? cVar.f419565h : z13;
        cVar.getClass();
        return new c(attributedText2, bVar2, aVar2, interfaceC12174c2, buttonAction2, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f419559b, cVar.f419559b) && L.f(this.f419560c, cVar.f419560c) && L.f(this.f419561d, cVar.f419561d) && L.f(this.f419562e, cVar.f419562e) && L.f(this.f419563f, cVar.f419563f) && this.f419564g == cVar.f419564g && this.f419565h == cVar.f419565h;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f419559b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        b bVar = this.f419560c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f419561d;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        InterfaceC12174c interfaceC12174c = this.f419562e;
        int iHashCode4 = (iHashCode3 + (interfaceC12174c == null ? 0 : interfaceC12174c.hashCode())) * 31;
        ButtonAction buttonAction = this.f419563f;
        return Boolean.hashCode(this.f419565h) + r.i((iHashCode4 + (buttonAction != null ? buttonAction.hashCode() : 0)) * 31, 31, this.f419564g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureAdvanceManualState(title=");
        sb2.append(this.f419559b);
        sb2.append(", advanceParams=");
        sb2.append(this.f419560c);
        sb2.append(", actions=");
        sb2.append(this.f419561d);
        sb2.append(", advanceState=");
        sb2.append(this.f419562e);
        sb2.append(", button=");
        sb2.append(this.f419563f);
        sb2.append(", shouldShowError=");
        sb2.append(this.f419564g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f419565h, ')');
    }
}
