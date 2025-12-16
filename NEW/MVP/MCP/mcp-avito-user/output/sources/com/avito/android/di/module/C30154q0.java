package com.avito.android.di.module;

import com.avito.android.remote.interceptor.C34276d;
import com.avito.android.remote.interceptor.C34280f;
import com.avito.android.remote.interceptor.InterfaceC34270a;
import com.avito.android.remote.interceptor.InterfaceC34278e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: ApiInterceptorsModule_ProvideAcceptLanguageInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/q0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/e;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.q0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30154q0 implements dagger.internal.h<InterfaceC34278e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f144531c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34276d f144532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ur.e f144533b;

    /* compiled from: ApiInterceptorsModule_ProvideAcceptLanguageInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/q0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.q0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30154q0(@Y61.k C30143p0 c30143p0, @Y61.k C34276d c34276d, @Y61.k ur.e eVar) {
        this.f144532a = c34276d;
        this.f144533b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34270a interfaceC34270a = (InterfaceC34270a) this.f144532a.get();
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f144533b.get();
        f144531c.getClass();
        return new C34280f(interfaceC34270a, interfaceC49101b);
    }
}
