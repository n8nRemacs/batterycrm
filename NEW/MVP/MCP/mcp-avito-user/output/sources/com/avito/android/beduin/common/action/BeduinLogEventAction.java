package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLogEventAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jr\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052(\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0011J \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0011R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0014R7\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0017¨\u00061"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinLogEventAction;", "Lcom/avito/android/beduin_shared/model/action/BeduinLogEventAction;", "", "id", "version", "", "", "params", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "", "hasSensitiveData", "<init>", "(IILjava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "addParams", "(Ljava/util/Map;)Lcom/avito/android/beduin_shared/model/action/BeduinLogEventAction;", "component1", "()I", "component2", "component3", "()Ljava/util/Map;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(IILjava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/action/BeduinLogEventAction;", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "getVersion", "Ljava/util/Map;", "getParams", "getFormParamsMap", "Ljava/lang/Boolean;", "getHasSensitiveData", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLogEventAction implements com.avito.android.beduin_shared.model.action.BeduinLogEventAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinLogEventAction> CREATOR = new a();

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @l
    private final Boolean hasSensitiveData;
    private final int id;

    @l
    private final Map<String, String> params;
    private final int version;

    /* compiled from: BeduinLogEventAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLogEventAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLogEventAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    String string = parcel.readString();
                    int i17 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i17);
                    int iA3 = 0;
                    while (iA3 != i17) {
                        iA3 = C0.a(parcel, linkedHashMap3, parcel.readString(), iA3, 1);
                    }
                    linkedHashMap2.put(string, linkedHashMap3);
                }
            }
            return new BeduinLogEventAction(i12, i13, linkedHashMap, linkedHashMap2, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLogEventAction[] newArray(int i12) {
            return new BeduinLogEventAction[i12];
        }
    }

    /* compiled from: BeduinLogEventAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinLogEventAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f99984b = BeduinLogEventAction.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f99985c = "logEvent";

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f99984b;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF99987c() {
            return this.f99985c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinLogEventAction(int i12, int i13, @l Map<String, String> map, @l Map<String, ? extends Map<String, String>> map2, @l Boolean bool) {
        this.id = i12;
        this.version = i13;
        this.params = map;
        this.formParamsMap = map2;
        this.hasSensitiveData = bool;
    }

    public static /* synthetic */ BeduinLogEventAction copy$default(BeduinLogEventAction beduinLogEventAction, int i12, int i13, Map map, Map map2, Boolean bool, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = beduinLogEventAction.id;
        }
        if ((i14 & 2) != 0) {
            i13 = beduinLogEventAction.version;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            map = beduinLogEventAction.params;
        }
        Map map3 = map;
        if ((i14 & 8) != 0) {
            map2 = beduinLogEventAction.formParamsMap;
        }
        Map map4 = map2;
        if ((i14 & 16) != 0) {
            bool = beduinLogEventAction.hasSensitiveData;
        }
        return beduinLogEventAction.copy(i12, i15, map3, map4, bool);
    }

    @Override // com.avito.android.beduin_shared.model.action.BeduinLogEventAction
    @Y61.k
    public com.avito.android.beduin_shared.model.action.BeduinLogEventAction addParams(@Y61.k Map<String, String> params) {
        Map<String, String> mapC = this.params;
        if (mapC == null) {
            mapC = P0.c();
        }
        return copy$default(this, 0, 0, P0.k(new LinkedHashMap(mapC), params), null, null, 27, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @l
    public final Map<String, String> component3() {
        return this.params;
    }

    @l
    public final Map<String, Map<String, String>> component4() {
        return this.formParamsMap;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    @Y61.k
    public final BeduinLogEventAction copy(int id2, int version, @l Map<String, String> params, @l Map<String, ? extends Map<String, String>> formParamsMap, @l Boolean hasSensitiveData) {
        return new BeduinLogEventAction(id2, version, params, formParamsMap, hasSensitiveData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLogEventAction)) {
            return false;
        }
        BeduinLogEventAction beduinLogEventAction = (BeduinLogEventAction) other;
        return this.id == beduinLogEventAction.id && this.version == beduinLogEventAction.version && L.f(this.params, beduinLogEventAction.params) && L.f(this.formParamsMap, beduinLogEventAction.formParamsMap) && L.f(this.hasSensitiveData, beduinLogEventAction.hasSensitiveData);
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @l
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
        Map<String, String> map = this.params;
        int iHashCode = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.hasSensitiveData;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinLogEventAction(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", formParamsMap=");
        sb2.append(this.formParamsMap);
        sb2.append(", hasSensitiveData=");
        return C0.g(sb2, this.hasSensitiveData, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.version);
        Map<String, String> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
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
        Boolean bool = this.hasSensitiveData;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
