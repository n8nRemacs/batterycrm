package com.avito.android.imv_goods_poll;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/n;", "Ldagger/internal/h;", "Lcom/avito/android/imv_goods_poll/m;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f170717b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_goods_poll.mvi.j f170718a;

    /* compiled from: ImvGoodsPollViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/n$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k com.avito.android.imv_goods_poll.mvi.j jVar) {
        this.f170718a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.imv_goods_poll.mvi.i iVar = (com.avito.android.imv_goods_poll.mvi.i) this.f170718a.get();
        f170717b.getClass();
        return new m(iVar, null, 2, null);
    }
}
