package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v0j implements r0j {
    public final ArrayList a;

    public v0j(Context context, o0j o0jVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new j1j(context, o0jVar));
    }

    @Override // defpackage.r0j
    public final void a(wib wibVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r0j) it.next()).a(wibVar);
        }
    }
}
