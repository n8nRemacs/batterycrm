package T91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class o extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.o f15465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ru.mts.biometry.sdk.feature.documentResult.ui.o oVar) {
        super(0);
        this.f15465l = oVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        return Boolean.valueOf(this.f15465l.requireArguments().getBoolean("innRequired", false));
    }
}
