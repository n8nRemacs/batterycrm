package com.avito.android.blueprints.selector_cards_carousel;

import Ij.C14119a;
import JO.m;
import Y41.p;
import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardsCarouselPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a$a;", "option", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a$a;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements p<ParameterElement.SelectorCardsCarousel.a.C3417a, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.SelectorCardsCarousel f106734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f106735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, ParameterElement.SelectorCardsCarousel selectorCardsCarousel) {
        super(2);
        this.f106734l = selectorCardsCarousel;
        this.f106735m = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(ParameterElement.SelectorCardsCarousel.a.C3417a c3417a, Boolean bool) {
        ParameterElement.SelectorCardsCarousel.a.C3417a c3417a2 = c3417a;
        boolean zBooleanValue = bool.booleanValue();
        ParameterElement.SelectorCardsCarousel selectorCardsCarousel = this.f106734l;
        ParameterElement.SelectorCardsCarousel selectorCardsCarousel2 = selectorCardsCarousel;
        Ij.b bVar = new Ij.b(selectorCardsCarousel.f117181b, new m(c3417a2.f117367c, c3417a2.f117368d, null, zBooleanValue, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null), null, 4, null);
        f fVar = this.f106735m;
        fVar.f106727e.put(c3417a2.f117367c, bVar);
        Collection collectionValues = fVar.f106727e.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            ParameterElement.SelectorCardsCarousel selectorCardsCarousel3 = selectorCardsCarousel2;
            if (L.f(((Ij.b) obj).f8494a, selectorCardsCarousel3.f117181b)) {
                arrayList.add(obj);
            }
            selectorCardsCarousel2 = selectorCardsCarousel3;
        }
        fVar.f106728f.accept(new C14119a(C42745f0.M0(arrayList), selectorCardsCarousel2.f117357g));
        return G0.f406611a;
    }
}
