package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class rwd implements Iterable {
    public owd a;
    public owd b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public owd a(Object obj) {
        owd owdVar = this.a;
        while (owdVar != null && !owdVar.a.equals(obj)) {
            owdVar = owdVar.c;
        }
        return owdVar;
    }

    public Object b(Object obj, Object obj2) {
        owd owdVarA = a(obj);
        if (owdVarA != null) {
            return owdVarA.b;
        }
        owd owdVar = new owd(obj, obj2);
        this.d++;
        owd owdVar2 = this.b;
        if (owdVar2 == null) {
            this.a = owdVar;
            this.b = owdVar;
            return null;
        }
        owdVar2.c = owdVar;
        owdVar.d = owdVar2;
        this.b = owdVar;
        return null;
    }

    public Object c(Object obj) {
        owd owdVarA = a(obj);
        if (owdVarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((qwd) it.next()).a(owdVarA);
            }
        }
        owd owdVar = owdVarA.d;
        if (owdVar != null) {
            owdVar.c = owdVarA.c;
        } else {
            this.a = owdVarA.c;
        }
        owd owdVar2 = owdVarA.c;
        if (owdVar2 != null) {
            owdVar2.d = owdVar;
        } else {
            this.b = owdVar;
        }
        owdVarA.c = null;
        owdVarA.d = null;
        return owdVarA.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.nwd) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.rwd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rwd r7 = (defpackage.rwd) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            nwd r3 = (defpackage.nwd) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            nwd r4 = (defpackage.nwd) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            nwd r7 = (defpackage.nwd) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            nwd nwdVar = (nwd) it;
            if (!nwdVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) nwdVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        nwd nwdVar = new nwd(this.a, this.b, 0);
        this.c.put(nwdVar, Boolean.FALSE);
        return nwdVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            nwd nwdVar = (nwd) it;
            if (!nwdVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) nwdVar.next()).toString());
            if (nwdVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
