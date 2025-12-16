package defpackage;

import android.app.DownloadManager;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lw5 extends dtf implements sm6 {
    public final /* synthetic */ mw5 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ File o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw5(File file, mw5 mw5Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = file;
        this.X = mw5Var;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lw5 lw5Var = (lw5) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lw5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lw5(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        mw5 mw5Var = this.X;
        File file = this.o;
        g8j.b(obj);
        try {
            String strH = xpi.h(file.getName());
            if (strH == null || strH.length() == 0) {
                strH = "*/*";
            }
            String str = strH;
            boolean z = this.Y;
            Object systemService = mw5Var.a.getSystemService("download");
            DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
            if (downloadManager != null) {
                downloadManager.addCompletedDownload(file.getName(), file.getName(), false, str, file.getAbsolutePath(), file.length(), z);
            }
        } catch (Throwable th) {
            wqi.b(mw5.g, "fail!", th);
            kz4 kz4Var = mw5Var.b;
            yy7 yy7Var = mw5.f[1];
            ((y3b) ((yi5) kz4Var.get())).a(th);
        }
        return qqg.a;
    }
}
