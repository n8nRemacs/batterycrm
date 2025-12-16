package Ca1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import ru.mts.biometry.sdk.view.SdkBioPassportFrame;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* loaded from: classes9.dex */
public final class y implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrame f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrameView f2280c;

    public y(SdkBioPassportFrame sdkBioPassportFrame, SdkBioPassportFrameView sdkBioPassportFrameView) {
        this.f2279b = sdkBioPassportFrame;
        this.f2280c = sdkBioPassportFrameView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SdkBioPassportFrame sdkBioPassportFrame = this.f2279b;
        if (sdkBioPassportFrame.getMeasuredWidth() <= 0 || sdkBioPassportFrame.getMeasuredHeight() <= 0) {
            return;
        }
        sdkBioPassportFrame.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        SdkBioPassportFrameView sdkBioPassportFrameView = this.f2280c;
        B91.y yVar = sdkBioPassportFrameView.f436568b;
        RectF frameRect = yVar.f1195b.getFrameRect();
        ProgressBar progressBar = yVar.f1196c;
        Rect rect = new Rect();
        frameRect.roundOut(rect);
        SdkBioPassportFrameView.c(sdkBioPassportFrameView, progressBar, rect);
        AppCompatImageView appCompatImageView = yVar.f1197d;
        Rect rect2 = new Rect();
        frameRect.roundOut(rect2);
        SdkBioPassportFrameView.c(sdkBioPassportFrameView, appCompatImageView, rect2);
    }
}
