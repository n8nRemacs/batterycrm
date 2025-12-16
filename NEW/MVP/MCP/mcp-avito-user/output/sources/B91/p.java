package B91;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class p implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f1154b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f1155c;

    /* renamed from: d, reason: collision with root package name */
    public final NestedScrollView f1156d;

    /* renamed from: e, reason: collision with root package name */
    public final SdkBioButton f1157e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioToolbar f1158f;

    public p(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, SdkBioButton sdkBioButton, SdkBioToolbar sdkBioToolbar) {
        this.f1153a = constraintLayout;
        this.f1154b = linearLayout;
        this.f1155c = recyclerView;
        this.f1156d = nestedScrollView;
        this.f1157e = sdkBioButton;
        this.f1158f = sdkBioToolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1153a;
    }
}
