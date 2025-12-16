package com.avito.android.historical_suggests.suggest.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import uI.C48901b;
import uI.C48904e;

/* compiled from: HistoricalSuggestsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "", "Content", "Error", "a", "Loading", "b", "c", "d", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$Content;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$Error;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$a;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$Loading;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$b;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$c;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$d;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HistoricalSuggestsInternalAction {

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$Content;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements HistoricalSuggestsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C48904e> f162138b;

        public Content(@k List<C48904e> list) {
            this.f162138b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Content) && L.f(this.f162138b, ((Content) obj).f162138b);
        }

        public final int hashCode() {
            return this.f162138b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(data="), this.f162138b, ')');
        }
    }

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$Error;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements HistoricalSuggestsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f162139b;

        public Error(@k ApiError apiError) {
            this.f162139b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Error) && L.f(this.f162139b, ((Error) obj).f162139b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF129491d() {
            J.a.C2676a c2676a = J.a.f90383b;
            ApiError apiError = this.f162139b;
            c2676a.getClass();
            return J.a.C2676a.b(apiError);
        }

        public final int hashCode() {
            return this.f162139b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f162139b, ')');
        }
    }

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$Loading;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements HistoricalSuggestsInternalAction {
    }

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$a;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements HistoricalSuggestsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48904e f162140b;

        public a(@k C48904e c48904e) {
            this.f162140b = c48904e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f162140b, ((a) obj).f162140b);
        }

        public final int hashCode() {
            return this.f162140b.hashCode();
        }

        @k
        public final String toString() {
            return "ExpandBlock(block=" + this.f162140b + ')';
        }
    }

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$b;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements HistoricalSuggestsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48901b f162141b;

        public b(@k C48901b c48901b) {
            this.f162141b = c48901b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f162141b, ((b) obj).f162141b);
        }

        public final int hashCode() {
            return this.f162141b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectSuggestion(suggestion=" + this.f162141b + ')';
        }
    }

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$c;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements HistoricalSuggestsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AddressParameter.Value f162142b;

        public c(@k AddressParameter.Value value) {
            this.f162142b = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f162142b, ((c) obj).f162142b);
        }

        public final int hashCode() {
            return this.f162142b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectValue(address=" + this.f162142b + ')';
        }
    }

    /* compiled from: HistoricalSuggestsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction$d;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements HistoricalSuggestsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f162143b;

        public d(boolean z12) {
            this.f162143b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f162143b == ((d) obj).f162143b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f162143b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowUiUpdate(show="), this.f162143b, ')');
        }
    }
}
