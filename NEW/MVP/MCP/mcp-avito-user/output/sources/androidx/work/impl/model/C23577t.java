package androidx.work.impl.model;

import androidx.room.O0;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: androidx.work.impl.model.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23577t extends O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
