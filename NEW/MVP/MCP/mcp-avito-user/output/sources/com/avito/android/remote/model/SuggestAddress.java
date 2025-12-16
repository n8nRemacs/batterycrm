package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddress.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/SuggestAddress;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "id", AddressParameter.TYPE, "locality", "paramId", "Lcom/avito/android/remote/model/SuggestAddress$Kind;", MessageBody.Location.KIND, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SuggestAddress$Kind;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/SuggestAddress$Kind;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SuggestAddress$Kind;Ljava/lang/String;)Lcom/avito/android/remote/model/SuggestAddress;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getAddress", "getLocality", "getParamId", "Lcom/avito/android/remote/model/SuggestAddress$Kind;", "getKind", "getName", "Kind", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuggestAddress implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<SuggestAddress> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("id")
    @k
    private final String id;

    @c(MessageBody.Location.KIND)
    @l
    private final Kind kind;

    @c("location")
    @l
    private final String locality;

    @c("name")
    @l
    private final String name;

    @c("paramId")
    @l
    private final String paramId;

    /* compiled from: SuggestAddress.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuggestAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestAddress createFromParcel(@k Parcel parcel) {
            return new SuggestAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Kind.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuggestAddress[] newArray(int i12) {
            return new SuggestAddress[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuggestAddress.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/SuggestAddress$Kind;", "", "(Ljava/lang/String;I)V", "STREET", "HOUSE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        @c("street")
        public static final Kind STREET = new Kind("STREET", 0);

        @c("house")
        public static final Kind HOUSE = new Kind("HOUSE", 1);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{STREET, HOUSE};
        }

        static {
            Kind[] kindArr$values = $values();
            $VALUES = kindArr$values;
            $ENTRIES = kotlin.enums.c.a(kindArr$values);
        }

        private Kind(String str, int i12) {
        }

        @k
        public static a<Kind> getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public SuggestAddress(@k String str, @l String str2, @l String str3, @l String str4, @l Kind kind, @l String str5) {
        this.id = str;
        this.address = str2;
        this.locality = str3;
        this.paramId = str4;
        this.kind = kind;
        this.name = str5;
    }

    public static /* synthetic */ SuggestAddress copy$default(SuggestAddress suggestAddress, String str, String str2, String str3, String str4, Kind kind, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = suggestAddress.id;
        }
        if ((i12 & 2) != 0) {
            str2 = suggestAddress.address;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = suggestAddress.locality;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = suggestAddress.paramId;
        }
        String str8 = str4;
        if ((i12 & 16) != 0) {
            kind = suggestAddress.kind;
        }
        Kind kind2 = kind;
        if ((i12 & 32) != 0) {
            str5 = suggestAddress.name;
        }
        return suggestAddress.copy(str, str6, str7, str8, kind2, str5);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getParamId() {
        return this.paramId;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Kind getKind() {
        return this.kind;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final SuggestAddress copy(@k String id2, @l String address, @l String locality, @l String paramId, @l Kind kind, @l String name) {
        return new SuggestAddress(id2, address, locality, paramId, kind, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestAddress)) {
            return false;
        }
        SuggestAddress suggestAddress = (SuggestAddress) other;
        return L.f(this.id, suggestAddress.id) && L.f(this.address, suggestAddress.address) && L.f(this.locality, suggestAddress.locality) && L.f(this.paramId, suggestAddress.paramId) && this.kind == suggestAddress.kind && L.f(this.name, suggestAddress.name);
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final Kind getKind() {
        return this.kind;
    }

    @l
    public final String getLocality() {
        return this.locality;
    }

    @Override // com.avito.android.remote.model.Entity
    @l
    /* renamed from: getName */
    public String getTitle() {
        return this.name;
    }

    @l
    public final String getParamId() {
        return this.paramId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locality;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Kind kind = this.kind;
        int iHashCode5 = (iHashCode4 + (kind == null ? 0 : kind.hashCode())) * 31;
        String str4 = this.name;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestAddress(id=");
        sb2.append(this.id);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", locality=");
        sb2.append(this.locality);
        sb2.append(", paramId=");
        sb2.append(this.paramId);
        sb2.append(", kind=");
        sb2.append(this.kind);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.address);
        parcel.writeString(this.locality);
        parcel.writeString(this.paramId);
        Kind kind = this.kind;
        if (kind == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kind.name());
        }
        parcel.writeString(this.name);
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getId() {
        return this.id;
    }

    public /* synthetic */ SuggestAddress(String str, String str2, String str3, String str4, Kind kind, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, kind, (i12 & 32) != 0 ? str : str5);
    }
}
