package com.avito.android.change_specific.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.Specific;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ContentLoaded", "ContentLoading", "ContentLoadingError", "SavingError", "SavingInProgress", "SavingSuccess", "SelectSpecific", "SelectSuccess", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$CloseScreen;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$ContentLoaded;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$ContentLoading;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$ContentLoadingError;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SavingError;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SavingInProgress;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SavingSuccess;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SelectSpecific;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SelectSuccess;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ExtendedProfileChangeSpecificInternalAction extends n {

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$CloseScreen;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f118023b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$ContentLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements TrackableContent, ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Specific> f118024b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f118025c;

        public ContentLoaded(@k List<Specific> list, @l Integer num) {
            this.f118024b = list;
            this.f118025c = num;
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f118024b, contentLoaded.f118024b) && L.f(this.f118025c, contentLoaded.f118025c);
        }

        public final int hashCode() {
            int iHashCode = this.f118024b.hashCode() * 31;
            Integer num = this.f118025c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(specifics=");
            sb2.append(this.f118024b);
            sb2.append(", selectedSpecificId=");
            return s.j(sb2, this.f118025c, ')');
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$ContentLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements ExtendedProfileChangeSpecificInternalAction {
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$ContentLoadingError;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoadingError implements ExtendedProfileChangeSpecificInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f118026b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f118027c;

        public ContentLoadingError(@k Throwable th2) {
            this.f118026b = th2;
            this.f118027c = new J.a(th2);
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
            return (obj instanceof ContentLoadingError) && L.f(this.f118026b, ((ContentLoadingError) obj).f118026b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325204c() {
            return this.f118027c;
        }

        public final int hashCode() {
            return this.f118026b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ContentLoadingError(throwable="), this.f118026b, ')');
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SavingError;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavingError implements ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f118028b;

        public SavingError(@k Throwable th2) {
            this.f118028b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavingError) && L.f(this.f118028b, ((SavingError) obj).f118028b);
        }

        public final int hashCode() {
            return this.f118028b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SavingError(throwable="), this.f118028b, ')');
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SavingInProgress;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavingInProgress implements ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SavingInProgress f118029b = new SavingInProgress();

        private SavingInProgress() {
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SavingSuccess;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "()V", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavingSuccess implements ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SavingSuccess f118030b = new SavingSuccess();

        private SavingSuccess() {
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SelectSpecific;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectSpecific implements ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Specific f118031b;

        public SelectSpecific(@k Specific specific) {
            this.f118031b = specific;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectSpecific) && L.f(this.f118031b, ((SelectSpecific) obj).f118031b);
        }

        public final int hashCode() {
            return this.f118031b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectSpecific(specific=" + this.f118031b + ')';
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction$SelectSuccess;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectSuccess implements ExtendedProfileChangeSpecificInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f118032b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f118033c;

        public SelectSuccess(int i12, @k String str) {
            this.f118032b = i12;
            this.f118033c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectSuccess)) {
                return false;
            }
            SelectSuccess selectSuccess = (SelectSuccess) obj;
            return this.f118032b == selectSuccess.f118032b && L.f(this.f118033c, selectSuccess.f118033c);
        }

        public final int hashCode() {
            return this.f118033c.hashCode() + (Integer.hashCode(this.f118032b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectSuccess(specificId=");
            sb2.append(this.f118032b);
            sb2.append(", specificTitle=");
            return C22026a.c(sb2, this.f118033c, ')');
        }
    }
}
