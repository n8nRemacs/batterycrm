package com.avito.android.remote.model.common.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: VerificationImageItem.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0011¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationImageItem;", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "", "width", "height", "Lcom/avito/android/remote/model/common/items/VerificationImageItem$Align;", "align", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/common/items/VerificationImageItem$Align;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Lcom/avito/android/remote/model/common/items/VerificationImageItem$Align;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/common/items/VerificationImageItem$Align;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/common/items/VerificationImageItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getWidth", "getHeight", "Lcom/avito/android/remote/model/common/items/VerificationImageItem$Align;", "getAlign", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Align", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationImageItem implements VerificationListItem {

    @k
    public static final Parcelable.Creator<VerificationImageItem> CREATOR = new Creator();

    @c("align")
    @l
    private final Align align;

    @c("height")
    @l
    private final Integer height;

    @c("image")
    @l
    private final UniversalImage image;

    @c("width")
    @l
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationImageItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationImageItem$Align;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Align {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;

        @c("left")
        public static final Align LEFT = new Align("LEFT", 0);

        @c("right")
        public static final Align RIGHT = new Align("RIGHT", 1);

        @c("center")
        public static final Align CENTER = new Align("CENTER", 2);

        private static final /* synthetic */ Align[] $values() {
            return new Align[]{LEFT, RIGHT, CENTER};
        }

        static {
            Align[] alignArr$values = $values();
            $VALUES = alignArr$values;
            $ENTRIES = kotlin.enums.c.a(alignArr$values);
        }

        private Align(String str, int i12) {
        }

        @k
        public static a<Align> getEntries() {
            return $ENTRIES;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    /* compiled from: VerificationImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationImageItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationImageItem createFromParcel(@k Parcel parcel) {
            return new VerificationImageItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Align.valueOf(parcel.readString()) : null, (UniversalImage) parcel.readParcelable(VerificationImageItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationImageItem[] newArray(int i12) {
            return new VerificationImageItem[i12];
        }
    }

    public VerificationImageItem(@l Integer num, @l Integer num2, @l Align align, @l UniversalImage universalImage) {
        this.width = num;
        this.height = num2;
        this.align = align;
        this.image = universalImage;
    }

    public static /* synthetic */ VerificationImageItem copy$default(VerificationImageItem verificationImageItem, Integer num, Integer num2, Align align, UniversalImage universalImage, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = verificationImageItem.width;
        }
        if ((i12 & 2) != 0) {
            num2 = verificationImageItem.height;
        }
        if ((i12 & 4) != 0) {
            align = verificationImageItem.align;
        }
        if ((i12 & 8) != 0) {
            universalImage = verificationImageItem.image;
        }
        return verificationImageItem.copy(num, num2, align, universalImage);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Align getAlign() {
        return this.align;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final VerificationImageItem copy(@l Integer width, @l Integer height, @l Align align, @l UniversalImage image) {
        return new VerificationImageItem(width, height, align, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationImageItem)) {
            return false;
        }
        VerificationImageItem verificationImageItem = (VerificationImageItem) other;
        return L.f(this.width, verificationImageItem.width) && L.f(this.height, verificationImageItem.height) && this.align == verificationImageItem.align && L.f(this.image, verificationImageItem.image);
    }

    @l
    public final Align getAlign() {
        return this.align;
    }

    @l
    public final Integer getHeight() {
        return this.height;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Align align = this.align;
        int iHashCode3 = (iHashCode2 + (align == null ? 0 : align.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationImageItem(width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", align=");
        sb2.append(this.align);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Align align = this.align;
        if (align == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(align.name());
        }
        parcel.writeParcelable(this.image, flags);
    }
}
