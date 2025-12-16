package com.avito.android.rating_persistence.sort;

import androidx.room.L;
import j.N;

/* compiled from: RatingSortDao_Impl.java */
/* loaded from: classes16.dex */
class b extends L<d> {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "INSERT OR IGNORE INTO `rating_sort` (`sort_key`) VALUES (?)";
    }

    @Override // androidx.room.L
    public final void d(@N Z1.i iVar, @N d dVar) {
        iVar.h4(1, dVar.f249844a);
    }
}
