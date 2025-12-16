package wX;

import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import vX.C49277b;
import vX.InterfaceC49276a;

/* compiled from: LoyaltyProgramAnalyticsModule_ProvideLoyaltyProgramAnalyticsInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LwX/b;", "Ldagger/internal/h;", "LvX/a;", "a", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49572b implements h<InterfaceC49276a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f441532c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f441533a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<E> f441534b;

    /* compiled from: LoyaltyProgramAnalyticsModule_ProvideLoyaltyProgramAnalyticsInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwX/b$a;", "", "<init>", "()V", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wX.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49572b(@k f fVar, @k Provider provider) {
        this.f441533a = fVar;
        this.f441534b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f441533a.get();
        E e12 = this.f441534b.get();
        f441532c.getClass();
        C49571a.f441531a.getClass();
        return new C49277b(e12, interfaceC28373a);
    }
}
