package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsCloseLink;", "Lcom/avito/android/deep_linking/links/ChainedDeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PassportMergeAccountsCloseLink extends ChainedDeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportMergeAccountsCloseLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133537b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportMergeAccountsCloseLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsCloseLink createFromParcel(Parcel parcel) {
            return new PassportMergeAccountsCloseLink((DeepLink) parcel.readParcelable(PassportMergeAccountsCloseLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsCloseLink[] newArray(int i12) {
            return new PassportMergeAccountsCloseLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassportMergeAccountsCloseLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.deep_linking.links.ChainedDeepLink
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getF133537b() {
        return this.f133537b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133537b, i12);
    }

    public /* synthetic */ PassportMergeAccountsCloseLink(DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink);
    }

    public PassportMergeAccountsCloseLink(@Y61.l DeepLink deepLink) {
        this.f133537b = deepLink;
    }
}
