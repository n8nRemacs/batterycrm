package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Flow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PassportMergeAccountsProfilesListFlowLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportMergeAccountsProfilesListFlowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Flow f133541b;

    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow;", "Landroid/os/Parcelable;", "ProfileListAndBusinessVrfDuplication", "ProfileListAndProfileProfConvertation", "ProfileListOnly", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow$ProfileListAndBusinessVrfDuplication;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow$ProfileListAndProfileProfConvertation;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow$ProfileListOnly;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Flow extends Parcelable {

        /* compiled from: PassportLinks.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow$ProfileListAndBusinessVrfDuplication;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProfileListAndBusinessVrfDuplication implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ProfileListAndBusinessVrfDuplication f133542b = new ProfileListAndBusinessVrfDuplication();

            @Y61.k
            public static final Parcelable.Creator<ProfileListAndBusinessVrfDuplication> CREATOR = new a();

            /* compiled from: PassportLinks.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProfileListAndBusinessVrfDuplication> {
                @Override // android.os.Parcelable.Creator
                public final ProfileListAndBusinessVrfDuplication createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ProfileListAndBusinessVrfDuplication.f133542b;
                }

                @Override // android.os.Parcelable.Creator
                public final ProfileListAndBusinessVrfDuplication[] newArray(int i12) {
                    return new ProfileListAndBusinessVrfDuplication[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PassportLinks.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow$ProfileListAndProfileProfConvertation;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProfileListAndProfileProfConvertation implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ProfileListAndProfileProfConvertation f133543b = new ProfileListAndProfileProfConvertation();

            @Y61.k
            public static final Parcelable.Creator<ProfileListAndProfileProfConvertation> CREATOR = new a();

            /* compiled from: PassportLinks.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProfileListAndProfileProfConvertation> {
                @Override // android.os.Parcelable.Creator
                public final ProfileListAndProfileProfConvertation createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ProfileListAndProfileProfConvertation.f133543b;
                }

                @Override // android.os.Parcelable.Creator
                public final ProfileListAndProfileProfConvertation[] newArray(int i12) {
                    return new ProfileListAndProfileProfConvertation[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PassportLinks.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow$ProfileListOnly;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListFlowLink$Flow;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProfileListOnly implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ProfileListOnly f133544b = new ProfileListOnly();

            @Y61.k
            public static final Parcelable.Creator<ProfileListOnly> CREATOR = new a();

            /* compiled from: PassportLinks.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProfileListOnly> {
                @Override // android.os.Parcelable.Creator
                public final ProfileListOnly createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ProfileListOnly.f133544b;
                }

                @Override // android.os.Parcelable.Creator
                public final ProfileListOnly[] newArray(int i12) {
                    return new ProfileListOnly[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportMergeAccountsProfilesListFlowLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsProfilesListFlowLink createFromParcel(Parcel parcel) {
            return new PassportMergeAccountsProfilesListFlowLink((Flow) parcel.readParcelable(PassportMergeAccountsProfilesListFlowLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsProfilesListFlowLink[] newArray(int i12) {
            return new PassportMergeAccountsProfilesListFlowLink[i12];
        }
    }

    public PassportMergeAccountsProfilesListFlowLink(@Y61.k Flow flow) {
        this.f133541b = flow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133541b, i12);
    }
}
