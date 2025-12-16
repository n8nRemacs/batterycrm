package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public abstract class o8j {
    public static final void a(x74 x74Var, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            t8j.a(th);
        } catch (Throwable th2) {
            saj.a(th, th2);
            b7j.c(x74Var, th);
        }
    }

    public static wu1 b(List list, qee qeeVar, a07 a07Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wsf.g(((zr4) it.next()).c()));
        }
        return ixi.a(new nl(ixi.a(new pv3(wsf.k(arrayList), a07Var, MultiFileUploader.UPLOAD_NEXT_INTERVAL, 4)), qeeVar, list, 4));
    }
}
