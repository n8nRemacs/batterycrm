package B91;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public final class s implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1163a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f1164b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1165c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f1166d;

    public s(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.f1163a = constraintLayout;
        this.f1164b = appCompatImageView;
        this.f1165c = textView;
        this.f1166d = textView2;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1163a;
    }
}
