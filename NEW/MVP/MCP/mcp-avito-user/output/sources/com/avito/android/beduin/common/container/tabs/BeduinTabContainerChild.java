package com.avito.android.beduin.common.container.tabs;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTabContainerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerChild;", "Landroid/os/Parcelable;", "", "id", "title", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "counter", "Lcom/avito/android/beduin_models/BeduinModel;", "child", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;Lcom/avito/android/beduin_models/BeduinModel;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "component4", "()Lcom/avito/android/beduin_models/BeduinModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;Lcom/avito/android/beduin_models/BeduinModel;)Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerChild;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "getCounter", "Lcom/avito/android/beduin_models/BeduinModel;", "getChild", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTabContainerChild implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinTabContainerChild> CREATOR = new a();

    @k
    private final BeduinModel child;

    @l
    private final BeduinTabCounter counter;

    @k
    private final String id;

    @k
    private final String title;

    /* compiled from: BeduinTabContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTabContainerChild> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTabContainerChild createFromParcel(Parcel parcel) {
            return new BeduinTabContainerChild(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BeduinTabCounter.CREATOR.createFromParcel(parcel), (BeduinModel) parcel.readParcelable(BeduinTabContainerChild.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTabContainerChild[] newArray(int i12) {
            return new BeduinTabContainerChild[i12];
        }
    }

    public BeduinTabContainerChild(@k String str, @k String str2, @l BeduinTabCounter beduinTabCounter, @k BeduinModel beduinModel) {
        this.id = str;
        this.title = str2;
        this.counter = beduinTabCounter;
        this.child = beduinModel;
    }

    public static /* synthetic */ BeduinTabContainerChild copy$default(BeduinTabContainerChild beduinTabContainerChild, String str, String str2, BeduinTabCounter beduinTabCounter, BeduinModel beduinModel, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinTabContainerChild.id;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinTabContainerChild.title;
        }
        if ((i12 & 4) != 0) {
            beduinTabCounter = beduinTabContainerChild.counter;
        }
        if ((i12 & 8) != 0) {
            beduinModel = beduinTabContainerChild.child;
        }
        return beduinTabContainerChild.copy(str, str2, beduinTabCounter, beduinModel);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinTabCounter getCounter() {
        return this.counter;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final BeduinModel getChild() {
        return this.child;
    }

    @k
    public final BeduinTabContainerChild copy(@k String id2, @k String title, @l BeduinTabCounter counter, @k BeduinModel child) {
        return new BeduinTabContainerChild(id2, title, counter, child);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTabContainerChild)) {
            return false;
        }
        BeduinTabContainerChild beduinTabContainerChild = (BeduinTabContainerChild) other;
        return L.f(this.id, beduinTabContainerChild.id) && L.f(this.title, beduinTabContainerChild.title) && L.f(this.counter, beduinTabContainerChild.counter) && L.f(this.child, beduinTabContainerChild.child);
    }

    @k
    public final BeduinModel getChild() {
        return this.child;
    }

    @l
    public final BeduinTabCounter getCounter() {
        return this.counter;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        BeduinTabCounter beduinTabCounter = this.counter;
        return this.child.hashCode() + ((iD2 + (beduinTabCounter == null ? 0 : beduinTabCounter.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "BeduinTabContainerChild(id=" + this.id + ", title=" + this.title + ", counter=" + this.counter + ", child=" + this.child + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        BeduinTabCounter beduinTabCounter = this.counter;
        if (beduinTabCounter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinTabCounter.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.child, flags);
    }
}
