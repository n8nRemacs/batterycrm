package SK0;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: AvitoUxFbAttributes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSK0/a;", "", "<init>", "()V", "_avito_ux-feedback_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f14900a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f14901b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f14902c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f14903d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f14904e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashMap f14905f = new LinkedHashMap();

    public final void a(@k String str, @k String str2) {
        this.f14905f.put(str, str2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f14900a, aVar.f14900a) && L.f(this.f14901b, aVar.f14901b) && L.f(this.f14902c, aVar.f14902c) && L.f(this.f14903d, aVar.f14903d) && L.f(this.f14904e, aVar.f14904e) && L.f(this.f14905f, aVar.f14905f);
    }

    public final int hashCode() {
        return this.f14905f.hashCode() + ((this.f14904e.hashCode() + ((this.f14903d.hashCode() + ((this.f14902c.hashCode() + ((this.f14901b.hashCode() + (this.f14900a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{stringAttrs = ");
        sb2.append(this.f14905f);
        sb2.append(", intAttrs = ");
        sb2.append(this.f14904e);
        sb2.append(", floatAttrs = ");
        sb2.append(this.f14903d);
        sb2.append(", doubleAttrs = ");
        sb2.append(this.f14902c);
        sb2.append(", booleanAttrs = ");
        sb2.append(this.f14901b);
        sb2.append(", dateAttrs = ");
        return h.e(sb2, this.f14900a, '}');
    }
}
