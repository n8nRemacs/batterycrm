package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CreditProgress.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "Landroid/os/Parcelable;", "", "blockSpacing", "dashHeight", "Lcom/avito/android/remote/model/credit_broker/CreditProgress$Block;", "leftBlock", "rightBlock", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/credit_broker/CreditProgress$Block;Lcom/avito/android/remote/model/credit_broker/CreditProgress$Block;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getBlockSpacing", "()Ljava/lang/Integer;", "getDashHeight", "Lcom/avito/android/remote/model/credit_broker/CreditProgress$Block;", "getLeftBlock", "()Lcom/avito/android/remote/model/credit_broker/CreditProgress$Block;", "getRightBlock", "Block", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CreditProgress implements Parcelable {

    @k
    public static final Parcelable.Creator<CreditProgress> CREATOR = new Creator();

    @c("blockSpacing")
    @l
    private final Integer blockSpacing;

    @c("dashHeight")
    @l
    private final Integer dashHeight;

    @c("leftBlock")
    @l
    private final Block leftBlock;

    @c("rightBlock")
    @l
    private final Block rightBlock;

    /* compiled from: CreditProgress.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/CreditProgress$Block;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "", "textMarginTop", "blockWidth", "dashCount", "dashSpacing", "Lcom/avito/android/remote/model/UniversalColor;", "dashColor", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Integer;", "getTextMarginTop", "()Ljava/lang/Integer;", "getBlockWidth", "getDashCount", "getDashSpacing", "Lcom/avito/android/remote/model/UniversalColor;", "getDashColor", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Block implements Parcelable {

        @k
        public static final Parcelable.Creator<Block> CREATOR = new Creator();

        @c("attributedText")
        @l
        private final AttributedText attributedText;

        @c("blockWidth")
        @l
        private final Integer blockWidth;

        @c("dashColor")
        @l
        private final UniversalColor dashColor;

        @c("dashCount")
        @l
        private final Integer dashCount;

        @c("dashSpacing")
        @l
        private final Integer dashSpacing;

        @c("textMarginTop")
        @l
        private final Integer textMarginTop;

        /* compiled from: CreditProgress.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Block> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Block createFromParcel(@k Parcel parcel) {
                return new Block((AttributedText) parcel.readParcelable(Block.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UniversalColor) parcel.readParcelable(Block.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Block[] newArray(int i12) {
                return new Block[i12];
            }
        }

        public Block(@l AttributedText attributedText, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l UniversalColor universalColor) {
            this.attributedText = attributedText;
            this.textMarginTop = num;
            this.blockWidth = num2;
            this.dashCount = num3;
            this.dashSpacing = num4;
            this.dashColor = universalColor;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @l
        public final Integer getBlockWidth() {
            return this.blockWidth;
        }

        @l
        public final UniversalColor getDashColor() {
            return this.dashColor;
        }

        @l
        public final Integer getDashCount() {
            return this.dashCount;
        }

        @l
        public final Integer getDashSpacing() {
            return this.dashSpacing;
        }

        @l
        public final Integer getTextMarginTop() {
            return this.textMarginTop;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.attributedText, flags);
            Integer num = this.textMarginTop;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.blockWidth;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            Integer num3 = this.dashCount;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num3);
            }
            Integer num4 = this.dashSpacing;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num4);
            }
            parcel.writeParcelable(this.dashColor, flags);
        }
    }

    /* compiled from: CreditProgress.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreditProgress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CreditProgress createFromParcel(@k Parcel parcel) {
            return new CreditProgress(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Block.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Block.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CreditProgress[] newArray(int i12) {
            return new CreditProgress[i12];
        }
    }

    public CreditProgress(@l Integer num, @l Integer num2, @l Block block, @l Block block2) {
        this.blockSpacing = num;
        this.dashHeight = num2;
        this.leftBlock = block;
        this.rightBlock = block2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getBlockSpacing() {
        return this.blockSpacing;
    }

    @l
    public final Integer getDashHeight() {
        return this.dashHeight;
    }

    @l
    public final Block getLeftBlock() {
        return this.leftBlock;
    }

    @l
    public final Block getRightBlock() {
        return this.rightBlock;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.blockSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.dashHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Block block = this.leftBlock;
        if (block == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            block.writeToParcel(parcel, flags);
        }
        Block block2 = this.rightBlock;
        if (block2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            block2.writeToParcel(parcel, flags);
        }
    }
}
