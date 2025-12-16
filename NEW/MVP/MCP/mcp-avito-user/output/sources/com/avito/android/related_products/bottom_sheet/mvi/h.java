package com.avito.android.related_products.bottom_sheet.mvi;

import cj0.InterfaceC27209b;
import com.avito.android.arch.mvi.t;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.related_products.bottom_sheet.mvi.entity.RelatedProductsBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RelatedProductsBottomSheetOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "Lcj0/b;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<RelatedProductsBottomSheetInternalAction, InterfaceC27209b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC27209b b(RelatedProductsBottomSheetInternalAction relatedProductsBottomSheetInternalAction) {
        RelatedProductsBottomSheetInternalAction relatedProductsBottomSheetInternalAction2 = relatedProductsBottomSheetInternalAction;
        if (relatedProductsBottomSheetInternalAction2 instanceof RelatedProductsBottomSheetInternalAction.ContentLoaded) {
            return new InterfaceC27209b.a(((RelatedProductsBottomSheetInternalAction.ContentLoaded) relatedProductsBottomSheetInternalAction2).f252925b);
        }
        if (relatedProductsBottomSheetInternalAction2 instanceof RelatedProductsBottomSheetInternalAction.HandleBeduinEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent = ((RelatedProductsBottomSheetInternalAction.HandleBeduinEvent) relatedProductsBottomSheetInternalAction2).f252926b;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) {
                return new InterfaceC27209b.f((BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) {
                return new InterfaceC27209b.c(((BeduinOneTimeEvent.b) beduinOneTimeEvent).f176281a);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                return new InterfaceC27209b.C2059b(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
            }
        }
        return null;
    }
}
