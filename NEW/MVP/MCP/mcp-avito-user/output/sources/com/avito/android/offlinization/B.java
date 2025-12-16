package com.avito.android.offlinization;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import r40.C47487a;
import u40.C48795d;

/* compiled from: OfflinizationInterceptorProvider_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/B;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/A;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f208472f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f208473a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w f208474b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48795d f208475c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f208476d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final v40.d f208477e;

    /* compiled from: OfflinizationInterceptorProvider_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/B$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public B(@Y61.k r rVar, @Y61.k w wVar, @Y61.k C48795d c48795d, @Y61.k dagger.internal.f fVar, @Y61.k v40.d dVar) {
        this.f208473a = rVar;
        this.f208474b = wVar;
        this.f208475c = c48795d;
        this.f208476d = fVar;
        this.f208477e = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f208473a.get();
        C47487a c47487a = (C47487a) this.f208475c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f208476d.get();
        this.f208477e.getClass();
        v40.c cVar = new v40.c();
        f208472f.getClass();
        return new A(pVar, this.f208474b, c47487a, interfaceC28373a, cVar);
    }
}
