package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class qa {
    public static final qa d = new qa(id5.a, rd5.a, 0);
    public final Map a;
    public final Set b;
    public final long c;

    public qa(Map map, Set set, long j) {
        this.a = map;
        this.b = set;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    public static qa a(qa qaVar, LinkedHashMap linkedHashMap, xs xsVar, long j, int i) {
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i & 1) != 0) {
            linkedHashMap2 = qaVar.a;
        }
        xs xsVar2 = xsVar;
        if ((i & 2) != 0) {
            xsVar2 = qaVar.b;
        }
        if ((i & 4) != 0) {
            j = qaVar.c;
        }
        qaVar.getClass();
        return new qa(linkedHashMap2, xsVar2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return fni.a(this.a, qaVar.a) && fni.a(this.b, qaVar.b) && this.c == qaVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminWaitingRoomUsers(usersInWaitingRoom=");
        sb.append(this.a);
        sb.append(", lastNewUsersIds=");
        sb.append(this.b);
        sb.append(", lastUpdate=");
        return ho7.k(sb, this.c, ")");
    }
}
