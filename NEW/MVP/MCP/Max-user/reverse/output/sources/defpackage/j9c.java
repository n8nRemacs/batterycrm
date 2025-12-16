package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class j9c implements ree {
    public final String a;
    public final i9c b;

    public j9c(String str, i9c i9cVar) {
        this.a = str;
        this.b = i9cVar;
    }

    @Override // defpackage.ree
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ree
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ree
    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.ree
    public final s9j e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9c)) {
            return false;
        }
        j9c j9cVar = (j9c) obj;
        return fni.a(this.a, j9cVar.a) && fni.a(this.b, j9cVar.b);
    }

    @Override // defpackage.ree
    public final int f() {
        return 0;
    }

    @Override // defpackage.ree
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.ree
    public final List getAnnotations() {
        return hd5.a;
    }

    @Override // defpackage.ree
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.ree
    public final ree i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.ree
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.ree
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return u45.l(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
