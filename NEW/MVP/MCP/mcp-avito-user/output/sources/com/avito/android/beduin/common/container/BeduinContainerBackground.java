package com.avito.android.beduin.common.container;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinContainerBackground.kt */
@d
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0002>?BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJd\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b9\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u001d¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "cornerRadius", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;", "shadows", "highlightedColor", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;", "border", "", "gradient", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/Corners;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/beduin/common/container/Corners;", "component4", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;", "component5", "component6", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;", "component7", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/Corners;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;Ljava/lang/String;)Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "Ljava/lang/Integer;", "getCornerRadius", "getCornerRadius$annotations", "()V", "Lcom/avito/android/beduin/common/container/Corners;", "getCorners", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;", "getShadows", "getHighlightedColor", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;", "getBorder", "Ljava/lang/String;", "getGradient", "Border", "Shadows", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinContainerBackground implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinContainerBackground> CREATOR = new a();

    @l
    private final Border border;

    @l
    private final UniversalColor color;

    @l
    private final Integer cornerRadius;

    @l
    private final Corners corners;

    @l
    private final String gradient;

    @l
    private final UniversalColor highlightedColor;

    @l
    private final Shadows shadows;

    /* compiled from: BeduinContainerBackground.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;", "Landroid/os/Parcelable;", "", "width", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(ILcom/avito/android/remote/model/UniversalColor;)V", "component1", "()I", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(ILcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Border;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Border implements Parcelable {

        @k
        public static final Parcelable.Creator<Border> CREATOR = new a();

        @l
        private final UniversalColor color;
        private final int width;

        /* compiled from: BeduinContainerBackground.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Border> {
            @Override // android.os.Parcelable.Creator
            public final Border createFromParcel(Parcel parcel) {
                return new Border(parcel.readInt(), (UniversalColor) parcel.readParcelable(Border.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Border[] newArray(int i12) {
                return new Border[i12];
            }
        }

        public Border(int i12, @l UniversalColor universalColor) {
            this.width = i12;
            this.color = universalColor;
        }

        public static /* synthetic */ Border copy$default(Border border, int i12, UniversalColor universalColor, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = border.width;
            }
            if ((i13 & 2) != 0) {
                universalColor = border.color;
            }
            return border.copy(i12, universalColor);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final Border copy(int width, @l UniversalColor color) {
            return new Border(width, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Border)) {
                return false;
            }
            Border border = (Border) other;
            return this.width == border.width && L.f(this.color, border.color);
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.width) * 31;
            UniversalColor universalColor = this.color;
            return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Border(width=");
            sb2.append(this.width);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.width);
            parcel.writeParcelable(this.color, flags);
        }
    }

    /* compiled from: BeduinContainerBackground.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;", "Landroid/os/Parcelable;", "", "cornerRadius", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;", "upperShadow", "bottomShadow", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;", "component3", "copy", "(Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;)Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCornerRadius", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;", "getUpperShadow", "getBottomShadow", "Shadow", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Shadows implements Parcelable {

        @k
        public static final Parcelable.Creator<Shadows> CREATOR = new a();

        @l
        private final Shadow bottomShadow;

        @l
        private final Integer cornerRadius;

        @l
        private final Shadow upperShadow;

        /* compiled from: BeduinContainerBackground.kt */
        @Keep
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;", "Landroid/os/Parcelable;", "", "offsetX", "offsetY", "blurRadius", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/container/BeduinContainerBackground$Shadows$Shadow;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getOffsetX", "getOffsetY", "getBlurRadius", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Shadow implements Parcelable {

            @k
            public static final Parcelable.Creator<Shadow> CREATOR = new a();

            @l
            private final Integer blurRadius;

            @l
            private final UniversalColor color;

            @l
            private final Integer offsetX;

            @l
            private final Integer offsetY;

            /* compiled from: BeduinContainerBackground.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Shadow> {
                @Override // android.os.Parcelable.Creator
                public final Shadow createFromParcel(Parcel parcel) {
                    return new Shadow(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UniversalColor) parcel.readParcelable(Shadow.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Shadow[] newArray(int i12) {
                    return new Shadow[i12];
                }
            }

            public Shadow(@l Integer num, @l Integer num2, @l Integer num3, @l UniversalColor universalColor) {
                this.offsetX = num;
                this.offsetY = num2;
                this.blurRadius = num3;
                this.color = universalColor;
            }

            public static /* synthetic */ Shadow copy$default(Shadow shadow, Integer num, Integer num2, Integer num3, UniversalColor universalColor, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    num = shadow.offsetX;
                }
                if ((i12 & 2) != 0) {
                    num2 = shadow.offsetY;
                }
                if ((i12 & 4) != 0) {
                    num3 = shadow.blurRadius;
                }
                if ((i12 & 8) != 0) {
                    universalColor = shadow.color;
                }
                return shadow.copy(num, num2, num3, universalColor);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Integer getOffsetX() {
                return this.offsetX;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Integer getOffsetY() {
                return this.offsetY;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Integer getBlurRadius() {
                return this.blurRadius;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final UniversalColor getColor() {
                return this.color;
            }

            @k
            public final Shadow copy(@l Integer offsetX, @l Integer offsetY, @l Integer blurRadius, @l UniversalColor color) {
                return new Shadow(offsetX, offsetY, blurRadius, color);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Shadow)) {
                    return false;
                }
                Shadow shadow = (Shadow) other;
                return L.f(this.offsetX, shadow.offsetX) && L.f(this.offsetY, shadow.offsetY) && L.f(this.blurRadius, shadow.blurRadius) && L.f(this.color, shadow.color);
            }

            @l
            public final Integer getBlurRadius() {
                return this.blurRadius;
            }

            @l
            public final UniversalColor getColor() {
                return this.color;
            }

            @l
            public final Integer getOffsetX() {
                return this.offsetX;
            }

            @l
            public final Integer getOffsetY() {
                return this.offsetY;
            }

            public int hashCode() {
                Integer num = this.offsetX;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.offsetY;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.blurRadius;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                UniversalColor universalColor = this.color;
                return iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Shadow(offsetX=");
                sb2.append(this.offsetX);
                sb2.append(", offsetY=");
                sb2.append(this.offsetY);
                sb2.append(", blurRadius=");
                sb2.append(this.blurRadius);
                sb2.append(", color=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.offsetX;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Integer num2 = this.offsetY;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                }
                Integer num3 = this.blurRadius;
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num3);
                }
                parcel.writeParcelable(this.color, flags);
            }
        }

        /* compiled from: BeduinContainerBackground.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Shadows> {
            @Override // android.os.Parcelable.Creator
            public final Shadows createFromParcel(Parcel parcel) {
                return new Shadows(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Shadow.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Shadow.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Shadows[] newArray(int i12) {
                return new Shadows[i12];
            }
        }

        public Shadows(@l Integer num, @l Shadow shadow, @l Shadow shadow2) {
            this.cornerRadius = num;
            this.upperShadow = shadow;
            this.bottomShadow = shadow2;
        }

        public static /* synthetic */ Shadows copy$default(Shadows shadows, Integer num, Shadow shadow, Shadow shadow2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = shadows.cornerRadius;
            }
            if ((i12 & 2) != 0) {
                shadow = shadows.upperShadow;
            }
            if ((i12 & 4) != 0) {
                shadow2 = shadows.bottomShadow;
            }
            return shadows.copy(num, shadow, shadow2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Shadow getUpperShadow() {
            return this.upperShadow;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Shadow getBottomShadow() {
            return this.bottomShadow;
        }

        @k
        public final Shadows copy(@l Integer cornerRadius, @l Shadow upperShadow, @l Shadow bottomShadow) {
            return new Shadows(cornerRadius, upperShadow, bottomShadow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shadows)) {
                return false;
            }
            Shadows shadows = (Shadows) other;
            return L.f(this.cornerRadius, shadows.cornerRadius) && L.f(this.upperShadow, shadows.upperShadow) && L.f(this.bottomShadow, shadows.bottomShadow);
        }

        @l
        public final Shadow getBottomShadow() {
            return this.bottomShadow;
        }

        @l
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        public final Shadow getUpperShadow() {
            return this.upperShadow;
        }

        public int hashCode() {
            Integer num = this.cornerRadius;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Shadow shadow = this.upperShadow;
            int iHashCode2 = (iHashCode + (shadow == null ? 0 : shadow.hashCode())) * 31;
            Shadow shadow2 = this.bottomShadow;
            return iHashCode2 + (shadow2 != null ? shadow2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Shadows(cornerRadius=" + this.cornerRadius + ", upperShadow=" + this.upperShadow + ", bottomShadow=" + this.bottomShadow + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.cornerRadius;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Shadow shadow = this.upperShadow;
            if (shadow == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shadow.writeToParcel(parcel, flags);
            }
            Shadow shadow2 = this.bottomShadow;
            if (shadow2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shadow2.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BeduinContainerBackground.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinContainerBackground> {
        @Override // android.os.Parcelable.Creator
        public final BeduinContainerBackground createFromParcel(Parcel parcel) {
            return new BeduinContainerBackground((UniversalColor) parcel.readParcelable(BeduinContainerBackground.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Corners.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Shadows.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(BeduinContainerBackground.class.getClassLoader()), parcel.readInt() != 0 ? Border.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinContainerBackground[] newArray(int i12) {
            return new BeduinContainerBackground[i12];
        }
    }

    public BeduinContainerBackground(@l UniversalColor universalColor, @l Integer num, @l Corners corners, @l Shadows shadows, @l UniversalColor universalColor2, @l Border border, @l String str) {
        this.color = universalColor;
        this.cornerRadius = num;
        this.corners = corners;
        this.shadows = shadows;
        this.highlightedColor = universalColor2;
        this.border = border;
        this.gradient = str;
    }

    public static /* synthetic */ BeduinContainerBackground copy$default(BeduinContainerBackground beduinContainerBackground, UniversalColor universalColor, Integer num, Corners corners, Shadows shadows, UniversalColor universalColor2, Border border, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = beduinContainerBackground.color;
        }
        if ((i12 & 2) != 0) {
            num = beduinContainerBackground.cornerRadius;
        }
        Integer num2 = num;
        if ((i12 & 4) != 0) {
            corners = beduinContainerBackground.corners;
        }
        Corners corners2 = corners;
        if ((i12 & 8) != 0) {
            shadows = beduinContainerBackground.shadows;
        }
        Shadows shadows2 = shadows;
        if ((i12 & 16) != 0) {
            universalColor2 = beduinContainerBackground.highlightedColor;
        }
        UniversalColor universalColor3 = universalColor2;
        if ((i12 & 32) != 0) {
            border = beduinContainerBackground.border;
        }
        Border border2 = border;
        if ((i12 & 64) != 0) {
            str = beduinContainerBackground.gradient;
        }
        return beduinContainerBackground.copy(universalColor, num2, corners2, shadows2, universalColor3, border2, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Corners getCorners() {
        return this.corners;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Shadows getShadows() {
        return this.shadows;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getHighlightedColor() {
        return this.highlightedColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Border getBorder() {
        return this.border;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getGradient() {
        return this.gradient;
    }

    @k
    public final BeduinContainerBackground copy(@l UniversalColor color, @l Integer cornerRadius, @l Corners corners, @l Shadows shadows, @l UniversalColor highlightedColor, @l Border border, @l String gradient) {
        return new BeduinContainerBackground(color, cornerRadius, corners, shadows, highlightedColor, border, gradient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinContainerBackground)) {
            return false;
        }
        BeduinContainerBackground beduinContainerBackground = (BeduinContainerBackground) other;
        return L.f(this.color, beduinContainerBackground.color) && L.f(this.cornerRadius, beduinContainerBackground.cornerRadius) && L.f(this.corners, beduinContainerBackground.corners) && L.f(this.shadows, beduinContainerBackground.shadows) && L.f(this.highlightedColor, beduinContainerBackground.highlightedColor) && L.f(this.border, beduinContainerBackground.border) && L.f(this.gradient, beduinContainerBackground.gradient);
    }

    @l
    public final Border getBorder() {
        return this.border;
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @l
    public final Corners getCorners() {
        return this.corners;
    }

    @l
    public final String getGradient() {
        return this.gradient;
    }

    @l
    public final UniversalColor getHighlightedColor() {
        return this.highlightedColor;
    }

    @l
    public final Shadows getShadows() {
        return this.shadows;
    }

    public int hashCode() {
        UniversalColor universalColor = this.color;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        Integer num = this.cornerRadius;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Corners corners = this.corners;
        int iHashCode3 = (iHashCode2 + (corners == null ? 0 : corners.hashCode())) * 31;
        Shadows shadows = this.shadows;
        int iHashCode4 = (iHashCode3 + (shadows == null ? 0 : shadows.hashCode())) * 31;
        UniversalColor universalColor2 = this.highlightedColor;
        int iHashCode5 = (iHashCode4 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        Border border = this.border;
        int iHashCode6 = (iHashCode5 + (border == null ? 0 : border.hashCode())) * 31;
        String str = this.gradient;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinContainerBackground(color=");
        sb2.append(this.color);
        sb2.append(", cornerRadius=");
        sb2.append(this.cornerRadius);
        sb2.append(", corners=");
        sb2.append(this.corners);
        sb2.append(", shadows=");
        sb2.append(this.shadows);
        sb2.append(", highlightedColor=");
        sb2.append(this.highlightedColor);
        sb2.append(", border=");
        sb2.append(this.border);
        sb2.append(", gradient=");
        return C22026a.c(sb2, this.gradient, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.color, flags);
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Corners corners = this.corners;
        if (corners == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            corners.writeToParcel(parcel, flags);
        }
        Shadows shadows = this.shadows;
        if (shadows == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shadows.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.highlightedColor, flags);
        Border border = this.border;
        if (border == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            border.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.gradient);
    }

    @InterfaceC42830m
    public static /* synthetic */ void getCornerRadius$annotations() {
    }
}
