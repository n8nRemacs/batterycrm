package defpackage;

/* loaded from: classes2.dex */
public final class it2 extends xfh {
    public final k18 b;
    public final k18 c;
    public final tcf d;
    public final hbd o;

    public it2() {
        ooa ooaVar = ooa.a;
        bwf bwfVarD = ooaVar.getAccessor().d(61);
        this.b = ooaVar.getAccessor().d(79);
        this.c = bwfVarD;
        tcf tcfVarA = ucf.a(hd5.a);
        this.d = tcfVarA;
        this.o = new hbd(tcfVarA);
        tcfVarA.setValue(t());
    }

    public final o98 t() {
        o98 o98VarD = ve3.d();
        boolean z = u().k() != 1;
        boolean z2 = u().k() == 0;
        boolean z3 = u().k() == 2;
        o98VarD.add(new toe(z7b.a, 0, new n5g(b8b.b), null, null, null, new doe(z, true), null, null, 440));
        if (z) {
            o98VarD.add(new toe(z7b.f, 1, new n5g(b8b.f), null, null, null, new coe(z2, true), null, null, 440));
            o98VarD.add(new toe(z7b.g, 1, new n5g(b8b.g), null, null, null, new coe(z3, true), null, null, 440));
        }
        return ve3.a(o98VarD);
    }

    public final sxg u() {
        return (sxg) this.c.getValue();
    }

    public final void v(long j) {
        if (j == z7b.a) {
            w(u().k() == 1 ? u().g.getInt("app.notification.chats.show.last", 0) : 1);
        } else if (j == z7b.f) {
            w(0);
        } else if (j == z7b.g) {
            w(2);
        }
    }

    public final void w(int i) {
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        u().r(i);
        hwa hwaVar = (hwa) this.b.getValue();
        oxg oxgVar = new oxg();
        oxgVar.d = str;
        hwaVar.o(new qxg(oxgVar));
        this.d.setValue(t());
    }
}
