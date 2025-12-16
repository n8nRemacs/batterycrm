package com.avito.android.passport.profile_add.merge.check.mvi.entity;

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
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckMergePossibilityInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Loading", "OpenDeepLink", "UnknownError", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$Close;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$Loading;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$UnknownError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CheckMergePossibilityInternalAction extends n {

    /* compiled from: CheckMergePossibilityInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$Close;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TrackableContent, CheckMergePossibilityInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f212663b = new Close();

        private Close() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1397716851;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CheckMergePossibilityInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CheckMergePossibilityInternalAction {
    }

    /* compiled from: CheckMergePossibilityInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$OpenDeepLink;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements TrackableContent, CheckMergePossibilityInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f212664b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f212664b = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
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
            return (obj instanceof OpenDeepLink) && L.f(this.f212664b, ((OpenDeepLink) obj).f212664b);
        }

        public final int hashCode() {
            return this.f212664b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deeplink="), this.f212664b, ')');
        }
    }

    /* compiled from: CheckMergePossibilityInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction$UnknownError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements TrackableError, CheckMergePossibilityInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f212665b;

        public UnknownError(@k J.a aVar) {
            this.f212665b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
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
            return (obj instanceof UnknownError) && L.f(this.f212665b, ((UnknownError) obj).f212665b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF118027c() {
            return this.f212665b;
        }

        public final int hashCode() {
            return this.f212665b.f90384a.hashCode();
        }

        @k
        public final String toString() {
            return "UnknownError(failure=" + this.f212665b + ')';
        }
    }
}
