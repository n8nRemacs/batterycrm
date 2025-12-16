package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ri.InterfaceC15043a;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComponentsGroupUpdateTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ComponentsGroupUpdateTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "LRi/a;", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/form/transforms/ComponentsGroupUpdateTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComponentsGroupUpdateTransform implements BeduinModelTransform, InterfaceC15043a {

    @k
    private final List<BeduinModel> children;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ComponentsGroupUpdateTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = ComponentsGroupUpdateTransform.class;

    @k
    private static final String type = "componentsGroupUpdate";

    /* compiled from: ComponentsGroupUpdateTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/ComponentsGroupUpdateTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.ComponentsGroupUpdateTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return ComponentsGroupUpdateTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return ComponentsGroupUpdateTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: ComponentsGroupUpdateTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ComponentsGroupUpdateTransform> {
        @Override // android.os.Parcelable.Creator
        public final ComponentsGroupUpdateTransform createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ComponentsGroupUpdateTransform.class, parcel, arrayList, iL2, 1);
            }
            return new ComponentsGroupUpdateTransform(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ComponentsGroupUpdateTransform[] newArray(int i12) {
            return new ComponentsGroupUpdateTransform[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentsGroupUpdateTransform(@k List<? extends BeduinModel> list) {
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComponentsGroupUpdateTransform copy$default(ComponentsGroupUpdateTransform componentsGroupUpdateTransform, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = componentsGroupUpdateTransform.children;
        }
        return componentsGroupUpdateTransform.copy(list);
    }

    @k
    public final List<BeduinModel> component1() {
        return this.children;
    }

    @k
    public final ComponentsGroupUpdateTransform copy(@k List<? extends BeduinModel> children) {
        return new ComponentsGroupUpdateTransform(children);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComponentsGroupUpdateTransform) && L.f(this.children, ((ComponentsGroupUpdateTransform) other).children);
    }

    @Override // Ri.InterfaceC15043a
    @k
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    public int hashCode() {
        return this.children.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("ComponentsGroupUpdateTransform(children="), this.children, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.children, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
