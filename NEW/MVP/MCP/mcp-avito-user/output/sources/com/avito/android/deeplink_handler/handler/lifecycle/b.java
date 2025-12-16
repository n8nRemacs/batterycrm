package com.avito.android.deeplink_handler.handler.lifecycle;

import Y61.k;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OnCreateSingleActionPerformer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/lifecycle/b;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onCreate", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22983P f134545b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N f134546c;

    /* compiled from: OnCreateSingleActionPerformer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            b bVar = b.this;
            if (bVar.f134545b.getLifecycle().getF46705d().a(Lifecycle.State.f46681d)) {
                bVar.f134546c.invoke();
            } else {
                bVar.f134545b.getLifecycle().a(bVar);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k InterfaceC22983P interfaceC22983P, @k Y41.a<G0> aVar) {
        this.f134545b = interfaceC22983P;
        this.f134546c = (N) aVar;
        com.avito.android.util.concurrent.b.a(new a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @InterfaceC23042i0(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.f134546c.invoke();
        this.f134545b.getLifecycle().c(this);
    }
}
