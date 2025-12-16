package com.avito.android.mortgage.selected_appeal.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedAppealInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Dismiss", "UnselectAppealLoadingCompleted", "UnselectAppealLoadingFailed", "UnselectAppealLoadingStarted", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$Dismiss;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$UnselectAppealLoadingCompleted;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$UnselectAppealLoadingFailed;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$UnselectAppealLoadingStarted;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SelectedAppealInternalAction extends n {

    /* compiled from: SelectedAppealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$Dismiss;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismiss implements SelectedAppealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismiss f203473b = new Dismiss();

        private Dismiss() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1467794324;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: SelectedAppealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$UnselectAppealLoadingCompleted;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnselectAppealLoadingCompleted implements SelectedAppealInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UnselectAppealLoadingCompleted f203474b = new UnselectAppealLoadingCompleted();

        private UnselectAppealLoadingCompleted() {
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
            return this == obj || (obj instanceof UnselectAppealLoadingCompleted);
        }

        public final int hashCode() {
            return 2089134857;
        }

        @k
        public final String toString() {
            return "UnselectAppealLoadingCompleted";
        }
    }

    /* compiled from: SelectedAppealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$UnselectAppealLoadingFailed;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnselectAppealLoadingFailed implements SelectedAppealInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203475b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203476c;

        public UnselectAppealLoadingFailed(@k ApiError apiError) {
            this.f203475b = apiError;
            this.f203476c = new J.a(apiError);
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
            return (obj instanceof UnselectAppealLoadingFailed) && L.f(this.f203475b, ((UnselectAppealLoadingFailed) obj).f203475b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF150168c() {
            return this.f203476c;
        }

        public final int hashCode() {
            return this.f203475b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("UnselectAppealLoadingFailed(apiError="), this.f203475b, ')');
        }
    }

    /* compiled from: SelectedAppealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction$UnselectAppealLoadingStarted;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnselectAppealLoadingStarted extends TrackableLoadingStarted implements SelectedAppealInternalAction {
    }
}
