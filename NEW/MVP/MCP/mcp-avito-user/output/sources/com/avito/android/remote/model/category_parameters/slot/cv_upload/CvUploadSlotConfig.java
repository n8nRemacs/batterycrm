package com.avito.android.remote.model.category_parameters.slot.cv_upload;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/CvUploadSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Button;", "button", "Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Banner;", AdFormat.BANNER, "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Button;Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Banner;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Button;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Banner;", "copy", "(Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Button;Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Banner;)Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/CvUploadSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Button;", "getButton", "Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/Banner;", "getBanner", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CvUploadSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<CvUploadSlotConfig> CREATOR = new Creator();

    @c(AdFormat.BANNER)
    @k
    private final Banner banner;

    @c("button")
    @k
    private final Button button;

    /* compiled from: CvUploadSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvUploadSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvUploadSlotConfig createFromParcel(@k Parcel parcel) {
            return new CvUploadSlotConfig(Button.CREATOR.createFromParcel(parcel), Banner.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvUploadSlotConfig[] newArray(int i12) {
            return new CvUploadSlotConfig[i12];
        }
    }

    public CvUploadSlotConfig(@k Button button, @k Banner banner) {
        this.button = button;
        this.banner = banner;
    }

    public static /* synthetic */ CvUploadSlotConfig copy$default(CvUploadSlotConfig cvUploadSlotConfig, Button button, Banner banner, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            button = cvUploadSlotConfig.button;
        }
        if ((i12 & 2) != 0) {
            banner = cvUploadSlotConfig.banner;
        }
        return cvUploadSlotConfig.copy(button, banner);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @k
    public final CvUploadSlotConfig copy(@k Button button, @k Banner banner) {
        return new CvUploadSlotConfig(button, banner);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvUploadSlotConfig)) {
            return false;
        }
        CvUploadSlotConfig cvUploadSlotConfig = (CvUploadSlotConfig) other;
        return L.f(this.button, cvUploadSlotConfig.button) && L.f(this.banner, cvUploadSlotConfig.banner);
    }

    @k
    public final Banner getBanner() {
        return this.banner;
    }

    @k
    public final Button getButton() {
        return this.button;
    }

    public int hashCode() {
        return this.banner.hashCode() + (this.button.hashCode() * 31);
    }

    @k
    public String toString() {
        return "CvUploadSlotConfig(button=" + this.button + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.button.writeToParcel(parcel, flags);
        this.banner.writeToParcel(parcel, flags);
    }
}
