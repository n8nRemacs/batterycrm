package com.avito.android.wallet.pin.impl.settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nP0.C44317d;

/* compiled from: WalletSecuritySettingsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "SetBiometryEnabled", "ShowContent", "ShowContentLoading", "ShowContentLoadingError", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$Close;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$SetBiometryEnabled;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$ShowContent;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$ShowContentLoadingError;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletSecuritySettingsInternalAction extends n {

    /* compiled from: WalletSecuritySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$Close;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements WalletSecuritySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f328855b = new Close();

        private Close() {
        }
    }

    /* compiled from: WalletSecuritySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$SetBiometryEnabled;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetBiometryEnabled implements WalletSecuritySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f328856b;

        public SetBiometryEnabled(boolean z12) {
            this.f328856b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetBiometryEnabled) && this.f328856b == ((SetBiometryEnabled) obj).f328856b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f328856b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetBiometryEnabled(biometryEnabled="), this.f328856b, ')');
        }
    }

    /* compiled from: WalletSecuritySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$ShowContent;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements WalletSecuritySettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C44317d f328857b;

        public ShowContent(@k C44317d c44317d) {
            this.f328857b = c44317d;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof ShowContent) && L.f(this.f328857b, ((ShowContent) obj).f328857b);
        }

        public final int hashCode() {
            return this.f328857b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(apiResponse=" + this.f328857b + ')';
        }
    }

    /* compiled from: WalletSecuritySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContentLoading extends TrackableLoadingStarted implements WalletSecuritySettingsInternalAction {
        @k
        public final String toString() {
            return "WalletSecuritySettingsInternalAction.ShowContentLoading";
        }
    }

    /* compiled from: WalletSecuritySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContentLoadingError implements WalletSecuritySettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f328858b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f328859c;

        public ShowContentLoadingError(@k Throwable th2) {
            this.f328858b = th2;
            this.f328859c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof ShowContentLoadingError) && L.f(this.f328858b, ((ShowContentLoadingError) obj).f328858b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF328420c() {
            return this.f328859c;
        }

        public final int hashCode() {
            return this.f328858b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowContentLoadingError(error="), this.f328858b, ')');
        }
    }
}
