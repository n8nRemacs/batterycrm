package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.L0;
import java.util.WeakHashMap;

/* compiled from: ViewUtils.java */
@RestrictTo
/* loaded from: classes6.dex */
public class O {

    /* compiled from: ViewUtils.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f356745b;

        public a(View view) {
            this.f356745b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f356745b;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    /* compiled from: ViewUtils.java */
    public class b implements androidx.core.view.M {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f356746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f356747c;

        public b(c cVar, d dVar) {
            this.f356746b = cVar;
            this.f356747c = dVar;
        }

        @Override // androidx.core.view.M
        public final J0 h(View view, J0 j02) {
            d dVar = new d();
            d dVar2 = this.f356747c;
            dVar.f356748a = dVar2.f356748a;
            dVar.f356749b = dVar2.f356749b;
            dVar.f356750c = dVar2.f356750c;
            dVar.f356751d = dVar2.f356751d;
            this.f356746b.a(view, j02, dVar);
            return j02;
        }
    }

    /* compiled from: ViewUtils.java */
    public interface c {
        J0 a(View view, J0 j02, d dVar);
    }

    /* compiled from: ViewUtils.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f356748a;

        /* renamed from: b, reason: collision with root package name */
        public int f356749b;

        /* renamed from: c, reason: collision with root package name */
        public int f356750c;

        /* renamed from: d, reason: collision with root package name */
        public int f356751d;
    }

    public static void a(@j.N View view, @j.N c cVar) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        d dVar = new d();
        dVar.f356748a = paddingStart;
        dVar.f356749b = paddingTop;
        dVar.f356750c = paddingEnd;
        dVar.f356751d = paddingBottom;
        C22823h0.K(view, new b(cVar, dVar));
        if (view.isAttachedToWindow()) {
            C22823h0.A(view);
        } else {
            view.addOnAttachStateChangeListener(new Q());
        }
    }

    public static float b(@j.r int i12, @j.N Context context) {
        return TypedValue.applyDimension(1, i12, context.getResources().getDisplayMetrics());
    }

    @j.P
    public static ViewGroup c(@j.P View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @j.P
    public static N d(@j.P View view) {
        if (view == null) {
            return null;
        }
        return new M(view);
    }

    public static void e(@j.N View view) {
        L0 l0R = C22823h0.r(view);
        if (l0R != null) {
            l0R.a(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.d.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean f(View view) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode g(int i12, PorterDuff.Mode mode) {
        if (i12 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i12 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i12 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i12) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void h(@j.N View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
