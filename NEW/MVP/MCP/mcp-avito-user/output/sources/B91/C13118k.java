package B91;

import android.view.View;
import android.widget.FrameLayout;
import ru.mts.biometry.sdk.view.SdkBioTextField;

/* renamed from: B91.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13118k implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1140a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioTextField f1141b;

    public C13118k(FrameLayout frameLayout, SdkBioTextField sdkBioTextField) {
        this.f1140a = frameLayout;
        this.f1141b = sdkBioTextField;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1140a;
    }
}
