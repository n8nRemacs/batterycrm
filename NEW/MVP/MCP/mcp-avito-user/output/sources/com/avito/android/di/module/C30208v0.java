package com.avito.android.di.module;

import com.avito.android.remote.interceptor.C34277d0;
import com.avito.android.remote.interceptor.C34283g0;
import com.avito.android.remote.interceptor.C34290k;
import com.avito.android.remote.interceptor.C34294m;
import com.avito.android.remote.interceptor.C34298o;
import com.avito.android.remote.interceptor.C34299o0;
import com.avito.android.remote.interceptor.C34302q;
import com.avito.android.remote.interceptor.C34308t0;
import com.avito.android.remote.interceptor.C34311v;
import com.avito.android.remote.interceptor.C34320z0;
import com.avito.android.remote.interceptor.InterfaceC34273b0;
import com.avito.android.remote.interceptor.InterfaceC34284h;
import com.avito.android.remote.interceptor.InterfaceC34295m0;
import com.avito.android.remote.interceptor.InterfaceC34304r0;
import com.avito.android.remote.interceptor.InterfaceC34305s;
import com.avito.android.remote.interceptor.InterfaceC34316x0;
import gz.InterfaceC40750a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import okhttp3.HttpUrl;
import om0.C44822b;
import rm0.InterfaceC47681a;

/* compiled from: ApiInterceptorsModule_ProvideHeadersInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/v0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/g0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.v0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30208v0 implements dagger.internal.h<C34283g0> {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f144627r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f144628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.Z f144629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C34302q f144630c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.M0 f144631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C34294m f144632e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C34308t0 f144633f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C34299o0 f144634g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C34320z0 f144635h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.P f144636i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.U f144637j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C34277d0 f144638k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final L5 f144639l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C44822b f144640m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Uy.f f144641n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C34311v f144642o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f144643p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Lq.b f144644q;

    /* compiled from: ApiInterceptorsModule_ProvideHeadersInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/v0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.v0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30208v0(@Y61.k C30143p0 c30143p0, @Y61.k com.avito.android.S s5, @Y61.k com.avito.android.remote.interceptor.Z z12, @Y61.k C34302q c34302q, @Y61.k com.avito.android.remote.interceptor.M0 m02, @Y61.k C34294m c34294m, @Y61.k C34308t0 c34308t0, @Y61.k C34299o0 c34299o0, @Y61.k C34320z0 c34320z0, @Y61.k com.avito.android.remote.interceptor.P p12, @Y61.k com.avito.android.remote.interceptor.U u12, @Y61.k C34277d0 c34277d0, @Y61.k L5 l52, @Y61.k C44822b c44822b, @Y61.k Uy.f fVar, @Y61.k C34311v c34311v, @Y61.k dagger.internal.A a12, @Y61.k Lq.b bVar) {
        this.f144628a = s5;
        this.f144629b = z12;
        this.f144630c = c34302q;
        this.f144631d = m02;
        this.f144632e = c34294m;
        this.f144633f = c34308t0;
        this.f144634g = c34299o0;
        this.f144635h = c34320z0;
        this.f144636i = p12;
        this.f144637j = u12;
        this.f144638k = c34277d0;
        this.f144639l = l52;
        this.f144640m = c44822b;
        this.f144641n = fVar;
        this.f144642o = c34311v;
        this.f144643p = a12;
        this.f144644q = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f144628a.get();
        com.avito.android.remote.interceptor.I i12 = (com.avito.android.remote.interceptor.I) this.f144629b.get();
        this.f144630c.getClass();
        C34298o c34298o = new C34298o();
        this.f144631d.getClass();
        com.avito.android.remote.interceptor.L0 l02 = new com.avito.android.remote.interceptor.L0();
        this.f144632e.getClass();
        C34290k c34290k = new C34290k();
        InterfaceC34304r0 interfaceC34304r0 = (InterfaceC34304r0) this.f144633f.get();
        InterfaceC34295m0 interfaceC34295m0 = (InterfaceC34295m0) this.f144634g.get();
        InterfaceC34316x0 interfaceC34316x0 = (InterfaceC34316x0) this.f144635h.get();
        com.avito.android.remote.interceptor.M m12 = (com.avito.android.remote.interceptor.M) this.f144636i.get();
        com.avito.android.remote.interceptor.S s5 = (com.avito.android.remote.interceptor.S) this.f144637j.get();
        InterfaceC34273b0 interfaceC34273b0 = (InterfaceC34273b0) this.f144638k.get();
        com.avito.android.messenger.service.d dVar = (com.avito.android.messenger.service.d) this.f144639l.get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) this.f144640m.get();
        InterfaceC40750a interfaceC40750a = (InterfaceC40750a) this.f144641n.get();
        InterfaceC34305s interfaceC34305s = (InterfaceC34305s) this.f144642o.get();
        Set set = (Set) this.f144643p.get();
        Lq.d dVar2 = (Lq.d) this.f144644q.get();
        f144627r.getClass();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            InterfaceC34284h interfaceC34284h = (InterfaceC34284h) it.next();
            Iterator it2 = it;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            interfaceC34284h.getClass();
            arrayList.add(companion.get("https://staging-www.k.avito.ru/").host());
            it = it2;
        }
        HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
        ArrayList arrayListH0 = C42745f0.h0(C42745f0.U(companion2.get(p12.a()).host(), companion2.get(dVar.d()).host()), arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c34290k);
        arrayList2.add(i12);
        arrayList2.add(interfaceC34273b0);
        arrayList2.add(interfaceC34304r0);
        arrayList2.add(interfaceC34295m0);
        arrayList2.add(interfaceC34316x0);
        arrayList2.add(l02);
        arrayList2.add(m12);
        arrayList2.add(interfaceC34305s);
        arrayList2.add(interfaceC40750a);
        arrayList2.add(dVar2);
        arrayList2.add(interfaceC47681a);
        kotlin.reflect.n<Object>[] nVarArr = com.avito.android.P.f67370w0;
        kotlin.reflect.n<Object> nVar = nVarArr[46];
        if (((Boolean) p12.f67379I.a().getValue()).booleanValue()) {
            arrayList2.add(s5);
        }
        kotlin.reflect.n<Object> nVar2 = nVarArr[50];
        if (((Boolean) p12.f67381K.a().invoke()).booleanValue()) {
            arrayList2.add(c34298o);
        }
        return new C34283g0(arrayListH0, arrayList2);
    }
}
