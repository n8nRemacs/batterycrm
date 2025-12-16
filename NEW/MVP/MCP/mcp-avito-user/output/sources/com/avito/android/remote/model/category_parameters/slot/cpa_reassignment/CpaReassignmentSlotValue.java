package com.avito.android.remote.model.category_parameters.slot.cpa_reassignment;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpaReassignmentSlotValue.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", SearchParamsConverterKt.OWNER, "lastName", "firstName", "patronymic", "inn", "", "Lcom/avito/android/remote/model/category_parameters/FileUploadParameterValue;", "dduFile", "reassignmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOwner", "()Ljava/lang/String;", "setOwner", "(Ljava/lang/String;)V", "getLastName", "getFirstName", "getPatronymic", "getInn", "Ljava/util/List;", "getDduFile", "()Ljava/util/List;", "getReassignmentId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CpaReassignmentSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<CpaReassignmentSlotValue> CREATOR = new Creator();

    @c("dduFile")
    @l
    private final List<FileUploadParameterValue> dduFile;

    @c("firstName")
    @l
    private final String firstName;

    @c("inn")
    @l
    private final String inn;

    @c("lastName")
    @l
    private final String lastName;

    @c(SearchParamsConverterKt.OWNER)
    @k
    private String owner;

    @c("patronymic")
    @l
    private final String patronymic;

    @c("reassignmentId")
    @l
    private final String reassignmentId;

    /* compiled from: CpaReassignmentSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CpaReassignmentSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaReassignmentSlotValue createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(CpaReassignmentSlotValue.class, parcel, arrayList, iL2, 1);
                }
            }
            return new CpaReassignmentSlotValue(string, string2, string3, string4, string5, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaReassignmentSlotValue[] newArray(int i12) {
            return new CpaReassignmentSlotValue[i12];
        }
    }

    public CpaReassignmentSlotValue(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l List<FileUploadParameterValue> list, @l String str6) {
        this.owner = str;
        this.lastName = str2;
        this.firstName = str3;
        this.patronymic = str4;
        this.inn = str5;
        this.dduFile = list;
        this.reassignmentId = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<FileUploadParameterValue> getDduFile() {
        return this.dduFile;
    }

    @l
    public final String getFirstName() {
        return this.firstName;
    }

    @l
    public final String getInn() {
        return this.inn;
    }

    @l
    public final String getLastName() {
        return this.lastName;
    }

    @k
    public final String getOwner() {
        return this.owner;
    }

    @l
    public final String getPatronymic() {
        return this.patronymic;
    }

    @l
    public final String getReassignmentId() {
        return this.reassignmentId;
    }

    public final void setOwner(@k String str) {
        this.owner = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.owner);
        parcel.writeString(this.lastName);
        parcel.writeString(this.firstName);
        parcel.writeString(this.patronymic);
        parcel.writeString(this.inn);
        List<FileUploadParameterValue> list = this.dduFile;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.reassignmentId);
    }
}
