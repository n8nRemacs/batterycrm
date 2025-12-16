package UW0;

import I41.h;
import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ResizeOptions.java */
@Nullsafe
/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f16412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16413b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16414c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16415d;

    public d(int i12, int i13) {
        this(2048.0f, i12, i13);
    }

    public final boolean equals(@h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16412a == dVar.f16412a && this.f16413b == dVar.f16413b;
    }

    public final int hashCode() {
        return ((this.f16412a + 31) * 31) + this.f16413b;
    }

    public final String toString() {
        return this.f16412a + "x" + this.f16413b;
    }

    public d(float f12, int i12, int i13) {
        o.a(Boolean.valueOf(i12 > 0));
        o.a(Boolean.valueOf(i13 > 0));
        this.f16412a = i12;
        this.f16413b = i13;
        this.f16414c = f12;
        this.f16415d = 0.6666667f;
    }
}
