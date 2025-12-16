package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues.java */
/* loaded from: classes10.dex */
public class V {

    /* renamed from: b, reason: collision with root package name */
    public View f54717b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f54716a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<L> f54718c = new ArrayList<>();

    @Deprecated
    public V() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v12 = (V) obj;
        return this.f54717b == v12.f54717b && this.f54716a.equals(v12.f54716a);
    }

    public final int hashCode() {
        return this.f54716a.hashCode() + (this.f54717b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbZ = androidx.appcompat.app.r.z("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbZ.append(this.f54717b);
        sbZ.append("\n");
        String strQ = androidx.appcompat.app.r.q(sbZ.toString(), "    values:");
        HashMap map = this.f54716a;
        for (String str : map.keySet()) {
            strQ = strQ + "    " + str + ": " + map.get(str) + "\n";
        }
        return strQ;
    }

    public V(@j.N View view) {
        this.f54717b = view;
    }
}
