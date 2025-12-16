package com.avito.android.timestamp_storage.data.dao;

import androidx.room.O0;
import j.N;

/* compiled from: TimestampDao_Impl.java */
/* loaded from: classes4.dex */
class d extends O0 {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "DELETE FROM timestamps WHERE `key` = ? AND uid = ?";
    }
}
