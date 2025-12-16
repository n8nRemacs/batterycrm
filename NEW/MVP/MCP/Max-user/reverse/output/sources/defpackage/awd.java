package defpackage;

import android.os.Handler;
import android.os.Looper;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class awd implements wl, cff, gu3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ awd() {
        this.a = 12;
    }

    public void a(boolean z) {
        k01 k01Var = (k01) this.b;
        k01Var.P.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        k01Var.l.post(new ui(13, this, z));
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                wqi.c(((ytf) this.b).b, "Connection restored", new Object[0]);
                break;
            default:
                ((UploadFileAttachWorker) this.b).g((xm9) obj);
                break;
        }
    }

    public void b(cm6 cm6Var) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = (Handler) this.b;
        if (fni.a(looperMyLooper, handler.getLooper())) {
            cm6Var.invoke();
        } else {
            handler.post(new aj0(10, cm6Var));
        }
    }

    @Override // defpackage.cff
    public void e(fff fffVar) {
    }

    @Override // defpackage.wl
    public tl f() {
        return (tl) this.b;
    }

    @Override // defpackage.cff
    public void g(fff fffVar) {
        long j = fffVar.a;
        StickersScreen stickersScreen = (StickersScreen) this.b;
        yy7[] yy7VarArr = StickersScreen.u0;
        if (!((f6a) stickersScreen.A0().u().e.a.getValue()).a) {
            pif.c.p0().b(":stickers/preview?sticker_id=" + j, null);
            return;
        }
        o6a o6aVarU = stickersScreen.A0().u();
        o6aVarU.f.O(o6aVarU, o6a.g[0], svi.d(o6aVarU.a, ((q2b) o6aVarU.b).a(), i84.b, new j6a(o6aVarU, j, null)));
    }

    @Override // defpackage.wl
    public void i(tl tlVar) {
        this.b = tlVar;
    }

    public /* synthetic */ awd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public awd(Looper looper) {
        this.a = 5;
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        this.b = new Handler(looper);
    }
}
