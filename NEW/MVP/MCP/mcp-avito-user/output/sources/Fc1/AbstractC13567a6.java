package Fc1;

/* renamed from: Fc1.a6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13567a6 {

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$a */
    public static abstract class a extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5392a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5393b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f5394c;

        @androidx.compose.runtime.internal.P
        /* renamed from: Fc1.a6$a$a, reason: collision with other inner class name */
        public static final class C0297a extends a {
        }

        @androidx.compose.runtime.internal.P
        /* renamed from: Fc1.a6$a$b */
        public static final class b extends a {
        }

        public a(int i12, int i13, String str, int i14) {
            super(0);
            this.f5392a = i12;
            this.f5393b = i13;
            this.f5394c = str;
        }
    }

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$b */
    public static final class b extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5395a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5396b;

        public b(int i12, int i13) {
            super(0);
            this.f5395a = i12;
            this.f5396b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5395a == bVar.f5395a && this.f5396b == bVar.f5396b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5396b) + (Integer.hashCode(this.f5395a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Italic(start=");
            sb2.append(this.f5395a);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f5396b, ')');
        }
    }

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$c */
    public static final class c extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5397a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5398b;

        public c(int i12, int i13) {
            super(0);
            this.f5397a = i12;
            this.f5398b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5397a == cVar.f5397a && this.f5398b == cVar.f5398b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5398b) + (Integer.hashCode(this.f5397a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Required(start=");
            sb2.append(this.f5397a);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f5398b, ')');
        }
    }

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$d */
    public static final class d extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5399a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5400b;

        public d(int i12, int i13) {
            super(0);
            this.f5399a = i12;
            this.f5400b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f5399a == dVar.f5399a && this.f5400b == dVar.f5400b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5400b) + (Integer.hashCode(this.f5399a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Strike(start=");
            sb2.append(this.f5399a);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f5400b, ')');
        }
    }

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$e */
    public static final class e extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5401a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5402b;

        public e(int i12, int i13) {
            super(0);
            this.f5401a = i12;
            this.f5402b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f5401a == eVar.f5401a && this.f5402b == eVar.f5402b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5402b) + (Integer.hashCode(this.f5401a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Strong(start=");
            sb2.append(this.f5401a);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f5402b, ')');
        }
    }

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$f */
    public static final class f extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        public final int f5403a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5404b;

        public f(int i12, int i13) {
            super(0);
            this.f5403a = i12;
            this.f5404b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f5403a == fVar.f5403a && this.f5404b == fVar.f5404b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f5404b) + (Integer.hashCode(this.f5403a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StrongItalic(start=");
            sb2.append(this.f5403a);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f5404b, ')');
        }
    }

    @androidx.compose.runtime.internal.P
    /* renamed from: Fc1.a6$g */
    public static final class g extends AbstractC13567a6 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f5405a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final xyz.n.a.o4 f5406b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final xyz.n.a.v4 f5407c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final xyz.n.a.t4 f5408d;

        public g(@Y61.k String str, @Y61.k xyz.n.a.o4 o4Var, @Y61.k xyz.n.a.v4 v4Var, @Y61.k xyz.n.a.t4 t4Var) {
            super(0);
            this.f5405a = str;
            this.f5406b = o4Var;
            this.f5407c = v4Var;
            this.f5408d = t4Var;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.L.f(this.f5405a, gVar.f5405a) && this.f5406b == gVar.f5406b && this.f5407c == gVar.f5407c && this.f5408d == gVar.f5408d;
        }

        public final int hashCode() {
            return this.f5408d.hashCode() + ((this.f5407c.hashCode() + ((this.f5406b.hashCode() + (this.f5405a.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Text(value=" + this.f5405a + ", fontStyle=" + this.f5406b + ", weight=" + this.f5407c + ", align=" + this.f5408d + ')';
        }
    }

    public AbstractC13567a6() {
    }

    public /* synthetic */ AbstractC13567a6(int i12) {
        this();
    }
}
