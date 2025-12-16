package va1;

import androidx.view.M0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import ra1.C47626b;

/* loaded from: classes9.dex */
public final class m extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final C47626b f440863E;

    /* renamed from: J, reason: collision with root package name */
    public final W91.h f440864J;

    /* renamed from: K, reason: collision with root package name */
    public final C91.h f440865K;

    /* renamed from: L, reason: collision with root package name */
    public N0 f440866L;

    /* renamed from: M, reason: collision with root package name */
    public final Z1 f440867M = p2.a(h.f440853a);

    public m(C47626b c47626b, W91.h hVar, C91.h hVar2) {
        this.f440863E = c47626b;
        this.f440864J = hVar;
        this.f440865K = hVar2;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        N0 n02 = this.f440866L;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
    }
}
