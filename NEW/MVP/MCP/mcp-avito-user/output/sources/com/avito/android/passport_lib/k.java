package com.avito.android.passport_lib;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PassportProfilesUpdateRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport_lib/k;", "Ldagger/internal/h;", "Lcom/avito/android/passport_lib/j;", "a", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f213926b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f213927a;

    /* compiled from: PassportProfilesUpdateRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport_lib/k$a;", "", "<init>", "()V", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k r rVar) {
        this.f213927a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f213927a.get();
        f213926b.getClass();
        return new j(nVar);
    }
}
