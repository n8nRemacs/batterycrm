package com.google.android.gms.common;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C36704g0;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class r extends FrameLayout implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public int f349541b;

    /* renamed from: c, reason: collision with root package name */
    public int f349542c;

    /* renamed from: d, reason: collision with root package name */
    public View f349543d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public View.OnClickListener f349544e;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public final void a(int i12, int i13) throws Resources.NotFoundException {
        this.f349541b = i12;
        this.f349542c = i13;
        Context context = getContext();
        View view = this.f349543d;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f349543d = C36704g0.c(context, this.f349541b, this.f349542c);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i14 = this.f349541b;
            int i15 = this.f349542c;
            com.google.android.gms.common.internal.G g12 = new com.google.android.gms.common.internal.G(context, null, R.attr.buttonStyle);
            Resources resources = context.getResources();
            g12.setTypeface(Typeface.DEFAULT_BOLD);
            g12.setTextSize(14.0f);
            int i16 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            g12.setMinHeight(i16);
            g12.setMinWidth(i16);
            int iA2 = com.google.android.gms.common.internal.G.a(i15, com.avito.android.R.drawable.common_google_signin_btn_icon_dark, com.avito.android.R.drawable.common_google_signin_btn_icon_light, com.avito.android.R.drawable.common_google_signin_btn_icon_light);
            int iA3 = com.google.android.gms.common.internal.G.a(i15, com.avito.android.R.drawable.common_google_signin_btn_text_dark, com.avito.android.R.drawable.common_google_signin_btn_text_light, com.avito.android.R.drawable.common_google_signin_btn_text_light);
            if (i14 == 0 || i14 == 1) {
                iA2 = iA3;
            } else if (i14 != 2) {
                throw new IllegalStateException(AK.c.g(i14, "Unknown button size: "));
            }
            Drawable drawable = resources.getDrawable(iA2);
            drawable.setTintList(resources.getColorStateList(com.avito.android.R.color.common_google_signin_btn_tint));
            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
            g12.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(com.google.android.gms.common.internal.G.a(i15, com.avito.android.R.color.common_google_signin_btn_text_dark, com.avito.android.R.color.common_google_signin_btn_text_light, com.avito.android.R.color.common_google_signin_btn_text_light));
            C36729v.j(colorStateList);
            g12.setTextColor(colorStateList);
            if (i14 == 0) {
                g12.setText(resources.getString(com.avito.android.R.string.common_signin_button_text));
            } else if (i14 == 1) {
                g12.setText(resources.getString(com.avito.android.R.string.common_signin_button_text_long));
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException(AK.c.g(i14, "Unknown button size: "));
                }
                g12.setText((CharSequence) null);
            }
            g12.setTransformationMethod(null);
            if (com.google.android.gms.common.util.l.a(g12.getContext())) {
                g12.setGravity(19);
            }
            this.f349543d = g12;
        }
        addView(this.f349543d);
        this.f349543d.setEnabled(isEnabled());
        this.f349543d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.N View view) {
        View.OnClickListener onClickListener = this.f349544e;
        if (onClickListener == null || view != this.f349543d) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i12) throws Resources.NotFoundException {
        a(this.f349541b, i12);
    }

    @Override // android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        this.f349543d.setEnabled(z12);
    }

    @Override // android.view.View
    public void setOnClickListener(@j.P View.OnClickListener onClickListener) {
        this.f349544e = onClickListener;
        View view = this.f349543d;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@j.N Scope[] scopeArr) throws Resources.NotFoundException {
        a(this.f349541b, this.f349542c);
    }

    public void setSize(int i12) throws Resources.NotFoundException {
        a(i12, this.f349542c);
    }
}
