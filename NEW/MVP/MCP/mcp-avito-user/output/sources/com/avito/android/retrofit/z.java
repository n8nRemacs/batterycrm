package com.avito.android.retrofit;

import com.avito.android.I1;
import com.avito.android.K1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompositeRetrofitConverterFactoryWrapper_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/z;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/y;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f255207d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f255208a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f255209b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final K1 f255210c;

    /* compiled from: CompositeRetrofitConverterFactoryWrapper_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/z$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public z(@Y61.k Q q12, @Y61.k F f12, @Y61.k K1 k12) {
        this.f255208a = q12;
        this.f255209b = f12;
        this.f255210c = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = (I1) this.f255210c.get();
        f255207d.getClass();
        return new y(this.f255208a, this.f255209b, i12);
    }
}
