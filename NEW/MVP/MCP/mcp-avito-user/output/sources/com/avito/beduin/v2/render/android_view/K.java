package com.avito.beduin.v2.render.android_view;

import android.graphics.Rect;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ViewportTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/K;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f337927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f337928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f337929c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f337930d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.bottom_gap.a f337931e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final U9.f f337932f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f337933g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Rect f337934h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final int[] f337935i;

    public K(@Y61.k View view, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, boolean z12) {
        this.f337927a = view;
        this.f337928b = aVar;
        this.f337929c = aVar2;
        this.f337930d = z12;
        this.f337931e = new com.avito.android.util.bottom_gap.a(this, 3);
        this.f337932f = new U9.f(this, 6);
        this.f337934h = new Rect();
        this.f337935i = new int[2];
    }

    public final void a() {
        if (this.f337933g) {
            this.f337933g = false;
            View view = this.f337927a;
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f337932f);
            }
            view.removeOnLayoutChangeListener(this.f337931e);
        }
    }

    public final void b(boolean z12) {
        if (this.f337930d != z12) {
            this.f337930d = z12;
            View view = this.f337927a;
            if (z12) {
                view.post(new J(this, 1));
            } else {
                view.post(new J(this, 2));
            }
        }
    }

    public /* synthetic */ K(View view, Y41.a aVar, Y41.a aVar2, boolean z12, int i12, C42822w c42822w) {
        this(view, aVar, aVar2, (i12 & 8) != 0 ? false : z12);
    }
}
