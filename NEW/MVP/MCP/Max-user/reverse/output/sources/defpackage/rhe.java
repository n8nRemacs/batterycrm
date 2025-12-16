package defpackage;

import android.database.Cursor;
import java.lang.ref.WeakReference;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class rhe extends hge implements tsb {
    public static WeakReference Y = new WeakReference(null);
    public final String X;
    public final long b;
    public final long c;
    public int d;
    public final rs4 o;

    public rhe(long j, long j2, int i, rs4 rs4Var) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.o = rs4Var;
        String strName = rs4Var.name();
        StringBuilder sbL = az1.l(j, "TaskSyncChatHistory(#", ",");
        hf3.e(j2, ",", strName, sbL);
        sbL.append(")");
        this.X = sbL.toString();
    }

    @Override // defpackage.tsb
    public final int c() {
        String str = this.X;
        wqi.c(str, "onPreExecute", new Object[0]);
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        if (!((lr3) igeVar.D.getValue()).e()) {
            return 2;
        }
        d3g d3gVarB = ((ie4) p().a.get()).f.b();
        d3gVarB.getClass();
        dsd dsdVarC = dsd.c(2, "SELECT COUNT(*) FROM tasks WHERE type = ? AND status = ?");
        dsdVarC.k(1, 12);
        dsdVarC.k(2, 10);
        lrd lrdVar = d3gVarB.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int i = cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
            cursorN.close();
            dsdVarC.y();
            if (i <= 0) {
                return 1;
            }
            wqi.c(str, "hasProcessingTask, skip", new Object[0]);
            return 2;
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rhe.class.equals(obj.getClass())) {
            rhe rheVar = (rhe) obj;
            if (this.c == rheVar.c && this.o == rheVar.o) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tsb
    public final void f() {
        wqi.c(this.X, "removeTask", new Object[0]);
        p().d(this.b);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.SyncChatHistory syncChatHistory = new Tasks.SyncChatHistory();
        syncChatHistory.taskId = this.b;
        syncChatHistory.chatId = this.c;
        syncChatHistory.count = this.d;
        syncChatHistory.itemTypeId = this.o.a;
        wqi.c(this.X, "toByteArray", new Object[0]);
        return fl9.toByteArray(syncChatHistory);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.w0;
    }

    public final int hashCode() {
        int iHashCode = rhe.class.getName().hashCode() * 31;
        long j = this.c;
        return this.o.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return this.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0308  */
    @Override // defpackage.hge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhe.u():void");
    }

    public final void v() {
        String str = this.X;
        wqi.c(str, "finishTask", new Object[0]);
        wqi.c(str, "removeTask", new Object[0]);
        p().d(this.b);
        she.v(s());
    }
}
