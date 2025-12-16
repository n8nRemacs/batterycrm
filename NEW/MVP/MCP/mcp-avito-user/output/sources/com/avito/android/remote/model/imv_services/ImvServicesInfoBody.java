package com.avito.android.remote.model.imv_services;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServices.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServicesInfoBody;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "id", "name", "Lcom/avito/android/remote/model/imv_services/ImvServicesValue;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServicesValue;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/imv_services/ImvServicesValue;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServicesValue;)Lcom/avito/android/remote/model/imv_services/ImvServicesInfoBody;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/avito/android/remote/model/imv_services/ImvServicesValue;", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvServicesInfoBody implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<ImvServicesInfoBody> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("title")
    @l
    private final String name;

    @c("value")
    @l
    private final ImvServicesValue value;

    /* compiled from: ImvServices.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImvServicesInfoBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesInfoBody createFromParcel(@k Parcel parcel) {
            return new ImvServicesInfoBody(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ImvServicesValue.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesInfoBody[] newArray(int i12) {
            return new ImvServicesInfoBody[i12];
        }
    }

    public ImvServicesInfoBody(@k String str, @l String str2, @l ImvServicesValue imvServicesValue) {
        this.id = str;
        this.name = str2;
        this.value = imvServicesValue;
    }

    public static /* synthetic */ ImvServicesInfoBody copy$default(ImvServicesInfoBody imvServicesInfoBody, String str, String str2, ImvServicesValue imvServicesValue, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imvServicesInfoBody.id;
        }
        if ((i12 & 2) != 0) {
            str2 = imvServicesInfoBody.name;
        }
        if ((i12 & 4) != 0) {
            imvServicesValue = imvServicesInfoBody.value;
        }
        return imvServicesInfoBody.copy(str, str2, imvServicesValue);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ImvServicesValue getValue() {
        return this.value;
    }

    @k
    public final ImvServicesInfoBody copy(@k String id2, @l String name, @l ImvServicesValue value) {
        return new ImvServicesInfoBody(id2, name, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImvServicesInfoBody)) {
            return false;
        }
        ImvServicesInfoBody imvServicesInfoBody = (ImvServicesInfoBody) other;
        return L.f(this.id, imvServicesInfoBody.id) && L.f(this.name, imvServicesInfoBody.name) && L.f(this.value, imvServicesInfoBody.value);
    }

    @Override // com.avito.android.remote.model.Entity
    @l
    /* renamed from: getName */
    public String getTitle() {
        return this.name;
    }

    @l
    public final ImvServicesValue getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImvServicesValue imvServicesValue = this.value;
        return iHashCode2 + (imvServicesValue != null ? imvServicesValue.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ImvServicesInfoBody(id=" + this.id + ", name=" + this.name + ", value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        ImvServicesValue imvServicesValue = this.value;
        if (imvServicesValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesValue.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getId() {
        return this.id;
    }
}
