package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class yi2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yi2(sm6 sm6Var, yb9 yb9Var, ml2 ml2Var) {
        this.a = 1;
        this.b = (hn6) sm6Var;
        this.c = yb9Var;
        this.d = ml2Var;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [hn6, sm6] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        sm6 sm6Var;
        switch (this.a) {
            case 0:
                ((rw) this.b).invoke((ub9) this.c, ((zi2) this.d).a);
                break;
            case 1:
                ((hn6) this.b).invoke((yb9) this.c, ((ml2) this.d).a);
                break;
            case 2:
                ((l5e) this.b).invoke((cy2) this.c, (uc2) this.d);
                break;
            case 3:
                ((x03) this.b).accept(((b03) this.c).a, ((hs2) this.d).a);
                break;
            case 4:
                ((l5e) this.b).invoke((q04) this.c, (v0b) this.d);
                break;
            case 5:
                ((rw) this.b).invoke(Long.valueOf(((bq5) this.c).a), ((zp5) this.d).a);
                break;
            case 6:
                ((rw) this.b).invoke(Long.valueOf(((bq5) this.c).a), ((dq5) this.d).a);
                break;
            case 7:
                od6 od6Var = (od6) this.b;
                meb mebVar = (meb) this.c;
                aya ayaVar = (aya) this.d;
                em6 em6Var = od6Var.Y;
                if (em6Var != null) {
                    boolean zBooleanValue = ((Boolean) em6Var.invoke(mebVar.getTabItem())).booleanValue();
                    if (zBooleanValue && (sm6Var = od6Var.Z) != null) {
                        sm6Var.invoke(view, ayaVar);
                        break;
                    }
                }
                break;
            default:
                kme kmeVar = (kme) this.b;
                gre greVar = (gre) this.c;
                t8e t8eVar = (t8e) this.d;
                View view2 = greVar.a;
                String str = t8eVar.s0;
                SettingRingtoneScreen settingRingtoneScreen = (SettingRingtoneScreen) kmeVar.b;
                z34 z34Var = settingRingtoneScreen.d;
                if (z34Var != null) {
                    z34Var.dismiss();
                }
                y34 y34VarA = h6j.a(1);
                settingRingtoneScreen.y0().getClass();
                z34 z34VarBuild = y34VarA.o(Collections.singletonList(new b44(0, new n5g(mvd.Q), Integer.valueOf(w9b.V), Integer.valueOf(ivd.T0), Integer.valueOf(w9b.Q)))).B(view2).x(gwi.b(new imb("ringtone_file_path", str))).build();
                settingRingtoneScreen.d = z34VarBuild;
                z34VarBuild.u(settingRingtoneScreen);
                break;
        }
        return true;
    }

    public /* synthetic */ yi2(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
