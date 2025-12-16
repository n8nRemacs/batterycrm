package com.avito.android.saved_searches.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubscriptionResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/saved_searches/model/SubscriptionResult;", "Landroid/os/Parcelable;", "", "filterId", "Lcom/avito/android/deep_linking/links/DeepLink;", "searchSubscriptionAction", "editAction", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionResult implements Parcelable {

    @k
    public static final Parcelable.Creator<SubscriptionResult> CREATOR = new a();

    @c("editAction")
    @l
    private final DeepLink editAction;

    @c("id")
    @l
    private final String filterId;

    @c("searchSubscriptionAction")
    @l
    private final DeepLink searchSubscriptionAction;

    /* compiled from: SubscriptionResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SubscriptionResult> {
        @Override // android.os.Parcelable.Creator
        public final SubscriptionResult createFromParcel(Parcel parcel) {
            return new SubscriptionResult(parcel.readString(), (DeepLink) parcel.readParcelable(SubscriptionResult.class.getClassLoader()), (DeepLink) parcel.readParcelable(SubscriptionResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SubscriptionResult[] newArray(int i12) {
            return new SubscriptionResult[i12];
        }
    }

    public SubscriptionResult() {
        this(null, null, null, 7, null);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getFilterId() {
        return this.filterId;
    }

    @l
    public final DeepLink d() {
        DeepLink deepLink = this.searchSubscriptionAction;
        return deepLink == null ? this.editAction : deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.filterId);
        parcel.writeParcelable(this.searchSubscriptionAction, i12);
        parcel.writeParcelable(this.editAction, i12);
    }

    public SubscriptionResult(@l String str, @l DeepLink deepLink, @l DeepLink deepLink2) {
        this.filterId = str;
        this.searchSubscriptionAction = deepLink;
        this.editAction = deepLink2;
    }

    public /* synthetic */ SubscriptionResult(String str, DeepLink deepLink, DeepLink deepLink2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : deepLink2);
    }
}
