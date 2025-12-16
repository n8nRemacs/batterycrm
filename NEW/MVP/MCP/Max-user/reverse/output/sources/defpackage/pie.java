package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class pie implements r0i {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca7 b;

    public /* synthetic */ pie(ca7 ca7Var, int i) {
        this.a = i;
        this.b = ca7Var;
    }

    @Override // defpackage.r0i
    public final OutputStream a() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return null;
        }
    }

    @Override // defpackage.r0i
    public final InputStream b() {
        switch (this.a) {
        }
        return this.b.b();
    }
}
