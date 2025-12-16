package com.avito.android.beduin.common.component.stored_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.i;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.model.action.storeParameters.StorageType;
import com.google.gson.annotations.c;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinStoredParametersModel.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/beduin/common/component/stored_parameters/BeduinStoredParametersModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/i;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "storageType", "", "storageKeys", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "d", "()Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "Ljava/util/List;", "c", "()Ljava/util/List;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinStoredParametersModel extends LeafBeduinModel implements i {

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @c("id")
    @k
    private final String id;

    @c("storageKeys")
    @k
    private final List<String> storageKeys;

    @c("storageType")
    @l
    private final StorageType storageType;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f102729b = new a(null);

    @k
    public static final Parcelable.Creator<BeduinStoredParametersModel> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final List<String> f102730c = Collections.singletonList("storedParameters");

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<BeduinStoredParametersModel> f102731d = BeduinStoredParametersModel.class;

    /* compiled from: BeduinStoredParametersModel.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/stored_parameters/BeduinStoredParametersModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinStoredParametersModel> S() {
            return BeduinStoredParametersModel.f102731d;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinStoredParametersModel.f102730c;
        }

        public a() {
        }
    }

    /* compiled from: BeduinStoredParametersModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinStoredParametersModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinStoredParametersModel createFromParcel(Parcel parcel) {
            return new BeduinStoredParametersModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinStoredParametersModel.class.getClassLoader()), parcel.readInt() == 0 ? null : StorageType.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinStoredParametersModel[] newArray(int i12) {
            return new BeduinStoredParametersModel[i12];
        }
    }

    public /* synthetic */ BeduinStoredParametersModel(String str, DisplayingPredicate displayingPredicate, StorageType storageType, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : displayingPredicate, storageType, list);
    }

    @k
    public final List<String> c() {
        return this.storageKeys;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final StorageType getStorageType() {
        return this.storageType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinStoredParametersModel)) {
            return false;
        }
        BeduinStoredParametersModel beduinStoredParametersModel = (BeduinStoredParametersModel) obj;
        return L.f(this.id, beduinStoredParametersModel.id) && L.f(this.displayingPredicate, beduinStoredParametersModel.displayingPredicate) && this.storageType == beduinStoredParametersModel.storageType && L.f(this.storageKeys, beduinStoredParametersModel.storageKeys);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        StorageType storageType = this.storageType;
        return this.storageKeys.hashCode() + ((iHashCode2 + (storageType != null ? storageType.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinStoredParametersModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", storageType=");
        sb2.append(this.storageType);
        sb2.append(", storageKeys=");
        return H.p(sb2, this.storageKeys, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        StorageType storageType = this.storageType;
        if (storageType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(storageType.name());
        }
        parcel.writeStringList(this.storageKeys);
    }

    public BeduinStoredParametersModel(@k String str, @l DisplayingPredicate displayingPredicate, @l StorageType storageType, @k List<String> list) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.storageType = storageType;
        this.storageKeys = list;
    }
}
