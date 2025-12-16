package com.avito.android.details;

import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: SelectItemBaseFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/j;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/j;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<com.avito.android.blueprints.selector_card_group_bottom_sheet.j, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectItemBaseFragment f135907l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.blueprints.selector_card_group_bottom_sheet.k f135908m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectItemBaseFragment selectItemBaseFragment, com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
        super(1);
        this.f135907l = selectItemBaseFragment;
        this.f135908m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.blueprints.selector_card_group_bottom_sheet.j jVar) {
        com.avito.android.blueprints.selector_card_group_bottom_sheet.j jVar2 = jVar;
        com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar = this.f135908m;
        SelectItemBaseFragment selectItemBaseFragment = this.f135907l;
        String str = kVar.f106704a;
        if (jVar2 != null) {
            selectItemBaseFragment.j(str, null, Collections.singletonList(jVar2.f106699c));
        } else {
            selectItemBaseFragment.j(str, null, C42784z0.f406748b);
        }
        return G0.f406611a;
    }
}
