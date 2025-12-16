package nt;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CurrencyCodeProvider_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnt/b;", "Ldagger/internal/h;", "Lnt/a;", "a", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<C44474a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f419204b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f419205a;

    /* compiled from: CurrencyCodeProvider_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnt/b$a;", "", "<init>", "()V", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k l lVar) {
        this.f419205a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f419205a.get();
        f419204b.getClass();
        return new C44474a(kVar);
    }
}
