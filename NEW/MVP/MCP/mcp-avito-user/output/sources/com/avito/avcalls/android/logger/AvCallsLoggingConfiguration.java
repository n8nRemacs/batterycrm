package com.avito.avcalls.android.logger;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: AvCallsLoggingConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/logger/AvCallsLoggingConfiguration;", "", "RtcSeverity", "SdkSeverity", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvCallsLoggingConfiguration {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvCallsLoggingConfiguration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/logger/AvCallsLoggingConfiguration$RtcSeverity;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RtcSeverity {

        /* renamed from: b, reason: collision with root package name */
        public static final RtcSeverity f331722b;

        /* renamed from: c, reason: collision with root package name */
        public static final RtcSeverity f331723c;

        /* renamed from: d, reason: collision with root package name */
        public static final RtcSeverity f331724d;

        /* renamed from: e, reason: collision with root package name */
        public static final RtcSeverity f331725e;

        /* renamed from: f, reason: collision with root package name */
        public static final RtcSeverity f331726f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ RtcSeverity[] f331727g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331728h;

        static {
            RtcSeverity rtcSeverity = new RtcSeverity("VERBOSE", 0);
            f331722b = rtcSeverity;
            RtcSeverity rtcSeverity2 = new RtcSeverity("INFO", 1);
            f331723c = rtcSeverity2;
            RtcSeverity rtcSeverity3 = new RtcSeverity("WARNING", 2);
            f331724d = rtcSeverity3;
            RtcSeverity rtcSeverity4 = new RtcSeverity("ERROR", 3);
            f331725e = rtcSeverity4;
            RtcSeverity rtcSeverity5 = new RtcSeverity("NONE", 4);
            f331726f = rtcSeverity5;
            RtcSeverity[] rtcSeverityArr = {rtcSeverity, rtcSeverity2, rtcSeverity3, rtcSeverity4, rtcSeverity5};
            f331727g = rtcSeverityArr;
            f331728h = kotlin.enums.c.a(rtcSeverityArr);
        }

        public RtcSeverity() {
            throw null;
        }

        public static RtcSeverity valueOf(String str) {
            return (RtcSeverity) Enum.valueOf(RtcSeverity.class, str);
        }

        public static RtcSeverity[] values() {
            return (RtcSeverity[]) f331727g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvCallsLoggingConfiguration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/logger/AvCallsLoggingConfiguration$SdkSeverity;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SdkSeverity {

        /* renamed from: b, reason: collision with root package name */
        public static final SdkSeverity f331729b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ SdkSeverity[] f331730c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331731d;

        static {
            SdkSeverity sdkSeverity = new SdkSeverity("DEBUG", 0);
            f331729b = sdkSeverity;
            SdkSeverity[] sdkSeverityArr = {sdkSeverity, new SdkSeverity("INFO", 1), new SdkSeverity("ERROR", 2), new SdkSeverity("NONE", 3)};
            f331730c = sdkSeverityArr;
            f331731d = kotlin.enums.c.a(sdkSeverityArr);
        }

        public SdkSeverity() {
            throw null;
        }

        public static SdkSeverity valueOf(String str) {
            return (SdkSeverity) Enum.valueOf(SdkSeverity.class, str);
        }

        public static SdkSeverity[] values() {
            return (SdkSeverity[]) f331730c.clone();
        }
    }

    public AvCallsLoggingConfiguration() {
        SdkSeverity sdkSeverity = SdkSeverity.f331729b;
        RtcSeverity rtcSeverity = RtcSeverity.f331722b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvCallsLoggingConfiguration)) {
            return false;
        }
        ((AvCallsLoggingConfiguration) obj).getClass();
        SdkSeverity sdkSeverity = SdkSeverity.f331729b;
        RtcSeverity rtcSeverity = RtcSeverity.f331722b;
        return true;
    }

    public final int hashCode() {
        return RtcSeverity.f331723c.hashCode() + (SdkSeverity.f331729b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "AvCallsLoggingConfiguration(sdkSeverity=" + SdkSeverity.f331729b + ", rtcSeverity=" + RtcSeverity.f331723c + ')';
    }
}
