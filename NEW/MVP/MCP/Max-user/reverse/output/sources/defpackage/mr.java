package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class mr extends dtf implements sm6 {
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(Continuation continuation, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen) {
        super(2, continuation);
        this.X = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        mr mrVar = (mr) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mrVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mr mrVar = new mr(continuation, this.X);
        mrVar.o = obj;
        return mrVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws JSONException {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        g8j.b(obj);
        if (fni.a((cda) this.o, jc3.b)) {
            yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
            xr xrVarY0 = this.X.y0();
            pr prVar = (pr) xrVarY0.B0.getValue();
            if (prVar != null) {
                Iterator it = prVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((f7g) next).a) {
                        break;
                    }
                }
                f7g f7gVar = (f7g) next;
                int iOrdinal = ((t75) xrVarY0.b.a.a.getValue()).ordinal();
                Iterator it2 = prVar.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((zq) next2).b.equals(Boolean.TRUE)) {
                        break;
                    }
                }
                zq zqVar = (zq) next2;
                if (f7gVar != null) {
                    Iterator it3 = xrVarY0.G0.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it3.next();
                        if (((f7g) next4).a) {
                            break;
                        }
                    }
                    if (!f7gVar.equals(next4)) {
                        String strN = f7gVar.n();
                        String strA = xr.A(null, zqVar != null ? Integer.valueOf(zqVar.a.a) : null, Integer.valueOf(iOrdinal), Boolean.TRUE);
                        hg8 hg8VarD = strA == null ? null : xrVarY0.w("BACKGROUND", strN, strA).d();
                        if (hg8VarD != null) {
                            xrVarY0.y().h(hg8VarD);
                        }
                    }
                }
                if (zqVar != null) {
                    Iterator it4 = xrVarY0.G0.b.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                        if (((zq) next3).b.equals(Boolean.TRUE)) {
                            break;
                        }
                    }
                    if (!zqVar.equals(next3)) {
                        String strValueOf = String.valueOf(zqVar.a.a);
                        String strA2 = xr.A(f7gVar != null ? f7gVar.n() : null, null, Integer.valueOf(iOrdinal), Boolean.TRUE);
                        hg8 hg8VarD2 = strA2 == null ? null : xrVarY0.w("THEME", strValueOf, strA2).d();
                        if (hg8VarD2 != null) {
                            xrVarY0.y().h(hg8VarD2);
                        }
                    }
                }
                if (iOrdinal != xrVarY0.H0) {
                    String strA3 = xr.A(f7gVar != null ? f7gVar.n() : null, zqVar != null ? Integer.valueOf(zqVar.a.a) : null, null, Boolean.TRUE);
                    if (strA3 != null) {
                        xrVarY0.w("TEXT_SIZE", String.valueOf(iOrdinal), strA3).d();
                    }
                }
            }
            yr.c.p0().d();
        }
        return qqg.a;
    }
}
