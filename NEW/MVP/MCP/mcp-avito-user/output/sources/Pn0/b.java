package Pn0;

import com.avito.android.deep_linking.links.SingleTimeLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SingleTimeDeeplinkHandlerModule_ProvideMappingFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final On0.e f13280a;

    public b(On0.e eVar) {
        this.f13280a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        On0.e eVar = this.f13280a;
        C14815a.f13279a.getClass();
        return new C43834a(SingleTimeLink.class, null, new C43834a.b.C11809b(eVar));
    }
}
