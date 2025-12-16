package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.vm0;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class fk0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ExecutorService f385393a = Executors.newSingleThreadExecutor(new mj0("YandexMobileAds.BaseController"));

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f385394b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final hk0 f385395c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final vm0 f385396d;

    @j.k0
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ok0 f385397b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final WeakReference<Context> f385398c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final AdResponse<?> f385399d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private final bl0 f385400e;

        /* renamed from: f, reason: collision with root package name */
        @j.N
        private final ek0 f385401f;

        /* renamed from: g, reason: collision with root package name */
        @j.N
        private final qn f385402g;

        /* renamed from: com.yandex.mobile.ads.impl.fk0$a$a, reason: collision with other inner class name */
        public class C10976a implements vm0.a {

            /* renamed from: a, reason: collision with root package name */
            @j.N
            final uj0 f385404a;

            /* renamed from: b, reason: collision with root package name */
            @j.N
            final ek0 f385405b;

            public C10976a(Context context, @j.N uj0 uj0Var, @j.N ek0 ek0Var) {
                new WeakReference(context);
                this.f385404a = uj0Var;
                this.f385405b = ek0Var;
            }
        }

        public a(Context context, @j.N AdResponse<?> adResponse, @j.N bl0 bl0Var, @j.P ok0 ok0Var, @j.N ek0 ek0Var) {
            this.f385399d = adResponse;
            this.f385400e = bl0Var;
            this.f385397b = ok0Var;
            this.f385398c = new WeakReference<>(context);
            this.f385401f = ek0Var;
            this.f385402g = new rn(context, rz0.a(adResponse)).a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i12;
            Context context = this.f385398c.get();
            if (context != null) {
                try {
                    bl0 bl0Var = this.f385400e;
                    if (bl0Var == null) {
                        this.f385401f.a(i5.f386312d);
                        return;
                    }
                    Collection[] collectionArr = {bl0Var.e()};
                    int length = collectionArr.length;
                    while (i12 < length) {
                        Collection collection = collectionArr[i12];
                        i12 = (collection == null || collection.isEmpty()) ? 0 : i12 + 1;
                        this.f385401f.a(i5.f386320l);
                        return;
                    }
                    uj0 uj0Var = new uj0(this.f385400e, this.f385399d, fk0.this.f385394b);
                    fk0.this.f385396d.a(context, fk0.this.f385394b, uj0Var, new C10976a(context, uj0Var, this.f385401f), this.f385402g);
                } catch (Exception unused) {
                    this.f385401f.a(i5.f386312d);
                }
            }
        }
    }

    public fk0(@j.N Context context, @j.N ko1 ko1Var, @j.N n2 n2Var, @j.N a4 a4Var) {
        this.f385394b = n2Var;
        this.f385395c = new hk0(n2Var, ko1Var);
        this.f385396d = new vm0(context, a4Var);
    }

    public final void a(@j.N Context context, @j.N AdResponse<?> adResponse, @j.P bl0 bl0Var, @j.N ok0 ok0Var, @j.N ek0 ek0Var) {
        this.f385393a.execute(new a(context, adResponse, bl0Var, ok0Var, ek0Var));
    }

    public final void a() {
        this.f385396d.a();
    }
}
