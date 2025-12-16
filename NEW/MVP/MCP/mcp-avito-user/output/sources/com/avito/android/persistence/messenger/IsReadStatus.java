package com.avito.android.persistence.messenger;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageEntity.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/persistence/messenger/IsReadStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "IS_NOT_READ", "IS_READ_LOCALLY", "IS_READ", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IsReadStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ IsReadStatus[] $VALUES;
    public static final IsReadStatus IS_NOT_READ = new IsReadStatus("IS_NOT_READ", 0);
    public static final IsReadStatus IS_READ_LOCALLY = new IsReadStatus("IS_READ_LOCALLY", 1);
    public static final IsReadStatus IS_READ = new IsReadStatus("IS_READ", 2);

    /* compiled from: MessageEntity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/IsReadStatus$a;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f215179a = 0;

        static {
            new a();
        }
    }

    private static final /* synthetic */ IsReadStatus[] $values() {
        return new IsReadStatus[]{IS_NOT_READ, IS_READ_LOCALLY, IS_READ};
    }

    static {
        IsReadStatus[] isReadStatusArr$values = $values();
        $VALUES = isReadStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(isReadStatusArr$values);
    }

    private IsReadStatus(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<IsReadStatus> getEntries() {
        return $ENTRIES;
    }

    public static IsReadStatus valueOf(String str) {
        return (IsReadStatus) Enum.valueOf(IsReadStatus.class, str);
    }

    public static IsReadStatus[] values() {
        return (IsReadStatus[]) $VALUES.clone();
    }
}
