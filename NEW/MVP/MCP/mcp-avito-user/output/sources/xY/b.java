package xy;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile_settings.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: EditSellerTypeLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<C50020a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f442715a;

    /* renamed from: b, reason: collision with root package name */
    public final d f442716b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f442717c;

    public b(q qVar, d dVar, dv.b bVar) {
        this.f442715a = qVar;
        this.f442716b = dVar;
        this.f442717c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50020a((o) this.f442715a.get(), (com.avito.android.profile_settings.b) this.f442716b.get(), (a.InterfaceC4053a) this.f442717c.get());
    }
}
