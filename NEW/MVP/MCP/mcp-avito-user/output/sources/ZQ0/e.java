package zQ0;

import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import kotlin.Metadata;
import org.webrtc.Logging;

/* compiled from: RtcLoggingSeverity.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* compiled from: RtcLoggingSeverity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f444041a;

        static {
            int[] iArr = new int[AvCallsLoggingConfiguration.RtcSeverity.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity2 = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity3 = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity4 = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Logging.Severity.values().length];
            try {
                iArr2[Logging.Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Logging.Severity.LS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Logging.Severity.LS_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Logging.Severity.LS_VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Logging.Severity.LS_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f444041a = iArr2;
        }
    }
}
