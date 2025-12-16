package com.avito.android.marketplace.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FinanceMarketplaceInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Finish", "LoadUrl", "ShowCancellationDialog", "ShowContent", "ShowError", "ShowPermissionToast", "TryToOpenCamera", "UpdateLoadingProgress", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$Finish;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$LoadUrl;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowCancellationDialog;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowContent;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowError;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowPermissionToast;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$TryToOpenCamera;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$UpdateLoadingProgress;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface FinanceMarketplaceInternalAction extends n {

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$Finish;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements FinanceMarketplaceInternalAction {
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

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$LoadUrl;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadUrl implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadUrl f185941b = new LoadUrl();

        private LoadUrl() {
        }
    }

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowCancellationDialog;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowCancellationDialog implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowCancellationDialog f185942b = new ShowCancellationDialog();

        private ShowCancellationDialog() {
        }
    }

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowContent;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContent implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowContent f185943b = new ShowContent();

        private ShowContent() {
        }
    }

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowError;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f185944b;

        public ShowError(int i12) {
            this.f185944b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && this.f185944b == ((ShowError) obj).f185944b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185944b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ShowError(progress="), this.f185944b, ')');
        }
    }

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$ShowPermissionToast;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowPermissionToast implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPermissionToast f185945b = new ShowPermissionToast();

        private ShowPermissionToast() {
        }
    }

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$TryToOpenCamera;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TryToOpenCamera implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ValueCallback<Uri[]> f185946b;

        public TryToOpenCamera(@l ValueCallback<Uri[]> valueCallback) {
            this.f185946b = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TryToOpenCamera) && L.f(this.f185946b, ((TryToOpenCamera) obj).f185946b);
        }

        public final int hashCode() {
            ValueCallback<Uri[]> valueCallback = this.f185946b;
            if (valueCallback == null) {
                return 0;
            }
            return valueCallback.hashCode();
        }

        @k
        public final String toString() {
            return "TryToOpenCamera(filePathCallback=" + this.f185946b + ')';
        }
    }

    /* compiled from: FinanceMarketplaceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction$UpdateLoadingProgress;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLoadingProgress implements FinanceMarketplaceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f185947b;

        public UpdateLoadingProgress(int i12) {
            this.f185947b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLoadingProgress) && this.f185947b == ((UpdateLoadingProgress) obj).f185947b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185947b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateLoadingProgress(progress="), this.f185947b, ')');
        }
    }
}
