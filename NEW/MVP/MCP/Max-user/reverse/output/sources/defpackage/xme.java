package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class xme implements ioe {
    public final long a;
    public final int b;
    public final wme c;
    public final s5g d;

    public xme(long j, int i, wme wmeVar) {
        r5g r5gVar;
        this.a = j;
        this.b = i;
        this.c = wmeVar;
        if (wmeVar instanceof vme) {
            r5gVar = ((vme) wmeVar).a;
        } else {
            if (!(wmeVar instanceof ume)) {
                throw new NoWhenBranchMatchedException();
            }
            r5gVar = s5g.b;
        }
        this.d = r5gVar;
    }

    @Override // defpackage.ioe
    public final s5g a() {
        return null;
    }

    @Override // defpackage.ioe
    public final xne b() {
        return null;
    }

    @Override // defpackage.ioe
    public final s5g c() {
        return null;
    }

    @Override // defpackage.ioe
    public final foe d() {
        return null;
    }

    @Override // defpackage.ioe
    public final u18 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xme)) {
            return false;
        }
        xme xmeVar = (xme) obj;
        return this.a == xmeVar.a && this.b == xmeVar.b && fni.a(this.c, xmeVar.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.d;
    }

    @Override // defpackage.ioe
    public final hoe getType() {
        return hoe.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b, Long.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return qab.g;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "SettingSectionNameItem(itemId=" + this.a + ", sectionId=" + this.b + ", titleElement=" + this.c + ")";
    }
}
