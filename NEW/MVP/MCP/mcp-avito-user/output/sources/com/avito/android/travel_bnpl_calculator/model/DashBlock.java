package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypeDetails.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/DashBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "", "blockWidth", "Lcom/avito/android/remote/model/UniversalColor;", "dashColor", "dashCount", "dashSpacing", "textMarginTop", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;III)V", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalColor;", "d", "()Lcom/avito/android/remote/model/UniversalColor;", "I", "e", "()I", "f", "g", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DashBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<DashBlock> CREATOR = new a();

    @c("blockWidth")
    @l
    private final Integer blockWidth;

    @c("dashColor")
    @k
    private final UniversalColor dashColor;

    @c("dashCount")
    private final int dashCount;

    @c("dashSpacing")
    private final int dashSpacing;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("textMarginTop")
    private final int textMarginTop;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: PaymentTypeDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DashBlock> {
        @Override // android.os.Parcelable.Creator
        public final DashBlock createFromParcel(Parcel parcel) {
            return new DashBlock((AttributedText) parcel.readParcelable(DashBlock.class.getClassLoader()), (AttributedText) parcel.readParcelable(DashBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(DashBlock.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DashBlock[] newArray(int i12) {
            return new DashBlock[i12];
        }
    }

    public DashBlock(@k AttributedText attributedText, @l AttributedText attributedText2, @l Integer num, @k UniversalColor universalColor, int i12, int i13, int i14) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.blockWidth = num;
        this.dashColor = universalColor;
        this.dashCount = i12;
        this.dashSpacing = i13;
        this.textMarginTop = i14;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getBlockWidth() {
        return this.blockWidth;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final UniversalColor getDashColor() {
        return this.dashColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getDashCount() {
        return this.dashCount;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashBlock)) {
            return false;
        }
        DashBlock dashBlock = (DashBlock) obj;
        return L.f(this.title, dashBlock.title) && L.f(this.subtitle, dashBlock.subtitle) && L.f(this.blockWidth, dashBlock.blockWidth) && L.f(this.dashColor, dashBlock.dashColor) && this.dashCount == dashBlock.dashCount && this.dashSpacing == dashBlock.dashSpacing && this.textMarginTop == dashBlock.textMarginTop;
    }

    /* renamed from: f, reason: from getter */
    public final int getDashSpacing() {
        return this.dashSpacing;
    }

    /* renamed from: g, reason: from getter */
    public final int getTextMarginTop() {
        return this.textMarginTop;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.blockWidth;
        return Integer.hashCode(this.textMarginTop) + r.e(this.dashSpacing, r.e(this.dashCount, com.avito.android.actions_sheet.a.i(this.dashColor, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DashBlock(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", blockWidth=");
        sb2.append(this.blockWidth);
        sb2.append(", dashColor=");
        sb2.append(this.dashColor);
        sb2.append(", dashCount=");
        sb2.append(this.dashCount);
        sb2.append(", dashSpacing=");
        sb2.append(this.dashSpacing);
        sb2.append(", textMarginTop=");
        return r.t(sb2, this.textMarginTop, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.subtitle, i12);
        Integer num = this.blockWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.dashColor, i12);
        parcel.writeInt(this.dashCount);
        parcel.writeInt(this.dashSpacing);
        parcel.writeInt(this.textMarginTop);
    }
}
