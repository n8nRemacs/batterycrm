package B91;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class r implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1161a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioToolbar f1162b;

    public r(ConstraintLayout constraintLayout, SdkBioToolbar sdkBioToolbar) {
        this.f1161a = constraintLayout;
        this.f1162b = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1161a;
    }
}
