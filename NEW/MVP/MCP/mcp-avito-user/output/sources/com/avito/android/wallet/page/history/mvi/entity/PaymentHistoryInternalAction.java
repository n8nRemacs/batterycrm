package com.avito.android.wallet.page.history.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import YO0.a;
import android.content.Intent;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "InitialLoad", "InitialLoadError", "Items", "NextLoad", "NextLoadError", "OpenRefundInfoBanner", "StartActivity", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$InitialLoad;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$InitialLoadError;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$Items;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$NextLoad;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$NextLoadError;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$OpenRefundInfoBanner;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$StartActivity;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaymentHistoryInternalAction extends n {

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$InitialLoad;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialLoad implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitialLoad f328068b = new InitialLoad();

        private InitialLoad() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InitialLoad);
        }

        public final int hashCode() {
            return 393470315;
        }

        @k
        public final String toString() {
            return "InitialLoad";
        }
    }

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$InitialLoadError;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialLoadError implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f328069b;

        public InitialLoadError(@k ApiException apiException) {
            this.f328069b = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialLoadError) && this.f328069b.equals(((InitialLoadError) obj).f328069b);
        }

        public final int hashCode() {
            return this.f328069b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("InitialLoadError(error="), this.f328069b, ')');
        }
    }

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$Items;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Items implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f328070b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f328071c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f328072d;

        /* JADX WARN: Multi-variable type inference failed */
        public Items(@k List<? extends a> list, @l String str, @l String str2) {
            this.f328070b = list;
            this.f328071c = str;
            this.f328072d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Items)) {
                return false;
            }
            Items items = (Items) obj;
            return L.f(this.f328070b, items.f328070b) && L.f(this.f328071c, items.f328071c) && L.f(this.f328072d, items.f328072d);
        }

        public final int hashCode() {
            int iHashCode = this.f328070b.hashCode() * 31;
            String str = this.f328071c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f328072d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Items(items=");
            sb2.append(this.f328070b);
            sb2.append(", key=");
            sb2.append(this.f328071c);
            sb2.append(", nextKey=");
            return C22026a.c(sb2, this.f328072d, ')');
        }
    }

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$NextLoad;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextLoad implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NextLoad f328073b = new NextLoad();

        private NextLoad() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NextLoad);
        }

        public final int hashCode() {
            return 1027095288;
        }

        @k
        public final String toString() {
            return "NextLoad";
        }
    }

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$NextLoadError;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextLoadError implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NextLoadError f328074b = new NextLoadError();

        private NextLoadError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NextLoadError);
        }

        public final int hashCode() {
            return -368066064;
        }

        @k
        public final String toString() {
            return "NextLoadError";
        }
    }

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$OpenRefundInfoBanner;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenRefundInfoBanner implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenRefundInfoBanner f328075b = new OpenRefundInfoBanner();

        private OpenRefundInfoBanner() {
        }
    }

    /* compiled from: PaymentHistoryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction$StartActivity;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartActivity implements PaymentHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Intent f328076b;

        public StartActivity(@k Intent intent) {
            this.f328076b = intent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartActivity) && L.f(this.f328076b, ((StartActivity) obj).f328076b);
        }

        public final int hashCode() {
            return this.f328076b.hashCode();
        }

        @k
        public final String toString() {
            return "StartActivity(intent=" + this.f328076b + ')';
        }
    }
}
