package X51;

import java.util.Set;
import kotlin.collections.B0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43404g0;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;
import s2.AbstractC47961a;

@w
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f18599d;

    /* renamed from: a, reason: collision with root package name */
    public final String f18600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18601b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f18602c;

    static {
        new b();
        f18599d = new KSerializer[]{null, null, new C43404g0(V0.f412822a)};
    }

    public c(int i12, String str, String str2, Set set) {
        if ((i12 & 1) == 0) {
            this.f18600a = "";
        } else {
            this.f18600a = str;
        }
        if ((i12 & 2) == 0) {
            this.f18601b = "";
        } else {
            this.f18601b = str2;
        }
        if ((i12 & 4) == 0) {
            this.f18602c = B0.f406639b;
        } else {
            this.f18602c = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f18600a, cVar.f18600a) && L.f(this.f18601b, cVar.f18601b) && L.f(this.f18602c, cVar.f18602c);
    }

    public final int hashCode() {
        return this.f18602c.hashCode() + AbstractC47961a.a(this.f18601b, this.f18600a.hashCode() * 31);
    }

    public final String toString() {
        return "AndroidVersionSdkData(currentVersion=" + this.f18600a + ", warningVersion=" + this.f18601b + ", errorSet=" + this.f18602c + ")";
    }

    public c() {
        B0 b02 = B0.f406639b;
        this.f18600a = "";
        this.f18601b = "";
        this.f18602c = b02;
    }
}
