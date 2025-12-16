package com.avito.android.lib.beduin_v2.component.accordion;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.accordion.Accordion;
import com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.render.android_view.r;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AccordionComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/accordion/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState;", "Lcom/avito/android/lib/design/accordion/Accordion;", "a", "_design-modules_beduin-v2_renderer_component_accordion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<AvitoAccordionState, Accordion> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f175497m;

    /* renamed from: n, reason: collision with root package name */
    public s<AvitoAccordionState.a> f175498n;

    /* renamed from: o, reason: collision with root package name */
    public s<AvitoAccordionState.b.a> f175499o;

    /* compiled from: AccordionComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/accordion/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/accordion/state/AvitoAccordionState;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_accordion"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<AvitoAccordionState> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f175500c = new a();

        public a() {
            super(com.avito.beduin.v2.avito.component.accordion.state.a.f333714c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(a12);
        }
    }

    /* compiled from: AccordionComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.accordion.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C5179b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175501a;

        static {
            int[] iArr = new int[AvitoAccordionState.ArrowAlignment.values().length];
            try {
                AvitoAccordionState.ArrowAlignment[] arrowAlignmentArr = AvitoAccordionState.ArrowAlignment.f333707b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoAccordionState.ArrowAlignment[] arrowAlignmentArr2 = AvitoAccordionState.ArrowAlignment.f333707b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f175501a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k A a12) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f175497m = a12;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r21, com.avito.beduin.v2.theme.k r22, com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r21
            com.avito.android.lib.design.accordion.Accordion r2 = (com.avito.android.lib.design.accordion.Accordion) r2
            r3 = r23
            com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState r3 = (com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState) r3
            com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.accordion.state.k> r4 = r3.f333702g
            java.lang.Object r4 = com.avito.beduin.v2.render.android_view.D.a(r4, r1)
            com.avito.android.lib.design.accordion.a r4 = (com.avito.android.lib.design.accordion.a) r4
            r2.setStyle(r4)
            com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$b r4 = r3.f333696a
            java.lang.String r6 = r4.f333711b
            if (r6 == 0) goto L23
            java.lang.Integer r6 = com.avito.android.lib.util.f.m(r6)
            r9 = r6
            goto L24
        L23:
            r9 = 0
        L24:
            r6 = -1
            com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$ArrowAlignment r7 = r3.f333697b
            if (r7 != 0) goto L2b
            r7 = r6
            goto L33
        L2b:
            int[] r8 = com.avito.android.lib.beduin_v2.component.accordion.b.C5179b.f175501a
            int r7 = r7.ordinal()
            r7 = r8[r7]
        L33:
            if (r7 == r6) goto L43
            r6 = 1
            if (r7 == r6) goto L43
            r8 = 2
            if (r7 != r8) goto L3d
        L3b:
            r10 = r6
            goto L45
        L3d:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L43:
            r6 = 0
            goto L3b
        L45:
            java.lang.ref.WeakReference<com.avito.beduin.v2.engine.component.i> r6 = r0.f337943c
            if (r6 == 0) goto L50
            java.lang.Object r6 = r6.get()
            com.avito.beduin.v2.engine.component.i r6 = (com.avito.beduin.v2.engine.component.InterfaceC36249i) r6
            goto L51
        L50:
            r6 = 0
        L51:
            com.avito.beduin.v2.engine.component.i r7 = r20.k()
            boolean r16 = kotlin.jvm.internal.L.f(r6, r7)
            com.avito.android.lib.beduin_v2.component.accordion.c r6 = new com.avito.android.lib.beduin_v2.component.accordion.c
            r6.<init>(r3)
            QU.d r15 = new QU.d
            r14 = 0
            r17 = 0
            java.lang.String r8 = r4.f333710a
            boolean r11 = r3.f333700e
            boolean r12 = r3.f333699d
            r13 = 0
            r18 = 224(0xe0, float:3.14E-43)
            r19 = 0
            r7 = r15
            r5 = r15
            r15 = r17
            r17 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.setState(r5)
            boolean r5 = r3.f333703h
            com.avito.android.util.D6.G(r2, r5)
            com.avito.beduin.v2.render.android_view.s<com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$a> r2 = r0.f175498n
            if (r2 != 0) goto L84
            r2 = 0
        L84:
            com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$a r3 = r3.f333698c
            java.util.List r3 = kotlin.collections.C42745f0.V(r3)
            com.avito.android.lib.beduin_v2.component.accordion.d r5 = com.avito.android.lib.beduin_v2.component.accordion.d.f175503l
            com.avito.beduin.v2.render.android_view.s.a(r5, r2, r1, r3)
            com.avito.beduin.v2.render.android_view.s<com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$b$a> r2 = r0.f175499o
            if (r2 != 0) goto L95
            r5 = 0
            goto L96
        L95:
            r5 = r2
        L96:
            com.avito.beduin.v2.avito.component.accordion.state.AvitoAccordionState$b$a r2 = r4.f333712c
            java.util.List r2 = kotlin.collections.C42745f0.V(r2)
            com.avito.android.lib.beduin_v2.component.accordion.e r3 = com.avito.android.lib.beduin_v2.component.accordion.e.f175504l
            com.avito.beduin.v2.render.android_view.s.a(r3, r5, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.accordion.b.l(android.view.View, com.avito.beduin.v2.theme.k, java.lang.Object):void");
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        Accordion accordion = new Accordion(viewGroup.getContext(), null, 0, 0, 14, null);
        accordion.setHasCustomContent(true);
        FrameLayout customContentContainer = accordion.getCustomContentContainer();
        A a12 = this.f175497m;
        this.f175498n = new s<>(this.f175497m, a12.f337907c, customContentContainer, new f(), R.id.accordion_child_component, (r) null);
        FrameLayout accessoryContainer = accordion.getAccessoryContainer();
        com.avito.android.lib.beduin_v2.component.accordion.a aVar = new com.avito.android.lib.beduin_v2.component.accordion.a();
        this.f175499o = new s<>(this.f175497m, a12.f337907c, accessoryContainer, aVar, R.id.accordion_accessory_child_component, (r) null);
        return accordion;
    }
}
