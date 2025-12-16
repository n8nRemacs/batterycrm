package com.avito.android.cpx_promo.v2.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import js.C42419a;
import js.C42420b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CpxPromoV2InternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CloseSliderInfo", "OpenDeeplink", "ShowContent", "ShowError", "ShowErrorToast", "ShowLoading", "UpdateBudget", "UpdateLimit", "UpdateSegmentedControl", "UpdateSlider", "Validate", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$Close;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$CloseSliderInfo;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$OpenDeeplink;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowContent;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowError;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowErrorToast;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowLoading;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateBudget;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateLimit;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateSegmentedControl;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateSlider;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$Validate;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CpxPromoV2InternalAction extends n {

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$Close;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f127585b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1823888346;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$CloseSliderInfo;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseSliderInfo implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseSliderInfo f127586b = new CloseSliderInfo();

        private CloseSliderInfo() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseSliderInfo);
        }

        public final int hashCode() {
            return 1188104693;
        }

        @k
        public final String toString() {
            return "CloseSliderInfo";
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowContent;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContent implements CpxPromoV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromoV2 f127589b;

        public ShowContent(@k CpxPromoV2 cpxPromoV2) {
            this.f127589b = cpxPromoV2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF305546e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowError implements TrackableError, CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f127590b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f127591c;

        public ShowError(@k ApiError apiError) {
            this.f127590b = apiError;
            this.f127591c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF305546e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF305542c() {
            return this.f127591c;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowErrorToast;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowErrorToast implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f127592b;

        public ShowErrorToast(@k ApiError apiError) {
            this.f127592b = apiError;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements CpxPromoV2InternalAction {
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateBudget;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateBudget implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127593b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C42419a f127594c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f127595d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final CpxPromoV2.Auto.Budget.Value.BudgetId f127596e;

        public UpdateBudget(boolean z12, @l C42419a c42419a, @k List<CpxPromoV2State.a> list, @k CpxPromoV2.Auto.Budget.Value.BudgetId budgetId) {
            this.f127593b = z12;
            this.f127594c = c42419a;
            this.f127595d = list;
            this.f127596e = budgetId;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateLimit;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateLimit implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127597b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C42419a f127598c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f127599d;

        public UpdateLimit(boolean z12, @l C42419a c42419a, @l Long l12) {
            this.f127597b = z12;
            this.f127598c = c42419a;
            this.f127599d = l12;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateSegmentedControl;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateSegmentedControl implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C42419a f127600b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f127601c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f127602d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f127603e;

        public UpdateSegmentedControl(@l C42419a c42419a, @k ArrayList arrayList, boolean z12, boolean z13) {
            this.f127600b = c42419a;
            this.f127601c = arrayList;
            this.f127602d = z12;
            this.f127603e = z13;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$UpdateSlider;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateSlider implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C42419a f127604b;

        /* renamed from: c, reason: collision with root package name */
        public final long f127605c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127606d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f127607e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f127608f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f127609g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f127610h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f127611i;

        /* renamed from: j, reason: collision with root package name */
        public final int f127612j;

        /* renamed from: k, reason: collision with root package name */
        public final int f127613k;

        /* renamed from: l, reason: collision with root package name */
        public final int f127614l;

        /* renamed from: m, reason: collision with root package name */
        public final long f127615m;

        /* renamed from: n, reason: collision with root package name */
        public final long f127616n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final C42420b f127617o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final String f127618p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final Integer f127619q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final String f127620r;

        public UpdateSlider(@l C42419a c42419a, long j12, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l Integer num, @InterfaceC42150f int i12, int i13, int i14, long j13, long j14, @l C42420b c42420b, @l String str6, @l Integer num2, @l String str7) {
            this.f127604b = c42419a;
            this.f127605c = j12;
            this.f127606d = str;
            this.f127607e = str2;
            this.f127608f = str3;
            this.f127609g = str4;
            this.f127610h = str5;
            this.f127611i = num;
            this.f127612j = i12;
            this.f127613k = i13;
            this.f127614l = i14;
            this.f127615m = j13;
            this.f127616n = j14;
            this.f127617o = c42420b;
            this.f127618p = str6;
            this.f127619q = num2;
            this.f127620r = str7;
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$Validate;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Validate implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Validate f127621b = new Validate();

        private Validate() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Validate);
        }

        public final int hashCode() {
            return 1954509864;
        }

        @k
        public final String toString() {
            return "Validate";
        }
    }

    /* compiled from: CpxPromoV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction$OpenDeeplink;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenDeeplink implements CpxPromoV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f127587b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final CpxPromoPriceInputContent f127588c;

        public OpenDeeplink(@k DeepLink deepLink, @l CpxPromoPriceInputContent cpxPromoPriceInputContent) {
            this.f127587b = deepLink;
            this.f127588c = cpxPromoPriceInputContent;
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, CpxPromoPriceInputContent cpxPromoPriceInputContent, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : cpxPromoPriceInputContent);
        }
    }
}
