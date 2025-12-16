package com.avito.android.verification.verification_finish.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.VerificationFinishResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FinishInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Error", "Loaded", "Loading", "OpenDeeplink", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Close;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Error;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Loaded;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Loading;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$OpenDeeplink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinishInternalAction extends n {

    /* compiled from: FinishInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Close;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements FinishInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f325282b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -322596402;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: FinishInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Error;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FinishInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f325283b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f325284c;

        public Error(@k Throwable th2) {
            this.f325283b = th2;
            this.f325284c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof Error) && L.f(this.f325283b, ((Error) obj).f325283b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211322c() {
            return this.f325284c;
        }

        public final int hashCode() {
            return this.f325283b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f325283b, ')');
        }
    }

    /* compiled from: FinishInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Loaded;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements FinishInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationFinishResult f325285b;

        public Loaded(@k VerificationFinishResult verificationFinishResult) {
            this.f325285b = verificationFinishResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            return (obj instanceof Loaded) && L.f(this.f325285b, ((Loaded) obj).f325285b);
        }

        public final int hashCode() {
            return this.f325285b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(result=" + this.f325285b + ')';
        }
    }

    /* compiled from: FinishInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$Loading;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FinishInternalAction {
    }

    /* compiled from: FinishInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction$OpenDeeplink;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements FinishInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f325286b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f325286b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f325286b, ((OpenDeeplink) obj).f325286b);
        }

        public final int hashCode() {
            return this.f325286b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f325286b, ')');
        }
    }
}
