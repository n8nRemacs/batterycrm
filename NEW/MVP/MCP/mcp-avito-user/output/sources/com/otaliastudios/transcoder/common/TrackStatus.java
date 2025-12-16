package com.otaliastudios.transcoder.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TrackStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final TrackStatus f365968b;

    /* renamed from: c, reason: collision with root package name */
    public static final TrackStatus f365969c;

    /* renamed from: d, reason: collision with root package name */
    public static final TrackStatus f365970d;

    /* renamed from: e, reason: collision with root package name */
    public static final TrackStatus f365971e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TrackStatus[] f365972f;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f365973a;

        static {
            int[] iArr = new int[TrackStatus.values().length];
            f365973a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f365973a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f365973a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f365973a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        TrackStatus trackStatus = new TrackStatus("ABSENT", 0);
        f365968b = trackStatus;
        TrackStatus trackStatus2 = new TrackStatus("REMOVING", 1);
        f365969c = trackStatus2;
        TrackStatus trackStatus3 = new TrackStatus("PASS_THROUGH", 2);
        f365970d = trackStatus3;
        TrackStatus trackStatus4 = new TrackStatus("COMPRESSING", 3);
        f365971e = trackStatus4;
        f365972f = new TrackStatus[]{trackStatus, trackStatus2, trackStatus3, trackStatus4};
    }

    public TrackStatus() {
        throw null;
    }

    public static TrackStatus valueOf(String str) {
        return (TrackStatus) Enum.valueOf(TrackStatus.class, str);
    }

    public static TrackStatus[] values() {
        return (TrackStatus[]) f365972f.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return true;
        }
        throw new RuntimeException("Unexpected track status: " + this);
    }
}
