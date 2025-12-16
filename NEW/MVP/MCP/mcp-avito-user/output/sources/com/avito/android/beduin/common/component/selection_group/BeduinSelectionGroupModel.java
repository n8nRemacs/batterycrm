package com.avito.android.beduin.common.component.selection_group;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SelectionGroupItemIdTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSelectionGroupModel.kt */
@K51.d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin/common/component/d;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;", "selectionType", "", "selectedIds", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;", "e", "()Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "a", "SelectionType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectionGroupModel implements BeduinModel, com.avito.android.beduin.common.component.d {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @k
    private final List<BeduinModel> children;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("selectedIds")
    @l
    private final List<String> selectedIds;

    @com.google.gson.annotations.c("selectionType")
    @k
    private final SelectionType selectionType;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f102503b = new a(null);

    @k
    public static final Parcelable.Creator<BeduinSelectionGroupModel> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final List<String> f102504c = Collections.singletonList("selectionGroup");

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<? extends BeduinModel> f102505d = BeduinSelectionGroupModel.class;

    /* compiled from: BeduinSelectionGroupModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;", "Landroid/os/Parcelable;", "()V", "Single", "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType$Single;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SelectionType implements Parcelable {

        /* compiled from: BeduinSelectionGroupModel.kt */
        @Keep
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType$Single;", "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$SelectionType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Single extends SelectionType {

            @k
            public static final Single INSTANCE = new Single();

            @k
            public static final Parcelable.Creator<Single> CREATOR = new a();

            /* compiled from: BeduinSelectionGroupModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Single> {
                @Override // android.os.Parcelable.Creator
                public final Single createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Single.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Single[] newArray(int i12) {
                    return new Single[i12];
                }
            }

            private Single() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ SelectionType(C42822w c42822w) {
            this();
        }

        private SelectionType() {
        }
    }

    /* compiled from: BeduinSelectionGroupModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return BeduinSelectionGroupModel.f102505d;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinSelectionGroupModel.f102504c;
        }

        public a() {
        }
    }

    /* compiled from: BeduinSelectionGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSelectionGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectionGroupModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSelectionGroupModel.class.getClassLoader());
            SelectionType selectionType = (SelectionType) parcel.readParcelable(BeduinSelectionGroupModel.class.getClassLoader());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinSelectionGroupModel.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinSelectionGroupModel(string, displayingPredicate, selectionType, arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectionGroupModel[] newArray(int i12) {
            return new BeduinSelectionGroupModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectionGroupModel(@k String str, @l DisplayingPredicate displayingPredicate, @k SelectionType selectionType, @l List<String> list, @k List<? extends BeduinModel> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.selectionType = selectionType;
        this.selectedIds = list;
        this.children = list2;
    }

    public static BeduinSelectionGroupModel a(BeduinSelectionGroupModel beduinSelectionGroupModel, DisplayingPredicate displayingPredicate, List list, List list2, int i12) {
        String str = beduinSelectionGroupModel.id;
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinSelectionGroupModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        SelectionType selectionType = beduinSelectionGroupModel.selectionType;
        if ((i12 & 8) != 0) {
            list = beduinSelectionGroupModel.selectedIds;
        }
        List list3 = list;
        if ((i12 & 16) != 0) {
            list2 = beduinSelectionGroupModel.children;
        }
        beduinSelectionGroupModel.getClass();
        return new BeduinSelectionGroupModel(str, displayingPredicate2, selectionType, list3, list2);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        if (beduinModelTransform instanceof DisplayPredicateTransform) {
            return a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, null, 29);
        }
        if (!(beduinModelTransform instanceof SelectionGroupItemIdTransform)) {
            return this;
        }
        SelectionGroupItemIdTransform selectionGroupItemIdTransform = (SelectionGroupItemIdTransform) beduinModelTransform;
        if (this.selectionType instanceof SelectionType.Single) {
            return a(this, null, Collections.singletonList(selectionGroupItemIdTransform.getModelId()), null, 23);
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public final List<BeduinModel> c() {
        return this.children;
    }

    @l
    public final List<String> d() {
        return this.selectedIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinSelectionGroupModel)) {
            return false;
        }
        BeduinSelectionGroupModel beduinSelectionGroupModel = (BeduinSelectionGroupModel) obj;
        return L.f(this.id, beduinSelectionGroupModel.id) && L.f(this.displayingPredicate, beduinSelectionGroupModel.displayingPredicate) && L.f(this.selectionType, beduinSelectionGroupModel.selectionType) && L.f(this.selectedIds, beduinSelectionGroupModel.selectedIds) && L.f(this.children, beduinSelectionGroupModel.children);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar) {
        ArrayList arrayListC = C28809e.c(lVar, this.children);
        BeduinSelectionGroupModel beduinSelectionGroupModelA = arrayListC.equals(this.children) ? this : null;
        if (beduinSelectionGroupModelA == null) {
            beduinSelectionGroupModelA = a(this, null, null, arrayListC, 15);
        }
        return (List) lVar.invoke(beduinSelectionGroupModelA);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final void forEach(@k Y41.l<? super BeduinModel, Boolean> lVar) {
        if (lVar.invoke(this).booleanValue()) {
            return;
        }
        C28809e.e(lVar, this.children);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.beduin.common.component.d
    @k
    public final List<BeduinModel> getInlinedModels() {
        return this.children;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (this.selectionType.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31;
        List<String> list = this.selectedIds;
        return this.children.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        return C28809e.f(this.children);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSelectionGroupModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", selectionType=");
        sb2.append(this.selectionType);
        sb2.append(", selectedIds=");
        sb2.append(this.selectedIds);
        sb2.append(", children=");
        return H.p(sb2, this.children, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        parcel.writeParcelable(this.selectionType, i12);
        parcel.writeStringList(this.selectedIds);
        Iterator itJ = C0.j(this.children, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
