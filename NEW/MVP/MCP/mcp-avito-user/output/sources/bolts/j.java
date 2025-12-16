package bolts;

import java.util.concurrent.ExecutorService;

/* compiled from: Task.java */
/* loaded from: classes10.dex */
class j implements h<Object, Void> {
    @Override // bolts.h
    public final Void a(x<Object> xVar) {
        ExecutorService executorService = x.f57476g;
        try {
            new n(null, null, xVar);
            throw null;
        } catch (Exception e12) {
            new ExecutorException(e12);
            throw null;
        }
    }
}
