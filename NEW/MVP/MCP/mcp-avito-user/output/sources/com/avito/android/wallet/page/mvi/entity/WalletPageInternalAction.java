package com.avito.android.wallet.page.mvi.entity;

import AK.c;
import PO0.b;
import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import com.avito.android.wallet.page.generated.api.get_wallet_service_info.ServiceInfoToastData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Refresh", "ShowContent", "ShowContentLoading", "ShowContentLoadingError", "ShowToast", "StartActivity", "StartActivityForResult", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$Close;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$Refresh;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowContent;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowToast;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$StartActivity;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$StartActivityForResult;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletPageInternalAction extends n {

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$Close;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements WalletPageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f328180b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 377562669;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$Refresh;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Refresh extends TrackableLoadingStarted implements WalletPageInternalAction {
        @k
        public final String toString() {
            return Refresh.class.getSimpleName();
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowContent;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements WalletPageInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f328181b;

        public ShowContent(@k b bVar) {
            this.f328181b = bVar;
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
            return (obj instanceof ShowContent) && L.f(this.f328181b, ((ShowContent) obj).f328181b);
        }

        public final int hashCode() {
            return this.f328181b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(apiResponse=" + this.f328181b + ')';
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContentLoading extends TrackableLoadingStarted implements WalletPageInternalAction {
        @k
        public final String toString() {
            return ShowContentLoading.class.getSimpleName();
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContentLoadingError implements WalletPageInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f328182b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f328183c;

        public ShowContentLoadingError(@k ApiException apiException) {
            this.f328182b = apiException;
            this.f328183c = new J.a(apiException);
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
            return (obj instanceof ShowContentLoadingError) && this.f328182b.equals(((ShowContentLoadingError) obj).f328182b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF279947c() {
            return this.f328183c;
        }

        public final int hashCode() {
            return this.f328182b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ShowContentLoadingError(error="), this.f328182b, ')');
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$ShowToast;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements WalletPageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceInfoToastData f328184b;

        public ShowToast(@l ServiceInfoToastData serviceInfoToastData) {
            this.f328184b = serviceInfoToastData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f328184b, ((ShowToast) obj).f328184b);
        }

        public final int hashCode() {
            ServiceInfoToastData serviceInfoToastData = this.f328184b;
            if (serviceInfoToastData == null) {
                return 0;
            }
            return serviceInfoToastData.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToast(toastData=" + this.f328184b + ')';
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$StartActivity;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartActivity implements WalletPageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Intent f328185b;

        public StartActivity(@k Intent intent) {
            this.f328185b = intent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartActivity) && L.f(this.f328185b, ((StartActivity) obj).f328185b);
        }

        public final int hashCode() {
            return this.f328185b.hashCode();
        }

        @k
        public final String toString() {
            return "StartActivity(intent=" + this.f328185b + ')';
        }
    }

    /* compiled from: WalletPageInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction$StartActivityForResult;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartActivityForResult implements WalletPageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Intent f328186b;

        public StartActivityForResult(@k Intent intent) {
            this.f328186b = intent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartActivityForResult) && L.f(this.f328186b, ((StartActivityForResult) obj).f328186b);
        }

        public final int hashCode() {
            return this.f328186b.hashCode();
        }

        @k
        public final String toString() {
            return "StartActivityForResult(intent=" + this.f328186b + ')';
        }
    }
}
