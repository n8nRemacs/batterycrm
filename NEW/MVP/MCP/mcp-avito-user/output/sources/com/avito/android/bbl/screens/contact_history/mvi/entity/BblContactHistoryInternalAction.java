package com.avito.android.bbl.screens.contact_history.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ph.C47085a;

/* compiled from: BblContactHistoryInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "OnBackClick", "OpenDeepLink", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$Content;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$Error;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$Loading;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$OnBackClick;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$OpenDeepLink;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BblContactHistoryInternalAction extends n {

    /* compiled from: BblContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$Content;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements BblContactHistoryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47085a f99676b;

        public Content(@k C47085a c47085a) {
            this.f99676b = c47085a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Content) && L.f(this.f99676b, ((Content) obj).f99676b);
        }

        public final int hashCode() {
            return this.f99676b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f99676b + ')';
        }
    }

    /* compiled from: BblContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$Error;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements BblContactHistoryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f99677b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f99678c;

        public Error(@k ApiException apiException) {
            this.f99677b = apiException;
            this.f99678c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Error) && this.f99677b.equals(((Error) obj).f99677b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF295467c() {
            return this.f99678c;
        }

        public final int hashCode() {
            return this.f99677b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f99677b, ')');
        }
    }

    /* compiled from: BblContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$Loading;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements BblContactHistoryInternalAction {
    }

    /* compiled from: BblContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$OnBackClick;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackClick implements BblContactHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnBackClick f99679b = new OnBackClick();

        private OnBackClick() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnBackClick);
        }

        public final int hashCode() {
            return 1701071607;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: BblContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction$OpenDeepLink;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements BblContactHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f99680b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f99680b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f99680b, ((OpenDeepLink) obj).f99680b);
        }

        public final int hashCode() {
            return this.f99680b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f99680b, ')');
        }
    }
}
