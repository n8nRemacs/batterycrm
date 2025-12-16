package FX0;

import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.v;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes10.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f4737f = Logger.getLogger(v.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final m f4738a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4739b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.backends.e f4740c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.d f4741d;

    /* renamed from: e, reason: collision with root package name */
    public final GX0.a f4742e;

    @Inject
    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, m mVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, GX0.a aVar) {
        this.f4739b = executor;
        this.f4740c = eVar;
        this.f4738a = mVar;
        this.f4741d = dVar;
        this.f4742e = aVar;
    }

    @Override // FX0.e
    public final void a(r rVar, j jVar, com.google.android.datatransport.i iVar) {
        this.f4739b.execute(new a(this, rVar, iVar, jVar, 0));
    }
}
