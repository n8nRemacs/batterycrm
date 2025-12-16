package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes10.dex */
public final class A implements InterfaceC23582y {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55785a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<C23581x> f55786b;

    public A(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55785a = workDatabase_Impl;
        this.f55786b = new C23583z(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.InterfaceC23582y
    public final ArrayList a(String str) {
        F0 f0C = F0.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55785a;
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

    @Override // androidx.work.impl.model.InterfaceC23582y
    public final void b(C23581x c23581x) {
        WorkDatabase_Impl workDatabase_Impl = this.f55785a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55786b.e(c23581x);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }
}
