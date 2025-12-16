package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class Pf {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Of> f379204a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Sf f379205b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f379206c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f379207a;

        public a(Context context) {
            this.f379207a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sf2 = Pf.this.f379205b;
            Context context = this.f379207a;
            sf2.getClass();
            R2.a(context);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Pf f379209a = new Pf(P.g().c(), new Sf());
    }

    @j.k0
    public Pf(@j.N ICommonExecutor iCommonExecutor, @j.N Sf sf2) {
        this.f379206c = iCommonExecutor;
        this.f379205b = sf2;
    }

    @j.N
    private Of b(@j.N Context context, @j.N String str) {
        this.f379205b.getClass();
        if (R2.k() == null) {
            this.f379206c.execute(new a(context));
        }
        Of of2 = new Of(this.f379206c, context, str);
        this.f379204a.put(str, of2);
        return of2;
    }

    @j.N
    public static Pf a() {
        return b.f379209a;
    }

    @j.N
    public Of a(@j.N Context context, @j.N String str) {
        Of of2 = this.f379204a.get(str);
        if (of2 == null) {
            synchronized (this.f379204a) {
                try {
                    of2 = this.f379204a.get(str);
                    if (of2 == null) {
                        Of ofB = b(context, str);
                        ofB.d(str);
                        of2 = ofB;
                    }
                } finally {
                }
            }
        }
        return of2;
    }

    @j.N
    public Of a(@j.N Context context, @j.N com.yandex.metrica.f fVar) {
        Of of2 = this.f379204a.get(fVar.apiKey);
        if (of2 == null) {
            synchronized (this.f379204a) {
                try {
                    of2 = this.f379204a.get(fVar.apiKey);
                    if (of2 == null) {
                        Of ofB = b(context, fVar.apiKey);
                        ofB.a(fVar);
                        of2 = ofB;
                    }
                } finally {
                }
            }
        }
        return of2;
    }
}
