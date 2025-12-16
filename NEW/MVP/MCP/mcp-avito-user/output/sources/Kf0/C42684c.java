package kf0;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.notification_banner.FashionAuthenticationCheckBannerSlot;

/* compiled from: FashionAuthenticationCheckBannerWrapperFactory_Impl.java */
@dagger.internal.e
/* renamed from: kf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42684c implements InterfaceC42683b {

    /* renamed from: a, reason: collision with root package name */
    public final C42685d f406530a;

    public C42684c(C42685d c42685d) {
        this.f406530a = c42685d;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new C42682a((FashionAuthenticationCheckBannerSlot) slot, this.f406530a.f406531a.get());
    }
}
