package org.joda.time.chrono;

import androidx.compose.runtime.C22026a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44868j;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: ISOChronology.java */
/* loaded from: classes7.dex */
public final class x extends AbstractC44857a {

    /* renamed from: N, reason: collision with root package name */
    public static final x f420650N;

    /* renamed from: O, reason: collision with root package name */
    public static final ConcurrentHashMap<AbstractC44868j, x> f420651O;
    private static final long serialVersionUID = -6212696554273812441L;

    /* compiled from: ISOChronology.java */
    public static final class a implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        /* renamed from: b, reason: collision with root package name */
        public transient AbstractC44868j f420652b;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f420652b = (AbstractC44868j) objectInputStream.readObject();
        }

        private Object readResolve() {
            return x.W(this.f420652b);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f420652b);
        }
    }

    static {
        ConcurrentHashMap<AbstractC44868j, x> concurrentHashMap = new ConcurrentHashMap<>();
        f420651O = concurrentHashMap;
        x xVar = new x(w.f420648l0, null);
        f420650N = xVar;
        concurrentHashMap.put(AbstractC44868j.f420911c, xVar);
    }

    public static x V() {
        return W(AbstractC44868j.e());
    }

    public static x W(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        ConcurrentHashMap<AbstractC44868j, x> concurrentHashMap = f420651O;
        x xVar = concurrentHashMap.get(abstractC44868j);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(E.X(f420650N, abstractC44868j), null);
        x xVarPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC44868j, xVar2);
        return xVarPutIfAbsent != null ? xVarPutIfAbsent : xVar2;
    }

    private Object writeReplace() {
        AbstractC44868j abstractC44868jO = o();
        a aVar = new a();
        aVar.f420652b = abstractC44868jO;
        return aVar;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return f420650N;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        return abstractC44868j == o() ? this : W(abstractC44868j);
    }

    @Override // org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        if (this.f420508b.o() == AbstractC44868j.f420911c) {
            AbstractC44864f abstractC44864f = y.f420653d;
            AbstractC44865g abstractC44865g = AbstractC44865g.f420881c;
            org.joda.time.field.i iVar = new org.joda.time.field.i((org.joda.time.field.e) abstractC44864f, abstractC44864f.x());
            c12206a.f420540H = iVar;
            c12206a.f420552k = iVar.f420697e;
            c12206a.f420539G = new org.joda.time.field.r(iVar, iVar.f420691c.k(), AbstractC44865g.f420884f);
            c12206a.f420535C = new org.joda.time.field.r((org.joda.time.field.i) c12206a.f420540H, c12206a.f420549h, AbstractC44865g.f420889k);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return o().equals(((x) obj).o());
        }
        return false;
    }

    public final int hashCode() {
        return o().hashCode() + 800855;
    }

    @Override // org.joda.time.AbstractC44854a
    public final String toString() {
        AbstractC44868j abstractC44868jO = o();
        return abstractC44868jO != null ? C22026a.c(new StringBuilder("ISOChronology["), abstractC44868jO.f420915b, ']') : "ISOChronology";
    }
}
