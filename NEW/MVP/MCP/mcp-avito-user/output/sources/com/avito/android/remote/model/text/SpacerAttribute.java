package com.avito.android.remote.model.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Attribute.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/text/SpacerAttribute;", "Lcom/avito/android/remote/model/text/Attribute;", "", "name", "title", "type", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/remote/model/text/SpacerAttribute;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getTitle", "getType", "Ljava/lang/Integer;", "getValue", "Companion", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SpacerAttribute extends Attribute {

    @k
    public static final String ATTRIBUTE_TYPE = "spacer";

    @k
    public static final String PARAM_TYPE = "type";

    @k
    public static final String PARAM_VALUE = "value";

    @k
    public static final String SPACER_TYPE_TEXT_ICON = "textIcon";

    @k
    private final String name;

    @k
    private final String title;

    @l
    private final String type;

    @l
    private final Integer value;

    @k
    public static final Parcelable.Creator<SpacerAttribute> CREATOR = new Creator();

    /* compiled from: Attribute.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpacerAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SpacerAttribute createFromParcel(@k Parcel parcel) {
            return new SpacerAttribute(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SpacerAttribute[] newArray(int i12) {
            return new SpacerAttribute[i12];
        }
    }

    public SpacerAttribute(@k String str, @k String str2, @l String str3, @l Integer num) {
        super(null);
        this.name = str;
        this.title = str2;
        this.type = str3;
        this.value = num;
    }

    public static /* synthetic */ SpacerAttribute copy$default(SpacerAttribute spacerAttribute, String str, String str2, String str3, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = spacerAttribute.name;
        }
        if ((i12 & 2) != 0) {
            str2 = spacerAttribute.title;
        }
        if ((i12 & 4) != 0) {
            str3 = spacerAttribute.type;
        }
        if ((i12 & 8) != 0) {
            num = spacerAttribute.value;
        }
        return spacerAttribute.copy(str, str2, str3, num);
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
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    @k
    public final SpacerAttribute copy(@k String name, @k String title, @l String type, @l Integer value) {
        return new SpacerAttribute(name, title, type, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacerAttribute)) {
            return false;
        }
        SpacerAttribute spacerAttribute = (SpacerAttribute) other;
        return L.f(this.name, spacerAttribute.name) && L.f(this.title, spacerAttribute.title) && L.f(this.type, spacerAttribute.type) && L.f(this.value, spacerAttribute.value);
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getName() {
        return this.name;
    }

    @Override // com.avito.android.remote.model.text.Attribute
    @k
    public String getTitle() {
        return this.title;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        int iD2 = H.d(this.name.hashCode() * 31, 31, this.title);
        String str = this.type;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.value;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SpacerAttribute(name=");
        sb2.append(this.name);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", value=");
        return s.j(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
