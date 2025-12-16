package defpackage;

import org.webrtc.AndroidVideoDecoder;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class pz0 implements AndroidVideoDecoder.ErrorCallback, he8, SignalingProvider {
    public final /* synthetic */ k01 a;

    public /* synthetic */ pz0(k01 k01Var) {
        this.a = k01Var;
    }

    @Override // defpackage.he8
    public boolean a() {
        return this.a.n.i;
    }

    @Override // org.webrtc.AndroidVideoDecoder.ErrorCallback
    public void error(Exception exc, String str) {
        this.a.P.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }

    @Override // ru.ok.android.externcalls.sdk.signaling.SignalingProvider
    public pze getSignaling() {
        return this.a.k;
    }
}
