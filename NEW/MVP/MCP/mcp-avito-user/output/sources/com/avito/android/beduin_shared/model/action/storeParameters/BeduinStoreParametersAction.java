package com.avito.android.beduin_shared.model.action.storeParameters;

import K51.d;
import Ui.InterfaceC15524c;
import Ui.e;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinStoreParametersAction.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\\\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t\u0012&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R-\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R:\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/storeParameters/BeduinStoreParametersAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "storageType", "", "storageKey", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "<init>", "(Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "f", "()Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "c", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinStoreParametersAction implements BeduinAction, e {

    @c("formParamsMap")
    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final Map<String, Object> parameters;

    @c("storageKey")
    @k
    private final String storageKey;

    @c("storageType")
    @l
    private final StorageType storageType;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f105302b = new a(null);

    @k
    public static final Parcelable.Creator<BeduinStoreParametersAction> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f105303c = "storeParameters";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<BeduinStoreParametersAction> f105304d = BeduinStoreParametersAction.class;

    /* compiled from: BeduinStoreParametersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/storeParameters/BeduinStoreParametersAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<BeduinStoreParametersAction> getAction() {
            return BeduinStoreParametersAction.f105304d;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinStoreParametersAction.f105303c;
        }

        public a() {
        }
    }

    /* compiled from: BeduinStoreParametersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinStoreParametersAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinStoreParametersAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2 = null;
            StorageType storageTypeValueOf = parcel.readInt() == 0 ? null : StorageType.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BeduinStoreParametersAction.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string2 = parcel.readString();
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(i15);
                    int iA2 = 0;
                    while (iA2 != i15) {
                        iA2 = C0.a(parcel, linkedHashMap4, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap3.put(string2, linkedHashMap4);
                }
                linkedHashMap2 = linkedHashMap3;
            }
            return new BeduinStoreParametersAction(storageTypeValueOf, string, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinStoreParametersAction[] newArray(int i12) {
            return new BeduinStoreParametersAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinStoreParametersAction(@l StorageType storageType, @k String str, @l Map<String, ? extends Object> map, @l Map<String, ? extends Map<String, String>> map2) {
        this.storageType = storageType;
        this.storageKey = str;
        this.parameters = map;
        this.formParamsMap = map2;
    }

    @l
    public final Map<String, Map<String, String>> c() {
        return this.formParamsMap;
    }

    @l
    public final Map<String, Object> d() {
        return this.parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getStorageKey() {
        return this.storageKey;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinStoreParametersAction)) {
            return false;
        }
        BeduinStoreParametersAction beduinStoreParametersAction = (BeduinStoreParametersAction) obj;
        return this.storageType == beduinStoreParametersAction.storageType && L.f(this.storageKey, beduinStoreParametersAction.storageKey) && L.f(this.parameters, beduinStoreParametersAction.parameters) && L.f(this.formParamsMap, beduinStoreParametersAction.formParamsMap);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final StorageType getStorageType() {
        return this.storageType;
    }

    public final int hashCode() {
        StorageType storageType = this.storageType;
        int iD2 = H.d((storageType == null ? 0 : storageType.hashCode()) * 31, 31, this.storageKey);
        Map<String, Object> map = this.parameters;
        int iHashCode = (iD2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinStoreParametersAction(storageType=");
        sb2.append(this.storageType);
        sb2.append(", storageKey=");
        sb2.append(this.storageKey);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", formParamsMap=");
        return r.w(sb2, this.formParamsMap, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        StorageType storageType = this.storageType;
        if (storageType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(storageType.name());
        }
        parcel.writeString(this.storageKey);
        Map<String, Object> map = this.parameters;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            Iterator itI = C0.i(parcel, (Map) entry2.getValue());
            while (itI.hasNext()) {
                Map.Entry entry3 = (Map.Entry) itI.next();
                parcel.writeString((String) entry3.getKey());
                parcel.writeString((String) entry3.getValue());
            }
        }
    }
}
