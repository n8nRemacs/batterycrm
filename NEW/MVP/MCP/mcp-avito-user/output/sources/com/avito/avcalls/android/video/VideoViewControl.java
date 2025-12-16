package com.avito.avcalls.android.video;

import kotlin.Metadata;

/* compiled from: VideoViewHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/video/VideoViewControl;", "", "ScalingType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VideoViewControl {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoViewHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/VideoViewControl$ScalingType;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScalingType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ScalingType[] f332475b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f332476c;

        static {
            ScalingType[] scalingTypeArr = {new ScalingType("SCALE_ASPECT_FIT", 0), new ScalingType("SCALE_ASPECT_FILL", 1), new ScalingType("SCALE_ASPECT_BALANCED", 2)};
            f332475b = scalingTypeArr;
            f332476c = kotlin.enums.c.a(scalingTypeArr);
        }

        public ScalingType() {
            throw null;
        }

        public static ScalingType valueOf(String str) {
            return (ScalingType) Enum.valueOf(ScalingType.class, str);
        }

        public static ScalingType[] values() {
            return (ScalingType[]) f332475b.clone();
        }
    }
}
