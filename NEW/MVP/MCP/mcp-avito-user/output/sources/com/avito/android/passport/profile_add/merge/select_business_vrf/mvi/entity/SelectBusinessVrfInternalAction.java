package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity;

import K50.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessListItem;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectBusinessVrfInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BusinessVrfDataLoaded", "Close", "CloseFlow", "ItemClick", "Loading", "LoadingError", "MergeError", "MergeFinished", "NewSearch", "NoChoiceError", "OpenDeepLink", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$BusinessVrfDataLoaded;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$Close;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$CloseFlow;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$ItemClick;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$Loading;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$LoadingError;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$MergeError;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$NewSearch;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$NoChoiceError;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$OpenDeepLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SelectBusinessVrfInternalAction extends n {

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$BusinessVrfDataLoaded;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BusinessVrfDataLoaded implements SelectBusinessVrfInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f213431b;

        public BusinessVrfDataLoaded(@k c cVar) {
            this.f213431b = cVar;
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
            return (obj instanceof BusinessVrfDataLoaded) && L.f(this.f213431b, ((BusinessVrfDataLoaded) obj).f213431b);
        }

        public final int hashCode() {
            return this.f213431b.hashCode();
        }

        @k
        public final String toString() {
            return "BusinessVrfDataLoaded(data=" + this.f213431b + ')';
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$Close;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f213432b = new Close();

        private Close() {
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$CloseFlow;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseFlow implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseFlow f213433b = new CloseFlow();

        private CloseFlow() {
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$ItemClick;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemClick implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f213434b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f213435c;

        public ItemClick(@k ArrayList arrayList, @l Integer num) {
            this.f213434b = arrayList;
            this.f213435c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemClick)) {
                return false;
            }
            ItemClick itemClick = (ItemClick) obj;
            return this.f213434b.equals(itemClick.f213434b) && L.f(this.f213435c, itemClick.f213435c);
        }

        public final int hashCode() {
            int iHashCode = this.f213434b.hashCode() * 31;
            Integer num = this.f213435c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemClick(filteredList=");
            sb2.append(this.f213434b);
            sb2.append(", userIdFrom=");
            return s.j(sb2, this.f213435c, ')');
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements SelectBusinessVrfInternalAction {
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$LoadingError;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements SelectBusinessVrfInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f213436b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f213437c;

        public LoadingError(@k Throwable th2) {
            this.f213436b = th2;
            this.f213437c = new J.a(th2);
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
            return (obj instanceof LoadingError) && L.f(this.f213436b, ((LoadingError) obj).f213436b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF173805c() {
            return this.f213437c;
        }

        public final int hashCode() {
            return this.f213436b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadingError(throwable="), this.f213436b, ')');
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$MergeError;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeError implements SelectBusinessVrfInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f213438b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f213439c;

        public MergeError(@k Throwable th2) {
            this.f213438b = th2;
            this.f213439c = new J.a(th2);
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
            return (obj instanceof MergeError) && L.f(this.f213438b, ((MergeError) obj).f213438b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF173805c() {
            return this.f213439c;
        }

        public final int hashCode() {
            return this.f213438b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("MergeError(throwable="), this.f213438b, ')');
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$NewSearch;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewSearch implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<PassportSelectBusinessListItem> f213442b;

        /* JADX WARN: Multi-variable type inference failed */
        public NewSearch(@k List<? extends PassportSelectBusinessListItem> list) {
            this.f213442b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewSearch) && L.f(this.f213442b, ((NewSearch) obj).f213442b);
        }

        public final int hashCode() {
            return this.f213442b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("NewSearch(filteredList="), this.f213442b, ')');
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$NoChoiceError;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoChoiceError implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChoiceError f213443b = new NoChoiceError();

        private NoChoiceError() {
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeFinished implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f213440b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f213441c;

        public MergeFinished(@l PrintableText printableText, boolean z12) {
            this.f213440b = z12;
            this.f213441c = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MergeFinished)) {
                return false;
            }
            MergeFinished mergeFinished = (MergeFinished) obj;
            return this.f213440b == mergeFinished.f213440b && L.f(this.f213441c, mergeFinished.f213441c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f213440b) * 31;
            PrintableText printableText = this.f213441c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MergeFinished(isMergeSuccess=");
            sb2.append(this.f213440b);
            sb2.append(", successText=");
            return AK.c.m(sb2, this.f213441c, ')');
        }

        public /* synthetic */ MergeFinished(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this(printableText, (i12 & 1) != 0 ? true : z12);
        }
    }

    /* compiled from: SelectBusinessVrfInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements SelectBusinessVrfInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f213444b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f213445c;

        public OpenDeepLink(@k DeepLink deepLink, @l String str) {
            this.f213444b = deepLink;
            this.f213445c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeepLink)) {
                return false;
            }
            OpenDeepLink openDeepLink = (OpenDeepLink) obj;
            return L.f(this.f213444b, openDeepLink.f213444b) && L.f(this.f213445c, openDeepLink.f213445c);
        }

        public final int hashCode() {
            int iHashCode = this.f213444b.hashCode() * 31;
            String str = this.f213445c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deeplink=");
            sb2.append(this.f213444b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f213445c, ')');
        }

        public /* synthetic */ OpenDeepLink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }
}
