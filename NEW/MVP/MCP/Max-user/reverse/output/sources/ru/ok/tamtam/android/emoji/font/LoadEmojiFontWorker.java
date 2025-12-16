package ru.ok.tamtam.android.emoji.font;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.WorkerParameters;
import defpackage.bwf;
import defpackage.c5i;
import defpackage.db5;
import defpackage.eb5;
import defpackage.fge;
import defpackage.fr7;
import defpackage.g5i;
import defpackage.ivd;
import defpackage.k18;
import defpackage.mb8;
import defpackage.mvd;
import defpackage.n7;
import defpackage.nla;
import defpackage.ob8;
import defpackage.qb8;
import defpackage.qe6;
import defpackage.v4j;
import defpackage.wqi;
import defpackage.x7b;
import defpackage.y4e;
import defpackage.zka;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0094@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\f\u0010\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/tamtam/android/emoji/font/LoadEmojiFontWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lla8;", "doForegroundWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqe6;", "createForegroundInfo", "Leb5;", "emojiFontLoadingNotifications$delegate", "Lk18;", "getEmojiFontLoadingNotifications", "()Leb5;", "emojiFontLoadingNotifications", "Lqb8;", "state", "Lqb8;", "", "getName", "()Ljava/lang/String;", SdkMetricStatEvent.NAME_KEY, "Companion", "mb8", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoadEmojiFontWorker extends ForegroundWorker {
    public static final mb8 Companion = new mb8();
    public static final String TAG = "LoadEmojiFontWorker";
    public static final String WAITING_FOR_WIFI = "waiting_for_wifi";

    /* renamed from: emojiFontLoadingNotifications$delegate, reason: from kotlin metadata */
    private final k18 emojiFontLoadingNotifications;
    private volatile qb8 state;

    public LoadEmojiFontWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.emojiFontLoadingNotifications = new bwf(new fr7(7, this));
        this.state = new ob8(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eb5 emojiFontLoadingNotifications_delegate$lambda$0(LoadEmojiFontWorker loadEmojiFontWorker) {
        return (eb5) ((y4e) loadEmojiFontWorker.getTamComponent()).f().k.getValue();
    }

    private final eb5 getEmojiFontLoadingNotifications() {
        return (eb5) this.emojiFontLoadingNotifications.getValue();
    }

    public static final void start(g5i g5iVar) {
        Companion.getClass();
        mb8.a(g5iVar, false);
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public Object createForegroundInfo(Continuation<? super qe6> continuation) {
        qb8 qb8Var = this.state;
        ob8 ob8Var = qb8Var instanceof ob8 ? (ob8) qb8Var : null;
        int i = ob8Var != null ? ob8Var.a : -1;
        PendingIntent pendingIntentC = c5i.d(getApplicationContext()).c(getId());
        eb5 emojiFontLoadingNotifications = getEmojiFontLoadingNotifications();
        db5 db5Var = emojiFontLoadingNotifications.f;
        Context context = emojiFontLoadingNotifications.b;
        x7b x7bVar = emojiFontLoadingNotifications.c;
        n7 n7Var = emojiFontLoadingNotifications.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = n7Var.a;
        if (j == 0 || jCurrentTimeMillis - j > 1000) {
            n7Var.a = jCurrentTimeMillis;
            wqi.c("eb5", "getEmojiFontLoadingNotification: progress = %d", Integer.valueOf(i));
        }
        x7bVar.c();
        PendingIntent pendingIntentB = v4j.b(context, 11, x7bVar.f(false));
        emojiFontLoadingNotifications.e.getClass();
        nla nlaVarH = x7bVar.h("ru.oneme.app.fileUpload", true, true);
        Notification notification = nlaVarH.F;
        db5Var.getClass();
        nlaVarH.e = nla.c(context.getString(mvd.V));
        emojiFontLoadingNotifications.d.getClass();
        notification.icon = ivd.P0;
        boolean z = i == -1;
        nlaVarH.o = 100;
        nlaVarH.p = i;
        nlaVarH.q = z;
        nlaVarH.k = 0;
        nlaVarH.e(0);
        nlaVarH.h(null);
        nlaVarH.f(16, false);
        nlaVarH.v = "progress";
        notification.when = 0L;
        nlaVarH.f(2, true);
        nlaVarH.b.add(new zka(0, context.getString(mvd.p), pendingIntentC));
        nlaVarH.g = pendingIntentB;
        Notification notificationA = nlaVarH.a();
        getEmojiFontLoadingNotifications().getClass();
        return new qe6(11, notificationA, fge.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        if (defpackage.s8j.c(r11, r0) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x0095, B:35:0x009e], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:35:0x009e, B:33:0x0095], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:31:0x008f, B:33:0x0095, B:61:0x0133, B:63:0x0139, B:65:0x013f, B:35:0x009e, B:37:0x00a4, B:39:0x00ae, B:41:0x00b2, B:43:0x00cf, B:47:0x00e4, B:55:0x0111, B:57:0x0115, B:59:0x0122, B:60:0x0129, B:67:0x0149, B:68:0x014e, B:24:0x0058), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:31:0x008f, B:33:0x0095, B:61:0x0133, B:63:0x0139, B:65:0x013f, B:35:0x009e, B:37:0x00a4, B:39:0x00ae, B:41:0x00b2, B:43:0x00cf, B:47:0x00e4, B:55:0x0111, B:57:0x0115, B:59:0x0122, B:60:0x0129, B:67:0x0149, B:68:0x014e, B:24:0x0058), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:31:0x008f, B:33:0x0095, B:61:0x0133, B:63:0x0139, B:65:0x013f, B:35:0x009e, B:37:0x00a4, B:39:0x00ae, B:41:0x00b2, B:43:0x00cf, B:47:0x00e4, B:55:0x0111, B:57:0x0115, B:59:0x0122, B:60:0x0129, B:67:0x0149, B:68:0x014e, B:24:0x0058), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:31:0x008f, B:33:0x0095, B:61:0x0133, B:63:0x0139, B:65:0x013f, B:35:0x009e, B:37:0x00a4, B:39:0x00ae, B:41:0x00b2, B:43:0x00cf, B:47:0x00e4, B:55:0x0111, B:57:0x0115, B:59:0x0122, B:60:0x0129, B:67:0x0149, B:68:0x014e, B:24:0x0058), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:31:0x008f, B:33:0x0095, B:61:0x0133, B:63:0x0139, B:65:0x013f, B:35:0x009e, B:37:0x00a4, B:39:0x00ae, B:41:0x00b2, B:43:0x00cf, B:47:0x00e4, B:55:0x0111, B:57:0x0115, B:59:0x0122, B:60:0x0129, B:67:0x0149, B:68:0x014e, B:24:0x0058), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ozf] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x010e -> B:15:0x0036). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doForegroundWork(kotlin.coroutines.Continuation<? super defpackage.la8> r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /* renamed from: getName */
    public String getG0() {
        return TAG;
    }

    public static final void start(g5i g5iVar, boolean z) {
        Companion.getClass();
        mb8.a(g5iVar, z);
    }
}
