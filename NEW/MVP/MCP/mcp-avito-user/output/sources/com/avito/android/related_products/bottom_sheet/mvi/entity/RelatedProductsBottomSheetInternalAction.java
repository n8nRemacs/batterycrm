package com.avito.android.related_products.bottom_sheet.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProductsBottomSheetInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "HandleBeduinEvent", "HandleBeduinState", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction$ContentLoaded;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction$HandleBeduinEvent;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction$HandleBeduinState;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RelatedProductsBottomSheetInternalAction extends n {

    /* compiled from: RelatedProductsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction$ContentLoaded;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements RelatedProductsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f252925b;

        public ContentLoaded(@k String str) {
            this.f252925b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f252925b, ((ContentLoaded) obj).f252925b);
        }

        public final int hashCode() {
            return this.f252925b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ContentLoaded(content="), this.f252925b, ')');
        }
    }

    /* compiled from: RelatedProductsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction$HandleBeduinEvent;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinEvent implements RelatedProductsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f252926b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f252926b = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinEvent) && L.f(this.f252926b, ((HandleBeduinEvent) obj).f252926b);
        }

        public final int hashCode() {
            return this.f252926b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f252926b + ')';
        }
    }

    /* compiled from: RelatedProductsBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction$HandleBeduinState;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinState implements RelatedProductsBottomSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f252927b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f252927b = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinState) && L.f(this.f252927b, ((HandleBeduinState) obj).f252927b);
        }

        public final int hashCode() {
            return this.f252927b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinState(beduinState=" + this.f252927b + ')';
        }
    }
}
