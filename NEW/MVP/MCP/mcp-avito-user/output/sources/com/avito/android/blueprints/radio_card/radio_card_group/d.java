package com.avito.android.blueprints.radio_card.radio_card_group;

import Y41.p;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RadioCardsGroupPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJO/m;", "selectableItem", "", "isSelected", "Lkotlin/G0;", "invoke", "(LJO/m;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements p<JO.m, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f106535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C.b f106536m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, ParameterElement.C.b bVar) {
        super(2);
        this.f106535l = gVar;
        this.f106536m = bVar;
    }

    @Override // Y41.p
    public final G0 invoke(JO.m mVar, Boolean bool) {
        this.f106535l.f106539b.accept(new Ij.b(this.f106536m.f117181b, JO.m.a(mVar, bool.booleanValue()), null, 4, null));
        return G0.f406611a;
    }
}
