package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.L;
import j.N;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class l extends L<C> {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "INSERT OR REPLACE INTO `tb_sessions` (`id`,`created_at`,`calls_history`) VALUES (nullif(?, 0),?,?)";
    }

    @Override // androidx.room.L
    public final void d(@N Z1.i iVar, @N C c12) {
        C c13 = c12;
        iVar.g1(1, c13.f167802a);
        iVar.g1(2, c13.f167803b);
        iVar.h4(3, c13.f167804c);
    }
}
