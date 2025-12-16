package com.avito.android.lib.beduin_v2.component.tooltip;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.bottom_navigation.C28888j;
import com.avito.android.lib.design.tooltip.h;
import com.avito.android.lib.design.tooltip.q;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.tooltip.state.TooltipPosition;
import com.avito.beduin.v2.avito.component.tooltip.state.m;
import com.avito.beduin.v2.avito.component.tooltip.state.p;
import com.avito.beduin.v2.avito.component.tooltip.state.r;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: TooltipComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/tooltip/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/a;", "Landroid/widget/FrameLayout;", "a", "_design-modules_beduin-v2_renderer_component_tooltip"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<com.avito.beduin.v2.avito.component.tooltip.state.a, FrameLayout> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f175949m;

    /* renamed from: n, reason: collision with root package name */
    public s<r> f175950n;

    /* renamed from: o, reason: collision with root package name */
    public com.avito.android.lib.design.tooltip.k f175951o;

    /* compiled from: TooltipComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/tooltip/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_tooltip"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<com.avito.beduin.v2.avito.component.tooltip.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f175952c = new a();

        public a() {
            super(m.f335451c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(a12);
        }
    }

    /* compiled from: TooltipComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.tooltip.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C5207b {
        static {
            int[] iArr = new int[TooltipPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TooltipPosition.a aVar = TooltipPosition.f335423c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TooltipPosition.a aVar2 = TooltipPosition.f335423c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TooltipPosition.a aVar3 = TooltipPosition.f335423c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: TooltipComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.avito.component.tooltip.state.a f175954m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f175955n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f175956o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.beduin.v2.avito.component.tooltip.state.a aVar, p pVar, FrameLayout frameLayout) {
            super(0);
            this.f175954m = aVar;
            this.f175955n = pVar;
            this.f175956o = frameLayout;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.u(b.this, this.f175954m, this.f175955n, this.f175956o);
            return G0.f406611a;
        }
    }

    /* compiled from: TooltipComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f175957l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: TooltipComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.avito.component.tooltip.state.a f175959m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p f175960n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f175961o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.beduin.v2.avito.component.tooltip.state.a aVar, p pVar, FrameLayout frameLayout) {
            super(0);
            this.f175959m = aVar;
            this.f175960n = pVar;
            this.f175961o = frameLayout;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.u(b.this, this.f175959m, this.f175960n, this.f175961o);
            return G0.f406611a;
        }
    }

    public b(@k A a12) {
        super(null, 1, null);
        this.f175949m = a12;
    }

    public static final void u(b bVar, com.avito.beduin.v2.avito.component.tooltip.state.a aVar, p pVar, FrameLayout frameLayout) {
        TooltipState tooltipStateV = bVar.v(aVar, pVar, frameLayout);
        com.avito.android.lib.design.tooltip.k kVar = bVar.f175951o;
        if (kVar == null) {
            kVar = null;
        }
        kVar.b(TooltipState.a(tooltipStateV, null, null, null, TooltipState.State.f181286c, 8191));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.tooltip.state.a aVar) {
        FrameLayout frameLayout = (FrameLayout) view;
        com.avito.beduin.v2.avito.component.tooltip.state.a aVar2 = aVar;
        s<r> sVar = this.f175950n;
        if (sVar == null) {
            sVar = null;
        }
        s.a(com.avito.android.lib.beduin_v2.component.tooltip.c.f175962l, sVar, kVar, C42745f0.V(aVar2.f335432f));
        D6.G(frameLayout, aVar2.f335436j);
        com.avito.android.lib.design.tooltip.k kVar2 = this.f175951o;
        com.avito.android.lib.design.tooltip.k kVar3 = kVar2 != null ? kVar2 : null;
        KV.a aVar3 = (KV.a) D.a(aVar2.f335433g, kVar);
        Resources resources = frameLayout.getResources();
        int i12 = aVar2.f335435i;
        kVar3.c(KV.a.a(aVar3, i12 != -2 ? ET0.d.b(resources, i12) : -2, 0, 0, 2097150));
        kVar3.b(v(aVar2, aVar2.f335430d, frameLayout));
        kVar3.setOnDismissListener(new C28888j(aVar2, 1));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        A a12 = this.f175949m;
        this.f175950n = new s<>(a12, a12.f337907c, frameLayout, new com.avito.android.lib.beduin_v2.component.tooltip.d(), R.id.tooltip_child_component, (com.avito.beduin.v2.render.android_view.r) null);
        this.f175951o = new com.avito.android.lib.design.tooltip.k(viewGroup.getContext(), 0, 0, 6, null);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TooltipState v(com.avito.beduin.v2.avito.component.tooltip.state.a aVar, p pVar, FrameLayout frameLayout) {
        q bVar;
        int iOrdinal = aVar.f335427a.ordinal();
        int i12 = 1;
        h hVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (iOrdinal == 0) {
            bVar = new r.b(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        } else if (iOrdinal == 1) {
            bVar = new r.d(objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
        } else if (iOrdinal == 2) {
            bVar = new r.c(objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0);
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new r.a(hVar, i12, objArr7 == true ? 1 : 0);
        }
        return new TooltipState(bVar, aVar.f335428b, aVar.f335429c ? new c(aVar, pVar, frameLayout) : d.f175957l, pVar.f335455a, pVar.f335456b, pVar.f335457c, pVar.f335458d, null, null, null, pVar.f335459e, new e(aVar, pVar, frameLayout), frameLayout, aVar.f335434h ? TooltipState.State.f181285b : TooltipState.State.f181286c, 896, null);
    }
}
