package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class t88 extends k0 {
    public final zy7 a;
    public final zy7 b;
    public final s88 c;

    public t88(zy7 zy7Var, zy7 zy7Var2) {
        this.a = zy7Var;
        this.b = zy7Var2;
        this.c = new s88("kotlin.collections.LinkedHashMap", zy7Var.d(), zy7Var2.d());
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        h(obj);
        b bVarA = bVar.a(d());
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            bVarA.o(d(), i, this.a, key);
            i += 2;
            bVarA.o(d(), i2, this.b, value);
        }
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final ree d() {
        return this.c;
    }

    @Override // defpackage.k0
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // defpackage.k0
    public final Iterator g(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((Map) obj).size();
    }

    @Override // defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        Map map = (Map) obj;
        Object objP = yl3Var.p(d(), i, this.a, null);
        int iE = yl3Var.e(d());
        if (iE != i + 1) {
            throw new IllegalArgumentException(ho7.g("Value must follow key in a map, index for key: ", i, iE, ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objP);
        zy7 zy7Var = this.b;
        map.put(objP, (!zContainsKey || (zy7Var.d().e() instanceof i9c)) ? yl3Var.p(d(), iE, zy7Var, null) : yl3Var.p(d(), iE, zy7Var, to8.c(map, objP)));
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        return new LinkedHashMap((Map) null);
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return (LinkedHashMap) obj;
    }
}
