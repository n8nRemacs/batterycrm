package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenGalleryAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,BK\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JX\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0010R7\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0012¨\u0006-"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenGalleryAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "Lcom/avito/android/remote/model/Image;", "images", "", "index", "", "", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lcom/avito/android/beduin/common/action/BeduinOpenGalleryAction;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getImages", "Ljava/lang/Integer;", "getIndex", "Ljava/util/Map;", "getFormParamsMap", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenGalleryAction implements BeduinAction {

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @l
    private final List<Image> images;

    @l
    private final Integer index;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenGalleryAction> CREATOR = new b();

    @Y61.k
    private static final Class<BeduinOpenGalleryAction> action = BeduinOpenGalleryAction.class;

    @Y61.k
    private static final String type = "openGallery";

    /* compiled from: BeduinOpenGalleryAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenGalleryAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinOpenGalleryAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinOpenGalleryAction> getAction() {
            return BeduinOpenGalleryAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinOpenGalleryAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenGalleryAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenGalleryAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenGalleryAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinOpenGalleryAction.class, parcel, arrayList, iL2, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
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
                linkedHashMap = linkedHashMap2;
            }
            return new BeduinOpenGalleryAction(arrayList, numValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenGalleryAction[] newArray(int i12) {
            return new BeduinOpenGalleryAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOpenGalleryAction(@l List<Image> list, @l Integer num, @l Map<String, ? extends Map<String, String>> map) {
        this.images = list;
        this.index = num;
        this.formParamsMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinOpenGalleryAction copy$default(BeduinOpenGalleryAction beduinOpenGalleryAction, List list, Integer num, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinOpenGalleryAction.images;
        }
        if ((i12 & 2) != 0) {
            num = beduinOpenGalleryAction.index;
        }
        if ((i12 & 4) != 0) {
            map = beduinOpenGalleryAction.formParamsMap;
        }
        return beduinOpenGalleryAction.copy(list, num, map);
    }

    @l
    public final List<Image> component1() {
        return this.images;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    @l
    public final Map<String, Map<String, String>> component3() {
        return this.formParamsMap;
    }

    @Y61.k
    public final BeduinOpenGalleryAction copy(@l List<Image> images, @l Integer index, @l Map<String, ? extends Map<String, String>> formParamsMap) {
        return new BeduinOpenGalleryAction(images, index, formParamsMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenGalleryAction)) {
            return false;
        }
        BeduinOpenGalleryAction beduinOpenGalleryAction = (BeduinOpenGalleryAction) other;
        return L.f(this.images, beduinOpenGalleryAction.images) && L.f(this.index, beduinOpenGalleryAction.index) && L.f(this.formParamsMap, beduinOpenGalleryAction.formParamsMap);
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    @l
    public final Integer getIndex() {
        return this.index;
    }

    public int hashCode() {
        List<Image> list = this.images;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.index;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, Map<String, String>> map = this.formParamsMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenGalleryAction(images=");
        sb2.append(this.images);
        sb2.append(", index=");
        sb2.append(this.index);
        sb2.append(", formParamsMap=");
        return r.w(sb2, this.formParamsMap, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Integer num = this.index;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
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

    public /* synthetic */ BeduinOpenGalleryAction(List list, Integer num, Map map, int i12, C42822w c42822w) {
        this(list, num, (i12 & 4) != 0 ? null : map);
    }
}
