package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.L;
import j.N;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class r extends L<A> {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "INSERT OR IGNORE INTO `tb_calls` (`log_session_id`,`call_index_in_session`,`call_id`,`scenario`,`started_at`,`finished_at`,`lines_limit_reached`,`header`) VALUES (?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@N Z1.i iVar, @N A a12) {
        A a13 = a12;
        iVar.g1(1, a13.f167790a);
        iVar.g1(2, a13.f167791b);
        iVar.h4(3, a13.f167792c);
        iVar.h4(4, a13.f167793d);
        iVar.g1(5, a13.f167794e);
        iVar.g1(6, a13.f167795f);
        iVar.g1(7, a13.f167796g ? 1L : 0L);
        iVar.h4(8, a13.f167797h);
    }
}
