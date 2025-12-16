package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
final class z30 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zj1 f392176a = new zj1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ig f392177b = new ig();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final dq f392178c = new dq();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final WeakHashMap<FrameLayout, WeakReference<hg>> f392179d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final WeakHashMap<FrameLayout, WeakReference<a40>> f392180e = new WeakHashMap<>();

    public final void a(@j.N FrameLayout frameLayout, @j.N xc1 xc1Var, boolean z12) {
        a40 a40Var;
        WeakReference<hg> weakReference = this.f392179d.get(frameLayout);
        hg hgVar = weakReference != null ? weakReference.get() : null;
        if (hgVar == null) {
            hgVar = new hg(frameLayout.getContext(), this.f392178c);
            this.f392179d.put(frameLayout, new WeakReference<>(hgVar));
            frameLayout.addView(hgVar);
        }
        this.f392177b.getClass();
        hgVar.setColor(z12 ? -65536 : -16711936);
        if (!z12) {
            WeakReference<a40> weakReference2 = this.f392180e.get(frameLayout);
            a40Var = weakReference2 != null ? weakReference2.get() : null;
            if (a40Var != null) {
                this.f392180e.remove(frameLayout);
                frameLayout.removeView(a40Var);
                return;
            }
            return;
        }
        WeakReference<a40> weakReference3 = this.f392180e.get(frameLayout);
        a40Var = weakReference3 != null ? weakReference3.get() : null;
        if (a40Var == null) {
            a40Var = new a40(frameLayout.getContext());
            this.f392180e.put(frameLayout, new WeakReference<>(a40Var));
            frameLayout.addView(a40Var);
        }
        a40Var.setDescription(this.f392176a.a(xc1Var));
    }

    public final void a(@j.N FrameLayout frameLayout) {
        WeakReference<hg> weakReference = this.f392179d.get(frameLayout);
        hg hgVar = weakReference != null ? weakReference.get() : null;
        if (hgVar != null) {
            this.f392179d.remove(frameLayout);
            frameLayout.removeView(hgVar);
        }
        WeakReference<a40> weakReference2 = this.f392180e.get(frameLayout);
        a40 a40Var = weakReference2 != null ? weakReference2.get() : null;
        if (a40Var != null) {
            this.f392180e.remove(frameLayout);
            frameLayout.removeView(a40Var);
        }
    }
}
