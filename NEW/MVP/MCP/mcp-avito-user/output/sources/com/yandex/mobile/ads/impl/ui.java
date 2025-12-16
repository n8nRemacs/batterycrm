package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes8.dex */
public final class ui implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final View.OnClickListener f390565a;

    /* renamed from: b, reason: collision with root package name */
    private final int f390566b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f390567c;

    /* renamed from: d, reason: collision with root package name */
    private float f390568d;

    /* renamed from: e, reason: collision with root package name */
    private float f390569e;

    public ui(@j.N Context context, @j.N View.OnClickListener onClickListener) {
        this.f390565a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f390566b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.P View view) {
        this.f390565a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int i12 = action & 255;
        if (i12 == 0) {
            this.f390568d = x12;
            this.f390569e = y12;
            this.f390567c = true;
        } else {
            if (i12 == 1) {
                if (!this.f390567c) {
                    return true;
                }
                this.f390565a.onClick(view);
                return true;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    this.f390567c = false;
                }
            } else if (this.f390567c) {
                int i13 = (int) (x12 - this.f390568d);
                int i14 = (int) (y12 - this.f390569e);
                if ((i14 * i14) + (i13 * i13) > this.f390566b) {
                    this.f390567c = false;
                }
            }
        }
        return false;
    }
}
