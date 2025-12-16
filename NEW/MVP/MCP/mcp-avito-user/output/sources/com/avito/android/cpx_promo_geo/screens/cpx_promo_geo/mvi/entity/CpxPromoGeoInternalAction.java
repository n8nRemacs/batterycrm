package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import os.C44931a;

/* compiled from: CpxPromoGeoInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeAutoManualType", "ChangeDailyLimit", "ChangeDayCount", "ChangePrice", "ChangeSwitcher", "CloseResetDialog", "Content", "Error", "HandleDeeplink", "Loading", "PostLoading", "ResetPrices", "Revalidate", "ShowResetDialog", "ShowToast", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Back;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeAutoManualType;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeDailyLimit;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeDayCount;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangePrice;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeSwitcher;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$CloseResetDialog;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Content;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Error;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$HandleDeeplink;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Loading;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$PostLoading;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ResetPrices;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Revalidate;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ShowResetDialog;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ShowToast;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CpxPromoGeoInternalAction extends n {

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Back;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f127870b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -514662018;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeAutoManualType;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeAutoManualType implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f127871b;

        public ChangeAutoManualType(int i12) {
            this.f127871b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeAutoManualType) && this.f127871b == ((ChangeAutoManualType) obj).f127871b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f127871b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeAutoManualType(position="), this.f127871b, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeDailyLimit;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDailyLimit implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f127872b;

        /* renamed from: c, reason: collision with root package name */
        public final long f127873c;

        public ChangeDailyLimit(@k String str, long j12) {
            this.f127872b = str;
            this.f127873c = j12;
        }

        /* renamed from: c, reason: from getter */
        public final long getF127873c() {
            return this.f127873c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeDailyLimit)) {
                return false;
            }
            ChangeDailyLimit changeDailyLimit = (ChangeDailyLimit) obj;
            return L.f(this.f127872b, changeDailyLimit.f127872b) && this.f127873c == changeDailyLimit.f127873c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f127873c) + (this.f127872b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeDailyLimit(query=");
            sb2.append(this.f127872b);
            sb2.append(", locationId=");
            return r.u(sb2, this.f127873c, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeDayCount;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDayCount implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f127874b;

        public ChangeDayCount(int i12) {
            this.f127874b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDayCount) && this.f127874b == ((ChangeDayCount) obj).f127874b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f127874b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeDayCount(position="), this.f127874b, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangePrice;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangePrice implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f127875b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f127876c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f127877d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f127878e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f127879f;

        public /* synthetic */ ChangePrice(String str, Long l12, boolean z12, String str2, boolean z13, int i12, C42822w c42822w) {
            this(str, z12, (i12 & 16) != 0 ? false : z13, (i12 & 8) != 0 ? null : str2, l12);
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getF127875b() {
            return this.f127875b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangePrice)) {
                return false;
            }
            ChangePrice changePrice = (ChangePrice) obj;
            return L.f(this.f127875b, changePrice.f127875b) && L.f(this.f127876c, changePrice.f127876c) && this.f127877d == changePrice.f127877d && L.f(this.f127878e, changePrice.f127878e) && this.f127879f == changePrice.f127879f;
        }

        public final int hashCode() {
            int iHashCode = this.f127875b.hashCode() * 31;
            Long l12 = this.f127876c;
            int i12 = r.i((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f127877d);
            String str = this.f127878e;
            return Boolean.hashCode(this.f127879f) + ((i12 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangePrice(query=");
            sb2.append(this.f127875b);
            sb2.append(", locationId=");
            sb2.append(this.f127876c);
            sb2.append(", isManual=");
            sb2.append(this.f127877d);
            sb2.append(", day=");
            sb2.append(this.f127878e);
            sb2.append(", needValidateMinMax=");
            return r.x(sb2, this.f127879f, ')');
        }

        public ChangePrice(@k String str, boolean z12, boolean z13, @l String str2, @l Long l12) {
            this.f127875b = str;
            this.f127876c = l12;
            this.f127877d = z12;
            this.f127878e = str2;
            this.f127879f = z13;
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ChangeSwitcher;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSwitcher implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127880b;

        public ChangeSwitcher(boolean z12) {
            this.f127880b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF127880b() {
            return this.f127880b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSwitcher) && this.f127880b == ((ChangeSwitcher) obj).f127880b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127880b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeSwitcher(isToggleEnabled="), this.f127880b, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$CloseResetDialog;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseResetDialog implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseResetDialog f127881b = new CloseResetDialog();

        private CloseResetDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseResetDialog);
        }

        public final int hashCode() {
            return -264560522;
        }

        @k
        public final String toString() {
            return "CloseResetDialog";
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Content;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CpxPromoGeoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C44931a f127882b;

        public Content(@k C44931a c44931a) {
            this.f127882b = c44931a;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final C44931a getF127882b() {
            return this.f127882b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof Content) && L.f(this.f127882b, ((Content) obj).f127882b);
        }

        public final int hashCode() {
            return this.f127882b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f127882b + ')';
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Error;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CpxPromoGeoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f127883b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f127884c;

        public Error(@k ApiException apiException) {
            this.f127883b = apiException;
            this.f127884c = new J.a(apiException);
        }

        @k
        public final Throwable c() {
            return this.f127883b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof Error) && this.f127883b.equals(((Error) obj).f127883b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF115372b() {
            return this.f127884c;
        }

        public final int hashCode() {
            return this.f127883b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f127883b, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$HandleDeeplink;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f127885b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f127885b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f127885b, ((HandleDeeplink) obj).f127885b);
        }

        public final int hashCode() {
            return this.f127885b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f127885b, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CpxPromoGeoInternalAction {
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$PostLoading;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostLoading implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127886b;

        public PostLoading(boolean z12) {
            this.f127886b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF127886b() {
            return this.f127886b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostLoading) && this.f127886b == ((PostLoading) obj).f127886b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127886b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PostLoading(isLoading="), this.f127886b, ')');
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ResetPrices;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetPrices implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetPrices f127887b = new ResetPrices();

        private ResetPrices() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetPrices);
        }

        public final int hashCode() {
            return -479123966;
        }

        @k
        public final String toString() {
            return "ResetPrices";
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$Revalidate;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Revalidate implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Revalidate f127888b = new Revalidate();

        private Revalidate() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Revalidate);
        }

        public final int hashCode() {
            return 2010780576;
        }

        @k
        public final String toString() {
            return "Revalidate";
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ShowResetDialog;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowResetDialog implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowResetDialog f127889b = new ShowResetDialog();

        private ShowResetDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowResetDialog);
        }

        public final int hashCode() {
            return 762428227;
        }

        @k
        public final String toString() {
            return "ShowResetDialog";
        }
    }

    /* compiled from: CpxPromoGeoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction$ShowToast;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements CpxPromoGeoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f127890b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f127891c;

        public ShowToast(@k String str, boolean z12) {
            this.f127890b = str;
            this.f127891c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return this.f127890b.equals(showToast.f127890b) && this.f127891c == showToast.f127891c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f127891c) + (this.f127890b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(message=");
            sb2.append(this.f127890b);
            sb2.append(", isError=");
            return r.x(sb2, this.f127891c, ')');
        }
    }
}
