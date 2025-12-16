package eN;

import Y61.k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollModule_ProvideItemBinderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LeN/g;", "Ldagger/internal/h;", "Lcom/avito/konveyor/a;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f395159c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.imv_goods_poll.items.list_radio_button.c f395160a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.imv_goods_poll.items.check_box.c f395161b;

    /* compiled from: ImvGoodsPollModule_ProvideItemBinderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeN/g$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k com.avito.android.imv_goods_poll.items.list_radio_button.c cVar, @k com.avito.android.imv_goods_poll.items.check_box.c cVar2) {
        this.f395160a = cVar;
        this.f395161b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.imv_goods_poll.items.list_radio_button.b bVar = (com.avito.android.imv_goods_poll.items.list_radio_button.b) this.f395160a.get();
        com.avito.android.imv_goods_poll.items.check_box.b bVar2 = (com.avito.android.imv_goods_poll.items.check_box.b) this.f395161b.get();
        f395159c.getClass();
        d.f395153a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
