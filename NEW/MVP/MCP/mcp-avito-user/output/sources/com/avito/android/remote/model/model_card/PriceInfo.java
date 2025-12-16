package com.avito.android.remote.model.model_card;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceInfo.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/model_card/PriceInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/model_card/LinkInfo;", "linkInfo", "", "title", "", "entities", "<init>", "(Lcom/avito/android/remote/model/model_card/LinkInfo;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/model_card/LinkInfo;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/model_card/LinkInfo;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/model_card/PriceInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/model_card/LinkInfo;", "getLinkInfo", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getEntities", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceInfo> CREATOR = new Creator();

    @c("entities")
    @l
    private final List<String> entities;

    @c("linkInfo")
    @l
    private final LinkInfo linkInfo;

    @c("title")
    @l
    private final String title;

    /* compiled from: PriceInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceInfo createFromParcel(@k Parcel parcel) {
            return new PriceInfo(parcel.readInt() == 0 ? null : LinkInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceInfo[] newArray(int i12) {
            return new PriceInfo[i12];
        }
    }

    public PriceInfo(@l LinkInfo linkInfo, @l String str, @l List<String> list) {
        this.linkInfo = linkInfo;
        this.title = str;
        this.entities = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceInfo copy$default(PriceInfo priceInfo, LinkInfo linkInfo, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            linkInfo = priceInfo.linkInfo;
        }
        if ((i12 & 2) != 0) {
            str = priceInfo.title;
        }
        if ((i12 & 4) != 0) {
            list = priceInfo.entities;
        }
        return priceInfo.copy(linkInfo, str, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<String> component3() {
        return this.entities;
    }

    @k
    public final PriceInfo copy(@l LinkInfo linkInfo, @l String title, @l List<String> entities) {
        return new PriceInfo(linkInfo, title, entities);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceInfo)) {
            return false;
        }
        PriceInfo priceInfo = (PriceInfo) other;
        return L.f(this.linkInfo, priceInfo.linkInfo) && L.f(this.title, priceInfo.title) && L.f(this.entities, priceInfo.entities);
    }

    @l
    public final List<String> getEntities() {
        return this.entities;
    }

    @l
    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        LinkInfo linkInfo = this.linkInfo;
        int iHashCode = (linkInfo == null ? 0 : linkInfo.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.entities;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PriceInfo(linkInfo=");
        sb2.append(this.linkInfo);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", entities=");
        return H.p(sb2, this.entities, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        LinkInfo linkInfo = this.linkInfo;
        if (linkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInfo.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeStringList(this.entities);
    }
}
