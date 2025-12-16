package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderParameter.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadButtonConfig;", "Landroid/os/Parcelable;", "", "icon", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/FileUploadButtonConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "getText", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FileUploadButtonConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<FileUploadButtonConfig> CREATOR = new Creator();

    @c("icon")
    @k
    private final String icon;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("text")
    @k
    private final String text;

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FileUploadButtonConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploadButtonConfig createFromParcel(@k Parcel parcel) {
            return new FileUploadButtonConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploadButtonConfig[] newArray(int i12) {
            return new FileUploadButtonConfig[i12];
        }
    }

    public FileUploadButtonConfig(@k String str, @k String str2, @l String str3) {
        this.icon = str;
        this.text = str2;
        this.style = str3;
    }

    public static /* synthetic */ FileUploadButtonConfig copy$default(FileUploadButtonConfig fileUploadButtonConfig, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fileUploadButtonConfig.icon;
        }
        if ((i12 & 2) != 0) {
            str2 = fileUploadButtonConfig.text;
        }
        if ((i12 & 4) != 0) {
            str3 = fileUploadButtonConfig.style;
        }
        return fileUploadButtonConfig.copy(str, str2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    public final FileUploadButtonConfig copy(@k String icon, @k String text, @l String style) {
        return new FileUploadButtonConfig(icon, text, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadButtonConfig)) {
            return false;
        }
        FileUploadButtonConfig fileUploadButtonConfig = (FileUploadButtonConfig) other;
        return L.f(this.icon, fileUploadButtonConfig.icon) && L.f(this.text, fileUploadButtonConfig.text) && L.f(this.style, fileUploadButtonConfig.style);
    }

    @k
    public final String getIcon() {
        return this.icon;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iD2 = H.d(this.icon.hashCode() * 31, 31, this.text);
        String str = this.style;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FileUploadButtonConfig(icon=");
        sb2.append(this.icon);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", style=");
        return C22026a.c(sb2, this.style, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.icon);
        parcel.writeString(this.text);
        parcel.writeString(this.style);
    }
}
