package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RightItemsUpdateTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/RightItemsUpdateTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "rightItems", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/form/transforms/RightItemsUpdateTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getRightItems", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RightItemsUpdateTransform implements BeduinModelTransform {

    @l
    private final List<NavigationBarItem> rightItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<RightItemsUpdateTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = RightItemsUpdateTransform.class;

    @k
    private static final String TYPE = "rightItemsUpdate";

    @k
    private static final String type = TYPE;

    /* compiled from: RightItemsUpdateTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/RightItemsUpdateTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.RightItemsUpdateTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return RightItemsUpdateTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return RightItemsUpdateTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: RightItemsUpdateTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RightItemsUpdateTransform> {
        @Override // android.os.Parcelable.Creator
        public final RightItemsUpdateTransform createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(RightItemsUpdateTransform.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new RightItemsUpdateTransform(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RightItemsUpdateTransform[] newArray(int i12) {
            return new RightItemsUpdateTransform[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RightItemsUpdateTransform(@l List<? extends NavigationBarItem> list) {
        this.rightItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RightItemsUpdateTransform copy$default(RightItemsUpdateTransform rightItemsUpdateTransform, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = rightItemsUpdateTransform.rightItems;
        }
        return rightItemsUpdateTransform.copy(list);
    }

    @l
    public final List<NavigationBarItem> component1() {
        return this.rightItems;
    }

    @k
    public final RightItemsUpdateTransform copy(@l List<? extends NavigationBarItem> rightItems) {
        return new RightItemsUpdateTransform(rightItems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RightItemsUpdateTransform) && L.f(this.rightItems, ((RightItemsUpdateTransform) other).rightItems);
    }

    @l
    public final List<NavigationBarItem> getRightItems() {
        return this.rightItems;
    }

    public int hashCode() {
        List<NavigationBarItem> list = this.rightItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("RightItemsUpdateTransform(rightItems="), this.rightItems, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<NavigationBarItem> list = this.rightItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
