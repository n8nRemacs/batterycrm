package defpackage;

import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class lv5 {
    public static final /* synthetic */ int d = 0;
    public final g5i a;
    public final kz4 b;
    public final kz4 c;

    public lv5(g5i g5iVar, kz4 kz4Var, kz4 kz4Var2) {
        this.a = g5iVar;
        this.b = kz4Var;
        this.c = kz4Var2;
    }

    public final void a(long j, boolean z) {
        try {
            int i = 1;
            List<um9> list = (List) new wr8(new ora(new vr8(new wr8(((bn9) this.c.get()).b(), new t00(j, 13), i), new vef(8), 0), new p89(9), 5).s(), new p89(11), i).c(hd5.a);
            for (um9 um9Var : list) {
                if (z) {
                    yqb.e(kvg.g, jvg.USER_CANCELLED, um9Var.a.c);
                }
                cl9 cl9Var = um9Var.a;
                this.a.c("UploadFileAttachWorker:" + cl9Var.b + ":" + cl9Var.a + ":" + cl9Var.c);
            }
            wqi.c("lv5", "success! cancel attach %d uploads", Integer.valueOf(list.size()));
        } catch (Throwable th) {
            wqi.e("lv5", "failure to cancel attach uploads", th);
        }
    }

    public final void b(long j) {
        try {
            int i = 1;
            List list = (List) new wr8(new ora(new vr8(new wr8(((n35) this.b.get()).a(), new n7(j), i), mni.t0, 0), u1j.v0, 5).s(), r8j.v0, i).a();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    y25 y25Var = ((e35) it.next()).a;
                    this.a.c("UploadDraftMediaWorker/" + y25Var.a + ":" + y25Var.b);
                }
            }
            wqi.c("lv5", "success! cancel draft %d uploads", list != null ? Integer.valueOf(list.size()) : null);
        } catch (Exception e) {
            wqi.e("lv5", "failure in cancelling draft uploads other workers", e);
        }
    }

    public final void c(d3 d3Var, long j, long j2, String str) {
        p2h p2hVar;
        int i = d3Var.a;
        wvg wvgVar = wvg.b;
        wvg wvgVar2 = i != 1 ? i != 2 ? i != 3 ? i != 7 ? i != 10 ? i != 11 ? wvgVar : wvg.t0 : wvg.s0 : wvg.X : wvg.c : wvg.Y : d3Var instanceof vo5 ? wvg.Z : wvg.d;
        if (wvgVar2 == wvgVar) {
            wqi.f("FileAttachUploader", "upload: failed, unknown media type = %s", Integer.valueOf(i));
            return;
        }
        cl9 cl9Var = new cl9(j, j2, str);
        wo8 wo8Var = new wo8();
        wo8Var.c = cl9Var;
        wo8Var.d = wvgVar2;
        wo8Var.b = d3Var.a();
        wo8Var.a = pbj.e(d3Var.a());
        if (d3Var instanceof y4h) {
            p2h p2hVar2 = ((y4h) d3Var).c;
            gsc gscVar = p2hVar2.a;
            float f = p2hVar2.b;
            float f2 = p2hVar2.c;
            boolean z = p2hVar2.d;
            u10 u10Var = new u10(2);
            u10Var.c = gscVar;
            u10Var.a = f;
            u10Var.b = f2;
            u10Var.d = z;
            p2hVar = new p2h(u10Var);
        } else {
            p2hVar = null;
        }
        wo8Var.o = p2hVar;
        d(new um9(wo8Var));
    }

    public final void d(um9 um9Var) {
        wqi.c("UploadFileAttachWorker", "start %s", um9Var);
        cl9 cl9Var = um9Var.a;
        long j = cl9Var.b;
        long j2 = cl9Var.a;
        String str = cl9Var.c;
        StringBuilder sbL = az1.l(j, "UploadFileAttachWorker:", ":");
        sbL.append(j2);
        sbL.append(":");
        sbL.append(str);
        String string = sbL.toString();
        ngb ngbVar = (ngb) ((ngb) ((ngb) new ngb(UploadFileAttachWorker.class).setExpedited(ujb.a)).setBackoffCriteria(eg0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("UploadFileAttachWorker");
        HashMap map = new HashMap();
        map.put("workName", string);
        map.put("key.messageId", Long.valueOf(j2));
        map.put("key.chatId", Long.valueOf(cl9Var.b));
        map.put("key.attachLocalId", str);
        map.put(ClientCookie.PATH_ATTR, um9Var.b);
        map.put("lastModified", Long.valueOf(um9Var.c));
        map.put("uploadType", um9Var.d.name());
        map.put("attachLocalId", um9Var.f);
        p2h p2hVar = um9Var.e;
        if (p2hVar != null) {
            map.put("messageUpload.videoConvertOptions", Boolean.TRUE);
            map.put("messageUpload.videoConvertOptions.quality", p2hVar.a.name());
            map.put("messageUpload.videoConvertOptions.startTrimPosition", Float.valueOf(p2hVar.b));
            map.put("messageUpload.videoConvertOptions.endTrimPosition", Float.valueOf(p2hVar.c));
            map.put("messageUpload.videoConvertOptions.mute", Boolean.valueOf(p2hVar.d));
        }
        yd4 yd4Var = new yd4(map);
        yd4.f(yd4Var);
        this.a.b(string, uk5.b, (ogb) ((ngb) ngbVar.setInputData(yd4Var)).build()).c();
    }
}
