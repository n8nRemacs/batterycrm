package defpackage;

import com.google.firebase.components.DependencyCycleException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class t7j {
    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (nc4 nc4Var : (Set) it2.next()) {
                        for (vt4 vt4Var : nc4Var.a.c) {
                            if (vt4Var.c == 0) {
                                Set<nc4> set = (Set) map.get(new oc4(vt4Var.a, vt4Var.b == 2));
                                if (set != null) {
                                    for (nc4 nc4Var2 : set) {
                                        nc4Var.b.add(nc4Var2);
                                        nc4Var2.c.add(nc4Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    nc4 nc4Var3 = (nc4) it4.next();
                    if (nc4Var3.c.isEmpty()) {
                        hashSet2.add(nc4Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    nc4 nc4Var4 = (nc4) hashSet2.iterator().next();
                    hashSet2.remove(nc4Var4);
                    i++;
                    Iterator it5 = nc4Var4.b.iterator();
                    while (it5.hasNext()) {
                        nc4 nc4Var5 = (nc4) it5.next();
                        nc4Var5.c.remove(nc4Var4);
                        if (nc4Var5.c.isEmpty()) {
                            hashSet2.add(nc4Var5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    nc4 nc4Var6 = (nc4) it6.next();
                    if (!nc4Var6.c.isEmpty() && !nc4Var6.b.isEmpty()) {
                        arrayList2.add(nc4Var6.a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            cl3 cl3Var = (cl3) it.next();
            nc4 nc4Var7 = new nc4(cl3Var);
            for (fsc fscVar : cl3Var.b) {
                boolean z = cl3Var.e == 0;
                oc4 oc4Var = new oc4(fscVar, !z);
                if (!map.containsKey(oc4Var)) {
                    map.put(oc4Var, new HashSet());
                }
                Set set2 = (Set) map.get(oc4Var);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + fscVar + ".");
                }
                set2.add(nc4Var7);
            }
        }
    }

    public static final void b(vy vyVar, qk qkVar) throws IOException {
        Object objValueOf;
        FileInputStream fileInputStreamC = vyVar.c();
        if (fileInputStreamC == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStreamC, 8192);
        try {
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            try {
                py0 py0Var = new py0(28);
                while (dataInputStream.available() > 0) {
                    String utf = dataInputStream.readUTF();
                    switch (((tog) to8.c(tog.b, Integer.valueOf(dataInputStream.readUnsignedByte()))).ordinal()) {
                        case 0:
                            objValueOf = Integer.valueOf(dataInputStream.readInt());
                            qkVar.invoke(utf, objValueOf);
                        case 1:
                            objValueOf = Float.valueOf(dataInputStream.readFloat());
                            qkVar.invoke(utf, objValueOf);
                        case 2:
                            objValueOf = Long.valueOf(dataInputStream.readLong());
                            qkVar.invoke(utf, objValueOf);
                        case 3:
                            objValueOf = dataInputStream.readUTF();
                            qkVar.invoke(utf, objValueOf);
                        case 4:
                            objValueOf = cpi.d(dataInputStream.readUTF());
                            qkVar.invoke(utf, objValueOf);
                        case 5:
                            objValueOf = Boolean.valueOf(dataInputStream.readBoolean());
                            qkVar.invoke(utf, objValueOf);
                        case 6:
                            objValueOf = a5j.b(dataInputStream, py0Var);
                            qkVar.invoke(utf, objValueOf);
                        case 7:
                            objValueOf = cpi.d(a5j.b(dataInputStream, py0Var));
                            qkVar.invoke(utf, objValueOf);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                dataInputStream.close();
                bufferedInputStream.close();
            } finally {
            }
        } finally {
        }
    }
}
