package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class tx extends Thread {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ tx(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        wx wxVarA;
        switch (this.a) {
            case 0:
                break;
            case 1:
            default:
                super.run();
                return;
            case 2:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                synchronized (wx.class) {
                    try {
                        wx wxVar = wx.j;
                        wxVarA = lsi.a();
                        if (wxVarA == wx.j) {
                            wx.j = null;
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (wxVarA != null) {
                    wxVarA.k();
                }
            } catch (InterruptedException unused2) {
                continue;
            }
        }
    }

    public /* synthetic */ tx(String str) {
        super(str);
    }

    public /* synthetic */ tx(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
