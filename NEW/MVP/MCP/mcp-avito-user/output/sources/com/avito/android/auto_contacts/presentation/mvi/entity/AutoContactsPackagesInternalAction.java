package com.avito.android.auto_contacts.presentation.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoContactsPackagesInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BackArrowClicked", "BuyMoreButtonClicked", "ContentLoaded", "ContentLoadingStarted", "ErrorOccurred", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$BackArrowClicked;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$BuyMoreButtonClicked;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$ContentLoaded;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$ContentLoadingStarted;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$ErrorOccurred;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutoContactsPackagesInternalAction extends n {

    /* compiled from: AutoContactsPackagesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$BackArrowClicked;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BackArrowClicked implements AutoContactsPackagesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BackArrowClicked f94949b = new BackArrowClicked();

        private BackArrowClicked() {
        }
    }

    /* compiled from: AutoContactsPackagesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$BuyMoreButtonClicked;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyMoreButtonClicked implements AutoContactsPackagesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f94950b;

        public BuyMoreButtonClicked(@k DeepLink deepLink) {
            this.f94950b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyMoreButtonClicked) && L.f(this.f94950b, ((BuyMoreButtonClicked) obj).f94950b);
        }

        public final int hashCode() {
            return this.f94950b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("BuyMoreButtonClicked(deepLink="), this.f94950b, ')');
        }
    }

    /* compiled from: AutoContactsPackagesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$ContentLoaded;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements AutoContactsPackagesInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoContactsPackagesState f94951b;

        public ContentLoaded(@k AutoContactsPackagesState autoContactsPackagesState) {
            this.f94951b = autoContactsPackagesState;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314045d() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f94951b, ((ContentLoaded) obj).f94951b);
        }

        public final int hashCode() {
            return this.f94951b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(data=" + this.f94951b + ')';
        }
    }

    /* compiled from: AutoContactsPackagesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$ContentLoadingStarted;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoadingStarted extends TrackableLoadingStarted implements AutoContactsPackagesInternalAction {
    }

    /* compiled from: AutoContactsPackagesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction$ErrorOccurred;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorOccurred implements AutoContactsPackagesInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f94952b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f94953c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f94954d;

        public ErrorOccurred(@k J.a aVar, @k String str) {
            this.f94952b = str;
            this.f94953c = aVar;
            this.f94954d = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314045d() {
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
            if (!(obj instanceof ErrorOccurred)) {
                return false;
            }
            ErrorOccurred errorOccurred = (ErrorOccurred) obj;
            return L.f(this.f94952b, errorOccurred.f94952b) && L.f(this.f94953c, errorOccurred.f94953c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314044b() {
            return this.f94954d;
        }

        public final int hashCode() {
            return this.f94953c.f90384a.hashCode() + (this.f94952b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ErrorOccurred(message=" + this.f94952b + ", reason=" + this.f94953c + ')';
        }
    }
}
