package kotlin.reflect.jvm.internal.impl.name;

import Y61.l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallableId.kt */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f409235a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f409236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f409237c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final c f409238d;

    /* compiled from: CallableId.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.name.a$a, reason: collision with other inner class name */
    public static final class C11677a {
        public /* synthetic */ C11677a(C42822w c42822w) {
            this();
        }

        public C11677a() {
        }
    }

    static {
        new C11677a(null);
        c.j(h.f409262g);
    }

    public a(c cVar, c cVar2, f fVar, c cVar3, int i12, C42822w c42822w) {
        cVar3 = (i12 & 8) != 0 ? null : cVar3;
        this.f409235a = cVar;
        this.f409236b = cVar2;
        this.f409237c = fVar;
        this.f409238d = cVar3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f409235a, aVar.f409235a) && L.f(this.f409236b, aVar.f409236b) && L.f(this.f409237c, aVar.f409237c) && L.f(this.f409238d, aVar.f409238d);
    }

    public final int hashCode() {
        int iHashCode = this.f409235a.hashCode() * 31;
        c cVar = this.f409236b;
        int iHashCode2 = (this.f409237c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        c cVar2 = this.f409238d;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f409235a.b().replace('.', '/'));
        sb2.append("/");
        c cVar = this.f409236b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f409237c);
        return sb2.toString();
    }
}
