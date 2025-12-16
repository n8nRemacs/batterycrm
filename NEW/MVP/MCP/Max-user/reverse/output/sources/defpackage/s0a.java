package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class s0a extends ConstraintLayout implements u6g {
    public r0a F0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;
    public final ImageView J0;
    public final ImageView K0;
    public final a58 L0;

    public s0a(Context context) {
        super(context, null);
        r0a r0aVar = r0a.a;
        this.F0 = r0aVar;
        ImageView imageView = new ImageView(getContext());
        q0a q0aVar = q0a.PLAYBACK;
        imageView.setId(q0aVar.a);
        float f = 40;
        kt3 kt3Var = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var.t = 0;
        float f2 = 4;
        kt3Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        kt3Var.i = 0;
        kt3Var.l = 0;
        imageView.setLayoutParams(kt3Var);
        imageView.setBackground(getSelectableItemOvalBackground());
        v1a v1aVar = a93.s0;
        imageView.setColorFilter(v1aVar.y(imageView).getIcon().k);
        u45.n(8, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(cxc.ic_play_24_filled);
        this.G0 = imageView;
        TextView textView = new TextView(getContext());
        q0a q0aVar2 = q0a.TITLE;
        textView.setId(q0aVar2.a);
        kt3 kt3Var2 = new kt3(0, -2);
        int i = q0aVar2.a;
        textView.setId(i);
        kt3Var2.i = 0;
        int i2 = q0aVar.a;
        kt3Var2.s = i2;
        q0a q0aVar3 = q0a.SPEED;
        kt3Var2.u = q0aVar3.a;
        q0a q0aVar4 = q0a.SUBTITLE;
        kt3Var2.k = q0aVar4.a;
        kt3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        float f3 = 6;
        ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = kti.d(vw4.d().getDisplayMetrics().density * f3);
        textView.setLayoutParams(kt3Var2);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(az1.f(dpg.m, textView, v1aVar, textView).e);
        this.H0 = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setId(q0aVar4.a);
        kt3 kt3Var3 = new kt3(0, -2);
        kt3Var3.j = i;
        ((ViewGroup.MarginLayoutParams) kt3Var3).topMargin = kti.d(3 * vw4.d().getDisplayMetrics().density);
        kt3Var3.s = i2;
        kt3Var3.setMarginStart(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        int i3 = q0aVar3.a;
        kt3Var3.u = i3;
        kt3Var3.l = 0;
        ((ViewGroup.MarginLayoutParams) kt3Var3).bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(kt3Var3);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(az1.f(dpg.o, textView2, v1aVar, textView2).g);
        this.I0 = textView2;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(i3);
        kt3 kt3Var4 = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        q0a q0aVar5 = q0a.CLOSE;
        kt3Var4.u = q0aVar5.a;
        kt3Var4.i = 0;
        kt3Var4.l = 0;
        int iD = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        imageView2.setPadding(iD, iD, iD, iD);
        imageView2.setLayoutParams(kt3Var4);
        imageView2.setBackground(getSelectableItemOvalBackground());
        v(imageView2, r0aVar);
        this.J0 = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(q0aVar5.a);
        kt3 kt3Var5 = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        kt3Var5.v = 0;
        kt3Var5.i = 0;
        kt3Var5.l = 0;
        float f4 = 10;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f4);
        imageView3.setPadding(iD2, iD2, iD2, iD2);
        imageView3.setLayoutParams(kt3Var5);
        imageView3.setImageResource(ivd.Q);
        imageView3.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView3).getIcon().j));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.K0 = imageView3;
        a58 a58Var = new a58(dvc.linearProgressIndicatorStyle, a58.z0, getContext());
        b58 b58Var = (b58) a58Var.a;
        r48 r48Var = new r48(b58Var);
        r48Var.b = 300.0f;
        Context context2 = a58Var.getContext();
        a58Var.setIndeterminateDrawable(new pj7(context2, b58Var, r48Var, b58Var.h == 0 ? new s48(b58Var) : new u48(context2, b58Var)));
        a58Var.setProgressDrawable(new ou4(a58Var.getContext(), b58Var, r48Var));
        a58Var.setId(q0a.PROGRESS.a);
        float f5 = 2;
        kt3 kt3Var6 = new kt3(-1, kti.d(vw4.d().getDisplayMetrics().density * f5));
        kt3Var6.l = 0;
        a58Var.setLayoutParams(kt3Var6);
        a58Var.setTrackCornerRadius(kti.d(f4 * vw4.d().getDisplayMetrics().density));
        a58Var.setTrackThickness(kti.d(f5 * vw4.d().getDisplayMetrics().density));
        a58Var.setMin(0);
        a58Var.setMax(1000);
        a58Var.setProgress(0);
        a58Var.setTrackColor(0);
        a58Var.setIndicatorColor(v1aVar.y(a58Var).b().a.n);
        this.L0 = a58Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(imageView2);
        addView(imageView3);
        addView(a58Var);
    }

    private final Drawable getSelectableItemOvalBackground() {
        return new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this).c().a.a.e), null, new ShapeDrawable(new OvalShape()));
    }

    public final ImageView getCloseButton() {
        return this.K0;
    }

    public final ImageView getPlaybackButton() {
        return this.G0;
    }

    public final r0a getPlaybackSpeed() {
        return this.F0;
    }

    public final ImageView getPlaybackSpeedButton() {
        return this.J0;
    }

    public final a58 getProgress() {
        return this.L0;
    }

    public final TextView getSubtitle() {
        return this.I0;
    }

    public final TextView getTitle() {
        return this.H0;
    }

    public final View getTooltipAnchor() {
        return this.J0;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Drawable selectableItemOvalBackground = getSelectableItemOvalBackground();
        ImageView imageView = this.G0;
        imageView.setBackground(selectableItemOvalBackground);
        v1a v1aVar = a93.s0;
        imageView.setColorFilter(v1aVar.y(imageView).getIcon().k);
        this.H0.setTextColor(v1aVar.y(this).getText().e);
        this.I0.setTextColor(v1aVar.y(this).getText().g);
        ImageView imageView2 = this.J0;
        Drawable drawable = imageView2.getDrawable();
        EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
        if (enhancedVectorDrawable != null) {
            z18.e(enhancedVectorDrawable, "border", v1aVar.y(imageView2).getIcon().h);
            z18.e(enhancedVectorDrawable, "text", v1aVar.y(imageView2).getIcon().j);
        }
        imageView2.setBackground(getSelectableItemOvalBackground());
        ImageView imageView3 = this.K0;
        imageView3.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView3).getIcon().j));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.L0.setIndicatorColor(v1aVar.y(this).b().a.n);
    }

    public final void setIsPlaying(boolean z) {
        this.G0.setImageResource(z ? cxc.ic_pause_24_filled : cxc.ic_play_24_filled);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.K0;
        if (onClickListener == null) {
            imageView.setOnClickListener(null);
        } else {
            f8j.d(imageView, 1000L, onClickListener);
        }
    }

    public final void setOnPlaybackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.G0;
        if (onClickListener == null) {
            imageView.setOnClickListener(null);
        } else {
            f8j.d(imageView, 200L, onClickListener);
        }
    }

    public final void setOnPlaybackSpeedClick(em6 em6Var) {
        ImageView imageView = this.J0;
        if (em6Var == null) {
            imageView.setOnClickListener(null);
        } else {
            f8j.d(imageView, 200L, new kg6(em6Var, 19, this));
        }
    }

    public final void setPlaybackSpeed(r0a r0aVar) {
        ImageView imageView = this.J0;
        if (r0aVar != null) {
            v(imageView, r0aVar);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void setProgress(float f) {
        a58 a58Var = this.L0;
        a58Var.setProgress(n7j.c((int) ((f * (a58Var.getMax() - a58Var.getMin())) + a58Var.getMin()), a58Var.getMin(), a58Var.getMax()));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.I0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void v(ImageView imageView, r0a r0aVar) {
        int i;
        imageView.setVisibility(0);
        int iOrdinal = r0aVar.ordinal();
        if (iOrdinal == 0) {
            i = cxc.speed_1x;
        } else if (iOrdinal == 1) {
            i = cxc.speed_1_5x;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = cxc.speed_2x;
        }
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(imageView.getContext(), i);
        v1a v1aVar = a93.s0;
        z18.e(enhancedVectorDrawable, "border", v1aVar.y(imageView).getIcon().h);
        z18.e(enhancedVectorDrawable, "text", v1aVar.y(imageView).getIcon().j);
        imageView.setImageDrawable(enhancedVectorDrawable);
        this.F0 = r0aVar;
    }
}
