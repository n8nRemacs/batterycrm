package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: DependencyDao_Impl.java */
/* renamed from: androidx.work.impl.model.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23562d implements InterfaceC23560b {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55850a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<C23559a> f55851b;

    public C23562d(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55850a = workDatabase_Impl;
        this.f55851b = new C23561c(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.InterfaceC23560b
    public final void a(C23559a c23559a) {
        WorkDatabase_Impl workDatabase_Impl = this.f55850a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55851b.e(c23559a);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.InterfaceC23560b
    public final ArrayList b(String str) {
        F0 f0C = F0.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55850a;
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

    @Override // androidx.work.impl.model.InterfaceC23560b
    public final boolean c(String str) {
        F0 f0C = F0.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55850a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            boolean z12 = false;
            if (cursorP.moveToFirst()) {
                z12 = cursorP.getInt(0) != 0;
            }
            return z12;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.InterfaceC23560b
    public final boolean d(String str) {
        F0 f0C = F0.c(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55850a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            boolean z12 = false;
            if (cursorP.moveToFirst()) {
                z12 = cursorP.getInt(0) != 0;
            }
            return z12;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }
}
