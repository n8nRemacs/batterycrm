package B91;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class x implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f1190b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioEditText f1191c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1192d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f1193e;

    public x(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SdkBioEditText sdkBioEditText, RecyclerView recyclerView, TextView textView) {
        this.f1189a = constraintLayout;
        this.f1190b = appCompatImageView;
        this.f1191c = sdkBioEditText;
        this.f1192d = recyclerView;
        this.f1193e = textView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1189a;
    }
}
