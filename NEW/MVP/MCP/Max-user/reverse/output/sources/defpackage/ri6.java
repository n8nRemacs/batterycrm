package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ri6 implements qi6 {
    public final int a;
    public final /* synthetic */ c b;

    public ri6(c cVar, int i) {
        this.b = cVar;
        this.a = i;
    }

    @Override // defpackage.qi6
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.b;
        a aVar = cVar.z;
        int i = this.a;
        if (aVar == null || i >= 0 || !aVar.u().T(-1, 0)) {
            return cVar.U(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
