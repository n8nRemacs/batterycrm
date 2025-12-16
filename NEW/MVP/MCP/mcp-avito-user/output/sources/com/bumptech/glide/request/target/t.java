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
import android.widget.ImageView;
import com.avito.android.R;
import j.InterfaceC42153i;
import j.N;
import j.P;
import j.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes5.dex */
public abstract class t<T extends View, Z> extends b<Z> {

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f339616c;

    /* renamed from: d, reason: collision with root package name */
    public final a f339617d;

    /* compiled from: ViewTarget.java */
    @k0
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        @k0
        @P
        public static Integer f339618d;

        /* renamed from: a, reason: collision with root package name */
        public final ImageView f339619a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f339620b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @P
        public ViewTreeObserverOnPreDrawListenerC10518a f339621c;

        /* compiled from: ViewTarget.java */
        /* renamed from: com.bumptech.glide.request.target.t$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10518a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f339622b;

            public ViewTreeObserverOnPreDrawListenerC10518a(@N a aVar) {
                this.f339622b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = this.f339622b.get();
                if (aVar == null) {
                    return true;
                }
                ArrayList arrayList = aVar.f339620b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = aVar.f339619a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int iA2 = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int iA3 = aVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
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
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.f339621c);
                }
                aVar.f339621c = null;
                arrayList.clear();
                return true;
            }
        }

        public a(@N ImageView imageView) {
            this.f339619a = imageView;
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
            ImageView imageView = this.f339619a;
            if (imageView.isLayoutRequested() || i13 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            Context context = imageView.getContext();
            if (f339618d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                com.bumptech.glide.util.k.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f339618d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f339618d.intValue();
        }
    }

    public t(@N ImageView imageView) {
        com.bumptech.glide.util.k.c(imageView, "Argument must not be null");
        this.f339616c = imageView;
        this.f339617d = new a(imageView);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    @P
    public final com.bumptech.glide.request.d a() {
        Object tag = this.f339616c.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof com.bumptech.glide.request.d) {
            return (com.bumptech.glide.request.d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    @InterfaceC42153i
    public void b(@P Drawable drawable) {
        a aVar = this.f339617d;
        ViewTreeObserver viewTreeObserver = aVar.f339619a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f339621c);
        }
        aVar.f339621c = null;
        aVar.f339620b.clear();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    public final void f(@P com.bumptech.glide.request.i iVar) {
        this.f339616c.setTag(R.id.glide_custom_view_target_tag, iVar);
    }

    @Override // com.bumptech.glide.request.target.q
    @InterfaceC42153i
    public final void h(@N com.bumptech.glide.request.i iVar) {
        this.f339617d.f339620b.remove(iVar);
    }

    @Override // com.bumptech.glide.request.target.q
    @InterfaceC42153i
    public final void j(@N com.bumptech.glide.request.i iVar) {
        a aVar = this.f339617d;
        ImageView imageView = aVar.f339619a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA2 = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = aVar.f339619a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA3 = aVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA2 > 0 || iA2 == Integer.MIN_VALUE) && (iA3 > 0 || iA3 == Integer.MIN_VALUE)) {
            iVar.c(iA2, iA3);
            return;
        }
        ArrayList arrayList = aVar.f339620b;
        if (!arrayList.contains(iVar)) {
            arrayList.add(iVar);
        }
        if (aVar.f339621c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC10518a viewTreeObserverOnPreDrawListenerC10518a = new a.ViewTreeObserverOnPreDrawListenerC10518a(aVar);
            aVar.f339621c = viewTreeObserverOnPreDrawListenerC10518a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10518a);
        }
    }

    public final String toString() {
        return "Target for: " + this.f339616c;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
    @InterfaceC42153i
    public void k(@P Drawable drawable) {
    }
}
