package com.my.target.nativeads.views;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import e11.C39924z;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public class c extends LinearLayout implements k {

    /* renamed from: b, reason: collision with root package name */
    @P
    public View.OnClickListener f365034b;

    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.target.nativeads.views.c$c, reason: collision with other inner class name */
    public @interface InterfaceC10791c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    static {
        int i12 = C39924z.f394913b;
        View.generateViewId();
    }

    @Override // com.my.target.nativeads.views.k
    @N
    public Button getCtaButtonView() {
        return null;
    }

    @Override // com.my.target.nativeads.views.k
    @N
    public TextView getDescriptionTextView() {
        return null;
    }

    @Override // com.my.target.nativeads.views.k
    @N
    public MediaAdView getMediaAdView() {
        return null;
    }

    @Override // com.my.target.nativeads.views.k
    @N
    public TextView getTitleTextView() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        throw null;
    }

    @Override // android.view.View
    public void setOnClickListener(@P View.OnClickListener onClickListener) {
        this.f365034b = onClickListener;
        super.setOnClickListener(onClickListener);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).setOnClickListener(null);
        }
    }

    @Override // com.my.target.nativeads.views.k
    @N
    public View getView() {
        return this;
    }
}
