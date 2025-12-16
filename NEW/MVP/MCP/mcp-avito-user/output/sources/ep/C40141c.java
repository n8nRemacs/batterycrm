package ep;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: ep.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40141c implements h<C40140b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f395378a;

    /* renamed from: b, reason: collision with root package name */
    public final l f395379b;

    public C40141c(l lVar, Provider provider) {
        this.f395378a = provider;
        this.f395379b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40140b(this.f395378a.get(), (ClientRoomArguments) this.f395379b.f393949a);
    }
}
