package com.avito.android.bbl.screens.limit_increase.ui.compose.preview;

import Eh.InterfaceC13486b;
import Eh.c;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.bbl.screens.limit_increase.ui.compose.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wZ.C49578b;
import wZ.l;

/* compiled from: LimitIncreaseScreenPreviews.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f99919a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f99920b = new C22096n(-564301499, a.f99923l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f99921c = new C22096n(-811441024, b.f99924l, false);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C22096n f99922d = new C22096n(2074158476, C3009c.f99925l, false);

    /* compiled from: LimitIncreaseScreenPreviews.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f99923l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a13.C(78967107);
                Object objT = a13.t();
                A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = U2.a(2);
                    a13.H(objT);
                }
                InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
                a13.h();
                boolean z12 = interfaceC22196w1.e() == 0;
                c.e.b bVar = c.e.b.f4205a;
                c.d dVar = new c.d(8L, z12, true, "99 ₽", new c.d.a("Хватает для 50% похожих объявлений", bVar, 0.5f));
                c.d dVar2 = new c.d(16L, interfaceC22196w1.e() == 1, true, "199 ₽", new c.d.a("Хватает для 60% похожих объявлений", bVar, 0.6f));
                c.d dVar3 = new c.d(24L, interfaceC22196w1.e() == 2, true, "299 ₽", new c.d.a("Хватает для 70% похожих объявлений", bVar, 0.7f));
                boolean z13 = interfaceC22196w1.e() == 3;
                c.e.a aVar = c.e.a.f4204a;
                List listU = C42745f0.U(dVar, dVar2, dVar3, new c.d(32L, z13, true, "399 ₽", new c.d.a("Хватает для 90% похожих объявлений", aVar, 0.9f)), new c.d(40L, interfaceC22196w1.e() == 4, true, "499 ₽", new c.d.a("Хватает для 100% похожих объявлений", aVar, 1.0f)));
                List<c.d> list = listU;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (c.d dVar4 : list) {
                    long j12 = dVar4.f4196a;
                    arrayList.add(new c.b(j12, String.valueOf(j12), dVar4.f4197b, dVar4.f4198c));
                }
                int iE2 = interfaceC22196w1.e();
                InterfaceC43160i<InterfaceC13486b> interfaceC43160i = k.f99933a;
                Eh.c cVar = new Eh.c(false, false, null, new wZ.j(null, new C49578b("Помощь", null, null, null, 14, null)), "Купите контакты", "Они не продвинут объявление, но позволят ему не опуститься в самый низ поиска", arrayList, listU, Long.valueOf(((c.d) listU.get(iE2)).f4196a), new c.a(new l(new Image(P0.c()), null), "Безлимитные контакты", "И другие преимущества тарифа. Узнайте подробности", new NoMatchLink()), "Купить", false);
                InterfaceC43160i<InterfaceC13486b> interfaceC43160i2 = k.f99933a;
                Y41.l<DeepLink, G0> lVar = k.f99934b;
                com.avito.android.bbl.screens.limit_increase.ui.compose.preview.a aVar2 = com.avito.android.bbl.screens.limit_increase.ui.compose.preview.a.f99917l;
                a13.C(79052713);
                Object objT2 = a13.t();
                if (objT2 == A.a.f37868b) {
                    objT2 = new com.avito.android.bbl.screens.limit_increase.ui.compose.preview.b(interfaceC22196w1);
                    a13.H(objT2);
                }
                a13.h();
                q.a(cVar, interfaceC43160i2, aVar2, (Y41.l) objT2, lVar, a13, 28104);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LimitIncreaseScreenPreviews.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f99924l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                q.a(k.a(1), k.f99933a, d.f99926l, e.f99927l, k.f99934b, a13, 28104);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LimitIncreaseScreenPreviews.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bbl.screens.limit_increase.ui.compose.preview.c$c, reason: collision with other inner class name */
    public static final class C3009c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3009c f99925l = new C3009c();

        public C3009c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                q.a(k.a(2), k.f99933a, f.f99928l, g.f99929l, k.f99934b, a13, 28104);
            }
            return G0.f406611a;
        }
    }
}
