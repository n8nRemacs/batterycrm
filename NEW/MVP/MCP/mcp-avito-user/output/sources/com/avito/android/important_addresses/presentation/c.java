package com.avito.android.important_addresses.presentation;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImportantAddressesItemHolderFactoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/c;", "Ldagger/internal/h;", "Lcom/avito/android/important_addresses/presentation/b;", "a", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f169621d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.text.a> f169622a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f169623b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<JM.d> f169624c;

    /* compiled from: ImportantAddressesItemHolderFactoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/c$a;", "", "<init>", "()V", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f169622a = provider;
        this.f169623b = uVar;
        this.f169624c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = this.f169622a.get();
        m mVar = (m) this.f169623b.get();
        JM.d dVar = this.f169624c.get();
        f169621d.getClass();
        return new b(aVar, mVar, dVar);
    }
}
