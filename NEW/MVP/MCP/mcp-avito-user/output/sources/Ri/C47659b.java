package ri;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qi.InterfaceC47401b;

/* compiled from: BeduinScreenWithTypes.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lri/b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ri.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47659b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f430147a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<? extends InterfaceC47401b> f430148b;

    public C47659b(@k Class cls, @k List list) {
        this.f430147a = list;
        this.f430148b = cls;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47659b)) {
            return false;
        }
        C47659b c47659b = (C47659b) obj;
        return L.f(this.f430147a, c47659b.f430147a) && L.f(this.f430148b, c47659b.f430148b);
    }

    public final int hashCode() {
        return this.f430148b.hashCode() + (this.f430147a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "BeduinScreenWithTypes(types=" + this.f430147a + ", screen=" + this.f430148b + ')';
    }
}
