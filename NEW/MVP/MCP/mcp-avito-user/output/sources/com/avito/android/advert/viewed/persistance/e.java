package com.avito.android.advert.viewed.persistance;

import androidx.room.O0;
import j.N;

/* compiled from: ViewedAdvertsDao_Impl.java */
/* loaded from: classes10.dex */
class e extends O0 {
    @Override // androidx.room.O0
    @N
    public final String b() {
        return "DELETE FROM viewed_adverts WHERE advert_string_id IN (SELECT advert_string_id FROM viewed_adverts ORDER BY add_time ASC LIMIT ?) ";
    }
}
