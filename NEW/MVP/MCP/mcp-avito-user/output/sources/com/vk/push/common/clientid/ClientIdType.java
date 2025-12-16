package com.vk.push.common.clientid;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClientIdType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/common/clientid/ClientIdType;", "", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientIdType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ClientIdType[] f366976b = {new ClientIdType("GAID", 0), new ClientIdType("OAID", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ClientIdType EF5;

    public ClientIdType() {
        throw null;
    }

    public static ClientIdType valueOf(String str) {
        return (ClientIdType) Enum.valueOf(ClientIdType.class, str);
    }

    public static ClientIdType[] values() {
        return (ClientIdType[]) f366976b.clone();
    }
}
