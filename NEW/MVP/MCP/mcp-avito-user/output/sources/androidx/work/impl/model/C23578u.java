package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.room.O0;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: androidx.work.impl.model.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23578u implements InterfaceC23575q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55884a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<C23574p> f55885b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f55886c;

    /* renamed from: d, reason: collision with root package name */
    public final O0 f55887d;

    public C23578u(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55884a = workDatabase_Impl;
        this.f55885b = new r(workDatabase_Impl);
        this.f55886c = new C23576s(workDatabase_Impl);
        this.f55887d = new C23577t(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.InterfaceC23575q
    public final void a(C23574p c23574p) {
        WorkDatabase_Impl workDatabase_Impl = this.f55884a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55885b.e(c23574p);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.InterfaceC23575q
    public final ArrayList b() {
        F0 f0C = F0.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = this.f55884a;
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

    @Override // androidx.work.impl.model.InterfaceC23575q
    public final void c(int i12, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55884a;
        workDatabase_Impl.b();
        O0 o02 = this.f55886c;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        iVarA.g1(2, i12);
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

    @Override // androidx.work.impl.model.InterfaceC23575q
    public final C23574p e(int i12, String str) {
        F0 f0C = F0.c(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        f0C.h4(1, str);
        f0C.g1(2, i12);
        WorkDatabase_Impl workDatabase_Impl = this.f55884a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            return cursorP.moveToFirst() ? new C23574p(cursorP.getString(V1.b.b(cursorP, "work_spec_id")), cursorP.getInt(V1.b.b(cursorP, "generation")), cursorP.getInt(V1.b.b(cursorP, "system_id"))) : null;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.InterfaceC23575q
    public final void g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55884a;
        workDatabase_Impl.b();
        O0 o02 = this.f55887d;
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
}
