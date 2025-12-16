package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dcj implements ccj {
    public final ArrayList a;

    public dcj(Context context, bcj bcjVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new gcj(context, bcjVar));
    }

    @Override // defpackage.ccj
    public final void a(lk6 lk6Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ccj) it.next()).a(lk6Var);
        }
    }
}
