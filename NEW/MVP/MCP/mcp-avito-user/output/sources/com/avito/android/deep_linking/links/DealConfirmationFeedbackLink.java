package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DealConfirmationFeedbackLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DealConfirmationFeedbackLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DealConfirmationFeedbackLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DealConfirmationFeedbackLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133170d;

    /* compiled from: DealConfirmationFeedbackLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/DealConfirmationFeedbackLink$a;", "", "<init>", "()V", "", "SOURCE_CARD", "Ljava/lang/String;", "SOURCE_GALLERY", "SOURCE_MAP", "SOURCE_SERP", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealConfirmationFeedbackLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DealConfirmationFeedbackLink> {
        @Override // android.os.Parcelable.Creator
        public final DealConfirmationFeedbackLink createFromParcel(Parcel parcel) {
            return new DealConfirmationFeedbackLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DealConfirmationFeedbackLink[] newArray(int i12) {
            return new DealConfirmationFeedbackLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public DealConfirmationFeedbackLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f133168b = str;
        this.f133169c = str2;
        this.f133170d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133168b);
        parcel.writeString(this.f133169c);
        parcel.writeString(this.f133170d);
    }
}
