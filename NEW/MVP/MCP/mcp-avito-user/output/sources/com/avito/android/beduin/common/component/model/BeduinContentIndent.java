package com.avito.android.beduin.common.component.model;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinScreenSettings.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinContentIndent;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "topComponents", "mainComponents", "bottomComponents", "<init>", "(Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;)V", "component1", "()Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "component2", "component3", "copy", "(Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;)Lcom/avito/android/beduin/common/component/model/BeduinContentIndent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "getTopComponents", "getMainComponents", "getBottomComponents", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinContentIndent implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinContentIndent> CREATOR = new a();

    @l
    private final BeduinHorizontalIndent bottomComponents;

    @l
    private final BeduinHorizontalIndent mainComponents;

    @l
    private final BeduinHorizontalIndent topComponents;

    /* compiled from: BeduinScreenSettings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinContentIndent> {
        @Override // android.os.Parcelable.Creator
        public final BeduinContentIndent createFromParcel(Parcel parcel) {
            return new BeduinContentIndent((BeduinHorizontalIndent) parcel.readParcelable(BeduinContentIndent.class.getClassLoader()), (BeduinHorizontalIndent) parcel.readParcelable(BeduinContentIndent.class.getClassLoader()), (BeduinHorizontalIndent) parcel.readParcelable(BeduinContentIndent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinContentIndent[] newArray(int i12) {
            return new BeduinContentIndent[i12];
        }
    }

    public BeduinContentIndent(@l BeduinHorizontalIndent beduinHorizontalIndent, @l BeduinHorizontalIndent beduinHorizontalIndent2, @l BeduinHorizontalIndent beduinHorizontalIndent3) {
        this.topComponents = beduinHorizontalIndent;
        this.mainComponents = beduinHorizontalIndent2;
        this.bottomComponents = beduinHorizontalIndent3;
    }

    public static /* synthetic */ BeduinContentIndent copy$default(BeduinContentIndent beduinContentIndent, BeduinHorizontalIndent beduinHorizontalIndent, BeduinHorizontalIndent beduinHorizontalIndent2, BeduinHorizontalIndent beduinHorizontalIndent3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinHorizontalIndent = beduinContentIndent.topComponents;
        }
        if ((i12 & 2) != 0) {
            beduinHorizontalIndent2 = beduinContentIndent.mainComponents;
        }
        if ((i12 & 4) != 0) {
            beduinHorizontalIndent3 = beduinContentIndent.bottomComponents;
        }
        return beduinContentIndent.copy(beduinHorizontalIndent, beduinHorizontalIndent2, beduinHorizontalIndent3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BeduinHorizontalIndent getTopComponents() {
        return this.topComponents;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinHorizontalIndent getMainComponents() {
        return this.mainComponents;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinHorizontalIndent getBottomComponents() {
        return this.bottomComponents;
    }

    @k
    public final BeduinContentIndent copy(@l BeduinHorizontalIndent topComponents, @l BeduinHorizontalIndent mainComponents, @l BeduinHorizontalIndent bottomComponents) {
        return new BeduinContentIndent(topComponents, mainComponents, bottomComponents);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinContentIndent)) {
            return false;
        }
        BeduinContentIndent beduinContentIndent = (BeduinContentIndent) other;
        return L.f(this.topComponents, beduinContentIndent.topComponents) && L.f(this.mainComponents, beduinContentIndent.mainComponents) && L.f(this.bottomComponents, beduinContentIndent.bottomComponents);
    }

    @l
    public final BeduinHorizontalIndent getBottomComponents() {
        return this.bottomComponents;
    }

    @l
    public final BeduinHorizontalIndent getMainComponents() {
        return this.mainComponents;
    }

    @l
    public final BeduinHorizontalIndent getTopComponents() {
        return this.topComponents;
    }

    public int hashCode() {
        BeduinHorizontalIndent beduinHorizontalIndent = this.topComponents;
        int iHashCode = (beduinHorizontalIndent == null ? 0 : beduinHorizontalIndent.hashCode()) * 31;
        BeduinHorizontalIndent beduinHorizontalIndent2 = this.mainComponents;
        int iHashCode2 = (iHashCode + (beduinHorizontalIndent2 == null ? 0 : beduinHorizontalIndent2.hashCode())) * 31;
        BeduinHorizontalIndent beduinHorizontalIndent3 = this.bottomComponents;
        return iHashCode2 + (beduinHorizontalIndent3 != null ? beduinHorizontalIndent3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinContentIndent(topComponents=" + this.topComponents + ", mainComponents=" + this.mainComponents + ", bottomComponents=" + this.bottomComponents + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.topComponents, flags);
        parcel.writeParcelable(this.mainComponents, flags);
        parcel.writeParcelable(this.bottomComponents, flags);
    }
}
