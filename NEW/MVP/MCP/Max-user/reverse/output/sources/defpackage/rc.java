package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes.dex */
public final class rc extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public /* synthetic */ rc() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        y59 y59Var;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                cjd cjdVar = (cjd) this.b.get();
                if (cjdVar != null) {
                    SparseArray sparseArray = cjdVar.h;
                    hjd hjdVar = cjdVar.i;
                    ArrayList arrayList = hjdVar.u0;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    djd djdVar = null;
                    djd djdVar2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == cjdVar.g) {
                                cjdVar.g = 0;
                                if (hjdVar.x0 == cjdVar) {
                                    if (hjd.A0) {
                                        Log.d("MediaRouteProviderProxy", hjdVar + ": Service connection error - Registration failed");
                                    }
                                    hjdVar.n();
                                }
                            }
                            if (((ejd) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                ejd.a(null, null);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (cjdVar.f == 0 && i3 == cjdVar.g && i4 >= 1) {
                                    cjdVar.g = 0;
                                    cjdVar.f = i4;
                                    hjdVar.l(cjdVar, c69.b(bundle));
                                    if (hjdVar.x0 == cjdVar) {
                                        hjdVar.y0 = true;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((djd) arrayList.get(i5)).b(hjdVar.x0);
                                        }
                                        j59 j59Var = hjdVar.o;
                                        if (j59Var != null) {
                                            cjd cjdVar2 = hjdVar.x0;
                                            int i6 = cjdVar2.d;
                                            cjdVar2.d = i6 + 1;
                                            cjdVar2.b(10, i6, 0, j59Var.a, null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                ejd ejdVar = (ejd) sparseArray.get(i3);
                                if (ejdVar != null) {
                                    sparseArray.remove(i3);
                                    ejdVar.b(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString(NegotiationErrorStat.KEY_ERROR) : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((ejd) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    ejd.a(string, bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (cjdVar.f != 0) {
                                    hjdVar.l(cjdVar, c69.b(bundle4));
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                ejd ejdVar2 = (ejd) sparseArray.get(i3);
                                if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                    ejdVar2.getClass();
                                    ejd.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                } else {
                                    sparseArray.remove(i3);
                                    ejdVar2.b(bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (cjdVar.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    h59 h59Var = bundle7 != null ? new h59(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            y59Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            y59Var = new y59(bundle9 != null ? new h59(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(y59Var);
                                    }
                                    if (hjdVar.x0 == cjdVar) {
                                        if (hjd.A0) {
                                            Log.d("MediaRouteProviderProxy", hjdVar + ": DynamicRouteDescriptors changed, descriptors=" + arrayList2);
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                djd djdVar3 = (djd) it2.next();
                                                if (djdVar3.a() == i4) {
                                                    djdVar2 = djdVar3;
                                                }
                                            }
                                        }
                                        if (djdVar2 instanceof fjd) {
                                            ((fjd) djdVar2).l(h59Var, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (hjdVar.x0 == cjdVar) {
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        djd djdVar4 = (djd) it3.next();
                                        if (djdVar4.a() == i4) {
                                            djdVar = djdVar4;
                                        }
                                    }
                                }
                                xu9 xu9Var = hjdVar.z0;
                                if (xu9Var != null && (djdVar instanceof a69)) {
                                    a69 a69Var = (a69) djdVar;
                                    h69 h69Var = (h69) ((ijd) ((f54) xu9Var.b).d);
                                    if (h69Var.s == a69Var) {
                                        h69Var.g(h69Var.c(), 2);
                                    }
                                }
                                arrayList.remove(djdVar);
                                djdVar.c();
                                hjdVar.o();
                                break;
                            }
                            break;
                    }
                    if (hjd.A0) {
                        Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
                        return;
                    }
                    return;
                }
                return;
            default:
                uld uldVar = (uld) this.b.get();
                if (uldVar == null) {
                    return;
                }
                int i7 = message.what;
                if (i7 == 0) {
                    lld lldVar = (lld) message.obj;
                    uldVar.a(lldVar.a, lldVar.b, lldVar.c);
                    return;
                }
                if (i7 == 1) {
                    uldVar.b(message.obj);
                    return;
                }
                if (i7 == 2) {
                    nld nldVar = (nld) message.obj;
                    uldVar.f(nldVar.a, nldVar.b);
                    return;
                } else {
                    if (i7 == 3) {
                        throw null;
                    }
                    if (i7 == 4) {
                        uldVar.e(message.obj);
                        return;
                    } else {
                        if (i7 != 5) {
                            throw new IllegalStateException(ho7.f(message.what, "unknown message with type "));
                        }
                        old oldVar = (old) message.obj;
                        uldVar.g(oldVar.a, oldVar.b);
                        return;
                    }
                }
        }
    }

    public rc(Looper looper, WeakReference weakReference) {
        super(looper);
        this.b = weakReference;
    }

    public rc(cjd cjdVar) {
        this.b = new WeakReference(cjdVar);
    }
}
