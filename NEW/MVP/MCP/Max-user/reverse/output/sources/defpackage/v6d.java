package defpackage;

import com.google.firebase.components.DependencyException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v6d implements ol3 {
    public Object X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public v6d(int i) {
        this.a = i;
        switch (i) {
            case 4:
                break;
            default:
                zva zvaVar = new zva();
                this.b = zvaVar;
                i5i i5iVar = new i5i(zvaVar);
                rl rlVar = new rl(2, zvaVar);
                u00 u00Var = new u00();
                u00Var.b = zvaVar;
                u00Var.c = i5iVar;
                u00Var.d = rlVar;
                u00Var.g = new Object();
                this.c = u00Var;
                this.d = new f94(zvaVar);
                this.o = new h1h(zvaVar);
                this.X = new zl3();
                break;
        }
    }

    @Override // defpackage.ol3
    public Object a(Class cls) {
        if (!((Set) this.b).contains(fsc.a(cls))) {
            throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((ol3) this.X).a(cls);
        if (!cls.equals(nqc.class)) {
            return objA;
        }
        return new zod();
    }

    @Override // defpackage.ol3
    public Set b(fsc fscVar) {
        if (((Set) this.d).contains(fscVar)) {
            return ((ol3) this.X).b(fscVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + fscVar + ">.");
    }

    @Override // defpackage.ol3
    public rpc c(Class cls) {
        return e(fsc.a(cls));
    }

    @Override // defpackage.ol3
    public rpc d(fsc fscVar) {
        if (((Set) this.o).contains(fscVar)) {
            return ((ol3) this.X).d(fscVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + fscVar + ">>.");
    }

    @Override // defpackage.ol3
    public rpc e(fsc fscVar) {
        if (((Set) this.c).contains(fscVar)) {
            return ((ol3) this.X).e(fscVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + fscVar + ">.");
    }

    @Override // defpackage.ol3
    public Object f(fsc fscVar) {
        if (((Set) this.b).contains(fscVar)) {
            return ((ol3) this.X).f(fscVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + fscVar + ".");
    }

    public long g(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            ((y6d) this.b).logException("RTCDeprecatedStat", "stat.parse", e);
            return -1L;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append('\n');
                for (Field field : v6d.class.getDeclaredFields()) {
                    try {
                        sb.append(field.getName());
                        sb.append('=');
                        sb.append(field.get(this));
                        sb.append('\n');
                    } catch (IllegalAccessException e) {
                        sb.append("\nCaught ");
                        sb.append(e.getMessage());
                        sb.append('\n');
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: NumberFormatException -> 0x0053, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0053, blocks: (B:9:0x002d, B:40:0x007f, B:41:0x0089, B:42:0x0093, B:43:0x009d, B:18:0x0049, B:23:0x0055, B:26:0x005f, B:29:0x0069), top: B:88:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v6d(defpackage.y6d r17, org.webrtc.StatsReport[] r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6d.<init>(y6d, org.webrtc.StatsReport[]):void");
    }

    public v6d(cl3 cl3Var, ol3 ol3Var) {
        this.a = 3;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<vt4> set = cl3Var.c;
        Set set2 = cl3Var.g;
        for (vt4 vt4Var : set) {
            int i = vt4Var.c;
            int i2 = vt4Var.b;
            boolean z = i == 0;
            fsc fscVar = vt4Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(fscVar);
                } else {
                    hashSet.add(fscVar);
                }
            } else if (i == 2) {
                hashSet3.add(fscVar);
            } else if (i2 == 2) {
                hashSet5.add(fscVar);
            } else {
                hashSet2.add(fscVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(fsc.a(nqc.class));
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.o = Collections.unmodifiableSet(hashSet5);
        this.X = ol3Var;
    }

    public v6d(pf2 pf2Var, qv3 qv3Var, lzf lzfVar, o7e o7eVar, f7b f7bVar, z7c z7cVar, f8c f8cVar, k18 k18Var, k18 k18Var2) {
        this.a = 1;
        this.b = qv3Var;
        this.c = lzfVar;
        this.d = new spf(pf2Var);
        this.o = new bwf(new qn2(this, 7, k18Var));
        this.X = new lz9(o7eVar, new ssb(o7eVar, 10, f7bVar), z7cVar, f8cVar, k18Var2, new mc5(11, this));
    }
}
