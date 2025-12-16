package com.avito.android.remote;

import com.avito.android.InterfaceC32948p;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SupportFeaturesHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/n1;", "Ldagger/internal/h;", "Lcom/avito/android/remote/m1;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class n1 implements dagger.internal.h<m1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253952b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC32948p> f253953a;

    /* compiled from: SupportFeaturesHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/n1$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n1(@Y61.k Provider<InterfaceC32948p> provider) {
        this.f253953a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32948p interfaceC32948p = this.f253953a.get();
        f253952b.getClass();
        return new m1(interfaceC32948p);
    }
}
