package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "LdL/d;", "<init>", "()V", "CloseScreenImmediately", "HandleClosingActionInterceptorLink", "HandleDeeplink", "HandleGsmLink", "OnBootstrap", "OnNeedToEmitClosingAction", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$CloseScreenImmediately;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$HandleClosingActionInterceptorLink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$HandleDeeplink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$HandleGsmLink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$OnBootstrap;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$OnNeedToEmitClosingAction;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacFinishedFallbackScreenOneTimeEvent implements d {
    public static final int $stable = 0;

    /* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$CloseScreenImmediately;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreenImmediately extends IacFinishedFallbackScreenOneTimeEvent {
        public static final int $stable = 0;

        @k
        public static final CloseScreenImmediately INSTANCE = new CloseScreenImmediately();

        private CloseScreenImmediately() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof CloseScreenImmediately);
        }

        public int hashCode() {
            return 1119029092;
        }

        @k
        public String toString() {
            return "CloseScreenImmediately";
        }
    }

    /* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$HandleClosingActionInterceptorLink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "link", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "getLink", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleClosingActionInterceptorLink extends IacFinishedFallbackScreenOneTimeEvent {
        public static final int $stable = 8;

        @k
        private final IacPiiDeepLink link;

        public HandleClosingActionInterceptorLink(@k IacPiiDeepLink iacPiiDeepLink) {
            super(null);
            this.link = iacPiiDeepLink;
        }

        public static /* synthetic */ HandleClosingActionInterceptorLink copy$default(HandleClosingActionInterceptorLink handleClosingActionInterceptorLink, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacPiiDeepLink = handleClosingActionInterceptorLink.link;
            }
            return handleClosingActionInterceptorLink.copy(iacPiiDeepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        @k
        public final HandleClosingActionInterceptorLink copy(@k IacPiiDeepLink link) {
            return new HandleClosingActionInterceptorLink(link);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleClosingActionInterceptorLink) && L.f(this.link, ((HandleClosingActionInterceptorLink) other).link);
        }

        @k
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        @k
        public String toString() {
            return "HandleClosingActionInterceptorLink(link=" + this.link + ')';
        }
    }

    /* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$HandleDeeplink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "link", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "getLink", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink extends IacFinishedFallbackScreenOneTimeEvent {
        public static final int $stable = 8;

        @k
        private final IacPiiDeepLink link;

        public HandleDeeplink(@k IacPiiDeepLink iacPiiDeepLink) {
            super(null);
            this.link = iacPiiDeepLink;
        }

        public static /* synthetic */ HandleDeeplink copy$default(HandleDeeplink handleDeeplink, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacPiiDeepLink = handleDeeplink.link;
            }
            return handleDeeplink.copy(iacPiiDeepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        @k
        public final HandleDeeplink copy(@k IacPiiDeepLink link) {
            return new HandleDeeplink(link);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleDeeplink) && L.f(this.link, ((HandleDeeplink) other).link);
        }

        @k
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        @k
        public String toString() {
            return "HandleDeeplink(link=" + this.link + ')';
        }
    }

    /* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$HandleGsmLink;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "link", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "analyticsData", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;)V", "getAnalyticsData", "()Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "getLink", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleGsmLink extends IacFinishedFallbackScreenOneTimeEvent {
        public static final int $stable = 8;

        @l
        private final PhoneRequestDeepLinkAnalyticsData.IacGsmFallback analyticsData;

        @k
        private final IacPiiDeepLink link;

        public HandleGsmLink(@k IacPiiDeepLink iacPiiDeepLink, @l PhoneRequestDeepLinkAnalyticsData.IacGsmFallback iacGsmFallback) {
            super(null);
            this.link = iacPiiDeepLink;
            this.analyticsData = iacGsmFallback;
        }

        public static /* synthetic */ HandleGsmLink copy$default(HandleGsmLink handleGsmLink, IacPiiDeepLink iacPiiDeepLink, PhoneRequestDeepLinkAnalyticsData.IacGsmFallback iacGsmFallback, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacPiiDeepLink = handleGsmLink.link;
            }
            if ((i12 & 2) != 0) {
                iacGsmFallback = handleGsmLink.analyticsData;
            }
            return handleGsmLink.copy(iacPiiDeepLink, iacGsmFallback);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final PhoneRequestDeepLinkAnalyticsData.IacGsmFallback getAnalyticsData() {
            return this.analyticsData;
        }

        @k
        public final HandleGsmLink copy(@k IacPiiDeepLink link, @l PhoneRequestDeepLinkAnalyticsData.IacGsmFallback analyticsData) {
            return new HandleGsmLink(link, analyticsData);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandleGsmLink)) {
                return false;
            }
            HandleGsmLink handleGsmLink = (HandleGsmLink) other;
            return L.f(this.link, handleGsmLink.link) && L.f(this.analyticsData, handleGsmLink.analyticsData);
        }

        @l
        public final PhoneRequestDeepLinkAnalyticsData.IacGsmFallback getAnalyticsData() {
            return this.analyticsData;
        }

        @k
        public final IacPiiDeepLink getLink() {
            return this.link;
        }

        public int hashCode() {
            int iHashCode = this.link.hashCode() * 31;
            PhoneRequestDeepLinkAnalyticsData.IacGsmFallback iacGsmFallback = this.analyticsData;
            return iHashCode + (iacGsmFallback == null ? 0 : iacGsmFallback.hashCode());
        }

        @k
        public String toString() {
            return "HandleGsmLink(link=" + this.link + ", analyticsData=" + this.analyticsData + ')';
        }
    }

    /* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$OnBootstrap;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBootstrap extends IacFinishedFallbackScreenOneTimeEvent {
        public static final int $stable = 0;

        @k
        public static final OnBootstrap INSTANCE = new OnBootstrap();

        private OnBootstrap() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnBootstrap);
        }

        public int hashCode() {
            return -77828091;
        }

        @k
        public String toString() {
            return "OnBootstrap";
        }
    }

    /* compiled from: IacFinishedFallbackScreenOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent$OnNeedToEmitClosingAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnNeedToEmitClosingAction extends IacFinishedFallbackScreenOneTimeEvent {
        public static final int $stable = 0;

        @k
        public static final OnNeedToEmitClosingAction INSTANCE = new OnNeedToEmitClosingAction();

        private OnNeedToEmitClosingAction() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnNeedToEmitClosingAction);
        }

        public int hashCode() {
            return -1668294178;
        }

        @k
        public String toString() {
            return "OnNeedToEmitClosingAction";
        }
    }

    public /* synthetic */ IacFinishedFallbackScreenOneTimeEvent(C42822w c42822w) {
        this();
    }

    private IacFinishedFallbackScreenOneTimeEvent() {
    }
}
