package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileToConvertInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Continue", "ContinueWithoutSelectionClicked", "GotProfilesToConvert", "ItemSelected", "MergeFinished", "OpenDeepLink", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$Continue;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$ContinueWithoutSelectionClicked;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$GotProfilesToConvert;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$ItemSelected;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$OpenDeepLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfileToConvertInternalAction extends n {

    /* compiled from: ProfileToConvertInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$Continue;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Continue implements ProfileToConvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f213151b;

        public Continue(@k String str) {
            this.f213151b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Continue) && L.f(this.f213151b, ((Continue) obj).f213151b);
        }

        public final int hashCode() {
            return this.f213151b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Continue(selectedUserId="), this.f213151b, ')');
        }
    }

    /* compiled from: ProfileToConvertInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$ContinueWithoutSelectionClicked;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContinueWithoutSelectionClicked implements ProfileToConvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ContinueWithoutSelectionClicked f213152b = new ContinueWithoutSelectionClicked();

        private ContinueWithoutSelectionClicked() {
        }
    }

    /* compiled from: ProfileToConvertInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$GotProfilesToConvert;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GotProfilesToConvert implements TrackablePreloadedContent, ProfileToConvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MergeAccountsProfile> f213153b;

        public GotProfilesToConvert(@k List<MergeAccountsProfile> list) {
            this.f213153b = list;
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
            return (obj instanceof GotProfilesToConvert) && L.f(this.f213153b, ((GotProfilesToConvert) obj).f213153b);
        }

        public final int hashCode() {
            return this.f213153b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("GotProfilesToConvert(profiles="), this.f213153b, ')');
        }
    }

    /* compiled from: ProfileToConvertInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$ItemSelected;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemSelected implements ProfileToConvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f213154b;

        public ItemSelected(@k String str) {
            this.f213154b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemSelected) && L.f(this.f213154b, ((ItemSelected) obj).f213154b);
        }

        public final int hashCode() {
            return this.f213154b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ItemSelected(selectedUserId="), this.f213154b, ')');
        }
    }

    /* compiled from: ProfileToConvertInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements ProfileToConvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f213157b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f213157b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f213157b, ((OpenDeepLink) obj).f213157b);
        }

        public final int hashCode() {
            return this.f213157b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deeplink="), this.f213157b, ')');
        }
    }

    /* compiled from: ProfileToConvertInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeFinished implements ProfileToConvertInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f213155b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f213156c;

        public MergeFinished(@l PrintableText printableText, boolean z12) {
            this.f213155b = z12;
            this.f213156c = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MergeFinished)) {
                return false;
            }
            MergeFinished mergeFinished = (MergeFinished) obj;
            return this.f213155b == mergeFinished.f213155b && L.f(this.f213156c, mergeFinished.f213156c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f213155b) * 31;
            PrintableText printableText = this.f213156c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MergeFinished(isMergeSuccess=");
            sb2.append(this.f213155b);
            sb2.append(", mergeSuccessText=");
            return c.m(sb2, this.f213156c, ')');
        }

        public /* synthetic */ MergeFinished(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this(printableText, (i12 & 1) != 0 ? true : z12);
        }
    }
}
