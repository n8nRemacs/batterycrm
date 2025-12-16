package com.avito.android.passport.profile_add.create.duplication_finish.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.passport.network.model.BusinessVerificationDuplicateSuccessResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVerificationDuplicationFinishInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "Loading", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Close;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Content;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Error;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Loading;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BusinessVerificationDuplicationFinishInternalAction extends n {

    /* compiled from: BusinessVerificationDuplicationFinishInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Close;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements BusinessVerificationDuplicationFinishInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f211319b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1628421774;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BusinessVerificationDuplicationFinishInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Content;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements BusinessVerificationDuplicationFinishInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BusinessVerificationDuplicateSuccessResult f211320b;

        public Content(@k BusinessVerificationDuplicateSuccessResult businessVerificationDuplicateSuccessResult) {
            this.f211320b = businessVerificationDuplicateSuccessResult;
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
            return (obj instanceof Content) && L.f(this.f211320b, ((Content) obj).f211320b);
        }

        public final int hashCode() {
            return this.f211320b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f211320b + ')';
        }
    }

    /* compiled from: BusinessVerificationDuplicationFinishInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Error;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements BusinessVerificationDuplicationFinishInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f211321b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f211322c;

        public Error(@k ApiException apiException) {
            this.f211321b = apiException;
            this.f211322c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f211321b.equals(((Error) obj).f211321b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF131771c() {
            return this.f211322c;
        }

        public final int hashCode() {
            return this.f211321b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f211321b, ')');
        }
    }

    /* compiled from: BusinessVerificationDuplicationFinishInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction$Loading;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements BusinessVerificationDuplicationFinishInternalAction {
    }
}
