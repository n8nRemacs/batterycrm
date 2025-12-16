package defpackage;

import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.android.onelog.UploadService;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class nwa implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ nwa(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = 4;
        int i2 = 3;
        switch (this.a) {
            case 0:
                rwa rwaVar = OneMeApplication.s0;
                eg4 eg4Var = (eg4) y4e.a.getAccessor().c(HttpStatus.SC_CREATED);
                eg4Var.getClass();
                nrb nrbVar = (nrb) ((mrb) new mrb(DbCleanUpScheduler$DbCleanUpWorker.class, 24L, TimeUnit.HOURS).addTag("DB_CLEAN_UP")).build();
                wqi.c("DbCleanUpScheduler", "Scheduling DbCleanUpWorker with request " + nrbVar, new Object[0]);
                g5i.e(eg4Var.a, "DB_CLEAN_UP", 2, nrbVar, 8);
                return qqg.a;
            case 1:
                rwa rwaVar2 = OneMeApplication.s0;
                OneMeRoomDatabase.m = new iqa(i);
                return qqg.a;
            case 2:
                rwa rwaVar3 = OneMeApplication.s0;
                z74 z74VarB = ((q2b) ((lzf) qn3.i.getValue())).b();
                int i3 = s65.d;
                svi.e(nv6.a, z74VarB, null, new b9f(v9j.i(10L, y65.MINUTES), null), 2);
                return qqg.a;
            case 3:
                rwa rwaVar4 = OneMeApplication.s0;
                t1b t1bVar = t1b.a;
                lv4 lv4VarE = t1bVar.e();
                g4b g4bVar = (g4b) qn3.g.getValue();
                yy7[] yy7VarArr = g4b.q;
                ExecutorService executorServiceF = g4bVar.f(2, UploadService.SCHEME, 2, 5, true);
                pe8 pe8Var = ((z7c) y7c.a.getAccessor().c(32)).a;
                z74 z74VarB2 = ((q2b) ((lzf) qn3.i.getValue())).b();
                zch zchVar = (zch) t1bVar.getAccessor().c(136);
                t1bVar.c().getClass();
                new zva(lv4VarE, executorServiceF, pe8Var, z74VarB2, zchVar);
                return qqg.a;
            case 4:
                rwa rwaVar5 = OneMeApplication.s0;
                y4e y4eVar = y4e.a;
                w0g w0gVar = (w0g) y4eVar.getAccessor().c(182);
                if (w0gVar.X.get() == null) {
                    w0gVar.f();
                }
                w0gVar.c(true);
                oje ojeVar = (oje) y4eVar.getAccessor().c(180);
                wod wodVar = (wod) t1b.a.getAccessor().c(683);
                tcf tcfVar = wodVar.d;
                int i4 = s65.d;
                zs0.e(new g56(new lo1(zs0.g(tcfVar, v9j.h(10, y65.SECONDS)), i), new vod(wodVar, null), 1), wodVar.c);
                ojeVar.a(wodVar);
                return qqg.a;
            case 5:
                rwa rwaVar6 = OneMeApplication.s0;
                return qqg.a;
            case 6:
                rwa rwaVar7 = OneMeApplication.s0;
                rya ryaVar = (rya) t1b.a.getAccessor().c(147);
                pe8 pe8Var2 = (pe8) ryaVar.b;
                fde fdeVar = pe8Var2.G0;
                yy7[] yy7VarArr2 = pe8.U0;
                String str = (String) fdeVar.D(pe8Var2, yy7VarArr2[20]);
                ryaVar.d.getClass();
                if (!fni.a(str, "25.19.0")) {
                    pe8Var2.G0.O(pe8Var2, yy7VarArr2[20], null);
                }
                return qqg.a;
            case 7:
                rwa rwaVar8 = OneMeApplication.s0;
                ((c6i) t1b.a.getAccessor().c(186)).b(new jge());
                return qqg.a;
            case 8:
                rwa rwaVar9 = OneMeApplication.s0;
                w14 w14Var = (w14) t1b.a.getAccessor().c(366);
                w14Var.a.d(w14Var);
                return qqg.a;
            case 9:
                rwa rwaVar10 = OneMeApplication.s0;
                vw1 vw1Var = (vw1) t1b.a.getAccessor().c(367);
                vw1Var.y0.b(new tw1(vw1Var, i2));
                return qqg.a;
            case 10:
                rwa rwaVar11 = OneMeApplication.s0;
                t1b t1bVar2 = t1b.a;
                ((qi9) t1bVar2.getAccessor().c(143)).h = new t9f(25, t1bVar2.a());
                return qqg.a;
            case 11:
                rwa rwaVar12 = OneMeApplication.s0;
                y4e y4eVar2 = y4e.a;
                y4eVar2.d().b();
                y4eVar2.c().p();
                return qqg.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                rwa rwaVar13 = OneMeApplication.s0;
                t1b.a.c().getClass();
                return Boolean.FALSE;
            case 13:
                rwa rwaVar14 = OneMeApplication.s0;
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new awa(11, new s6b(new bwf(new nwa(21)))));
                return qqg.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                rwa rwaVar15 = OneMeApplication.s0;
                ((r1g) t1b.a.getAccessor().c(647)).e();
                return qqg.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                rwa rwaVar16 = OneMeApplication.s0;
                yid yidVar = DailyAnalyticsWorker.s0;
                g5i g5iVar = (g5i) y4e.a.getAccessor().c(169);
                nrb nrbVar2 = (nrb) ((mrb) ((mrb) new mrb(DailyAnalyticsWorker.class, 1L, TimeUnit.DAYS).setConstraints(new bu3(1, false, false, false, false, -1L, -1L, ue3.h0(new LinkedHashSet())))).addTag("ru.ok.messages.analytics.DailyAnalyticsWorker")).build();
                wqi.c("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + nrbVar2.getId() + " try to add ru.ok.messages.analytics.DailyAnalyticsWorker request", new Object[0]);
                g5i.e(g5iVar, "ru.ok.messages.analytics.DailyAnalyticsWorker", 2, nrbVar2, 24);
                return qqg.a;
            case 16:
                rwa rwaVar17 = OneMeApplication.s0;
                qna qnaVar = (qna) y4e.a.getAccessor().c(HttpStatus.SC_ACCEPTED);
                qnaVar.getClass();
                wqi.c("NotificationTrackerCleanupScheduler", "schedule task", new Object[0]);
                TimeUnit timeUnit = TimeUnit.DAYS;
                g5i.e(qnaVar.a, "NotificationTrackerCleanupScheduler", 2, (nrb) ((mrb) ((mrb) new mrb(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class, 7L, timeUnit).setInitialDelay(7L, timeUnit)).addTag("NotificationTrackerCleanupScheduler")).build(), 8);
                return qqg.a;
            case LangUtils.HASH_SEED /* 17 */:
                rwa rwaVar18 = OneMeApplication.s0;
                ((yz7) t1b.a.getAccessor().c(490)).a();
                return qqg.a;
            case 18:
                rwa rwaVar19 = OneMeApplication.s0;
                t1b t1bVar3 = t1b.a;
                sxi.a = (pca) t1bVar3.getAccessor().c(669);
                RLottie.init((RLottie.Config) t1bVar3.getAccessor().c(667));
                WebmConfig.init((WebmConfig.Config) t1bVar3.getAccessor().c(668));
                return qqg.a;
            case 19:
                rwa rwaVar20 = OneMeApplication.s0;
                if (QrCodeGenerator.c) {
                    QrCodeGenerator.b.getClass();
                    wqi.c("QrCodeGenerator", "Native library (qrcode) was successfully loaded", new Object[0]);
                }
                return qqg.a;
            case 20:
                rwa rwaVar21 = OneMeApplication.s0;
                new h77().c();
                return qqg.a;
            case 21:
                rwa rwaVar22 = OneMeApplication.s0;
                return (de8) t1b.a.getAccessor().c(492);
            case 22:
                rwa rwaVar23 = OneMeApplication.s0;
                return qqg.a;
            case 23:
                rwa rwaVar24 = OneMeApplication.s0;
                wj wjVar = (wj) t1b.a.getAccessor().c(281);
                wjVar.k.O(wjVar, wj.p[0], svi.e(wjVar.j, null, i84.b, new uj(wjVar, null), 1));
                return qqg.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new aya("", "", 2, zxa.a, null, null);
            case 25:
                return mwg.c(yud.N1).toString();
            case 26:
                ep4 ep4Var = gy4.a;
                return MainDispatcherLoader.dispatcher;
            case 27:
                return new oeb(kti.d(3 * vw4.d().getDisplayMetrics().density), vw4.d().getDisplayMetrics().density * 4.0f);
            case 28:
                return new e5g();
            default:
                return Executors.newSingleThreadExecutor();
        }
    }

    public /* synthetic */ nwa(OneMeApplication oneMeApplication) {
        this.a = 1;
    }
}
