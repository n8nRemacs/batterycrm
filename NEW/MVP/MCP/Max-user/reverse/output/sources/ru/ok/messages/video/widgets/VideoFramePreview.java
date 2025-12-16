package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bwf;
import defpackage.cei;
import defpackage.gvd;
import defpackage.m7g;
import defpackage.nca;
import defpackage.q1g;
import defpackage.rw4;
import defpackage.s34;
import defpackage.uga;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* loaded from: classes2.dex */
public class VideoFramePreview extends RoundedRectFrameLayout implements m7g {
    public final AppCompatImageView o;
    public final AppCompatTextView s0;
    public final ProgressBar t0;
    public final View u0;

    public VideoFramePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rw4 rw4VarA = rw4.a();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        this.o = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.o, new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.t0 = progressBar;
        progressBar.setIndeterminate(true);
        int i = rw4VarA.l;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.t0, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        this.s0 = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.s0.setTextSize(rw4VarA.t);
        this.s0.setGravity(17);
        AppCompatTextView appCompatTextView2 = this.s0;
        int i2 = rw4VarA.f;
        int i3 = rw4VarA.b;
        appCompatTextView2.setPadding(i2, i3, i2, i3);
        float f = rw4VarA.o;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#333344"));
        shapeDrawable.setAlpha(96);
        this.s0.setBackground(shapeDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = rw4VarA.d;
        addView(this.s0, layoutParams2);
        this.u0 = new View(getContext());
        this.u0.setBackground(uga.e(null, Integer.valueOf(s34.a(getContext(), gvd.d)), Integer.valueOf(rw4VarA.a), rw4VarA.g));
        addView(this.u0, new FrameLayout.LayoutParams(-1, -1));
        setCornerRadius(rw4VarA.h);
        b();
    }

    public final void a(boolean z) {
        if (z) {
            this.t0.setVisibility(0);
        } else {
            this.t0.setVisibility(8);
        }
    }

    @Override // defpackage.m7g
    public final void b() {
        Context context = getContext();
        bwf bwfVar = q1g.a0;
        cei.l(this.t0, nca.d(context).k);
    }

    public void setPreviewEnabled(boolean z) {
        View view = this.u0;
        AppCompatImageView appCompatImageView = this.o;
        if (!z) {
            appCompatImageView.setVisibility(8);
            setBackground(null);
            view.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            bwf bwfVar = q1g.a0;
            setBackgroundColor(nca.d(context).w);
            view.setVisibility(0);
        }
    }
}
