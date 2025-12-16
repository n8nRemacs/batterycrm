package org.joda.time.chrono;

import androidx.compose.runtime.C22026a;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44868j;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;
import org.joda.time.C44856c;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: BuddhistChronology.java */
/* loaded from: classes7.dex */
public final class m extends AbstractC44857a {

    /* renamed from: N, reason: collision with root package name */
    public static final AbstractC44864f f420603N = new i("BE");

    /* renamed from: O, reason: collision with root package name */
    public static final ConcurrentHashMap<AbstractC44868j, m> f420604O = new ConcurrentHashMap<>();

    /* renamed from: P, reason: collision with root package name */
    public static final m f420605P = V(AbstractC44868j.f420911c);
    private static final long serialVersionUID = -3474595157769370126L;

    public static m V(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        ConcurrentHashMap<AbstractC44868j, m> concurrentHashMap = f420604O;
        m mVar = concurrentHashMap.get(abstractC44868j);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(q.X(abstractC44868j, null, 4), null);
        m mVar3 = new m(C.Y(mVar2, new C44856c(mVar2), null), "");
        m mVarPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC44868j, mVar3);
        return mVarPutIfAbsent != null ? mVarPutIfAbsent : mVar3;
    }

    private Object readResolve() {
        AbstractC44854a abstractC44854a = this.f420508b;
        return abstractC44854a == null ? f420605P : V(abstractC44854a.o());
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return f420605P;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        return abstractC44868j == o() ? this : V(abstractC44868j);
    }

    @Override // org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        if (this.f420509c == null) {
            c12206a.f420553l = org.joda.time.field.x.h(AbstractC44872n.f420929c);
            org.joda.time.field.n nVar = new org.joda.time.field.n(new org.joda.time.field.u(this, c12206a.f420537E), 543);
            c12206a.f420537E = nVar;
            c12206a.f420538F = new org.joda.time.field.g(nVar, c12206a.f420553l, AbstractC44865g.f420882d);
            c12206a.f420534B = new org.joda.time.field.n(new org.joda.time.field.u(this, c12206a.f420534B), 543);
            org.joda.time.field.i iVar = new org.joda.time.field.i(new org.joda.time.field.n(c12206a.f420538F, 99), c12206a.f420553l);
            c12206a.f420540H = iVar;
            c12206a.f420552k = iVar.f420697e;
            c12206a.f420539G = new org.joda.time.field.n(new org.joda.time.field.r(iVar), AbstractC44865g.f420884f, 1);
            AbstractC44864f abstractC44864f = c12206a.f420534B;
            AbstractC44871m abstractC44871m = c12206a.f420552k;
            c12206a.f420535C = new org.joda.time.field.n(new org.joda.time.field.r(abstractC44864f, abstractC44871m), AbstractC44865g.f420889k, 1);
            c12206a.f420541I = f420603N;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return o().equals(((m) obj).o());
        }
        return false;
    }

    public final int hashCode() {
        return o().hashCode() + 499287079;
    }

    @Override // org.joda.time.AbstractC44854a
    public final String toString() {
        AbstractC44868j abstractC44868jO = o();
        return abstractC44868jO != null ? C22026a.c(new StringBuilder("BuddhistChronology["), abstractC44868jO.f420915b, ']') : "BuddhistChronology";
    }
}
