package defpackage;

import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes.dex */
public abstract class l9j {
    public static final String a(String str) {
        if (str != null && str.length() != 0) {
            try {
                new ArrayList().add("");
                if (mei.e(mni.E(0, str, 0, 7)) != null) {
                    return str;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            } catch (Throwable th) {
                wqi.e("ServerPrefs", "validate host failure", th);
            }
        }
        return null;
    }

    public static d53 b(g5i g5iVar, long j, long j2, String str) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.o;
            if (l6bVar.b(lg8Var)) {
                StringBuilder sbL = az1.l(j, "start for ", "/");
                sbL.append(j2);
                l6bVar.c(lg8Var, "worker:multi-attaches-downloader", sbL.toString(), null);
            }
        }
        StringBuilder sbL2 = az1.l(j, "worker:multi-attaches-downloader:c=", ";m=");
        sbL2.append(j2);
        String string = sbL2.toString();
        ngb ngbVar = (ngb) ((ngb) new ngb(DownloadAttachesWorker.class).setExpedited(ujb.a)).addTag("worker:multi-attaches-downloader");
        imb[] imbVarArr = {new imb(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j)), new imb("messageId", Long.valueOf(j2)), new imb("attachLocalId", str)};
        r5j r5jVar = new r5j(14);
        for (int i = 0; i < 3; i++) {
            imb imbVar = imbVarArr[i];
            r5jVar.C(imbVar.b, (String) imbVar.a);
        }
        q48 q48VarB = g5iVar.b(string, uk5.b, (ogb) ((ngb) ngbVar.setInputData(r5jVar.g())).build());
        q48VarB.c();
        return new d53(lc4.b(q48VarB.b.d()), 6);
    }
}
