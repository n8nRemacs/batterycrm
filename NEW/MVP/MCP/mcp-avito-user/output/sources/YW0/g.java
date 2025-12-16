package YW0;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ImmutableQualityInfo.java */
@Nullsafe
/* loaded from: classes13.dex */
public class g implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final g f19507d;

    /* renamed from: a, reason: collision with root package name */
    public int f19508a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19509b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19510c;

    static {
        g gVar = new g();
        gVar.f19508a = Integer.MAX_VALUE;
        gVar.f19509b = true;
        gVar.f19510c = true;
        f19507d = gVar;
    }

    @Override // YW0.i
    public final boolean a() {
        return this.f19510c;
    }

    @Override // YW0.i
    public final boolean b() {
        return this.f19509b;
    }

    @Override // YW0.i
    public final int c() {
        return this.f19508a;
    }

    public final boolean equals(@I41.h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19508a == gVar.f19508a && this.f19509b == gVar.f19509b && this.f19510c == gVar.f19510c;
    }

    public final int hashCode() {
        return ((this.f19509b ? 4194304 : 0) ^ this.f19508a) ^ (this.f19510c ? 8388608 : 0);
    }
}
