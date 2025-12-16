package X91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class q extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.main.ui.r f18750l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ru.mts.biometry.sdk.feature.main.ui.r rVar) {
        super(0);
        this.f18750l = rVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        this.f18750l.requireContext();
        z91.s sVar = z91.e.f443908b;
        if (sVar != null) {
            return new s((U91.c) sVar.f443924d.getValue());
        }
        throw new IllegalArgumentException("DI delegate is null");
    }
}
