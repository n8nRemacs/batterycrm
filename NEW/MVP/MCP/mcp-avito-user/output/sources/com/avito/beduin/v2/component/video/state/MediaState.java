package com.avito.beduin.v2.component.video.state;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/MediaState;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaState {

    /* renamed from: c, reason: collision with root package name */
    public static final MediaState f336342c;

    /* renamed from: d, reason: collision with root package name */
    public static final MediaState f336343d;

    /* renamed from: e, reason: collision with root package name */
    public static final MediaState f336344e;

    /* renamed from: f, reason: collision with root package name */
    public static final MediaState f336345f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ MediaState[] f336346g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f336347h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336348b;

    static {
        MediaState mediaState = new MediaState("Idle", 0, "Idle");
        f336342c = mediaState;
        MediaState mediaState2 = new MediaState("Ready", 1, "Ready");
        f336343d = mediaState2;
        MediaState mediaState3 = new MediaState("Buffering", 2, "Buffering");
        f336344e = mediaState3;
        MediaState mediaState4 = new MediaState("Ended", 3, "Ended");
        f336345f = mediaState4;
        MediaState[] mediaStateArr = {mediaState, mediaState2, mediaState3, mediaState4};
        f336346g = mediaStateArr;
        f336347h = kotlin.enums.c.a(mediaStateArr);
    }

    public MediaState(String str, int i12, String str2) {
        this.f336348b = str2;
    }

    public static MediaState valueOf(String str) {
        return (MediaState) Enum.valueOf(MediaState.class, str);
    }

    public static MediaState[] values() {
        return (MediaState[]) f336346g.clone();
    }
}
