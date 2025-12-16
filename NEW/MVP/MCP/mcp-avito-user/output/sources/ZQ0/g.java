package zQ0;

import Y61.k;
import com.avito.avcalls.android.rtc.Sdp;
import kotlin.G;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.SessionDescription;

/* compiled from: SdpMappers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* compiled from: SdpMappers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f444042a;

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
            f444042a = iArr;
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
    public static final SessionDescription a(@k Sdp sdp) {
        SessionDescription.Type type;
        int iOrdinal = sdp.f331883a.ordinal();
        if (iOrdinal == 0) {
            type = SessionDescription.Type.OFFER;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            type = SessionDescription.Type.ANSWER;
        }
        return new SessionDescription(type, sdp.f331884b);
    }

    @k
    public static final Sdp b(@k SessionDescription sessionDescription) {
        Sdp.Type type;
        int i12 = a.f444042a[sessionDescription.type.ordinal()];
        if (i12 == 1) {
            type = Sdp.Type.f331886c;
        } else {
            if (i12 == 2) {
                throw new G("Sdp.Type=PRANSWER not supported");
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new G("Sdp.Type=ROLLBACK not supported");
            }
            type = Sdp.Type.f331887d;
        }
        String str = sessionDescription.description;
        if (str == null) {
            str = "";
        }
        return new Sdp(type, str);
    }
}
