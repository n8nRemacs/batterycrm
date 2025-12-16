package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class dtg extends sm implements j1g, tsb {
    public static final /* synthetic */ int Z = 0;
    public final long X;
    public final boolean Y;
    public final long d;
    public final long o;

    public dtg(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = z;
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        long j;
        long j2;
        Object next;
        List listH = r().h(this.a, usb.Z0);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add((dtg) ((r2g) it.next()).f);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            j = this.o;
            j2 = this.d;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it2.next();
            dtg dtgVar = (dtg) next;
            if (dtgVar.d == j2 && dtgVar.o == j) {
                break;
            }
        }
        if (((dtg) next) != null) {
            wqi.c("dtg", "onPreExecute: found later task, REMOVE", new Object[0]);
            return 3;
        }
        si9 si9VarM = n().m(j);
        pb2 pb2VarM = l().M(j2);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || pb2VarM == null || !(pb2VarM.F() || pb2VarM.V())) {
            wqi.c("dtg", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        }
        if (si9VarM.b == 0) {
            wqi.c("dtg", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        }
        if (pb2VarM.b.a != 0 || l().Y(pb2VarM)) {
            return 1;
        }
        wqi.c("dtg", "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
        return 2;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        wqi.c("dtg", "onSuccess: " + ((v4a) l0gVar), new Object[0]);
        si9 si9VarM = n().m(this.o);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            return;
        }
        n().t(si9VarM, xi9.o);
        k().c(new itg(this.d, this.o, false));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) throws Throwable {
        wqi.c("dtg", "onFail", pzfVar);
        si9 si9VarM = n().m(this.o);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || qaj.c(pzfVar.b)) {
            return;
        }
        f();
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() throws Throwable {
        r().d(this.a);
        si9 si9VarM = n().m(this.o);
        if (si9VarM != null) {
            n().t(si9VarM, xi9.Y);
            k().c(new itg(this.d, this.o, false));
        }
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = new Tasks.UpdateFireTimeProtoTask();
        updateFireTimeProtoTask.requestId = this.a;
        updateFireTimeProtoTask.chatId = this.d;
        updateFireTimeProtoTask.messageId = this.o;
        updateFireTimeProtoTask.fireTime = this.X;
        updateFireTimeProtoTask.notifySender = this.Y;
        return fl9.toByteArray(updateFireTimeProtoTask);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.Z0;
    }

    @Override // defpackage.sm
    public final n2 i() throws Throwable {
        pb2 pb2VarM;
        si9 si9VarM = n().m(this.o);
        if (si9VarM == null || (pb2VarM = l().M(this.d)) == null) {
            return null;
        }
        long j = pb2VarM.b.a;
        long j2 = si9VarM.b;
        String str = si9VarM.Y;
        sz szVarD = po8.d(si9VarM.x0);
        if (szVarD == null) {
            szVarD = new sz();
        }
        sz szVar = szVarD;
        List list = si9VarM.N0;
        return new zf8(j, j2, str, szVar, list != null ? po8.t(list) : null, new ss4(this.X, this.Y));
    }
}
