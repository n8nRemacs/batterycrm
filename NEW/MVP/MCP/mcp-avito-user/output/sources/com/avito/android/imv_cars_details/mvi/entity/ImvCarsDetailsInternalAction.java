package com.avito.android.imv_cars_details.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.DifferenceImvAvgPriceItem;
import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsResponse;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OpenLink", "ScrollToItem", "ShowLoadedContent", "ShowLoadingError", "ShowToast", "SkipState", "StartLoading", "UpdateItems", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$OpenLink;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ScrollToItem;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ShowLoadedContent;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ShowLoadingError;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ShowToast;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$SkipState;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$StartLoading;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$UpdateItems;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ImvCarsDetailsInternalAction extends n {

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$OpenLink;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLink implements ImvCarsDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f169990b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f169991c;

        public OpenLink(@k DeepLink deepLink, @l String str) {
            this.f169990b = deepLink;
            this.f169991c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenLink)) {
                return false;
            }
            OpenLink openLink = (OpenLink) obj;
            return L.f(this.f169990b, openLink.f169990b) && L.f(this.f169991c, openLink.f169991c);
        }

        public final int hashCode() {
            int iHashCode = this.f169990b.hashCode() * 31;
            String str = this.f169991c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenLink(deepLink=");
            sb2.append(this.f169990b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f169991c, ')');
        }

        public /* synthetic */ OpenLink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ScrollToItem;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToItem implements ImvCarsDetailsInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollToItem)) {
                return false;
            }
            ((ScrollToItem) obj).getClass();
            return DifferenceImvAvgPriceItem.class.equals(DifferenceImvAvgPriceItem.class);
        }

        public final int hashCode() {
            return DifferenceImvAvgPriceItem.class.hashCode();
        }

        @k
        public final String toString() {
            return "ScrollToItem(type=" + DifferenceImvAvgPriceItem.class + ')';
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ShowLoadedContent;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadedContent implements ImvCarsDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ImvCarsDetailsResponse f169992b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f169993c;

        public ShowLoadedContent(@k ImvCarsDetailsResponse imvCarsDetailsResponse, boolean z12) {
            this.f169992b = imvCarsDetailsResponse;
            this.f169993c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLoadedContent)) {
                return false;
            }
            ShowLoadedContent showLoadedContent = (ShowLoadedContent) obj;
            return L.f(this.f169992b, showLoadedContent.f169992b) && this.f169993c == showLoadedContent.f169993c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f169993c) + (this.f169992b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowLoadedContent(response=");
            sb2.append(this.f169992b);
            sb2.append(", isPollAnswered=");
            return r.x(sb2, this.f169993c, ')');
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ShowLoadingError;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadingError implements ImvCarsDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f169994b;

        public ShowLoadingError(@k String str) {
            this.f169994b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoadingError) && L.f(this.f169994b, ((ShowLoadingError) obj).f169994b);
        }

        public final int hashCode() {
            return this.f169994b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowLoadingError(message="), this.f169994b, ')');
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$ShowToast;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements ImvCarsDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f169995b;

        public ShowToast(@k String str) {
            this.f169995b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f169995b, ((ShowToast) obj).f169995b);
        }

        public final int hashCode() {
            return this.f169995b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f169995b, ')');
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$SkipState;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SkipState implements ImvCarsDetailsInternalAction {
        static {
            new SkipState();
        }

        private SkipState() {
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$StartLoading;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "()V", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading implements ImvCarsDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartLoading f169996b = new StartLoading();

        private StartLoading() {
        }
    }

    /* compiled from: ImvCarsDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction$UpdateItems;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItems implements ImvCarsDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f169997b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateItems(@k List<? extends a> list) {
            this.f169997b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItems) && L.f(this.f169997b, ((UpdateItems) obj).f169997b);
        }

        public final int hashCode() {
            return this.f169997b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateItems(items="), this.f169997b, ')');
        }
    }
}
