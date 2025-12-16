package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;

@SuppressLint({"NewApi"})
/* renamed from: com.yandex.metrica.impl.ob.wj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39225wj implements Yj<C39177uj> {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlineApi"})
    private static final SparseArray<String> f382134d = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ij f382135a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39291zd f382136b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39291zd f382137c;

    /* renamed from: com.yandex.metrica.impl.ob.wj$a */
    public class a extends SparseArray<String> {
        public a() {
            put(0, null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            put(14, "eHRPD");
            put(13, "LTE");
            put(15, "HSPA+");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$b */
    public class b implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f382138a;

        public b(C39225wj c39225wj, C39267yd c39267yd) {
            this.f382138a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            this.f382138a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$c */
    public class c implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f382139a;

        public c(C39225wj c39225wj, C39267yd c39267yd) {
            this.f382139a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return this.f382139a.b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$d */
    public class d implements InterfaceC39291zd {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39267yd f382140a;

        public d(C39225wj c39225wj, C39267yd c39267yd) {
            this.f382140a = c39267yd;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return this.f382140a.a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$e */
    public class e implements InterfaceC39291zd {
        public e(C39225wj c39225wj) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39291zd
        public boolean a(@j.N Context context) {
            return true;
        }
    }

    public C39225wj(@j.N Ij ij2, @j.N C39267yd c39267yd) {
        this.f382135a = ij2;
        if (A2.a(29)) {
            this.f382136b = new b(this, c39267yd);
            this.f382137c = new c(this, c39267yd);
        } else {
            this.f382136b = new d(this, c39267yd);
            this.f382137c = new e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39225wj.b():java.lang.Object");
    }
}
