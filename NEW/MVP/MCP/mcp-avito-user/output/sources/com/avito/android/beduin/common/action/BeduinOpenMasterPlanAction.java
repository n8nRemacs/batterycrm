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
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenMasterPlanAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0001=Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012(\b\u0002\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0080\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2(\b\u0002\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R+\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001bR7\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006>"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenMasterPlanAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/remote/model/Image;", "image", "Ljava/util/ArrayList;", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "Lkotlin/collections/ArrayList;", "pins", "", "scroll", "selectedPin", "", "developmentId", "", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/util/ArrayList;FLcom/avito/android/lib/design/master_plan_view/MasterPlanPin;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Ljava/util/ArrayList;", "component3", "()F", "component4", "()Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "component5", "()Ljava/lang/String;", "component6", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/remote/model/Image;Ljava/util/ArrayList;FLcom/avito/android/lib/design/master_plan_view/MasterPlanPin;Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinOpenMasterPlanAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/util/ArrayList;", "getPins", "F", "getScroll", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "getSelectedPin", "Ljava/lang/String;", "getDevelopmentId", "Ljava/util/Map;", "getFormParamsMap", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenMasterPlanAction implements BeduinAction {

    @Y61.k
    private final String developmentId;

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @Y61.k
    private final Image image;

    @l
    private final ArrayList<MasterPlanPin> pins;
    private final float scroll;

    @Y61.k
    private final MasterPlanPin selectedPin;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenMasterPlanAction> CREATOR = new b();

    @Y61.k
    private static final Class<BeduinOpenMasterPlanAction> action = BeduinOpenMasterPlanAction.class;

    @Y61.k
    private static final String type = "openMasterPlan";

    /* compiled from: BeduinOpenMasterPlanAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenMasterPlanAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinOpenMasterPlanAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinOpenMasterPlanAction> getAction() {
            return BeduinOpenMasterPlanAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinOpenMasterPlanAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenMasterPlanAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenMasterPlanAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenMasterPlanAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Image image = (Image) parcel.readParcelable(BeduinOpenMasterPlanAction.class.getClassLoader());
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinOpenMasterPlanAction.class, parcel, arrayList, iL2, 1);
                }
            }
            float f12 = parcel.readFloat();
            MasterPlanPin masterPlanPin = (MasterPlanPin) parcel.readParcelable(BeduinOpenMasterPlanAction.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string2 = parcel.readString();
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                    int iA2 = 0;
                    while (iA2 != i15) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap.put(string2, linkedHashMap2);
                }
            }
            return new BeduinOpenMasterPlanAction(image, arrayList, f12, masterPlanPin, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenMasterPlanAction[] newArray(int i12) {
            return new BeduinOpenMasterPlanAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOpenMasterPlanAction(@Y61.k Image image, @l ArrayList<MasterPlanPin> arrayList, float f12, @Y61.k MasterPlanPin masterPlanPin, @Y61.k String str, @l Map<String, ? extends Map<String, String>> map) {
        this.image = image;
        this.pins = arrayList;
        this.scroll = f12;
        this.selectedPin = masterPlanPin;
        this.developmentId = str;
        this.formParamsMap = map;
    }

    public static /* synthetic */ BeduinOpenMasterPlanAction copy$default(BeduinOpenMasterPlanAction beduinOpenMasterPlanAction, Image image, ArrayList arrayList, float f12, MasterPlanPin masterPlanPin, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = beduinOpenMasterPlanAction.image;
        }
        if ((i12 & 2) != 0) {
            arrayList = beduinOpenMasterPlanAction.pins;
        }
        ArrayList arrayList2 = arrayList;
        if ((i12 & 4) != 0) {
            f12 = beduinOpenMasterPlanAction.scroll;
        }
        float f13 = f12;
        if ((i12 & 8) != 0) {
            masterPlanPin = beduinOpenMasterPlanAction.selectedPin;
        }
        MasterPlanPin masterPlanPin2 = masterPlanPin;
        if ((i12 & 16) != 0) {
            str = beduinOpenMasterPlanAction.developmentId;
        }
        String str2 = str;
        if ((i12 & 32) != 0) {
            map = beduinOpenMasterPlanAction.formParamsMap;
        }
        return beduinOpenMasterPlanAction.copy(image, arrayList2, f13, masterPlanPin2, str2, map);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    public final ArrayList<MasterPlanPin> component2() {
        return this.pins;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScroll() {
        return this.scroll;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final MasterPlanPin getSelectedPin() {
        return this.selectedPin;
    }

    @Y61.k
    /* renamed from: component5, reason: from getter */
    public final String getDevelopmentId() {
        return this.developmentId;
    }

    @l
    public final Map<String, Map<String, String>> component6() {
        return this.formParamsMap;
    }

    @Y61.k
    public final BeduinOpenMasterPlanAction copy(@Y61.k Image image, @l ArrayList<MasterPlanPin> pins, float scroll, @Y61.k MasterPlanPin selectedPin, @Y61.k String developmentId, @l Map<String, ? extends Map<String, String>> formParamsMap) {
        return new BeduinOpenMasterPlanAction(image, pins, scroll, selectedPin, developmentId, formParamsMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenMasterPlanAction)) {
            return false;
        }
        BeduinOpenMasterPlanAction beduinOpenMasterPlanAction = (BeduinOpenMasterPlanAction) other;
        return L.f(this.image, beduinOpenMasterPlanAction.image) && L.f(this.pins, beduinOpenMasterPlanAction.pins) && Float.compare(this.scroll, beduinOpenMasterPlanAction.scroll) == 0 && L.f(this.selectedPin, beduinOpenMasterPlanAction.selectedPin) && L.f(this.developmentId, beduinOpenMasterPlanAction.developmentId) && L.f(this.formParamsMap, beduinOpenMasterPlanAction.formParamsMap);
    }

    @Y61.k
    public final String getDevelopmentId() {
        return this.developmentId;
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @Y61.k
    public final Image getImage() {
        return this.image;
    }

    @l
    public final ArrayList<MasterPlanPin> getPins() {
        return this.pins;
    }

    public final float getScroll() {
        return this.scroll;
    }

    @Y61.k
    public final MasterPlanPin getSelectedPin() {
        return this.selectedPin;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        ArrayList<MasterPlanPin> arrayList = this.pins;
        int iD2 = H.d((this.selectedPin.hashCode() + r.d(this.scroll, (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31)) * 31, 31, this.developmentId);
        Map<String, Map<String, String>> map = this.formParamsMap;
        return iD2 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenMasterPlanAction(image=");
        sb2.append(this.image);
        sb2.append(", pins=");
        sb2.append(this.pins);
        sb2.append(", scroll=");
        sb2.append(this.scroll);
        sb2.append(", selectedPin=");
        sb2.append(this.selectedPin);
        sb2.append(", developmentId=");
        sb2.append(this.developmentId);
        sb2.append(", formParamsMap=");
        return r.w(sb2, this.formParamsMap, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        ArrayList<MasterPlanPin> arrayList = this.pins;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<MasterPlanPin> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        parcel.writeFloat(this.scroll);
        parcel.writeParcelable(this.selectedPin, flags);
        parcel.writeString(this.developmentId);
        Map<String, Map<String, String>> map = this.formParamsMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            Iterator itI = C0.i(parcel, (Map) entry.getValue());
            while (itI.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
    }

    public /* synthetic */ BeduinOpenMasterPlanAction(Image image, ArrayList arrayList, float f12, MasterPlanPin masterPlanPin, String str, Map map, int i12, C42822w c42822w) {
        this(image, arrayList, f12, masterPlanPin, str, (i12 & 32) != 0 ? null : map);
    }
}
