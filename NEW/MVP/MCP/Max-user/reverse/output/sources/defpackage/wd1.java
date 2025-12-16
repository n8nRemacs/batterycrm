package defpackage;

/* loaded from: classes.dex */
public final class wd1 implements yd1 {
    public final String a;

    public wd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd1) && fni.a(this.a, ((wd1) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 9223372036854775805L;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return 9223372036854775805L == t98Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.t98
    public final int m() {
        return 3;
    }

    public final String toString() {
        return ho7.i("CallShareLinkPreviewState(link=", this.a, ")");
    }
}
