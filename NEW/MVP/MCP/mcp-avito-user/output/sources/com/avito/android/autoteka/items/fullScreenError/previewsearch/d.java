package com.avito.android.autoteka.items.fullScreenError.previewsearch;

import Ff.InterfaceC13798a;
import Y41.l;
import Y61.k;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PreviewSearchFullScreenErrorPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/previewsearch/d;", "LTV0/d;", "LFf/a;", "Lcom/avito/android/autoteka/items/fullScreenError/previewsearch/PreviewSearchFullScreenErrorItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<InterfaceC13798a, PreviewSearchFullScreenErrorItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<AutotekaPreviewSearchAction, G0> f96801b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super AutotekaPreviewSearchAction, G0> lVar) {
        this.f96801b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC13798a interfaceC13798a = (InterfaceC13798a) eVar;
        PreviewSearchFullScreenErrorItem previewSearchFullScreenErrorItem = (PreviewSearchFullScreenErrorItem) aVar;
        interfaceC13798a.Y2(previewSearchFullScreenErrorItem.f96792d);
        interfaceC13798a.p1(previewSearchFullScreenErrorItem.f96791c);
        interfaceC13798a.Zh(previewSearchFullScreenErrorItem.f96793e);
        ButtonData buttonData = previewSearchFullScreenErrorItem.f96794f;
        if (buttonData == null) {
            interfaceC13798a.L1();
        } else {
            interfaceC13798a.l4(buttonData.f96788b, new c(this, buttonData));
        }
    }
}
