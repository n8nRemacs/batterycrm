package com.otaliastudios.transcoder.common;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrackType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/common/TrackType;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackType {

    /* renamed from: b, reason: collision with root package name */
    public static final TrackType f365974b;

    /* renamed from: c, reason: collision with root package name */
    public static final TrackType f365975c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TrackType[] f365976d;

    static {
        TrackType trackType = new TrackType("AUDIO", 0);
        f365974b = trackType;
        TrackType trackType2 = new TrackType("VIDEO", 1);
        f365975c = trackType2;
        f365976d = new TrackType[]{trackType, trackType2};
    }

    public TrackType() {
        throw null;
    }

    public static TrackType valueOf(String str) {
        return (TrackType) Enum.valueOf(TrackType.class, str);
    }

    public static TrackType[] values() {
        return (TrackType[]) f365976d.clone();
    }
}
