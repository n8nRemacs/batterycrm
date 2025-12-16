package yJ;

import Y61.k;
import kotlin.Metadata;
import org.webrtc.Logging;

/* compiled from: RtcLoggingSeverityMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyJ/b;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yJ.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50121b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C50121b f443025a = new C50121b();

    /* compiled from: RtcLoggingSeverityMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yJ.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f443026a;

        static {
            int[] iArr = new int[Logging.Severity.values().length];
            try {
                iArr[Logging.Severity.LS_VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logging.Severity.LS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logging.Severity.LS_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logging.Severity.LS_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logging.Severity.LS_NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f443026a = iArr;
        }
    }
}
