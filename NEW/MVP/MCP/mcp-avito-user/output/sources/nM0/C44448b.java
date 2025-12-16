package nm0;

import Y61.k;
import com.avito.android.remote_device_id.task.background_task.RemoteDeviceIdBackgroundStartupTask;
import com.avito.android.service.short_task.j;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RemoteDeviceIdBackgroundTaskModule_ProvideRemoteDeviceIdBackgroundStartupTaskFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnm0/b;", "Ldagger/internal/h;", "Lcom/avito/android/remote_device_id/task/background_task/RemoteDeviceIdBackgroundStartupTask;", "a", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nm0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44448b implements h<RemoteDeviceIdBackgroundStartupTask> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f419147b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f419148a;

    /* compiled from: RemoteDeviceIdBackgroundTaskModule_ProvideRemoteDeviceIdBackgroundStartupTaskFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm0/b$a;", "", "<init>", "()V", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nm0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44448b(@k f fVar) {
        this.f419148a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f419148a.get();
        f419147b.getClass();
        C44447a.f419146a.getClass();
        return new RemoteDeviceIdBackgroundStartupTask(jVar);
    }
}
