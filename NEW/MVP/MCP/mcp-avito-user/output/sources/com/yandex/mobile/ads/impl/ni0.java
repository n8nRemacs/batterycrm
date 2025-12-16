package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hi0;

/* loaded from: classes8.dex */
public final class ni0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ma0 f388305a = new ma0();

    public interface a {
        void a();
    }

    public static final class b implements hi0.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final oi0 f388306a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final a f388307b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final rb0 f388308c;

        public b(@Y61.k oi0 oi0Var, @Y61.k a aVar, @Y61.k rb0 rb0Var) {
            this.f388306a = oi0Var;
            this.f388307b = aVar;
            this.f388308c = rb0Var;
        }

        @Override // com.yandex.mobile.ads.impl.hi0.a
        public final void a() {
            this.f388306a.b(this.f388308c);
            this.f388307b.a();
        }

        @Override // com.yandex.mobile.ads.impl.hi0.a
        public final void b() {
            this.f388307b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, rb0 rb0Var, a aVar) {
        hi0 hi0Var;
        oi0 oi0VarA = oi0.f388557c.a(context);
        String strB = rb0Var.b();
        if (oi0VarA.b() || oi0VarA.a(rb0Var) || strB == null) {
            aVar.a();
            return;
        }
        b bVar = new b(oi0VarA, aVar, rb0Var);
        try {
            hi0Var = new hi0(context);
        } catch (Throwable unused) {
            aVar.a();
            hi0Var = null;
        }
        if (hi0Var != null) {
            hi0Var.setPreloadListener(bVar);
            oi0VarA.a(hi0Var, rb0Var);
            hi0Var.b(strB);
        }
    }

    public final void a(@Y61.k Context context, @Y61.k rb0 rb0Var, @Y61.k a aVar) {
        this.f388305a.a(new H0(context, rb0Var, aVar, 6));
    }
}
