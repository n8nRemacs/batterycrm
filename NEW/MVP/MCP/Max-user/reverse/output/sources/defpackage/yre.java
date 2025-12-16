package defpackage;

import android.os.Bundle;
import one.me.chats.forward.ForwardPickerScreen;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes2.dex */
public final class yre implements di4 {
    public final /* synthetic */ int a;
    public final ki4 b;

    public yre(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = qx1.b;
                break;
            case 2:
                this.b = tu4.b;
                break;
            case 3:
                this.b = rf6.b;
                break;
            case 4:
                this.b = wq7.b;
                break;
            case 5:
                this.b = pi8.b;
                break;
            case 6:
                this.b = poa.b;
                break;
            case 7:
                this.b = ote.b;
                break;
            default:
                this.b = zre.b;
                break;
        }
    }

    @Override // defpackage.di4
    public final ki4 a() {
        switch (this.a) {
            case 0:
                return (zre) this.b;
            case 1:
                return (qx1) this.b;
            case 2:
                return (tu4) this.b;
            case 3:
                return (rf6) this.b;
            case 4:
                return (wq7) this.b;
            case 5:
                return (pi8) this.b;
            case 6:
                return (poa) this.b;
            default:
                return (ote) this.b;
        }
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        g gVar;
        g gVar2;
        ni4 ni4Var;
        switch (this.a) {
            case 0:
                if (!((zre) this.b).a.contains(gi4Var)) {
                    return null;
                }
                zre.b.getClass();
                if (gi4Var.equals(zre.c)) {
                    return new ni4(str, gi4Var, bundle, 0, null, new xre(0), 24);
                }
                wqi.e(yre.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
                return null;
            case 1:
                if (!((qx1) this.b).a.contains(gi4Var)) {
                    return null;
                }
                qx1.b.getClass();
                if (gi4Var.equals(qx1.c)) {
                    return new ni4(str, gi4Var, bundle, 1, null, new np1(bundle, 0), 16);
                }
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            case 2:
                if (!((tu4) this.b).a.contains(gi4Var)) {
                    return null;
                }
                if (gi4Var.equals(tu4.c) || gi4Var.equals(tu4.g)) {
                    gVar = new g(11);
                } else if (gi4Var.equals(tu4.d)) {
                    gVar = new g(12);
                } else if (gi4Var.equals(tu4.h)) {
                    gVar = new g(13);
                } else if (gi4Var.equals(tu4.i)) {
                    gVar = new g(14);
                } else if (gi4Var.equals(tu4.e)) {
                    gVar = new g(15);
                } else {
                    if (!gi4Var.equals(tu4.f)) {
                        throw new IllegalStateException(az1.h("Unknown route=", gi4Var));
                    }
                    gVar = new g(16);
                }
                return new ni4(str, gi4Var, bundle, 0, (gi4Var.equals(tu4.i) || gi4Var.equals(tu4.h)) ? li4.c : new li4((q8g) null, 3), gVar, 8);
            case 3:
                if (!((rf6) this.b).a.contains(gi4Var)) {
                    return null;
                }
                if (!gi4Var.equals(rf6.c)) {
                    throw new IllegalStateException(az1.h("invalid route ", gi4Var));
                }
                final long[] jArrJ = l8j.j("messages_ids", bundle);
                final Long lD = l8j.d("attach_id", bundle);
                Boolean boolB = l8j.b("is_forward_attach", bundle);
                final boolean zBooleanValue = boolB != null ? boolB.booleanValue() : false;
                Boolean boolB2 = l8j.b("show_ext_sharing", bundle);
                final boolean zBooleanValue2 = boolB2 != null ? boolB2.booleanValue() : false;
                return new ni4(str, gi4Var, bundle, 1, null, new mi4() { // from class: qf6
                    @Override // defpackage.mi4
                    public final Object a() {
                        return new ForwardPickerScreen(jArrJ, lD, zBooleanValue, zBooleanValue2);
                    }
                }, 16);
            case 4:
                if (!((wq7) this.b).a.contains(gi4Var)) {
                    return null;
                }
                wq7.b.getClass();
                if (gi4Var.equals(wq7.c)) {
                    return new ni4(str, gi4Var, bundle, 1, null, new g(19), 16);
                }
                if (gi4Var.equals(wq7.d)) {
                    return new ni4(str, gi4Var, bundle, 1, new li4(new i77(10), new i77(11)), new np1(gwi.b(new imb("id", l8j.d("id", bundle)), new imb("type", bundle.getString("type")), new imb("height", l8j.c("height", bundle))), 6));
                }
                if (gi4Var.equals(wq7.e)) {
                    return new ni4(str, gi4Var, bundle, 1, new li4(new i77(12), new i77(13)), new g(20));
                }
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            case 5:
                ((pi8) this.b).getClass();
                if (gi4Var.equals(pi8.c)) {
                    return new ni4(str, gi4Var, bundle, 0, new li4(new c38(9), new c38(10)), new g(22), 8);
                }
                return null;
            case 6:
                if (!((poa) this.b).a.contains(gi4Var)) {
                    return null;
                }
                if (gi4Var.equals(poa.c)) {
                    gVar2 = new g(24);
                } else if (gi4Var.equals(poa.d)) {
                    gVar2 = new g(25);
                } else if (gi4Var.equals(poa.e)) {
                    gVar2 = new g(26);
                } else {
                    if (!gi4Var.equals(poa.f)) {
                        throw new IllegalStateException("Unknown route");
                    }
                    gVar2 = new g(27);
                }
                return new ni4(str, gi4Var, bundle, 0, null, gVar2, 24);
            default:
                if (!((ote) this.b).a.contains(gi4Var)) {
                    return null;
                }
                if (gi4Var.equals(ote.c)) {
                    Boolean boolB3 = l8j.b("need_fade", bundle);
                    ni4Var = new ni4(str, gi4Var, bundle, 1, boolB3 != null ? boolB3.booleanValue() : false ? new li4(new nte(0), new nte(1)) : new li4((q8g) null, 3), new np1(bundle, 10));
                } else {
                    if (!gi4Var.equals(ote.d)) {
                        throw new IllegalStateException(az1.h("invalid route ", gi4Var));
                    }
                    String string = bundle.getString("text");
                    if (!(string == null || string.length() == 0)) {
                        ShareData shareData = new ShareData(0, null, null, null, null, null, null, 127, null);
                        shareData.text = string;
                        shareData.type = 0;
                        bundle.putParcelable("share_data", shareData);
                    }
                    ni4Var = new ni4(str, gi4Var, bundle, 1, null, new np1(bundle, 11), 16);
                }
                return ni4Var;
        }
    }
}
