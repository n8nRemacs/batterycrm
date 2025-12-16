package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.util.C;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinErrorInternalActionFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/m;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/l;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176336c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f176337a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176338b;

    /* compiled from: BeduinErrorInternalActionFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/m$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider) {
        this.f176337a = provider;
        this.f176338b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f176337a.get();
        ZS.c cVar = (ZS.c) this.f176338b.f393949a;
        f176336c.getClass();
        return new l(c12, cVar);
    }
}
