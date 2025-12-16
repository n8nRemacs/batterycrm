package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class apa extends dtf implements sm6 {
    public final /* synthetic */ cpa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apa(cpa cpaVar, Continuation continuation) {
        super(2, continuation);
        this.o = cpaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        apa apaVar = (apa) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        apaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new apa(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = cpa.F0;
        cpa cpaVar = this.o;
        sxg sxgVarT = cpaVar.t();
        sxgVarT.h(0L, "app.notification.dontDisturbUntil");
        sxgVarT.f("app.notification.show.text", true);
        sxgVarT.i("app.notification.ringtone", null);
        sxgVarT.f("app.notification.vibrate", true);
        sxgVarT.g(sxgVarT.l()[3], "app.notification.led.color");
        sxgVarT.g(0, "app.notification.dialogs.show");
        sxgVarT.j.f(0);
        sxgVarT.i("app.notification.dialogs.ringtone", null);
        sxgVarT.f("app.notification.dialogs.vibrate", true);
        sxgVarT.g(sxgVarT.l()[3], "app.notification.dialogs.led.color");
        sxgVarT.r(0);
        sxgVarT.i("app.notification.chats.ringtone", null);
        sxgVarT.f("app.notification.chats.vibrate", true);
        sxgVarT.g(sxgVarT.l()[3], "app.notification.chats.led.color");
        sxgVarT.i("app.group.chat.call.notification.status", "ON");
        sxgVarT.f("app.notification.in.app.sound", true);
        sxgVarT.f("app.notification.in.app.vibrate", true);
        sxgVarT.f("app.notification.show.new.users", true);
        sxgVarT.f("app.notification.show.drafts", true);
        sxgVarT.f("app.calls.incoming.vibration", true);
        sxgVarT.i("app.calls.incoming.ringtone", "default_");
        hwa hwaVar = (hwa) cpaVar.o.getValue();
        hwaVar.getClass();
        hwaVar.u().c(new bo3(hwaVar.t().a.k(), 0L, false, null, true, hwa.g), false, 0L, (12 & 8) != 0 ? 0 : 1);
        cpaVar.x0.m(null, cpaVar.t().j());
        tcf tcfVar = cpaVar.y0;
        tcfVar.m(null, new Integer(((Number) tcfVar.getValue()).intValue() + 1));
        return qqg.a;
    }
}
