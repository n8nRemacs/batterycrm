package com.avito.android.lib.beduin_v2.component.selector_card;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCard;
import com.avito.android.lib.design.selector_card.SelectorCardState;
import com.avito.beduin.v2.avito.component.selector_card.state.AvitoSelectorCardState;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: SelectorCardComponent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/selector_card/b;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState;", "Lcom/avito/android/lib/design/selector_card/SelectorCard;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$b;", "a", "b", "c", "_design-modules_beduin-v2_renderer_component_selector-card"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends q<AvitoSelectorCardState, SelectorCard, AvitoSelectorCardState.b> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f175890m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public s<AvitoSelectorCardState.b> f175891n;

    /* compiled from: SelectorCardComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/selector_card/b$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState$b;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_selector-card"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements s.c<AvitoSelectorCardState.b> {
        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final /* bridge */ /* synthetic */ boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
            return true;
        }

        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
            return new FrameLayout.LayoutParams(-1, -1);
        }

        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final /* bridge */ /* synthetic */ boolean h(InterfaceC36244d interfaceC36244d) {
            return true;
        }
    }

    /* compiled from: SelectorCardComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/selector_card/b$c;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/selector_card/state/AvitoSelectorCardState;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_selector-card"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends n<AvitoSelectorCardState> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final c f175893c = new c();

        public c() {
            super(com.avito.beduin.v2.avito.component.selector_card.state.k.f335080c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(a12);
        }
    }

    /* compiled from: SelectorCardComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[AvitoSelectorCardState.CardState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoSelectorCardState.CardState cardState = AvitoSelectorCardState.CardState.f335060c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AvitoSelectorCardState.CardIndicatorType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvitoSelectorCardState.CardIndicatorType cardIndicatorType = AvitoSelectorCardState.CardIndicatorType.f335052c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AvitoSelectorCardState.CardIndicatorType cardIndicatorType2 = AvitoSelectorCardState.CardIndicatorType.f335052c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[AvitoSelectorCardState.CardSelectionType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AvitoSelectorCardState.CardSelectionType cardSelectionType = AvitoSelectorCardState.CardSelectionType.f335056c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AvitoSelectorCardState.CardSelectionType cardSelectionType2 = AvitoSelectorCardState.CardSelectionType.f335056c;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public b(@k A a12) {
        super(null, 1, null);
        this.f175890m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        SelectorCardState.Status status;
        SelectorCardState.Indicator indicator;
        SelectorCardState.Border border;
        SelectorCard selectorCard = (SelectorCard) view;
        AvitoSelectorCardState avitoSelectorCardState = (AvitoSelectorCardState) obj;
        com.avito.beduin.v2.avito.component.selector_card.state.a aVar = avitoSelectorCardState.f335046g;
        boolean z12 = aVar instanceof AvitoSelectorCardState.c;
        if (z12 || aVar == null) {
            s<AvitoSelectorCardState.b> sVar = this.f175891n;
            if (sVar != null) {
                s.a(com.avito.android.lib.beduin_v2.component.selector_card.c.f175894l, sVar, kVar, C42784z0.f406748b);
            }
            this.f175891n = null;
        }
        selectorCard.setStyle((com.avito.android.lib.design.selector_card.style.c) D.a(avitoSelectorCardState.f335040a, kVar));
        int iOrdinal = avitoSelectorCardState.f335041b.ordinal();
        if (iOrdinal == 0) {
            status = SelectorCardState.Status.f180386b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            status = SelectorCardState.Status.f180387c;
        }
        SelectorCardState.Status status2 = status;
        int iOrdinal2 = avitoSelectorCardState.f335043d.ordinal();
        if (iOrdinal2 == 0) {
            indicator = SelectorCardState.Indicator.f180381b;
        } else if (iOrdinal2 == 1) {
            indicator = SelectorCardState.Indicator.f180382c;
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            indicator = SelectorCardState.Indicator.f180383d;
        }
        SelectorCardState.Indicator indicator2 = indicator;
        int iOrdinal3 = avitoSelectorCardState.f335042c.ordinal();
        if (iOrdinal3 == 0) {
            border = SelectorCardState.Border.f180376b;
        } else if (iOrdinal3 == 1) {
            border = SelectorCardState.Border.f180377c;
        } else {
            if (iOrdinal3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            border = SelectorCardState.Border.f180378d;
        }
        SelectorCardState.Border border2 = border;
        AvitoSelectorCardState.c cVar = z12 ? (AvitoSelectorCardState.c) aVar : null;
        selectorCard.setState(new SelectorCardState(status2, indicator2, border2, avitoSelectorCardState.f335044e, avitoSelectorCardState.f335045f, cVar != null ? new SelectorCardState.a(cVar.f335066a, cVar.f335067b) : null, avitoSelectorCardState.f335047h));
        M.a(selectorCard, avitoSelectorCardState.f335048i);
        if (aVar instanceof AvitoSelectorCardState.a) {
            s<AvitoSelectorCardState.b> sVar2 = this.f175891n;
            if (sVar2 == null) {
                A a12 = this.f175890m;
                sVar2 = new s<>(a12, a12.f337907c, selectorCard.getContentContainerView(), new a(), R.id.selector_card_child_component, this);
            }
            this.f175891n = sVar2;
            s.a(com.avito.android.lib.beduin_v2.component.selector_card.d.f175895l, sVar2, kVar, C42745f0.V(((AvitoSelectorCardState.a) aVar).f335064a));
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new SelectorCard(viewGroup.getContext(), null, 0, 0, 14, null);
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<AvitoSelectorCardState.b> sVar = this.f175891n;
        return sVar != null ? sVar : C5201b.f175892a;
    }

    /* compiled from: SelectorCardComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/selector_card/b$b;", "Lcom/avito/beduin/v2/render/android_view/C;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_selector-card"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.selector_card.b$b, reason: collision with other inner class name */
    public static final class C5201b implements C {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C5201b f175892a = new C5201b();

        @Override // com.avito.beduin.v2.render.android_view.C
        @l
        public final Bundle H() {
            return null;
        }

        @Override // com.avito.beduin.v2.render.android_view.C
        public final void b(@k Bundle bundle) {
        }
    }
}
