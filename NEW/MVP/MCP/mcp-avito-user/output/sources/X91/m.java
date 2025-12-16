package X91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class m extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.main.ui.m f18741l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ru.mts.biometry.sdk.feature.main.ui.m mVar) {
        super(0);
        this.f18741l = mVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        C91.a aVar = C91.a.f2014a;
        this.f18741l.requireContext();
        z91.s sVar = z91.e.f443908b;
        if (sVar != null) {
            return new o(new U91.d(sVar.a().f436312a));
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
