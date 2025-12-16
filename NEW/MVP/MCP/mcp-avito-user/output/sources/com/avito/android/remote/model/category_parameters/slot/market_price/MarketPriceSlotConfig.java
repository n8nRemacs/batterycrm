package com.avito.android.remote.model.category_parameters.slot.market_price;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MarketPriceSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "priceId", "", "relatedFields", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "commentField", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/CommentState;", "commentStates", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CharParameter;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPriceId", "()Ljava/lang/String;", "Ljava/util/List;", "getRelatedFields", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "getCommentField", "()Lcom/avito/android/remote/model/category_parameters/CharParameter;", "getCommentStates", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarketPriceSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<MarketPriceSlotConfig> CREATOR = new Creator();

    @c("field")
    @l
    private final CharParameter commentField;

    @c("commentStates")
    @l
    private final List<CommentState> commentStates;

    @c("priceId")
    @k
    private final String priceId;

    @c("relatedFields")
    @l
    private final List<String> relatedFields;

    /* compiled from: MarketPriceSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MarketPriceSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MarketPriceSlotConfig createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            CharParameter charParameter = (CharParameter) parcel.readParcelable(MarketPriceSlotConfig.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(CommentState.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketPriceSlotConfig(string, arrayListCreateStringArrayList, charParameter, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MarketPriceSlotConfig[] newArray(int i12) {
            return new MarketPriceSlotConfig[i12];
        }
    }

    public MarketPriceSlotConfig(@k String str, @l List<String> list, @l CharParameter charParameter, @l List<CommentState> list2) {
        this.priceId = str;
        this.relatedFields = list;
        this.commentField = charParameter;
        this.commentStates = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final CharParameter getCommentField() {
        return this.commentField;
    }

    @l
    public final List<CommentState> getCommentStates() {
        return this.commentStates;
    }

    @k
    public final String getPriceId() {
        return this.priceId;
    }

    @l
    public final List<String> getRelatedFields() {
        return this.relatedFields;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.priceId);
        parcel.writeStringList(this.relatedFields);
        parcel.writeParcelable(this.commentField, flags);
        List<CommentState> list = this.commentStates;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((CommentState) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
