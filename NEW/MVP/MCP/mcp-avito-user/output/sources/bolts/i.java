package bolts;

import bolts.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Task.java */
/* loaded from: classes10.dex */
class i implements h<Object, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f57464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f57465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f57466c;

    public i(y yVar, h hVar, Executor executor) {
        this.f57464a = yVar;
        this.f57465b = hVar;
        this.f57466c = executor;
    }

    @Override // bolts.h
    public final Void a(x<Object> xVar) {
        Executor executor = this.f57466c;
        y yVar = this.f57464a;
        h hVar = this.f57465b;
        ExecutorService executorService = x.f57476g;
        try {
            ((b.ExecutorC2017b) executor).execute(new m(yVar, hVar, xVar));
            return null;
        } catch (Exception e12) {
            yVar.b(new ExecutorException(e12));
            return null;
        }
    }
}
