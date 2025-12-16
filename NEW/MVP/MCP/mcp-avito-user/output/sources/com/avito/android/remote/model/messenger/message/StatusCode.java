package com.avito.android.remote.model.messenger.message;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatusCode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/StatusCode;", "", "(Ljava/lang/String;I)V", "SENT", "SENDING", "ERROR", "READ", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StatusCode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StatusCode[] $VALUES;
    public static final StatusCode SENT = new StatusCode("SENT", 0);
    public static final StatusCode SENDING = new StatusCode("SENDING", 1);
    public static final StatusCode ERROR = new StatusCode("ERROR", 2);
    public static final StatusCode READ = new StatusCode("READ", 3);

    private static final /* synthetic */ StatusCode[] $values() {
        return new StatusCode[]{SENT, SENDING, ERROR, READ};
    }

    static {
        StatusCode[] statusCodeArr$values = $values();
        $VALUES = statusCodeArr$values;
        $ENTRIES = c.a(statusCodeArr$values);
    }

    private StatusCode(String str, int i12) {
    }

    @k
    public static a<StatusCode> getEntries() {
        return $ENTRIES;
    }

    public static StatusCode valueOf(String str) {
        return (StatusCode) Enum.valueOf(StatusCode.class, str);
    }

    public static StatusCode[] values() {
        return (StatusCode[]) $VALUES.clone();
    }
}
