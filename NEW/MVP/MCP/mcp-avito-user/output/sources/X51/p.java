package X51;

import kotlin.jvm.internal.L;
import kotlinx.serialization.w;

@w
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final c f18639a;

    static {
        new o();
    }

    public /* synthetic */ p(int i12, c cVar) {
        if ((i12 & 1) == 0) {
            this.f18639a = new c();
        } else {
            this.f18639a = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && L.f(this.f18639a, ((p) obj).f18639a);
    }

    public final int hashCode() {
        return this.f18639a.hashCode();
    }

    public final String toString() {
        return "VersionSdkData(androidCheck=" + this.f18639a + ")";
    }

    public p() {
        this.f18639a = new c();
    }
}
