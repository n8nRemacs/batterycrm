package com.avito.android.advert.viewed.persistance;

import androidx.room.L;
import j.N;

/* compiled from: ViewedAdvertsDao_Impl.java */
/* loaded from: classes10.dex */
class d extends L<a> {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "INSERT OR REPLACE INTO `viewed_adverts` (`advert_string_id`,`add_time`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@N Z1.i iVar, @N a aVar) {
        a aVar2 = aVar;
        iVar.h4(1, aVar2.f81034a);
        iVar.g1(2, aVar2.f81035b);
    }
}
