package com.avito.android.persistence.messenger;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.h0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33071h0 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            update channel_meta_data\n            set\n                deleted_locally_timestamp = ?\n            where\n                local_user_id = ?\n                and local_user_type = ?\n                and channel_id = ?\n        ";
    }
}
