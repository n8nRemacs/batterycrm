package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.NoSuchElementException;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class bfc implements di4 {
    public final /* synthetic */ int a;
    public final k18 b;
    public final ki4 c;

    public bfc(k18 k18Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = mph.b;
                this.b = k18Var;
                break;
            default:
                this.b = k18Var;
                this.c = efc.b;
                break;
        }
    }

    @Override // defpackage.di4
    public final ki4 a() {
        switch (this.a) {
            case 0:
                return (efc) this.c;
            default:
                return (mph) this.c;
        }
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 afcVar;
        final cfc cfcVar;
        mi4 w91Var;
        mi4 w91Var2;
        final ukh ukhVar;
        boolean zBooleanValue;
        switch (this.a) {
            case 0:
                if (!((efc) this.c).a.contains(gi4Var)) {
                    return null;
                }
                efc.b.getClass();
                boolean zEquals = gi4Var.equals(efc.c);
                zg5 zg5Var = dfc.o;
                if (zEquals) {
                    long jI = l8j.i("id", bundle);
                    String strK = l8j.k("type", bundle);
                    f2 f2Var = new f2(0, zg5Var);
                    while (f2Var.hasNext()) {
                        dfc dfcVar = (dfc) f2Var.next();
                        if (dfcVar.a.equals(strK)) {
                            w91Var = new kdc(jI, dfcVar, 2);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (!gi4Var.equals(efc.d)) {
                    if (gi4Var.equals(efc.e)) {
                        final long jI2 = l8j.i("id", bundle);
                        String strK2 = l8j.k("type", bundle);
                        f2 f2Var2 = new f2(0, zg5Var);
                        while (f2Var2.hasNext()) {
                            final dfc dfcVar2 = (dfc) f2Var2.next();
                            if (dfcVar2.a.equals(strK2)) {
                                if (dfcVar2 == dfc.c) {
                                    l5c l5cVar = (l5c) ((age) this.b.getValue());
                                    l5cVar.getClass();
                                    if (!l5cVar.j(PmsKey.f1accountnicknameenabled, false)) {
                                        return null;
                                    }
                                }
                                String strK3 = l8j.k("flow", bundle);
                                Iterator it = cfc.d.iterator();
                                do {
                                    f2 f2Var3 = (f2) it;
                                    if (!f2Var3.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    cfcVar = (cfc) f2Var3.next();
                                } while (!cfcVar.a.equals(strK3));
                                afcVar = new mi4() { // from class: zec
                                    @Override // defpackage.mi4
                                    public final Object a() {
                                        return new ProfileChangeLinkScreen(jI2, dfcVar2, cfcVar);
                                    }
                                };
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (!gi4Var.equals(efc.f)) {
                        wqi.e(bfc.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
                        return null;
                    }
                    afcVar = new afc(l8j.i("chat_id", bundle), l8j.i("contact_id", bundle), l8j.k("permissions_type", bundle));
                    return new ni4(str, gi4Var, bundle, 1, null, afcVar, 16);
                }
                w91Var = new w91(l8j.i("id", bundle), 7);
                afcVar = w91Var;
                return new ni4(str, gi4Var, bundle, 1, null, afcVar, 16);
            default:
                if (!((mph) this.c).a.contains(gi4Var)) {
                    return null;
                }
                li4 li4Var = new li4((q8g) null, 3);
                mph.b.getClass();
                if (gi4Var.equals(mph.c)) {
                    li4Var = new li4(new q8g(20), new q8g(21));
                    final long jI3 = l8j.i("bot_id", bundle);
                    String strK4 = l8j.k("entry_point", bundle);
                    Iterator it2 = ukh.u0.iterator();
                    do {
                        f2 f2Var4 = (f2) it2;
                        if (!f2Var4.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        ukhVar = (ukh) f2Var4.next();
                    } while (!ukhVar.a.equals(strK4));
                    final Long lD = l8j.d("source_id", bundle);
                    final String string = bundle.getString("start_param");
                    Boolean boolB = l8j.b("is_fullscreen", bundle);
                    if (boolB != null) {
                        zBooleanValue = boolB.booleanValue();
                    } else {
                        pe8 pe8Var = (pe8) ((pb3) this.b.getValue());
                        zBooleanValue = ((Boolean) pe8Var.I0.D(pe8Var, pe8.U0[22])).booleanValue();
                    }
                    final boolean z = zBooleanValue;
                    Integer numC = l8j.c("request_code", bundle);
                    final int iIntValue = numC != null ? numC.intValue() : 0;
                    w91Var2 = new mi4() { // from class: lph
                        @Override // defpackage.mi4
                        public final Object a() {
                            return new WebAppRootScreen(jI3, ukhVar, lD, string, z, iIntValue);
                        }
                    };
                } else if (gi4Var.equals(mph.d)) {
                    w91Var2 = new xre(8);
                } else {
                    if (!gi4Var.equals(mph.e)) {
                        throw new IllegalStateException(az1.h("invalid route ", gi4Var));
                    }
                    w91Var2 = new w91(l8j.i("bot_id", bundle), 10);
                }
                return new ni4(str, gi4Var, bundle, 1, li4Var, w91Var2);
        }
    }
}
