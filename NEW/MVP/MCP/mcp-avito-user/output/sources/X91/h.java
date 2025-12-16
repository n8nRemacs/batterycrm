package X91;

import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class h extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BiometryActivity biometryActivity) {
        super(0);
        this.f18736l = biometryActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        return Boolean.valueOf(this.f18736l.getIntent().getBooleanExtra("useINN", false));
    }
}
