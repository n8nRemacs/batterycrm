package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bwd;
import defpackage.bwf;
import defpackage.c5i;
import defpackage.c6i;
import defpackage.cm6;
import defpackage.e35;
import defpackage.fge;
import defpackage.gvg;
import defpackage.ik3;
import defpackage.ipd;
import defpackage.j0e;
import defpackage.kpd;
import defpackage.la8;
import defpackage.lv5;
import defpackage.n35;
import defpackage.p3b;
import defpackage.pb2;
import defpackage.pdf;
import defpackage.q3b;
import defpackage.qe6;
import defpackage.qqg;
import defpackage.qw5;
import defpackage.s00;
import defpackage.she;
import defpackage.ssa;
import defpackage.um9;
import defpackage.usd;
import defpackage.v08;
import defpackage.ve2;
import defpackage.vgd;
import defpackage.wo8;
import defpackage.wqi;
import defpackage.wvg;
import defpackage.zkb;
import java.io.IOException;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadDraftMediaWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadDraftMediaWorker extends ForegroundWorker {
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
    public v08 v0;
    public volatile int w0;
    public volatile la8 x0;

    public UploadDraftMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i2 = 4;
        this.b = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i2) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i3 = 5;
        this.c = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i3) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i4 = 6;
        this.d = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i4) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i5 = 7;
        this.o = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i5) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i6 = 8;
        this.X = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i6) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i7 = 9;
        this.Y = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i7) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i8 = 10;
        this.Z = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i8) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i9 = 1;
        this.s0 = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i9) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i10 = 2;
        this.t0 = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i10) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        final int i11 = 3;
        this.u0 = new bwf(new cm6(this) { // from class: dug
            public final /* synthetic */ UploadDraftMediaWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                p2h p2hVar;
                switch (i11) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE = inputData.e("attachLocalId");
                        if (strE == null) {
                            strE = "";
                        }
                        y25 y25Var = new y25(jD, strE);
                        String strE2 = inputData.e("draft.path");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("draft.lastModified", 0L);
                        String strE3 = inputData.e("draft.uploadType");
                        if (strE3 == null) {
                            strE3 = "";
                        }
                        wvg wvgVarValueOf = wvg.valueOf(strE3);
                        if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                            u10 u10Var = new u10(2);
                            u10Var.d = inputData.b("draft.videoConvertOptions.mute", false);
                            String strE4 = inputData.e("draft.videoConvertOptions.quality");
                            u10Var.c = gsc.valueOf(strE4 != null ? strE4 : "");
                            u10Var.a = inputData.c("draft.videoConvertOptions.startTrimPosition");
                            u10Var.b = inputData.c("draft.videoConvertOptions.endTrimPosition");
                            p2hVar = new p2h(u10Var);
                        } else {
                            p2hVar = null;
                        }
                        return new e35(y25Var, strE2, jD2, wvgVarValueOf, p2hVar);
                    case 1:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 2:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 3:
                        return ((y4e) this.b.getTamComponent()).j();
                    case 4:
                        return (n35) ((y4e) this.b.getTamComponent()).getAccessor().c(271);
                    case 5:
                        return (c6i) ((y4e) this.b.getTamComponent()).getAccessor().c(186);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 7:
                        return (q3b) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_REQUEST_TIMEOUT);
                    case 8:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 9:
                        return (gvg) ((y4e) this.b.getTamComponent()).getAccessor().c(358);
                    default:
                        m0g m0gVar = (m0g) ((y4e) this.b.getTamComponent()).getAccessor().c(HttpStatus.SC_FORBIDDEN);
                        m0gVar.getClass();
                        return ((n0g) m0gVar).a();
                }
            }
        });
        this.w0 = -1;
    }

    public final ve2 b() {
        return (ve2) this.d.getValue();
    }

    public final e35 c() {
        return (e35) this.a.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        String string;
        PendingIntent pendingIntentC = c5i.d(getApplicationContext()).c(getId());
        pb2 pb2VarM = b().M(c().a.a);
        if (pb2VarM == null) {
            i();
        }
        qw5 qw5Var = (qw5) this.s0.getValue();
        long j = c().a.a;
        if (pb2VarM == null || (string = pb2VarM.s()) == null) {
            string = getApplicationContext().getString(((qw5) this.s0.getValue()).f);
        }
        return new qe6(c().a.hashCode(), qw5Var.b(j, null, null, string, pb2VarM == null ? null : getApplicationContext().getString(((qw5) this.s0.getValue()).f), this.w0, true, pendingIntentC), fge.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[Catch: all -> 0x0038, PHI: r2 r5
  0x0081: PHI (r2v6 ru.ok.tamtam.upload.workers.UploadDraftMediaWorker) = 
  (r2v2 ru.ok.tamtam.upload.workers.UploadDraftMediaWorker)
  (r2v3 ru.ok.tamtam.upload.workers.UploadDraftMediaWorker)
  (r2v10 ru.ok.tamtam.upload.workers.UploadDraftMediaWorker)
 binds: [B:37:0x007e, B:51:0x00d0, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r5v11 ??) = (r5v17 ??), (r5v18 ??), (r5v19 ??) binds: [B:37:0x007e, B:51:0x00d0, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0034, B:38:0x0081, B:40:0x0085, B:42:0x009d, B:50:0x00c2, B:53:0x00d3, B:55:0x00d7, B:22:0x0047, B:30:0x005e, B:37:0x007e), top: B:75:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0034, B:38:0x0081, B:40:0x0085, B:42:0x009d, B:50:0x00c2, B:53:0x00d3, B:55:0x00d7, B:22:0x0047, B:30:0x005e, B:37:0x007e), top: B:75:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0034, B:38:0x0081, B:40:0x0085, B:42:0x009d, B:50:0x00c2, B:53:0x00d3, B:55:0x00d7, B:22:0x0047, B:30:0x005e, B:37:0x007e), top: B:75:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ru.ok.tamtam.upload.workers.UploadDraftMediaWorker] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d0 -> B:38:0x0081). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadDraftMediaWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        wqi.e("UploadDraftMediaWorker", "onUploadFailed: draftMediaUploadKey = " + c().a, th);
        wqi.e("UploadDraftMediaWorker", "failDraftUpload: key = " + c().a, null);
        pb2 pb2VarM = b().M(c().a.a);
        if (pb2VarM == null) {
            wqi.e("UploadDraftMediaWorker", "failDraftUpload: chat is null", null);
        } else {
            p3b p3bVar = pb2VarM.b.c0;
            if (p3bVar == null) {
                wqi.e("UploadDraftMediaWorker", "failDraftUpload: draft is null", null);
            } else {
                ((q3b) this.o.getValue()).a(p3bVar);
                ve2 ve2VarB = b();
                long j = pb2VarM.a;
                Long lB = p3bVar.b();
                ve2VarB.u(j, lB != null ? lB.longValue() : 0L, p3bVar);
                she.v((c6i) this.c.getValue());
            }
        }
        g();
        ((lv5) this.t0.getValue()).b(c().a.a);
        this.x0 = la8.a();
    }

    public final void g() {
        Object ipdVar;
        try {
            new ik3(((n35) this.b.getValue()).a(), 2, new usd(16, c().a)).a();
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            wqi.c("UploadDraftMediaWorker", "removeUploadFromStorage: success for key = " + c().a, new Object[0]);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if ((thA instanceof SecurityException) || (thA instanceof IllegalStateException) || (thA instanceof IOException)) {
                wqi.e("UploadDraftMediaWorker", "removeUploadFromStorage: failed for key = " + c().a, thA);
                return;
            }
            wqi.e("UploadDraftMediaWorker", "removeUploadFromStorage: failed (unexpected) for key = " + c().a, thA);
        }
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* renamed from: getName */
    public final String getG0() {
        String strE = getInputData().e("workName");
        return strE == null ? "UploadDraftMediaWorker" : strE;
    }

    public final void h() {
        s00 s00Var;
        wqi.c("UploadDraftMediaWorker", "startUpload: draftUpload = " + c(), new Object[0]);
        wvg wvgVar = c().d;
        wvgVar.getClass();
        switch (wvgVar.ordinal()) {
            case 0:
                s00Var = s00.UNKNOWN;
                break;
            case 1:
            case 8:
                s00Var = s00.VIDEO;
                break;
            case 2:
            case 6:
                s00Var = s00.PHOTO;
                break;
            case 3:
            default:
                s00Var = s00.UNKNOWN;
                break;
            case 4:
                s00Var = s00.FILE;
                break;
            case 5:
                s00Var = s00.AUDIO;
                break;
            case 7:
                s00Var = s00.STICKER;
                break;
        }
        if (s00Var == s00.UNKNOWN) {
            e(new IllegalStateException("Internal error. Unknown attach type for upload type"));
            return;
        }
        wo8 wo8Var = new wo8();
        wo8Var.o = c().e;
        wo8Var.b = c().b;
        wo8Var.d = c().d;
        wo8Var.a = c().c;
        wo8Var.X = c().a.b;
        ssa ssaVarL = ((gvg) this.Y.getValue()).a(new um9(wo8Var)).l((j0e) this.Z.getValue());
        v08 v08Var = new v08(new vgd(9, this), new zkb(11, this), pdf.d);
        ssaVarL.a(v08Var);
        this.v0 = v08Var;
    }

    public final void i() {
        wqi.c("UploadDraftMediaWorker", "cancel: key =" + c().a, new Object[0]);
        bwd.b(this.v0);
        g();
        wqi.c("UploadDraftMediaWorker", "cancel: finished for key = " + c().a.b, new Object[0]);
        this.x0 = la8.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.hug
            if (r0 == 0) goto L13
            r0 = r5
            hug r0 = (defpackage.hug) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            hug r0 = new hug
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r5)
            goto L4f
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.g8j.b(r5)
            bwf r5 = r4.u0
            java.lang.Object r5 = r5.getValue()
            lzf r5 = (defpackage.lzf) r5
            q2b r5 = (defpackage.q2b) r5
            z74 r5 = r5.b()
            iug r1 = new iug
            r3 = 0
            r1.<init>(r4, r3)
            r0.X = r2
            java.lang.Object r5 = defpackage.svi.i(r5, r1, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L4f
            return r0
        L4f:
            kpd r5 = (defpackage.kpd) r5
            java.lang.Object r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadDraftMediaWorker.j(q44):java.lang.Object");
    }
}
