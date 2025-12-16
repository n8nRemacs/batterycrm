package eN;

import Y61.k;
import com.avito.android.deep_linking.links.ImvGoodsPollLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ImvGoodsPollDeeplinkHandlerModule_ProvideImvGoodsPollDeeplinkHandlerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LeN/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f395151b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.imv_goods_poll.b f395152a;

    /* compiled from: ImvGoodsPollDeeplinkHandlerModule_ProvideImvGoodsPollDeeplinkHandlerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeN/c$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k com.avito.android.imv_goods_poll.b bVar) {
        this.f395152a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.imv_goods_poll.b bVar = this.f395152a;
        f395151b.getClass();
        C40025b.f395150a.getClass();
        return new C43834a(ImvGoodsPollLink.class, null, new C43834a.b.C11809b(bVar));
    }
}
