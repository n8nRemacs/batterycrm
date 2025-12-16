package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AlertBannerInfo.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/AlertBannerInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/BannerType;", "type", "", "header", "text", "<init>", "(Lcom/avito/android/remote/model/BannerType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/BannerType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/avito/android/remote/model/BannerType;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AlertBannerInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/BannerType;", "getType", "Ljava/lang/String;", "getHeader", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AlertBannerInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AlertBannerInfo> CREATOR = new Creator();

    @c("header")
    @k
    private final String header;

    @c("text")
    @l
    private final String text;

    @c("type")
    @k
    private final BannerType type;

    /* compiled from: AlertBannerInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlertBannerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AlertBannerInfo createFromParcel(@k Parcel parcel) {
            return new AlertBannerInfo(BannerType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AlertBannerInfo[] newArray(int i12) {
            return new AlertBannerInfo[i12];
        }
    }

    public AlertBannerInfo(@k BannerType bannerType, @k String str, @l String str2) {
        this.type = bannerType;
        this.header = str;
        this.text = str2;
    }

    public static /* synthetic */ AlertBannerInfo copy$default(AlertBannerInfo alertBannerInfo, BannerType bannerType, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bannerType = alertBannerInfo.type;
        }
        if ((i12 & 2) != 0) {
            str = alertBannerInfo.header;
        }
        if ((i12 & 4) != 0) {
            str2 = alertBannerInfo.text;
        }
        return alertBannerInfo.copy(bannerType, str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BannerType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    public final AlertBannerInfo copy(@k BannerType type, @k String header, @l String text) {
        return new AlertBannerInfo(type, header, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertBannerInfo)) {
            return false;
        }
        AlertBannerInfo alertBannerInfo = (AlertBannerInfo) other;
        return this.type == alertBannerInfo.type && L.f(this.header, alertBannerInfo.header) && L.f(this.text, alertBannerInfo.text);
    }

    @k
    public final String getHeader() {
        return this.header;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @k
    public final BannerType getType() {
        return this.type;
    }

    public int hashCode() {
        int iD2 = H.d(this.type.hashCode() * 31, 31, this.header);
        String str = this.text;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlertBannerInfo(type=");
        sb2.append(this.type);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.header);
        parcel.writeString(this.text);
    }
}
