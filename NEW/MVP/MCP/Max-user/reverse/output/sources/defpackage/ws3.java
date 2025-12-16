package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class ws3 implements is4 {
    @Override // defpackage.is4
    public final boolean a(SSLSocket sSLSocket) {
        return vs3.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.is4
    public final i6f l(SSLSocket sSLSocket) {
        return new xs3();
    }
}
