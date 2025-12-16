package pa1;

import kotlin.jvm.internal.N;
import z91.s;

/* loaded from: classes9.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.gallery.g f428612l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar) {
        super(0);
        this.f428612l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar = this.f428612l;
        gVar.requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        la1.c cVar = (la1.c) sVar.f443929i.getValue();
        gVar.requireContext();
        s sVar2 = z91.e.f443908b;
        if (sVar2 != null) {
            return new l(cVar, sVar2.b());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
