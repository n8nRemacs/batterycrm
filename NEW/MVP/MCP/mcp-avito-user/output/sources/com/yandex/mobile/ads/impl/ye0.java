package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.td;
import com.yandex.mobile.ads.impl.ze0;

/* loaded from: classes8.dex */
final class ye0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f392003a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ze0.a f392004b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ze0 f392005c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            fj1.a((ViewGroup) ye0.this.f392005c.f392235b.get(), false);
        }
    }

    public ye0(ze0 ze0Var, View view, ze0.a aVar) {
        this.f392005c = ze0Var;
        this.f392003a = view;
        this.f392004b = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f392003a.isShown()) {
            return true;
        }
        this.f392003a.getViewTreeObserver().removeOnPreDrawListener(this);
        td.a aVar = (td.a) this.f392004b;
        com.yandex.mobile.ads.banner.f fVar = (com.yandex.mobile.ads.banner.f) td.this.f390189a.get();
        if (fVar != null) {
            td.this.f390191c.c(fVar.h());
        }
        if (td.this.f390191c.b()) {
            td.c(td.this);
        }
        this.f392005c.f392234a.postDelayed(new a(), 50L);
        return true;
    }
}
