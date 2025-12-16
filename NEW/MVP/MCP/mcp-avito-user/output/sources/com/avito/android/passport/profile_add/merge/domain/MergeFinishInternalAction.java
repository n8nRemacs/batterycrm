package com.avito.android.passport.profile_add.merge.domain;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportAccountsMergeInteractor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction;", "", "MergeFinishError", "MergeFinished", "MergeFinishing", "a", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$MergeFinishError;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$MergeFinishing;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MergeFinishInternalAction {

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$MergeFinishError;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeFinishError implements MergeFinishInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f212980b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J.a f212981c;

        public MergeFinishError(@Y61.k Throwable th2) {
            this.f212980b = th2;
            this.f212981c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d */
        public final String getF212984d() {
            return "finalizeAccountsMerge";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "finalizeAccountsMerge";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MergeFinishError) && L.f(this.f212980b, ((MergeFinishError) obj).f212980b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final J.a getF212665b() {
            return this.f212981c;
        }

        public final int hashCode() {
            return this.f212980b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("MergeFinishError(throwable="), this.f212980b, ')');
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$MergeFinished;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MergeFinished implements MergeFinishInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PrintableText f212982b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f212983c;

        /* JADX WARN: Multi-variable type inference failed */
        public MergeFinished() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF212984d() {
            return this.f212983c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f212983c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MergeFinished) && L.f(this.f212982b, ((MergeFinished) obj).f212982b);
        }

        public final int hashCode() {
            return this.f212982b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("MergeFinished(successText="), this.f212982b, ')');
        }

        public MergeFinished(@Y61.k PrintableText printableText) {
            this.f212982b = printableText;
            this.f212983c = "finalizeAccountsMerge";
        }

        public /* synthetic */ MergeFinished(PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? com.avito.android.printable_text.b.c(R.string.passport_lib_public_passport_accounts_merge_finish_success_toast, new Serializable[0]) : printableText);
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$MergeFinishing;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MergeFinishing extends TrackableLoadingStarted implements MergeFinishInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f212984d = "finalizeAccountsMerge";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF212984d() {
            return this.f212984d;
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction$a;", "Lcom/avito/android/passport/profile_add/merge/domain/MergeFinishInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements MergeFinishInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f212985b;

        public a(@Y61.k DeepLink deepLink) {
            this.f212985b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f212985b, ((a) obj).f212985b);
        }

        public final int hashCode() {
            return this.f212985b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deeplink="), this.f212985b, ')');
        }
    }
}
