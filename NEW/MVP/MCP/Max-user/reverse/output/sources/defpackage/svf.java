package defpackage;

/* loaded from: classes2.dex */
public final class svf extends sj0 {
    public final boolean b;

    public svf(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svf) && this.b == ((svf) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // defpackage.sj0
    public final String toString() {
        return xrf.p("SyncMutedChatsEvent(isSuccessful=", ")", this.b);
    }
}
