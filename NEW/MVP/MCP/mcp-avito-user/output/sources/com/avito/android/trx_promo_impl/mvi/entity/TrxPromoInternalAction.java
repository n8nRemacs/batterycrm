package com.avito.android.trx_promo_impl.mvi.entity;

import AK.c;
import RF0.f;
import Y61.k;
import Y61.l;
import YF0.o;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "ContentV7", "Error", "FinishFlow", "HandleDeeplink", "InputChange", "Loading", "OpenDatePicker", "ResetChanges", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$Close;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$ContentV7;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$Error;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$FinishFlow;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$InputChange;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$Loading;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$OpenDatePicker;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$ResetChanges;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TrxPromoInternalAction extends n {

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$Close;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TrxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f304332b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 939871233;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$ContentV7;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentV7 implements TrxPromoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o.b f304333b;

        public ContentV7(@k o.b bVar) {
            this.f304333b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentV7) && L.f(this.f304333b, ((ContentV7) obj).f304333b);
        }

        public final int hashCode() {
            return this.f304333b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentV7(data=" + this.f304333b + ')';
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$Error;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrxPromoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f304334b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f304335c;

        public Error(@k ApiError apiError) {
            this.f304334b = apiError;
            this.f304335c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f304334b, ((Error) obj).f304334b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF289869c() {
            return this.f304335c;
        }

        public final int hashCode() {
            return this.f304334b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f304334b, ')');
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$FinishFlow;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements TrxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f304336b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return 2047700984;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$InputChange;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements TrxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LocalDate f304341b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final LocalDate f304342c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f304343d;

        public InputChange(@l Integer num, @l LocalDate localDate, @l LocalDate localDate2) {
            this.f304341b = localDate;
            this.f304342c = localDate2;
            this.f304343d = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputChange)) {
                return false;
            }
            InputChange inputChange = (InputChange) obj;
            return L.f(this.f304341b, inputChange.f304341b) && L.f(this.f304342c, inputChange.f304342c) && L.f(this.f304343d, inputChange.f304343d);
        }

        public final int hashCode() {
            LocalDate localDate = this.f304341b;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f304342c;
            int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            Integer num = this.f304343d;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputChange(dateFrom=");
            sb2.append(this.f304341b);
            sb2.append(", dateTo=");
            sb2.append(this.f304342c);
            sb2.append(", commission=");
            return s.j(sb2, this.f304343d, ')');
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TrxPromoInternalAction {
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$OpenDatePicker;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDatePicker implements TrxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f304344b;

        public OpenDatePicker(@k f fVar) {
            this.f304344b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDatePicker) && L.f(this.f304344b, ((OpenDatePicker) obj).f304344b);
        }

        public final int hashCode() {
            return this.f304344b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDatePicker(datePickerInfo=" + this.f304344b + ')';
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$ResetChanges;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetChanges implements TrxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetChanges f304345b = new ResetChanges();

        private ResetChanges() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetChanges);
        }

        public final int hashCode() {
            return -1517061045;
        }

        @k
        public final String toString() {
            return "ResetChanges";
        }
    }

    /* compiled from: TrxPromoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TrxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f304337b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f304338c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final LocalDate f304339d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final LocalDate f304340e;

        public HandleDeeplink(@k DeepLink deepLink, @l Integer num, @l LocalDate localDate, @l LocalDate localDate2) {
            this.f304337b = deepLink;
            this.f304338c = num;
            this.f304339d = localDate;
            this.f304340e = localDate2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f304337b, handleDeeplink.f304337b) && L.f(this.f304338c, handleDeeplink.f304338c) && L.f(this.f304339d, handleDeeplink.f304339d) && L.f(this.f304340e, handleDeeplink.f304340e);
        }

        public final int hashCode() {
            int iHashCode = this.f304337b.hashCode() * 31;
            Integer num = this.f304338c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            LocalDate localDate = this.f304339d;
            int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.f304340e;
            return iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f304337b);
            sb2.append(", commission=");
            sb2.append(this.f304338c);
            sb2.append(", dateFrom=");
            sb2.append(this.f304339d);
            sb2.append(", dateTo=");
            return c.t(sb2, this.f304340e, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Integer num, LocalDate localDate, LocalDate localDate2, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : localDate, (i12 & 8) != 0 ? null : localDate2);
        }
    }
}
