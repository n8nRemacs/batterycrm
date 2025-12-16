package com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesConfig.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/AllTogglesSettingsToggles;", "Landroid/os/Parcelable;", "", "header", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "courier", "dbsCourierField", "dbsField", "postamat", "pvz", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/BooleanParameter;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getCourier", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getDbsCourierField", "getDbsField", "getPostamat", "getPvz", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AllTogglesSettingsToggles implements Parcelable {

    @k
    public static final Parcelable.Creator<AllTogglesSettingsToggles> CREATOR = new Creator();

    @c("courier")
    @l
    private final BooleanParameter courier;

    @c("dbsCourierField")
    @l
    private final BooleanParameter dbsCourierField;

    @c("dbsField")
    @l
    private final BooleanParameter dbsField;

    @c("header")
    @l
    private final String header;

    @c("postamat")
    @l
    private final BooleanParameter postamat;

    @c("pvz")
    @l
    private final BooleanParameter pvz;

    /* compiled from: DeliveryAllTogglesConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AllTogglesSettingsToggles> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesSettingsToggles createFromParcel(@k Parcel parcel) {
            return new AllTogglesSettingsToggles(parcel.readString(), (BooleanParameter) parcel.readParcelable(AllTogglesSettingsToggles.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(AllTogglesSettingsToggles.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(AllTogglesSettingsToggles.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(AllTogglesSettingsToggles.class.getClassLoader()), (BooleanParameter) parcel.readParcelable(AllTogglesSettingsToggles.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllTogglesSettingsToggles[] newArray(int i12) {
            return new AllTogglesSettingsToggles[i12];
        }
    }

    public AllTogglesSettingsToggles(@l String str, @l BooleanParameter booleanParameter, @l BooleanParameter booleanParameter2, @l BooleanParameter booleanParameter3, @l BooleanParameter booleanParameter4, @l BooleanParameter booleanParameter5) {
        this.header = str;
        this.courier = booleanParameter;
        this.dbsCourierField = booleanParameter2;
        this.dbsField = booleanParameter3;
        this.postamat = booleanParameter4;
        this.pvz = booleanParameter5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final BooleanParameter getCourier() {
        return this.courier;
    }

    @l
    public final BooleanParameter getDbsCourierField() {
        return this.dbsCourierField;
    }

    @l
    public final BooleanParameter getDbsField() {
        return this.dbsField;
    }

    @l
    public final String getHeader() {
        return this.header;
    }

    @l
    public final BooleanParameter getPostamat() {
        return this.postamat;
    }

    @l
    public final BooleanParameter getPvz() {
        return this.pvz;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.header);
        parcel.writeParcelable(this.courier, flags);
        parcel.writeParcelable(this.dbsCourierField, flags);
        parcel.writeParcelable(this.dbsField, flags);
        parcel.writeParcelable(this.postamat, flags);
        parcel.writeParcelable(this.pvz, flags);
    }
}
