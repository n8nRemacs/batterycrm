package B91;

import android.view.View;
import android.widget.RadioButton;
import ru.mts.biometry.sdk.view.SdkBioRadioButton;

/* loaded from: classes9.dex */
public final class q implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final SdkBioRadioButton f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final RadioButton f1160b;

    public q(SdkBioRadioButton sdkBioRadioButton, RadioButton radioButton) {
        this.f1159a = sdkBioRadioButton;
        this.f1160b = radioButton;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1159a;
    }
}
