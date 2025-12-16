package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.p21;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class j21 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final CopyOnWriteArrayList<p21> f386747e = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f386748b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Executor f386749c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final p21.a f386750d;

    public j21(@j.N Context context, @j.N Executor executor, @j.N p21.a aVar) {
        this.f386748b = context.getApplicationContext();
        this.f386749c = executor;
        this.f386750d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p21 p21Var = new p21(this.f386748b, this.f386749c, new a4());
        f386747e.add(p21Var);
        p21Var.a(new a(p21Var));
    }

    public class a implements p21.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p21 f386751a;

        public a(p21 p21Var) {
            this.f386751a = p21Var;
        }

        @Override // com.yandex.mobile.ads.impl.p21.a
        public final void a(@j.N q8 q8Var, @j.N ts tsVar) {
            j21.f386747e.remove(this.f386751a);
            j21.this.f386750d.a(q8Var, tsVar);
        }

        @Override // com.yandex.mobile.ads.impl.p21.a
        public final void a(@j.N w2 w2Var) {
            j21.f386747e.remove(this.f386751a);
            j21.this.f386750d.a(w2Var);
        }
    }
}
