package com.avito.android.verification.verification_disclaimer.mvi.entity;

import CM0.i;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "ErrorDetails", "Loaded", "Loading", "ShowToast", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$Error;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$ErrorDetails;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$Loaded;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$Loading;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$ShowToast;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DisclaimerInternalAction extends n {

    /* compiled from: DisclaimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$Error;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements DisclaimerInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f325097b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f325098c;

        public Error(@k Throwable th2) {
            this.f325097b = th2;
            this.f325098c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Error) && L.f(this.f325097b, ((Error) obj).f325097b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF158787c() {
            return this.f325098c;
        }

        public final int hashCode() {
            return this.f325097b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f325097b, ')');
        }
    }

    /* compiled from: DisclaimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$ErrorDetails;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorDetails implements DisclaimerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i.b f325099b;

        public ErrorDetails(@k i.b bVar) {
            this.f325099b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorDetails) && L.f(this.f325099b, ((ErrorDetails) obj).f325099b);
        }

        public final int hashCode() {
            return this.f325099b.hashCode();
        }

        @k
        public final String toString() {
            return "ErrorDetails(errorDetailsV3=" + this.f325099b + ')';
        }
    }

    /* compiled from: DisclaimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$Loaded;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements DisclaimerInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i.a f325100b;

        public Loaded(@k i.a aVar) {
            this.f325100b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Loaded) && L.f(this.f325100b, ((Loaded) obj).f325100b);
        }

        public final int hashCode() {
            return this.f325100b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(result=" + this.f325100b + ')';
        }
    }

    /* compiled from: DisclaimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$Loading;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements DisclaimerInternalAction {
    }

    /* compiled from: DisclaimerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction$ShowToast;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements DisclaimerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f325101b;

        public ShowToast(@k String str) {
            this.f325101b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f325101b, ((ShowToast) obj).f325101b);
        }

        public final int hashCode() {
            return this.f325101b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(text="), this.f325101b, ')');
        }
    }
}
