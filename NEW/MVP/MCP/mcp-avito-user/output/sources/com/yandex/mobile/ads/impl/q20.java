package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.kp0;
import com.yandex.mobile.ads.impl.u20;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class q20 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u20 f389050a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final kp0.c f389051b;

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final u20 f389053b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final AtomicInteger f389054c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final Set<b30> f389055d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private final k30 f389056e;

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final Handler f389052a = new Handler(Looper.getMainLooper());

        /* renamed from: f, reason: collision with root package name */
        @j.N
        private final eg0 f389057f = new eg0();

        /* renamed from: com.yandex.mobile.ads.impl.q20$a$a, reason: collision with other inner class name */
        public class RunnableC10983a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f389058b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map f389059c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b30 f389060d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f389061e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f389062f;

            /* renamed from: com.yandex.mobile.ads.impl.q20$a$a$a, reason: collision with other inner class name */
            public class C10984a implements u20.d {
                public C10984a() {
                }

                @Override // com.yandex.mobile.ads.impl.kz0.a
                public final void a(@j.N ok1 ok1Var) {
                    RunnableC10983a runnableC10983a = RunnableC10983a.this;
                    a.a(a.this, runnableC10983a.f389059c);
                }

                @Override // com.yandex.mobile.ads.impl.u20.d
                public final void a(u20.c cVar, boolean z12) {
                    String strD = RunnableC10983a.this.f389060d.d();
                    Bitmap bitmapB = cVar.b();
                    if (bitmapB != null) {
                        if (strD != null) {
                            RunnableC10983a.this.f389059c.put(strD, bitmapB);
                        }
                        RunnableC10983a runnableC10983a = RunnableC10983a.this;
                        a.a(a.this, runnableC10983a.f389059c);
                    }
                }
            }

            public RunnableC10983a(String str, HashMap map, b30 b30Var, int i12, int i13) {
                this.f389058b = str;
                this.f389059c = map;
                this.f389060d = b30Var;
                this.f389061e = i12;
                this.f389062f = i13;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f389053b.a(this.f389058b, new C10984a(), this.f389061e, this.f389062f);
            }
        }

        public a(@j.N u20 u20Var, @j.N HashSet hashSet, @j.N k30 k30Var) {
            this.f389053b = u20Var;
            this.f389055d = hashSet;
            this.f389056e = k30Var;
            this.f389054c = new AtomicInteger(hashSet.size());
        }

        public final void a() {
            HashMap map = new HashMap();
            for (b30 b30Var : this.f389055d) {
                String strD = b30Var.d();
                int iA2 = b30Var.a();
                int iE2 = b30Var.e();
                int iA3 = b30Var.a();
                int iE3 = b30Var.e();
                this.f389057f.getClass();
                Runtime runtime = Runtime.getRuntime();
                if (Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory()) >= (iA3 * iE3 * 4) + 1048576.0f) {
                    this.f389052a.post(new RunnableC10983a(strD, map, b30Var, iE2, iA2));
                } else if (this.f389054c.decrementAndGet() == 0) {
                    this.f389056e.a(map);
                }
            }
        }

        public static void a(a aVar, Map map) {
            if (aVar.f389054c.decrementAndGet() == 0) {
                aVar.f389056e.a(map);
            }
        }
    }

    public q20(Context context) {
        kp0 kp0VarC = kp0.c(context);
        this.f389050a = kp0VarC.a();
        this.f389051b = kp0VarC.b();
    }

    public final void a(@j.N HashSet hashSet, @j.N k30 k30Var) {
        if (hashSet.size() == 0) {
            k30Var.a(Collections.emptyMap());
        } else {
            new a(this.f389050a, hashSet, k30Var).a();
        }
    }

    public final void a(@j.N HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Bitmap bitmap = (Bitmap) entry.getValue();
            if (bitmap != null) {
                this.f389051b.a(str, bitmap);
            }
        }
    }
}
