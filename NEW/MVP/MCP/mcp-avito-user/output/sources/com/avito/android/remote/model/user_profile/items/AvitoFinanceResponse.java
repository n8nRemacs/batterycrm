package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItem.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u000e¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/user_profile/items/State;", VoiceInfo.STATE, "", "Lcom/avito/android/remote/model/user_profile/items/Account;", "accounts", "Lcom/avito/android/remote/model/user_profile/items/Feature;", "features", "<init>", "(Lcom/avito/android/remote/model/user_profile/items/State;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/user_profile/items/State;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/avito/android/remote/model/user_profile/items/State;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_profile/items/State;", "getState", "Ljava/util/List;", "getAccounts", "getFeatures", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoFinanceResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceResponse> CREATOR = new Creator();

    @c("accounts")
    @l
    private final List<Account> accounts;

    @c("features")
    @l
    private final List<Feature> features;

    @c(VoiceInfo.STATE)
    @l
    private final State state;

    /* compiled from: AvitoFinanceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoFinanceResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            State stateValueOf = parcel.readInt() == 0 ? null : State.valueOf(parcel.readString());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Account.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(Feature.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new AvitoFinanceResponse(stateValueOf, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceResponse[] newArray(int i12) {
            return new AvitoFinanceResponse[i12];
        }
    }

    public AvitoFinanceResponse(@l State state, @l List<Account> list, @l List<Feature> list2) {
        this.state = state;
        this.accounts = list;
        this.features = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvitoFinanceResponse copy$default(AvitoFinanceResponse avitoFinanceResponse, State state, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            state = avitoFinanceResponse.state;
        }
        if ((i12 & 2) != 0) {
            list = avitoFinanceResponse.accounts;
        }
        if ((i12 & 4) != 0) {
            list2 = avitoFinanceResponse.features;
        }
        return avitoFinanceResponse.copy(state, list, list2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @l
    public final List<Account> component2() {
        return this.accounts;
    }

    @l
    public final List<Feature> component3() {
        return this.features;
    }

    @k
    public final AvitoFinanceResponse copy(@l State state, @l List<Account> accounts, @l List<Feature> features) {
        return new AvitoFinanceResponse(state, accounts, features);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoFinanceResponse)) {
            return false;
        }
        AvitoFinanceResponse avitoFinanceResponse = (AvitoFinanceResponse) other;
        return this.state == avitoFinanceResponse.state && L.f(this.accounts, avitoFinanceResponse.accounts) && L.f(this.features, avitoFinanceResponse.features);
    }

    @l
    public final List<Account> getAccounts() {
        return this.accounts;
    }

    @l
    public final List<Feature> getFeatures() {
        return this.features;
    }

    @l
    public final State getState() {
        return this.state;
    }

    public int hashCode() {
        State state = this.state;
        int iHashCode = (state == null ? 0 : state.hashCode()) * 31;
        List<Account> list = this.accounts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Feature> list2 = this.features;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceResponse(state=");
        sb2.append(this.state);
        sb2.append(", accounts=");
        sb2.append(this.accounts);
        sb2.append(", features=");
        return H.p(sb2, this.features, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        State state = this.state;
        if (state == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(state.name());
        }
        List<Account> list = this.accounts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Account) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<Feature> list2 = this.features;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((Feature) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
