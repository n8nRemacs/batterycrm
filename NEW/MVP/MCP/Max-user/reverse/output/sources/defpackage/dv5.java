package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class dv5 {
    public final k18 a;

    public dv5(k18 k18Var) {
        this.a = k18Var;
    }

    public final d53 a(m2g m2gVar) {
        g5i g5iVar = (g5i) this.a.getValue();
        String str = m2gVar.k;
        wqi.c("workers:DownloadFileAttachWorker", "start %s", m2gVar);
        long j = m2gVar.a;
        String str2 = m2gVar.b;
        long j2 = m2gVar.c;
        long j3 = m2gVar.d;
        long j4 = m2gVar.e;
        long j5 = m2gVar.f;
        long j6 = m2gVar.j;
        String str3 = wqi.a() ? str : "*****";
        StringBuilder sbN = ho7.n("TaskAttachDownloadData{messageId=", j, ", attachId='", str2);
        az1.r(j2, "', videoId=", ", audioId=", sbN);
        sbN.append(j3);
        az1.r(j4, ", mp4GifId=", ", stickerId=", sbN);
        sbN.append(j5);
        az1.r(j6, ", fileId=", ", fileName='", sbN);
        String strH = wy1.h("workers:DownloadFileAttachWorker/", ho7.l(sbN, str3, "'}"));
        ngb ngbVar = (ngb) ((ngb) ((ngb) new ngb(DownloadFileAttachWorker.class).setExpedited(ujb.a)).setBackoffCriteria(eg0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("workers:DownloadFileAttachWorker");
        imb[] imbVarArr = {new imb("taskName", strH), new imb("messageId", Long.valueOf(j)), new imb("attachId", str2), new imb("videoId", Long.valueOf(j2)), new imb("audioId", Long.valueOf(j3)), new imb("mp4GifId", Long.valueOf(j4)), new imb("stickerId", Long.valueOf(j5)), new imb(KwsFeaturesConfigProviderImpl.URL_KEY, m2gVar.g), new imb("notifyProgress", Boolean.valueOf(m2gVar.h)), new imb("checkAutoLoadConnection", Boolean.valueOf(m2gVar.i)), new imb("fileId", Long.valueOf(j6)), new imb("fileName", str), new imb("invalidateCount", Integer.valueOf(m2gVar.l)), new imb("useOriginalExtension", Boolean.valueOf(m2gVar.m)), new imb("notCopyVideoToGallery", Boolean.valueOf(m2gVar.n)), new imb("attachType", m2gVar.p)};
        r5j r5jVar = new r5j(14);
        for (int i = 0; i < 16; i++) {
            imb imbVar = imbVarArr[i];
            r5jVar.C(imbVar.b, (String) imbVar.a);
        }
        q48 q48VarB = g5iVar.b(strH, uk5.b, (ogb) ((ngb) ngbVar.setInputData(r5jVar.g())).build());
        q48VarB.c();
        return new d53(lc4.b(q48VarB.b.d()), 7);
    }
}
