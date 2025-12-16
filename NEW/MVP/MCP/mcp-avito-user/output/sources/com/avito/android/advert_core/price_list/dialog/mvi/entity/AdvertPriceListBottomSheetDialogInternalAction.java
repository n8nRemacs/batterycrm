package com.avito.android.advert_core.price_list.dialog.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPriceListBottomSheetDialogInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction$Content;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertPriceListBottomSheetDialogInternalAction extends n {

    /* compiled from: AdvertPriceListBottomSheetDialogInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction$Content;", "Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements AdvertPriceListBottomSheetDialogInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AdvertPriceListSectionItem> f84089b;

        public Content(@k List<AdvertPriceListSectionItem> list) {
            this.f84089b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF200214d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f84089b, ((Content) obj).f84089b);
        }

        public final int hashCode() {
            return this.f84089b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(items="), this.f84089b, ')');
        }
    }
}
