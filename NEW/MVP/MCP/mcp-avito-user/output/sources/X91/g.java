package X91;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18735l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BiometryActivity biometryActivity) {
        super(0);
        this.f18735l = biometryActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        return Integer.valueOf(this.f18735l.getIntent().getIntExtra(BeduinPromoBlockModel.SERIALIZED_NAME_THEME, 0));
    }
}
