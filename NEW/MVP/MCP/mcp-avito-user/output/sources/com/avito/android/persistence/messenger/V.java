package com.avito.android.persistence.messenger;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class V extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            DELETE FROM channel \n            WHERE \n                user_id = ? \n                AND user_type = ? \n                AND channel_id = ?\n            ";
    }
}
