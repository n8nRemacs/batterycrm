package androidx.work.impl.model;

import androidx.room.O0;
import androidx.work.impl.WorkDatabase_Impl;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes10.dex */
public final class G implements C {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55789a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<B> f55790b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f55791c;

    /* renamed from: d, reason: collision with root package name */
    public final O0 f55792d;

    public G(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55789a = workDatabase_Impl;
        this.f55790b = new D(workDatabase_Impl);
        this.f55791c = new E(workDatabase_Impl);
        this.f55792d = new F(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.C
    public final void a() {
        WorkDatabase_Impl workDatabase_Impl = this.f55789a;
        workDatabase_Impl.b();
        O0 o02 = this.f55792d;
        Z1.i iVarA = o02.a();
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

    @Override // androidx.work.impl.model.C
    public final void b(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55789a;
        workDatabase_Impl.b();
        O0 o02 = this.f55791c;
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

    @Override // androidx.work.impl.model.C
    public final void c(B b12) {
        WorkDatabase_Impl workDatabase_Impl = this.f55789a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55790b.e(b12);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }
}
