package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class vw7 implements zy7 {
    public static final vw7 a = new vw7();
    public static final tee b;

    static {
        ree[] reeVarArr = new ree[0];
        wm7 wm7Var = new wm7(7);
        if (vmf.F("kotlinx.serialization.json.JsonElement")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        nnf nnfVar = nnf.b;
        r5c r5cVar = r5c.b;
        if (r5cVar.equals(nnfVar)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        da3 da3Var = new da3("kotlinx.serialization.json.JsonElement");
        wm7Var.invoke(da3Var);
        b = new tee("kotlinx.serialization.json.JsonElement", r5cVar, da3Var.b.size(), ys.D(reeVarArr), da3Var);
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        sw7 sw7Var = (sw7) obj;
        ioi.a(bVar);
        if (sw7Var instanceof tx7) {
            bVar.p(ux7.a, sw7Var);
        } else if (sw7Var instanceof kx7) {
            bVar.p(mx7.a, sw7Var);
        } else {
            if (!(sw7Var instanceof gw7)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.p(iw7.a, sw7Var);
        }
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return ioi.b(lh4Var).G();
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
