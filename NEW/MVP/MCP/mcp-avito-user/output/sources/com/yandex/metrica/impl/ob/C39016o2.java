package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C39062q;
import com.yandex.metrica.impl.ob.r;

/* renamed from: com.yandex.metrica.impl.ob.o2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39016o2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39062q f381222a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ll<C38890j1> f381223b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39062q.b f381224c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39062q.b f381225d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final r f381226e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39038p f381227f;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    public class a implements C39062q.b {

        /* renamed from: com.yandex.metrica.impl.ob.o2$a$a, reason: collision with other inner class name */
        public class C10960a implements E1<C38890j1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f381229a;

            public C10960a(Activity activity) {
                this.f381229a = activity;
            }

            @Override // com.yandex.metrica.impl.ob.E1
            public void b(@j.N C38890j1 c38890j1) {
                C39016o2.a(C39016o2.this, this.f381229a, c38890j1);
            }
        }

        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C39062q.b
        @j.K
        public void a(@j.N Activity activity, @j.N C39062q.a aVar) {
            C39016o2.this.f381223b.a((E1) new C10960a(activity));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    public class b implements C39062q.b {

        /* renamed from: com.yandex.metrica.impl.ob.o2$b$a */
        public class a implements E1<C38890j1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f381232a;

            public a(Activity activity) {
                this.f381232a = activity;
            }

            @Override // com.yandex.metrica.impl.ob.E1
            public void b(@j.N C38890j1 c38890j1) {
                C39016o2.b(C39016o2.this, this.f381232a, c38890j1);
            }
        }

        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.C39062q.b
        @j.K
        public void a(@j.N Activity activity, @j.N C39062q.a aVar) {
            C39016o2.this.f381223b.a((E1) new a(activity));
        }
    }

    public C39016o2(@j.N C39062q c39062q, @j.N ICommonExecutor iCommonExecutor, @j.N C39038p c39038p) {
        this(c39062q, c39038p, new Ll(iCommonExecutor), new r());
    }

    public void b(@j.P Activity activity, @j.N K0 k02) {
        if (activity != null) {
            this.f381227f.a(activity);
        }
        if (this.f381226e.a(activity, r.a.RESUMED)) {
            k02.a(activity);
        }
    }

    @j.k0
    public C39016o2(@j.N C39062q c39062q, @j.N C39038p c39038p, @j.N Ll<C38890j1> ll2, @j.N r rVar) {
        this.f381222a = c39062q;
        this.f381227f = c39038p;
        this.f381223b = ll2;
        this.f381226e = rVar;
        this.f381224c = new a();
        this.f381225d = new b();
    }

    @j.N
    public C39062q.c a() {
        this.f381222a.a(this.f381224c, C39062q.a.RESUMED);
        this.f381222a.a(this.f381225d, C39062q.a.PAUSED);
        return this.f381222a.a();
    }

    public static void b(C39016o2 c39016o2, Activity activity, K0 k02) {
        if (c39016o2.f381226e.a(activity, r.a.PAUSED)) {
            ((C38890j1) k02).b(activity);
        }
    }

    public void a(@j.P Activity activity, @j.N K0 k02) {
        if (activity != null) {
            this.f381227f.a(activity);
        }
        if (this.f381226e.a(activity, r.a.PAUSED)) {
            k02.b(activity);
        }
    }

    public void a(@j.N C38890j1 c38890j1) {
        this.f381223b.a((Ll<C38890j1>) c38890j1);
    }

    public static void a(C39016o2 c39016o2, Activity activity, K0 k02) {
        if (c39016o2.f381226e.a(activity, r.a.RESUMED)) {
            ((C38890j1) k02).a(activity);
        }
    }
}
