package com.avito.android.remote.interceptor;

import jJ.InterfaceC42261a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AcceptLanguageHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/d;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/b;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.d, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34276d implements dagger.internal.h<C34272b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253524b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f253525a;

    /* compiled from: AcceptLanguageHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/d$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.interceptor.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34276d(@Y61.k dagger.internal.u uVar) {
        this.f253525a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42261a interfaceC42261a = (InterfaceC42261a) this.f253525a.get();
        f253524b.getClass();
        return new C34272b(interfaceC42261a);
    }
}
