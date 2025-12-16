package com.avito.android.realty_agency.blueprint.text_block;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TextBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/blueprint/text_block/c;", "LTV0/d;", "Lcom/avito/android/realty_agency/blueprint/text_block/e;", "Lcom/avito/android/realty_agency/blueprint/text_block/TextBlockItem;", "<init>", "()V", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements TV0.d<e, TextBlockItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        TextBlockItem textBlockItem = (TextBlockItem) aVar;
        eVar2.Y2(textBlockItem.f250883c);
        eVar2.setAppearance(textBlockItem.f250884d);
        eVar2.setColor(textBlockItem.f250885e);
        eVar2.mE(textBlockItem.f250886f);
        eVar2.Ea(textBlockItem.f250887g, textBlockItem.f250888h);
    }
}
