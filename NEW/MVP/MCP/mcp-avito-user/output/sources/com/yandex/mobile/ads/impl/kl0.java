package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.qa1;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
final class kl0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<View> f387182a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qa1.a f387183b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private Integer f387184c;

    public kl0(@j.N View view, @j.N qa1.a aVar) {
        this.f387182a = new WeakReference<>(view);
        this.f387183b = aVar;
    }

    public final void a() {
        View view = this.f387182a.get();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f387182a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer numValueOf = Integer.valueOf(visibility);
            if (numValueOf.equals(this.f387184c)) {
                return;
            }
            this.f387184c = numValueOf;
            qa1.a aVar = this.f387183b;
            if (aVar != null) {
                if (visibility == 0) {
                    aVar.a();
                } else {
                    aVar.b();
                }
            }
        }
    }
}
