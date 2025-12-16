package ET0;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Spacing.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LET0/h;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4021c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4023b;

    /* compiled from: Spacing.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LET0/h$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public h(int i12, int i13) {
        this.f4022a = i12;
        this.f4023b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4022a == hVar.f4022a && this.f4023b == hVar.f4023b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4023b) + (Integer.hashCode(this.f4022a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Spacing(horizontal=");
        sb2.append(this.f4022a);
        sb2.append(", vertical=");
        return r.t(sb2, this.f4023b, ')');
    }
}
