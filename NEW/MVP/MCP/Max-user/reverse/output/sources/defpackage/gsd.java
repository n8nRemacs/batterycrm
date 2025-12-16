package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;

/* loaded from: classes2.dex */
public final class gsd {
    public final q9b a;
    public final yi5 b;
    public final bwf c = new bwf(new prd(4, this));

    public gsd(q9b q9bVar, yi5 yi5Var) {
        this.a = q9bVar;
        this.b = yi5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:241:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tsb d(defpackage.usb r20, byte[] r21) throws ru.ok.tamtam.nano.ProtoException {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsd.d(usb, byte[]):tsb");
    }

    public final void a(long j) {
        d3g d3gVarB = b();
        lrd lrdVar = d3gVarB.a;
        lrdVar.b();
        crd crdVar = d3gVarB.g;
        vk6 vk6VarA = crdVar.a();
        vk6VarA.k(1, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            crdVar.r(vk6VarA);
        }
    }

    public final d3g b() {
        return (d3g) this.c.getValue();
    }

    public final List c(ArrayList arrayList) {
        return lee.o(lee.h(new nhg(new at(2, arrayList), new ts9(1, this, gsd.class, "taskDbFromEntity", "taskDbFromEntity(Lone/me/sdk/tasks/db/TaskEntity;)Lone/me/sdk/tasks/db/TaskDb;", 0, 12)), zx0.E0));
    }

    public final r2g e(long j) {
        s2g s2gVar;
        d3g d3gVarB = b();
        slf slfVar = d3gVarB.c;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM tasks WHERE id = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = d3gVarB.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "type");
            int iC3 = s7j.c(cursorN, "status");
            int iC4 = s7j.c(cursorN, "fails_count");
            int iC5 = s7j.c(cursorN, "depends_request_id");
            int iC6 = s7j.c(cursorN, "dependency_type");
            int iC7 = s7j.c(cursorN, "data");
            int iC8 = s7j.c(cursorN, "created_time");
            if (cursorN.moveToFirst()) {
                s2gVar = new s2g(cursorN.getLong(iC), slf.e(cursorN.getInt(iC2)), slf.c(cursorN.getInt(iC3)), cursorN.getInt(iC4), cursorN.getLong(iC5), cursorN.getInt(iC6), cursorN.isNull(iC7) ? null : cursorN.getBlob(iC7), cursorN.getLong(iC8));
            } else {
                s2gVar = null;
            }
            if (s2gVar != null) {
                return f(s2gVar);
            }
            return null;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final r2g f(s2g s2gVar) throws ProtoException {
        tsb tsbVarD = d(s2gVar.b, s2gVar.g);
        if (tsbVarD != null) {
            return new r2g(s2gVar.a, s2gVar.c, s2gVar.d, s2gVar.e, s2gVar.f, tsbVarD);
        }
        ((y3b) this.b).a(new IllegalStateException("task parse error! " + s2gVar.b));
        a(s2gVar.a);
        return null;
    }
}
