package com.avito.android.remote_device_id.task.short_task;

import Y61.k;
import android.os.Bundle;
import com.avito.android.remote_device_id.domain.g;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: RemoteDeviceIdTask.kt */
@C11.a
@InterfaceC42189a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote_device_id/task/short_task/a;", "Lcom/avito/android/service/short_task/ShortTask;", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class a implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.remote_device_id.domain.a f254426a;

    /* compiled from: RemoteDeviceIdTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote_device_id/domain/g;", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Lcom/avito/android/remote_device_id/domain/g;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.remote_device_id.task.short_task.a$a, reason: collision with other inner class name */
    public static final class C7615a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C7615a<T, R> f254427b = new C7615a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            g gVar = (g) obj;
            if (gVar instanceof g.b) {
                return ShortTask.Status.f274030b;
            }
            if (gVar instanceof g.a) {
                return ShortTask.Status.f274031c;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public a(@k com.avito.android.remote_device_id.domain.a aVar) {
        this.f254426a = aVar;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @k
    public final I<ShortTask.Status> start(@k Bundle bundle) {
        return this.f254426a.a().r(C7615a.f254427b);
    }
}
