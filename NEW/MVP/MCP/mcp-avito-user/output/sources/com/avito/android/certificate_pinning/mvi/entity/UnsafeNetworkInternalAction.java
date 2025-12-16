package com.avito.android.certificate_pinning.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnsafeNetworkInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AuthorizationRequired", "Idle", "Loading", "NetworkError", "NetworkReady", "ProcessAuthorization", "StayUnsafeNetwork", "UnknownSafetyCheckingError", "UnsafeNetwork", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$AuthorizationRequired;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$Idle;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$Loading;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$NetworkError;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$NetworkReady;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$ProcessAuthorization;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$StayUnsafeNetwork;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$UnknownSafetyCheckingError;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$UnsafeNetwork;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface UnsafeNetworkInternalAction extends n {

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$AuthorizationRequired;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthorizationRequired implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f117805b;

        public AuthorizationRequired(@l String str) {
            this.f117805b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthorizationRequired) && L.f(this.f117805b, ((AuthorizationRequired) obj).f117805b);
        }

        public final int hashCode() {
            String str = this.f117805b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AuthorizationRequired(redirectUrl="), this.f117805b, ')');
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$Idle;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Idle implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Idle f117806b = new Idle();

        private Idle() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public final int hashCode() {
            return -1314371956;
        }

        @k
        public final String toString() {
            return "Idle";
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$Loading;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f117807b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -565723260;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$NetworkError;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NetworkError implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NetworkError f117808b = new NetworkError();

        private NetworkError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NetworkError);
        }

        public final int hashCode() {
            return 1940423474;
        }

        @k
        public final String toString() {
            return "NetworkError";
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$NetworkReady;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NetworkReady implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NetworkReady f117809b = new NetworkReady();

        private NetworkReady() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NetworkReady);
        }

        public final int hashCode() {
            return 1952025293;
        }

        @k
        public final String toString() {
            return "NetworkReady";
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$ProcessAuthorization;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProcessAuthorization implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f117810b;

        public ProcessAuthorization(@k String str) {
            this.f117810b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessAuthorization) && L.f(this.f117810b, ((ProcessAuthorization) obj).f117810b);
        }

        public final int hashCode() {
            return this.f117810b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ProcessAuthorization(redirectUrl="), this.f117810b, ')');
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$StayUnsafeNetwork;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StayUnsafeNetwork implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StayUnsafeNetwork f117811b = new StayUnsafeNetwork();

        private StayUnsafeNetwork() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StayUnsafeNetwork);
        }

        public final int hashCode() {
            return 1158002711;
        }

        @k
        public final String toString() {
            return "StayUnsafeNetwork";
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$UnknownSafetyCheckingError;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownSafetyCheckingError implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UnknownSafetyCheckingError f117812b = new UnknownSafetyCheckingError();

        private UnknownSafetyCheckingError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UnknownSafetyCheckingError);
        }

        public final int hashCode() {
            return -941704534;
        }

        @k
        public final String toString() {
            return "UnknownSafetyCheckingError";
        }
    }

    /* compiled from: UnsafeNetworkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction$UnsafeNetwork;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnsafeNetwork implements UnsafeNetworkInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UnsafeNetwork f117813b = new UnsafeNetwork();

        private UnsafeNetwork() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UnsafeNetwork);
        }

        public final int hashCode() {
            return -187360784;
        }

        @k
        public final String toString() {
            return "UnsafeNetwork";
        }
    }
}
