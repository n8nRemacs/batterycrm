package defpackage;

/* loaded from: classes.dex */
public final class jxg implements ioe {
    public final p5g a;

    public jxg(p5g p5gVar) {
        this.a = p5gVar;
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
        return yne.a;
    }

    @Override // defpackage.ioe
    public final u18 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxg) && this.a.equals(((jxg) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return j0b.U0;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        return "UserInWaitingMore(title=" + this.a + ")";
    }
}
