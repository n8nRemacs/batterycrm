package com.vk.push.core.network.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/core/network/model/ErrorStatus;", "", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ErrorStatus[] f367122b = {new ErrorStatus("UNSPECIFIED_ERROR", 0), new ErrorStatus("INVALID_ARGUMENT", 1), new ErrorStatus("UNREGISTERED", 2), new ErrorStatus("SENDER_ID_MISMATCH", 3), new ErrorStatus("QUOTA_EXCEEDED", 4), new ErrorStatus("UNAVAILABLE", 5), new ErrorStatus("INTERNAL", 6), new ErrorStatus("THIRD_PARTY_AUTH_ERROR", 7), new ErrorStatus("PERMISSION_DENIED", 8), new ErrorStatus("NOT_FOUND", 9)};

    /* JADX INFO: Fake field, exist only in values array */
    ErrorStatus EF5;

    public ErrorStatus() {
        throw null;
    }

    public static ErrorStatus valueOf(String str) {
        return (ErrorStatus) Enum.valueOf(ErrorStatus.class, str);
    }

    public static ErrorStatus[] values() {
        return (ErrorStatus[]) f367122b.clone();
    }
}
