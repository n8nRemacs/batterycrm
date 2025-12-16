package WR;

import Y61.k;
import aV.C19818a;
import android.view.View;
import android.view.ViewGroup;
import bV.C25568a;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.docking_badge.state.EdgeType;
import com.avito.beduin.v2.avito.component.docking_badge.state.m;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DockingBadgeGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LWR/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/docking_badge/state/a;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeContainer;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_docking-badge-group"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.docking_badge.state.a, DockingBadgeContainer> {

    /* compiled from: DockingBadgeGroupComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LWR/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/docking_badge/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_docking-badge-group"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WR.a$a, reason: collision with other inner class name */
    public static final class C1272a extends n<com.avito.beduin.v2.avito.component.docking_badge.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C1272a f17922c = new C1272a();

        public C1272a() {
            super(m.f334336c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* compiled from: DockingBadgeGroupComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17923a;

        static {
            int[] iArr = new int[EdgeType.values().length];
            try {
                EdgeType.a aVar = EdgeType.f334313c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EdgeType.a aVar2 = EdgeType.f334313c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EdgeType.a aVar3 = EdgeType.f334313c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EdgeType.a aVar4 = EdgeType.f334313c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EdgeType.a aVar5 = EdgeType.f334313c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17923a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    public static DockingBadgeEdgeType u(EdgeType edgeType) {
        int i12 = edgeType == null ? -1 : b.f17923a[edgeType.ordinal()];
        if (i12 == 1) {
            return DockingBadgeEdgeType.Square;
        }
        if (i12 == 2) {
            return DockingBadgeEdgeType.Flag;
        }
        if (i12 == 3) {
            return DockingBadgeEdgeType.Pipka;
        }
        if (i12 == 4) {
            return DockingBadgeEdgeType.Pyramid;
        }
        if (i12 != 5) {
            return null;
        }
        return DockingBadgeEdgeType.AntiPyramid;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.docking_badge.state.a aVar) {
        DockingBadgeContainer dockingBadgeContainer = (DockingBadgeContainer) view;
        com.avito.beduin.v2.avito.component.docking_badge.state.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (com.avito.beduin.v2.avito.component.docking_badge.state.n nVar : aVar2.f334318a) {
            C25568a c25568a = (C25568a) D.a(nVar.f334340d, kVar);
            DockingBadgeEdgeType dockingBadgeEdgeTypeU = u(nVar.f334338b);
            if (dockingBadgeEdgeTypeU == null) {
                dockingBadgeEdgeTypeU = DockingBadgeEdgeType.Square;
            }
            arrayList.add(new DockingBadgeItem(nVar.f334337a, null, u(nVar.f334339c), dockingBadgeEdgeTypeU, c25568a, 2, null));
        }
        dockingBadgeContainer.setState(new C19818a(aVar2.f334319b, aVar2.f334320c, arrayList));
        D6.G(dockingBadgeContainer, aVar2.f334321d);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new DockingBadgeContainer(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
