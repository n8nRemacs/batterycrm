package com.avito.android.important_addresses.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImportantAddressesPluginModule_ProvideAuthorizationPluginFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/k;", "Ldagger/internal/h;", "LA3/b;", "a", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<A3.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f169644b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LM.f f169645a;

    /* compiled from: ImportantAddressesPluginModule_ProvideAuthorizationPluginFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/k$a;", "", "<init>", "()V", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k LM.f fVar) {
        this.f169645a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        JM.i iVar = (JM.i) this.f169645a.get();
        f169644b.getClass();
        j.f169643a.getClass();
        return new i(iVar);
    }
}
