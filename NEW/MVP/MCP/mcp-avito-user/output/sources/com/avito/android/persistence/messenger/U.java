package com.avito.android.persistence.messenger;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class U extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE channel\n                SET json_context_actions = NULL\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND channel_id = ?\n        ";
    }
}
