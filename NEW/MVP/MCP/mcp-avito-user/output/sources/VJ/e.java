package vJ;

import Y61.k;
import com.avito.avcalls.rtc.connecting.Sdp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.SessionDescription;

/* compiled from: SdpMappers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvJ/e;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f440675a = new e();

    /* compiled from: SdpMappers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f440676a;

        static {
            int[] iArr = new int[SessionDescription.Type.values().length];
            try {
                iArr[SessionDescription.Type.OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionDescription.Type.PRANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionDescription.Type.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SessionDescription.Type.ROLLBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f440676a = iArr;
            int[] iArr2 = new int[Sdp.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Sdp.Type.Companion companion = Sdp.Type.INSTANCE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @k
    public static SessionDescription a(@k Sdp sdp) {
        SessionDescription.Type type;
        int iOrdinal = sdp.f333072a.ordinal();
        if (iOrdinal == 0) {
            type = SessionDescription.Type.OFFER;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            type = SessionDescription.Type.ANSWER;
        }
        return new SessionDescription(type, sdp.f333073b);
    }
}
