package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/TextSection;", "Landroid/os/Parcelable;", "", "title", "text", "", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection$HighlightedText;", "highlightedText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "Ljava/util/List;", "getHighlightedText", "()Ljava/util/List;", "BorderRadius", "Highlight", "HighlightedText", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextSection implements Parcelable {

    @k
    public static final Parcelable.Creator<TextSection> CREATOR = new Creator();

    @c("highlightedText")
    @l
    private final List<HighlightedText> highlightedText;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;", "Landroid/os/Parcelable;", "", "left", "right", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getLeft", "getRight", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BorderRadius implements Parcelable {

        @k
        public static final Parcelable.Creator<BorderRadius> CREATOR = new Creator();

        @c("left")
        private final int left;

        @c("right")
        private final int right;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BorderRadius> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BorderRadius createFromParcel(@k Parcel parcel) {
                return new BorderRadius(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BorderRadius[] newArray(int i12) {
                return new BorderRadius[i12];
            }
        }

        public BorderRadius(int i12, int i13) {
            this.left = i12;
            this.right = i13;
        }

        public static /* synthetic */ BorderRadius copy$default(BorderRadius borderRadius, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = borderRadius.left;
            }
            if ((i14 & 2) != 0) {
                i13 = borderRadius.right;
            }
            return borderRadius.copy(i12, i13);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRight() {
            return this.right;
        }

        @k
        public final BorderRadius copy(int left, int right) {
            return new BorderRadius(left, right);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BorderRadius)) {
                return false;
            }
            BorderRadius borderRadius = (BorderRadius) other;
            return this.left == borderRadius.left && this.right == borderRadius.right;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public int hashCode() {
            return Integer.hashCode(this.right) + (Integer.hashCode(this.left) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BorderRadius(left=");
            sb2.append(this.left);
            sb2.append(", right=");
            return r.t(sb2, this.right, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.left);
            parcel.writeInt(this.right);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TextSection createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(HighlightedText.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new TextSection(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TextSection[] newArray(int i12) {
            return new TextSection[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;", "borderRadius", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "()Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;)Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackground", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection$BorderRadius;", "getBorderRadius", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Highlight implements Parcelable {

        @k
        public static final Parcelable.Creator<Highlight> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @k
        private final UniversalColor background;

        @c("borderRadius")
        @k
        private final BorderRadius borderRadius;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Highlight> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Highlight createFromParcel(@k Parcel parcel) {
                return new Highlight((UniversalColor) parcel.readParcelable(Highlight.class.getClassLoader()), BorderRadius.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Highlight[] newArray(int i12) {
                return new Highlight[i12];
            }
        }

        public Highlight(@k UniversalColor universalColor, @k BorderRadius borderRadius) {
            this.background = universalColor;
            this.borderRadius = borderRadius;
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, UniversalColor universalColor, BorderRadius borderRadius, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = highlight.background;
            }
            if ((i12 & 2) != 0) {
                borderRadius = highlight.borderRadius;
            }
            return highlight.copy(universalColor, borderRadius);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getBackground() {
            return this.background;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final BorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        @k
        public final Highlight copy(@k UniversalColor background, @k BorderRadius borderRadius) {
            return new Highlight(background, borderRadius);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) other;
            return L.f(this.background, highlight.background) && L.f(this.borderRadius, highlight.borderRadius);
        }

        @k
        public final UniversalColor getBackground() {
            return this.background;
        }

        @k
        public final BorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        public int hashCode() {
            return this.borderRadius.hashCode() + (this.background.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Highlight(background=" + this.background + ", borderRadius=" + this.borderRadius + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.background, flags);
            this.borderRadius.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/TextSection$HighlightedText;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;", ServiceTypeKt.SERVICE_HIGHLIGHT, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;)Lcom/avito/android/remote/model/rating_details_mvi/TextSection$HighlightedText;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection$Highlight;", "getHighlight", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HighlightedText implements Parcelable {

        @k
        public static final Parcelable.Creator<HighlightedText> CREATOR = new Creator();

        @c(ServiceTypeKt.SERVICE_HIGHLIGHT)
        @l
        private final Highlight highlight;

        @c("text")
        @k
        private final String text;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HighlightedText> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HighlightedText createFromParcel(@k Parcel parcel) {
                return new HighlightedText(parcel.readString(), parcel.readInt() == 0 ? null : Highlight.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HighlightedText[] newArray(int i12) {
                return new HighlightedText[i12];
            }
        }

        public HighlightedText(@k String str, @l Highlight highlight) {
            this.text = str;
            this.highlight = highlight;
        }

        public static /* synthetic */ HighlightedText copy$default(HighlightedText highlightedText, String str, Highlight highlight, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = highlightedText.text;
            }
            if ((i12 & 2) != 0) {
                highlight = highlightedText.highlight;
            }
            return highlightedText.copy(str, highlight);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Highlight getHighlight() {
            return this.highlight;
        }

        @k
        public final HighlightedText copy(@k String text, @l Highlight highlight) {
            return new HighlightedText(text, highlight);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightedText)) {
                return false;
            }
            HighlightedText highlightedText = (HighlightedText) other;
            return L.f(this.text, highlightedText.text) && L.f(this.highlight, highlightedText.highlight);
        }

        @l
        public final Highlight getHighlight() {
            return this.highlight;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            Highlight highlight = this.highlight;
            return iHashCode + (highlight == null ? 0 : highlight.hashCode());
        }

        @k
        public String toString() {
            return "HighlightedText(text=" + this.text + ", highlight=" + this.highlight + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            Highlight highlight = this.highlight;
            if (highlight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                highlight.writeToParcel(parcel, flags);
            }
        }
    }

    public TextSection(@l String str, @l String str2, @l List<HighlightedText> list) {
        this.title = str;
        this.text = str2;
        this.highlightedText = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<HighlightedText> getHighlightedText() {
        return this.highlightedText;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        List<HighlightedText> list = this.highlightedText;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((HighlightedText) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
