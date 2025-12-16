package com.avito.android.blueprints.selector_cards_carousel;

import Y41.p;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.SelectorCardSelectStrategy;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.validation.InterfaceC36016k;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardsCarouselView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/selector_cards_carousel/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/selector_cards_carousel/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f106740b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SelectorCardGroup f106741c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f106742d;

    /* compiled from: SelectorCardsCarouselView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ParameterElement.SelectorCardsCarousel.SelectType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParameterElement.SelectorCardsCarousel.SelectType selectType = ParameterElement.SelectorCardsCarousel.SelectType.f117362b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SelectorCardsCarouselView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprints/selector_cards_carousel/l$b", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements SelectorCardGroup.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<ParameterElement.SelectorCardsCarousel.a.C3417a, Boolean, G0> f106743a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f106744b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f106745c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super ParameterElement.SelectorCardsCarousel.a.C3417a, ? super Boolean, G0> pVar, l lVar, Y41.a<G0> aVar) {
            this.f106743a = pVar;
            this.f106744b = lVar;
            this.f106745c = aVar;
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@Y61.k r rVar) {
            ParameterElement.SelectorCardsCarousel.a aVar = (ParameterElement.SelectorCardsCarousel.a) rVar;
            if (aVar instanceof ParameterElement.SelectorCardsCarousel.a.C3417a) {
                this.f106743a.invoke(rVar, Boolean.FALSE);
            } else if (aVar instanceof ParameterElement.SelectorCardsCarousel.a.b) {
                this.f106744b.f106741c.d(rVar, false);
                this.f106745c.invoke();
            }
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@Y61.k r rVar) {
            ParameterElement.SelectorCardsCarousel.a aVar = (ParameterElement.SelectorCardsCarousel.a) rVar;
            if (aVar instanceof ParameterElement.SelectorCardsCarousel.a.C3417a) {
                this.f106743a.invoke(rVar, Boolean.TRUE);
            } else if (aVar instanceof ParameterElement.SelectorCardsCarousel.a.b) {
                this.f106744b.f106741c.d(rVar, false);
                this.f106745c.invoke();
            }
        }
    }

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f106740b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.selector_card_group);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.selector_card.SelectorCardGroup");
        }
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) viewFindViewById2;
        selectorCardGroup.setAppearance(R.style.Design_Widget_SelectorCardsCarousel);
        selectorCardGroup.setContentBinderFactory(new d());
        this.f106741c = selectorCardGroup;
        this.f106742d = view.getContext();
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.k
    public final void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f106740b;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(charSequence2);
        }
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.k
    public final void cx(@Y61.k List<? extends ParameterElement.SelectorCardsCarousel.a> list, @Y61.k ParameterElement.SelectorCardsCarousel.SelectType selectType, @Y61.k p<? super ParameterElement.SelectorCardsCarousel.a.C3417a, ? super Boolean, G0> pVar, @Y61.k Y41.a<G0> aVar) {
        SelectorCardSelectStrategy selectorCardSelectStrategy;
        int iOrdinal = selectType.ordinal();
        if (iOrdinal == 0) {
            selectorCardSelectStrategy = SelectorCardSelectStrategy.f180365b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            selectorCardSelectStrategy = SelectorCardSelectStrategy.f180366c;
        }
        SelectorCardGroup selectorCardGroup = this.f106741c;
        selectorCardGroup.setSelectStrategy(selectorCardSelectStrategy);
        selectorCardGroup.setData(list);
        selectorCardGroup.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ParameterElement.SelectorCardsCarousel.a) obj).getF117366b()) {
                arrayList.add(obj);
            }
        }
        selectorCardGroup.e(arrayList);
        selectorCardGroup.setSelectedListener(new b(pVar, this, aVar));
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.k
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final Context getF106742d() {
        return this.f106742d;
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.k
    public final void i4(@Y61.l Y41.a<G0> aVar) {
        ComponentContainer componentContainer = this.f106740b;
        if (aVar != null) {
            componentContainer.setTitleTipListener(aVar);
        } else {
            componentContainer.setTitleTipListener(null);
        }
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.k
    public final void setTitle(@Y61.k String str) {
        this.f106740b.setTitle(str);
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.k
    public final void u(@Y61.l CharSequence charSequence) {
        this.f106740b.q(charSequence);
    }
}
