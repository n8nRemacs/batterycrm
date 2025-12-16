package com.avito.android.remote.model.category_parameters.slot.cpa_reassignment;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CpaReassignmentSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b(\u0010!¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "ownerPersonId", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", SearchParamsConverterKt.OWNER, "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "lastName", "firstName", "patronymic", "inn", "Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter;", "dduFile", "reassignmentId", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter;Lcom/avito/android/remote/model/category_parameters/CharParameter;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOwnerPersonId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "getOwner", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "getLastName", "()Lcom/avito/android/remote/model/category_parameters/CharParameter;", "getFirstName", "getPatronymic", "getInn", "Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter;", "getDduFile", "()Lcom/avito/android/remote/model/category_parameters/FileUploaderParameter;", "getReassignmentId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CpaReassignmentSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<CpaReassignmentSlotConfig> CREATOR = new Creator();

    @c("dduFile")
    @l
    private final FileUploaderParameter dduFile;

    @c("firstName")
    @k
    private final CharParameter firstName;

    @c("inn")
    @k
    private final CharParameter inn;

    @c("lastName")
    @k
    private final CharParameter lastName;

    @c(SearchParamsConverterKt.OWNER)
    @k
    private final SelectParameter.Flat owner;

    @c("ownerPersonId")
    @k
    private final String ownerPersonId;

    @c("patronymic")
    @k
    private final CharParameter patronymic;

    @c("reassignmentId")
    @l
    private final CharParameter reassignmentId;

    /* compiled from: CpaReassignmentSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CpaReassignmentSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaReassignmentSlotConfig createFromParcel(@k Parcel parcel) {
            return new CpaReassignmentSlotConfig(parcel.readString(), (SelectParameter.Flat) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()), (FileUploaderParameter) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()), (CharParameter) parcel.readParcelable(CpaReassignmentSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaReassignmentSlotConfig[] newArray(int i12) {
            return new CpaReassignmentSlotConfig[i12];
        }
    }

    public CpaReassignmentSlotConfig(@k String str, @k SelectParameter.Flat flat, @k CharParameter charParameter, @k CharParameter charParameter2, @k CharParameter charParameter3, @k CharParameter charParameter4, @l FileUploaderParameter fileUploaderParameter, @l CharParameter charParameter5) {
        this.ownerPersonId = str;
        this.owner = flat;
        this.lastName = charParameter;
        this.firstName = charParameter2;
        this.patronymic = charParameter3;
        this.inn = charParameter4;
        this.dduFile = fileUploaderParameter;
        this.reassignmentId = charParameter5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final FileUploaderParameter getDduFile() {
        return this.dduFile;
    }

    @k
    public final CharParameter getFirstName() {
        return this.firstName;
    }

    @k
    public final CharParameter getInn() {
        return this.inn;
    }

    @k
    public final CharParameter getLastName() {
        return this.lastName;
    }

    @k
    public final SelectParameter.Flat getOwner() {
        return this.owner;
    }

    @k
    public final String getOwnerPersonId() {
        return this.ownerPersonId;
    }

    @k
    public final CharParameter getPatronymic() {
        return this.patronymic;
    }

    @l
    public final CharParameter getReassignmentId() {
        return this.reassignmentId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.ownerPersonId);
        parcel.writeParcelable(this.owner, flags);
        parcel.writeParcelable(this.lastName, flags);
        parcel.writeParcelable(this.firstName, flags);
        parcel.writeParcelable(this.patronymic, flags);
        parcel.writeParcelable(this.inn, flags);
        parcel.writeParcelable(this.dduFile, flags);
        parcel.writeParcelable(this.reassignmentId, flags);
    }
}
