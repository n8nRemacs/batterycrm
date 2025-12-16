package com.avito.android.analytics.event.native_video;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoStopReason.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/native_video/VideoStopReason;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VideoStopReason {

    /* renamed from: b, reason: collision with root package name */
    public static final VideoStopReason f90111b;

    /* renamed from: c, reason: collision with root package name */
    public static final VideoStopReason f90112c;

    /* renamed from: d, reason: collision with root package name */
    public static final VideoStopReason f90113d;

    /* renamed from: e, reason: collision with root package name */
    public static final VideoStopReason f90114e;

    /* renamed from: f, reason: collision with root package name */
    public static final VideoStopReason f90115f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ VideoStopReason[] f90116g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f90117h;

    static {
        VideoStopReason videoStopReason = new VideoStopReason("COMPLETED", 0);
        f90111b = videoStopReason;
        VideoStopReason videoStopReason2 = new VideoStopReason("CLOSED", 1);
        f90112c = videoStopReason2;
        VideoStopReason videoStopReason3 = new VideoStopReason("SKIPPED", 2);
        f90113d = videoStopReason3;
        VideoStopReason videoStopReason4 = new VideoStopReason("PAUSED", 3);
        f90114e = videoStopReason4;
        VideoStopReason videoStopReason5 = new VideoStopReason("REWINDED", 4);
        f90115f = videoStopReason5;
        VideoStopReason[] videoStopReasonArr = {videoStopReason, videoStopReason2, videoStopReason3, videoStopReason4, videoStopReason5};
        f90116g = videoStopReasonArr;
        f90117h = c.a(videoStopReasonArr);
    }

    public VideoStopReason() {
        throw null;
    }

    public static VideoStopReason valueOf(String str) {
        return (VideoStopReason) Enum.valueOf(VideoStopReason.class, str);
    }

    public static VideoStopReason[] values() {
        return (VideoStopReason[]) f90116g.clone();
    }
}
