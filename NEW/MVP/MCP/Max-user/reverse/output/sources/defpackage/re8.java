package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class re8 implements nac {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ContentResolver c;

    public /* synthetic */ re8(Executor executor, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executor;
        this.c = contentResolver;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        switch (this.a) {
            case 0:
                mk0 mk0Var = (mk0) oacVar;
                rac racVar = mk0Var.c;
                rf7 rf7Var = mk0Var.a;
                mk0Var.h("local", "thumbnail_bitmap");
                qe8 qe8Var = new qe8(this, hj0Var, racVar, oacVar, racVar, oacVar, rf7Var, new CancellationSignal());
                mk0Var.a(new hh4(4, qe8Var));
                this.b.execute(qe8Var);
                break;
            default:
                mk0 mk0Var2 = (mk0) oacVar;
                rac racVar2 = mk0Var2.c;
                rf7 rf7Var2 = mk0Var2.a;
                mk0Var2.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                fd8 fd8Var = new fd8(this, hj0Var, racVar2, oacVar, racVar2, oacVar, rf7Var2);
                mk0Var2.a(new hh4(5, fd8Var));
                this.b.execute(fd8Var);
                break;
        }
    }
}
