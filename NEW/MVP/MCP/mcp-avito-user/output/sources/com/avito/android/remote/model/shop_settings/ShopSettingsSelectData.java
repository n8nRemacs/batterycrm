package com.avito.android.remote.model.shop_settings;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShopSettingsSelectData.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/shop_settings/ShopSettingsSelectData;", "Landroid/os/Parcelable;", "", "inputId", "selectContext", "", "checkedIds", "selectedParentIds", "selectedId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInputId", "()Ljava/lang/String;", "getSelectContext", "Ljava/util/List;", "getCheckedIds", "()Ljava/util/List;", "getSelectedParentIds", "getSelectedId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ShopSettingsSelectData implements Parcelable {

    @k
    public static final Parcelable.Creator<ShopSettingsSelectData> CREATOR = new Creator();

    @k
    private final List<String> checkedIds;

    @k
    private final String inputId;

    @k
    private final String selectContext;

    @l
    private final String selectedId;

    @k
    private final List<String> selectedParentIds;

    /* compiled from: ShopSettingsSelectData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShopSettingsSelectData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ShopSettingsSelectData createFromParcel(@k Parcel parcel) {
            return new ShopSettingsSelectData(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ShopSettingsSelectData[] newArray(int i12) {
            return new ShopSettingsSelectData[i12];
        }
    }

    public ShopSettingsSelectData(@k String str, @k String str2, @k List<String> list, @k List<String> list2, @l String str3) {
        this.inputId = str;
        this.selectContext = str2;
        this.checkedIds = list;
        this.selectedParentIds = list2;
        this.selectedId = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<String> getCheckedIds() {
        return this.checkedIds;
    }

    @k
    public final String getInputId() {
        return this.inputId;
    }

    @k
    public final String getSelectContext() {
        return this.selectContext;
    }

    @l
    public final String getSelectedId() {
        return this.selectedId;
    }

    @k
    public final List<String> getSelectedParentIds() {
        return this.selectedParentIds;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.inputId);
        parcel.writeString(this.selectContext);
        parcel.writeStringList(this.checkedIds);
        parcel.writeStringList(this.selectedParentIds);
        parcel.writeString(this.selectedId);
    }
}
