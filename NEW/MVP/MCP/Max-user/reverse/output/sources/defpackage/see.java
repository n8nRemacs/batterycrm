package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class see implements ree, iz0 {
    public final ree a;
    public final String b;
    public final Set c;

    public see(ree reeVar) {
        this.a = reeVar;
        this.b = reeVar.a() + '?';
        this.c = ofi.a(reeVar);
    }

    @Override // defpackage.ree
    public final String a() {
        return this.b;
    }

    @Override // defpackage.iz0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.ree
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ree
    public final int d(String str) {
        return this.a.d(str);
    }

    @Override // defpackage.ree
    public final s9j e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof see) {
            return fni.a(this.a, ((see) obj).a);
        }
        return false;
    }

    @Override // defpackage.ree
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.ree
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.ree
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.ree
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.ree
    public final ree i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.ree
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.ree
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
