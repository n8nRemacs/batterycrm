package pb1;

import Y61.k;
import Y61.l;
import com.vk.push.core.push.RegisterForPushesResult;
import kotlin.jvm.internal.L;

/* renamed from: pb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47049a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RegisterForPushesResult f428622a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T11.a f428623b;

    public C47049a(@k RegisterForPushesResult registerForPushesResult, @k T11.a aVar) {
        this.f428622a = registerForPushesResult;
        this.f428623b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47049a)) {
            return false;
        }
        C47049a c47049a = (C47049a) obj;
        return this.f428622a == c47049a.f428622a && L.f(this.f428623b, c47049a.f428623b);
    }

    public final int hashCode() {
        return this.f428623b.hashCode() + (this.f428622a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "RegisterResult(innerResult=" + this.f428622a + ", host=" + this.f428623b + ')';
    }
}
