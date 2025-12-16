package com.avito.android.wallet.webview.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletWebViewInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Finish", "FirstLaunch", "Retry", "ShowCancellationDialog", "ShowContent", "ShowError", "UpdateLoadingProgress", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$Finish;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$FirstLaunch;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$Retry;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$ShowCancellationDialog;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$ShowContent;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$ShowError;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$UpdateLoadingProgress;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletWebViewInternalAction extends n {

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$Finish;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements WalletWebViewInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finish)) {
                return false;
            }
            ((Finish) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Finish(deeplink=null)";
        }
    }

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$FirstLaunch;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FirstLaunch implements WalletWebViewInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FirstLaunch f329427b = new FirstLaunch();

        private FirstLaunch() {
        }
    }

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$Retry;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Retry implements WalletWebViewInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Retry f329428b = new Retry();

        private Retry() {
        }
    }

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$ShowCancellationDialog;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowCancellationDialog implements WalletWebViewInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowCancellationDialog f329429b = new ShowCancellationDialog();

        private ShowCancellationDialog() {
        }
    }

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$ShowContent;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContent implements WalletWebViewInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowContent f329430b = new ShowContent();

        private ShowContent() {
        }
    }

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$ShowError;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements WalletWebViewInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f329431b;

        public ShowError(int i12) {
            this.f329431b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && this.f329431b == ((ShowError) obj).f329431b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f329431b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ShowError(progress="), this.f329431b, ')');
        }
    }

    /* compiled from: WalletWebViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction$UpdateLoadingProgress;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLoadingProgress implements WalletWebViewInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f329432b;

        public UpdateLoadingProgress(int i12) {
            this.f329432b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLoadingProgress) && this.f329432b == ((UpdateLoadingProgress) obj).f329432b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f329432b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateLoadingProgress(progress="), this.f329432b, ')');
        }
    }
}
