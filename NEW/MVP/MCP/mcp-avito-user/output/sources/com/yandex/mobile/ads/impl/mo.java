package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class mo implements oj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final View f388042a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final lj f388043b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final as0 f388044c = new as0(true);

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final pn f388045d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final gv0 f388046e;

    /* renamed from: f, reason: collision with root package name */
    private final long f388047f;

    public static class a implements bs0 {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final WeakReference<View> f388048a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final lj f388049b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final pn f388050c;

        public a(@j.N View view, @j.N lj ljVar, @j.N pn pnVar) {
            this.f388048a = new WeakReference<>(view);
            this.f388049b = ljVar;
            this.f388050c = pnVar;
        }

        @Override // com.yandex.mobile.ads.impl.bs0
        /* renamed from: a */
        public final void mo126a() {
            View view = this.f388048a.get();
            if (view != null) {
                this.f388049b.b(view);
                this.f388050c.a(on.f388590d);
            }
        }
    }

    public mo(@j.N View view, @j.N lj ljVar, @j.N pn pnVar, @j.N gv0 gv0Var, long j12) {
        this.f388042a = view;
        this.f388046e = gv0Var;
        this.f388047f = j12;
        this.f388043b = ljVar;
        this.f388045d = pnVar;
        ljVar.a(view);
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a(boolean z12) {
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void b() {
        this.f388044c.b();
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void c() {
        a aVar = new a(this.f388042a, this.f388043b, this.f388045d);
        long jMax = Math.max(0L, this.f388047f - this.f388046e.a());
        if (jMax == 0) {
            this.f388043b.b(this.f388042a);
        } else {
            this.f388044c.a(jMax, aVar);
            this.f388045d.a(on.f388589c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.oj
    @j.N
    public final View d() {
        return this.f388042a;
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void invalidate() {
        this.f388044c.a();
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a() {
        this.f388044c.d();
    }
}
