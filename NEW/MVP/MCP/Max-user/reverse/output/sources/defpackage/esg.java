package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import scout.exception.IllegalOverridesException;
import scout.exception.ScopeInitializationException;

/* loaded from: classes.dex */
public class esg {
    public final String a;
    public final uha b = g9j.a;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();

    public esg(String str) {
        this.a = str;
    }

    public a1e a() {
        uha uhaVar = this.b;
        String str = this.a;
        if (uhaVar != null) {
            try {
                if (az1.b(2, 2) >= 0) {
                    uha.y(uhaVar, "Start initialization of scope \"" + str + '\"');
                }
            } catch (Exception e) {
                throw new ScopeInitializationException(str, e);
            }
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            throw new IllegalOverridesException(str, arrayList);
        }
        a1e a1eVar = new a1e(str, this.c, this.d, this.e, this.f, this.g);
        if (uhaVar != null) {
            if (az1.b(2, 2) >= 0) {
                uha.y(uhaVar, "Finish initialization of \"" + str + '\"');
            }
        }
        return a1eVar;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(int i, io7 io7Var) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.e;
        Object arrayList = map.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(numValueOf, arrayList);
        }
        ((List) arrayList).add(io7Var);
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(int i, io7 io7Var) {
        if (this.d.put(Integer.valueOf(i), io7Var) != null) {
            this.h.add(Integer.valueOf(i));
        }
    }
}
