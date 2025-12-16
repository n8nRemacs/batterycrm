package ru.mts.biometry.sdk.view;

import B91.y;
import Ba1.AnimationAnimationListenerC13124b;
import Ca1.A;
import Ca1.u;
import Ca1.v;
import Ca1.w;
import Ca1.x;
import Ca1.z;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import g2.d;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z91.c;

@s0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioPassportFrameView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "", "ratio", "setRatio", "(F)V", "", "value", "setFramePadding", "(I)V", "drawableRes", "setDrawable", "LCa1/x;", VoiceInfo.STATE, "setState", "(LCa1/x;)V", "", "isActive", "()Z", "setActive", "(Z)V", "Landroidx/lifecycle/Y;", "Landroid/graphics/Rect;", "getFrameRect", "()Landroidx/lifecycle/Y;", "frameRect", "ru/mts/biometry/sdk/view/u", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioPassportFrameView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f436567e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final y f436568b;

    /* renamed from: c, reason: collision with root package name */
    public x f436569c;

    /* renamed from: d, reason: collision with root package name */
    public final C23038g0 f436570d;

    @j
    public SdkBioPassportFrameView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_view_passport_frame, this);
        int i12 = R.id.frame;
        SdkBioPassportFrame sdkBioPassportFrame = (SdkBioPassportFrame) d.a(this, R.id.frame);
        if (sdkBioPassportFrame != null) {
            i12 = R.id.frame_progress;
            ProgressBar progressBar = (ProgressBar) d.a(this, R.id.frame_progress);
            if (progressBar != null) {
                i12 = R.id.iv_success;
                AppCompatImageView appCompatImageView = (AppCompatImageView) d.a(this, R.id.iv_success);
                if (appCompatImageView != null) {
                    this.f436568b = new y(this, sdkBioPassportFrame, progressBar, appCompatImageView);
                    this.f436569c = u.f2276a;
                    this.f436570d = new C23038g0(new Rect());
                    sdkBioPassportFrame.getViewTreeObserver().addOnGlobalLayoutListener(new z(sdkBioPassportFrame, this));
                    if (attributeSet != null) {
                        setupAttrs(attributeSet);
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i12)));
    }

    public static final void c(SdkBioPassportFrameView sdkBioPassportFrameView, View view, Rect rect) {
        view.setTranslationX(rect.left + ((rect.width() / 2.0f) - (view.getWidth() / 2.0f)));
        view.setTranslationY(rect.top + ((rect.height() / 2.0f) - (view.getHeight() / 2.0f)));
    }

    private final void setupAttrs(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.m.f443898f);
        try {
            float f12 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            SdkBioPassportFrame sdkBioPassportFrame = this.f436568b.f1195b;
            sdkBioPassportFrame.setVerticalBias(f12);
            if (drawable != null) {
                sdkBioPassportFrame.setDrawable(drawable);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a() {
        x xVar = this.f436569c;
        boolean z12 = xVar instanceof u;
        y yVar = this.f436568b;
        if (z12) {
            yVar.f1196c.setAnimation(null);
            AppCompatImageView appCompatImageView = yVar.f1197d;
            appCompatImageView.setAnimation(null);
            yVar.f1196c.setVisibility(4);
            appCompatImageView.setVisibility(4);
            setActive(false);
            return;
        }
        if (xVar instanceof v) {
            yVar.f1196c.setVisibility(0);
            ProgressBar progressBar = yVar.f1196c;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setFillAfter(true);
            progressBar.startAnimation(alphaAnimation);
            yVar.f1197d.setVisibility(4);
            setActive(true);
            return;
        }
        if (xVar instanceof w) {
            setActive(true);
            ProgressBar progressBar2 = yVar.f1196c;
            A a12 = new A(yVar);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            alphaAnimation2.setFillAfter(true);
            progressBar2.startAnimation(alphaAnimation2);
            alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC13124b(a12));
        }
    }

    public final void b(String str, String str2) {
        SdkBioPassportFrame sdkBioPassportFrame = this.f436568b.f1195b;
        sdkBioPassportFrame.getClass();
        if (str.equals(sdkBioPassportFrame.f436564v) && str2.equals(sdkBioPassportFrame.f436565w)) {
            return;
        }
        sdkBioPassportFrame.f436564v = str;
        sdkBioPassportFrame.f436565w = str2;
        sdkBioPassportFrame.invalidate();
    }

    @k
    public final AbstractC22991Y<Rect> getFrameRect() {
        return this.f436570d;
    }

    public final void setActive(boolean z12) {
        this.f436568b.f1195b.f436548f.K5(Boolean.valueOf(z12));
    }

    public final void setDrawable(@InterfaceC42165v int drawableRes) {
        Drawable drawable = androidx.core.content.d.getDrawable(getContext(), drawableRes);
        if (drawable != null) {
            y yVar = this.f436568b;
            yVar.f1195b.setDrawable(drawable);
            SdkBioPassportFrame sdkBioPassportFrame = yVar.f1195b;
            sdkBioPassportFrame.getViewTreeObserver().addOnGlobalLayoutListener(new Ca1.y(sdkBioPassportFrame, this));
        }
    }

    public final void setFramePadding(int value) {
        this.f436568b.f1195b.setFramePadding(value);
    }

    public final void setRatio(float ratio) {
        this.f436568b.f1195b.setRatio(ratio);
    }

    public final void setState(@k x state) {
        this.f436569c = state;
        a();
    }

    public /* synthetic */ SdkBioPassportFrameView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
