package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.F0;
import androidx.room.L;
import androidx.room.O0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.G;
import j.N;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
public final class z implements InterfaceC30891a {

    /* renamed from: a, reason: collision with root package name */
    public final InAppCallsDatabase_Impl f167844a;

    /* renamed from: b, reason: collision with root package name */
    public final L<C> f167845b;

    /* renamed from: c, reason: collision with root package name */
    public final L<A> f167846c;

    /* renamed from: d, reason: collision with root package name */
    public final O0 f167847d;

    /* renamed from: e, reason: collision with root package name */
    public final O0 f167848e;

    /* renamed from: f, reason: collision with root package name */
    public final O0 f167849f;

    /* renamed from: g, reason: collision with root package name */
    public final O0 f167850g;

    /* renamed from: h, reason: collision with root package name */
    public final O0 f167851h;

    /* renamed from: i, reason: collision with root package name */
    public final O0 f167852i;

    public z(@N InAppCallsDatabase_Impl inAppCallsDatabase_Impl) {
        this.f167844a = inAppCallsDatabase_Impl;
        this.f167845b = new l(inAppCallsDatabase_Impl);
        this.f167846c = new r(inAppCallsDatabase_Impl);
        this.f167847d = new s(inAppCallsDatabase_Impl);
        this.f167848e = new t(inAppCallsDatabase_Impl);
        this.f167849f = new u(inAppCallsDatabase_Impl);
        this.f167850g = new v(inAppCallsDatabase_Impl);
        this.f167851h = new w(inAppCallsDatabase_Impl);
        this.f167852i = new x(inAppCallsDatabase_Impl);
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d a(long j12) {
        F0 f0C = F0.c(1, "SELECT * FROM tb_calls WHERE log_session_id = ?");
        f0C.g1(1, j12);
        return androidx.room.rxjava3.g.b(new k(this, f0C));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final G b(long j12) {
        return new G(new f(this, j12));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d c() {
        return androidx.room.rxjava3.g.b(new q(this, F0.c(0, "SELECT * FROM tb_sessions JOIN tb_calls ON tb_sessions.id = tb_calls.log_session_id")));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d d() {
        return androidx.room.rxjava3.g.b(new i(this, F0.c(0, "SELECT * FROM tb_sessions")));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final G e(long j12) {
        return new G(new h(this, j12));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d f() {
        return androidx.room.rxjava3.g.b(new j(this, F0.c(0, "SELECT DISTINCT log_session_id FROM tb_calls")));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d g(long j12) {
        F0 f0C = F0.c(1, "SELECT * FROM tb_lines WHERE log_session_id = ?");
        f0C.g1(1, j12);
        return androidx.room.rxjava3.g.b(new o(this, f0C));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d h() {
        return androidx.room.rxjava3.g.b(new m(this, F0.c(0, "SELECT COUNT(*) FROM tb_lines")));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final io.reactivex.rxjava3.internal.operators.completable.r i(long j12, long j13, String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new g(this, j12, j13, str));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d j() {
        return androidx.room.rxjava3.g.b(new p(this, F0.c(0, "SELECT DISTINCT log_session_id FROM tb_lines")));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final io.reactivex.rxjava3.internal.operators.completable.r k(long j12, String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new d(j12, this, str));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final C42006d l(long j12, long j13, long j14) {
        F0 f0C = F0.c(3, "SELECT * FROM tb_lines WHERE log_session_id = ? AND created_at >= ? AND created_at <= ?");
        f0C.g1(1, j12);
        f0C.g1(2, j13);
        f0C.g1(3, j14);
        return androidx.room.rxjava3.g.b(new n(this, f0C));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final io.reactivex.rxjava3.internal.operators.completable.r m(long j12) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC30893c(this, j12));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final io.reactivex.rxjava3.internal.operators.completable.r n(long j12, String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new e(j12, this, str));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final io.reactivex.rxjava3.internal.operators.completable.r o(A a12) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC30892b(this, a12));
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a
    public final G p(C c12) {
        return new G(new y(this, c12));
    }
}
