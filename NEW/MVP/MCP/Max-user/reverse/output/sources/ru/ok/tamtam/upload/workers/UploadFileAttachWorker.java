package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.awd;
import defpackage.az5;
import defpackage.b9h;
import defpackage.bn9;
import defpackage.bwf;
import defpackage.c5i;
import defpackage.c6i;
import defpackage.cl9;
import defpackage.cm6;
import defpackage.dkb;
import defpackage.eug;
import defpackage.f7f;
import defpackage.fbj;
import defpackage.fge;
import defpackage.fni;
import defpackage.gvg;
import defpackage.ik3;
import defpackage.ipd;
import defpackage.itg;
import defpackage.jdc;
import defpackage.jm9;
import defpackage.jvg;
import defpackage.kme;
import defpackage.kti;
import defpackage.kvg;
import defpackage.la8;
import defpackage.lv5;
import defpackage.o9g;
import defpackage.pb2;
import defpackage.pdf;
import defpackage.qe6;
import defpackage.qi9;
import defpackage.qw5;
import defpackage.s00;
import defpackage.s8d;
import defpackage.she;
import defpackage.si9;
import defpackage.sl6;
import defpackage.ssa;
import defpackage.t8d;
import defpackage.ttg;
import defpackage.tw0;
import defpackage.ty4;
import defpackage.u0e;
import defpackage.u45;
import defpackage.um9;
import defpackage.v08;
import defpackage.ve2;
import defpackage.vtb;
import defpackage.vvg;
import defpackage.w10;
import defpackage.w63;
import defpackage.wqi;
import defpackage.xi9;
import defpackage.xm9;
import defpackage.y8h;
import defpackage.yni;
import defpackage.yqb;
import defpackage.ytg;
import defpackage.zz;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadFileAttachWorker extends ForegroundWorker {
    public v08 A0;
    public volatile int B0;
    public volatile la8 C0;
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
    public final bwf u0;
    public final bwf v0;
    public final bwf w0;
    public final bwf x0;
    public final bwf y0;
    public final bwf z0;

    public UploadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i2 = 13;
        this.b = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i2) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i3 = 14;
        this.c = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i3) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i4 = 15;
        this.d = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i4) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i5 = 1;
        this.o = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i5) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i6 = 2;
        this.X = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i6) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i7 = 3;
        this.Y = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i7) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i8 = 4;
        this.Z = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i8) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i9 = 5;
        this.s0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i9) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i10 = 6;
        this.t0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i10) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i11 = 7;
        this.u0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i11) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i12 = 8;
        this.v0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i12) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i13 = 9;
        this.w0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i13) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i14 = 10;
        this.x0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i14) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i15 = 11;
        this.y0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i15) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i16 = 12;
        this.z0 = new bwf(new cm6(this) { // from class: uug
            public final /* synthetic */ UploadFileAttachWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i16) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        wo8 wo8Var = new wo8();
                        String strE = inputData.e(ClientCookie.PATH_ATTR);
                        if (strE == null) {
                            strE = "";
                        }
                        wo8Var.b = strE;
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        wo8Var.X = strE2;
                        wo8Var.a = inputData.d("lastModified", 0L);
                        long jD = inputData.d("key.messageId", 0L);
                        long jD2 = inputData.d("key.chatId", 0L);
                        String strE3 = inputData.e("key.attachLocalId");
                        wo8Var.c = new cl9(jD, jD2, strE3 == null ? "" : strE3);
                        String strE4 = inputData.e("uploadType");
                        if (strE4 == null) {
                            strE4 = "";
                        }
                        wo8Var.d = wvg.valueOf(strE4);
                        if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                            String strE5 = inputData.e("messageUpload.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE5 != null ? strE5 : "");
                            u10Var.a = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        wo8Var.o = p2hVar;
                        return new um9(wo8Var);
                    case 1:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 4:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                    case 5:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    case 6:
                        return (duf) ((y4e) this.b.getTamComponent()).getAccessor().c(442);
                    case 7:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 8:
                        return ((y4e) this.b.getTamComponent()).h();
                    case 9:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 10:
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 11:
                        return (ur3) ((y4e) this.b.getTamComponent()).getAccessor().c(139);
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return ((y4e) this.b.getTamComponent()).getAccessor().a(3);
                    case 13:
                        return (bn9) ((y4e) this.b.getTamComponent()).getAccessor().c(270);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (tw0) ((y4e) this.b.getTamComponent()).getAccessor().c(49);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        this.B0 = -1;
    }

    public final um9 b() {
        return (um9) this.a.getValue();
    }

    public final qi9 c() {
        return (qi9) this.d.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        Object ipdVar;
        String string;
        PendingIntent pendingIntentC = c5i.d(getApplicationContext()).c(getId());
        pb2 pb2VarM = ((ve2) this.Y.getValue()).M(b().a.b);
        if (pb2VarM == null) {
            wqi.e("UploadFileAttachWorker", "chat is null in getForegroundInfo!", null);
            h();
            this.C0 = la8.a();
        }
        try {
            ipdVar = new File(b().b).getName();
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = "";
        }
        String strK = u45.k(getApplicationContext().getString(((qw5) this.u0.getValue()).h), " ", (String) ipdVar);
        qw5 qw5Var = (qw5) this.u0.getValue();
        long j = b().a.b;
        if (pb2VarM == null || (string = pb2VarM.s()) == null) {
            string = getApplicationContext().getString(((qw5) this.u0.getValue()).h);
        }
        return new qe6(b().a.hashCode(), qw5Var.b(j, null, null, string, pb2VarM == null ? null : strK, this.B0, true, pendingIntentC), fge.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010e A[PHI: r0
  0x010e: PHI (r0v39 java.lang.Long) = (r0v28 java.lang.Long), (r0v32 java.lang.Long) binds: [B:44:0x010c, B:50:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        pb2 pb2Var;
        f7f f7fVarA;
        wqi.f("UploadFileAttachWorker", "onUploadFailed: %s", b().a, th);
        if (th instanceof HttpErrorException) {
            tw0 tw0Var = (tw0) this.c.getValue();
            long j = b().a.b;
            tw0Var.c(new az5(((HttpErrorException) th).a));
        } else if (th instanceof TamErrorException) {
            ((tw0) this.c.getValue()).c(new vtb(((TamErrorException) th).a));
        }
        this.B0 = -1;
        si9 si9VarM = c().m(b().a.a);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            wqi.e("UploadFileAttachWorker", "failMessageUpload: message is deleted", null);
        } else {
            c().t(si9VarM, xi9.Y);
            c().r(b().a.a, b().a.c, new o9g(26));
            ((tw0) this.c.getValue()).c(new itg(b().a.b, b().a.a, false));
        }
        she.v((c6i) this.o.getValue());
        h();
        ((lv5) this.X.getValue()).a(b().a.a, false);
        this.C0 = la8.a();
        for (b9h b9hVar : (List) this.z0.getValue()) {
            s00 s00VarA = yni.a(b().d);
            long jHashCode = b().b.hashCode();
            long j2 = b().a.a;
            long j3 = b().a.b;
            b9hVar.getClass();
            if (s00VarA == s00.VIDEO_MSG && (pb2Var = (pb2) ((w63) b9hVar.c.getValue()).j(j3).a.getValue()) != null && (f7fVarA = fbj.a(pb2Var)) != null) {
                b9h.a(b9hVar, 4, Long.valueOf(jHashCode), f7fVarA, Long.valueOf(j2), y8h.UPLOAD_ERROR, 0, 96);
            }
        }
    }

    public final void g(xm9 xm9Var) {
        jdc jdcVar;
        wqi.c("UploadFileAttachWorker", "onUploadUpdate %s", xm9Var);
        ttg ttgVar = xm9Var.a;
        vvg vvgVar = ttgVar.g;
        if (ttgVar.a()) {
            wqi.c("UploadFileAttachWorker", "onUploadSuccess: key=%s, messageUploadState=%s", b().a, xm9Var);
            long j = b().a.a;
            String str = b().a.c;
            long j2 = b().a.b;
            c().r(j, str, new eug(xm9Var, 2));
            ((zz) this.x0.getValue()).a(new s8d(j, xm9Var.a.f));
            h();
            ((tw0) this.c.getValue()).c(new itg(j2, j, false));
            she.v((c6i) this.o.getValue());
            this.C0 = la8.b();
            for (b9h b9hVar : (List) this.z0.getValue()) {
                yni.a(b().d);
                b().b.getClass();
                long j3 = b().a.a;
                long j4 = b().a.b;
                b9hVar.getClass();
            }
            return;
        }
        if (vvgVar != vvg.UPLOADING) {
            Throwable th = new Throwable("Internal error. Unknown upload state");
            wqi.g("UploadFileAttachWorker", th, "onUploadUpdate: failed. Unknown upload state. key=%s, state=%s", b().a, xm9Var);
            e(th);
            return;
        }
        wqi.c("UploadFileAttachWorker", "onUploadProgress %s, %s", b(), xm9Var);
        long j5 = b().a.a;
        String str2 = b().a.c;
        long j6 = b().a.b;
        si9 si9VarM = c().m(b().a.a);
        if (si9VarM != null && si9VarM.t0 != jm9.DELETED && (jdcVar = si9VarM.x0) != null && jdcVar.p() > 0) {
            Iterator it = ((List) jdcVar.b).iterator();
            while (it.hasNext()) {
                if (fni.a(((w10) it.next()).r, b().a.c)) {
                    ttg ttgVar2 = xm9Var.a;
                    i(yni.a(ttgVar2.a.c));
                    float f = ttgVar2.e;
                    int i = 0;
                    if (!Float.isNaN(f)) {
                        int iD = kti.d(f);
                        if (iD < 0) {
                            i = -1;
                        } else if (iD != 0) {
                            i = (1 > iD || iD >= 101) ? 100 : iD;
                        }
                    }
                    this.B0 = i;
                    c().r(j5, str2, new ytg(ttgVar2, 2));
                    ((zz) this.x0.getValue()).a(new t8d(j5, ttgVar2.f, ttgVar2.e));
                    ((tw0) this.c.getValue()).c(new itg(j6, j5, false));
                    return;
                }
            }
        }
        wqi.o("UploadFileAttachWorker", null, "cancelUploadIfMessageIsDeleted: message or attach is deleted %s", Arrays.copyOf(new Object[]{b()}, 1));
        h();
        this.C0 = la8.a();
        yqb.e(kvg.g, jvg.ATTACH_OR_MSG_DELETED, b().f);
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* renamed from: getName */
    public final String getG0() {
        String strE = getInputData().e("workName");
        return strE == null ? "UploadFileAttachWorker" : strE;
    }

    public final void h() {
        wqi.c("UploadFileAttachWorker", "removeUpload %s", b());
        wqi.c("UploadFileAttachWorker", "stopTyping %s", b());
        pb2 pb2VarM = ((ve2) this.Y.getValue()).M(b().a.b);
        if (pb2VarM != null) {
            dkb dkbVar = (dkb) this.Z.getValue();
            long j = pb2VarM.b.a;
            long j2 = b().a.a;
            dkbVar.getClass();
            dkb.b(j, j2);
        }
        v08 v08Var = this.A0;
        if (v08Var != null) {
            ty4.a(v08Var);
        }
        try {
            bn9 bn9Var = (bn9) this.b.getValue();
            cl9 cl9Var = b().a;
            new ik3(bn9Var.b(), 2, new sl6(29, cl9Var)).a();
            wqi.c("UploadFileAttachWorker", "removeUploadFromStorage: success %s", b());
        } catch (Throwable th) {
            wqi.e("UploadFileAttachWorker", "removeUploadFromStorage failure", th);
        }
    }

    public final void i(s00 s00Var) {
        wqi.c("UploadFileAttachWorker", "sendTyping %s", b());
        pb2 pb2VarM = ((ve2) this.Y.getValue()).M(b().a.b);
        if (pb2VarM == null) {
            return;
        }
        ((dkb) this.Z.getValue()).f(pb2VarM.b.a, s00Var, b().a.a);
    }

    public final void j() {
        wqi.c("UploadFileAttachWorker", "startUpload", new Object[0]);
        s00 s00VarA = yni.a(b().d);
        if (s00VarA == s00.UNKNOWN) {
            e(new Throwable("Internal error. Unknown attach type for upload type"));
            return;
        }
        i(s00VarA);
        ssa ssaVarL = ((gvg) this.s0.getValue()).a(b()).l(u0e.d);
        v08 v08Var = new v08(new awd(6, this), new kme(7, this), pdf.d);
        ssaVarL.a(v08Var);
        this.A0 = v08Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.q44 r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.k(q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x005d: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:26:0x005d */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:16:0x003e, B:47:0x00c9, B:49:0x00cd, B:53:0x00e9, B:56:0x0109, B:57:0x010f, B:59:0x012b, B:63:0x013e, B:68:0x015a, B:72:0x0172, B:78:0x01a2, B:80:0x01a6, B:75:0x017c, B:77:0x0184, B:36:0x008d, B:46:0x00c0), top: B:90:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a A[Catch: all -> 0x0044, PHI: r4 r5 r14 r16
  0x015a: PHI (r4v6 ru.ok.tamtam.upload.workers.UploadFileAttachWorker) = 
  (r4v8 ru.ok.tamtam.upload.workers.UploadFileAttachWorker)
  (r4v29 ru.ok.tamtam.upload.workers.UploadFileAttachWorker)
  (r4v30 ru.ok.tamtam.upload.workers.UploadFileAttachWorker)
 binds: [B:67:0x0154, B:58:0x0129, B:50:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x015a: PHI (r5v0 long) = (r5v1 long), (r5v2 long), (r5v4 long) binds: [B:67:0x0154, B:58:0x0129, B:50:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x015a: PHI (r14v0 long) = (r14v2 long), (r14v5 long), (r14v7 long) binds: [B:67:0x0154, B:58:0x0129, B:50:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x015a: PHI (r16v1 long) = (r16v2 long), (r16v4 long), (r16v6 long) binds: [B:67:0x0154, B:58:0x0129, B:50:0x00e3] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0044, blocks: (B:16:0x003e, B:47:0x00c9, B:49:0x00cd, B:53:0x00e9, B:56:0x0109, B:57:0x010f, B:59:0x012b, B:63:0x013e, B:68:0x015a, B:72:0x0172, B:78:0x01a2, B:80:0x01a6, B:75:0x017c, B:77:0x0184, B:36:0x008d, B:46:0x00c0), top: B:90:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13, types: [ru.ok.tamtam.upload.workers.ForegroundWorker, ru.ok.tamtam.upload.workers.UploadFileAttachWorker] */
    /* JADX WARN: Type inference failed for: r4v14, types: [ru.ok.tamtam.upload.workers.UploadFileAttachWorker] */
    /* JADX WARN: Type inference failed for: r4v22, types: [ru.ok.tamtam.upload.workers.UploadFileAttachWorker] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.l(q44):java.lang.Object");
    }
}
