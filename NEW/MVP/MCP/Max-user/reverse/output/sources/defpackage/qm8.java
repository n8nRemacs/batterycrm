package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class qm8 extends xfh {
    public final tcf X;
    public final hbd Y;
    public final jve Z;
    public final sxg b;
    public final List c;
    public final tcf d;
    public final hbd o;
    public final gbd s0;
    public final jve t0;
    public final gbd u0;
    public final sl6 v0;
    public final x26 w0;
    public static final zya x0 = new zya(n6b.a, new xya(y9b.e), m6b.g, ":contact-list", m6b.f);
    public static final zya y0 = new zya(u3d.oneme_main_calls_title, new xya(y9b.c), m6b.c, ":call-list", m6b.b);
    public static final zya z0 = new zya(u3d.oneme_main_chats_title, new wya(new om8(0), new wm7(12)), m6b.e, ":chat-list", m6b.d);
    public static final Object A0 = ipi.b(3, new c38(12));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public qm8(sxg sxgVar, is0 is0Var, String str) {
        Object next;
        this.b = sxgVar;
        zya zyaVar = (zya) A0.getValue();
        zya zyaVar2 = x0;
        zya zyaVar3 = y0;
        zya zyaVar4 = z0;
        List listJ = ve3.j(zyaVar2, zyaVar3, zyaVar4, zyaVar);
        this.c = listJ;
        tcf tcfVarA = ucf.a(zyaVar4);
        this.d = tcfVarA;
        this.o = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(Boolean.valueOf(sxgVar.g.getBoolean("app.messages.calls.menu.item", true)));
        this.X = tcfVarA2;
        this.Y = new hbd(tcfVarA2);
        jve jveVarB = kve.b(0, 0, 6);
        this.Z = jveVarB;
        this.s0 = new gbd(jveVarB);
        jve jveVarB2 = kve.b(0, 0, 6);
        this.t0 = jveVarB2;
        this.u0 = new gbd(jveVarB2);
        this.v0 = new sl6(15, this);
        this.w0 = is0Var.c;
        Iterator it = listJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((zya) next).d.equals(str)) {
                    break;
                }
            }
        }
        zya zyaVar5 = (zya) next;
        tcfVarA.setValue(zyaVar5 != null ? zyaVar5 : zyaVar4);
        final sxg sxgVar2 = this.b;
        final sl6 sl6Var = this.v0;
        sxgVar2.getClass();
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: rxg
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                sxg sxgVar3 = sxgVar2;
                sxgVar3.getClass();
                if (str2 != null && str2.equals("app.messages.calls.menu.item")) {
                    ((qm8) sl6Var.b).X.m(null, Boolean.valueOf(sxgVar3.g.getBoolean("app.messages.calls.menu.item", true)));
                }
            }
        };
        sxgVar2.m.put(sl6Var, onSharedPreferenceChangeListener);
        sxgVar2.g.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.xfh
    public final void s() {
        sxg sxgVar = this.b;
        n18 n18Var = sxgVar.g;
        WeakHashMap weakHashMap = sxgVar.m;
        sl6 sl6Var = this.v0;
        n18Var.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) weakHashMap.get(sl6Var));
        weakHashMap.remove(sl6Var);
    }
}
