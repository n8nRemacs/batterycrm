package com.yandex.div.core.player;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DivPlayerStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerStatus;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class DivPlayerStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DivPlayerStatus[] f367615b = {new DivPlayerStatus("IDLE", 0), new DivPlayerStatus("FATAL", 1), new DivPlayerStatus("PLAY", 2), new DivPlayerStatus("PAUSE", 3), new DivPlayerStatus("BUFFERING", 4), new DivPlayerStatus("END", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    DivPlayerStatus EF5;

    public DivPlayerStatus() {
        throw null;
    }

    public static DivPlayerStatus valueOf(String str) {
        return (DivPlayerStatus) Enum.valueOf(DivPlayerStatus.class, str);
    }

    public static DivPlayerStatus[] values() {
        return (DivPlayerStatus[]) f367615b.clone();
    }
}
