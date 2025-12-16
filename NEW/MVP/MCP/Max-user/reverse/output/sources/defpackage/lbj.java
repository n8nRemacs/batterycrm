package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lbj {
    public static final void a(File file, em6 em6Var) {
        try {
            hz5.b(file);
        } catch (Exception e) {
            em6Var.invoke("Exception during file deleting: " + e.getMessage());
        }
    }

    public static final void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IOException(ho7.i("File ", file.getAbsolutePath(), " does not have a parent"));
        }
        parentFile.mkdirs();
        if (!parentFile.exists()) {
            throw new IOException(wy1.h("Can not create directories for ", file.getAbsolutePath()));
        }
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            if (l9fVar.b == 1 && l9fVar.a == 2) {
                arrayList.add((j9f) l9fVar);
            }
        }
        return arrayList;
    }

    public static k5i d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size() / 2);
        ArrayList arrayList4 = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            int i = l9fVar.a;
            int i2 = l9fVar.b;
            if (i == 1) {
                if (i2 == 1) {
                    arrayList.add((f9f) l9fVar);
                } else {
                    if (i2 != 2) {
                        throw new AssertionError("unreachable: " + l9fVar);
                    }
                    arrayList2.add((g9f) l9fVar);
                }
            } else {
                if (i != 2) {
                    throw new AssertionError("unreachable: " + l9fVar);
                }
                if (i2 == 1) {
                    arrayList3.add((j9f) l9fVar);
                } else {
                    if (i2 != 2) {
                        throw new AssertionError("unreachable: " + l9fVar);
                    }
                    arrayList4.add((k9f) l9fVar);
                }
            }
        }
        return new k5i(arrayList, arrayList3, arrayList2, arrayList4, 9);
    }

    public static ArrayList e(List list, u42 u42Var) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            if (u42Var.j.equals(l9fVar.d)) {
                arrayList.add(l9fVar);
            }
        }
        return arrayList;
    }
}
