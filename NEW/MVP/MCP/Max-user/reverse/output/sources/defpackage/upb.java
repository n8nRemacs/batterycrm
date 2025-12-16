package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final class upb {
    public y8g C;
    public h1e D;
    public PeerConnection.IceTransportsType E;
    public PeerConnection.VpnPreference F;
    public Object G;
    public rve a;
    public ove b;
    public ExecutorService c;
    public si1 d;
    public Context e;
    public b7d f;
    public y6d g;
    public y6i w;
    public ak x;
    public zi y;
    public l2e z;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public String[] o = null;
    public String[] p = null;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public int H = 4;
    public boolean A = false;
    public Integer B = null;

    public final wpb a() {
        if (this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null && this.w != null && this.C != null) {
            return new wpb(this);
        }
        throw new IllegalStateException("failed to build peerConnectionClient" + this.a + " " + this.b + " " + this.c + " " + this.d + " " + this.e + " " + this.f + " " + this.g + " " + this.w + " " + this.C);
    }
}
