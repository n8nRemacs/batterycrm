package Fc1;

import feedback.shared.sdk.api.network.entities.Targeting;
import java.util.Map;

@dagger.internal.e
/* loaded from: classes9.dex */
public final class H0 implements InterfaceC13669m0 {

    /* renamed from: a, reason: collision with root package name */
    public final W0 f4987a;

    public H0(W0 w02) {
        this.f4987a = w02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Fc1.InterfaceC13669m0
    public final U a(Targeting targeting) {
        W0 w02 = this.f4987a;
        return new U(targeting, (InterfaceC13753v4) w02.f5265a.f393949a, (C13611f5) w02.f5266b.get(), (Map) w02.f5267c.get());
    }
}
