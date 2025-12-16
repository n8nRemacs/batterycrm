package com.avito.android.lib.design.master_plan_view;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MasterPlanPin.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006("}, d2 = {"Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;", "center", "name", "<init>", "(Ljava/lang/String;Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;Ljava/lang/String;)Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;", "getCenter", "getName", "Companion", "Center", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MasterPlanPin implements Parcelable {

    @com.google.gson.annotations.c("center")
    @k
    private final Center center;

    @com.google.gson.annotations.c("buildingId")
    @k
    private final String id;

    @com.google.gson.annotations.c("name")
    @l
    private final String name;

    @k
    public static final Parcelable.Creator<MasterPlanPin> CREATOR = new b();

    /* compiled from: MasterPlanPin.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;", "Landroid/os/Parcelable;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin$Center;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getX", "getY", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Center implements Parcelable {

        @k
        public static final Parcelable.Creator<Center> CREATOR = new a();
        private final float x;
        private final float y;

        /* compiled from: MasterPlanPin.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Center> {
            @Override // android.os.Parcelable.Creator
            public final Center createFromParcel(Parcel parcel) {
                return new Center(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Center[] newArray(int i12) {
                return new Center[i12];
            }
        }

        public Center(float f12, float f13) {
            this.x = f12;
            this.y = f13;
        }

        public static /* synthetic */ Center copy$default(Center center, float f12, float f13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = center.x;
            }
            if ((i12 & 2) != 0) {
                f13 = center.y;
            }
            return center.copy(f12, f13);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @k
        public final Center copy(float x12, float y12) {
            return new Center(x12, y12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Center)) {
                return false;
            }
            Center center = (Center) other;
            return Float.compare(this.x, center.x) == 0 && Float.compare(this.y, center.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Center(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            return r.k(')', this.y, sb2);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeFloat(this.x);
            parcel.writeFloat(this.y);
        }
    }

    /* compiled from: MasterPlanPin.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MasterPlanPin> {
        @Override // android.os.Parcelable.Creator
        public final MasterPlanPin createFromParcel(Parcel parcel) {
            return new MasterPlanPin(parcel.readString(), Center.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasterPlanPin[] newArray(int i12) {
            return new MasterPlanPin[i12];
        }
    }

    public MasterPlanPin(@k String str, @k Center center, @l String str2) {
        this.id = str;
        this.center = center;
        this.name = str2;
    }

    public static /* synthetic */ MasterPlanPin copy$default(MasterPlanPin masterPlanPin, String str, Center center, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = masterPlanPin.id;
        }
        if ((i12 & 2) != 0) {
            center = masterPlanPin.center;
        }
        if ((i12 & 4) != 0) {
            str2 = masterPlanPin.name;
        }
        return masterPlanPin.copy(str, center, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Center getCenter() {
        return this.center;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final MasterPlanPin copy(@k String id2, @k Center center, @l String name) {
        return new MasterPlanPin(id2, center, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MasterPlanPin)) {
            return false;
        }
        MasterPlanPin masterPlanPin = (MasterPlanPin) other;
        return L.f(this.id, masterPlanPin.id) && L.f(this.center, masterPlanPin.center) && L.f(this.name, masterPlanPin.name);
    }

    @k
    public final Center getCenter() {
        return this.center;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = (this.center.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MasterPlanPin(id=");
        sb2.append(this.id);
        sb2.append(", center=");
        sb2.append(this.center);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        this.center.writeToParcel(parcel, flags);
        parcel.writeString(this.name);
    }

    public /* synthetic */ MasterPlanPin(String str, Center center, String str2, int i12, C42822w c42822w) {
        this(str, center, (i12 & 4) != 0 ? null : str2);
    }
}
