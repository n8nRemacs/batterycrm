package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class z03 extends sm implements j1g, tsb {
    public final long X;
    public final long d;
    public final int o;

    public z03(int i, long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = i;
        this.X = j3;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        d13 d13Var = (d13) l0gVar;
        lg8 lg8Var = lg8.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "ChatsListApiTask", "onSuccess " + d13Var, null);
        }
        try {
            o().n(d13Var.c);
        } catch (TamErrorException unused) {
        }
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "ChatsListApiTask", "chats.storeChatsFromServer", null);
        }
        l().n0(d13Var.c, null, 0);
        tm tmVar = this.c;
        w4e w4eVar = (w4e) ((pb3) (tmVar != null ? tmVar : null).f.getValue());
        w4eVar.S.O(w4eVar, w4e.m0[36], Long.valueOf(d13Var.d));
        if (d13Var.d > 0) {
            hwa hwaVarJ = j();
            long j = d13Var.d;
            long j2 = this.X;
            l5c l5cVar = p().b;
            l5cVar.getClass();
            hwaVarJ.u().c(new z03((int) l5cVar.m(PmsKey.f33chatspagesize, 50), hwaVarJ.t().a.k(), j, j2), false, 0L, (12 & 8) != 0 ? 0 : 1);
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if ("client.task.ignored".equals(pzfVar.b)) {
            f();
        }
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatsList chatsList = new Tasks.ChatsList();
        chatsList.requestId = this.a;
        chatsList.marker = this.d;
        chatsList.count = this.o;
        chatsList.chatsSync = this.X;
        return fl9.toByteArray(chatsList);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.Z;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 14);
        fh2Var.t(this.d, "marker");
        fh2Var.j(this.o, "count");
        return fh2Var;
    }

    @Override // defpackage.sm
    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ChatsListApiTask(id = ", ", marker=");
        utb.n(sbL, this.d, ", count=", this.o);
        return u45.i(this.X, ", chatsSync=", ")", sbL);
    }
}
