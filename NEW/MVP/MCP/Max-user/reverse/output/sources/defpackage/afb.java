package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class afb {
    public static final h5b[] d;
    public final bwf a;
    public final Map b;
    public final ConcurrentHashMap c;

    static {
        h5b h5bVar = h5b.d;
        d = new h5b[]{h5b.d, h5b.j, h5b.k, h5b.e, h5b.f, h5b.h, h5b.i, h5b.g};
    }

    public afb(bwf bwfVar) {
        this.a = bwfVar;
        h5b[] h5bVarArr = d;
        this.b = Collections.synchronizedMap(new LinkedHashMap(h5bVarArr.length));
        this.c = new ConcurrentHashMap(h5bVarArr.length * 2);
        for (h5b h5bVar : h5bVarArr) {
            b(h5bVar.a, h5bVar);
        }
    }

    public final h5b a(String str) {
        return (h5b) this.b.computeIfAbsent(str, new ni(21, new ia(this, 28, str)));
    }

    public final void b(String str, h5b h5bVar) {
        this.b.put(str, h5bVar);
        yeb yebVar = h5bVar.b;
        yeb yebVar2 = h5bVar.c;
        String name = yebVar2.getName();
        ConcurrentHashMap concurrentHashMap = this.c;
        concurrentHashMap.put(name, yebVar2);
        concurrentHashMap.put(yebVar.getName(), yebVar);
        for (h5b h5bVar2 : d) {
            if (h5bVar2.a.equals(str)) {
                return;
            }
        }
        ((SharedPreferences) this.a.getValue()).edit();
        throw new oia("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
    }
}
