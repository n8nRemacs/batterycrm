package B91;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import ru.mts.biometry.sdk.view.SdkBioPassportFrame;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* loaded from: classes9.dex */
public final class y implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final SdkBioPassportFrameView f1194a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioPassportFrame f1195b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressBar f1196c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f1197d;

    public y(SdkBioPassportFrameView sdkBioPassportFrameView, SdkBioPassportFrame sdkBioPassportFrame, ProgressBar progressBar, AppCompatImageView appCompatImageView) {
        this.f1194a = sdkBioPassportFrameView;
        this.f1195b = sdkBioPassportFrame;
        this.f1196c = progressBar;
        this.f1197d = appCompatImageView;
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1194a;
    }
}
