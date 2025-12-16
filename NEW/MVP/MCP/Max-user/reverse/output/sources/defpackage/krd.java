package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class krd {
    public final Context a;
    public final Class b;
    public final String c;
    public Executor g;
    public Executor h;
    public iq i;
    public boolean j;
    public boolean m;
    public HashSet q;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public int k = 1;
    public boolean l = true;
    public final long n = -1;
    public final mc5 o = new mc5(29);
    public final LinkedHashSet p = new LinkedHashSet();

    public krd(Context context, Class cls, String str) {
        this.a = context;
        this.b = cls;
        this.c = str;
    }

    public final void a(rz9... rz9VarArr) {
        if (this.q == null) {
            this.q = new HashSet();
        }
        for (rz9 rz9Var : rz9VarArr) {
            this.q.add(Integer.valueOf(rz9Var.a));
            this.q.add(Integer.valueOf(rz9Var.b));
        }
        this.o.g((rz9[]) Arrays.copyOf(rz9VarArr, rz9VarArr.length));
    }

    public final lrd b() {
        boolean zContainsKey;
        Executor executor = this.g;
        if (executor == null && this.h == null) {
            es esVar = fs.d;
            this.h = esVar;
            this.g = esVar;
        } else if (executor != null && this.h == null) {
            this.h = executor;
        } else if (executor == null) {
            this.g = this.h;
        }
        HashSet hashSet = this.q;
        LinkedHashSet linkedHashSet = this.p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(ho7.f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        orf jbeVar = this.i;
        if (jbeVar == null) {
            jbeVar = new jbe(20);
        }
        orf orfVar = jbeVar;
        if (this.n > 0) {
            if (this.c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z = this.j;
        int i = this.k;
        if (i == 0) {
            throw null;
        }
        Context context = this.a;
        if (i == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = this.g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z2 = this.l;
        boolean z3 = this.m;
        String str = this.c;
        mc5 mc5Var = this.o;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.f;
        cf4 cf4Var = new cf4(context, str, orfVar, mc5Var, arrayList, z, i, executor2, executor3, z2, z3, linkedHashSet, arrayList2, arrayList3);
        Class cls = this.b;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = dnf.p(canonicalName, '.', '_', false).concat("_Impl");
        try {
            lrd lrdVar = (lrd) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            oq7 oq7Var = lrdVar.e;
            LinkedHashMap linkedHashMap = lrdVar.h;
            lrdVar.d = lrdVar.f(cf4Var);
            Set setH = lrdVar.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                int i2 = -1;
                if (!it2.hasNext()) {
                    int size = arrayList3.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            if (!bitSet.get(size)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                    }
                    for (rz9 rz9Var : lrdVar.g()) {
                        int i4 = rz9Var.a;
                        int i5 = rz9Var.b;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mc5Var.b;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                            if (map == null) {
                                map = id5.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i5));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            mc5Var.g(rz9Var);
                        }
                    }
                    prf prfVar = lrdVar.d;
                    if (prfVar == null) {
                        prfVar = null;
                    }
                    prf prfVar2 = lrdVar.d;
                    if (prfVar2 == null) {
                        prfVar2 = null;
                    }
                    boolean z4 = cf4Var.g == 3;
                    prf prfVar3 = lrdVar.d;
                    if (prfVar3 == null) {
                        prfVar3 = null;
                    }
                    prfVar3.setWriteAheadLoggingEnabled(z4);
                    lrdVar.g = cf4Var.e;
                    lrdVar.b = cf4Var.h;
                    lrdVar.c = new uee(cf4Var.i, 1);
                    lrdVar.f = cf4Var.f;
                    Map mapI = lrdVar.i();
                    BitSet bitSet2 = new BitSet();
                    for (Map.Entry entry : mapI.entrySet()) {
                        Class cls2 = (Class) entry.getKey();
                        for (Class cls3 : (List) entry.getValue()) {
                            int size2 = arrayList2.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i6 = size2 - 1;
                                    if (cls3.isAssignableFrom(arrayList2.get(size2).getClass())) {
                                        bitSet2.set(size2);
                                        break;
                                    }
                                    if (i6 < 0) {
                                        break;
                                    }
                                    size2 = i6;
                                }
                                size2 = -1;
                            } else {
                                size2 = -1;
                            }
                            if (!(size2 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            lrdVar.l.put(cls3, arrayList2.get(size2));
                        }
                    }
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i7 = size3 - 1;
                            if (!bitSet2.get(size3)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size3 = i7;
                        }
                    }
                    return lrdVar;
                }
                Class cls4 = (Class) it2.next();
                int size4 = arrayList3.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i8 = size4 - 1;
                        if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                            bitSet.set(size4);
                            i2 = size4;
                            break;
                        }
                        if (i8 < 0) {
                            break;
                        }
                        size4 = i8;
                    }
                }
                if (i2 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls4.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls4, arrayList3.get(i2));
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}
