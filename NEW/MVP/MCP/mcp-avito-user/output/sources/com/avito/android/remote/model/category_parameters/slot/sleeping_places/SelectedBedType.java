package com.avito.android.remote.model.category_parameters.slot.sleeping_places;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedTypeState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedType;", "Landroid/os/Parcelable;", "", "id", DeliverySubsidiesSlotKt.AMOUNT, "", "stringId", "title", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", VoiceInfo.STATE, "<init>", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;)V", "component1", "()Ljava/lang/Integer;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "copy", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;)Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedType;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getId", "I", "getAmount", "setAmount", "(I)V", "Ljava/lang/String;", "getStringId", "getTitle", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SelectedBedTypeState;", "getState", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectedBedType implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedBedType> CREATOR = new Creator();

    @c("bedTypeAmount")
    private int amount;

    @c("bedTypeId")
    @l
    private final Integer id;

    @k
    private final transient SelectedBedTypeState state;

    @k
    private final transient String stringId;

    @l
    private final transient String title;

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedBedType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectedBedType createFromParcel(@k Parcel parcel) {
            return new SelectedBedType(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readString(), parcel.readString(), (SelectedBedTypeState) parcel.readParcelable(SelectedBedType.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectedBedType[] newArray(int i12) {
            return new SelectedBedType[i12];
        }
    }

    public SelectedBedType() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ SelectedBedType copy$default(SelectedBedType selectedBedType, Integer num, int i12, String str, String str2, SelectedBedTypeState selectedBedTypeState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = selectedBedType.id;
        }
        if ((i13 & 2) != 0) {
            i12 = selectedBedType.amount;
        }
        int i14 = i12;
        if ((i13 & 4) != 0) {
            str = selectedBedType.stringId;
        }
        String str3 = str;
        if ((i13 & 8) != 0) {
            str2 = selectedBedType.title;
        }
        String str4 = str2;
        if ((i13 & 16) != 0) {
            selectedBedTypeState = selectedBedType.state;
        }
        return selectedBedType.copy(num, i14, str3, str4, selectedBedTypeState);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getStringId() {
        return this.stringId;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final SelectedBedTypeState getState() {
        return this.state;
    }

    @k
    public final SelectedBedType copy(@l Integer id2, int amount, @k String stringId, @l String title, @k SelectedBedTypeState state) {
        return new SelectedBedType(id2, amount, stringId, title, state);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedBedType)) {
            return false;
        }
        SelectedBedType selectedBedType = (SelectedBedType) other;
        return L.f(this.id, selectedBedType.id) && this.amount == selectedBedType.amount && L.f(this.stringId, selectedBedType.stringId) && L.f(this.title, selectedBedType.title) && L.f(this.state, selectedBedType.state);
    }

    public final int getAmount() {
        return this.amount;
    }

    @l
    public final Integer getId() {
        return this.id;
    }

    @k
    public final SelectedBedTypeState getState() {
        return this.state;
    }

    @k
    public final String getStringId() {
        return this.stringId;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.id;
        int iD2 = H.d(r.e(this.amount, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.stringId);
        String str = this.title;
        return this.state.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setAmount(int i12) {
        this.amount = i12;
    }

    @k
    public String toString() {
        return "SelectedBedType(id=" + this.id + ", amount=" + this.amount + ", stringId=" + this.stringId + ", title=" + this.title + ", state=" + this.state + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeInt(this.amount);
        parcel.writeString(this.stringId);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.state, flags);
    }

    public SelectedBedType(@l Integer num, int i12, @k String str, @l String str2, @k SelectedBedTypeState selectedBedTypeState) {
        this.id = num;
        this.amount = i12;
        this.stringId = str;
        this.title = str2;
        this.state = selectedBedTypeState;
    }

    public /* synthetic */ SelectedBedType(Integer num, int i12, String str, String str2, SelectedBedTypeState selectedBedTypeState, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? UUID.randomUUID().toString() : str, (i13 & 8) == 0 ? str2 : null, (i13 & 16) != 0 ? SelectedBedTypeState.Normal.INSTANCE : selectedBedTypeState);
    }
}
