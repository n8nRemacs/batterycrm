package X91;

import java.util.Iterator;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.PassportValidationScreenDesign;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class d extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18730l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BiometryActivity biometryActivity) {
        super(0);
        this.f18730l = biometryActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        Object next;
        PassportValidationScreenDesign.a aVar = PassportValidationScreenDesign.f436371b;
        int intExtra = this.f18730l.getIntent().getIntExtra("passportResultScreenDesign", 0);
        aVar.getClass();
        Iterator it = ((AbstractC42738c) PassportValidationScreenDesign.f436374e).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PassportValidationScreenDesign) next).ordinal() == intExtra) {
                break;
            }
        }
        PassportValidationScreenDesign passportValidationScreenDesign = (PassportValidationScreenDesign) next;
        return passportValidationScreenDesign == null ? PassportValidationScreenDesign.f436372c : passportValidationScreenDesign;
    }
}
