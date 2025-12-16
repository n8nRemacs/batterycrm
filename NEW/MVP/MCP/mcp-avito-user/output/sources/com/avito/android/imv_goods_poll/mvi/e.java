package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.imv_goods_poll.ImvGoodsPollParams;
import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/e;", "Ldagger/internal/h;", "Lcom/avito/android/imv_goods_poll/mvi/b;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f170688e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f170689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f170690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.i f170691c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f170692d;

    /* compiled from: ImvGoodsPollActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/e$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k dagger.internal.l lVar, @Y61.k u uVar, @Y61.k com.avito.android.remote.error.i iVar, @Y61.k Provider provider) {
        this.f170689a = lVar;
        this.f170690b = uVar;
        this.f170691c = iVar;
        this.f170692d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ImvGoodsPollParams imvGoodsPollParams = (ImvGoodsPollParams) this.f170689a.f393949a;
        com.avito.android.imv_goods_poll.j jVar = (com.avito.android.imv_goods_poll.j) this.f170690b.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f170691c.get();
        R0 r02 = this.f170692d.get();
        f170688e.getClass();
        return new b(imvGoodsPollParams, jVar, fVar, r02);
    }
}
