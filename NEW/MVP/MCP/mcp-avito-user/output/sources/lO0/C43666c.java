package lO0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InviteAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: lO0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43666c implements h<C43665b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f413734a;

    /* renamed from: b, reason: collision with root package name */
    public final l f413735b;

    public C43666c(l lVar, Provider provider) {
        this.f413734a = provider;
        this.f413735b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C43665b(this.f413734a.get(), (InvitationArguments) this.f413735b.f393949a);
    }
}
