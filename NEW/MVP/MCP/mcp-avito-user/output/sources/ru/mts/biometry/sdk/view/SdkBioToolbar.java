package ru.mts.biometry.sdk.view;

import B91.w;
import Ca1.d;
import H91.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z91.c;

@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "", "text", "Lkotlin/G0;", "setText", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "listener", "setOnBackListener", "(Landroid/view/View$OnClickListener;)V", "setOnHintListener", "setOnCloseListener", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioToolbar extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final int f436590e = c.a(10);

    /* renamed from: b, reason: collision with root package name */
    public final w f436591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f436592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f436593d;

    @j
    public SdkBioToolbar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLayoutParams().height = getContext().getResources().getDimensionPixelSize(R.dimen.sdk_bio_toolbar_height);
    }

    public void setOnBackListener(@k View.OnClickListener listener) {
        w wVar = this.f436591b;
        wVar.f1185b.setVisibility(0);
        d.a(listener, wVar.f1185b);
    }

    public void setOnCloseListener(@k View.OnClickListener listener) {
        w wVar = this.f436591b;
        wVar.f1186c.setVisibility(0);
        d.a(listener, wVar.f1186c);
    }

    public void setOnHintListener(@k View.OnClickListener listener) {
        w wVar = this.f436591b;
        wVar.f1187d.setVisibility(this.f436593d);
        d.a(listener, wVar.f1187d);
    }

    public final void setText(@l String text) {
        w wVar = this.f436591b;
        wVar.f1188e.setText(text);
        wVar.f1188e.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        postInvalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkBioToolbar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.sdkBioToolbarStyle : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_Biometry_Toolbar : i13;
        super(context, attributeSet, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_toolbar, this);
        int i15 = R.id.iv_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(this, R.id.iv_back);
        if (appCompatImageView != null) {
            i15 = R.id.iv_close;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) g2.d.a(this, R.id.iv_close);
            if (appCompatImageView2 != null) {
                int i16 = R.id.iv_hint;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) g2.d.a(this, R.id.iv_hint);
                if (appCompatImageView3 != null) {
                    i16 = R.id.tv_toolbar_title;
                    TextView textView = (TextView) g2.d.a(this, R.id.tv_toolbar_title);
                    if (textView != null) {
                        this.f436591b = new w(this, appCompatImageView, appCompatImageView2, appCompatImageView3, textView);
                        this.f436592c = 1;
                        setFitsSystemWindows(true);
                        if (attributeSet != null) {
                            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.m.f443902j, i12, i13);
                            try {
                                appCompatImageView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(1));
                                appCompatImageView3.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(5));
                                appCompatImageView2.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(3));
                                int i17 = 4;
                                this.f436592c = typedArrayObtainStyledAttributes.getInteger(4, 1);
                                int integer = typedArrayObtainStyledAttributes.getInteger(6, 0);
                                if (integer == 0) {
                                    i17 = 0;
                                } else if (integer != 1) {
                                    i17 = 8;
                                }
                                this.f436593d = i17;
                                int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                                if (color != 0) {
                                    appCompatImageView.setImageTintList(ColorStateList.valueOf(color));
                                    appCompatImageView3.setImageTintList(ColorStateList.valueOf(color));
                                    appCompatImageView2.setImageTintList(ColorStateList.valueOf(color));
                                    textView.setTextColor(color);
                                }
                                int color2 = typedArrayObtainStyledAttributes.getColor(2, 0);
                                if (color2 != 0) {
                                    setBackgroundColor(color2);
                                }
                                typedArrayObtainStyledAttributes.recycle();
                            } catch (Throwable th2) {
                                typedArrayObtainStyledAttributes.recycle();
                                throw th2;
                            }
                        }
                        setElevation(f436590e);
                        if (this.f436592c == 0) {
                            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                            dVar.g(this);
                            dVar.f(R.id.iv_close, 7);
                            dVar.i(R.id.iv_close, 6, 0, 6);
                            dVar.c(this);
                            return;
                        }
                        return;
                    }
                }
                i15 = i16;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i15)));
    }
}
