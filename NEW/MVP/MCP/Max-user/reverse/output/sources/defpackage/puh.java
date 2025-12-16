package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class puh implements avh {
    public final List a;
    public final Bundle b;
    public final n5g c;

    public puh(o98 o98Var, Bundle bundle, n5g n5gVar) {
        this.a = o98Var;
        this.b = bundle;
        this.c = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puh)) {
            return false;
        }
        puh puhVar = (puh) obj;
        return fni.a(this.a, puhVar.a) && this.b.equals(puhVar.b) && this.c.equals(puhVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowContextMenu(actions=" + this.a + ", payload=" + this.b + ", title=" + this.c + ")";
    }
}
