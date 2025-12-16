package defpackage;

import java.io.File;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ztg implements gu3, w2f, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bug b;

    public /* synthetic */ ztg(bug bugVar, int i) {
        this.a = i;
        this.b = bugVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        wqi.e("aug", "removeUploadFromRepository: failed, data=" + this.b, (Throwable) obj);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                ewg ewgVar = (ewg) obj;
                bug bugVar = this.b;
                String str = bugVar.a;
                wvg wvgVar = bugVar.c;
                long j = bugVar.b;
                ewgVar.getClass();
                dsd dsdVarC = dsd.c(3, "SELECT * FROM uploads WHERE path=? AND upload_type=? AND last_modified=? LIMIT 1");
                if (str == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str);
                }
                dsdVarC.k(2, wvgVar.a);
                dsdVarC.k(3, j);
                return new yr8(new bwg(ewgVar, dsdVarC, 0));
            default:
                ewg ewgVar2 = (ewg) obj;
                bug bugVar2 = this.b;
                String str2 = bugVar2.a;
                wvg wvgVar2 = bugVar2.c;
                long j2 = bugVar2.b;
                ewgVar2.getClass();
                return new kk3(2, new dwg(ewgVar2, str2, wvgVar2, j2));
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        Object ipdVar;
        wqi.c("aug", "checkSourceFileChanged: started", new Object[0]);
        bug bugVar = this.b;
        try {
            ipdVar = Long.valueOf(new File(bugVar.a).lastModified());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = 0L;
        }
        long jLongValue = ((Number) ipdVar).longValue();
        boolean z = (jLongValue == 0 || jLongValue == bugVar.b) ? false : true;
        if (i2fVar.e()) {
            return;
        }
        if (z) {
            i2fVar.onError(new UploadException("failed to upload, file changed"));
        } else {
            wqi.c("aug", "checkSourceFileChanged: finished", new Object[0]);
            i2fVar.a(bugVar);
        }
    }
}
