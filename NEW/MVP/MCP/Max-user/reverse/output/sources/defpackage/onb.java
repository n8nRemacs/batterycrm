package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class onb {
    public final cnb a;
    public final Map b;
    public final Map c;
    public final zi1 d;
    public final zi1 e;
    public final Map f;
    public final Map g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onb(cnb cnbVar) {
        id5 id5Var = id5.a;
        this(cnbVar, id5Var, id5Var, null, null, id5Var, id5Var, false);
    }

    public final zi1 a() {
        Object next;
        zi1 id;
        Map map = this.f;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((cnb) next).a.m()) {
                break;
            }
        }
        cnb cnbVar = (cnb) next;
        return (cnbVar == null || (id = cnbVar.a.getId()) == null) ? (zi1) ue3.H(map.keySet()) : id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onb)) {
            return false;
        }
        onb onbVar = (onb) obj;
        return fni.a(this.a, onbVar.a) && fni.a(this.b, onbVar.b) && fni.a(this.c, onbVar.c) && fni.a(this.d, onbVar.d) && fni.a(this.e, onbVar.e) && fni.a(this.f, onbVar.f) && fni.a(this.g, onbVar.g) && this.h == onbVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        zi1 zi1Var = this.d;
        int iHashCode2 = (iHashCode + (zi1Var == null ? 0 : zi1Var.hashCode())) * 31;
        zi1 zi1Var2 = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (zi1Var2 != null ? zi1Var2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ParticipantsState(me=" + this.a + ", usersInCall=" + this.b + ", participants=" + this.c + ", primarySpeaker=" + this.d + ", opponentSpeaker=" + this.e + ", screenShareSpeakers=" + this.f + ", raisedHands=" + this.g + ", hasAnyEnabledCamera=" + this.h + ")";
    }

    public onb(cnb cnbVar, Map map, Map map2, zi1 zi1Var, zi1 zi1Var2, Map map3, Map map4, boolean z) {
        this.a = cnbVar;
        this.b = map;
        this.c = map2;
        this.d = zi1Var;
        this.e = zi1Var2;
        this.f = map3;
        this.g = map4;
        this.h = z;
    }
}
