package com.avito.android.beduin.common.component.docking_badge;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinDockingBadgeModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001HB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%Jv\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020)HÖ\u0001¢\u0006\u0004\b1\u0010+J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020)HÖ\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010\"R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bD\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010%¨\u0006I"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge/BeduinDockingBadgeModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "text", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "badgeType", "Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "customBadgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "startEdgeType", "endEdgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "size", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin/common/component/docking_badge/BeduinDockingBadgeModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "component5", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "component6", "()Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "component7", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "component8", "component9", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)Lcom/avito/android/beduin/common/component/docking_badge/BeduinDockingBadgeModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getText", "getTheme", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "getBadgeType", "Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "getCustomBadgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "getStartEdgeType", "getEndEdgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "getSize", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinDockingBadgeModel extends LeafBeduinModel {

    @l
    private final DockingBadgeType.Predefined badgeType;

    @l
    private final CustomBadgeType customBadgeType;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final DockingBadgeEdgeType endEdgeType;

    @k
    private final String id;

    @l
    private final DockingBadgeSize size;

    @l
    private final DockingBadgeEdgeType startEdgeType;

    @k
    private final String text;

    @l
    private final String theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinDockingBadgeModel> CREATOR = new b();

    /* compiled from: BeduinDockingBadgeModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge/BeduinDockingBadgeModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.docking_badge.BeduinDockingBadgeModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return BeduinDockingBadgeModel.class;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("dockingBadge");
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinDockingBadgeModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinDockingBadgeModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinDockingBadgeModel createFromParcel(Parcel parcel) {
            return new BeduinDockingBadgeModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinDockingBadgeModel.class.getClassLoader()), parcel.readString(), parcel.readString(), (DockingBadgeType.Predefined) parcel.readParcelable(BeduinDockingBadgeModel.class.getClassLoader()), parcel.readInt() == 0 ? null : CustomBadgeType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DockingBadgeEdgeType.valueOf(parcel.readString()), DockingBadgeEdgeType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingBadgeSize.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinDockingBadgeModel[] newArray(int i12) {
            return new BeduinDockingBadgeModel[i12];
        }
    }

    public BeduinDockingBadgeModel(@k String str, @l DisplayingPredicate displayingPredicate, @k String str2, @l String str3, @l DockingBadgeType.Predefined predefined, @l CustomBadgeType customBadgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2, @l DockingBadgeSize dockingBadgeSize) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.text = str2;
        this.theme = str3;
        this.badgeType = predefined;
        this.customBadgeType = customBadgeType;
        this.startEdgeType = dockingBadgeEdgeType;
        this.endEdgeType = dockingBadgeEdgeType2;
        this.size = dockingBadgeSize;
    }

    public static /* synthetic */ BeduinDockingBadgeModel copy$default(BeduinDockingBadgeModel beduinDockingBadgeModel, String str, DisplayingPredicate displayingPredicate, String str2, String str3, DockingBadgeType.Predefined predefined, CustomBadgeType customBadgeType, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, DockingBadgeSize dockingBadgeSize, int i12, Object obj) {
        return beduinDockingBadgeModel.copy((i12 & 1) != 0 ? beduinDockingBadgeModel.id : str, (i12 & 2) != 0 ? beduinDockingBadgeModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinDockingBadgeModel.text : str2, (i12 & 8) != 0 ? beduinDockingBadgeModel.theme : str3, (i12 & 16) != 0 ? beduinDockingBadgeModel.badgeType : predefined, (i12 & 32) != 0 ? beduinDockingBadgeModel.customBadgeType : customBadgeType, (i12 & 64) != 0 ? beduinDockingBadgeModel.startEdgeType : dockingBadgeEdgeType, (i12 & 128) != 0 ? beduinDockingBadgeModel.endEdgeType : dockingBadgeEdgeType2, (i12 & 256) != 0 ? beduinDockingBadgeModel.size : dockingBadgeSize);
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

    @k
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DockingBadgeType.Predefined getBadgeType() {
        return this.badgeType;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final CustomBadgeType getCustomBadgeType() {
        return this.customBadgeType;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DockingBadgeEdgeType getStartEdgeType() {
        return this.startEdgeType;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final DockingBadgeEdgeType getEndEdgeType() {
        return this.endEdgeType;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    @k
    public final BeduinDockingBadgeModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k String text, @l String theme, @l DockingBadgeType.Predefined badgeType, @l CustomBadgeType customBadgeType, @l DockingBadgeEdgeType startEdgeType, @k DockingBadgeEdgeType endEdgeType, @l DockingBadgeSize size) {
        return new BeduinDockingBadgeModel(id2, displayingPredicate, text, theme, badgeType, customBadgeType, startEdgeType, endEdgeType, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinDockingBadgeModel)) {
            return false;
        }
        BeduinDockingBadgeModel beduinDockingBadgeModel = (BeduinDockingBadgeModel) other;
        return L.f(this.id, beduinDockingBadgeModel.id) && L.f(this.displayingPredicate, beduinDockingBadgeModel.displayingPredicate) && L.f(this.text, beduinDockingBadgeModel.text) && L.f(this.theme, beduinDockingBadgeModel.theme) && this.badgeType == beduinDockingBadgeModel.badgeType && L.f(this.customBadgeType, beduinDockingBadgeModel.customBadgeType) && this.startEdgeType == beduinDockingBadgeModel.startEdgeType && this.endEdgeType == beduinDockingBadgeModel.endEdgeType && this.size == beduinDockingBadgeModel.size;
    }

    @l
    public final DockingBadgeType.Predefined getBadgeType() {
        return this.badgeType;
    }

    @l
    public final CustomBadgeType getCustomBadgeType() {
        return this.customBadgeType;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100948c() {
        return this.displayingPredicate;
    }

    @k
    public final DockingBadgeEdgeType getEndEdgeType() {
        return this.endEdgeType;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100947b() {
        return this.id;
    }

    @l
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    @l
    public final DockingBadgeEdgeType getStartEdgeType() {
        return this.startEdgeType;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iD2 = H.d((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31, this.text);
        String str = this.theme;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DockingBadgeType.Predefined predefined = this.badgeType;
        int iHashCode3 = (iHashCode2 + (predefined == null ? 0 : predefined.hashCode())) * 31;
        CustomBadgeType customBadgeType = this.customBadgeType;
        int iHashCode4 = (iHashCode3 + (customBadgeType == null ? 0 : customBadgeType.hashCode())) * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType = this.startEdgeType;
        int iHashCode5 = (this.endEdgeType.hashCode() + ((iHashCode4 + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31)) * 31;
        DockingBadgeSize dockingBadgeSize = this.size;
        return iHashCode5 + (dockingBadgeSize != null ? dockingBadgeSize.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinDockingBadgeModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", text=" + this.text + ", theme=" + this.theme + ", badgeType=" + this.badgeType + ", customBadgeType=" + this.customBadgeType + ", startEdgeType=" + this.startEdgeType + ", endEdgeType=" + this.endEdgeType + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.text);
        parcel.writeString(this.theme);
        parcel.writeParcelable(this.badgeType, flags);
        CustomBadgeType customBadgeType = this.customBadgeType;
        if (customBadgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customBadgeType.writeToParcel(parcel, flags);
        }
        DockingBadgeEdgeType dockingBadgeEdgeType = this.startEdgeType;
        if (dockingBadgeEdgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeEdgeType.name());
        }
        parcel.writeString(this.endEdgeType.name());
        DockingBadgeSize dockingBadgeSize = this.size;
        if (dockingBadgeSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeSize.name());
        }
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinDockingBadgeModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, 509, null) : this;
    }
}
