package B91;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class t implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1167a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioButton f1168b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioEditText f1169c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f1170d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f1171e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f1172f;

    /* renamed from: g, reason: collision with root package name */
    public final SdkBioToolbar f1173g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f1174h;

    public t(ConstraintLayout constraintLayout, SdkBioButton sdkBioButton, SdkBioEditText sdkBioEditText, TextView textView, RecyclerView recyclerView, TextView textView2, SdkBioToolbar sdkBioToolbar, TextView textView3) {
        this.f1167a = constraintLayout;
        this.f1168b = sdkBioButton;
        this.f1169c = sdkBioEditText;
        this.f1170d = textView;
        this.f1171e = recyclerView;
        this.f1172f = textView2;
        this.f1173g = sdkBioToolbar;
        this.f1174h = textView3;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1167a;
    }
}
