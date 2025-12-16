package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChildrenAgesParameter.kt */
@d
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\rR\u0019\u0010*\u001a\u0004\u0018\u00010%8F¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0019\u0010-\u001a\u0004\u0018\u00010%8F¢\u0006\f\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010'R\u0019\u00102\u001a\u0004\u0018\u00010.8F¢\u0006\f\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ChildrenAgesParameter;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "id", "title", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/ChildrenAgesParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "getParameters", "Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getFromAgeParameter", "()Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getFromAgeParameter$annotations", "()V", "fromAgeParameter", "getToAgeParameter", "getToAgeParameter$annotations", "toAgeParameter", "Lcom/avito/android/remote/model/category_parameters/PriceParameter;", "getPriceParameter", "()Lcom/avito/android/remote/model/category_parameters/PriceParameter;", "getPriceParameter$annotations", "priceParameter", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ChildrenAgesParameter implements ParameterSlot {

    @k
    public static final String TYPE = "childrenAgesSelect";

    @c("id")
    @k
    private final String id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<ParameterSlot> parameters;

    @c("title")
    @l
    private final String title;

    @k
    public static final Parcelable.Creator<ChildrenAgesParameter> CREATOR = new Creator();

    /* compiled from: ChildrenAgesParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChildrenAgesParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChildrenAgesParameter createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(ChildrenAgesParameter.class, parcel, arrayList, iL2, 1);
            }
            return new ChildrenAgesParameter(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChildrenAgesParameter[] newArray(int i12) {
            return new ChildrenAgesParameter[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChildrenAgesParameter(@k String str, @l String str2, @k List<? extends ParameterSlot> list) {
        this.id = str;
        this.title = str2;
        this.parameters = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChildrenAgesParameter copy$default(ChildrenAgesParameter childrenAgesParameter, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = childrenAgesParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = childrenAgesParameter.title;
        }
        if ((i12 & 4) != 0) {
            list = childrenAgesParameter.parameters;
        }
        return childrenAgesParameter.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<ParameterSlot> component3() {
        return this.parameters;
    }

    @k
    public final ChildrenAgesParameter copy(@k String id2, @l String title, @k List<? extends ParameterSlot> parameters) {
        return new ChildrenAgesParameter(id2, title, parameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildrenAgesParameter)) {
            return false;
        }
        ChildrenAgesParameter childrenAgesParameter = (ChildrenAgesParameter) other;
        return L.f(this.id, childrenAgesParameter.id) && L.f(this.title, childrenAgesParameter.title) && L.f(this.parameters, childrenAgesParameter.parameters);
    }

    @l
    public final IntParameter getFromAgeParameter() {
        ParameterSlot parameterSlot = (ParameterSlot) C42745f0.K(0, this.parameters);
        if (parameterSlot == null) {
            return null;
        }
        if (!(parameterSlot instanceof IntParameter)) {
            parameterSlot = null;
        }
        return (IntParameter) parameterSlot;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final List<ParameterSlot> getParameters() {
        return this.parameters;
    }

    @l
    public final PriceParameter getPriceParameter() {
        ParameterSlot parameterSlot = (ParameterSlot) C42745f0.K(2, this.parameters);
        if (parameterSlot == null) {
            return null;
        }
        if (!(parameterSlot instanceof PriceParameter)) {
            parameterSlot = null;
        }
        return (PriceParameter) parameterSlot;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final IntParameter getToAgeParameter() {
        ParameterSlot parameterSlot = (ParameterSlot) C42745f0.K(1, this.parameters);
        if (parameterSlot == null) {
            return null;
        }
        if (!(parameterSlot instanceof IntParameter)) {
            parameterSlot = null;
        }
        return (IntParameter) parameterSlot;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        return this.parameters.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChildrenAgesParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.parameters, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }

    public static /* synthetic */ void getFromAgeParameter$annotations() {
    }

    public static /* synthetic */ void getPriceParameter$annotations() {
    }

    public static /* synthetic */ void getToAgeParameter$annotations() {
    }
}
