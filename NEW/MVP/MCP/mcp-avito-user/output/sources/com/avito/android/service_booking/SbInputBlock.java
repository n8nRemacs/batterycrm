package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0013R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/service_booking/SbInputBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "", "id", "value", "title", "Lcom/avito/android/service_booking/SbInputBlock$DataFormat;", "dataFormat", ChannelContext.Item.PLACEHOLDER, "", "isOptional", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking/SbInputBlock$DataFormat;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "getTitle", "setTitle", "Lcom/avito/android/service_booking/SbInputBlock$DataFormat;", "c", "()Lcom/avito/android/service_booking/SbInputBlock$DataFormat;", "setDataFormat", "(Lcom/avito/android/service_booking/SbInputBlock$DataFormat;)V", "getPlaceholder", "setPlaceholder", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "DataFormat", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbInputBlock implements ServiceBookingBlock, SerializableServiceBookingBlock<String> {

    @k
    public static final Parcelable.Creator<SbInputBlock> CREATOR = new a();

    @c("dataFormat")
    @l
    private DataFormat dataFormat;

    @c("id")
    @k
    private final String id;

    @c("optional")
    @l
    private final Boolean isOptional;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private String placeholder;

    @c("title")
    @l
    private String title;

    @c("value")
    @l
    private String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/SbInputBlock$DataFormat;", "", "(Ljava/lang/String;I)V", "PHONE", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataFormat {

        @c("phone")
        public static final DataFormat PHONE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DataFormat[] f274140b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274141c;

        static {
            DataFormat dataFormat = new DataFormat("PHONE", 0);
            PHONE = dataFormat;
            DataFormat[] dataFormatArr = {dataFormat};
            f274140b = dataFormatArr;
            f274141c = kotlin.enums.c.a(dataFormatArr);
        }

        private DataFormat(String str, int i12) {
        }

        public static DataFormat valueOf(String str) {
            return (DataFormat) Enum.valueOf(DataFormat.class, str);
        }

        public static DataFormat[] values() {
            return (DataFormat[]) f274140b.clone();
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbInputBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbInputBlock createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DataFormat dataFormatValueOf = parcel.readInt() == 0 ? null : DataFormat.valueOf(parcel.readString());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SbInputBlock(string, string2, string3, dataFormatValueOf, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SbInputBlock[] newArray(int i12) {
            return new SbInputBlock[i12];
        }
    }

    public SbInputBlock(@k String str, @l String str2, @l String str3, @l DataFormat dataFormat, @l String str4, @l Boolean bool) {
        this.id = str;
        this.value = str2;
        this.title = str3;
        this.dataFormat = dataFormat;
        this.placeholder = str4;
        this.isOptional = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DataFormat getDataFormat() {
        return this.dataFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbInputBlock)) {
            return false;
        }
        SbInputBlock sbInputBlock = (SbInputBlock) obj;
        return L.f(this.id, sbInputBlock.id) && L.f(this.value, sbInputBlock.value) && L.f(this.title, sbInputBlock.title) && this.dataFormat == sbInputBlock.dataFormat && L.f(this.placeholder, sbInputBlock.placeholder) && L.f(this.isOptional, sbInputBlock.isOptional);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DataFormat dataFormat = this.dataFormat;
        int iHashCode4 = (iHashCode3 + (dataFormat == null ? 0 : dataFormat.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOptional;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbInputBlock(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", dataFormat=");
        sb2.append(this.dataFormat);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", isOptional=");
        return C0.g(sb2, this.isOptional, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        DataFormat dataFormat = this.dataFormat;
        if (dataFormat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dataFormat.name());
        }
        parcel.writeString(this.placeholder);
        Boolean bool = this.isOptional;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
