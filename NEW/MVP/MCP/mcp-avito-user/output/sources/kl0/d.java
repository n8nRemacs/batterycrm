package kL0;

import com.avito.android.deep_linking.links.DiscountLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasDiscountHandlerModule_ProvideVasDiscountHandlerFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C42595b f406247a;

    public d(C42595b c42595b) {
        this.f406247a = c42595b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C42595b c42595b = this.f406247a;
        C42596c.f406246a.getClass();
        return new C43834a(DiscountLink.class, null, new C43834a.b.C11809b(c42595b));
    }
}
