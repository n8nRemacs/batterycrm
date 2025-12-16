package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.c5i;
import defpackage.cm6;
import defpackage.ctf;
import defpackage.e25;
import defpackage.fge;
import defpackage.ipd;
import defpackage.ku3;
import defpackage.l24;
import defpackage.lzf;
import defpackage.q2b;
import defpackage.qe6;
import defpackage.qqg;
import defpackage.qw5;
import defpackage.tw0;
import defpackage.u15;
import defpackage.ukh;
import defpackage.ul8;
import defpackage.v2g;
import defpackage.v4j;
import defpackage.wqi;
import defpackage.x7b;
import defpackage.y15;
import defpackage.z15;
import defpackage.z74;
import defpackage.zv5;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "z15", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadFileFromWebAppWorker extends ForegroundWorker {
    public final bwf X;
    public final bwf Y;
    public final bwf Z;
    public final bwf a;
    public final bwf b;
    public final bwf c;
    public final bwf d;
    public final bwf o;
    public final bwf s0;
    public final bwf t0;
    public final AtomicInteger u0;
    public long v0;
    public volatile z15 w0;
    public File x0;
    public final e25 y0;

    public DownloadFileFromWebAppWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i2 = 1;
        this.b = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i3 = 2;
        this.c = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i4 = 3;
        this.d = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i5 = 4;
        this.o = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i6 = 5;
        this.X = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i7 = 6;
        this.Y = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i8 = 7;
        this.Z = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i9 = 8;
        this.s0 = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        final int i10 = 9;
        this.t0 = new bwf(new cm6(this) { // from class: t15
            public final /* synthetic */ DownloadFileFromWebAppWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        long jD2 = inputData.d("botId", 0L);
                        String strE = inputData.e("fileName");
                        String str = strE == null ? "" : strE;
                        String strE2 = inputData.e("fileUrl");
                        return new v2g(jD, jD2, strE2 == null ? "" : strE2, str);
                    case 1:
                        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                        return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.b().b) * 31) + (downloadFileFromWebAppWorker.b().c.hashCode() * 31) + 1500490718);
                    case 2:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 3:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    case 4:
                        return (ctf) ((y4e) this.b.getTamComponent()).getAccessor().c(440);
                    case 5:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 8:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    default:
                        return (l24) ((y4e) this.b.getTamComponent()).getAccessor().c(123);
                }
            }
        });
        this.u0 = new AtomicInteger();
        this.y0 = new e25(this);
    }

    public final v2g b() {
        return (v2g) this.a.getValue();
    }

    public final tw0 c() {
        return (tw0) this.d.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        int i;
        long j;
        long j2;
        long j3;
        String strE;
        Object ipdVar;
        PendingIntent pendingIntentC = c5i.d(getApplicationContext()).c(getId());
        z15 z15Var = this.w0;
        y15 y15Var = z15Var instanceof y15 ? (y15) z15Var : null;
        if (y15Var != null) {
            i = y15Var.a;
            j = y15Var.b;
            j2 = y15Var.c;
        } else {
            i = -1;
            j = 0;
            j2 = 0;
        }
        int i2 = i;
        String string = getApplicationContext().getString(((qw5) this.Y.getValue()).e);
        ku3 ku3Var = (ku3) ((l24) this.t0.getValue()).c(j2).a.getValue();
        if (ku3Var != null) {
            j3 = j;
            strE = ku3Var.e();
        } else {
            j3 = j;
            strE = null;
        }
        qw5 qw5Var = (qw5) this.Y.getValue();
        try {
            File file = this.x0;
            if (file == null) {
                file = null;
            }
            ipdVar = file.getName();
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = "";
        }
        String str = string + " " + ipdVar;
        Context context = qw5Var.a;
        int iHashCode = Long.hashCode(j2);
        x7b x7bVar = qw5Var.b;
        x7bVar.getClass();
        return new qe6(((Number) this.b.getValue()).intValue(), qw5Var.a(strE, str, Long.valueOf(j3), false, i2, v4j.b(context, iHashCode, x7bVar.j(ul8.c.R0(j2, ukh.Z, null))), pendingIntentC), fge.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        if (r12 == r1) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x0040, B:32:0x00a0, B:34:0x00a6, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00d9, B:46:0x00e1, B:48:0x00ec, B:50:0x00f2, B:52:0x00fc, B:56:0x0107, B:58:0x010b, B:60:0x0110, B:61:0x0115, B:62:0x0116, B:22:0x0049, B:29:0x007d), top: B:89:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:17:0x0040, B:32:0x00a0, B:34:0x00a6, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00d9, B:46:0x00e1, B:48:0x00ec, B:50:0x00f2, B:52:0x00fc, B:56:0x0107, B:58:0x010b, B:60:0x0110, B:61:0x0115, B:62:0x0116, B:22:0x0049, B:29:0x007d), top: B:89:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /* renamed from: getCoroutineContext */
    public final z74 getC() {
        return ((q2b) ((lzf) this.Z.getValue())).d();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("taskName");
        return strE == null ? "workers:DownloadFileFromWebAppWorker" : strE;
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final long getWorkDelay() {
        return 500L;
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object onStopWork(Continuation continuation) {
        wqi.c("workers:DownloadFileFromWebAppWorker", "File download. OnStopWork", new Object[0]);
        tw0 tw0VarC = c();
        long j = b().a;
        String str = b().c;
        tw0VarC.c(new zv5(j));
        this.w0 = u15.a;
        ctf ctfVar = (ctf) this.o.getValue();
        File file = this.x0;
        if (file == null) {
            file = null;
        }
        ctfVar.a.k(file, null, continuation);
        return qqg.a;
    }
}
