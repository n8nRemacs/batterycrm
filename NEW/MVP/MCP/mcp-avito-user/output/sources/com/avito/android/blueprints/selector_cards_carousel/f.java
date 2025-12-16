package com.avito.android.blueprints.selector_cards_carousel;

import Ij.C14119a;
import JO.m;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35816i5;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardsCarouselPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/selector_cards_carousel/f;", "Lcom/avito/android/blueprints/selector_cards_carousel/e;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106724b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106725c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106726d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f106727e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.b<C14119a> f106728f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106729g;

    /* renamed from: h, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.SelectorCardsCarousel> f106730h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106731i;

    /* compiled from: SelectorCardsCarouselPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/blueprints/selector_cards_carousel/f$a;", "", "<init>", "()V", "", "CLICKS_DELAY", "J", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f106724b = aVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106725c = cVar;
        this.f106726d = new C41981q0(cVar);
        this.f106727e = new LinkedHashMap();
        com.jakewharton.rxrelay3.b<C14119a> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f106728f = bVar;
        this.f106729g = new C41981q0(bVar.y(600L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()));
        com.jakewharton.rxrelay3.c<ParameterElement.SelectorCardsCarousel> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106730h = cVar2;
        this.f106731i = new C41981q0(cVar2);
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.e
    @Y61.k
    /* renamed from: I, reason: from getter */
    public final C41981q0 getF106726d() {
        return this.f106726d;
    }

    public final void O(String str, List<? extends ParameterElement.SelectorCardsCarousel.a> list) {
        LinkedHashMap linkedHashMap = this.f106727e;
        linkedHashMap.clear();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.SelectorCardsCarousel.a.C3417a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParameterElement.SelectorCardsCarousel.a.C3417a c3417a = (ParameterElement.SelectorCardsCarousel.a.C3417a) it.next();
            String str2 = c3417a.f117367c;
            linkedHashMap.put(str2, new Ij.b(str, new m(str2, c3417a.f117368d, null, c3417a.f117370f, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null), null, 4, null));
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (ParameterElement.SelectorCardsCarousel) aVar);
    }

    public final void V(k kVar, ParameterElement.SelectorCardsCarousel selectorCardsCarousel) {
        Context f106742d = kVar.getF106742d();
        ItemWithState.State state = selectorCardsCarousel.f117360j;
        boolean z12 = state instanceof ItemWithState.State.Normal;
        com.avito.android.util.text.a aVar = this.f106724b;
        AttributedText attributedText = selectorCardsCarousel.f117359i;
        if (z12) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceC = charSequence;
            } else if (attributedText != null) {
                charSequenceC = aVar.c(f106742d, attributedText);
            }
            kVar.u(charSequenceC);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            kVar.K1(((ItemWithState.State.Warning) state).f173900b, null);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            kVar.K1(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, attributedText != null ? aVar.c(f106742d, attributedText) : null);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            kVar.K1(null, attributedText != null ? aVar.c(f106742d, attributedText) : null);
        }
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.e
    @Y61.k
    /* renamed from: W, reason: from getter */
    public final C41981q0 getF106729g() {
        return this.f106729g;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        ParameterElement.SelectorCardsCarousel selectorCardsCarousel = (ParameterElement.SelectorCardsCarousel) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35816i5) {
                obj = obj2;
            }
        }
        C35816i5 c35816i5 = (C35816i5) (obj instanceof C35816i5 ? obj : null);
        if (c35816i5 == null) {
            k(kVar, selectorCardsCarousel);
            return;
        }
        List<ParameterElement.SelectorCardsCarousel.a> list2 = c35816i5.f318903a;
        if (list2 != null) {
            O(selectorCardsCarousel.f117181b, list2);
            kVar.cx(list2, selectorCardsCarousel.f117357g, new h(this, selectorCardsCarousel), new i(this, selectorCardsCarousel));
        }
        if (c35816i5.f318904b != null) {
            V(kVar, selectorCardsCarousel);
        }
    }

    @Override // com.avito.android.blueprints.selector_cards_carousel.e
    @Y61.k
    /* renamed from: h4, reason: from getter */
    public final C41981q0 getF106731i() {
        return this.f106731i;
    }

    public final void k(@Y61.k k kVar, @Y61.k ParameterElement.SelectorCardsCarousel selectorCardsCarousel) {
        String str = selectorCardsCarousel.f117181b;
        List<ParameterElement.SelectorCardsCarousel.a> list = selectorCardsCarousel.f117355e;
        O(str, list);
        kVar.setTitle(selectorCardsCarousel.f117354d);
        kVar.cx(list, selectorCardsCarousel.f117357g, new h(this, selectorCardsCarousel), new i(this, selectorCardsCarousel));
        if (selectorCardsCarousel.f117356f != null) {
            kVar.i4(new g(this, selectorCardsCarousel));
        } else {
            kVar.i4(null);
        }
        V(kVar, selectorCardsCarousel);
    }
}
