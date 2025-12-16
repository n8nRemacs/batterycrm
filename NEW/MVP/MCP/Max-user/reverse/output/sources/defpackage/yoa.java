package defpackage;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class yoa extends dtf implements zm6 {
    public final /* synthetic */ cpa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoa(cpa cpaVar, b66 b66Var) {
        super(6, b66Var);
        this.o = cpaVar;
    }

    @Override // defpackage.zm6
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, b66 b66Var) {
        ((Boolean) obj3).getClass();
        ((Number) obj4).intValue();
        return new yoa(this.o, b66Var).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        s5g r5gVar;
        String title;
        g8j.b(obj);
        cpa cpaVar = this.o;
        Context context = cpaVar.c;
        o98 o98VarD = ve3.d();
        boolean z = cpaVar.t().g.getLong("app.notification.dontDisturbUntil", 0L) == 0;
        n5g n5gVarU = cpa.u(cpaVar.t().m());
        n5g n5gVarU2 = cpa.u(cpaVar.t().k());
        boolean z2 = cpaVar.t().g.getBoolean("app.notification.show.text", true);
        o98VarD.add(new eoa(new n5g(b8b.l), 0, z7b.m, null, new doe(z, true), 216));
        if (z) {
            o98VarD.add(new eoa(new n5g(b8b.w), 0, z7b.A, null, new doe(z2, true), 216));
            o98VarD.add(new eoa(new n5g(b8b.j), 1, z7b.k, null, new boe(n5gVarU, null), 216));
            o98VarD.add(new eoa(new n5g(b8b.d), 1, z7b.d, null, new boe(n5gVarU2, null), 216));
            long j = z7b.w;
            n5g n5gVar = new n5g(b8b.s);
            yne yneVar = yne.a;
            o98VarD.add(new eoa(n5gVar, 1, j, null, yneVar, 216));
            o98VarD.add(new eoa(new n5g(b8b.o), 2, z7b.q, new n5g(b8b.m), yneVar, 72));
            if (((Boolean) cpaVar.A0.getValue()).booleanValue()) {
                nqd nqdVar = (nqd) cpaVar.x0.getValue();
                if (fni.a(nqdVar, lqd.a)) {
                    r5gVar = new n5g(b8b.h);
                } else if (nqdVar instanceof kqd) {
                    String name = new File(((kqd) nqdVar).a).getName();
                    int iH = vmf.H(".", name, 6);
                    if (iH != -1) {
                        name = name.substring(0, iH);
                    }
                    r5gVar = new r5g(name);
                } else {
                    if (!(nqdVar instanceof mqd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(((mqd) nqdVar).a));
                        if (ringtone == null || (title = ringtone.getTitle(context)) == null) {
                            title = "";
                        }
                        r5gVar = new r5g(title);
                    } catch (Exception e) {
                        wqi.p(o98.class.getName(), "can't load ringtone name due to " + e.getMessage(), e);
                        r5gVar = s5g.b;
                    }
                }
                int i = a8b.d;
                o98VarD.add(new doa(new n5g(b8b.p)));
                o98VarD.add(new eoa(new n5g(b8b.n), 3, a8b.b, null, new boe(r5gVar, null), 216));
                o98VarD.add(new eoa(new n5g(b8b.q), 3, a8b.c, null, new doe(cpaVar.t().g.getBoolean("app.calls.incoming.vibration", true), true), 216));
            }
        }
        return ve3.a(o98VarD);
    }
}
