package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.selectStringParameters.SelectItem;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectItemsTransform.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/SelectItemsTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;", "leftItem", "rightItem", "<init>", "(Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;)V", "Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;", "c", "()Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;", "d", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectItemsTransform implements BeduinModelTransform {

    @c("leftItem")
    @l
    private final SelectItem leftItem;

    @c("rightItem")
    @l
    private final SelectItem rightItem;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f103405b = new a(null);

    @k
    public static final Parcelable.Creator<SelectItemsTransform> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f103406c = "selectItems";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<SelectItemsTransform> f103407d = SelectItemsTransform.class;

    /* compiled from: SelectItemsTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/SelectItemsTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15365a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<SelectItemsTransform> a() {
            return SelectItemsTransform.f103407d;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return SelectItemsTransform.f103406c;
        }

        public a() {
        }
    }

    /* compiled from: SelectItemsTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SelectItemsTransform> {
        @Override // android.os.Parcelable.Creator
        public final SelectItemsTransform createFromParcel(Parcel parcel) {
            return new SelectItemsTransform(parcel.readInt() == 0 ? null : SelectItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelectItem.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItemsTransform[] newArray(int i12) {
            return new SelectItemsTransform[i12];
        }
    }

    public SelectItemsTransform(@l SelectItem selectItem, @l SelectItem selectItem2) {
        this.leftItem = selectItem;
        this.rightItem = selectItem2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final SelectItem getLeftItem() {
        return this.leftItem;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final SelectItem getRightItem() {
        return this.rightItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItemsTransform)) {
            return false;
        }
        SelectItemsTransform selectItemsTransform = (SelectItemsTransform) obj;
        return L.f(this.leftItem, selectItemsTransform.leftItem) && L.f(this.rightItem, selectItemsTransform.rightItem);
    }

    public final int hashCode() {
        SelectItem selectItem = this.leftItem;
        int iHashCode = (selectItem == null ? 0 : selectItem.hashCode()) * 31;
        SelectItem selectItem2 = this.rightItem;
        return iHashCode + (selectItem2 != null ? selectItem2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SelectItemsTransform(leftItem=" + this.leftItem + ", rightItem=" + this.rightItem + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        SelectItem selectItem = this.leftItem;
        if (selectItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectItem.writeToParcel(parcel, i12);
        }
        SelectItem selectItem2 = this.rightItem;
        if (selectItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectItem2.writeToParcel(parcel, i12);
        }
    }
}
