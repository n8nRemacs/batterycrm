package B91;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class n implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1147a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f1148b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioEditText f1149c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1150d;

    public n(ConstraintLayout constraintLayout, ProgressBar progressBar, SdkBioEditText sdkBioEditText, RecyclerView recyclerView) {
        this.f1147a = constraintLayout;
        this.f1148b = progressBar;
        this.f1149c = sdkBioEditText;
        this.f1150d = recyclerView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1147a;
    }
}
