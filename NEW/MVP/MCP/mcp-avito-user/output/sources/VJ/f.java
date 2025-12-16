package vJ;

import Y61.l;
import com.avito.avcalls.rtc.connecting.Sdp;
import kotlin.G;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import vJ.e;

/* compiled from: SdpObserverMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvJ/f;", "Lorg/webrtc/SdpObserver;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements SdpObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.rtc.connecting.c f440677a;

    public f(com.avito.avcalls.rtc.connecting.c cVar) {
        this.f440677a = cVar;
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateFailure(@l String str) {
        this.f440677a.onCreateFailure(str);
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateSuccess(@l SessionDescription sessionDescription) {
        Sdp.Type type;
        if (sessionDescription == null) {
            throw new IllegalStateException("Required value was null.");
        }
        e.f440675a.getClass();
        int i12 = e.a.f440676a[sessionDescription.type.ordinal()];
        if (i12 == 1) {
            type = Sdp.Type.f333076c;
        } else {
            if (i12 == 2) {
                throw new G("Sdp.Type=PRANSWER not supported");
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new G("Sdp.Type=ROLLBACK not supported");
                }
                throw new NoWhenBranchMatchedException();
            }
            type = Sdp.Type.f333077d;
        }
        String str = sessionDescription.description;
        if (str == null) {
            str = "";
        }
        this.f440677a.m(new Sdp(type, str));
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(@l String str) {
        this.f440677a.onSetFailure(str);
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetSuccess() {
        this.f440677a.onSetSuccess();
    }
}
