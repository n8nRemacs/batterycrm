package T91;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class h extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15455l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ru.mts.biometry.sdk.feature.documentResult.ui.h hVar) {
        super(0);
        this.f15455l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        return Boolean.valueOf(this.f15455l.requireArguments().getBoolean("innRequired", false));
    }
}
