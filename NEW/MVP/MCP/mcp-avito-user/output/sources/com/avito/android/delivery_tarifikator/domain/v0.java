package com.avito.android.delivery_tarifikator.domain;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorSettingsValidatorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/v0;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/u0;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v0 implements dagger.internal.h<u0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f135344c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f135345a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<U> f135346b;

    /* compiled from: TarifikatorSettingsValidatorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/v0$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v0(@Y61.k C30102l3 c30102l3, @Y61.k Provider provider) {
        this.f135345a = c30102l3;
        this.f135346b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f135345a.get();
        U u12 = this.f135346b.get();
        f135344c.getClass();
        return new u0(context, u12);
    }
}
