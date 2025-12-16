package com.avito.android.lib.beduin_v2.component.map;

import Y41.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.lib.design.map.state.MoveReason;
import com.avito.android.lib.design.map.state.a;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.map.state.C36217a;
import com.avito.beduin.v2.avito.component.map.state.E;
import com.avito.beduin.v2.avito.component.map.state.N;
import com.avito.beduin.v2.avito.component.map.state.Pin;
import com.avito.beduin.v2.avito.component.map.state.r;
import com.avito.beduin.v2.avito.component.map.state.u;
import com.avito.beduin.v2.avito.component.map.state.x;
import com.avito.beduin.v2.avito.component.map.state.z;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import nV.C44337a;
import nV.C44338b;
import nV.InterfaceC44339c;
import oV.C44694a;
import uS.C48943a;

/* compiled from: MapComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/map/state/a;", "Lcom/avito/android/lib/design/map/b;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<C36217a, com.avito.android.lib.design.map.b> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public C36217a f175781m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public List<MapState.a> f175782n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public C43238h f175783o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final h f175784p;

    /* compiled from: MapComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/map/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.map.a$a, reason: collision with other inner class name */
    public static final class C5196a extends n<C36217a> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C5196a f175785c = new C5196a();

        public C5196a() {
            super(r.f334709c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @Y61.k
        public final InterfaceC36343m b(@Y61.k A a12) {
            return new a();
        }
    }

    /* compiled from: MapComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/map/state/MoveReason;", "moveReason", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/map/state/MoveReason;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<MoveReason, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C36217a f175786l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36217a c36217a) {
            super(1);
            this.f175786l = c36217a;
        }

        @Override // Y41.l
        public final G0 invoke(MoveReason moveReason) {
            Y41.a<G0> aVar;
            com.avito.beduin.v2.avito.component.map.state.MoveReason moveReason2;
            MoveReason moveReason3 = moveReason;
            C36217a c36217a = this.f175786l;
            Y41.l<com.avito.beduin.v2.avito.component.map.state.MoveReason, G0> lVar = c36217a.f334681i;
            if (lVar != null) {
                int iOrdinal = moveReason3.ordinal();
                if (iOrdinal == 0) {
                    moveReason2 = com.avito.beduin.v2.avito.component.map.state.MoveReason.f334631c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moveReason2 = com.avito.beduin.v2.avito.component.map.state.MoveReason.f334632d;
                }
                lVar.invoke(moveReason2);
            }
            if (c36217a.f334677e != null && (aVar = c36217a.f334680h) != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MapComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/map/state/a$c;", "visibleSnapshot", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/map/state/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<a.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C36217a f175787l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C36217a c36217a) {
            super(1);
            this.f175787l = c36217a;
        }

        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            com.avito.beduin.v2.avito.component.map.state.MoveReason moveReason;
            a.c cVar2 = cVar;
            Y41.r<com.avito.beduin.v2.avito.component.map.state.MoveReason, u, x, Float, G0> rVar = this.f175787l.f334682j;
            if (rVar != null) {
                int iOrdinal = cVar2.f179656d.ordinal();
                if (iOrdinal == 0) {
                    moveReason = com.avito.beduin.v2.avito.component.map.state.MoveReason.f334631c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moveReason = com.avito.beduin.v2.avito.component.map.state.MoveReason.f334632d;
                }
                AvitoMapBounds avitoMapBounds = cVar2.f179655c;
                rVar.invoke(moveReason, avitoMapBounds != null ? new u(C48943a.a(avitoMapBounds.getTopLeft()), C48943a.a(avitoMapBounds.getBottomRight())) : new u(new x(0.0f, 0.0f), new x(0.0f, 0.0f)), C48943a.a(cVar2.f179653a), Float.valueOf(cVar2.f179654b));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MapComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapPoint;", "point", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_map/AvitoMapPoint;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<AvitoMapPoint, Float, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C36217a f175788l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C36217a c36217a) {
            super(2);
            this.f175788l = c36217a;
        }

        @Override // Y41.p
        public final G0 invoke(AvitoMapPoint avitoMapPoint, Float f12) {
            AvitoMapPoint avitoMapPoint2 = avitoMapPoint;
            f12.floatValue();
            Y41.l<x, G0> lVar = this.f175788l.f334678f;
            if (lVar != null) {
                lVar.invoke(C48943a.a(avitoMapPoint2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MapComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState$a;", "marker", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/map/state/MapState$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<MapState.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C36217a f175789l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C36217a c36217a) {
            super(1);
            this.f175789l = c36217a;
        }

        @Override // Y41.l
        public final G0 invoke(MapState.a aVar) {
            Object next;
            MapState.a aVar2 = aVar;
            C36217a c36217a = this.f175789l;
            Y41.l<Pin, G0> lVar = c36217a.f334679g;
            if (lVar != null) {
                Iterator it = c36217a.f334674b.f4014b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((Pin) next).f334642a.equals(aVar2.f179631a)) {
                        break;
                    }
                }
                Pin pin = (Pin) next;
                if (pin != null) {
                    lVar.invoke(pin);
                }
            }
            return G0.f406611a;
        }
    }

    public a() {
        super(null, 1, null);
        this.f175782n = C42784z0.f406748b;
        this.f175784p = new h();
    }

    public static void u(com.avito.android.lib.design.map.b bVar, C36217a c36217a, List list) {
        MapState.b bVar2;
        com.avito.android.lib.design.map.state.a aVar;
        InterfaceC44339c interfaceC44339c;
        InterfaceC44339c c44338b;
        com.avito.android.lib.design.map.state.a cVar;
        MoveReason moveReason;
        E e12 = c36217a.f334676d;
        if (e12 != null) {
            ET0.a<x> aVar2 = e12.f334619a;
            ArrayList arrayList = new ArrayList(C42745f0.q(aVar2, 10));
            Iterator it = aVar2.f4014b.iterator();
            while (it.hasNext()) {
                arrayList.add(C48943a.b((x) it.next()));
            }
            bVar2 = new MapState.b(arrayList);
        } else {
            bVar2 = null;
        }
        z zVar = c36217a.f334677e;
        if (zVar != null) {
            if (zVar instanceof z.a) {
                z.a aVar3 = (z.a) zVar;
                cVar = new a.C5283a(new AvitoMapBounds(C48943a.b(aVar3.f334762a), C48943a.b(aVar3.f334763b)), false, 2, null);
            } else if (zVar instanceof z.b) {
                z.b bVar3 = (z.b) zVar;
                cVar = new a.b(C48943a.b(bVar3.f334764a), false, bVar3.f334765b, 2, null);
            } else if (zVar instanceof z.d) {
                cVar = new a.d(((z.d) zVar).f334771a, false, 2, null);
            } else if (zVar instanceof z.e) {
                cVar = new a.e(((z.e) zVar).f334773a);
            } else if (zVar instanceof z.f) {
                cVar = new a.f(((z.f) zVar).f334774a);
            } else {
                if (!(zVar instanceof z.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                z.c cVar2 = (z.c) zVar;
                AvitoMapPoint avitoMapPointB = C48943a.b(cVar2.f334767a);
                u uVar = cVar2.f334769c;
                AvitoMapBounds avitoMapBounds = new AvitoMapBounds(C48943a.b(uVar.f334754a), C48943a.b(uVar.f334755b));
                int iOrdinal = cVar2.f334770d.ordinal();
                if (iOrdinal == 0) {
                    moveReason = MoveReason.f179644b;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moveReason = MoveReason.f179645c;
                }
                cVar = new a.c(avitoMapPointB, cVar2.f334768b, avitoMapBounds, moveReason);
            }
            aVar = cVar;
        } else {
            aVar = null;
        }
        com.avito.beduin.v2.avito.component.map.state.N n12 = c36217a.f334675c;
        if (n12 != null) {
            if (n12 instanceof N.a) {
                c44338b = new C44337a(C48943a.b(((N.a) n12).f334636a), 0.0f, 2, null);
            } else {
                if (!(n12 instanceof N.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                N.b bVar4 = (N.b) n12;
                c44338b = new C44338b(C48943a.b(bVar4.f334637a), null, bVar4.f334638b, 2, null);
            }
            interfaceC44339c = c44338b;
        } else {
            interfaceC44339c = null;
        }
        List list2 = null;
        bVar.setState(new MapState(list, list2, bVar2, aVar, interfaceC44339c, new b(c36217a), new c(c36217a), new d(c36217a), new e(c36217a), null, null, MapState.DrawingMode.f179628b, new MapState.d(c36217a.f334684l, c36217a.f334683k, false, 4, null), 1536, null));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, C36217a c36217a) {
        com.avito.android.lib.design.map.b bVar = (com.avito.android.lib.design.map.b) view;
        C36217a c36217a2 = c36217a;
        bVar.setStyle((C44694a) D.a(c36217a2.f334673a, kVar));
        u(bVar, c36217a2, this.f175782n);
        D6.G(bVar, c36217a2.f334685m);
        if (c36217a2.equals(this.f175781m)) {
            return;
        }
        Context context = bVar.getContext();
        C43238h c43238h = this.f175783o;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43238h c43238hA = U.a(K.f411877a);
        this.f175783o = c43238hA;
        C43259k.d(c43238hA, null, null, new com.avito.android.lib.beduin_v2.component.map.b(this, bVar, c36217a2, context, kVar, null), 3);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        return new com.avito.android.lib.design.map.b(context, ((ActivityC22955m) context).getSupportFragmentManager(), true, null, 0, 0, 56, null);
    }
}
