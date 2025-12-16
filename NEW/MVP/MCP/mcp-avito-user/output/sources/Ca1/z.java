package Ca1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewTreeObserver;
import ru.mts.biometry.sdk.view.SdkBioPassportFrame;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* loaded from: classes9.dex */
public final class z implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrame f2281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrameView f2282c;

    public z(SdkBioPassportFrame sdkBioPassportFrame, SdkBioPassportFrameView sdkBioPassportFrameView) {
        this.f2281b = sdkBioPassportFrame;
        this.f2282c = sdkBioPassportFrameView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SdkBioPassportFrame sdkBioPassportFrame = this.f2281b;
        if (sdkBioPassportFrame.getMeasuredWidth() <= 0 || sdkBioPassportFrame.getMeasuredHeight() <= 0) {
            return;
        }
        sdkBioPassportFrame.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        SdkBioPassportFrameView sdkBioPassportFrameView = this.f2282c;
        B91.y yVar = sdkBioPassportFrameView.f436568b;
        RectF frameRect = yVar.f1195b.getFrameRect();
        Rect rect = new Rect();
        frameRect.roundOut(rect);
        sdkBioPassportFrameView.f436570d.setValue(rect);
        SdkBioPassportFrameView.c(sdkBioPassportFrameView, yVar.f1196c, rect);
        SdkBioPassportFrameView.c(sdkBioPassportFrameView, yVar.f1197d, rect);
        sdkBioPassportFrameView.a();
    }
}
