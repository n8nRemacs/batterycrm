package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.ob.D1;

/* loaded from: classes7.dex */
public class O extends D1 {

    /* renamed from: a, reason: collision with root package name */
    private final C38699b9 f379019a;

    public class a extends SparseArray<D1.a> {
        public a() {
            put(47, new c(O.this.f379019a));
            put(66, new d(O.this, O.this.f379019a));
            put(89, new b(O.this.f379019a));
            put(99, new e(O.this.f379019a));
            put(105, new f(O.this.f379019a));
        }
    }

    public class d implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C38699b9 f379023a;

        public d(O o12, C38699b9 c38699b9) {
            this.f379023a = c38699b9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f379023a.f(new Rd("COOKIE_BROWSERS", null).a());
            this.f379023a.f(new Rd("BIND_ID_URL", null).a());
            L0.a(context, "b_meta.dat");
            L0.a(context, "browsers.dat");
        }
    }

    public static class e implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C38699b9 f379024a;

        public e(@j.N C38699b9 c38699b9) {
            this.f379024a = c38699b9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f379024a.f(new Rd("DEVICE_ID_POSSIBLE", null).a()).d();
        }
    }

    public static class f implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C38699b9 f379025a;

        public f(@j.N C38699b9 c38699b9) {
            this.f379025a = c38699b9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            this.f379025a.f(new Rd("STARTUP_REQUEST_TIME", null).a()).d();
        }
    }

    public O(@j.N Context context) {
        this(new C38699b9(C38899ja.a(context).d()));
    }

    @Override // com.yandex.metrica.impl.ob.D1
    public SparseArray<D1.a> a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.D1
    public int a(Nd nd2) {
        return (int) this.f379019a.b(-1L);
    }

    @j.k0
    public O(C38699b9 c38699b9) {
        this.f379019a = c38699b9;
    }

    @Override // com.yandex.metrica.impl.ob.D1
    public void a(Nd nd2, int i12) {
        this.f379019a.e(i12);
        nd2.g().b();
    }

    public static class b implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private final C38699b9 f379021a;

        public b(C38699b9 c38699b9) {
            this.f379021a = c38699b9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            String strL = this.f379021a.l(null);
            String strN = this.f379021a.n(null);
            String strM = this.f379021a.m(null);
            String strG = this.f379021a.g((String) null);
            String strH = this.f379021a.h((String) null);
            String strJ = this.f379021a.j((String) null);
            this.f379021a.e(a(strL));
            this.f379021a.i(a(strN));
            this.f379021a.d(a(strM));
            this.f379021a.a(a(strG));
            this.f379021a.b(a(strH));
            this.f379021a.h(a(strJ));
        }

        @j.N
        private W0 a(@j.P String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            return new W0(str, zIsEmpty ? U0.UNKNOWN : U0.OK, zIsEmpty ? "no identifier saved in previous version" : null);
        }
    }

    public static class c implements D1.a {

        /* renamed from: a, reason: collision with root package name */
        private C38699b9 f379022a;

        public c(C38699b9 c38699b9) {
            this.f379022a = c38699b9;
        }

        @Override // com.yandex.metrica.impl.ob.D1.a
        public void a(Context context) {
            Ld ld2 = new Ld(context);
            if (A2.b(ld2.g())) {
                return;
            }
            if (this.f379022a.n(null) == null || this.f379022a.l(null) == null) {
                String strE = ld2.e(null);
                if (a(strE, this.f379022a.l(null))) {
                    this.f379022a.s(strE);
                }
                String strF = ld2.f(null);
                if (a(strF, this.f379022a.n(null))) {
                    this.f379022a.t(strF);
                }
                String strB = ld2.b(null);
                if (a(strB, this.f379022a.g((String) null))) {
                    this.f379022a.o(strB);
                }
                String strC = ld2.c(null);
                if (a(strC, this.f379022a.h((String) null))) {
                    this.f379022a.p(strC);
                }
                String strD = ld2.d(null);
                if (a(strD, this.f379022a.j((String) null))) {
                    this.f379022a.q(strD);
                }
                long jA2 = ld2.a(-1L);
                long jD2 = this.f379022a.d(-1L);
                if (jA2 != -1 && jD2 == -1) {
                    this.f379022a.h(jA2);
                }
                this.f379022a.d();
                ld2.f().b();
            }
        }

        private boolean a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
