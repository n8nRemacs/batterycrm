package B91;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* renamed from: B91.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13119l implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1142a;

    /* renamed from: b, reason: collision with root package name */
    public final C13114g f1143b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1144c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1145d;

    /* renamed from: e, reason: collision with root package name */
    public final SdkBioToolbar f1146e;

    public C13119l(ConstraintLayout constraintLayout, C13114g c13114g, TextView textView, SdkBioButton sdkBioButton, SdkBioToolbar sdkBioToolbar) {
        this.f1142a = constraintLayout;
        this.f1143b = c13114g;
        this.f1144c = textView;
        this.f1145d = sdkBioButton;
        this.f1146e = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1142a;
    }
}
