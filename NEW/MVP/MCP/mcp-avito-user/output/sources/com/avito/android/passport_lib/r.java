package com.avito.android.passport_lib;

import com.avito.android.account.G;
import dagger.internal.w;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PassportStateRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport_lib/r;", "Ldagger/internal/h;", "Lcom/avito/android/passport_lib/q;", "a", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f213944c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f213945a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<G> f213946b;

    /* compiled from: PassportStateRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport_lib/r$a;", "", "<init>", "()V", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f213945a = uVar;
        this.f213946b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f213945a));
        G g12 = this.f213946b.get();
        f213944c.getClass();
        return new q(eVarA, g12);
    }
}
