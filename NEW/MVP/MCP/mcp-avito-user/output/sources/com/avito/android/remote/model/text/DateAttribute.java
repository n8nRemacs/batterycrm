package com.avito.android.remote.model.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Attribute.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/text/DateAttribute;", "Lcom/avito/android/remote/model/text/ParametersAttribute;", "", "name", "title", "format", "", "timestamp", "", "Lcom/avito/android/remote/model/text/FontParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/avito/android/remote/model/text/DateAttribute;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getTitle", "getFormat", "Ljava/lang/Long;", "getTimestamp", "Ljava/util/List;", "getParameters", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DateAttribute extends ParametersAttribute {

    @k
    public static final Parcelable.Creator<DateAttribute> CREATOR = new Creator();

    @l
    private final String format;

    @k
    private final String name;

    @l
    private final List<FontParameter> parameters;

    @l
    private final Long timestamp;

    @k
    private final String title;

    /* compiled from: Attribute.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateAttribute createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(DateAttribute.class, parcel, arrayList, iL2, 1);
                }
            }
            return new DateAttribute(string, string2, string3, lValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateAttribute[] newArray(int i12) {
            return new DateAttribute[i12];
        }
    }

    public /* synthetic */ DateAttribute(String str, String str2, String str3, Long l12, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, l12, (i12 & 16) != 0 ? null : list);
    }

    public static /* synthetic */ DateAttribute copy$default(DateAttribute dateAttribute, String str, String str2, String str3, Long l12, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dateAttribute.name;
        }
        if ((i12 & 2) != 0) {
            str2 = dateAttribute.title;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = dateAttribute.format;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            l12 = dateAttribute.timestamp;
        }
        Long l13 = l12;
        if ((i12 & 16) != 0) {
            list = dateAttribute.parameters;
        }
        return dateAttribute.copy(str, str4, str5, l13, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @l
    public final List<FontParameter> component5() {
        return this.parameters;
    }

    @k
    public final DateAttribute copy(@k String name, @k String title, @l String format, @l Long timestamp, @l List<? extends FontParameter> parameters) {
        return new DateAttribute(name, title, format, timestamp, parameters);
    }

    @Override // com.avito.android.remote.model.text.Attribute, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateAttribute)) {
            return false;
        }
        DateAttribute dateAttribute = (DateAttribute) other;
        return L.f(this.name, dateAttribute.name) && L.f(this.title, dateAttribute.title) && L.f(this.format, dateAttribute.format) && L.f(this.timestamp, dateAttribute.timestamp) && L.f(this.parameters, dateAttribute.parameters);
    }

    @l
    public final String getFormat() {
        return this.format;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getName() {
        return this.name;
    }

    @Override // com.avito.android.remote.model.text.ParametersAttribute
    @l
    public List<FontParameter> getParameters() {
        return this.parameters;
    }

    @l
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.name.hashCode() * 31, 31, this.title);
        String str = this.format;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.timestamp;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<FontParameter> list = this.parameters;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DateAttribute(name=");
        sb2.append(this.name);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", format=");
        sb2.append(this.format);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.format);
        Long l12 = this.timestamp;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        List<FontParameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DateAttribute(@k String str, @k String str2, @l String str3, @l Long l12, @l List<? extends FontParameter> list) {
        this.name = str;
        this.title = str2;
        this.format = str3;
        this.timestamp = l12;
        this.parameters = list;
    }
}
