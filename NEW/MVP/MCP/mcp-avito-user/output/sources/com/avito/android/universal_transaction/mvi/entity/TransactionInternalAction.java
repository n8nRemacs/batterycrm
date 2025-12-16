package com.avito.android.universal_transaction.mvi.entity;

import AK.c;
import BG0.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UniversalColor;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TransactionInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "HandleBeduinEvent", "HandleBeduinState", "LoadingFailed", "LoadingStarted", "UpdateTransactionParams", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$ContentLoaded;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$HandleBeduinEvent;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$HandleBeduinState;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$LoadingFailed;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$LoadingStarted;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$UpdateTransactionParams;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TransactionInternalAction extends n {

    /* compiled from: TransactionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$ContentLoaded;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements TransactionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f306416b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalColor f306417c;

        public ContentLoaded(@k String str, @l UniversalColor universalColor) {
            this.f306416b = str;
            this.f306417c = universalColor;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f306416b, contentLoaded.f306416b) && L.f(this.f306417c, contentLoaded.f306417c);
        }

        public final int hashCode() {
            int iHashCode = this.f306416b.hashCode() * 31;
            UniversalColor universalColor = this.f306417c;
            return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(content=");
            sb2.append(this.f306416b);
            sb2.append(", statusBarColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f306417c, ')');
        }
    }

    /* compiled from: TransactionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$HandleBeduinEvent;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinEvent implements TransactionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f306418b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f306418b = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinEvent) && L.f(this.f306418b, ((HandleBeduinEvent) obj).f306418b);
        }

        public final int hashCode() {
            return this.f306418b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f306418b + ')';
        }
    }

    /* compiled from: TransactionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$HandleBeduinState;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinState implements TransactionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f306419b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f306419b = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinState) && L.f(this.f306419b, ((HandleBeduinState) obj).f306419b);
        }

        public final int hashCode() {
            return this.f306419b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinState(beduinState=" + this.f306419b + ')';
        }
    }

    /* compiled from: TransactionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$LoadingFailed;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements TransactionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f306420b;

        public LoadingFailed(@k ApiError apiError) {
            this.f306420b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof LoadingFailed) && L.f(this.f306420b, ((LoadingFailed) obj).f306420b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF296715c() {
            return new J.a(this.f306420b);
        }

        public final int hashCode() {
            return this.f306420b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingFailed(error="), this.f306420b, ')');
        }
    }

    /* compiled from: TransactionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "()V", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements TransactionInternalAction {
    }

    /* compiled from: TransactionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction$UpdateTransactionParams;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTransactionParams implements TransactionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f306421b;

        public UpdateTransactionParams(@k a aVar) {
            this.f306421b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTransactionParams) && L.f(this.f306421b, ((UpdateTransactionParams) obj).f306421b);
        }

        public final int hashCode() {
            return this.f306421b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateTransactionParams(transactionParams=" + this.f306421b + ')';
        }
    }
}
