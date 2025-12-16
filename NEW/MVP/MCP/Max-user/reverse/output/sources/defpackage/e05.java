package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class e05 implements btf {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadAttachesWorker b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e05(DownloadAttachesWorker downloadAttachesWorker, Object obj, int i) {
        this.a = i;
        this.b = downloadAttachesWorker;
        this.c = obj;
    }

    @Override // defpackage.btf
    public final String a() {
        switch (this.a) {
        }
        return null;
    }

    @Override // defpackage.btf
    public final Object b(float f, long j, long j2, q44 q44Var) {
        switch (this.a) {
            case 0:
                Float f2 = new Float(f);
                DownloadAttachesWorker downloadAttachesWorker = this.b;
                downloadAttachesWorker.D0.put(new Long(((f10) this.c).a), f2);
                Object objUpdateForeground = downloadAttachesWorker.updateForeground(q44Var);
                if (objUpdateForeground != g84.a) {
                    break;
                }
                break;
            default:
                Float f3 = new Float(f);
                DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                downloadAttachesWorker2.D0.put(new Long(((w10) this.c).d.a), f3);
                Object objUpdateForeground2 = downloadAttachesWorker2.updateForeground(q44Var);
                if (objUpdateForeground2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }

    @Override // defpackage.btf
    public final Object f(File file, q44 q44Var) {
        switch (this.a) {
            case 0:
                DownloadAttachesWorker downloadAttachesWorker = this.b;
                downloadAttachesWorker.D0.put(new Long(((f10) this.c).a), new Float(100.0f));
                Object objUpdateForeground = downloadAttachesWorker.updateForeground(q44Var);
                if (objUpdateForeground != g84.a) {
                    break;
                }
                break;
            default:
                DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                downloadAttachesWorker2.D0.put(new Long(((w10) this.c).d.a), new Float(100.0f));
                Object objUpdateForeground2 = downloadAttachesWorker2.updateForeground(q44Var);
                if (objUpdateForeground2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
