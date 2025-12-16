package com.avito.android.beduin.common.component.group;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.ChildrenAppendTransform;
import com.avito.android.beduin.common.form.transforms.ChildrenUpdateTransform;
import com.avito.android.beduin.common.form.transforms.ComponentsGroupAppendTransform;
import com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinComponentsGroupModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00013B)\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\r¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/component/group/BeduinComponentsGroupModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/component/d;", "", "Lcom/avito/android/beduin_models/BeduinModel;", "internalChildren", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "component1", "()Ljava/util/List;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "getInlinedModels", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/group/BeduinComponentsGroupModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getChildren", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinComponentsGroupModel extends BeduinSingleChildOwnerModel implements com.avito.android.beduin.common.component.d {

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<BeduinModel> internalChildren;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinComponentsGroupModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("componentsGroup");

    @k
    private static final Class<BeduinComponentsGroupModel> model = BeduinComponentsGroupModel.class;

    /* compiled from: BeduinComponentsGroupModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/group/BeduinComponentsGroupModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.group.BeduinComponentsGroupModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinComponentsGroupModel> S() {
            return BeduinComponentsGroupModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinComponentsGroupModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinComponentsGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinComponentsGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinComponentsGroupModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(BeduinComponentsGroupModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinComponentsGroupModel(arrayList, parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinComponentsGroupModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinComponentsGroupModel[] newArray(int i12) {
            return new BeduinComponentsGroupModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinComponentsGroupModel(@l List<? extends BeduinModel> list, @k String str, @l DisplayingPredicate displayingPredicate) {
        this.internalChildren = list;
        this.id = str;
        this.displayingPredicate = displayingPredicate;
    }

    private final List<BeduinModel> component1() {
        return this.internalChildren;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinComponentsGroupModel copy$default(BeduinComponentsGroupModel beduinComponentsGroupModel, List list, String str, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinComponentsGroupModel.internalChildren;
        }
        if ((i12 & 2) != 0) {
            str = beduinComponentsGroupModel.id;
        }
        if ((i12 & 4) != 0) {
            displayingPredicate = beduinComponentsGroupModel.displayingPredicate;
        }
        return beduinComponentsGroupModel.copy(list, str, displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof ComponentsGroupUpdateTransform) {
            return copy$default(this, ((ComponentsGroupUpdateTransform) transform).getChildren(), null, null, 6, null);
        }
        if (transform instanceof ComponentsGroupAppendTransform) {
            Collection collection = this.internalChildren;
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            return copy$default(this, C42745f0.h0(((ComponentsGroupAppendTransform) transform).getChildren(), collection), null, null, 6, null);
        }
        if (transform instanceof ChildrenUpdateTransform) {
            return copy$default(this, ((ChildrenUpdateTransform) transform).getChildren(), null, null, 6, null);
        }
        if (!(transform instanceof ChildrenAppendTransform)) {
            return super.apply(transform);
        }
        Collection collection2 = this.internalChildren;
        if (collection2 == null) {
            collection2 = C42784z0.f406748b;
        }
        return copy$default(this, C42745f0.h0(((ChildrenAppendTransform) transform).getChildren(), collection2), null, null, 6, null);
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinComponentsGroupModel copy(@l List<? extends BeduinModel> internalChildren, @k String id2, @l DisplayingPredicate displayingPredicate) {
        return new BeduinComponentsGroupModel(internalChildren, id2, displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return copy$default(this, children, null, displayingPredicate, 2, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinComponentsGroupModel)) {
            return false;
        }
        BeduinComponentsGroupModel beduinComponentsGroupModel = (BeduinComponentsGroupModel) other;
        return L.f(this.internalChildren, beduinComponentsGroupModel.internalChildren) && L.f(this.id, beduinComponentsGroupModel.id) && L.f(this.displayingPredicate, beduinComponentsGroupModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public List<BeduinModel> getChildren() {
        List<BeduinModel> list = this.internalChildren;
        return list == null ? C42784z0.f406748b : list;
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

    @Override // com.avito.android.beduin.common.component.d
    @k
    public List<BeduinModel> getInlinedModels() {
        return getChildren();
    }

    public int hashCode() {
        List<BeduinModel> list = this.internalChildren;
        int iD2 = H.d((list == null ? 0 : list.hashCode()) * 31, 31, this.id);
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iD2 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinComponentsGroupModel(internalChildren=");
        sb2.append(this.internalChildren);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<BeduinModel> list = this.internalChildren;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
