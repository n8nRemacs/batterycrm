package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.avito.android.R;
import j.N;
import j.P;
import j.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CustomViewTarget.java */
/* loaded from: classes5.dex */
public abstract class g<T extends View, Z> implements q<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final a f339596b;

    /* renamed from: c, reason: collision with root package name */
    public final T f339597c;

    /* compiled from: CustomViewTarget.java */
    @k0
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        @k0
        @P
        public static Integer f339598d;

        /* renamed from: a, reason: collision with root package name */
        public final View f339599a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f339600b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @P
        public ViewTreeObserverOnPreDrawListenerC10517a f339601c;

        /* compiled from: CustomViewTarget.java */
        /* renamed from: com.bumptech.glide.request.target.g$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10517a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f339602b;

            public ViewTreeObserverOnPreDrawListenerC10517a(@N a aVar) {
                this.f339602b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Log.isLoggable("CustomViewTarget", 2);
                a aVar = this.f339602b.get();
                if (aVar == null) {
                    return true;
                }
                ArrayList arrayList = aVar.f339600b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                View view = aVar.f339599a;
                int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int iA2 = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int iA3 = aVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA3 <= 0 && iA3 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((p) it.next()).c(iA2, iA3);
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.f339601c);
                }
                aVar.f339601c = null;
                arrayList.clear();
                return true;
            }
        }

        public a(@N View view) {
            this.f339599a = view;
        }

        public final int a(int i12, int i13, int i14) {
            int i15 = i13 - i14;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i12 - i14;
            if (i16 > 0) {
                return i16;
            }
            View view = this.f339599a;
            if (view.isLayoutRequested() || i13 != -2) {
                return 0;
            }
            Log.isLoggable("CustomViewTarget", 4);
            Context context = view.getContext();
            if (f339598d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                com.bumptech.glide.util.k.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f339598d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f339598d.intValue();
        }
    }

    public g(@N T t12) {
        com.bumptech.glide.util.k.c(t12, "Argument must not be null");
        this.f339597c = t12;
        this.f339596b = new a(t12);
    }

    @Override // com.bumptech.glide.request.target.q
    @P
    public final com.bumptech.glide.request.d a() {
        Object tag = this.f339597c.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof com.bumptech.glide.request.d) {
            return (com.bumptech.glide.request.d) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.bumptech.glide.request.target.q
    public final void b(@P Drawable drawable) {
        a aVar = this.f339596b;
        ViewTreeObserver viewTreeObserver = aVar.f339599a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f339601c);
        }
        aVar.f339601c = null;
        aVar.f339600b.clear();
    }

    @Override // com.bumptech.glide.request.target.q
    public final void f(@P com.bumptech.glide.request.i iVar) {
        this.f339597c.setTag(R.id.glide_custom_view_target_tag, iVar);
    }

    @Override // com.bumptech.glide.request.target.q
    public final void h(@N com.bumptech.glide.request.i iVar) {
        this.f339596b.f339600b.remove(iVar);
    }

    @Override // com.bumptech.glide.request.target.q
    public final void j(@N com.bumptech.glide.request.i iVar) {
        a aVar = this.f339596b;
        View view = aVar.f339599a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA2 = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = aVar.f339599a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA3 = aVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA2 > 0 || iA2 == Integer.MIN_VALUE) && (iA3 > 0 || iA3 == Integer.MIN_VALUE)) {
            iVar.c(iA2, iA3);
            return;
        }
        ArrayList arrayList = aVar.f339600b;
        if (!arrayList.contains(iVar)) {
            arrayList.add(iVar);
        }
        if (aVar.f339601c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC10517a viewTreeObserverOnPreDrawListenerC10517a = new a.ViewTreeObserverOnPreDrawListenerC10517a(aVar);
            aVar.f339601c = viewTreeObserverOnPreDrawListenerC10517a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10517a);
        }
    }

    public final String toString() {
        return "Target for: " + this.f339597c;
    }

    @Override // com.bumptech.glide.manager.i
    public final void e() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
    }

    @Override // com.bumptech.glide.request.target.q
    public final void k(@P Drawable drawable) {
    }
}
