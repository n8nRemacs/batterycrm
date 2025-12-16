package com.avito.android.safedeal.delivery.order_cancellation.mvi.entity;

import UV0.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ReasonRds;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RdsOrderCancellationReasonsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Loaded", "LoadedError", "LoadingStarted", "ReasonClick", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$CloseScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$Loaded;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$LoadedError;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$LoadingStarted;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$ReasonClick;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RdsOrderCancellationReasonsInternalAction extends n {

    /* compiled from: RdsOrderCancellationReasonsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$CloseScreen;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements RdsOrderCancellationReasonsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f256383b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: RdsOrderCancellationReasonsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$Loaded;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements RdsOrderCancellationReasonsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f256384b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c<a> f256385c;

        /* renamed from: d, reason: collision with root package name */
        public final int f256386d;

        public Loaded(@k ArrayList arrayList, @k c cVar, int i12) {
            this.f256384b = arrayList;
            this.f256385c = cVar;
            this.f256386d = i12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f256384b, loaded.f256384b) && this.f256385c.equals(loaded.f256385c) && this.f256386d == loaded.f256386d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f256386d) + H.e(this.f256384b.hashCode() * 31, 31, this.f256385c.f16399b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(reasons=");
            sb2.append(this.f256384b);
            sb2.append(", dataSource=");
            sb2.append(this.f256385c);
            sb2.append(", commentMaxLength=");
            return r.t(sb2, this.f256386d, ')');
        }
    }

    /* compiled from: RdsOrderCancellationReasonsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$LoadedError;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadedError implements RdsOrderCancellationReasonsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f256387b;

        public LoadedError(@k ApiError apiError) {
            this.f256387b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof LoadedError) && L.f(this.f256387b, ((LoadedError) obj).f256387b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF251697c() {
            return new J.a(this.f256387b);
        }

        public final int hashCode() {
            return this.f256387b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("LoadedError(error="), this.f256387b, ')');
        }
    }

    /* compiled from: RdsOrderCancellationReasonsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$LoadingStarted;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements RdsOrderCancellationReasonsInternalAction {
    }

    /* compiled from: RdsOrderCancellationReasonsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction$ReasonClick;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReasonClick implements RdsOrderCancellationReasonsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ReasonRds f256388b;

        /* renamed from: c, reason: collision with root package name */
        public final int f256389c;

        public ReasonClick(@l ReasonRds reasonRds, int i12) {
            this.f256388b = reasonRds;
            this.f256389c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReasonClick)) {
                return false;
            }
            ReasonClick reasonClick = (ReasonClick) obj;
            return L.f(this.f256388b, reasonClick.f256388b) && this.f256389c == reasonClick.f256389c;
        }

        public final int hashCode() {
            ReasonRds reasonRds = this.f256388b;
            return Integer.hashCode(this.f256389c) + ((reasonRds == null ? 0 : reasonRds.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReasonClick(reasonItem=");
            sb2.append(this.f256388b);
            sb2.append(", commentMaxLength=");
            return r.t(sb2, this.f256389c, ')');
        }
    }
}
