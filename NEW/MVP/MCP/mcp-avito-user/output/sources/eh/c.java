package Eh;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.j;

/* compiled from: LimitIncreaseState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LEh/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C0248c f4174n = new C0248c(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final c f4175o = new c(false, true, null, null, null, null, null, null, null, null, null, false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4176b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4177c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f4178d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final j f4179e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f4180f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f4181g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<b> f4182h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<d> f4183i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Long f4184j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final a f4185k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f4186l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4187m;

    /* compiled from: LimitIncreaseState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEh/c$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final wZ.l f4188a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f4189b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f4190c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f4191d;

        public a(@l wZ.l lVar, @k String str, @k String str2, @k DeepLink deepLink) {
            this.f4188a = lVar;
            this.f4189b = str;
            this.f4190c = str2;
            this.f4191d = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f4188a, aVar.f4188a) && L.f(this.f4189b, aVar.f4189b) && L.f(this.f4190c, aVar.f4190c) && L.f(this.f4191d, aVar.f4191d);
        }

        public final int hashCode() {
            wZ.l lVar = this.f4188a;
            return this.f4191d.hashCode() + H.d(H.d((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f4189b), 31, this.f4190c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(image=");
            sb2.append(this.f4188a);
            sb2.append(", title=");
            sb2.append(this.f4189b);
            sb2.append(", description=");
            sb2.append(this.f4190c);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f4191d, ')');
        }
    }

    /* compiled from: LimitIncreaseState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/c$c;", "", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.c$c, reason: collision with other inner class name */
    public static final class C0248c {
        public /* synthetic */ C0248c(C42822w c42822w) {
            this();
        }

        public C0248c() {
        }
    }

    /* compiled from: LimitIncreaseState.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEh/c$e;", "", "<init>", "()V", "a", "b", "LEh/c$e$a;", "LEh/c$e$b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* compiled from: LimitIncreaseState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/c$e$a;", "LEh/c$e;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f4204a = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -568608550;
            }

            @k
            public final String toString() {
                return "Green";
            }
        }

        /* compiled from: LimitIncreaseState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/c$e$b;", "LEh/c$e;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f4205a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -218073289;
            }

            @k
            public final String toString() {
                return "Orange";
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    public c(boolean z12, boolean z13, @l String str, @l j jVar, @l String str2, @l String str3, @l List<b> list, @l List<d> list2, @l Long l12, @l a aVar, @l String str4, boolean z14) {
        this.f4176b = z12;
        this.f4177c = z13;
        this.f4178d = str;
        this.f4179e = jVar;
        this.f4180f = str2;
        this.f4181g = str3;
        this.f4182h = list;
        this.f4183i = list2;
        this.f4184j = l12;
        this.f4185k = aVar;
        this.f4186l = str4;
        this.f4187m = z14;
    }

    public static c a(c cVar, boolean z12, boolean z13, String str, j jVar, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, Long l12, a aVar, String str4, boolean z14, int i12) {
        boolean z15 = (i12 & 1) != 0 ? cVar.f4176b : z12;
        boolean z16 = (i12 & 2) != 0 ? cVar.f4177c : z13;
        String str5 = (i12 & 4) != 0 ? cVar.f4178d : str;
        j jVar2 = (i12 & 8) != 0 ? cVar.f4179e : jVar;
        String str6 = (i12 & 16) != 0 ? cVar.f4180f : str2;
        String str7 = (i12 & 32) != 0 ? cVar.f4181g : str3;
        List<b> list = (i12 & 64) != 0 ? cVar.f4182h : arrayList;
        List<d> list2 = (i12 & 128) != 0 ? cVar.f4183i : arrayList2;
        Long l13 = (i12 & 256) != 0 ? cVar.f4184j : l12;
        a aVar2 = (i12 & 512) != 0 ? cVar.f4185k : aVar;
        String str8 = (i12 & 1024) != 0 ? cVar.f4186l : str4;
        boolean z17 = (i12 & 2048) != 0 ? cVar.f4187m : z14;
        cVar.getClass();
        return new c(z15, z16, str5, jVar2, str6, str7, list, list2, l13, aVar2, str8, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4176b == cVar.f4176b && this.f4177c == cVar.f4177c && L.f(this.f4178d, cVar.f4178d) && L.f(this.f4179e, cVar.f4179e) && L.f(this.f4180f, cVar.f4180f) && L.f(this.f4181g, cVar.f4181g) && L.f(this.f4182h, cVar.f4182h) && L.f(this.f4183i, cVar.f4183i) && L.f(this.f4184j, cVar.f4184j) && L.f(this.f4185k, cVar.f4185k) && L.f(this.f4186l, cVar.f4186l) && this.f4187m == cVar.f4187m;
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f4176b) * 31, 31, this.f4177c);
        String str = this.f4178d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f4179e;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str2 = this.f4180f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4181g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<b> list = this.f4182h;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<d> list2 = this.f4183i;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l12 = this.f4184j;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        a aVar = this.f4185k;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.f4186l;
        return Boolean.hashCode(this.f4187m) + ((iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LimitIncreaseState(isClosable=");
        sb2.append(this.f4176b);
        sb2.append(", isLoading=");
        sb2.append(this.f4177c);
        sb2.append(", error=");
        sb2.append(this.f4178d);
        sb2.append(", navBar=");
        sb2.append(this.f4179e);
        sb2.append(", title=");
        sb2.append(this.f4180f);
        sb2.append(", description=");
        sb2.append(this.f4181g);
        sb2.append(", chips=");
        sb2.append(this.f4182h);
        sb2.append(", limits=");
        sb2.append(this.f4183i);
        sb2.append(", selectedCount=");
        sb2.append(this.f4184j);
        sb2.append(", banner=");
        sb2.append(this.f4185k);
        sb2.append(", nextButtonTitle=");
        sb2.append(this.f4186l);
        sb2.append(", isPostLoading=");
        return r.x(sb2, this.f4187m, ')');
    }

    /* compiled from: LimitIncreaseState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEh/c$b;", "Lcom/akita/compose/component/chips/b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC27333b {

        /* renamed from: b, reason: collision with root package name */
        public final long f4192b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f4193c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4194d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f4195e;

        public b(long j12, @k String str, boolean z12, boolean z13) {
            this.f4192b = j12;
            this.f4193c = str;
            this.f4194d = z12;
            this.f4195e = z13;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @l
        public final Integer c() {
            return null;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @l
        public final Integer d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4192b == bVar.f4192b && L.f(this.f4193c, bVar.f4193c) && this.f4194d == bVar.f4194d && this.f4195e == bVar.f4195e;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF4193c() {
            return this.f4193c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4195e) + r.i(H.d(Long.hashCode(this.f4192b) * 31, 31, this.f4193c), 31, this.f4194d);
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        public final boolean isActive() {
            return true;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isEnabled, reason: from getter */
        public final boolean getF4195e() {
            return this.f4195e;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF4194d() {
            return this.f4194d;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(count=");
            sb2.append(this.f4192b);
            sb2.append(", title=");
            sb2.append(this.f4193c);
            sb2.append(", isSelected=");
            sb2.append(this.f4194d);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f4195e, ')');
        }

        public /* synthetic */ b(long j12, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(j12, str, z12, (i12 & 8) != 0 ? true : z13);
        }
    }

    /* compiled from: LimitIncreaseState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEh/c$d;", "", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f4196a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4197b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4198c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f4199d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final a f4200e;

        /* compiled from: LimitIncreaseState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEh/c$d$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f4201a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final e f4202b;

            /* renamed from: c, reason: collision with root package name */
            public final float f4203c;

            public a(@k String str, @k e eVar, float f12) {
                this.f4201a = str;
                this.f4202b = eVar;
                this.f4203c = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f4201a, aVar.f4201a) && L.f(this.f4202b, aVar.f4202b) && Float.compare(this.f4203c, aVar.f4203c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f4203c) + ((this.f4202b.hashCode() + (this.f4201a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Progress(description=");
                sb2.append(this.f4201a);
                sb2.append(", color=");
                sb2.append(this.f4202b);
                sb2.append(", value=");
                return r.k(')', this.f4203c, sb2);
            }
        }

        public d(long j12, boolean z12, boolean z13, @k String str, @l a aVar) {
            this.f4196a = j12;
            this.f4197b = z12;
            this.f4198c = z13;
            this.f4199d = str;
            this.f4200e = aVar;
        }

        public static d a(d dVar, boolean z12) {
            long j12 = dVar.f4196a;
            boolean z13 = dVar.f4198c;
            String str = dVar.f4199d;
            a aVar = dVar.f4200e;
            dVar.getClass();
            return new d(j12, z12, z13, str, aVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f4196a == dVar.f4196a && this.f4197b == dVar.f4197b && this.f4198c == dVar.f4198c && L.f(this.f4199d, dVar.f4199d) && L.f(this.f4200e, dVar.f4200e);
        }

        public final int hashCode() {
            int iD2 = H.d(r.i(r.i(Long.hashCode(this.f4196a) * 31, 31, this.f4197b), 31, this.f4198c), 31, this.f4199d);
            a aVar = this.f4200e;
            return iD2 + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "Limit(count=" + this.f4196a + ", isSelected=" + this.f4197b + ", isEnabled=" + this.f4198c + ", price=" + this.f4199d + ", progress=" + this.f4200e + ')';
        }

        public /* synthetic */ d(long j12, boolean z12, boolean z13, String str, a aVar, int i12, C42822w c42822w) {
            this(j12, z12, (i12 & 4) != 0 ? true : z13, str, aVar);
        }
    }
}
