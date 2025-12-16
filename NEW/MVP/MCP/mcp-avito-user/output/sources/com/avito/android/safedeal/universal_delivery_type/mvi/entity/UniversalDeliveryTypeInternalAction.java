package com.avito.android.safedeal.universal_delivery_type.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CheckoutSuccess", "DeliveryMethodSelectTab", "Loaded", "LoadedError", "LoadingStarted", "TabSelect", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$CheckoutSuccess;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$DeliveryMethodSelectTab;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$Loaded;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$LoadedError;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$LoadingStarted;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$TabSelect;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UniversalDeliveryTypeInternalAction extends n {

    /* compiled from: UniversalDeliveryTypeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$CheckoutSuccess;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CheckoutSuccess implements UniversalDeliveryTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CheckoutSuccess f256667b = new CheckoutSuccess();

        private CheckoutSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CheckoutSuccess);
        }

        public final int hashCode() {
            return 553059589;
        }

        @k
        public final String toString() {
            return "CheckoutSuccess";
        }
    }

    /* compiled from: UniversalDeliveryTypeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$DeliveryMethodSelectTab;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeliveryMethodSelectTab implements UniversalDeliveryTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinDeliveryMethodSelectTabAction f256668b;

        public DeliveryMethodSelectTab(@k BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction) {
            this.f256668b = beduinDeliveryMethodSelectTabAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeliveryMethodSelectTab) && L.f(this.f256668b, ((DeliveryMethodSelectTab) obj).f256668b);
        }

        public final int hashCode() {
            return this.f256668b.hashCode();
        }

        @k
        public final String toString() {
            return "DeliveryMethodSelectTab(tabAction=" + this.f256668b + ')';
        }
    }

    /* compiled from: UniversalDeliveryTypeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$Loaded;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements UniversalDeliveryTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalDeliveryTypeContent f256669b;

        /* renamed from: c, reason: collision with root package name */
        public final int f256670c;

        public Loaded(@k UniversalDeliveryTypeContent universalDeliveryTypeContent, int i12) {
            this.f256669b = universalDeliveryTypeContent;
            this.f256670c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f256669b, loaded.f256669b) && this.f256670c == loaded.f256670c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f256670c) + (this.f256669b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(content=");
            sb2.append(this.f256669b);
            sb2.append(", selectedTabIndex=");
            return r.t(sb2, this.f256670c, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$LoadedError;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadedError implements UniversalDeliveryTypeInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f256671b;

        public LoadedError(@k ApiError apiError) {
            this.f256671b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof LoadedError) && L.f(this.f256671b, ((LoadedError) obj).f256671b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF131298b() {
            return new J.a(this.f256671b);
        }

        public final int hashCode() {
            return this.f256671b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadedError(error="), this.f256671b, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$LoadingStarted;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted implements UniversalDeliveryTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingStarted f256672b = new LoadingStarted();

        private LoadingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingStarted);
        }

        public final int hashCode() {
            return -1684782723;
        }

        @k
        public final String toString() {
            return "LoadingStarted";
        }
    }

    /* compiled from: UniversalDeliveryTypeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction$TabSelect;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TabSelect implements UniversalDeliveryTypeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f256673b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f256674c;

        public TabSelect(int i12, @k String str) {
            this.f256673b = i12;
            this.f256674c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabSelect)) {
                return false;
            }
            TabSelect tabSelect = (TabSelect) obj;
            return this.f256673b == tabSelect.f256673b && L.f(this.f256674c, tabSelect.f256674c);
        }

        public final int hashCode() {
            return this.f256674c.hashCode() + (Integer.hashCode(this.f256673b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabSelect(tabIndex=");
            sb2.append(this.f256673b);
            sb2.append(", tabType=");
            return C22026a.c(sb2, this.f256674c, ')');
        }
    }
}
