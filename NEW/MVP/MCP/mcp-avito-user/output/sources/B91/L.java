package B91;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public final class L implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f1080c;

    public L(ConstraintLayout constraintLayout, ImageView imageView, Toolbar toolbar) {
        this.f1078a = constraintLayout;
        this.f1079b = imageView;
        this.f1080c = toolbar;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1078a;
    }
}
