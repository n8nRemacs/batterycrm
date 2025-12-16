package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class lsi {
    public static wx a() throws InterruptedException {
        wx wxVar = wx.j.f;
        if (wxVar == null) {
            long jNanoTime = System.nanoTime();
            wx.class.wait(wx.h);
            if (wx.j.f != null || System.nanoTime() - jNanoTime < wx.i) {
                return null;
            }
            return wx.j;
        }
        long jNanoTime2 = wxVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            wx.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        wx.j.f = wxVar.f;
        wxVar.f = null;
        return wxVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int[], java.io.Serializable] */
    public static final hd6 b(Set set) {
        hd6 hd6Var = new hd6(1);
        Iterator it = set.iterator();
        int size = set.size();
        ?? r2 = new int[size];
        for (int i = 0; i < size; i++) {
            r2[i] = ((ra6) it.next()).a;
        }
        hd6Var.b = r2;
        return hd6Var;
    }

    public static final EnumSet c(hd6 hd6Var) {
        Object next;
        int[] iArr = (int[]) hd6Var.b;
        EnumSet enumSetNoneOf = EnumSet.noneOf(ra6.class);
        for (int i : iArr) {
            f2 f2Var = new f2(0, ra6.X);
            while (true) {
                if (!f2Var.hasNext()) {
                    next = null;
                    break;
                }
                next = f2Var.next();
                if (((ra6) next).a == i) {
                    break;
                }
            }
            ra6 ra6Var = (ra6) next;
            if (ra6Var == null) {
                throw new IllegalStateException(("unsupported type " + i).toString());
            }
            enumSetNoneOf.add(ra6Var);
        }
        return enumSetNoneOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void d(Context context) {
        LinkedHashMap linkedHashMapSingletonMap;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            cei.g().c(r4i.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(gl.a.a(context), "androidx.work.workdb");
            String[] strArr = r4i.b;
            int i = to8.i(strArr.length);
            if (i < 16) {
                i = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMapSingletonMap = Collections.singletonMap(databasePath, file);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath, file);
                linkedHashMapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : linkedHashMapSingletonMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        cei.g().o(r4i.a, "Over-writing contents of " + file3);
                    }
                    cei.g().c(r4i.a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
