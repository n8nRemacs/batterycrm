package com.avito.android.beduin_shared.model.action.custom.reloadScreen;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinReloadScreenAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+BZ\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012Ji\u0010\u0013\u001a\u00020\u00002\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00052(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R*\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000fR7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u000fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/reloadScreen/BeduinReloadScreenAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "", "", "LK51/e;", "params", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "paramsSources", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "component1", "()Ljava/util/Map;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Lcom/avito/android/beduin_shared/model/action/custom/reloadScreen/BeduinReloadScreenAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getParams", "getFormParamsMap", "Ljava/util/List;", "getParamsSources", "Companion", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinReloadScreenAction implements BeduinAction {

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @l
    private final Map<String, Object> params;

    @l
    private final List<ParamsSource> paramsSources;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinReloadScreenAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinReloadScreenAction.class;

    @k
    private static final String type = "reloadScreen";

    /* compiled from: BeduinReloadScreenAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/reloadScreen/BeduinReloadScreenAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinReloadScreenAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinReloadScreenAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinReloadScreenAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinReloadScreenAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinReloadScreenAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList = null;
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BeduinReloadScreenAction.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string = parcel.readString();
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i15);
                    int iA2 = 0;
                    while (iA2 != i15) {
                        iA2 = C0.a(parcel, linkedHashMap3, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap2.put(string, linkedHashMap3);
                }
            }
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                arrayList = new ArrayList(i16);
                while (iL2 != i16) {
                    iL2 = a.l(BeduinReloadScreenAction.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinReloadScreenAction(linkedHashMap, linkedHashMap2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinReloadScreenAction[] newArray(int i12) {
            return new BeduinReloadScreenAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinReloadScreenAction(@l Map<String, ? extends Object> map, @l Map<String, ? extends Map<String, String>> map2, @l List<? extends ParamsSource> list) {
        this.params = map;
        this.formParamsMap = map2;
        this.paramsSources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinReloadScreenAction copy$default(BeduinReloadScreenAction beduinReloadScreenAction, Map map, Map map2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = beduinReloadScreenAction.params;
        }
        if ((i12 & 2) != 0) {
            map2 = beduinReloadScreenAction.formParamsMap;
        }
        if ((i12 & 4) != 0) {
            list = beduinReloadScreenAction.paramsSources;
        }
        return beduinReloadScreenAction.copy(map, map2, list);
    }

    @l
    public final Map<String, Object> component1() {
        return this.params;
    }

    @l
    public final Map<String, Map<String, String>> component2() {
        return this.formParamsMap;
    }

    @l
    public final List<ParamsSource> component3() {
        return this.paramsSources;
    }

    @k
    public final BeduinReloadScreenAction copy(@l Map<String, ? extends Object> params, @l Map<String, ? extends Map<String, String>> formParamsMap, @l List<? extends ParamsSource> paramsSources) {
        return new BeduinReloadScreenAction(params, formParamsMap, paramsSources);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinReloadScreenAction)) {
            return false;
        }
        BeduinReloadScreenAction beduinReloadScreenAction = (BeduinReloadScreenAction) other;
        return L.f(this.params, beduinReloadScreenAction.params) && L.f(this.formParamsMap, beduinReloadScreenAction.formParamsMap) && L.f(this.paramsSources, beduinReloadScreenAction.paramsSources);
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @l
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @l
    public final List<ParamsSource> getParamsSources() {
        return this.paramsSources;
    }

    public int hashCode() {
        Map<String, Object> map = this.params;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<ParamsSource> list = this.paramsSources;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinReloadScreenAction(params=");
        sb2.append(this.params);
        sb2.append(", formParamsMap=");
        sb2.append(this.formParamsMap);
        sb2.append(", paramsSources=");
        return H.p(sb2, this.paramsSources, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<String, Object> map = this.params;
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
        List<ParamsSource> list = this.paramsSources;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
