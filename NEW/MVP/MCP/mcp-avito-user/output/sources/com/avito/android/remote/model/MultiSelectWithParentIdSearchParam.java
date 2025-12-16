package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiSelectWithParentIdSearchParam.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/MultiSelectWithParentIdSearchParam;", "Lcom/avito/android/remote/model/SearchParam;", "", "Lcom/avito/android/remote/model/MultiSelectWithAttrIdValue;", "value", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/MultiSelectWithParentIdSearchParam;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MultiSelectWithParentIdSearchParam extends SearchParam<List<? extends MultiSelectWithAttrIdValue>> {

    @k
    public static final Parcelable.Creator<MultiSelectWithParentIdSearchParam> CREATOR = new Creator();

    @k
    private final List<MultiSelectWithAttrIdValue> value;

    /* compiled from: MultiSelectWithParentIdSearchParam.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiSelectWithParentIdSearchParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiSelectWithParentIdSearchParam createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(MultiSelectWithAttrIdValue.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MultiSelectWithParentIdSearchParam(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiSelectWithParentIdSearchParam[] newArray(int i12) {
            return new MultiSelectWithParentIdSearchParam[i12];
        }
    }

    public MultiSelectWithParentIdSearchParam(@k List<MultiSelectWithAttrIdValue> list) {
        this.value = list;
        if (getValue().isEmpty()) {
            throw new IllegalArgumentException("List of values cannot be empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSelectWithParentIdSearchParam copy$default(MultiSelectWithParentIdSearchParam multiSelectWithParentIdSearchParam, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = multiSelectWithParentIdSearchParam.value;
        }
        return multiSelectWithParentIdSearchParam.copy(list);
    }

    @k
    public final List<MultiSelectWithAttrIdValue> component1() {
        return this.value;
    }

    @k
    public final MultiSelectWithParentIdSearchParam copy(@k List<MultiSelectWithAttrIdValue> value) {
        return new MultiSelectWithParentIdSearchParam(value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MultiSelectWithParentIdSearchParam) && L.f(this.value, ((MultiSelectWithParentIdSearchParam) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("MultiSelectWithParentIdSearchParam(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.value, parcel);
        while (itJ.hasNext()) {
            ((MultiSelectWithAttrIdValue) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.SearchParam
    @k
    public List<? extends MultiSelectWithAttrIdValue> getValue() {
        return this.value;
    }
}
