package com.avito.android.remote.model.category_parameters.slot.images_enhancement;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesEnhancementSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0004:;<=BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b5\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001b¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;", "onboarding", "", "title", "nextButtonTitleNoEnhancement", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;", "loadingOverlay", "nextButtonTitle", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;", "mainToggle", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;", "toastMessages", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;", "component7", "()Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;", "copy", "(Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;)Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;", "getOnboarding", "Ljava/lang/String;", "getTitle", "getNextButtonTitleNoEnhancement", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;", "getLoadingOverlay", "getNextButtonTitle", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;", "getMainToggle", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;", "getToastMessages", "LoadingOverlay", "MainToggle", "Onboarding", "ToastMessages", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImagesEnhancementSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<ImagesEnhancementSlotConfig> CREATOR = new Creator();

    @c("loadingOverlay")
    @k
    private final LoadingOverlay loadingOverlay;

    @c("mainToggle")
    @k
    private final MainToggle mainToggle;

    @c("nextButtonTitle")
    @k
    private final String nextButtonTitle;

    @c("nextButtonTitleNoEnhancement")
    @k
    private final String nextButtonTitleNoEnhancement;

    @c("onboarding")
    @l
    private final Onboarding onboarding;

    @c("title")
    @k
    private final String title;

    @c("toastType")
    @k
    private final ToastMessages toastMessages;

    /* compiled from: ImagesEnhancementSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImagesEnhancementSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesEnhancementSlotConfig createFromParcel(@k Parcel parcel) {
            return new ImagesEnhancementSlotConfig(parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), LoadingOverlay.CREATOR.createFromParcel(parcel), parcel.readString(), MainToggle.CREATOR.createFromParcel(parcel), ToastMessages.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesEnhancementSlotConfig[] newArray(int i12) {
            return new ImagesEnhancementSlotConfig[i12];
        }
    }

    /* compiled from: ImagesEnhancementSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;", "Landroid/os/Parcelable;", "", "processTitle", "successTitle", "cancelButtonTitle", "errorTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$LoadingOverlay;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getProcessTitle", "getSuccessTitle", "getCancelButtonTitle", "getErrorTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingOverlay implements Parcelable {

        @k
        public static final Parcelable.Creator<LoadingOverlay> CREATOR = new Creator();

        @c("cancelButtonTitle")
        @k
        private final String cancelButtonTitle;

        @c("errorTitle")
        @k
        private final String errorTitle;

        @c("processTitle")
        @k
        private final String processTitle;

        @c("successTitle")
        @k
        private final String successTitle;

        /* compiled from: ImagesEnhancementSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LoadingOverlay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LoadingOverlay createFromParcel(@k Parcel parcel) {
                return new LoadingOverlay(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LoadingOverlay[] newArray(int i12) {
                return new LoadingOverlay[i12];
            }
        }

        public LoadingOverlay(@k String str, @k String str2, @k String str3, @k String str4) {
            this.processTitle = str;
            this.successTitle = str2;
            this.cancelButtonTitle = str3;
            this.errorTitle = str4;
        }

        public static /* synthetic */ LoadingOverlay copy$default(LoadingOverlay loadingOverlay, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = loadingOverlay.processTitle;
            }
            if ((i12 & 2) != 0) {
                str2 = loadingOverlay.successTitle;
            }
            if ((i12 & 4) != 0) {
                str3 = loadingOverlay.cancelButtonTitle;
            }
            if ((i12 & 8) != 0) {
                str4 = loadingOverlay.errorTitle;
            }
            return loadingOverlay.copy(str, str2, str3, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getProcessTitle() {
            return this.processTitle;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSuccessTitle() {
            return this.successTitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getCancelButtonTitle() {
            return this.cancelButtonTitle;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getErrorTitle() {
            return this.errorTitle;
        }

        @k
        public final LoadingOverlay copy(@k String processTitle, @k String successTitle, @k String cancelButtonTitle, @k String errorTitle) {
            return new LoadingOverlay(processTitle, successTitle, cancelButtonTitle, errorTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingOverlay)) {
                return false;
            }
            LoadingOverlay loadingOverlay = (LoadingOverlay) other;
            return L.f(this.processTitle, loadingOverlay.processTitle) && L.f(this.successTitle, loadingOverlay.successTitle) && L.f(this.cancelButtonTitle, loadingOverlay.cancelButtonTitle) && L.f(this.errorTitle, loadingOverlay.errorTitle);
        }

        @k
        public final String getCancelButtonTitle() {
            return this.cancelButtonTitle;
        }

        @k
        public final String getErrorTitle() {
            return this.errorTitle;
        }

        @k
        public final String getProcessTitle() {
            return this.processTitle;
        }

        @k
        public final String getSuccessTitle() {
            return this.successTitle;
        }

        public int hashCode() {
            return this.errorTitle.hashCode() + H.d(H.d(this.processTitle.hashCode() * 31, 31, this.successTitle), 31, this.cancelButtonTitle);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingOverlay(processTitle=");
            sb2.append(this.processTitle);
            sb2.append(", successTitle=");
            sb2.append(this.successTitle);
            sb2.append(", cancelButtonTitle=");
            sb2.append(this.cancelButtonTitle);
            sb2.append(", errorTitle=");
            return C22026a.c(sb2, this.errorTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.processTitle);
            parcel.writeString(this.successTitle);
            parcel.writeString(this.cancelButtonTitle);
            parcel.writeString(this.errorTitle);
        }
    }

    /* compiled from: ImagesEnhancementSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;", "Landroid/os/Parcelable;", "", "enabled", "", "title", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$MainToggle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getEnabled", "Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainToggle implements Parcelable {

        @k
        public static final Parcelable.Creator<MainToggle> CREATOR = new Creator();

        @c("enabled")
        private final boolean enabled;

        @c("title")
        @k
        private final String title;

        /* compiled from: ImagesEnhancementSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MainToggle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MainToggle createFromParcel(@k Parcel parcel) {
                return new MainToggle(parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MainToggle[] newArray(int i12) {
                return new MainToggle[i12];
            }
        }

        public MainToggle(boolean z12, @k String str) {
            this.enabled = z12;
            this.title = str;
        }

        public static /* synthetic */ MainToggle copy$default(MainToggle mainToggle, boolean z12, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = mainToggle.enabled;
            }
            if ((i12 & 2) != 0) {
                str = mainToggle.title;
            }
            return mainToggle.copy(z12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final MainToggle copy(boolean enabled, @k String title) {
            return new MainToggle(enabled, title);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainToggle)) {
                return false;
            }
            MainToggle mainToggle = (MainToggle) other;
            return this.enabled == mainToggle.enabled && L.f(this.title, mainToggle.title);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MainToggle(enabled=");
            sb2.append(this.enabled);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.enabled ? 1 : 0);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: ImagesEnhancementSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;", "Landroid/os/Parcelable;", "", "description", "onceShowId", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$Onboarding;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "getOnceShowId", "getButtonTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Onboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("description")
        @l
        private final String description;

        @c("onceShowId")
        @l
        private final String onceShowId;

        /* compiled from: ImagesEnhancementSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Onboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding createFromParcel(@k Parcel parcel) {
                return new Onboarding(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding[] newArray(int i12) {
                return new Onboarding[i12];
            }
        }

        public Onboarding(@l String str, @l String str2, @l String str3) {
            this.description = str;
            this.onceShowId = str2;
            this.buttonTitle = str3;
        }

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = onboarding.description;
            }
            if ((i12 & 2) != 0) {
                str2 = onboarding.onceShowId;
            }
            if ((i12 & 4) != 0) {
                str3 = onboarding.buttonTitle;
            }
            return onboarding.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        public final Onboarding copy(@l String description, @l String onceShowId, @l String buttonTitle) {
            return new Onboarding(description, onceShowId, buttonTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return L.f(this.description, onboarding.description) && L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.buttonTitle, onboarding.buttonTitle);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        public int hashCode() {
            String str = this.description;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.onceShowId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Onboarding(description=");
            sb2.append(this.description);
            sb2.append(", onceShowId=");
            sb2.append(this.onceShowId);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.buttonTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.description);
            parcel.writeString(this.onceShowId);
            parcel.writeString(this.buttonTitle);
        }
    }

    /* compiled from: ImagesEnhancementSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;", "Landroid/os/Parcelable;", "", "disableEnhanceNotAllowed", "enhanceNotAllowed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig$ToastMessages;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDisableEnhanceNotAllowed", "getEnhanceNotAllowed", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastMessages implements Parcelable {

        @k
        public static final Parcelable.Creator<ToastMessages> CREATOR = new Creator();

        @c("disableEnhanceNotAllowed")
        @k
        private final String disableEnhanceNotAllowed;

        @c("enhanceNotAllowed")
        @k
        private final String enhanceNotAllowed;

        /* compiled from: ImagesEnhancementSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ToastMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ToastMessages createFromParcel(@k Parcel parcel) {
                return new ToastMessages(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ToastMessages[] newArray(int i12) {
                return new ToastMessages[i12];
            }
        }

        public ToastMessages(@k String str, @k String str2) {
            this.disableEnhanceNotAllowed = str;
            this.enhanceNotAllowed = str2;
        }

        public static /* synthetic */ ToastMessages copy$default(ToastMessages toastMessages, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = toastMessages.disableEnhanceNotAllowed;
            }
            if ((i12 & 2) != 0) {
                str2 = toastMessages.enhanceNotAllowed;
            }
            return toastMessages.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getDisableEnhanceNotAllowed() {
            return this.disableEnhanceNotAllowed;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getEnhanceNotAllowed() {
            return this.enhanceNotAllowed;
        }

        @k
        public final ToastMessages copy(@k String disableEnhanceNotAllowed, @k String enhanceNotAllowed) {
            return new ToastMessages(disableEnhanceNotAllowed, enhanceNotAllowed);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToastMessages)) {
                return false;
            }
            ToastMessages toastMessages = (ToastMessages) other;
            return L.f(this.disableEnhanceNotAllowed, toastMessages.disableEnhanceNotAllowed) && L.f(this.enhanceNotAllowed, toastMessages.enhanceNotAllowed);
        }

        @k
        public final String getDisableEnhanceNotAllowed() {
            return this.disableEnhanceNotAllowed;
        }

        @k
        public final String getEnhanceNotAllowed() {
            return this.enhanceNotAllowed;
        }

        public int hashCode() {
            return this.enhanceNotAllowed.hashCode() + (this.disableEnhanceNotAllowed.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ToastMessages(disableEnhanceNotAllowed=");
            sb2.append(this.disableEnhanceNotAllowed);
            sb2.append(", enhanceNotAllowed=");
            return C22026a.c(sb2, this.enhanceNotAllowed, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.disableEnhanceNotAllowed);
            parcel.writeString(this.enhanceNotAllowed);
        }
    }

    public ImagesEnhancementSlotConfig(@l Onboarding onboarding, @k String str, @k String str2, @k LoadingOverlay loadingOverlay, @k String str3, @k MainToggle mainToggle, @k ToastMessages toastMessages) {
        this.onboarding = onboarding;
        this.title = str;
        this.nextButtonTitleNoEnhancement = str2;
        this.loadingOverlay = loadingOverlay;
        this.nextButtonTitle = str3;
        this.mainToggle = mainToggle;
        this.toastMessages = toastMessages;
    }

    public static /* synthetic */ ImagesEnhancementSlotConfig copy$default(ImagesEnhancementSlotConfig imagesEnhancementSlotConfig, Onboarding onboarding, String str, String str2, LoadingOverlay loadingOverlay, String str3, MainToggle mainToggle, ToastMessages toastMessages, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            onboarding = imagesEnhancementSlotConfig.onboarding;
        }
        if ((i12 & 2) != 0) {
            str = imagesEnhancementSlotConfig.title;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = imagesEnhancementSlotConfig.nextButtonTitleNoEnhancement;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            loadingOverlay = imagesEnhancementSlotConfig.loadingOverlay;
        }
        LoadingOverlay loadingOverlay2 = loadingOverlay;
        if ((i12 & 16) != 0) {
            str3 = imagesEnhancementSlotConfig.nextButtonTitle;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            mainToggle = imagesEnhancementSlotConfig.mainToggle;
        }
        MainToggle mainToggle2 = mainToggle;
        if ((i12 & 64) != 0) {
            toastMessages = imagesEnhancementSlotConfig.toastMessages;
        }
        return imagesEnhancementSlotConfig.copy(onboarding, str4, str5, loadingOverlay2, str6, mainToggle2, toastMessages);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getNextButtonTitleNoEnhancement() {
        return this.nextButtonTitleNoEnhancement;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final LoadingOverlay getLoadingOverlay() {
        return this.loadingOverlay;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getNextButtonTitle() {
        return this.nextButtonTitle;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final MainToggle getMainToggle() {
        return this.mainToggle;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final ToastMessages getToastMessages() {
        return this.toastMessages;
    }

    @k
    public final ImagesEnhancementSlotConfig copy(@l Onboarding onboarding, @k String title, @k String nextButtonTitleNoEnhancement, @k LoadingOverlay loadingOverlay, @k String nextButtonTitle, @k MainToggle mainToggle, @k ToastMessages toastMessages) {
        return new ImagesEnhancementSlotConfig(onboarding, title, nextButtonTitleNoEnhancement, loadingOverlay, nextButtonTitle, mainToggle, toastMessages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagesEnhancementSlotConfig)) {
            return false;
        }
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = (ImagesEnhancementSlotConfig) other;
        return L.f(this.onboarding, imagesEnhancementSlotConfig.onboarding) && L.f(this.title, imagesEnhancementSlotConfig.title) && L.f(this.nextButtonTitleNoEnhancement, imagesEnhancementSlotConfig.nextButtonTitleNoEnhancement) && L.f(this.loadingOverlay, imagesEnhancementSlotConfig.loadingOverlay) && L.f(this.nextButtonTitle, imagesEnhancementSlotConfig.nextButtonTitle) && L.f(this.mainToggle, imagesEnhancementSlotConfig.mainToggle) && L.f(this.toastMessages, imagesEnhancementSlotConfig.toastMessages);
    }

    @k
    public final LoadingOverlay getLoadingOverlay() {
        return this.loadingOverlay;
    }

    @k
    public final MainToggle getMainToggle() {
        return this.mainToggle;
    }

    @k
    public final String getNextButtonTitle() {
        return this.nextButtonTitle;
    }

    @k
    public final String getNextButtonTitleNoEnhancement() {
        return this.nextButtonTitleNoEnhancement;
    }

    @l
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final ToastMessages getToastMessages() {
        return this.toastMessages;
    }

    public int hashCode() {
        Onboarding onboarding = this.onboarding;
        return this.toastMessages.hashCode() + ((this.mainToggle.hashCode() + H.d((this.loadingOverlay.hashCode() + H.d(H.d((onboarding == null ? 0 : onboarding.hashCode()) * 31, 31, this.title), 31, this.nextButtonTitleNoEnhancement)) * 31, 31, this.nextButtonTitle)) * 31);
    }

    @k
    public String toString() {
        return "ImagesEnhancementSlotConfig(onboarding=" + this.onboarding + ", title=" + this.title + ", nextButtonTitleNoEnhancement=" + this.nextButtonTitleNoEnhancement + ", loadingOverlay=" + this.loadingOverlay + ", nextButtonTitle=" + this.nextButtonTitle + ", mainToggle=" + this.mainToggle + ", toastMessages=" + this.toastMessages + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.nextButtonTitleNoEnhancement);
        this.loadingOverlay.writeToParcel(parcel, flags);
        parcel.writeString(this.nextButtonTitle);
        this.mainToggle.writeToParcel(parcel, flags);
        this.toastMessages.writeToParcel(parcel, flags);
    }
}
