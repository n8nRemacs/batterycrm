package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class wf {
    public final EnhancedVectorDrawable a;
    public final ArrayList b;
    public final ArrayMap c;

    public wf(EnhancedVectorDrawable enhancedVectorDrawable, ArrayList arrayList, ArrayMap arrayMap) {
        this.a = enhancedVectorDrawable;
        this.b = arrayList;
        this.c = arrayMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return fni.a(this.a, wfVar.a) && fni.a(this.b, wfVar.b) && fni.a(this.c, wfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ParsedResource(drawable=" + this.a + ", animators=" + this.b + ", targetNameMap=" + this.c + ")";
    }
}
