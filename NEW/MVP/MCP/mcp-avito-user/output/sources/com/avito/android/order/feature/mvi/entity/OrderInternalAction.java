package com.avito.android.order.feature.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentChanged", "ContentLoaded", "ExecuteRequestFailed", "ExecuteRequestStateChanged", "LastUpdateChanged", "LoadingFailed", "LoadingStarted", "ShouldPollChanged", "UniversalMapSelectFailure", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ContentChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ContentLoaded;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$LastUpdateChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$LoadingFailed;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$LoadingStarted;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ShouldPollChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$UniversalMapSelectFailure;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OrderInternalAction extends n {

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ContentChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChanged implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f209624b;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f209624b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentChanged) && L.f(this.f209624b, ((ContentChanged) obj).f209624b);
        }

        public final int hashCode() {
            return this.f209624b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ContentChanged(mainComponents="), this.f209624b, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ContentLoaded;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements OrderInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f209625b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f209626c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f209627d;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentLoaded(@k String str, @k String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f209625b = str;
            this.f209626c = str2;
            this.f209627d = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return L.f(this.f209625b, contentLoaded.f209625b) && L.f(this.f209626c, contentLoaded.f209626c) && L.f(this.f209627d, contentLoaded.f209627d);
        }

        public final int hashCode() {
            return this.f209627d.hashCode() + H.d(this.f209625b.hashCode() * 31, 31, this.f209626c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f209625b);
            sb2.append(", mainFormId=");
            sb2.append(this.f209626c);
            sb2.append(", mainComponents=");
            return H.p(sb2, this.f209627d, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ExecuteRequestFailed;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestFailed implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f209628b;

        public ExecuteRequestFailed(@k ApiError apiError) {
            this.f209628b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestFailed) && L.f(this.f209628b, ((ExecuteRequestFailed) obj).f209628b);
        }

        public final int hashCode() {
            return this.f209628b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ExecuteRequestFailed(error="), this.f209628b, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestStateChanged implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f209629b;

        public ExecuteRequestStateChanged(boolean z12) {
            this.f209629b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestStateChanged) && this.f209629b == ((ExecuteRequestStateChanged) obj).f209629b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f209629b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ExecuteRequestStateChanged(isExecuting="), this.f209629b, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$LastUpdateChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LastUpdateChanged implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f209630b;

        /* renamed from: c, reason: collision with root package name */
        public final long f209631c;

        public LastUpdateChanged(int i12, long j12) {
            this.f209630b = i12;
            this.f209631c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastUpdateChanged)) {
                return false;
            }
            LastUpdateChanged lastUpdateChanged = (LastUpdateChanged) obj;
            return this.f209630b == lastUpdateChanged.f209630b && this.f209631c == lastUpdateChanged.f209631c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f209631c) + (Integer.hashCode(this.f209630b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LastUpdateChanged(lastUpdate=");
            sb2.append(this.f209630b);
            sb2.append(", pollingIntervalSec=");
            return r.u(sb2, this.f209631c, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$LoadingFailed;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements OrderInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f209632b;

        public LoadingFailed(@k ApiError apiError) {
            this.f209632b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof LoadingFailed) && L.f(this.f209632b, ((LoadingFailed) obj).f209632b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF201920c() {
            return new J.a(this.f209632b);
        }

        public final int hashCode() {
            return this.f209632b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingFailed(error="), this.f209632b, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements OrderInternalAction {
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$ShouldPollChanged;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShouldPollChanged implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f209633b;

        public ShouldPollChanged(boolean z12) {
            this.f209633b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShouldPollChanged) && this.f209633b == ((ShouldPollChanged) obj).f209633b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f209633b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShouldPollChanged(shouldPoll="), this.f209633b, ')');
        }
    }

    /* compiled from: OrderInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction$UniversalMapSelectFailure;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalMapSelectFailure implements OrderInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f209634b;

        public UniversalMapSelectFailure(@l String str) {
            this.f209634b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UniversalMapSelectFailure) && L.f(this.f209634b, ((UniversalMapSelectFailure) obj).f209634b);
        }

        public final int hashCode() {
            String str = this.f209634b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UniversalMapSelectFailure(message="), this.f209634b, ')');
        }
    }
}
