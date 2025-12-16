package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ClassLiteralValue.kt */
@s0
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b f409584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409585b;

    public f(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, int i12) {
        this.f409584a = bVar;
        this.f409585b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f409584a, fVar.f409584a) && this.f409585b == fVar.f409585b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f409585b) + (this.f409584a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        int i12;
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        while (true) {
            i12 = this.f409585b;
            if (i13 >= i12) {
                break;
            }
            sb2.append("kotlin/Array<");
            i13++;
        }
        sb2.append(this.f409584a);
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
