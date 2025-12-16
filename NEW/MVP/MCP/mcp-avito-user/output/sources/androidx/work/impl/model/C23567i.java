package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.work.impl.WorkDatabase_Impl;

/* compiled from: PreferenceDao_Impl.java */
/* renamed from: androidx.work.impl.model.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23567i implements InterfaceC23564f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55871a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<C23563e> f55872b;

    public C23567i(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55871a = workDatabase_Impl;
        this.f55872b = new C23565g(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.InterfaceC23564f
    public final void a(C23563e c23563e) {
        WorkDatabase_Impl workDatabase_Impl = this.f55871a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55872b.e(c23563e);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.InterfaceC23564f
    public final Long b(String str) {
        F0 f0C = F0.c(1, "SELECT long_value FROM Preference where `key`=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55871a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            Long lValueOf = null;
            if (cursorP.moveToFirst() && !cursorP.isNull(0)) {
                lValueOf = Long.valueOf(cursorP.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }
}
