package com.avito.android.beduin.common.component.map;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.developments_catalog.AmenityPin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinMapComponentModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001DB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\"\u0010#Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010(J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001cR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b=\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bC\u0010#¨\u0006E"}, d2 = {"Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/remote/model/Coordinates;", "center", "Lcom/avito/android/remote/model/developments_catalog/AmenityPin;", "pins", "", "height", "Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/remote/model/Coordinates;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/Coordinates;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;", "component8", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/remote/model/Coordinates;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/remote/model/Coordinates;", "getCenter", "getPins", "Ljava/lang/Integer;", "getHeight", "Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;", "getStyle", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "MapStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinMapComponentModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinMapComponentModel> CREATOR = new a();

    @com.google.gson.annotations.c("onTapActions")
    @l
    private final List<BeduinAction> actions;

    @k
    private final Coordinates center;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final Integer height;

    @k
    private final String id;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final List<AmenityPin> pins;

    @l
    private final MapStyle style;

    /* compiled from: BeduinMapComponentModel.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;", "Landroid/os/Parcelable;", "", "cornerRadius", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel$MapStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCornerRadius", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class MapStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<MapStyle> CREATOR = new a();

        @l
        private final Integer cornerRadius;

        /* compiled from: BeduinMapComponentModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MapStyle> {
            @Override // android.os.Parcelable.Creator
            public final MapStyle createFromParcel(Parcel parcel) {
                return new MapStyle(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final MapStyle[] newArray(int i12) {
                return new MapStyle[i12];
            }
        }

        public MapStyle(@l Integer num) {
            this.cornerRadius = num;
        }

        public static /* synthetic */ MapStyle copy$default(MapStyle mapStyle, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = mapStyle.cornerRadius;
            }
            return mapStyle.copy(num);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @k
        public final MapStyle copy(@l Integer cornerRadius) {
            return new MapStyle(cornerRadius);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MapStyle) && L.f(this.cornerRadius, ((MapStyle) other).cornerRadius);
        }

        @l
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        public int hashCode() {
            Integer num = this.cornerRadius;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public String toString() {
            return s.j(new StringBuilder("MapStyle(cornerRadius="), this.cornerRadius, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.cornerRadius;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: BeduinMapComponentModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinMapComponentModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinMapComponentModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinMapComponentModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinMapComponentModel.class, parcel, arrayList3, iL3, 1);
                }
                arrayList = arrayList3;
            }
            Coordinates coordinates = (Coordinates) parcel.readParcelable(BeduinMapComponentModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinMapComponentModel.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinMapComponentModel(string, displayingPredicate, arrayList, coordinates, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : MapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinContainerIndent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinMapComponentModel[] newArray(int i12) {
            return new BeduinMapComponentModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinMapComponentModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @k Coordinates coordinates, @l List<AmenityPin> list2, @l Integer num, @l MapStyle mapStyle, @l BeduinContainerIndent beduinContainerIndent) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.center = coordinates;
        this.pins = list2;
        this.height = num;
        this.style = mapStyle;
        this.padding = beduinContainerIndent;
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
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Coordinates getCenter() {
        return this.center;
    }

    @l
    public final List<AmenityPin> component5() {
        return this.pins;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final MapStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @k
    public final BeduinMapComponentModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @k Coordinates center, @l List<AmenityPin> pins, @l Integer height, @l MapStyle style, @l BeduinContainerIndent padding) {
        return new BeduinMapComponentModel(id2, displayingPredicate, actions, center, pins, height, style, padding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinMapComponentModel)) {
            return false;
        }
        BeduinMapComponentModel beduinMapComponentModel = (BeduinMapComponentModel) other;
        return L.f(this.id, beduinMapComponentModel.id) && L.f(this.displayingPredicate, beduinMapComponentModel.displayingPredicate) && L.f(this.actions, beduinMapComponentModel.actions) && L.f(this.center, beduinMapComponentModel.center) && L.f(this.pins, beduinMapComponentModel.pins) && L.f(this.height, beduinMapComponentModel.height) && L.f(this.style, beduinMapComponentModel.style) && L.f(this.padding, beduinMapComponentModel.padding);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @k
    public final Coordinates getCenter() {
        return this.center;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @l
    public final Integer getHeight() {
        return this.height;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final List<AmenityPin> getPins() {
        return this.pins;
    }

    @l
    public final MapStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode3 = (this.center.hashCode() + ((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        List<AmenityPin> list2 = this.pins;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        MapStyle mapStyle = this.style;
        int iHashCode6 = (iHashCode5 + (mapStyle == null ? 0 : mapStyle.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        return iHashCode6 + (beduinContainerIndent != null ? beduinContainerIndent.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinMapComponentModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", actions=" + this.actions + ", center=" + this.center + ", pins=" + this.pins + ", height=" + this.height + ", style=" + this.style + ", padding=" + this.padding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.center, flags);
        List<AmenityPin> list2 = this.pins;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        MapStyle mapStyle = this.style;
        if (mapStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapStyle.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
    }
}
