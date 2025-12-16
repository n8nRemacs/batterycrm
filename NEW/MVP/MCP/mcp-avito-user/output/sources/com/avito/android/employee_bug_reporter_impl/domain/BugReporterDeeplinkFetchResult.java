package com.avito.android.employee_bug_reporter_impl.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BugReporterDeeplinkFetchResult.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/domain/BugReporterDeeplinkFetchResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BugReporterDeeplinkFetchResult implements Parcelable {

    @k
    public static final Parcelable.Creator<BugReporterDeeplinkFetchResult> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deepLink;

    /* compiled from: BugReporterDeeplinkFetchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BugReporterDeeplinkFetchResult> {
        @Override // android.os.Parcelable.Creator
        public final BugReporterDeeplinkFetchResult createFromParcel(Parcel parcel) {
            return new BugReporterDeeplinkFetchResult((DeepLink) parcel.readParcelable(BugReporterDeeplinkFetchResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BugReporterDeeplinkFetchResult[] newArray(int i12) {
            return new BugReporterDeeplinkFetchResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BugReporterDeeplinkFetchResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BugReporterDeeplinkFetchResult) && L.f(this.deepLink, ((BugReporterDeeplinkFetchResult) obj).deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final int hashCode() {
        DeepLink deepLink = this.deepLink;
        if (deepLink == null) {
            return 0;
        }
        return deepLink.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("BugReporterDeeplinkFetchResult(deepLink="), this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.deepLink, i12);
    }

    public BugReporterDeeplinkFetchResult(@l DeepLink deepLink) {
        this.deepLink = deepLink;
    }

    public /* synthetic */ BugReporterDeeplinkFetchResult(DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink);
    }
}
