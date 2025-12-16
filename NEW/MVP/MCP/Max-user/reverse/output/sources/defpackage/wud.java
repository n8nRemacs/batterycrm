package defpackage;

import android.net.Uri;
import io.antmedia.rtmp_client.RtmpClient;

/* loaded from: classes.dex */
public final class wud extends mj0 {
    public static final /* synthetic */ int Y = 0;
    public Uri X;
    public RtmpClient o;

    static {
        e19.a("media3.datasource.rtmp");
    }

    public wud() {
        super(true);
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) throws RtmpClient.RtmpIOException {
        d(ze4Var);
        RtmpClient rtmpClient = new RtmpClient();
        rtmpClient.a = 0L;
        this.o = rtmpClient;
        rtmpClient.b(ze4Var.a.toString());
        this.X = ze4Var.a;
        e(ze4Var);
        return -1L;
    }

    @Override // defpackage.se4
    public final void close() {
        if (this.X != null) {
            this.X = null;
            c();
        }
        RtmpClient rtmpClient = this.o;
        if (rtmpClient != null) {
            rtmpClient.a();
            this.o = null;
        }
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.X;
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) throws RtmpClient.RtmpIOException, IllegalStateException {
        RtmpClient rtmpClient = this.o;
        String str = zxg.a;
        int iC = rtmpClient.c(bArr, i, i2);
        if (iC == -1) {
            return -1;
        }
        b(iC);
        return iC;
    }
}
