package defpackage;

/* loaded from: classes.dex */
public final class jld {
    public static final jld b = new jld(false);
    public final boolean a;

    public jld(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jld.class == obj.getClass() && this.a == ((jld) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
