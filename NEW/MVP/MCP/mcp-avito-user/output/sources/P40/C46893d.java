package p40;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.zstd.f;
import com.avito.android.zstd.g;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinCacheCompressorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lp40/d;", "Ldagger/internal/h;", "Lp40/b;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p40.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C46893d implements h<C46891b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f428192c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f428193a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final K1 f428194b;

    /* compiled from: BeduinCacheCompressorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp40/d$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p40.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C46893d(@k g gVar, @k K1 k12) {
        this.f428193a = gVar;
        this.f428194b = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f428193a.getClass();
        f fVar = new f();
        I1 i12 = (I1) this.f428194b.get();
        f428192c.getClass();
        return new C46891b(fVar, i12);
    }
}
