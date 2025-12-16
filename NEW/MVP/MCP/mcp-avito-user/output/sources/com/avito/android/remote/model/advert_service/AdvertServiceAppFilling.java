package com.avito.android.remote.model.advert_service;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertServiceAppFilling.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "button", "Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;", "description", "<init>", "(Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;)V", "component1", "()Lcom/avito/android/remote/model/SimpleAdvertAction;", "component2", "()Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;", "copy", "(Lcom/avito/android/remote/model/SimpleAdvertAction;Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;)Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "getButton", "Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;", "getDescription", "AdvertServiceAppFillingDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertServiceAppFilling implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertServiceAppFilling> CREATOR = new Creator();

    @c("button")
    @l
    private final SimpleAdvertAction button;

    @c("description")
    @l
    private final AdvertServiceAppFillingDescription description;

    /* compiled from: AdvertServiceAppFilling.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;", "Landroid/os/Parcelable;", "", "title", "", "advantages", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/advert_service/AdvertServiceAppFilling$AdvertServiceAppFillingDescription;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getAdvantages", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertServiceAppFillingDescription implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertServiceAppFillingDescription> CREATOR = new Creator();

        @c("advantages")
        @l
        private final List<String> advantages;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertServiceAppFilling.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdvertServiceAppFillingDescription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertServiceAppFillingDescription createFromParcel(@k Parcel parcel) {
                return new AdvertServiceAppFillingDescription(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertServiceAppFillingDescription[] newArray(int i12) {
                return new AdvertServiceAppFillingDescription[i12];
            }
        }

        public AdvertServiceAppFillingDescription() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdvertServiceAppFillingDescription copy$default(AdvertServiceAppFillingDescription advertServiceAppFillingDescription, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = advertServiceAppFillingDescription.title;
            }
            if ((i12 & 2) != 0) {
                list = advertServiceAppFillingDescription.advantages;
            }
            return advertServiceAppFillingDescription.copy(str, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        public final List<String> component2() {
            return this.advantages;
        }

        @k
        public final AdvertServiceAppFillingDescription copy(@l String title, @l List<String> advantages) {
            return new AdvertServiceAppFillingDescription(title, advantages);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvertServiceAppFillingDescription)) {
                return false;
            }
            AdvertServiceAppFillingDescription advertServiceAppFillingDescription = (AdvertServiceAppFillingDescription) other;
            return L.f(this.title, advertServiceAppFillingDescription.title) && L.f(this.advantages, advertServiceAppFillingDescription.advantages);
        }

        @l
        public final List<String> getAdvantages() {
            return this.advantages;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.advantages;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertServiceAppFillingDescription(title=");
            sb2.append(this.title);
            sb2.append(", advantages=");
            return H.p(sb2, this.advantages, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeStringList(this.advantages);
        }

        public AdvertServiceAppFillingDescription(@l String str, @l List<String> list) {
            this.title = str;
            this.advantages = list;
        }

        public AdvertServiceAppFillingDescription(String str, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: AdvertServiceAppFilling.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertServiceAppFilling> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertServiceAppFilling createFromParcel(@k Parcel parcel) {
            return new AdvertServiceAppFilling(parcel.readInt() == 0 ? null : SimpleAdvertAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdvertServiceAppFillingDescription.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertServiceAppFilling[] newArray(int i12) {
            return new AdvertServiceAppFilling[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertServiceAppFilling() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvertServiceAppFilling copy$default(AdvertServiceAppFilling advertServiceAppFilling, SimpleAdvertAction simpleAdvertAction, AdvertServiceAppFillingDescription advertServiceAppFillingDescription, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            simpleAdvertAction = advertServiceAppFilling.button;
        }
        if ((i12 & 2) != 0) {
            advertServiceAppFillingDescription = advertServiceAppFilling.description;
        }
        return advertServiceAppFilling.copy(simpleAdvertAction, advertServiceAppFillingDescription);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final SimpleAdvertAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AdvertServiceAppFillingDescription getDescription() {
        return this.description;
    }

    @k
    public final AdvertServiceAppFilling copy(@l SimpleAdvertAction button, @l AdvertServiceAppFillingDescription description) {
        return new AdvertServiceAppFilling(button, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertServiceAppFilling)) {
            return false;
        }
        AdvertServiceAppFilling advertServiceAppFilling = (AdvertServiceAppFilling) other;
        return L.f(this.button, advertServiceAppFilling.button) && L.f(this.description, advertServiceAppFilling.description);
    }

    @l
    public final SimpleAdvertAction getButton() {
        return this.button;
    }

    @l
    public final AdvertServiceAppFillingDescription getDescription() {
        return this.description;
    }

    public int hashCode() {
        SimpleAdvertAction simpleAdvertAction = this.button;
        int iHashCode = (simpleAdvertAction == null ? 0 : simpleAdvertAction.hashCode()) * 31;
        AdvertServiceAppFillingDescription advertServiceAppFillingDescription = this.description;
        return iHashCode + (advertServiceAppFillingDescription != null ? advertServiceAppFillingDescription.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertServiceAppFilling(button=" + this.button + ", description=" + this.description + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SimpleAdvertAction simpleAdvertAction = this.button;
        if (simpleAdvertAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleAdvertAction.writeToParcel(parcel, flags);
        }
        AdvertServiceAppFillingDescription advertServiceAppFillingDescription = this.description;
        if (advertServiceAppFillingDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertServiceAppFillingDescription.writeToParcel(parcel, flags);
        }
    }

    public AdvertServiceAppFilling(@l SimpleAdvertAction simpleAdvertAction, @l AdvertServiceAppFillingDescription advertServiceAppFillingDescription) {
        this.button = simpleAdvertAction;
        this.description = advertServiceAppFillingDescription;
    }

    public /* synthetic */ AdvertServiceAppFilling(SimpleAdvertAction simpleAdvertAction, AdvertServiceAppFillingDescription advertServiceAppFillingDescription, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : simpleAdvertAction, (i12 & 2) != 0 ? null : advertServiceAppFillingDescription);
    }
}
