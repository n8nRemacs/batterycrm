package com.avito.android.remote.model.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0016¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/text/BulletAttribute;", "Lcom/avito/android/remote/model/text/ParametersAttribute;", "", "name", "title", "bullet", "", "offset", "indentation", "", "Lcom/avito/android/remote/model/text/FontParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/avito/android/remote/model/text/BulletAttribute;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getTitle", "getBullet", "Ljava/lang/Integer;", "getOffset", "getIndentation", "Ljava/util/List;", "getParameters", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BulletAttribute extends ParametersAttribute {

    @k
    public static final Parcelable.Creator<BulletAttribute> CREATOR = new Creator();

    @k
    private final String bullet;

    @l
    private final Integer indentation;

    @k
    private final String name;

    @l
    private final Integer offset;

    @l
    private final List<FontParameter> parameters;

    @k
    private final String title;

    /* compiled from: Attribute.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BulletAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BulletAttribute createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BulletAttribute.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BulletAttribute(string, string2, string3, numValueOf, numValueOf2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BulletAttribute[] newArray(int i12) {
            return new BulletAttribute[i12];
        }
    }

    public /* synthetic */ BulletAttribute(String str, String str2, String str3, Integer num, Integer num2, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "bullet" : str2, str3, num, num2, (i12 & 32) != 0 ? null : list);
    }

    public static /* synthetic */ BulletAttribute copy$default(BulletAttribute bulletAttribute, String str, String str2, String str3, Integer num, Integer num2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bulletAttribute.name;
        }
        if ((i12 & 2) != 0) {
            str2 = bulletAttribute.title;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = bulletAttribute.bullet;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            num = bulletAttribute.offset;
        }
        Integer num3 = num;
        if ((i12 & 16) != 0) {
            num2 = bulletAttribute.indentation;
        }
        Integer num4 = num2;
        if ((i12 & 32) != 0) {
            list = bulletAttribute.parameters;
        }
        return bulletAttribute.copy(str, str4, str5, num3, num4, list);
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

    @k
    /* renamed from: component3, reason: from getter */
    public final String getBullet() {
        return this.bullet;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getIndentation() {
        return this.indentation;
    }

    @l
    public final List<FontParameter> component6() {
        return this.parameters;
    }

    @k
    public final BulletAttribute copy(@k String name, @k String title, @k String bullet, @l Integer offset, @l Integer indentation, @l List<? extends FontParameter> parameters) {
        return new BulletAttribute(name, title, bullet, offset, indentation, parameters);
    }

    @Override // com.avito.android.remote.model.text.Attribute, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletAttribute)) {
            return false;
        }
        BulletAttribute bulletAttribute = (BulletAttribute) other;
        return L.f(this.name, bulletAttribute.name) && L.f(this.title, bulletAttribute.title) && L.f(this.bullet, bulletAttribute.bullet) && L.f(this.offset, bulletAttribute.offset) && L.f(this.indentation, bulletAttribute.indentation) && L.f(this.parameters, bulletAttribute.parameters);
    }

    @k
    public final String getBullet() {
        return this.bullet;
    }

    @l
    public final Integer getIndentation() {
        return this.indentation;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getName() {
        return this.name;
    }

    @l
    public final Integer getOffset() {
        return this.offset;
    }

    @Override // com.avito.android.remote.model.text.ParametersAttribute
    @l
    public List<FontParameter> getParameters() {
        return this.parameters;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.name.hashCode() * 31, 31, this.title), 31, this.bullet);
        Integer num = this.offset;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.indentation;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<FontParameter> list = this.parameters;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BulletAttribute(name=");
        sb2.append(this.name);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", bullet=");
        sb2.append(this.bullet);
        sb2.append(", offset=");
        sb2.append(this.offset);
        sb2.append(", indentation=");
        sb2.append(this.indentation);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.bullet);
        Integer num = this.offset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.indentation;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
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
    public BulletAttribute(@k String str, @k String str2, @k String str3, @l Integer num, @l Integer num2, @l List<? extends FontParameter> list) {
        this.name = str;
        this.title = str2;
        this.bullet = str3;
        this.offset = num;
        this.indentation = num2;
        this.parameters = list;
    }
}
