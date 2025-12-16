package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class av0 implements oj {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final View f383663a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ProgressBar f383664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final lj f383665c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final vj f383666d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final pn f383667e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final gv0 f383668f;

    /* renamed from: g, reason: collision with root package name */
    private final long f383669g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final as0 f383670h = new as0(true);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final bs0 f383671i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final l91 f383672j;

    public static final class a implements l91 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final vj f383673a;

        /* renamed from: b, reason: collision with root package name */
        private final long f383674b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final WeakReference<ProgressBar> f383675c;

        public a(@Y61.k ProgressBar progressBar, @Y61.k vj vjVar, long j12) {
            this.f383673a = vjVar;
            this.f383674b = j12;
            this.f383675c = new WeakReference<>(progressBar);
        }

        @Override // com.yandex.mobile.ads.impl.l91
        public final void a(long j12) {
            ProgressBar progressBar = this.f383675c.get();
            if (progressBar != null) {
                vj vjVar = this.f383673a;
                long j13 = this.f383674b;
                vjVar.a(progressBar, j13, j13 - j12);
            }
        }
    }

    public static final class b implements bs0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final lj f383676a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final pn f383677b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final WeakReference<View> f383678c;

        public b(@Y61.k View view, @Y61.k ns nsVar, @Y61.k pn pnVar) {
            this.f383676a = nsVar;
            this.f383677b = pnVar;
            this.f383678c = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.bs0
        /* renamed from: a */
        public final void mo126a() {
            View view = this.f383678c.get();
            if (view != null) {
                this.f383676a.b(view);
                this.f383677b.a(on.f388590d);
            }
        }
    }

    public av0(@Y61.k View view, @Y61.k ProgressBar progressBar, @Y61.k ns nsVar, @Y61.k vj vjVar, @Y61.k pn pnVar, @Y61.k gv0 gv0Var, long j12) {
        this.f383663a = view;
        this.f383664b = progressBar;
        this.f383665c = nsVar;
        this.f383666d = vjVar;
        this.f383667e = pnVar;
        this.f383668f = gv0Var;
        this.f383669g = j12;
        this.f383671i = new b(view, nsVar, pnVar);
        this.f383672j = new a(progressBar, vjVar, j12);
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a(boolean z12) {
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void b() {
        this.f383670h.b();
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void c() {
        vj vjVar = this.f383666d;
        ProgressBar progressBar = this.f383664b;
        int i12 = (int) this.f383669g;
        int iA2 = (int) this.f383668f.a();
        vjVar.getClass();
        vj.a(progressBar, i12, iA2);
        long jMax = Math.max(0L, this.f383669g - this.f383668f.a());
        if (jMax != 0) {
            this.f383665c.a(this.f383663a);
            this.f383670h.a(this.f383672j);
            this.f383670h.a(jMax, this.f383671i);
            this.f383667e.a(on.f388589c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.oj
    @Y61.k
    public final View d() {
        return this.f383663a;
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void invalidate() {
        this.f383670h.a();
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a() {
        this.f383670h.d();
    }
}
