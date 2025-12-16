package b30;

import Y61.k;
import com.avito.android.navigation_config.manager.f;
import com.avito.android.navigation_config.task.LoadNavigationConfigTask;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadNavigationConfigTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lb30/a;", "Ldagger/internal/h;", "Lcom/avito/android/navigation_config/task/LoadNavigationConfigTask;", "a", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C25399a implements h<LoadNavigationConfigTask> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C1988a f56852b = new C1988a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f56853a;

    /* compiled from: LoadNavigationConfigTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb30/a$a;", "", "<init>", "()V", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b30.a$a, reason: collision with other inner class name */
    public static final class C1988a {
        public /* synthetic */ C1988a(C42822w c42822w) {
            this();
        }

        public C1988a() {
        }
    }

    public C25399a(@k f fVar) {
        this.f56853a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.navigation_config.manager.a aVar = (com.avito.android.navigation_config.manager.a) this.f56853a.get();
        f56852b.getClass();
        return new LoadNavigationConfigTask(aVar);
    }
}
