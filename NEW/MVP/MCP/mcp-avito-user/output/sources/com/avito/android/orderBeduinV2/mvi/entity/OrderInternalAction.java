package com.avito.android.orderBeduinV2.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
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

/* compiled from: OrderInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "HandleBeduinEvent", "HandleBeduinState", "LastUpdateChanged", "LoadingFailed", "LoadingStarted", "ShouldPollChanged", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$ContentLoaded;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$HandleBeduinEvent;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$HandleBeduinState;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$LastUpdateChanged;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$LoadingFailed;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$LoadingStarted;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$ShouldPollChanged;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OrderInternalAction extends n {

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$ContentLoaded;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements OrderInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f209874b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalColor f209875c;

        public ContentLoaded(@k String str, @l UniversalColor universalColor) {
            this.f209874b = str;
            this.f209875c = universalColor;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f209874b, contentLoaded.f209874b) && L.f(this.f209875c, contentLoaded.f209875c);
        }

        public final int hashCode() {
            int iHashCode = this.f209874b.hashCode() * 31;
            UniversalColor universalColor = this.f209875c;
            return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(content=");
            sb2.append(this.f209874b);
            sb2.append(", statusBarColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f209875c, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$HandleBeduinEvent;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinEvent implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f209876b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f209876b = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinEvent) && L.f(this.f209876b, ((HandleBeduinEvent) obj).f209876b);
        }

        public final int hashCode() {
            return this.f209876b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f209876b + ')';
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$HandleBeduinState;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinState implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f209877b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f209877b = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinState) && L.f(this.f209877b, ((HandleBeduinState) obj).f209877b);
        }

        public final int hashCode() {
            return this.f209877b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinState(beduinState=" + this.f209877b + ')';
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$LastUpdateChanged;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LastUpdateChanged implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f209878b;

        /* renamed from: c, reason: collision with root package name */
        public final long f209879c;

        public LastUpdateChanged(int i12, long j12) {
            this.f209878b = i12;
            this.f209879c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastUpdateChanged)) {
                return false;
            }
            LastUpdateChanged lastUpdateChanged = (LastUpdateChanged) obj;
            return this.f209878b == lastUpdateChanged.f209878b && this.f209879c == lastUpdateChanged.f209879c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f209879c) + (Integer.hashCode(this.f209878b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LastUpdateChanged(lastUpdate=");
            sb2.append(this.f209878b);
            sb2.append(", pollingIntervalSec=");
            return r.u(sb2, this.f209879c, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$LoadingFailed;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements OrderInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f209880b;

        public LoadingFailed(@k ApiError apiError) {
            this.f209880b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
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
            return (obj instanceof LoadingFailed) && L.f(this.f209880b, ((LoadingFailed) obj).f209880b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF173805c() {
            return new J.a(this.f209880b);
        }

        public final int hashCode() {
            return this.f209880b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingFailed(error="), this.f209880b, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements OrderInternalAction {
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction$ShouldPollChanged;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShouldPollChanged implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f209881b;

        public ShouldPollChanged(boolean z12) {
            this.f209881b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShouldPollChanged) && this.f209881b == ((ShouldPollChanged) obj).f209881b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f209881b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShouldPollChanged(shouldPoll="), this.f209881b, ')');
        }
    }
}
