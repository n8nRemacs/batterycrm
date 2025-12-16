package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsBlock.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0011R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0015¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertDetailsBlockId;", "id", "", "offset", "addHeadingSeparatorWithOffset", "addTrailingSeparatorWithOffset", "", "", "Lcom/avito/android/remote/model/RawParams;", "rawParams", "<init>", "(Lcom/avito/android/remote/model/AdvertDetailsBlockId;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/remote/model/AdvertDetailsBlockId;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/remote/model/AdvertDetailsBlockId;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lcom/avito/android/remote/model/AdvertDetailsBlock;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertDetailsBlockId;", "getId", "Ljava/lang/Integer;", "getOffset", "getAddHeadingSeparatorWithOffset", "getAddTrailingSeparatorWithOffset", "Ljava/util/Map;", "getRawParams", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsBlock> CREATOR = new Creator();

    @c("addHeadingSeparatorWithOffset")
    @l
    private final Integer addHeadingSeparatorWithOffset;

    @c("addTrailingSeparatorWithOffset")
    @l
    private final Integer addTrailingSeparatorWithOffset;

    @c("id")
    @l
    private final AdvertDetailsBlockId id;

    @c("offset")
    @l
    private final Integer offset;

    @c("rawParams")
    @l
    private final Map<String, RawParams> rawParams;

    /* compiled from: AdvertDetailsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsBlock createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap = null;
            AdvertDetailsBlockId advertDetailsBlockIdValueOf = parcel.readInt() == 0 ? null : AdvertDetailsBlockId.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = f.c(AdvertDetailsBlock.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            return new AdvertDetailsBlock(advertDetailsBlockIdValueOf, numValueOf, numValueOf2, numValueOf3, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsBlock[] newArray(int i12) {
            return new AdvertDetailsBlock[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertDetailsBlock(@l AdvertDetailsBlockId advertDetailsBlockId, @l Integer num, @l Integer num2, @l Integer num3, @l Map<String, ? extends RawParams> map) {
        this.id = advertDetailsBlockId;
        this.offset = num;
        this.addHeadingSeparatorWithOffset = num2;
        this.addTrailingSeparatorWithOffset = num3;
        this.rawParams = map;
    }

    public static /* synthetic */ AdvertDetailsBlock copy$default(AdvertDetailsBlock advertDetailsBlock, AdvertDetailsBlockId advertDetailsBlockId, Integer num, Integer num2, Integer num3, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            advertDetailsBlockId = advertDetailsBlock.id;
        }
        if ((i12 & 2) != 0) {
            num = advertDetailsBlock.offset;
        }
        Integer num4 = num;
        if ((i12 & 4) != 0) {
            num2 = advertDetailsBlock.addHeadingSeparatorWithOffset;
        }
        Integer num5 = num2;
        if ((i12 & 8) != 0) {
            num3 = advertDetailsBlock.addTrailingSeparatorWithOffset;
        }
        Integer num6 = num3;
        if ((i12 & 16) != 0) {
            map = advertDetailsBlock.rawParams;
        }
        return advertDetailsBlock.copy(advertDetailsBlockId, num4, num5, num6, map);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AdvertDetailsBlockId getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getAddHeadingSeparatorWithOffset() {
        return this.addHeadingSeparatorWithOffset;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getAddTrailingSeparatorWithOffset() {
        return this.addTrailingSeparatorWithOffset;
    }

    @l
    public final Map<String, RawParams> component5() {
        return this.rawParams;
    }

    @k
    public final AdvertDetailsBlock copy(@l AdvertDetailsBlockId id2, @l Integer offset, @l Integer addHeadingSeparatorWithOffset, @l Integer addTrailingSeparatorWithOffset, @l Map<String, ? extends RawParams> rawParams) {
        return new AdvertDetailsBlock(id2, offset, addHeadingSeparatorWithOffset, addTrailingSeparatorWithOffset, rawParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsBlock)) {
            return false;
        }
        AdvertDetailsBlock advertDetailsBlock = (AdvertDetailsBlock) other;
        return this.id == advertDetailsBlock.id && L.f(this.offset, advertDetailsBlock.offset) && L.f(this.addHeadingSeparatorWithOffset, advertDetailsBlock.addHeadingSeparatorWithOffset) && L.f(this.addTrailingSeparatorWithOffset, advertDetailsBlock.addTrailingSeparatorWithOffset) && L.f(this.rawParams, advertDetailsBlock.rawParams);
    }

    @l
    public final Integer getAddHeadingSeparatorWithOffset() {
        return this.addHeadingSeparatorWithOffset;
    }

    @l
    public final Integer getAddTrailingSeparatorWithOffset() {
        return this.addTrailingSeparatorWithOffset;
    }

    @l
    public final AdvertDetailsBlockId getId() {
        return this.id;
    }

    @l
    public final Integer getOffset() {
        return this.offset;
    }

    @l
    public final Map<String, RawParams> getRawParams() {
        return this.rawParams;
    }

    public int hashCode() {
        AdvertDetailsBlockId advertDetailsBlockId = this.id;
        int iHashCode = (advertDetailsBlockId == null ? 0 : advertDetailsBlockId.hashCode()) * 31;
        Integer num = this.offset;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.addHeadingSeparatorWithOffset;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.addTrailingSeparatorWithOffset;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map<String, RawParams> map = this.rawParams;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsBlock(id=");
        sb2.append(this.id);
        sb2.append(", offset=");
        sb2.append(this.offset);
        sb2.append(", addHeadingSeparatorWithOffset=");
        sb2.append(this.addHeadingSeparatorWithOffset);
        sb2.append(", addTrailingSeparatorWithOffset=");
        sb2.append(this.addTrailingSeparatorWithOffset);
        sb2.append(", rawParams=");
        return r.w(sb2, this.rawParams, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AdvertDetailsBlockId advertDetailsBlockId = this.id;
        if (advertDetailsBlockId == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertDetailsBlockId.name());
        }
        Integer num = this.offset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.addHeadingSeparatorWithOffset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.addTrailingSeparatorWithOffset;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Map<String, RawParams> map = this.rawParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }
}
