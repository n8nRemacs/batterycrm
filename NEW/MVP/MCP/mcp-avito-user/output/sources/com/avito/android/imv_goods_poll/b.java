package com.avito.android.imv_goods_poll;

import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/b;", "Ldagger/internal/h;", "Lcom/avito/android/imv_goods_poll/a;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<com.avito.android.imv_goods_poll.a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f170615c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f170616a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dv.b f170617b;

    /* compiled from: ImvGoodsPollDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/b$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k h hVar, @Y61.k dv.b bVar) {
        this.f170616a = hVar;
        this.f170617b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f170616a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f170617b.get();
        f170615c.getClass();
        return new com.avito.android.imv_goods_poll.a(fVar, interfaceC4053a);
    }
}
