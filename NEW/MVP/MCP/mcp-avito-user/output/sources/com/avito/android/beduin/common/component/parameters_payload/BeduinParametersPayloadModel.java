package com.avito.android.beduin.common.component.parameters_payload;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.i;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ParameterTransform;
import com.avito.android.beduin.common.form.transforms.ParametersTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.model.transform.LocalParameterTransform;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinParametersPayloadModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00015BP\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJa\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0018R*\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b3\u0010\u001a¨\u00066"}, d2 = {"Lcom/avito/android/beduin/common/component/parameters_payload/BeduinParametersPayloadModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/i;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "Lcom/avito/android/beduin_models/BeduinAction;", "onParametersUpdateActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/Map;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/Map;Ljava/util/Map;)Lcom/avito/android/beduin/common/component/parameters_payload/BeduinParametersPayloadModel;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/Map;", "getParameters", "getOnParametersUpdateActions", "ParametersPayloadWithTypes", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinParametersPayloadModel extends LeafBeduinModel implements i {

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Map<String, List<BeduinAction>> onParametersUpdateActions;

    @l
    private final Map<String, Object> parameters;

    /* renamed from: ParametersPayloadWithTypes, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinParametersPayloadModel> CREATOR = new a();

    @k
    private static final List<String> types = Collections.singletonList("parametersPayload");

    @k
    private static final Class<BeduinParametersPayloadModel> model = BeduinParametersPayloadModel.class;

    /* compiled from: BeduinParametersPayloadModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinParametersPayloadModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinParametersPayloadModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinParametersPayloadModel.class.getClassLoader());
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BeduinParametersPayloadModel.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string2 = parcel.readString();
                    int i15 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i15);
                    int iL2 = 0;
                    while (iL2 != i15) {
                        iL2 = com.avito.android.actions_sheet.a.l(BeduinParametersPayloadModel.class, parcel, arrayList, iL2, 1);
                    }
                    linkedHashMap2.put(string2, arrayList);
                }
            }
            return new BeduinParametersPayloadModel(string, displayingPredicate, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinParametersPayloadModel[] newArray(int i12) {
            return new BeduinParametersPayloadModel[i12];
        }
    }

    /* compiled from: BeduinParametersPayloadModel.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/parameters_payload/BeduinParametersPayloadModel$b;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.parameters_payload.BeduinParametersPayloadModel$b, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinParametersPayloadModel> S() {
            return BeduinParametersPayloadModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinParametersPayloadModel.types;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinParametersPayloadModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Map<String, ? extends Object> map, @l Map<String, ? extends List<? extends BeduinAction>> map2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.parameters = map;
        this.onParametersUpdateActions = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinParametersPayloadModel copy$default(BeduinParametersPayloadModel beduinParametersPayloadModel, String str, DisplayingPredicate displayingPredicate, Map map, Map map2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinParametersPayloadModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinParametersPayloadModel.displayingPredicate;
        }
        if ((i12 & 4) != 0) {
            map = beduinParametersPayloadModel.parameters;
        }
        if ((i12 & 8) != 0) {
            map2 = beduinParametersPayloadModel.onParametersUpdateActions;
        }
        return beduinParametersPayloadModel.copy(str, displayingPredicate, map, map2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof ParametersTransform) {
            Map<String, Object> parameters = ((ParametersTransform) transform).getParameters();
            if (parameters == null) {
                parameters = P0.c();
            }
            return copy$default(this, null, null, parameters, null, 11, null);
        }
        if (transform instanceof ParameterTransform) {
            ParameterTransform parameterTransform = (ParameterTransform) transform;
            if (parameterTransform.getValue() == null) {
                Map<String, Object> map = this.parameters;
                return copy$default(this, null, null, map != null ? P0.i(map, parameterTransform.getName()) : null, null, 11, null);
            }
            Map<String, Object> mapC = this.parameters;
            if (mapC == null) {
                mapC = P0.c();
            }
            return copy$default(this, null, null, P0.l(mapC, new Q(parameterTransform.getName(), parameterTransform.getValue())), null, 11, null);
        }
        if (!(transform instanceof LocalParameterTransform)) {
            return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, 13, null) : this;
        }
        LocalParameterTransform localParameterTransform = (LocalParameterTransform) transform;
        String str = localParameterTransform.f105323b;
        Object obj = localParameterTransform.f105324c;
        if (obj != null) {
            Map<String, Object> mapC2 = this.parameters;
            if (mapC2 == null) {
                mapC2 = P0.c();
            }
            BeduinParametersPayloadModel beduinParametersPayloadModelCopy$default = copy$default(this, null, null, P0.l(mapC2, new Q(str, obj)), null, 11, null);
            if (beduinParametersPayloadModelCopy$default != null) {
                return beduinParametersPayloadModelCopy$default;
            }
        }
        Map<String, Object> map2 = this.parameters;
        return copy$default(this, null, null, map2 != null ? P0.i(map2, str) : null, null, 11, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final Map<String, Object> component3() {
        return this.parameters;
    }

    @l
    public final Map<String, List<BeduinAction>> component4() {
        return this.onParametersUpdateActions;
    }

    @k
    public final BeduinParametersPayloadModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Map<String, ? extends Object> parameters, @l Map<String, ? extends List<? extends BeduinAction>> onParametersUpdateActions) {
        return new BeduinParametersPayloadModel(id2, displayingPredicate, parameters, onParametersUpdateActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinParametersPayloadModel)) {
            return false;
        }
        BeduinParametersPayloadModel beduinParametersPayloadModel = (BeduinParametersPayloadModel) other;
        return L.f(this.id, beduinParametersPayloadModel.id) && L.f(this.displayingPredicate, beduinParametersPayloadModel.displayingPredicate) && L.f(this.parameters, beduinParametersPayloadModel.parameters) && L.f(this.onParametersUpdateActions, beduinParametersPayloadModel.onParametersUpdateActions);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final Map<String, List<BeduinAction>> getOnParametersUpdateActions() {
        return this.onParametersUpdateActions;
    }

    @l
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Map<String, Object> map = this.parameters;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, List<BeduinAction>> map2 = this.onParametersUpdateActions;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinParametersPayloadModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", onParametersUpdateActions=");
        return r.w(sb2, this.onParametersUpdateActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
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
        Map<String, List<BeduinAction>> map2 = this.onParametersUpdateActions;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            Iterator itJ = C0.j((List) entry2.getValue(), parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }
}
