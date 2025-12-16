package com.avito.android.imv_goods_poll;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rk0.InterfaceC47673a;

/* compiled from: ImvGoodsPollInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/l;", "Ldagger/internal/h;", "Lcom/avito/android/imv_goods_poll/k;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f170671b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC47673a> f170672a;

    /* compiled from: ImvGoodsPollInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/l$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k Provider<InterfaceC47673a> provider) {
        this.f170672a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47673a interfaceC47673a = this.f170672a.get();
        f170671b.getClass();
        return new k(interfaceC47673a);
    }
}
