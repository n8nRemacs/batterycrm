package ub1;

import android.content.Context;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.reactive.single.AbstractC47905a;
import ru.rustore.sdk.reactive.single.H;
import ub1.C49021c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub1/e;", "", "sdk-public-review_release"}, k = 1, mv = {1, 7, 0})
/* renamed from: ub1.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49023e {

    /* renamed from: a, reason: collision with root package name */
    public final E f440147a;

    /* renamed from: ub1.e$a */
    public static final class a extends N implements Y41.l<G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f440148l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            return G0.f406611a;
        }
    }

    public C49023e(Context context, Map<String, ? extends Object> map) {
        C49021c c49021c;
        this.f440147a = new E(context);
        new C49021c.a();
        synchronized (C49021c.a.class) {
            c49021c = C49021c.f440134h;
            if (c49021c == null) {
                c49021c = new C49021c(context, map);
                C49021c.f440134h = c49021c;
            }
        }
        m mVar = (m) c49021c.f440137c.getValue();
        n nVar = new n((Map) mVar.f440166c.getValue());
        s sVar = mVar.f440164a;
        sVar.getClass();
        AbstractC47905a.C12588a c12588a = AbstractC47905a.f436968a;
        p pVar = new p(sVar, nVar);
        c12588a.getClass();
        AbstractC47905a abstractC47905aA = ru.rustore.sdk.reactive.single.t.a(new ru.rustore.sdk.reactive.single.u(pVar), new q(sVar));
        ru.rustore.sdk.reactive.core.d.f436864a.getClass();
        ru.rustore.sdk.reactive.single.E.a(ru.rustore.sdk.reactive.single.D.a(H.a(abstractC47905aA, ru.rustore.sdk.reactive.core.d.a()), r.f440172l), ru.rustore.sdk.reactive.core.j.f436875a, a.f440148l);
    }

    public /* synthetic */ C49023e(Context context, Map map, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : map);
    }
}
