package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.room.O0;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes10.dex */
public final class t0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55881a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<p0> f55882b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f55883c;

    public t0(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55881a = workDatabase_Impl;
        this.f55882b = new r0(workDatabase_Impl);
        this.f55883c = new s0(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.q0
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55881a;
        workDatabase_Impl.b();
        O0 o02 = this.f55883c;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.q0
    public final ArrayList b(String str) {
        F0 f0C = F0.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55881a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.q0
    public final void d(p0 p0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.f55881a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55882b.e(p0Var);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }
}
