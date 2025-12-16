package com.avito.android.verification.verification_status_list.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.VerificationStatusListResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatusListInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "Loaded", "Loading", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction$Error;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction$Loaded;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction$Loading;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StatusListInternalAction extends n {

    /* compiled from: StatusListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction$Error;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements StatusListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f325800b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f325801c;

        public Error(@k Throwable th2) {
            this.f325800b = th2;
            this.f325801c = new J.a(th2);
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
            return (obj instanceof Error) && L.f(this.f325800b, ((Error) obj).f325800b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF287355c() {
            return this.f325801c;
        }

        public final int hashCode() {
            return this.f325800b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f325800b, ')');
        }
    }

    /* compiled from: StatusListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction$Loaded;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements StatusListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationStatusListResult f325802b;

        public Loaded(@k VerificationStatusListResult verificationStatusListResult) {
            this.f325802b = verificationStatusListResult;
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
            return (obj instanceof Loaded) && L.f(this.f325802b, ((Loaded) obj).f325802b);
        }

        public final int hashCode() {
            return this.f325802b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(result=" + this.f325802b + ')';
        }
    }

    /* compiled from: StatusListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction$Loading;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements StatusListInternalAction {
    }
}
