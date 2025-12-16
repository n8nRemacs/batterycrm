package bW;

import AK0.l;
import Y61.k;
import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.di.module.C30214v6;
import com.google.gson.Gson;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LiquidityStatusStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LbW/d;", "Ldagger/internal/h;", "LbW/c;", "a", "_avito_liquidity-status_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bW.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25573d implements h<C25572c> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f57101d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<Gson> f57102a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30214v6 f57103b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D2 f57104c;

    /* compiled from: LiquidityStatusStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbW/d$a;", "", "<init>", "()V", "_avito_liquidity-status_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bW.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25573d(@k Provider provider, @k C30214v6 c30214v6, @k D2 d22) {
        this.f57102a = provider;
        this.f57103b = c30214v6;
        this.f57104c = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f57102a.get();
        l lVar = (l) this.f57103b.get();
        B2 b22 = (B2) this.f57104c.get();
        f57101d.getClass();
        return new C25572c(gson, lVar, b22);
    }
}
