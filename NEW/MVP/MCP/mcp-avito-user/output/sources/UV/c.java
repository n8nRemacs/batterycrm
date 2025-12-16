package Uv;

import Y61.k;
import android.content.Context;
import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.domain.U;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SettingItemMapperImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LUv/c;", "Ldagger/internal/h;", "LUv/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f16772d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f16773a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<D> f16774b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<U> f16775c;

    /* compiled from: SettingItemMapperImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUv/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C30102l3 c30102l3, @k Provider provider, @k Provider provider2) {
        this.f16773a = c30102l3;
        this.f16774b = provider;
        this.f16775c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f16773a.get();
        D d12 = this.f16774b.get();
        U u12 = this.f16775c.get();
        f16772d.getClass();
        return new b(context, d12, u12);
    }
}
