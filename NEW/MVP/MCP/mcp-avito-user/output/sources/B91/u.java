package B91;

import android.view.View;
import android.widget.TextView;
import ru.mts.biometry.sdk.view.SdkBioTextField;

/* loaded from: classes9.dex */
public final class u implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final SdkBioTextField f1175a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f1176b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1177c;

    public u(SdkBioTextField sdkBioTextField, TextView textView, TextView textView2) {
        this.f1175a = sdkBioTextField;
        this.f1176b = textView;
        this.f1177c = textView2;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1175a;
    }
}
