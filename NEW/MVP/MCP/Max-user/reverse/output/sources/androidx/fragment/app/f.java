package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(a aVar) {
        if (this.a.contains(aVar)) {
            throw new IllegalStateException("Fragment already added: " + aVar);
        }
        synchronized (this.a) {
            this.a.add(aVar);
        }
        aVar.u0 = true;
    }

    public final a b(String str) {
        e eVar = (e) this.b.get(str);
        if (eVar != null) {
            return eVar.c;
        }
        return null;
    }

    public final a c(String str) {
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                a aVarC = eVar.c;
                if (!str.equals(aVarC.o)) {
                    aVarC = aVarC.F0.c.c(str);
                }
                if (aVarC != null) {
                    return aVarC;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(e eVar) {
        a aVar = eVar.c;
        String str = aVar.o;
        HashMap map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(aVar.o, eVar);
        if (aVar.N0) {
            if (aVar.M0) {
                this.d.e(aVar);
            } else {
                this.d.i(aVar);
            }
            aVar.N0 = false;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + aVar);
        }
    }

    public final void h(e eVar) {
        a aVar = eVar.c;
        if (aVar.M0) {
            this.d.i(aVar);
        }
        String str = aVar.o;
        HashMap map = this.b;
        if (map.get(str) == eVar && ((e) map.put(aVar.o, null)) != null && c.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + aVar);
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
