package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Mf {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f378927a;

    /* renamed from: b, reason: collision with root package name */
    private final Sf f378928b;

    /* renamed from: c, reason: collision with root package name */
    private final Kf f378929c;

    /* renamed from: d, reason: collision with root package name */
    private final Kn<String> f378930d;

    /* renamed from: e, reason: collision with root package name */
    private final Kn<String> f378931e;

    public static final class a extends AbstractRunnableC38787em {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f378933b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f378934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f378935d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f378936e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f378937f;

        public a(int i12, String str, String str2, Map map, Map map2) {
            this.f378933b = i12;
            this.f378934c = str;
            this.f378935d = str2;
            this.f378936e = map;
            this.f378937f = map2;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            Mf.a(Mf.this).a(this.f378933b, this.f378934c, this.f378935d, this.f378936e, this.f378937f);
        }
    }

    public static final class b extends AbstractRunnableC38787em {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f378939b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f378940c;

        public b(String str, byte[] bArr) {
            this.f378939b = str;
            this.f378940c = bArr;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            Mf.a(Mf.this).a(this.f378939b, this.f378940c);
        }
    }

    @j.k0
    public Mf(@Y61.k ICommonExecutor iCommonExecutor, @Y61.k Sf sf2, @Y61.k Kf kf2, @Y61.k Kn<String> kn2, @Y61.k Kn<String> kn3) {
        this.f378927a = iCommonExecutor;
        this.f378928b = sf2;
        this.f378929c = kf2;
        this.f378930d = kn2;
        this.f378931e = kn3;
    }

    public final void a(int i12, @Y61.l String str, @Y61.l String str2, @Y61.l Map<String, String> map, @Y61.l Map<String, byte[]> map2) {
        this.f378929c.a(null);
        this.f378930d.a(str);
        this.f378927a.execute(new a(i12, str, str2, map, map2));
    }

    public Mf(@Y61.k ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new Sf());
    }

    private Mf(ICommonExecutor iCommonExecutor, Sf sf2) {
        this(iCommonExecutor, sf2, new Kf(sf2), new Hn(new Gn("Event name")), new Hn(new Gn("Session extra key")));
    }

    public final void a(@Y61.k String str, @Y61.l byte[] bArr) {
        this.f378931e.a(str);
        this.f378927a.execute(new b(str, bArr));
    }

    public final boolean a() {
        this.f378928b.getClass();
        return R2.h();
    }

    public static final K0 a(Mf mf2) {
        mf2.f378928b.getClass();
        return R2.k().d().b();
    }
}
