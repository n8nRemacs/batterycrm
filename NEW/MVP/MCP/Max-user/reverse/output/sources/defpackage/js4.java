package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class js4 implements i6f {
    public i6f a;
    public final is4 b;

    public js4(is4 is4Var) {
        this.b = is4Var;
    }

    @Override // defpackage.i6f
    public final boolean a(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }

    @Override // defpackage.i6f
    public final boolean b() {
        return true;
    }

    @Override // defpackage.i6f
    public final String c(SSLSocket sSLSocket) {
        i6f i6fVarE = e(sSLSocket);
        if (i6fVarE != null) {
            return i6fVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.i6f
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i6f i6fVarE = e(sSLSocket);
        if (i6fVarE != null) {
            i6fVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized i6f e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.a(sSLSocket)) {
                this.a = this.b.l(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
