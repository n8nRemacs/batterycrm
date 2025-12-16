package Kr;

import com.avito.android.cpt.activation.i;
import com.avito.android.cpt.activation.l;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptActivationLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C14344b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f9674a;

    /* renamed from: b, reason: collision with root package name */
    public final l f9675b;

    public c(dv.b bVar, l lVar) {
        this.f9674a = bVar;
        this.f9675b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14344b((a.InterfaceC4053a) this.f9674a.get(), (i) this.f9675b.get());
    }
}
