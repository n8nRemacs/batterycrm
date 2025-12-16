package V71;

import java.io.Serializable;

/* compiled from: Equals.java */
/* loaded from: classes7.dex */
public class l implements org.mockito.d<Object>, i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f16930b;

    public l(Object obj) {
        this.f16930b = obj;
    }

    @Override // V71.i
    public final String a(String str) {
        StringBuilder sbA = androidx.appcompat.app.r.A("(", str, ") ");
        sbA.append(org.mockito.internal.matchers.text.d.a(this.f16930b));
        return sbA.toString();
    }

    @Override // org.mockito.d
    public boolean b(Object obj) {
        return k.a(this.f16930b, obj);
    }

    @Override // V71.i
    public final Object c() {
        return this.f16930b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        Object obj2 = this.f16930b;
        return (obj2 == null && lVar.f16930b == null) || (obj2 != null && obj2.equals(lVar.f16930b));
    }

    public final int hashCode() {
        return 1;
    }

    public String toString() {
        return org.mockito.internal.matchers.text.d.a(this.f16930b);
    }
}
