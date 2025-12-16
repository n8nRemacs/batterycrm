package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z4i {
    public final void a(WorkRequest workRequest) {
        List listSingletonList = Collections.singletonList(workRequest);
        c5i c5iVar = (c5i) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new p4i(c5iVar, null, uk5.b, listSingletonList, 0).c();
    }

    public abstract vib b(String str, int i, nrb nrbVar);
}
