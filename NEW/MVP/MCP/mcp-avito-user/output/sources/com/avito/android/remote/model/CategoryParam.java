package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryParam.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001)B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010#R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/CategoryParam;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Entity;", "", "id", "title", "", "isRequired", "isImmutable", "isMultiple", "", "Lcom/avito/android/remote/model/CategoryParam$ParamValue;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;)V", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "()Z", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "getName", "name", "ParamValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoryParam implements Parcelable, Entity<String> {

    @k
    public static final Parcelable.Creator<CategoryParam> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean isImmutable;

    @c("multiple")
    private final boolean isMultiple;

    @c("required")
    private final boolean isRequired;

    @c("title")
    @k
    private final String title;

    @c("values")
    @l
    private final List<ParamValue> values;

    /* compiled from: CategoryParam.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryParam createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(ParamValue.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new CategoryParam(string, string2, z12, z13, z14, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryParam[] newArray(int i12) {
            return new CategoryParam[i12];
        }
    }

    /* compiled from: CategoryParam.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0014J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/CategoryParam$ParamValue;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Entity;", "", "id", "title", "", "Lcom/avito/android/remote/model/CategoryParam;", "innerParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "getInnerParams", "()Ljava/util/List;", "getName", "name", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ParamValue implements Parcelable, Entity<String> {

        @k
        public static final Parcelable.Creator<ParamValue> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("params")
        @l
        private final List<CategoryParam> innerParams;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryParam.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ParamValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParamValue createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(CategoryParam.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ParamValue(string, string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParamValue[] newArray(int i12) {
                return new ParamValue[i12];
            }
        }

        public ParamValue(@k String str, @k String str2, @l List<CategoryParam> list) {
            this.id = str;
            this.title = str2;
            this.innerParams = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof ParamValue) {
                return L.f(getId(), ((ParamValue) other).getId());
            }
            return false;
        }

        @l
        public final List<CategoryParam> getInnerParams() {
            return this.innerParams;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public String getTitle() {
            return this.title;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return getId().hashCode();
        }

        @k
        public String toString() {
            return "ParamValue[" + getId() + ',' + getTitle() + ']';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            List<CategoryParam> list = this.innerParams;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CategoryParam) itA.next()).writeToParcel(parcel, flags);
            }
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public String getId() {
            return this.id;
        }
    }

    public CategoryParam(@k String str, @k String str2, boolean z12, boolean z13, boolean z14, @l List<ParamValue> list) {
        this.id = str;
        this.title = str2;
        this.isRequired = z12;
        this.isImmutable = z13;
        this.isMultiple = z14;
        this.values = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CategoryParam) {
            return L.f(getId(), ((CategoryParam) other).getId());
        }
        return false;
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName, reason: from getter */
    public String getTitle() {
        return this.title;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<ParamValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    /* renamed from: isImmutable, reason: from getter */
    public final boolean getIsImmutable() {
        return this.isImmutable;
    }

    /* renamed from: isMultiple, reason: from getter */
    public final boolean getIsMultiple() {
        return this.isMultiple;
    }

    /* renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    @k
    public String toString() {
        return "CategoryParams[" + getId() + ',' + getTitle() + ']';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeInt(this.isImmutable ? 1 : 0);
        parcel.writeInt(this.isMultiple ? 1 : 0);
        List<ParamValue> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((ParamValue) itA.next()).writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getId() {
        return this.id;
    }
}
