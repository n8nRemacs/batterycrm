package com.avito.android.remote_device_id.domain;

import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lm0.InterfaceC43796a;
import om0.InterfaceC44824d;

/* compiled from: RemoteDeviceIdTaskInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote_device_id/domain/e;", "Ldagger/internal/h;", "Lcom/avito/android/remote_device_id/domain/b;", "a", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f254421c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f254422a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final om0.f f254423b;

    /* compiled from: RemoteDeviceIdTaskInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote_device_id/domain/e$a;", "", "<init>", "()V", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k u uVar, @k om0.f fVar) {
        this.f254422a = uVar;
        this.f254423b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43796a interfaceC43796a = (InterfaceC43796a) this.f254422a.get();
        InterfaceC44824d interfaceC44824d = (InterfaceC44824d) this.f254423b.get();
        f254421c.getClass();
        return new b(interfaceC43796a, interfaceC44824d);
    }
}
