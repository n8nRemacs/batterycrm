package com.avito.android.remote.model.gig;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShifts.kt */
@d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/gig/GigSeller;", "Landroid/os/Parcelable;", "", "name", "", "count", "Lcom/avito/android/remote/model/gig/GigAvatar;", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/gig/GigAvatar;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/remote/model/gig/GigAvatar;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/gig/GigAvatar;)Lcom/avito/android/remote/model/gig/GigSeller;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getCount", "Lcom/avito/android/remote/model/gig/GigAvatar;", "getAvatar", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GigSeller implements Parcelable {

    @k
    public static final Parcelable.Creator<GigSeller> CREATOR = new Creator();

    @c("avatar")
    @k
    private final GigAvatar avatar;

    @c("availableShiftCount")
    @l
    private final Integer count;

    @c("name")
    @k
    private final String name;

    /* compiled from: GigShifts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GigSeller> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigSeller createFromParcel(@k Parcel parcel) {
            return new GigSeller(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), GigAvatar.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigSeller[] newArray(int i12) {
            return new GigSeller[i12];
        }
    }

    public GigSeller(@k String str, @l Integer num, @k GigAvatar gigAvatar) {
        this.name = str;
        this.count = num;
        this.avatar = gigAvatar;
    }

    public static /* synthetic */ GigSeller copy$default(GigSeller gigSeller, String str, Integer num, GigAvatar gigAvatar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gigSeller.name;
        }
        if ((i12 & 2) != 0) {
            num = gigSeller.count;
        }
        if ((i12 & 4) != 0) {
            gigAvatar = gigSeller.avatar;
        }
        return gigSeller.copy(str, num, gigAvatar);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final GigAvatar getAvatar() {
        return this.avatar;
    }

    @k
    public final GigSeller copy(@k String name, @l Integer count, @k GigAvatar avatar) {
        return new GigSeller(name, count, avatar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GigSeller)) {
            return false;
        }
        GigSeller gigSeller = (GigSeller) other;
        return L.f(this.name, gigSeller.name) && L.f(this.count, gigSeller.count) && L.f(this.avatar, gigSeller.avatar);
    }

    @k
    public final GigAvatar getAvatar() {
        return this.avatar;
    }

    @l
    public final Integer getCount() {
        return this.count;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Integer num = this.count;
        return this.avatar.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "GigSeller(name=" + this.name + ", count=" + this.count + ", avatar=" + this.avatar + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        this.avatar.writeToParcel(parcel, flags);
    }
}
