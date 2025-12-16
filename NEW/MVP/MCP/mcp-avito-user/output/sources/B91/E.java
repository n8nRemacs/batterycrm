package B91;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ru.mts.biometry.sdk.view.SdkBioButton;

/* loaded from: classes9.dex */
public final class E implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1023a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioButton f1024b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f1025c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1026d;

    /* renamed from: e, reason: collision with root package name */
    public final SdkBioButton f1027e;

    public E(FrameLayout frameLayout, SdkBioButton sdkBioButton, AppCompatImageView appCompatImageView, SdkBioButton sdkBioButton2, SdkBioButton sdkBioButton3, TextView textView, TextView textView2, LinearLayout linearLayout) {
        this.f1023a = frameLayout;
        this.f1024b = sdkBioButton;
        this.f1025c = appCompatImageView;
        this.f1026d = sdkBioButton2;
        this.f1027e = sdkBioButton3;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1023a;
    }
}
