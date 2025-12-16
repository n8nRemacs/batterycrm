package com.avito.android.persistence.messenger;

/* compiled from: ChannelDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33046b extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            DELETE FROM channel_tag\n            WHERE\n                local_user_id = ?\n                AND local_user_type = ?\n                AND channel_id = ?\n        ";
    }
}
