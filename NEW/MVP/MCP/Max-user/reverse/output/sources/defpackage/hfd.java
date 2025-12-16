package defpackage;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.viewpager2.widget.ViewPager2;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class hfd implements qkh, gu3, ac8, cff, m7c, tf9, v5, vva, yci {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hfd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ac8
    public void A(dc8 dc8Var, long j, long j2) {
        boolean z;
        iv6 iv6Var = (iv6) this.b;
        synchronized (tmi.b) {
            z = tmi.c;
        }
        if (z) {
            iv6Var.v();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        rd4 rd4Var = (rd4) iv6Var.b;
        pai.c("DashMediaSource", "Failed to resolve time offset.", iOException);
        rd4Var.s(true);
    }

    @Override // defpackage.ac8
    public y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        rd4 rd4Var = (rd4) ((iv6) this.b).b;
        pai.c("DashMediaSource", "Failed to resolve time offset.", iOException);
        rd4Var.s(true);
        return hc8.X;
    }

    @Override // defpackage.vva
    public void a(Object obj) {
        ((n2g) ((kme) this.b).b).a.p();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                wqi.e(((wge) this.b).o, "onServiceNotAvailable", (Throwable) obj);
                break;
            case 10:
                ((fqg) this.b).a.m(null, (Float) obj);
                break;
            default:
                wqi.c("g5i", "initialized!", new Object[0]);
                ((g5i) this.b).h = true;
                ((g5i) this.b).i((z4i) obj);
                z4i z4iVarH = ((g5i) this.b).h();
                l5c l5cVar = (l5c) ((g5i) this.b).c;
                l5cVar.getClass();
                int iM = (int) l5cVar.m(PmsKey.f163wmbacklogworkerbackoffdelaysec, 10);
                lui.b(z4iVarH, Integer.valueOf(iM >= 1 ? iM : 1), null);
                break;
        }
    }

    @Override // defpackage.tf9
    public boolean b(vf9 vf9Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.yci
    public Object d() {
        return ((qc4) this.b).a;
    }

    @Override // defpackage.cff
    public void e(fff fffVar) {
    }

    @Override // defpackage.tf9
    public void f(vf9 vf9Var) {
        acg acgVar = (acg) this.b;
        Window.Callback callback = acgVar.b;
        if (acgVar.a.a.p()) {
            callback.onPanelClosed(108, vf9Var);
        } else if (callback.onPreparePanel(0, null, vf9Var)) {
            callback.onMenuOpened(108, vf9Var);
        }
    }

    @Override // defpackage.cff
    public void g(fff fffVar) {
        StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) this.b;
        yy7[] yy7VarArr = StickerSetBottomSheet.E0;
        ((off) stickerSetBottomSheet.w0.getValue()).w(fffVar.a);
    }

    @Override // defpackage.v5
    public boolean h(View view) {
        zva zvaVar = (zva) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) zvaVar.o;
        if (viewPager2.E0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.ac8
    public void r(dc8 dc8Var, long j, long j2, boolean z) {
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker = (TaskMonitor$TaskMonitorWorker) this.b;
        wqi.c("x2g", "work " + taskMonitor$TaskMonitorWorker.getId() + " Receive task remove callback", new Object[0]);
        return taskMonitor$TaskMonitorWorker.b();
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return wy1.e(((long[]) this.b).length, "Subject{organizationIds=", "}");
            default:
                return super.toString();
        }
    }

    public hfd(qf1 qf1Var) {
        this.a = 2;
        this.b = new awd(7, qf1Var.l);
    }

    public hfd() {
        this.a = 4;
        this.b = new bwf(new nte(4));
    }
}
