package nt;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: RegionProvider_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnt/l;", "Ldagger/internal/h;", "Lnt/k;", "a", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f419217b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ur.e f419218a;

    /* compiled from: RegionProvider_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnt/l$a;", "", "<init>", "()V", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k ur.e eVar) {
        this.f419218a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f419218a.get();
        f419217b.getClass();
        return new k(interfaceC49101b);
    }
}
