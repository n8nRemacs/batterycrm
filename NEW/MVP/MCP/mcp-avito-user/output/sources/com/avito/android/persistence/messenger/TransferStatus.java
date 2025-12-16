package com.avito.android.persistence.messenger;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageMetaInfo.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/persistence/messenger/TransferStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "NONE", "IN_PROGRESS", "ERROR", "SUCCESS", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransferStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ TransferStatus[] $VALUES;
    public static final TransferStatus NONE = new TransferStatus("NONE", 0);
    public static final TransferStatus IN_PROGRESS = new TransferStatus("IN_PROGRESS", 1);
    public static final TransferStatus ERROR = new TransferStatus("ERROR", 2);
    public static final TransferStatus SUCCESS = new TransferStatus("SUCCESS", 3);

    /* compiled from: MessageMetaInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/TransferStatus$a;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f215308a = 0;

        static {
            new a();
        }
    }

    private static final /* synthetic */ TransferStatus[] $values() {
        return new TransferStatus[]{NONE, IN_PROGRESS, ERROR, SUCCESS};
    }

    static {
        TransferStatus[] transferStatusArr$values = $values();
        $VALUES = transferStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(transferStatusArr$values);
    }

    private TransferStatus(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<TransferStatus> getEntries() {
        return $ENTRIES;
    }

    public static TransferStatus valueOf(String str) {
        return (TransferStatus) Enum.valueOf(TransferStatus.class, str);
    }

    public static TransferStatus[] values() {
        return (TransferStatus[]) $VALUES.clone();
    }
}
