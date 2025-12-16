package Ic;

import Y61.k;
import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdjustReattributionInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIc/d;", "Ldagger/internal/h;", "LIc/b;", "a", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8214b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f8215a;

    /* compiled from: AdjustReattributionInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIc/d$a;", "", "<init>", "()V", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k l lVar) {
        this.f8215a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f8215a.f393949a;
        f8214b.getClass();
        return new b(application);
    }
}
