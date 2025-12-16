package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class nji implements Map, Serializable {
    public final /* synthetic */ int a;
    public final transient Object[] b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;
    public transient AbstractCollection o;

    public /* synthetic */ nji(int i, Object[] objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                lji ljiVar = (lji) this.o;
                if (ljiVar == null) {
                    ljiVar = new lji(1, this.b);
                    this.o = ljiVar;
                }
                return ljiVar.contains(obj);
            default:
                xcj xcjVar = (xcj) this.o;
                if (xcjVar == null) {
                    xcjVar = new xcj(1, this.b);
                    this.o = xcjVar;
                }
                return xcjVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                hji hjiVar = (hji) this.c;
                if (hjiVar != null) {
                    return hjiVar;
                }
                hji hjiVar2 = new hji(this, this.b);
                this.c = hjiVar2;
                return hjiVar2;
            default:
                xbj xbjVar = (xbj) this.c;
                if (xbjVar != null) {
                    return xbjVar;
                }
                xbj xbjVar2 = new xbj(this, this.b);
                this.c = xbjVar2;
                return xbjVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r0 = 0
            if (r4 != 0) goto La
        L8:
            r4 = r0
            goto L1e
        La:
            r1 = 0
            java.lang.Object[] r2 = r3.b
            r1 = r2[r1]
            r1.getClass()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8
            r4 = 1
            r4 = r2[r4]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r0 = r4
        L22:
            return r0
        L23:
            r0 = 0
            if (r4 != 0) goto L28
        L26:
            r4 = r0
            goto L3c
        L28:
            r1 = 0
            java.lang.Object[] r2 = r3.b
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L26
            r4 = 1
            r4 = r2[r4]
            java.util.Objects.requireNonNull(r4)
        L3c:
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nji.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                hji hjiVar = (hji) this.c;
                if (hjiVar == null) {
                    hjiVar = new hji(this, this.b);
                    this.c = hjiVar;
                }
                return bvi.c(hjiVar);
            default:
                xbj xbjVar = (xbj) this.c;
                if (xbjVar == null) {
                    xbjVar = new xbj(this, this.b);
                    this.c = xbjVar;
                }
                Iterator it = xbjVar.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                jji jjiVar = (jji) this.d;
                if (jjiVar != null) {
                    return jjiVar;
                }
                jji jjiVar2 = new jji(this, new lji(0, this.b));
                this.d = jjiVar2;
                return jjiVar2;
            default:
                icj icjVar = (icj) this.d;
                if (icjVar != null) {
                    return icjVar;
                }
                icj icjVar2 = new icj(this, new xcj(0, this.b));
                this.d = icjVar2;
                return icjVar2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                boolean z = true;
                StringBuilder sb = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((hji) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            default:
                boolean z2 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((xbj) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                lji ljiVar = (lji) this.o;
                if (ljiVar != null) {
                    return ljiVar;
                }
                lji ljiVar2 = new lji(1, this.b);
                this.o = ljiVar2;
                return ljiVar2;
            default:
                xcj xcjVar = (xcj) this.o;
                if (xcjVar != null) {
                    return xcjVar;
                }
                xcj xcjVar2 = new xcj(1, this.b);
                this.o = xcjVar2;
                return xcjVar2;
        }
    }
}
