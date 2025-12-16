package B91;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class I implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f1062a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioButton f1063b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f1064c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1065d;

    /* renamed from: e, reason: collision with root package name */
    public final SdkBioToolbar f1066e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f1067f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f1068g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f1069h;

    public I(LinearLayout linearLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, RecyclerView recyclerView, SdkBioToolbar sdkBioToolbar, TextView textView, TextView textView2, AppCompatTextView appCompatTextView) {
        this.f1062a = linearLayout;
        this.f1063b = sdkBioButton;
        this.f1064c = sdkBioButton2;
        this.f1065d = recyclerView;
        this.f1066e = sdkBioToolbar;
        this.f1067f = textView;
        this.f1068g = textView2;
        this.f1069h = appCompatTextView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1062a;
    }
}
