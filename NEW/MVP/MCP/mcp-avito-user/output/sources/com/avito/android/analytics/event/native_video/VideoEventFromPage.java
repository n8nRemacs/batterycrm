package com.avito.android.analytics.event.native_video;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoEventFromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/native_video/VideoEventFromPage;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VideoEventFromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final VideoEventFromPage f90106b;

    /* renamed from: c, reason: collision with root package name */
    public static final VideoEventFromPage f90107c;

    /* renamed from: d, reason: collision with root package name */
    public static final VideoEventFromPage f90108d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ VideoEventFromPage[] f90109e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f90110f;

    static {
        VideoEventFromPage videoEventFromPage = new VideoEventFromPage("GALLERY_FULLSCREEN", 0);
        f90106b = videoEventFromPage;
        VideoEventFromPage videoEventFromPage2 = new VideoEventFromPage("SNIPPET", 1);
        f90107c = videoEventFromPage2;
        VideoEventFromPage videoEventFromPage3 = new VideoEventFromPage("GALLERY_ITEM", 2);
        f90108d = videoEventFromPage3;
        VideoEventFromPage[] videoEventFromPageArr = {videoEventFromPage, videoEventFromPage2, videoEventFromPage3};
        f90109e = videoEventFromPageArr;
        f90110f = c.a(videoEventFromPageArr);
    }

    public VideoEventFromPage() {
        throw null;
    }

    public static VideoEventFromPage valueOf(String str) {
        return (VideoEventFromPage) Enum.valueOf(VideoEventFromPage.class, str);
    }

    public static VideoEventFromPage[] values() {
        return (VideoEventFromPage[]) f90109e.clone();
    }
}
