package com.avito.android.video_requirements.depplink;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRequirementsQueryParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_requirements/depplink/VideoRequirementsQueryParameters;", "", "_avito_video-requirements_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoRequirementsQueryParameters {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VideoRequirementsQueryParameters[] f326007b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f326008c;

    static {
        VideoRequirementsQueryParameters[] videoRequirementsQueryParametersArr = {new VideoRequirementsQueryParameters("CATEGORY_ID", 0), new VideoRequirementsQueryParameters("MIN_DURATION", 1), new VideoRequirementsQueryParameters("MAX_DURATION", 2), new VideoRequirementsQueryParameters("MAX_FILE_SIZE", 3)};
        f326007b = videoRequirementsQueryParametersArr;
        f326008c = c.a(videoRequirementsQueryParametersArr);
    }

    public static VideoRequirementsQueryParameters valueOf(String str) {
        return (VideoRequirementsQueryParameters) Enum.valueOf(VideoRequirementsQueryParameters.class, str);
    }

    public static VideoRequirementsQueryParameters[] values() {
        return (VideoRequirementsQueryParameters[]) f326007b.clone();
    }
}
