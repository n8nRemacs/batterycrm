package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;

/* loaded from: classes2.dex */
public final class jme extends dtf implements sm6 {
    public final /* synthetic */ SettingRingtoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jme(Continuation continuation, SettingRingtoneScreen settingRingtoneScreen) {
        super(2, continuation);
        this.X = settingRingtoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jme jmeVar = (jme) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jmeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jme jmeVar = new jme(continuation, this.X);
        jmeVar.o = obj;
        return jmeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof mre;
        SettingRingtoneScreen settingRingtoneScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = SettingRingtoneScreen.Z;
            try {
                String str = ap7.a;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("audio/*");
                settingRingtoneScreen.startActivityForResult(intent, 998);
            } catch (ActivityNotFoundException unused) {
                ccb ccbVar = new ccb(settingRingtoneScreen);
                ccbVar.h(settingRingtoneScreen.getContext().getString(mvd.I0));
                ccbVar.i();
            }
        } else if (cdaVar instanceof nre) {
            String str2 = ((nre) cdaVar).b;
            yy7[] yy7VarArr2 = SettingRingtoneScreen.Z;
            try {
                settingRingtoneScreen.startActivityForResult(ap7.f(settingRingtoneScreen.getContext().getString(sbb.k), str2), 999);
            } catch (ActivityNotFoundException unused2) {
                ccb ccbVar2 = new ccb(settingRingtoneScreen);
                ccbVar2.h(settingRingtoneScreen.getContext().getString(mvd.I0));
                ccbVar2.i();
            }
        } else if (cdaVar instanceof ore) {
            ccb ccbVar3 = new ccb(settingRingtoneScreen);
            ore oreVar = (ore) cdaVar;
            ccbVar3.g(oreVar.b);
            ccbVar3.e(new qcb(oreVar.c));
            ccbVar3.i();
        } else if (cdaVar instanceof ei4) {
            pre.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
