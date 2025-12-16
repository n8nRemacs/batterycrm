package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.storeParameters.StorageType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPersistCounterAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001)B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinPersistCounterAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "storageType", "", "storageKey", "", "", "counterValues", "<init>", "(Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinPersistCounterAction;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "getStorageType", "Ljava/lang/String;", "getStorageKey", "Ljava/util/Map;", "getCounterValues", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPersistCounterAction implements BeduinAction {

    @com.google.gson.annotations.c("counterValues")
    @Y61.k
    private final Map<String, Integer> counterValues;

    @com.google.gson.annotations.c("storageKey")
    @Y61.k
    private final String storageKey;

    @com.google.gson.annotations.c("storageType")
    @l
    private final StorageType storageType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinPersistCounterAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinPersistCounterAction.class;

    @Y61.k
    private static final String type = "persistCounter";

    /* compiled from: BeduinPersistCounterAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinPersistCounterAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinPersistCounterAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinPersistCounterAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinPersistCounterAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinPersistCounterAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinPersistCounterAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPersistCounterAction createFromParcel(Parcel parcel) {
            StorageType storageTypeValueOf = parcel.readInt() == 0 ? null : StorageType.valueOf(parcel.readString());
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new BeduinPersistCounterAction(storageTypeValueOf, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPersistCounterAction[] newArray(int i12) {
            return new BeduinPersistCounterAction[i12];
        }
    }

    public BeduinPersistCounterAction(@l StorageType storageType, @Y61.k String str, @Y61.k Map<String, Integer> map) {
        this.storageType = storageType;
        this.storageKey = str;
        this.counterValues = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinPersistCounterAction copy$default(BeduinPersistCounterAction beduinPersistCounterAction, StorageType storageType, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            storageType = beduinPersistCounterAction.storageType;
        }
        if ((i12 & 2) != 0) {
            str = beduinPersistCounterAction.storageKey;
        }
        if ((i12 & 4) != 0) {
            map = beduinPersistCounterAction.counterValues;
        }
        return beduinPersistCounterAction.copy(storageType, str, map);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final StorageType getStorageType() {
        return this.storageType;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getStorageKey() {
        return this.storageKey;
    }

    @Y61.k
    public final Map<String, Integer> component3() {
        return this.counterValues;
    }

    @Y61.k
    public final BeduinPersistCounterAction copy(@l StorageType storageType, @Y61.k String storageKey, @Y61.k Map<String, Integer> counterValues) {
        return new BeduinPersistCounterAction(storageType, storageKey, counterValues);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinPersistCounterAction)) {
            return false;
        }
        BeduinPersistCounterAction beduinPersistCounterAction = (BeduinPersistCounterAction) other;
        return this.storageType == beduinPersistCounterAction.storageType && L.f(this.storageKey, beduinPersistCounterAction.storageKey) && L.f(this.counterValues, beduinPersistCounterAction.counterValues);
    }

    @Y61.k
    public final Map<String, Integer> getCounterValues() {
        return this.counterValues;
    }

    @Y61.k
    public final String getStorageKey() {
        return this.storageKey;
    }

    @l
    public final StorageType getStorageType() {
        return this.storageType;
    }

    public int hashCode() {
        StorageType storageType = this.storageType;
        return this.counterValues.hashCode() + H.d((storageType == null ? 0 : storageType.hashCode()) * 31, 31, this.storageKey);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPersistCounterAction(storageType=");
        sb2.append(this.storageType);
        sb2.append(", storageKey=");
        sb2.append(this.storageKey);
        sb2.append(", counterValues=");
        return r.w(sb2, this.counterValues, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        StorageType storageType = this.storageType;
        if (storageType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(storageType.name());
        }
        parcel.writeString(this.storageKey);
        Iterator itI = C0.i(parcel, this.counterValues);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
    }
}
