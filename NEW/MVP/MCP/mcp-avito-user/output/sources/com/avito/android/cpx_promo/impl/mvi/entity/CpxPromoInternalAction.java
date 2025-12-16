package com.avito.android.cpx_promo.impl.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cpx_promo.impl.interactor.model.AttributedTextWithIcon;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoInputSheet;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CpxPromoInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CloseSliderInfo", "OpenDeeplink", "ShowContent", "ShowError", "ShowErrorToast", "ShowLoading", "UpdateBudget", "UpdateLimit", "UpdateSegmentedControl", "UpdateSlider", "Validate", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$Close;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$CloseSliderInfo;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$OpenDeeplink;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowContent;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowError;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowErrorToast;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowLoading;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateBudget;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateLimit;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateSegmentedControl;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateSlider;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$Validate;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CpxPromoInternalAction extends n {

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$Close;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f127075b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1483974382;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$CloseSliderInfo;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseSliderInfo implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseSliderInfo f127076b = new CloseSliderInfo();

        private CloseSliderInfo() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseSliderInfo);
        }

        public final int hashCode() {
            return 368454333;
        }

        @k
        public final String toString() {
            return "CloseSliderInfo";
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowContent;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContent implements CpxPromoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromo f127079b;

        public ShowContent(@k CpxPromo cpxPromo) {
            this.f127079b = cpxPromo;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowError implements TrackableError, CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f127080b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f127081c;

        public ShowError(@k ApiError apiError) {
            this.f127080b = apiError;
            this.f127081c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325098c() {
            return this.f127081c;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowErrorToast;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowErrorToast implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f127082b;

        public ShowErrorToast(@k ApiError apiError) {
            this.f127082b = apiError;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements CpxPromoInternalAction {
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateBudget;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateBudget implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127083b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127084c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f127085d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final CpxPromoState.BudgetChip f127086e;

        public UpdateBudget(boolean z12, @l AttributedTextWithIcon attributedTextWithIcon, @k List<CpxPromoState.BudgetChip> list, @l CpxPromoState.BudgetChip budgetChip) {
            this.f127083b = z12;
            this.f127084c = attributedTextWithIcon;
            this.f127085d = list;
            this.f127086e = budgetChip;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateLimit;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateLimit implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127087b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127088c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f127089d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f127090e;

        public UpdateLimit(boolean z12, @l AttributedTextWithIcon attributedTextWithIcon, @l Long l12, @l String str) {
            this.f127087b = z12;
            this.f127088c = attributedTextWithIcon;
            this.f127089d = l12;
            this.f127090e = str;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateSegmentedControl;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateSegmentedControl implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127091b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f127092c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f127093d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f127094e;

        public UpdateSegmentedControl(@l AttributedTextWithIcon attributedTextWithIcon, @k ArrayList arrayList, boolean z12, boolean z13) {
            this.f127091b = attributedTextWithIcon;
            this.f127092c = arrayList;
            this.f127093d = z12;
            this.f127094e = z13;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$UpdateSlider;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateSlider implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127095b;

        /* renamed from: c, reason: collision with root package name */
        public final long f127096c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127097d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f127098e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f127099f;

        /* renamed from: g, reason: collision with root package name */
        public final int f127100g;

        /* renamed from: h, reason: collision with root package name */
        public final int f127101h;

        /* renamed from: i, reason: collision with root package name */
        public final int f127102i;

        /* renamed from: j, reason: collision with root package name */
        public final long f127103j;

        /* renamed from: k, reason: collision with root package name */
        public final long f127104k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final CpxPromoInputSheet f127105l;

        public UpdateSlider(@l AttributedTextWithIcon attributedTextWithIcon, long j12, @l String str, @l String str2, @l String str3, @InterfaceC42150f int i12, int i13, int i14, long j13, long j14, @l CpxPromoInputSheet cpxPromoInputSheet) {
            this.f127095b = attributedTextWithIcon;
            this.f127096c = j12;
            this.f127097d = str;
            this.f127098e = str2;
            this.f127099f = str3;
            this.f127100g = i12;
            this.f127101h = i13;
            this.f127102i = i14;
            this.f127103j = j13;
            this.f127104k = j14;
            this.f127105l = cpxPromoInputSheet;
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$Validate;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Validate implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Validate f127106b = new Validate();

        private Validate() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Validate);
        }

        public final int hashCode() {
            return -1531567008;
        }

        @k
        public final String toString() {
            return "Validate";
        }
    }

    /* compiled from: CpxPromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$OpenDeeplink;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenDeeplink implements CpxPromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f127077b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final CpxPromoPriceInputContent f127078c;

        public OpenDeeplink(@k DeepLink deepLink, @l CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            this.f127077b = deepLink;
            this.f127078c = cpxPromoPriceInputContent;
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, CpxPromoPriceInputContent cpxPromoPriceInputContent, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : cpxPromoPriceInputContent);
        }
    }
}
