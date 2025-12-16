package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.bna;
import defpackage.bs4;
import defpackage.bwf;
import defpackage.cm6;
import defpackage.fge;
import defpackage.fvd;
import defpackage.kti;
import defpackage.n7j;
import defpackage.qe6;
import defpackage.qqg;
import defpackage.qw5;
import defpackage.su7;
import defpackage.wqi;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadAttachesWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "l9j", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadAttachesWorker extends ForegroundWorker {
    public final bwf A0;
    public final CopyOnWriteArrayList B0;
    public volatile int C0;
    public final ConcurrentHashMap D0;
    public CharSequence E0;
    public int F0;
    public final String G0;
    public final bwf H0;
    public final bwf I0;
    public final bwf X;
    public final bwf Y;
    public final bwf Z;
    public final long a;
    public final long b;
    public final String c;
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

    public DownloadAttachesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1L);
        this.b = getInputData().d("messageId", -1L);
        this.c = getInputData().e("attachLocalId");
        final int i = 0;
        this.d = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i2 = 13;
        this.o = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i3 = 14;
        this.X = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i4 = 15;
        this.Y = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i5 = 1;
        this.Z = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i6 = 2;
        this.s0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i7 = 3;
        this.t0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i8 = 4;
        this.u0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i9 = 5;
        this.v0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i10 = 6;
        this.w0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i11 = 7;
        this.x0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i12 = 8;
        this.y0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i13 = 9;
        this.z0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i14 = 10;
        this.A0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        this.B0 = new CopyOnWriteArrayList();
        this.D0 = new ConcurrentHashMap();
        this.E0 = "";
        this.F0 = fvd.f;
        this.G0 = "worker:multi-attaches-downloader";
        final int i15 = 11;
        this.H0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
        final int i16 = 12;
        this.I0 = new bwf(new cm6(this) { // from class: yz4
            public final /* synthetic */ DownloadAttachesWorker b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return (w63) ((y4e) this.b.getTamComponent()).getAccessor().c(109);
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
                        return (zz) ((y4e) this.b.getTamComponent()).getAccessor().c(390);
                    case 10:
                        y4e y4eVar = (y4e) this.b.getTamComponent();
                        y4eVar.getClass();
                        return new sxd((d1e) y4eVar.getAccessor().c(443), ((q2b) ((lzf) y4eVar.getAccessor().c(8))).b(), (vob) y4eVar.getAccessor().c(444));
                    case 11:
                        DownloadAttachesWorker downloadAttachesWorker = this.b;
                        return c5i.d(downloadAttachesWorker.getApplicationContext()).c(downloadAttachesWorker.getId());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        DownloadAttachesWorker downloadAttachesWorker2 = this.b;
                        return Integer.valueOf((((int) (downloadAttachesWorker2.a ^ downloadAttachesWorker2.b)) * 31) + 948410367);
                    case 13:
                        return ((y4e) this.b.getTamComponent()).e();
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return (qx5) ((y4e) this.b.getTamComponent()).getAccessor().c(137);
                    default:
                        return (qi9) ((y4e) this.b.getTamComponent()).getAccessor().c(143);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ru.ok.tamtam.upload.workers.DownloadAttachesWorker r4, defpackage.w10 r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.j05
            if (r0 == 0) goto L13
            r0 = r6
            j05 r0 = (defpackage.j05) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            j05 r0 = new j05
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            w10 r5 = r0.o
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r4 = r0.d
            defpackage.g8j.b(r6)
            goto L55
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.g8j.b(r6)
            bwf r6 = r4.A0
            java.lang.Object r6 = r6.getValue()
            sxd r6 = (defpackage.sxd) r6
            k10 r1 = r5.b
            java.lang.String r1 = r1.a()
            k10 r3 = r5.b
            boolean r3 = r3.o
            r0.d = r4
            r0.o = r5
            r0.Z = r2
            java.lang.Object r6 = r6.b(r1, r3, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L55
            return r0
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L73
            java.util.concurrent.ConcurrentHashMap r4 = r4.D0
            k10 r5 = r5.b
            long r5 = r5.Z
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            java.lang.Float r5 = new java.lang.Float
            r6 = 1120403456(0x42c80000, float:100.0)
            r5.<init>(r6)
            r4.put(r0, r5)
            goto L88
        L73:
            java.util.concurrent.ConcurrentHashMap r4 = r4.D0
            k10 r5 = r5.b
            long r5 = r5.Z
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            java.lang.Float r5 = new java.lang.Float
            r6 = 0
            r5.<init>(r6)
            r4.put(r0, r5)
            r2 = 0
        L88:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadAttachesWorker.b(ru.ok.tamtam.upload.workers.DownloadAttachesWorker, w10, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.w10 r34, defpackage.si9 r35, defpackage.q44 r36) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadAttachesWorker.c(w10, si9, q44):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public final Object createForegroundInfo(Continuation continuation) {
        int i;
        Iterator it = this.D0.values().iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        int i2 = 100;
        String string = (this.B0.isEmpty() || this.C0 != 1) ? (this.B0.isEmpty() || this.C0 <= 0) ? getApplicationContext().getString(fvd.e) : getApplicationContext().getString(this.F0, new Integer(n7j.c(((int) (fFloatValue / 100)) + 1, 1, this.B0.size())), new Integer(this.B0.size())) : getApplicationContext().getString(this.F0);
        float f = (this.B0.isEmpty() || fFloatValue <= 0.0f || this.C0 == 0) ? -1.0f : fFloatValue / this.C0;
        wqi.m("worker:multi-attaches-downloader", "createForegroundInfo: progress=" + fFloatValue + ", fileProcessCounter=" + this.C0 + ", finalProgress=" + f, new Object[0]);
        qw5 qw5Var = (qw5) this.o.getValue();
        long j = this.a;
        Long l = new Long(this.b);
        CharSequence charSequence = this.E0;
        if (Float.isNaN(f)) {
            i = 0;
        } else {
            int iD = kti.d(f);
            if (iD < 0) {
                i2 = -1;
            } else if (iD == 0) {
                i2 = 0;
            } else if (1 <= iD && iD < 101) {
                i2 = iD;
            }
            i = i2;
        }
        return new qe6(((Number) this.I0.getValue()).intValue(), qw5Var.b(j, null, l, charSequence, string, i, false, (PendingIntent) this.H0.getValue()), fge.a);
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
            boolean r0 = r5 instanceof defpackage.a05
            if (r0 == 0) goto L13
            r0 = r5
            a05 r0 = (defpackage.a05) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L1a
        L13:
            a05 r0 = new a05
            q44 r5 = (defpackage.q44) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.g8j.b(r5)
            return r5
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.g8j.b(r5)
            c05 r5 = new c05
            r1 = 0
            r5.<init>(r4, r1)
            r0.X = r2
            java.lang.Object r5 = defpackage.d7j.d(r5, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L43
            return r0
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadAttachesWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.w10 r46, defpackage.si9 r47, defpackage.q44 r48) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadAttachesWorker.e(w10, si9, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r11.updateForeground(r0) != r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.w10 r10, defpackage.si9 r11, defpackage.q44 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.n05
            if (r0 == 0) goto L13
            r0 = r12
            n05 r0 = (defpackage.n05) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            n05 r0 = new n05
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            r4 = 0
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            defpackage.g8j.b(r12)
            goto Lb0
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            f10 r10 = r0.o
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r11 = r0.d
            defpackage.g8j.b(r12)
            goto L76
        L3c:
            defpackage.g8j.b(r12)
            f10 r12 = r10.j
            if (r12 != 0) goto L48
            ia8 r10 = defpackage.la8.a()
            return r10
        L48:
            java.lang.String r1 = r10.s
            if (r1 == 0) goto L62
            int r6 = r1.length()
            if (r6 <= 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            if (r1 == 0) goto L62
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            boolean r1 = r6.exists()
            if (r1 == 0) goto L62
            goto L63
        L62:
            r6 = r4
        L63:
            if (r6 != 0) goto L82
            r0.d = r9
            r0.o = r12
            r0.Z = r3
            java.lang.Object r10 = r9.c(r10, r11, r0)
            if (r10 != r5) goto L72
            goto Laf
        L72:
            r11 = r12
            r12 = r10
            r10 = r11
            r11 = r9
        L76:
            r6 = r12
            java.io.File r6 = (java.io.File) r6
            if (r6 != 0) goto L80
            ia8 r10 = defpackage.la8.a()
            return r10
        L80:
            r12 = r10
            goto L83
        L82:
            r11 = r9
        L83:
            bwf r10 = r11.t0
            java.lang.Object r10 = r10.getValue()
            u6b r10 = (defpackage.u6b) r10
            long r7 = r12.a
            r10.c(r6)
            java.util.concurrent.ConcurrentHashMap r10 = r11.D0
            long r6 = r12.a
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r6)
            java.lang.Float r1 = new java.lang.Float
            r3 = 1120403456(0x42c80000, float:100.0)
            r1.<init>(r3)
            r10.put(r12, r1)
            r0.d = r4
            r0.o = r4
            r0.Z = r2
            java.lang.Object r10 = r11.updateForeground(r0)
            if (r10 != r5) goto Lb0
        Laf:
            return r5
        Lb0:
            ka8 r10 = defpackage.la8.b()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadAttachesWorker.g(w10, si9, q44):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* renamed from: getName, reason: from getter */
    public final String getG0() {
        return this.G0;
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object onStopWork(Continuation continuation) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.B0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((su7) ((bs4) it.next())).cancel((CancellationException) null);
        }
        copyOnWriteArrayList.clear();
        this.D0.clear();
        bna bnaVar = new bna(getApplicationContext());
        bnaVar.b.cancel(null, ((Number) this.I0.getValue()).intValue());
        return qqg.a;
    }
}
