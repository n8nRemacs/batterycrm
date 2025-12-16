package ru.ok.messages.video.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.gvd;
import defpackage.kt3;
import defpackage.m7g;
import defpackage.mvd;
import defpackage.pe8;
import defpackage.q0d;
import defpackage.rw4;
import defpackage.t1b;
import defpackage.zm;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class LiveVideoPlaceHolderView extends ConstraintLayout implements m7g {
    public final AppCompatTextView F0;
    public final AppCompatTextView G0;
    public final GradientDrawable H0;

    public LiveVideoPlaceHolderView(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet);
        pe8 pe8Var = ((t1b) zm.a()).j().a;
        getContext();
        rw4 rw4VarA = rw4.a();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.H0 = gradientDrawable;
        setBackground(gradientDrawable);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.F0 = appCompatTextView;
        appCompatTextView.setId(q0d.view_not_started_live_video__title);
        this.F0.setGravity(17);
        this.F0.setTextSize(0, rw4VarA.v);
        this.F0.setText(getResources().getText(mvd.b2));
        kt3 kt3Var = new kt3(0, -2);
        kt3Var.i = 0;
        kt3Var.t = 0;
        kt3Var.v = 0;
        kt3Var.k = q0d.view_not_started_live_video__subtitle;
        kt3Var.K = 2;
        int i = rw4VarA.e;
        ((ViewGroup.MarginLayoutParams) kt3Var).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) kt3Var).rightMargin = i;
        addView(this.F0, kt3Var);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null);
        this.G0 = appCompatTextView2;
        appCompatTextView2.setId(q0d.view_not_started_live_video__subtitle);
        this.G0.setGravity(17);
        this.G0.setTextSize(0, rw4VarA.v);
        this.G0.setTypeface(null, 1);
        kt3 kt3Var2 = new kt3(0, -2);
        kt3Var2.j = q0d.view_not_started_live_video__title;
        kt3Var2.t = 0;
        kt3Var2.v = 0;
        kt3Var2.l = 0;
        int i2 = rw4VarA.e;
        ((ViewGroup.MarginLayoutParams) kt3Var2).leftMargin = i2;
        ((ViewGroup.MarginLayoutParams) kt3Var2).rightMargin = i2;
        addView(this.G0, kt3Var2);
        b();
    }

    @Override // defpackage.m7g
    public final void b() throws Resources.NotFoundException {
        this.H0.setColor(getContext().getResources().getColor(gvd.a));
        this.F0.setTextColor(-1);
        this.G0.setTextColor(-1);
    }

    public void setCorners(float[] fArr) {
        this.H0.setCornerRadii(fArr);
    }
}
