package org.threeten.bp.zone;

import java.io.Serializable;
import org.threeten.bp.q;

/* compiled from: ZoneOffsetTransition.java */
/* loaded from: classes16.dex */
public final class e implements Comparable<e>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: b, reason: collision with root package name */
    public final org.threeten.bp.f f422252b;

    /* renamed from: c, reason: collision with root package name */
    public final q f422253c;

    /* renamed from: d, reason: collision with root package name */
    public final q f422254d;

    public e(org.threeten.bp.f fVar, q qVar, q qVar2) {
        this.f422252b = fVar;
        this.f422253c = qVar;
        this.f422254d = qVar2;
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean a() {
        return this.f422254d.f422109c > this.f422253c.f422109c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        e eVar2 = eVar;
        org.threeten.bp.d dVarT = this.f422252b.t(this.f422253c);
        org.threeten.bp.d dVarT2 = eVar2.f422252b.t(eVar2.f422253c);
        dVarT.getClass();
        int iA2 = w81.d.a(dVarT.f421935b, dVarT2.f421935b);
        return iA2 != 0 ? iA2 : dVarT.f421936c - dVarT2.f421936c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f422252b.equals(eVar.f422252b) && this.f422253c.equals(eVar.f422253c) && this.f422254d.equals(eVar.f422254d);
    }

    public final int hashCode() {
        return (this.f422252b.hashCode() ^ this.f422253c.f422109c) ^ Integer.rotateLeft(this.f422254d.f422109c, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(a() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f422252b);
        sb2.append(this.f422253c);
        sb2.append(" to ");
        sb2.append(this.f422254d);
        sb2.append(']');
        return sb2.toString();
    }

    public e(long j12, q qVar, q qVar2) {
        this.f422252b = org.threeten.bp.f.H(j12, 0, qVar);
        this.f422253c = qVar;
        this.f422254d = qVar2;
    }
}
