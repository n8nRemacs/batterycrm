package kl;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.bxcontent.BxContentIntentFactory;
import com.avito.android.bxcontent.C29245q0;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BxContentDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C42709a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29245q0 f406581a;

    /* renamed from: b, reason: collision with root package name */
    public final O f406582b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f406583c;

    public b(C29245q0 c29245q0, O o12, dv.b bVar) {
        this.f406581a = c29245q0;
        this.f406582b = o12;
        this.f406583c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42709a((BxContentIntentFactory) this.f406581a.get(), (L) this.f406582b.get(), (a.InterfaceC4053a) this.f406583c.get());
    }
}
