package com.avito.android.auto_loans_composite_broker.v2;

import android.content.Context;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertCompositeBrokerV2ResourceProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/c;", "Ldagger/internal/h;", "Lcom/avito/android/auto_loans_composite_broker/v2/b;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_composite_broker.v2.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28714c implements dagger.internal.h<C28713b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f95630b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Context> f95631a;

    /* compiled from: AdvertCompositeBrokerV2ResourceProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/c$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.auto_loans_composite_broker.v2.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C28714c(@Y61.k Provider<Context> provider) {
        this.f95631a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f95631a.get();
        f95630b.getClass();
        return new C28713b(context);
    }
}
