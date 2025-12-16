package com.avito.android.imv_similiar_adverts.mvi;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsReducer_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/m;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/mvi/l;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f170931b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f170932a;

    /* compiled from: ImvSimilarAdvertsReducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/m$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k u uVar) {
        this.f170932a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.imv_similiar_adverts.d dVar = (com.avito.android.imv_similiar_adverts.d) this.f170932a.get();
        f170931b.getClass();
        return new l(dVar);
    }
}
