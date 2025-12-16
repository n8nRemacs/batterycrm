package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class n8c extends l0g implements xg8 {
    public final Object c;

    public n8c(List list) {
        this.c = list;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.xg8
    public final String a(boolean z, boolean z2) {
        return "PRESET_AVATARS.Response(presets=" + eri.b(this.c, z, z2) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8c) && this.c.equals(((n8c) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a(false, false);
    }
}
