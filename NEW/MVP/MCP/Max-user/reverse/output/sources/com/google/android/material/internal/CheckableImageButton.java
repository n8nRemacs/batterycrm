package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.fvc;
import defpackage.hfh;
import defpackage.ss0;
import defpackage.v73;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] t0 = {R.attr.state_checked};
    public boolean d;
    public boolean o;
    public boolean s0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, fvc.imageButtonStyle);
        this.o = true;
        this.s0 = true;
        hfh.n(this, new ss0(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), t0) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v73)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v73 v73Var = (v73) parcelable;
        super.onRestoreInstanceState(v73Var.a);
        setChecked(v73Var.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v73 v73Var = new v73(super.onSaveInstanceState());
        v73Var.c = this.d;
        return v73Var;
    }

    public void setCheckable(boolean z) {
        if (this.o != z) {
            this.o = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.o || this.d == z) {
            return;
        }
        this.d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.s0 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.s0) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
