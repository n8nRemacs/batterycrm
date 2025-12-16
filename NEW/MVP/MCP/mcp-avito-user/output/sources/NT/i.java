package nt;

import jJ.InterfaceC42261a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CurrencyFormatterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnt/i;", "Ldagger/internal/h;", "Lnt/g;", "a", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f419212d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f419213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f419214b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC42261a> f419215c;

    /* compiled from: CurrencyFormatterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnt/i$a;", "", "<init>", "()V", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k b bVar, @Y61.k e eVar, @Y61.k Provider provider) {
        this.f419213a = bVar;
        this.f419214b = eVar;
        this.f419215c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44474a c44474a = (C44474a) this.f419213a.get();
        this.f419214b.getClass();
        d dVar = new d();
        InterfaceC42261a interfaceC42261a = this.f419215c.get();
        f419212d.getClass();
        return new g(c44474a, dVar, interfaceC42261a);
    }
}
