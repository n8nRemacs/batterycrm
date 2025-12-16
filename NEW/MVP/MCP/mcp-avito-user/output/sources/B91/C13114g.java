package B91;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* renamed from: B91.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13114g implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1114a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioEditText f1115b;

    public C13114g(ConstraintLayout constraintLayout, SdkBioEditText sdkBioEditText) {
        this.f1114a = constraintLayout;
        this.f1115b = sdkBioEditText;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1114a;
    }
}
