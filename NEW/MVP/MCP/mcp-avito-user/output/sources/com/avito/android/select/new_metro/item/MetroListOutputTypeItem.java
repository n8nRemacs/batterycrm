package com.avito.android.select.new_metro.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: MetroListOutputTypeItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroListOutputTypeItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "OutputType", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MetroListOutputTypeItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MetroListOutputTypeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OutputType f266188c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MetroListOutputTypeItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroListOutputTypeItem$OutputType;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OutputType {

        /* renamed from: b, reason: collision with root package name */
        public static final OutputType f266189b;

        /* renamed from: c, reason: collision with root package name */
        public static final OutputType f266190c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ OutputType[] f266191d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f266192e;

        static {
            OutputType outputType = new OutputType("ByAlphabet", 0);
            f266189b = outputType;
            OutputType outputType2 = new OutputType("ByLines", 1);
            f266190c = outputType2;
            OutputType[] outputTypeArr = {outputType, outputType2};
            f266191d = outputTypeArr;
            f266192e = c.a(outputTypeArr);
        }

        public OutputType() {
            throw null;
        }

        public static OutputType valueOf(String str) {
            return (OutputType) Enum.valueOf(OutputType.class, str);
        }

        public static OutputType[] values() {
            return (OutputType[]) f266191d.clone();
        }
    }

    /* compiled from: MetroListOutputTypeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetroListOutputTypeItem> {
        @Override // android.os.Parcelable.Creator
        public final MetroListOutputTypeItem createFromParcel(Parcel parcel) {
            return new MetroListOutputTypeItem(parcel.readString(), OutputType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MetroListOutputTypeItem[] newArray(int i12) {
            return new MetroListOutputTypeItem[i12];
        }
    }

    public MetroListOutputTypeItem(@k String str, @k OutputType outputType) {
        this.f266187b = str;
        this.f266188c = outputType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroListOutputTypeItem)) {
            return false;
        }
        MetroListOutputTypeItem metroListOutputTypeItem = (MetroListOutputTypeItem) obj;
        return L.f(this.f266187b, metroListOutputTypeItem.f266187b) && this.f266188c == metroListOutputTypeItem.f266188c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266187b() {
        return this.f266187b;
    }

    public final int hashCode() {
        return this.f266188c.hashCode() + (this.f266187b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "MetroListOutputTypeItem(stringId=" + this.f266187b + ", selectedType=" + this.f266188c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266187b);
        parcel.writeString(this.f266188c.name());
    }
}
