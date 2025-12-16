package UR;

import Y61.k;
import aV.C19820c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bV.C25568a;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.docking_badge.state.EdgeType;
import com.avito.beduin.v2.avito.component.docking_badge.state.n;
import com.avito.beduin.v2.avito.component.docking_badge.state.o;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DockingBadgeComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LUR/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/docking_badge/state/n;", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_docking-badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<n, DockingBadge> {

    /* compiled from: DockingBadgeComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LUR/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/docking_badge/state/n;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_docking-badge"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UR.a$a, reason: collision with other inner class name */
    public static final class C1126a extends com.avito.beduin.v2.render.android_view.n<n> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C1126a f16380c = new C1126a();

        public C1126a() {
            super(o.f334345c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* compiled from: DockingBadgeComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16381a;

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
            f16381a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    public static DockingBadgeEdgeType u(EdgeType edgeType) {
        int i12 = edgeType == null ? -1 : b.f16381a[edgeType.ordinal()];
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
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, n nVar) {
        DockingBadge dockingBadge = (DockingBadge) view;
        n nVar2 = nVar;
        dockingBadge.setStyle((C25568a) D.a(nVar2.f334340d, kVar));
        dockingBadge.setState(new C19820c(nVar2.f334337a, u(nVar2.f334338b), u(nVar2.f334339c)));
        D6.G(dockingBadge, nVar2.f334341e);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new DockingBadge(viewGroup.getContext(), (AttributeSet) null, 0, 0, 14, (C42822w) null);
    }
}
