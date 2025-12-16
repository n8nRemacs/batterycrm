package com.avito.android.model_card;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinSnippetListItemComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/model_card/e;", "Lej/b;", "Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel;", "Lcom/avito/android/beduin/common/component/snippet_list_item/c;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements InterfaceC40113b<BeduinSnippetListItemModel, com.avito.android.beduin.common.component.snippet_list_item.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f198029a;

    @Inject
    public e(@k c cVar) {
        this.f198029a = cVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new com.avito.android.beduin.common.component.snippet_list_item.c(interfaceC15523b, (BeduinSnippetListItemModel) beduinModel, this.f198029a);
    }
}
