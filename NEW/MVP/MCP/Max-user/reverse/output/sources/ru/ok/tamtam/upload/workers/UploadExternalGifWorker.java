package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.c5i;
import defpackage.cm6;
import defpackage.dkb;
import defpackage.fge;
import defpackage.imb;
import defpackage.iz5;
import defpackage.lug;
import defpackage.mw5;
import defpackage.oug;
import defpackage.pb2;
import defpackage.pbj;
import defpackage.pug;
import defpackage.q97;
import defpackage.qe6;
import defpackage.qw5;
import defpackage.qx5;
import defpackage.s00;
import defpackage.sug;
import defpackage.ue6;
import defpackage.ve2;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadExternalGifWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "pug", "lug", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadExternalGifWorker extends ForegroundWorker {
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
    public long x0;
    public volatile pug y0;
    public final sug z0;

    public UploadExternalGifWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        final int i = 0;
        this.a = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i2 = 7;
        this.b = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i2) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i3 = 8;
        this.c = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i3) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i4 = 9;
        this.d = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i4) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i5 = 10;
        this.o = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i5) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i6 = 11;
        this.X = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i6) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i7 = 12;
        this.Y = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i7) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i8 = 1;
        this.Z = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i8) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i9 = 2;
        this.s0 = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i9) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i10 = 3;
        this.t0 = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i10) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i11 = 4;
        this.u0 = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i11) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i12 = 5;
        this.v0 = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i12) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        final int i13 = 6;
        this.w0 = new bwf(new cm6(this) { // from class: jug
            public final /* synthetic */ UploadExternalGifWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                String str;
                String str2;
                long j;
                String str3;
                long j2;
                long j3;
                switch (i13) {
                    case 0:
                        yd4 inputData = this.b.getInputData();
                        long jD = inputData.d("requestId", 0L);
                        String strE = inputData.e("externalUrl");
                        if (strE == null) {
                            strE = "";
                        }
                        String strE2 = inputData.e("attachLocalId");
                        if (strE2 == null) {
                            strE2 = "";
                        }
                        long jD2 = inputData.d("messageId", 0L);
                        long jD3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0L);
                        String strE3 = inputData.e("stickerId");
                        if (strE3 == null) {
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            str = "";
                            j3 = jD3;
                            j2 = jD2;
                        } else {
                            str = strE3;
                            str2 = strE;
                            j = jD;
                            str3 = strE2;
                            j2 = jD2;
                            j3 = jD3;
                        }
                        return new lug(j, str2, str3, j2, j3, str);
                    case 1:
                        return (a3g) ((y4e) this.b.getTamComponent()).getAccessor().c(170);
                    case 2:
                        return (u6b) ((y4e) this.b.getTamComponent()).getAccessor().c(399);
                    case 3:
                        return (mw5) ((y4e) this.b.getTamComponent()).getAccessor().c(357);
                    case 4:
                        return (lv5) ((y4e) this.b.getTamComponent()).getAccessor().c(237);
                    case 5:
                        return (yi5) ((y4e) this.b.getTamComponent()).getAccessor().c(9);
                    case 6:
                        return ((y4e) this.b.getTamComponent()).e();
                    case 7:
                        return Integer.valueOf(this.b.c().hashCode());
                    case 8:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    case 9:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                    case 10:
                        return ((y4e) this.b.getTamComponent()).c();
                    case 11:
                        return (q97) ((y4e) this.b.getTamComponent()).getAccessor().c(418);
                    default:
                        return (dkb) ((y4e) this.b.getTamComponent()).getAccessor().c(216);
                }
            }
        });
        this.z0 = new sug(this);
    }

    public static final void b(UploadExternalGifWorker uploadExternalGifWorker) {
        pb2 pb2VarM = ((ve2) uploadExternalGifWorker.o.getValue()).M(uploadExternalGifWorker.c().e);
        if (pb2VarM != null) {
            dkb dkbVar = (dkb) uploadExternalGifWorker.Y.getValue();
            long j = pb2VarM.b.a;
            long j2 = uploadExternalGifWorker.c().d;
            dkbVar.getClass();
            dkb.b(j, j2);
        }
        ((mw5) uploadExternalGifWorker.t0.getValue()).b(((iz5) ((qx5) uploadExternalGifWorker.c.getValue())).l(uploadExternalGifWorker.c().f));
    }

    public final lug c() {
        return (lug) this.a.getValue();
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        imb imbVar;
        String strS;
        pug pugVar = this.y0;
        if (pugVar instanceof oug) {
            oug ougVar = (oug) pugVar;
            imbVar = new imb(new ue6(ougVar.a), new Long(ougVar.b));
        } else {
            imbVar = new imb(new ue6(-1), new Long(0L));
        }
        int i = ((ue6) imbVar.a).a;
        long jLongValue = ((Number) imbVar.b).longValue();
        PendingIntent pendingIntentC = c5i.d(getApplicationContext()).c(getId());
        pb2 pb2VarM = ((ve2) this.o.getValue()).M(c().e);
        qw5 qw5Var = (qw5) this.w0.getValue();
        long j = c().e;
        Long l = new Long(jLongValue);
        Long l2 = new Long(c().d);
        if (pb2VarM == null || (strS = pb2VarM.s()) == null) {
            strS = "";
        }
        return new qe6(((Number) this.b.getValue()).intValue(), qw5Var.b(j, l, l2, strS, getApplicationContext().getString(((qw5) this.w0.getValue()).g), i, false, pendingIntentC), fge.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qug
            if (r0 == 0) goto L13
            r0 = r5
            qug r0 = (defpackage.qug) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            qug r0 = new qug
            q44 r5 = (defpackage.q44) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            java.lang.String r3 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker"
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            defpackage.g8j.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r5 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.g8j.b(r5)
            java.lang.String r5 = "doWork"
            defpackage.wqi.d(r3, r5)
            r4.g()     // Catch: java.lang.Throwable -> L29
            r0.X = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.h(r0)     // Catch: java.lang.Throwable -> L29
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L49
            return r0
        L49:
            la8 r5 = (defpackage.la8) r5     // Catch: java.lang.Throwable -> L29
            goto L52
        L4c:
            ipd r0 = new ipd
            r0.<init>(r5)
            r5 = r0
        L52:
            java.lang.Throwable r0 = defpackage.kpd.a(r5)
            if (r0 == 0) goto L7b
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L62
            java.lang.String r1 = "Cancelled"
            defpackage.wqi.e(r3, r1, r0)
            goto L7b
        L62:
            boolean r1 = r0 instanceof java.lang.SecurityException
            if (r1 == 0) goto L6c
            java.lang.String r1 = "Security exception"
            defpackage.wqi.e(r3, r1, r0)
            goto L7b
        L6c:
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            if (r1 == 0) goto L76
            java.lang.String r1 = "Illegal state"
            defpackage.wqi.e(r3, r1, r0)
            goto L7b
        L76:
            java.lang.String r1 = "Unexpected error"
            defpackage.wqi.e(r3, r1, r0)
        L7b:
            java.lang.Throwable r0 = defpackage.kpd.a(r5)
            if (r0 != 0) goto L82
            goto L86
        L82:
            ia8 r5 = defpackage.la8.a()
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pug r8, defpackage.q44 r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.e(pug, q44):java.lang.Object");
    }

    public final void g() throws Throwable {
        pb2 pb2VarM = ((ve2) this.o.getValue()).M(c().e);
        if (pb2VarM != null) {
            ((dkb) this.Y.getValue()).f(pb2VarM.b.a, s00.PHOTO, c().d);
        }
        File fileL = ((iz5) ((qx5) this.c.getValue())).l(c().f);
        boolean zB = pbj.b(fileL);
        sug sugVar = this.z0;
        if (zB) {
            sugVar.f(fileL);
        } else {
            ((q97) this.X.getValue()).b(c().b, fileL, sugVar, c().f);
        }
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final String getName() {
        String strE = getInputData().e("taskName");
        return strE == null ? "ru.ok.tamtam.upload.workers.UploadExternalGifWorker" : strE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (defpackage.s8j.c(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008d -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.h(q44):java.lang.Object");
    }
}
