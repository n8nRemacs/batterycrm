package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.io.File;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class nz implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;

    public /* synthetic */ nz(k18 k18Var, int i) {
        this.a = i;
        this.b = k18Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                t86 t86VarN = ((l5c) ((age) this.b.getValue())).n();
                if (t86VarN != null) {
                    return (String) t86VarN.c;
                }
                return null;
            case 1:
                return d7j.a(((q2b) ((lzf) this.b.getValue())).f());
            case 2:
                return ((q2b) ((lzf) this.b.getValue())).a().limitedParallelism(1, "call_chat_observing");
            case 3:
                gu5 gu5Var = (gu5) ((rt5) this.b.getValue());
                gu5Var.getClass();
                long jK = gu5Var.k(PmsKey.f12callincomingab, 0L);
                return jK == 1 ? lb1.b : jK == 2 ? lb1.c : lb1.a;
            case 4:
                return i9j.b((Context) this.b.getValue());
            case 5:
                return ((q2b) ((lzf) this.b.getValue())).a().limitedParallelism(1, "call_p2p_invite_observing");
            case 6:
                gu5 gu5Var2 = (gu5) ((rt5) this.b.getValue());
                gu5Var2.getClass();
                return Boolean.valueOf(gu5Var2.j(PmsKey.f57gclinkpresettings, false));
            case 7:
                return ((x7b) this.b.getValue()).i(true);
            case 8:
                return ((Context) this.b.getValue()).getString(z2d.call_notification_name_temp);
            case 9:
                return ((Context) this.b.getValue()).getString(z2d.call_notification_incoming_call);
            case 10:
                return ((Context) this.b.getValue()).getString(z2d.call_notification_incoming_video_call);
            case 11:
                return ((Context) this.b.getValue()).getString(z2d.call_notification_active_call);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return Boolean.valueOf(((ck2) this.b.getValue()).d());
            case 13:
                return ((OneMeRoomDatabase) this.b.getValue()).v();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((q2b) ((lzf) this.b.getValue())).b();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (iw9) ((kw9) this.b.getValue()).d.getValue();
            case 16:
                return ((su0) this.b.getValue()).a(1024);
            case LangUtils.HASH_SEED /* 17 */:
                rua ruaVarA = ((sua) this.b.getValue()).a();
                ruaVarA.f = false;
                return new sua(ruaVarA);
            case 18:
                l5c l5cVar = (l5c) ((age) this.b.getValue());
                l5cVar.getClass();
                int iM = (int) l5cVar.m(PmsKey.f103msggetreactionspagesize, 40);
                return Integer.valueOf(iM > 0 ? iM : 40);
            case 19:
                return new rje((w1g) this.b.getValue());
            case 20:
                return ((g4b) this.b.getValue()).c();
            case 21:
                return new fr9(this.b);
            case 22:
                return new vy(new File(iz5.c(((iz5) ((qx5) this.b.getValue())).c), "chats_v2"), null);
            case 23:
                return new rc0(this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new vy(new File(iz5.c(((iz5) ((qx5) this.b.getValue())).c), "folders_v1"), null);
            case 25:
                return new rje((w1g) this.b.getValue());
            case 26:
                gu5 gu5Var3 = (gu5) ((rt5) this.b.getValue());
                gu5Var3.getClass();
                return Boolean.valueOf(gu5Var3.j(PmsKey.f10callcustomringtone, false));
            case 27:
                return ((q2b) ((lzf) this.b.getValue())).a().limitedParallelism(1, "call_participants_observing");
            case 28:
                return (SensorManager) ((Context) this.b.getValue()).getSystemService("sensor");
            default:
                return (PowerManager) ((Context) this.b.getValue()).getSystemService("power");
        }
    }

    public /* synthetic */ nz(k0a k0aVar, k18 k18Var) {
        this.a = 23;
        this.b = k18Var;
    }
}
