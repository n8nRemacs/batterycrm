package B91;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.mts.biometry.sdk.view.SdkBioButton;

/* renamed from: B91.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13113f implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final SdkBioButton f1110a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f1111b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1112c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f1113d;

    public C13113f(SdkBioButton sdkBioButton, AppCompatImageView appCompatImageView, View view, AppCompatTextView appCompatTextView) {
        this.f1110a = sdkBioButton;
        this.f1111b = appCompatImageView;
        this.f1112c = view;
        this.f1113d = appCompatTextView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1110a;
    }
}
