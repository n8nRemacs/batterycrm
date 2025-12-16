package Ct;

import Y61.k;
import com.avito.android.cv_publish.deeplink.CvPublishLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CvPublishDeeplinkModule_ProvideCvPublishDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LCt/e;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_job_cv-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2729b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f2730a;

    /* compiled from: CvPublishDeeplinkModule_ProvideCvPublishDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCt/e$a;", "", "<init>", "()V", "_avito_job_cv-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k c cVar) {
        this.f2730a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f2730a;
        f2729b.getClass();
        d.f2728a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CvPublishLink.class, new C13350a(), new C43834a.b.C11809b(cVar));
    }
}
