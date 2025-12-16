package sa1;

import Aa1.d;
import android.os.Bundle;
import androidx.camera.camera2.internal.G;
import androidx.fragment.app.Fragment;
import ru.mts.biometry.sdk.OnboardingSettings;
import ru.mts.biometry.sdk.feature.selfie.ui.camera.i;
import ru.mts.biometry.sdk.feature.selfie.ui.intro.e;

/* renamed from: sa1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48142b implements d {
    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        OnboardingSettings onboardingSettings = C91.a.f2019f;
        boolean z12 = onboardingSettings != null ? onboardingSettings.f436370b : false;
        if (i12 == 0) {
            return z12 ? new e() : new i();
        }
        if (i12 == 1) {
            return new i();
        }
        throw new IllegalStateException(G.e(i12, "Position ", " not implemented"));
    }

    @Override // Aa1.d
    public final int a() {
        return 2;
    }
}
