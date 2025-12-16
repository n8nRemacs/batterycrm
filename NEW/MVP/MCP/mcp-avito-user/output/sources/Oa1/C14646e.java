package Oa1;

/* renamed from: Oa1.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14646e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12358a;

    /* renamed from: b, reason: collision with root package name */
    public final Na1.c f12359b;

    public C14646e(String str, Na1.c cVar) {
        this.f12358a = str;
        this.f12359b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14646e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C14646e c14646e = (C14646e) obj;
        return kotlin.jvm.internal.L.f(this.f12358a, c14646e.f12358a) && kotlin.jvm.internal.L.f(this.f12359b, c14646e.f12359b);
    }

    public final int hashCode() {
        return this.f12359b.hashCode() + (this.f12358a.hashCode() * 31);
    }
}
