package com.avito.android.iac_dialer_watcher.impl_module.db;

import androidx.room.O0;
import j.N;

/* compiled from: IacLogDao_Impl.java */
/* loaded from: classes14.dex */
class s extends O0 {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "DELETE FROM tb_sessions WHERE id = ?";
    }
}
