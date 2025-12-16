package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final /* synthetic */ class p15 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadFileAttachWorker b;

    public /* synthetic */ p15(DownloadFileAttachWorker downloadFileAttachWorker, int i) {
        this.a = i;
        this.b = downloadFileAttachWorker;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yd4 inputData = this.b.getInputData();
                long jD = inputData.d("messageId", 0L);
                String strE = inputData.e("attachId");
                String str = strE == null ? "" : strE;
                long jD2 = inputData.d("videoId", 0L);
                long jD3 = inputData.d("audioId", 0L);
                long jD4 = inputData.d("mp4GifId", 0L);
                long jD5 = inputData.d("stickerId", 0L);
                String strE2 = inputData.e(KwsFeaturesConfigProviderImpl.URL_KEY);
                String str2 = strE2 == null ? "" : strE2;
                boolean zB = inputData.b("notifyProgress", false);
                boolean zB2 = inputData.b("checkAutoLoadConnection", false);
                long jD6 = inputData.d("fileId", 0L);
                String strE3 = inputData.e("fileName");
                if (strE3 == null) {
                    strE3 = "";
                }
                Object obj = inputData.a.get("invalidateCount");
                int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                boolean zB3 = inputData.b("useOriginalExtension", false);
                boolean zB4 = inputData.b("notCopyVideoToGallery", false);
                String strE4 = inputData.e("attachType");
                return new m2g(jD, str, jD2, jD3, jD4, jD5, str2, zB, zB2, jD6, strE3, iIntValue, zB3, zB4, strE4 == null ? "" : strE4);
            case 1:
                return ((y4e) this.b.getTamComponent()).c();
            case 2:
                return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
            case 3:
                return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
            case 4:
                return (hwa) ((y4e) this.b.getTamComponent()).getAccessor().c(79);
            case 5:
                return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
            case 6:
                return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
            case 7:
                return ((y4e) this.b.getTamComponent()).j();
            case 8:
                return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
            case 9:
                return Integer.valueOf((Long.hashCode(((m2g) this.b.a.getValue()).a) * 31) + ((((m2g) r1.getValue()).b.hashCode() * 31) - 1395109460));
            case 10:
                return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
            case 11:
                return ((y4e) this.b.getTamComponent()).e();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((y4e) this.b.getTamComponent()).j();
            case 13:
                DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                return new n15((m2g) downloadFileAttachWorker.a.getValue(), new bwf(new p15(downloadFileAttachWorker, 15)), new bwf(new p15(downloadFileAttachWorker, 17)), new bwf(new p15(downloadFileAttachWorker, 1)), new bwf(new p15(downloadFileAttachWorker, 2)), new bwf(new p15(downloadFileAttachWorker, 3)), new bwf(new p15(downloadFileAttachWorker, 4)), new bwf(new p15(downloadFileAttachWorker, 5)), new bwf(new p15(downloadFileAttachWorker, 6)), new bwf(new p15(downloadFileAttachWorker, 7)), new bwf(new p15(downloadFileAttachWorker, 8)), new bwf(new p15(downloadFileAttachWorker, 16)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                DownloadFileAttachWorker downloadFileAttachWorker2 = this.b;
                return c5i.d(downloadFileAttachWorker2.getApplicationContext()).c(downloadFileAttachWorker2.getId());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
            case 16:
                return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
            default:
                return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
        }
    }
}
