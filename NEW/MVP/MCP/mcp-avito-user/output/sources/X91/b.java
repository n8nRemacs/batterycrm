package X91;

import java.util.Iterator;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;
import ru.mts.biometry.api.SDKEnvironment;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18728l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BiometryActivity biometryActivity) {
        super(0);
        this.f18728l = biometryActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        Object next;
        SDKEnvironment.a aVar = SDKEnvironment.f436293b;
        int intExtra = this.f18728l.getIntent().getIntExtra("backend", 0);
        aVar.getClass();
        Iterator it = ((AbstractC42738c) SDKEnvironment.f436297f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SDKEnvironment) next).ordinal() == intExtra) {
                break;
            }
        }
        SDKEnvironment sDKEnvironment = (SDKEnvironment) next;
        if (sDKEnvironment != null) {
            return sDKEnvironment;
        }
        throw new IllegalArgumentException("Invalid integer value for Environment");
    }
}
