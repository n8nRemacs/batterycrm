package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
final class c8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h8 f384192a = new h8();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final o80 f384193b = new o80();

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final Dialog f384194a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final o80 f384195b;

        public a(@j.N Dialog dialog, @j.N o80 o80Var) {
            this.f384194a = dialog;
            this.f384195b = o80Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@j.N View view) {
            this.f384195b.getClass();
            o80.a(view);
            this.f384194a.dismiss();
        }
    }

    public static class b implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        private float f384196a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final View f384197b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final Dialog f384198c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final o80 f384199d;

        public b(@j.N ViewGroup viewGroup, @j.N Dialog dialog, @j.N o80 o80Var) {
            this.f384197b = viewGroup;
            this.f384198c = dialog;
            this.f384199d = o80Var;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(@j.N View view, @j.N MotionEvent motionEvent) {
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f384196a = rawY;
                return true;
            }
            if (action == 1) {
                if (rawY > this.f384196a) {
                    this.f384199d.getClass();
                    o80.a(view);
                    this.f384198c.dismiss();
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
            float f12 = this.f384196a;
            if (rawY > f12) {
                this.f384197b.setTranslationY(rawY - f12);
            } else {
                this.f384197b.setTranslationY(0.0f);
            }
            return true;
        }
    }

    public final void a(@j.N ViewGroup viewGroup, @j.N Dialog dialog) {
        this.f384192a.getClass();
        View viewFindViewById = viewGroup.findViewById(R.id.adtune_drag_view_container);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new b(viewGroup, dialog, this.f384193b));
        }
        this.f384192a.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.adtune_background_view);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new a(dialog, this.f384193b));
        }
    }
}
