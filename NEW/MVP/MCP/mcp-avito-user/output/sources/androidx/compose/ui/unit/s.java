package androidx.compose.ui.unit;

import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IntRect.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/s;", "", "a", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class s {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f42865e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final s f42866f = new s(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f42867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42868b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42869c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42870d;

    /* compiled from: IntRect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/s$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(int i12, int i13, int i14, int i15) {
        this.f42867a = i12;
        this.f42868b = i13;
        this.f42869c = i14;
        this.f42870d = i15;
    }

    public final long a() {
        long jB2 = (((b() / 2) + this.f42868b) & 4294967295L) | (((d() / 2) + this.f42867a) << 32);
        q.a aVar = q.f42862b;
        return jB2;
    }

    public final int b() {
        return this.f42870d - this.f42868b;
    }

    public final long c() {
        long j12 = (this.f42867a << 32) | (this.f42868b & 4294967295L);
        q.a aVar = q.f42862b;
        return j12;
    }

    public final int d() {
        return this.f42869c - this.f42867a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f42867a == sVar.f42867a && this.f42868b == sVar.f42868b && this.f42869c == sVar.f42869c && this.f42870d == sVar.f42870d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42870d) + androidx.appcompat.app.r.e(this.f42869c, androidx.appcompat.app.r.e(this.f42868b, Integer.hashCode(this.f42867a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f42867a);
        sb2.append(", ");
        sb2.append(this.f42868b);
        sb2.append(", ");
        sb2.append(this.f42869c);
        sb2.append(", ");
        return androidx.appcompat.app.r.t(sb2, this.f42870d, ')');
    }
}
