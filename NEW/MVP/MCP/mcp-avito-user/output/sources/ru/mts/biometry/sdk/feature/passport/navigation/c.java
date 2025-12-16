package ru.mts.biometry.sdk.feature.passport.navigation;

import B91.D;
import androidx.view.C22981N;
import ba1.C25609a;
import ba1.C25610b;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.sdk.base.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/feature/passport/navigation/c;", "Lru/mts/biometry/sdk/base/p;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class c extends p {
    @Override // ru.mts.biometry.sdk.base.p
    public final void b() {
        C43259k.d(C22981N.a(getLifecycle()), C43262l0.f411947c, null, new C25609a(this, null), 2);
    }

    @Override // ru.mts.biometry.sdk.base.p
    public final void c() {
        C43259k.d(C22981N.a(getLifecycle()), C43262l0.f411947c, null, new C25610b(this, null), 2);
    }

    @Override // ru.mts.biometry.sdk.base.p, ru.mts.biometry.sdk.base.b
    /* renamed from: f5 */
    public final void d5(D d12) {
        super.d5(d12);
        d12.f1020j.setOnCloseListener(new A91.p(this, 24));
    }
}
