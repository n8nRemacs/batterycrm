package R2;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.P;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import u0.i;

/* compiled from: TabGroupItemData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LR2/b;", "", "a", "b", "c", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f14070a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C0936b f14071b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14072c;

    /* compiled from: TabGroupItemData.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LR2/b$a;", "", "a", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14073a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC0933a f14074b;

        /* compiled from: TabGroupItemData.kt */
        @H0
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LR2/b$a$a;", "", "a", "b", "c", "LR2/b$a$a$a;", "LR2/b$a$a$b;", "LR2/b$a$a$c;", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: R2.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC0933a {

            /* compiled from: TabGroupItemData.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LR2/b$a$a$a;", "LR2/b$a$a;", "<init>", "()V", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: R2.b$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0934a implements InterfaceC0933a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final C0934a f14075a = new C0934a();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof C0934a);
                }

                public final int hashCode() {
                    return -340671161;
                }

                @k
                public final String toString() {
                    return "Accent";
                }
            }

            /* compiled from: TabGroupItemData.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR2/b$a$a$b;", "LR2/b$a$a;", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: R2.b$a$a$b, reason: collision with other inner class name */
            public static final /* data */ class C0935b implements InterfaceC0933a {
                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0935b)) {
                        return false;
                    }
                    ((C0935b) obj).getClass();
                    return L.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                @k
                public final String toString() {
                    return "Custom(color=null)";
                }
            }

            /* compiled from: TabGroupItemData.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LR2/b$a$a$c;", "LR2/b$a$a;", "<init>", "()V", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: R2.b$a$a$c */
            public static final /* data */ class c implements InterfaceC0933a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final c f14076a = new c();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 293215935;
                }

                @k
                public final String toString() {
                    return "Regular";
                }
            }
        }

        public a(int i12, InterfaceC0933a interfaceC0933a, int i13, C42822w c42822w) {
            interfaceC0933a = (i13 & 2) != 0 ? InterfaceC0933a.c.f14076a : interfaceC0933a;
            this.f14073a = i12;
            this.f14074b = interfaceC0933a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14073a == aVar.f14073a && L.f(this.f14074b, aVar.f14074b);
        }

        public final int hashCode() {
            return this.f14074b.hashCode() + (Integer.hashCode(this.f14073a) * 31);
        }

        @k
        public final String toString() {
            return "Counter(count=" + this.f14073a + ", color=" + this.f14074b + ')';
        }
    }

    /* compiled from: TabGroupItemData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR2/b$b;", "", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: R2.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0936b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final a f14077a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14078b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14079c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0936b() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0936b)) {
                return false;
            }
            C0936b c0936b = (C0936b) obj;
            return L.f(this.f14077a, c0936b.f14077a) && this.f14078b == c0936b.f14078b;
        }

        public final int hashCode() {
            a aVar = this.f14077a;
            return Boolean.hashCode(this.f14078b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExtraData(counter=");
            sb2.append(this.f14077a);
            sb2.append(", withPoint=");
            return r.x(sb2, this.f14078b, ')');
        }

        public C0936b(@l a aVar, boolean z12) {
            this.f14077a = aVar;
            this.f14078b = z12;
            this.f14079c = aVar == null && !z12;
        }

        public /* synthetic */ C0936b(a aVar, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: TabGroupItemData.kt */
    @H0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LR2/b$c;", "", "a", "b", "LR2/b$c$a;", "LR2/b$c$b;", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: TabGroupItemData.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR2/b$c$a;", "LR2/b$c;", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f14080a;

            public a(@k String str) {
                this.f14080a = str;
            }

            @Override // R2.b.c
            @InterfaceC22132o
            @k
            public final String a(@l A a12) {
                a12.C(549322493);
                a12.h();
                return this.f14080a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f14080a, ((a) obj).f14080a);
            }

            public final int hashCode() {
                return this.f14080a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("RawText(text="), this.f14080a, ')');
            }
        }

        /* compiled from: TabGroupItemData.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR2/b$c$b;", "LR2/b$c;", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: R2.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C0937b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final int f14081a;

            public C0937b(@e0 int i12) {
                this.f14081a = i12;
            }

            @Override // R2.b.c
            @InterfaceC22132o
            @k
            public final String a(@l A a12) {
                a12.C(-329852868);
                String strC = i.c(a12, this.f14081a);
                a12.h();
                return strC;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0937b) && this.f14081a == ((C0937b) obj).f14081a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f14081a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("StringResourceText(textRes="), this.f14081a, ')');
            }
        }

        @InterfaceC22029a2
        @InterfaceC22132o
        @k
        String a(@l A a12);
    }

    public b(c cVar, C0936b c0936b, boolean z12, int i12, C42822w c42822w) {
        c0936b = (i12 & 2) != 0 ? null : c0936b;
        z12 = (i12 & 4) != 0 ? true : z12;
        this.f14070a = cVar;
        this.f14071b = c0936b;
        this.f14072c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f14070a, bVar.f14070a) && L.f(this.f14071b, bVar.f14071b) && this.f14072c == bVar.f14072c;
    }

    public final int hashCode() {
        int iHashCode = this.f14070a.hashCode() * 31;
        C0936b c0936b = this.f14071b;
        return Boolean.hashCode(this.f14072c) + ((iHashCode + (c0936b == null ? 0 : c0936b.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabGroupItemData(text=");
        sb2.append(this.f14070a);
        sb2.append(", extraData=");
        sb2.append(this.f14071b);
        sb2.append(", enabled=");
        return r.x(sb2, this.f14072c, ')');
    }
}
