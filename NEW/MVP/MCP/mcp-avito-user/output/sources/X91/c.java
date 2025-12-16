package X91;

import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18729l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BiometryActivity biometryActivity) {
        super(0);
        this.f18729l = biometryActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        String stringExtra = this.f18729l.getIntent().getStringExtra("clientToken");
        if (stringExtra == null || stringExtra.length() <= 0 || C43066x.K(stringExtra)) {
            return null;
        }
        return stringExtra;
    }
}
