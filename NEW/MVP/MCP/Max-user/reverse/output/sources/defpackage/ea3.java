package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ea3 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ea3(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            k38 k38Var = (k38) entry.getValue();
            List arrayList = (List) this.a.get(k38Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(k38Var, arrayList);
            }
            arrayList.add((fa3) entry.getKey());
        }
    }

    public static void a(List list, j48 j48Var, k38 k38Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                fa3 fa3Var = (fa3) list.get(size);
                Method method = fa3Var.b;
                try {
                    int i = fa3Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, j48Var);
                    } else if (i == 2) {
                        method.invoke(obj, j48Var, k38Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
