package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ihb extends bp4 {
    public final ArrayList e;

    public ihb(Context context, ArrayList arrayList) {
        super(context);
        this.e = arrayList;
    }

    @Override // defpackage.bp4
    public final ak4 c(Context context) {
        i40 i40Var = new i40(context);
        l50[] l50VarArr = (l50[]) this.e.toArray(new l50[0]);
        i40Var.e = new sa9((l50[]) Arrays.copyOf(l50VarArr, l50VarArr.length));
        return i40Var.b();
    }

    @Override // defpackage.bp4
    public final void d(yl5 yl5Var, Looper looper, ArrayList arrayList) {
        h5g h5gVar = new h5g(yl5Var, looper, new a3b(29));
        h5gVar.V0 = true;
        arrayList.add(h5gVar);
    }
}
