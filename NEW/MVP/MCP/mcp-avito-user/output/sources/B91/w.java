package B91;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class w implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final SdkBioToolbar f1184a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f1185b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f1186c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f1187d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f1188e;

    public w(SdkBioToolbar sdkBioToolbar, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextView textView) {
        this.f1184a = sdkBioToolbar;
        this.f1185b = appCompatImageView;
        this.f1186c = appCompatImageView2;
        this.f1187d = appCompatImageView3;
        this.f1188e = textView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1184a;
    }
}
