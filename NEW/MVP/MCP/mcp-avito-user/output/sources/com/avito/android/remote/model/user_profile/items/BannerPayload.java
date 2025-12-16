package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealItem.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/BannerPayload;", "Landroid/os/Parcelable;", "", "id", "position", "page", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/user_profile/items/BannerPayload;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getPosition", "getPage", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BannerPayload implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerPayload> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("page")
    @k
    private final String page;

    @c("position")
    @k
    private final String position;

    /* compiled from: ComfortableDealItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BannerPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerPayload createFromParcel(@k Parcel parcel) {
            return new BannerPayload(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerPayload[] newArray(int i12) {
            return new BannerPayload[i12];
        }
    }

    public BannerPayload(@k String str, @k String str2, @k String str3) {
        this.id = str;
        this.position = str2;
        this.page = str3;
    }

    public static /* synthetic */ BannerPayload copy$default(BannerPayload bannerPayload, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bannerPayload.id;
        }
        if ((i12 & 2) != 0) {
            str2 = bannerPayload.position;
        }
        if ((i12 & 4) != 0) {
            str3 = bannerPayload.page;
        }
        return bannerPayload.copy(str, str2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    @k
    public final BannerPayload copy(@k String id2, @k String position, @k String page) {
        return new BannerPayload(id2, position, page);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerPayload)) {
            return false;
        }
        BannerPayload bannerPayload = (BannerPayload) other;
        return L.f(this.id, bannerPayload.id) && L.f(this.position, bannerPayload.position) && L.f(this.page, bannerPayload.page);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getPage() {
        return this.page;
    }

    @k
    public final String getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.page.hashCode() + H.d(this.id.hashCode() * 31, 31, this.position);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BannerPayload(id=");
        sb2.append(this.id);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", page=");
        return C22026a.c(sb2, this.page, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.position);
        parcel.writeString(this.page);
    }
}
