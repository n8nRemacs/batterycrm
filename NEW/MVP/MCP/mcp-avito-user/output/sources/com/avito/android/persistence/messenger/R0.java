package com.avito.android.persistence.messenger;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: MessageMetaInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/R0;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f215305a = 0;

    static {
        new R0();
    }

    @X41.n
    @androidx.room.T0
    @Y61.k
    public static final List<FileChunkMetaInfo> a(@Y61.k String str) {
        return C42756l.g0((Object[]) new com.google.gson.d().a().d(FileChunkMetaInfo[].class, str));
    }
}
