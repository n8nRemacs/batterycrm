package com.avito.android.remote.model.imv_services;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServices.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;", "Landroid/os/Parcelable;", "", "text", "bullet", "", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/imv_services/ImvServicesHintData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getBullet", "Ljava/util/List;", "getOptions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvServicesHintData implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvServicesHintData> CREATOR = new Creator();

    @c("bullet")
    @k
    private final String bullet;

    @c("options")
    @l
    private final List<String> options;

    @c("text")
    @k
    private final String text;

    /* compiled from: ImvServices.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImvServicesHintData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesHintData createFromParcel(@k Parcel parcel) {
            return new ImvServicesHintData(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesHintData[] newArray(int i12) {
            return new ImvServicesHintData[i12];
        }
    }

    public ImvServicesHintData(@k String str, @k String str2, @l List<String> list) {
        this.text = str;
        this.bullet = str2;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImvServicesHintData copy$default(ImvServicesHintData imvServicesHintData, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imvServicesHintData.text;
        }
        if ((i12 & 2) != 0) {
            str2 = imvServicesHintData.bullet;
        }
        if ((i12 & 4) != 0) {
            list = imvServicesHintData.options;
        }
        return imvServicesHintData.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getBullet() {
        return this.bullet;
    }

    @l
    public final List<String> component3() {
        return this.options;
    }

    @k
    public final ImvServicesHintData copy(@k String text, @k String bullet, @l List<String> options) {
        return new ImvServicesHintData(text, bullet, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImvServicesHintData)) {
            return false;
        }
        ImvServicesHintData imvServicesHintData = (ImvServicesHintData) other;
        return L.f(this.text, imvServicesHintData.text) && L.f(this.bullet, imvServicesHintData.bullet) && L.f(this.options, imvServicesHintData.options);
    }

    @k
    public final String getBullet() {
        return this.bullet;
    }

    @l
    public final List<String> getOptions() {
        return this.options;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iD2 = H.d(this.text.hashCode() * 31, 31, this.bullet);
        List<String> list = this.options;
        return iD2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImvServicesHintData(text=");
        sb2.append(this.text);
        sb2.append(", bullet=");
        sb2.append(this.bullet);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.bullet);
        parcel.writeStringList(this.options);
    }
}
