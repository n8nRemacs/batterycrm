package defpackage;

/* loaded from: classes2.dex */
public final class fec {
    public final boolean a;
    public final eec b;
    public final eec c;
    public final eec d;
    public final eec e;
    public final eec f;
    public final eec g;
    public final eec h;
    public final eec i;

    public fec(boolean z, eec eecVar, eec eecVar2, eec eecVar3, eec eecVar4, eec eecVar5, eec eecVar6, eec eecVar7, eec eecVar8) {
        this.a = z;
        this.b = eecVar;
        this.c = eecVar2;
        this.d = eecVar3;
        this.e = eecVar4;
        this.f = eecVar5;
        this.g = eecVar6;
        this.h = eecVar7;
        this.i = eecVar8;
    }

    public static fec a(fec fecVar, boolean z, eec eecVar, eec eecVar2, eec eecVar3, eec eecVar4, eec eecVar5, eec eecVar6, eec eecVar7, eec eecVar8, int i) {
        if ((i & 32) != 0) {
            z = fecVar.a;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            eecVar = fecVar.b;
        }
        eec eecVar9 = eecVar;
        if ((i & 128) != 0) {
            eecVar2 = fecVar.c;
        }
        eec eecVar10 = eecVar2;
        if ((i & 256) != 0) {
            eecVar3 = fecVar.d;
        }
        eec eecVar11 = eecVar3;
        if ((i & 512) != 0) {
            eecVar4 = fecVar.e;
        }
        return new fec(z2, eecVar9, eecVar10, eecVar11, eecVar4, (i & 1024) != 0 ? fecVar.f : eecVar5, (i & 2048) != 0 ? fecVar.g : eecVar6, (i & 4096) != 0 ? fecVar.h : eecVar7, (i & 8192) != 0 ? fecVar.i : eecVar8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fec)) {
            return false;
        }
        fec fecVar = (fec) obj;
        fecVar.getClass();
        return this.a == fecVar.a && fni.a(this.b, fecVar.b) && fni.a(this.c, fecVar.c) && fni.a(this.d, fecVar.d) && fni.a(this.e, fecVar.e) && fni.a(this.f, fecVar.f) && fni.a(this.g, fecVar.g) && fni.a(this.h, fecVar.h) && fni.a(this.i, fecVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(Boolean.hashCode(false) * 31, 31, false), 31, false), 31, false), 31, false), 31, this.a)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileEditAdminPermissionsModel(isSuperAdmin=false, editSendDeleteMessagesEnabled=false, pinMessagesEnabled=false, changeChatInfoEnabled=false, changeMembersEnabled=false, editLinkEnabled=" + this.a + ", sendMessagePermState=" + this.b + ", editMessagePermState=" + this.c + ", deleteMessagePermState=" + this.d + ", pinMessagePermState=" + this.e + ", changeChatInfoPermState=" + this.f + ", controlMembersPermState=" + this.g + ", controlAdminsPermState=" + this.h + ", viewStats=" + this.i + ")";
    }
}
