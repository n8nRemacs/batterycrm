package B91;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: B91.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13116i implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f1120a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f1121b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1122c;

    public C13116i(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f1120a = linearLayout;
        this.f1121b = imageView;
        this.f1122c = textView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1120a;
    }
}
