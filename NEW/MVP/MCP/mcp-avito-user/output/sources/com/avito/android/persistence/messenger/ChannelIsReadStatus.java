package com.avito.android.persistence.messenger;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelEntity.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/persistence/messenger/ChannelIsReadStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "IS_NOT_READ", "IS_READ_LOCALLY", "IS_READ", "IS_NOT_READ_LOCALLY", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChannelIsReadStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ChannelIsReadStatus[] $VALUES;
    public static final ChannelIsReadStatus IS_NOT_READ = new ChannelIsReadStatus("IS_NOT_READ", 0);
    public static final ChannelIsReadStatus IS_READ_LOCALLY = new ChannelIsReadStatus("IS_READ_LOCALLY", 1);
    public static final ChannelIsReadStatus IS_READ = new ChannelIsReadStatus("IS_READ", 2);
    public static final ChannelIsReadStatus IS_NOT_READ_LOCALLY = new ChannelIsReadStatus("IS_NOT_READ_LOCALLY", 3);

    /* compiled from: ChannelEntity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/ChannelIsReadStatus$a;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f215155a = 0;

        static {
            new a();
        }
    }

    private static final /* synthetic */ ChannelIsReadStatus[] $values() {
        return new ChannelIsReadStatus[]{IS_NOT_READ, IS_READ_LOCALLY, IS_READ, IS_NOT_READ_LOCALLY};
    }

    static {
        ChannelIsReadStatus[] channelIsReadStatusArr$values = $values();
        $VALUES = channelIsReadStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(channelIsReadStatusArr$values);
    }

    private ChannelIsReadStatus(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<ChannelIsReadStatus> getEntries() {
        return $ENTRIES;
    }

    public static ChannelIsReadStatus valueOf(String str) {
        return (ChannelIsReadStatus) Enum.valueOf(ChannelIsReadStatus.class, str);
    }

    public static ChannelIsReadStatus[] values() {
        return (ChannelIsReadStatus[]) $VALUES.clone();
    }
}
