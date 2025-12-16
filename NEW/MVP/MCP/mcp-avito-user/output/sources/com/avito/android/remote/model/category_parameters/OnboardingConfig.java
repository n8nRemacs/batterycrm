package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadParameter.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingConfig;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/category_parameters/OnboardingConfig$BottomSheetConfig;", "bottomSheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/OnboardingConfig$BottomSheetConfig;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/OnboardingConfig$BottomSheetConfig;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/OnboardingConfig$BottomSheetConfig;)Lcom/avito/android/remote/model/category_parameters/OnboardingConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/category_parameters/OnboardingConfig$BottomSheetConfig;", "getBottomSheet", "BottomSheetConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OnboardingConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingConfig> CREATOR = new Creator();

    @c("bottomSheet")
    @l
    private final BottomSheetConfig bottomSheet;

    @c("description")
    @l
    private final String description;

    @c("title")
    @l
    private final String title;

    /* compiled from: VideoUploadParameter.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingConfig$BottomSheetConfig;", "Landroid/os/Parcelable;", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BottomSheetConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<BottomSheetConfig> CREATOR = new Creator();

        @c("description")
        @l
        private final String description;

        @c("title")
        @l
        private final String title;

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BottomSheetConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BottomSheetConfig createFromParcel(@k Parcel parcel) {
                return new BottomSheetConfig(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BottomSheetConfig[] newArray(int i12) {
                return new BottomSheetConfig[i12];
            }
        }

        public BottomSheetConfig(@l String str, @l String str2) {
            this.title = str;
            this.description = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }
    }

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingConfig createFromParcel(@k Parcel parcel) {
            return new OnboardingConfig(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BottomSheetConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingConfig[] newArray(int i12) {
            return new OnboardingConfig[i12];
        }
    }

    public OnboardingConfig(@l String str, @l String str2, @l BottomSheetConfig bottomSheetConfig) {
        this.title = str;
        this.description = str2;
        this.bottomSheet = bottomSheetConfig;
    }

    public static /* synthetic */ OnboardingConfig copy$default(OnboardingConfig onboardingConfig, String str, String str2, BottomSheetConfig bottomSheetConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onboardingConfig.title;
        }
        if ((i12 & 2) != 0) {
            str2 = onboardingConfig.description;
        }
        if ((i12 & 4) != 0) {
            bottomSheetConfig = onboardingConfig.bottomSheet;
        }
        return onboardingConfig.copy(str, str2, bottomSheetConfig);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BottomSheetConfig getBottomSheet() {
        return this.bottomSheet;
    }

    @k
    public final OnboardingConfig copy(@l String title, @l String description, @l BottomSheetConfig bottomSheet) {
        return new OnboardingConfig(title, description, bottomSheet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingConfig)) {
            return false;
        }
        OnboardingConfig onboardingConfig = (OnboardingConfig) other;
        return L.f(this.title, onboardingConfig.title) && L.f(this.description, onboardingConfig.description) && L.f(this.bottomSheet, onboardingConfig.bottomSheet);
    }

    @l
    public final BottomSheetConfig getBottomSheet() {
        return this.bottomSheet;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BottomSheetConfig bottomSheetConfig = this.bottomSheet;
        return iHashCode2 + (bottomSheetConfig != null ? bottomSheetConfig.hashCode() : 0);
    }

    @k
    public String toString() {
        return "OnboardingConfig(title=" + this.title + ", description=" + this.description + ", bottomSheet=" + this.bottomSheet + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        BottomSheetConfig bottomSheetConfig = this.bottomSheet;
        if (bottomSheetConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomSheetConfig.writeToParcel(parcel, flags);
        }
    }
}
