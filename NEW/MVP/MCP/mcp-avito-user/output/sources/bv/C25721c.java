package bv;

import Y61.k;
import com.avito.android.account.E;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkHandlerAuthorizationManagerModule_ProvideAuthorizationManagerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbv/c;", "Ldagger/internal/h;", "Lbv/a;", "a", "_avito_deeplink-handlers_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bv.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C25721c implements h<C25719a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f57541c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57542a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<E> f57543b;

    /* compiled from: DeeplinkHandlerAuthorizationManagerModule_ProvideAuthorizationManagerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbv/c$a;", "", "<init>", "()V", "_avito_deeplink-handlers_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bv.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25721c(@k f fVar, @k Provider provider) {
        this.f57542a = fVar;
        this.f57543b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f57542a.get();
        E e12 = this.f57543b.get();
        f57541c.getClass();
        C25720b.f57540a.getClass();
        return new C25719a(aVar, e12);
    }
}
