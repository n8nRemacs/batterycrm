package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsProgress.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsProgress;", "Landroid/os/Parcelable;", "Block", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsProgress implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsProgress> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f172873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f172874c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Block f172875d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Block f172876e;

    /* compiled from: InstallmentsProgress.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsProgress$Block;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Block implements Parcelable {

        @k
        public static final Parcelable.Creator<Block> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f172877b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f172878c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f172879d;

        /* renamed from: e, reason: collision with root package name */
        public final int f172880e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f172881f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final UniversalColor f172882g;

        /* compiled from: InstallmentsProgress.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Block> {
            @Override // android.os.Parcelable.Creator
            public final Block createFromParcel(Parcel parcel) {
                return new Block((AttributedText) parcel.readParcelable(Block.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UniversalColor) parcel.readParcelable(Block.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Block[] newArray(int i12) {
                return new Block[i12];
            }
        }

        public Block(@l AttributedText attributedText, @l Integer num, @l Integer num2, int i12, @l Integer num3, @l UniversalColor universalColor) {
            this.f172877b = attributedText;
            this.f172878c = num;
            this.f172879d = num2;
            this.f172880e = i12;
            this.f172881f = num3;
            this.f172882g = universalColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Block)) {
                return false;
            }
            Block block = (Block) obj;
            return L.f(this.f172877b, block.f172877b) && L.f(this.f172878c, block.f172878c) && L.f(this.f172879d, block.f172879d) && this.f172880e == block.f172880e && L.f(this.f172881f, block.f172881f) && L.f(this.f172882g, block.f172882g);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f172877b;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            Integer num = this.f172878c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f172879d;
            int iE2 = r.e(this.f172880e, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
            Integer num3 = this.f172881f;
            int iHashCode3 = (iE2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            UniversalColor universalColor = this.f172882g;
            return iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Block(attributedText=");
            sb2.append(this.f172877b);
            sb2.append(", textMarginTop=");
            sb2.append(this.f172878c);
            sb2.append(", blockWidth=");
            sb2.append(this.f172879d);
            sb2.append(", dashCount=");
            sb2.append(this.f172880e);
            sb2.append(", dashSpacing=");
            sb2.append(this.f172881f);
            sb2.append(", dashColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f172882g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f172877b, i12);
            Integer num = this.f172878c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f172879d;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeInt(this.f172880e);
            Integer num3 = this.f172881f;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            parcel.writeParcelable(this.f172882g, i12);
        }
    }

    /* compiled from: InstallmentsProgress.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsProgress> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsProgress createFromParcel(Parcel parcel) {
            return new InstallmentsProgress(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Block.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Block.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsProgress[] newArray(int i12) {
            return new InstallmentsProgress[i12];
        }
    }

    public InstallmentsProgress(int i12, int i13, @l Block block, @l Block block2) {
        this.f172873b = i12;
        this.f172874c = i13;
        this.f172875d = block;
        this.f172876e = block2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsProgress)) {
            return false;
        }
        InstallmentsProgress installmentsProgress = (InstallmentsProgress) obj;
        return this.f172873b == installmentsProgress.f172873b && this.f172874c == installmentsProgress.f172874c && L.f(this.f172875d, installmentsProgress.f172875d) && L.f(this.f172876e, installmentsProgress.f172876e);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f172874c, Integer.hashCode(this.f172873b) * 31, 31);
        Block block = this.f172875d;
        int iHashCode = (iE2 + (block == null ? 0 : block.hashCode())) * 31;
        Block block2 = this.f172876e;
        return iHashCode + (block2 != null ? block2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InstallmentsProgress(blockSpacing=" + this.f172873b + ", dashHeight=" + this.f172874c + ", leftBlock=" + this.f172875d + ", rightBlock=" + this.f172876e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f172873b);
        parcel.writeInt(this.f172874c);
        Block block = this.f172875d;
        if (block == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            block.writeToParcel(parcel, i12);
        }
        Block block2 = this.f172876e;
        if (block2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            block2.writeToParcel(parcel, i12);
        }
    }
}
