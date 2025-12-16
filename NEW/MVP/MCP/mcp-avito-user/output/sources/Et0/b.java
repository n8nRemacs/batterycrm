package ET0;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Indents.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LET0/b;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4015e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4019d;

    /* compiled from: Indents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LET0/b$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(int i12, int i13, int i14, int i15) {
        this.f4016a = i12;
        this.f4017b = i13;
        this.f4018c = i14;
        this.f4019d = i15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4016a == bVar.f4016a && this.f4017b == bVar.f4017b && this.f4018c == bVar.f4018c && this.f4019d == bVar.f4019d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4019d) + r.e(this.f4018c, r.e(this.f4017b, Integer.hashCode(this.f4016a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Indents(start=");
        sb2.append(this.f4016a);
        sb2.append(", end=");
        sb2.append(this.f4017b);
        sb2.append(", bottom=");
        sb2.append(this.f4018c);
        sb2.append(", top=");
        return r.t(sb2, this.f4019d, ')');
    }
}
