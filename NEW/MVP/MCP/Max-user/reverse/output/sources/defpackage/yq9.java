package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Annotation;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import one.me.android.OneMeApplication;
import one.me.android.deeplink.NewWidgetActivity;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class yq9 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ yq9(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        switch (this.a) {
            case 0:
                return new yk8(100);
            case 1:
                yy7[] yy7VarArr = MessagesSettingsScreen.X;
                return f1e.SETTINGS_MESSAGES;
            case 2:
                yy7[] yy7VarArr2 = MessagesSettingsScreen.X;
                return new jy9((sxg) ey9.a.getAccessor().c(61));
            case 3:
                return new no4(uca.c, 1);
            case 4:
                return new no4(uca.c, 2);
            case 5:
                int i4 = NewWidgetActivity.T0;
                return qqg.a;
            case 6:
                return qg9.a("one.me.webapp.domain.jsbridge.delegates.haptic.NotificationType", sna.values(), new String[]{NegotiationErrorStat.KEY_ERROR, "success", "warning"}, new Annotation[][]{null, null, null});
            case 7:
                yy7[] yy7VarArr3 = NotificationsSettingsScreen.u0;
                return f1e.SETTINGS_NOTIFICATIONS;
            case 8:
                yy7[] yy7VarArr4 = NotificationsSettingsScreen.u0;
                return new cpa();
            case 9:
                yy7[] yy7VarArr5 = NotificationsSettingsScreen.u0;
                return new zh0(ooa.a.getAccessor().d(553), true, null, 46);
            case 10:
                nnf nnfVar = nnf.e;
                ree[] reeVarArr = new ree[0];
                if (vmf.F("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (nnfVar.equals(nnf.b)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                da3 da3Var = new da3("kotlin.Unit");
                return new tee("kotlin.Unit", nnfVar, da3Var.b.size(), ys.D(reeVarArr), da3Var);
            case 11:
                rwa rwaVar = OneMeApplication.s0;
                tih tihVar = (tih) t1b.a.getAccessor().c(75);
                tihVar.getClass();
                wqi.c("tih", "registerSelf", new Object[0]);
                tihVar.j.a.add(tihVar);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    bac.s0.X.a(tihVar.m);
                } else {
                    new Handler(Looper.getMainLooper()).post(new rih(tihVar, i2));
                }
                return qqg.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                rwa rwaVar2 = OneMeApplication.s0;
                byte[] bArr = a.a;
                jei.a = new rha(27);
                return qqg.a;
            case 13:
                rwa rwaVar3 = OneMeApplication.s0;
                l5c l5cVar = (l5c) y7c.a.getAccessor().c(64);
                l5cVar.i.add((zzf) y4e.a.getAccessor().c(249));
                return qqg.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                rwa rwaVar4 = OneMeApplication.s0;
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new mc(11));
                return qqg.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                rwa rwaVar5 = OneMeApplication.s0;
                jj5 jj5Var = qn3.a;
                t8j.b = v1a.t0;
                t8j.c = b6a.t0;
                t8j.d = qha.u0;
                return qqg.a;
            case 16:
                rwa rwaVar6 = OneMeApplication.s0;
                mq mqVar = mq.a;
                mqVar.b("subversion", String.valueOf(25735));
                vw6 vw6Var = (vw6) ((alf) t1b.a.getAccessor().c(80));
                String str = vw6Var.f;
                Context context = vw6Var.a;
                mqVar.b("services_name", str);
                if (vw6Var.d == -1) {
                    vw6Var.d = tv6.d.c(context, uv6.a);
                }
                mqVar.b("services_status", String.valueOf(vw6Var.d));
                if (vw6Var.e == -1) {
                    Object obj = tv6.c;
                    vw6Var.e = uv6.a(context);
                }
                mqVar.b("services_version", String.valueOf(vw6Var.e));
                return qqg.a;
            case LangUtils.HASH_SEED /* 17 */:
                rwa rwaVar7 = OneMeApplication.s0;
                return new df6();
            case 18:
                rwa rwaVar8 = OneMeApplication.s0;
                return (co3) t1b.a.getAccessor().c(673);
            case 19:
                rwa rwaVar9 = OneMeApplication.s0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "Concurrency", ho7.f(((Number) qn3.c.getValue()).intValue(), "ioPoolSize="), null);
                    }
                }
                return qqg.a;
            case 20:
                rwa rwaVar10 = OneMeApplication.s0;
                ((vm9) y4e.a.getAccessor().c(258)).a();
                return qqg.a;
            case 21:
                rwa rwaVar11 = OneMeApplication.s0;
                f35 f35Var = (f35) y4e.a.getAccessor().c(313);
                if (f35Var.e.compareAndSet(false, true)) {
                    f35Var.a.b(new qj4(10, f35Var));
                }
                return qqg.a;
            case 22:
                rwa rwaVar12 = OneMeApplication.s0;
                y4e y4eVar = y4e.a;
                kub kubVar = (kub) y4eVar.getAccessor().c(318);
                kubVar.Y.add((mub) y4eVar.getAccessor().c(HttpStatus.SC_BAD_REQUEST));
                qv3 qv3VarD = y4eVar.d();
                CopyOnWriteArraySet copyOnWriteArraySet = kubVar.Y;
                copyOnWriteArraySet.add(qv3VarD);
                copyOnWriteArraySet.add((jzf) y4eVar.getAccessor().c(89));
                copyOnWriteArraySet.add(new owa());
                return qqg.a;
            case 23:
                rwa rwaVar13 = OneMeApplication.s0;
                boolean zB = y4e.a.b().b();
                vxf vxfVar = (vxf) t1b.a.getAccessor().c(74);
                svi.e(vxfVar.u0, null, null, new sxf(vxfVar, zB, null), 3);
                return qqg.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                rwa rwaVar14 = OneMeApplication.s0;
                return qqg.a;
            case 25:
                rwa rwaVar15 = OneMeApplication.s0;
                return qqg.a;
            case 26:
                rwa rwaVar16 = OneMeApplication.s0;
                t1b t1bVar = t1b.a;
                ug0 ug0Var = (ug0) t1bVar.getAccessor().c(681);
                y83 y83VarB = ug0Var.c.b();
                int i5 = s65.d;
                gw0.w(new g56(new x3(new qg0(new m36(new sg0(2, null), zs0.g(y83VarB, v9j.h(1, y65.SECONDS))), i2), ug0Var, i), new tg0(ug0Var, null), i3), ug0Var.d);
                ((fxe) t1bVar.getAccessor().c(679)).d();
                return qqg.a;
            case 27:
                rwa rwaVar17 = OneMeApplication.s0;
                t1b t1bVar2 = t1b.a;
                zm zmVar = (zm) t1bVar2.getAccessor().c(672);
                zmVar.getClass();
                q1g.b0 = zmVar;
                wqi.c("zm", "onCreate finish", new Object[0]);
                t1bVar2.c().getClass();
                ctd.a = 1;
                vfe.a.add(new qwa());
                return qqg.a;
            case 28:
                rwa rwaVar18 = OneMeApplication.s0;
                return qqg.a;
            default:
                rwa rwaVar19 = OneMeApplication.s0;
                c27 c27Var = (c27) y4e.a.getAccessor().c(200);
                c27Var.getClass();
                nrb nrbVar = (nrb) ((mrb) new mrb(HeartbeatScheduler$TaskHeartbeatWorker.class, 15L, TimeUnit.MINUTES).addTag("HEART_BEAT")).build();
                wqi.c("c27", "work %s try to add %s request", nrbVar.getId(), "HEART_BEAT");
                g5i.e(c27Var.a, "HEART_BEAT", 3, nrbVar, 8);
                return qqg.a;
        }
    }

    public /* synthetic */ yq9(sqa sqaVar) {
        this.a = 10;
    }
}
