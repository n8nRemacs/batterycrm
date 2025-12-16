package com.avito.android.timestamp_storage.data.dao;

import Z1.i;
import androidx.room.L;
import j.N;
import wE0.C49499b;
import xE0.C49826a;

/* compiled from: TimestampDao_Impl.java */
/* loaded from: classes4.dex */
class b extends L<C49826a> {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "INSERT OR IGNORE INTO `timestamps` (`key`,`uid`,`timestamp`,`inners`) VALUES (?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@N i iVar, @N C49826a c49826a) {
        C49826a c49826a2 = c49826a;
        iVar.h4(1, c49826a2.f442305a);
        iVar.h4(2, c49826a2.f442306b);
        iVar.g1(3, c49826a2.f442307c);
        int i12 = C49499b.f441336a;
        iVar.h4(4, new com.google.gson.d().a().l(c49826a2.f442308d));
    }
}
