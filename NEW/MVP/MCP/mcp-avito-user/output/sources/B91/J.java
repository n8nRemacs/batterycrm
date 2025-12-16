package B91;

import android.view.View;
import android.widget.FrameLayout;
import ru.mts.biometry.sdk.view.SdkBioList;

/* loaded from: classes9.dex */
public final class J implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1070a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioList f1071b;

    public J(FrameLayout frameLayout, SdkBioList sdkBioList) {
        this.f1070a = frameLayout;
        this.f1071b = sdkBioList;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1070a;
    }
}
