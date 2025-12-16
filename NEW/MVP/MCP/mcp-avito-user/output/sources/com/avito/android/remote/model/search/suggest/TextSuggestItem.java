package com.avito.android.remote.model.search.suggest;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SuggestItem.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/TextSuggestItem;", "Lcom/avito/android/remote/model/search/suggest/SuggestItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "description", "", "minHeight", "Lcom/avito/android/remote/model/search/suggest/IconSource;", "icon", "Lcom/avito/android/remote/model/search/suggest/Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "actions", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/suggest/IconSource;Lcom/avito/android/remote/model/search/suggest/Padding;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getMinHeight", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/search/suggest/IconSource;", "getIcon", "()Lcom/avito/android/remote/model/search/suggest/IconSource;", "Lcom/avito/android/remote/model/search/suggest/Padding;", "getPadding", "()Lcom/avito/android/remote/model/search/suggest/Padding;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextSuggestItem extends SuggestItem {

    @k
    public static final Parcelable.Creator<TextSuggestItem> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<SuggestAction> actions;

    @c("description")
    @l
    private final String description;

    @c("icon")
    @l
    private final IconSource icon;

    @c("minimal_height")
    @l
    private final Integer minHeight;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final Padding padding;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextSuggestItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TextSuggestItem createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(TextSuggestItem.class.getClassLoader());
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            IconSource iconSource = (IconSource) parcel.readParcelable(TextSuggestItem.class.getClassLoader());
            Padding paddingCreateFromParcel = parcel.readInt() == 0 ? null : Padding.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(TextSuggestItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new TextSuggestItem(attributedText, string, numValueOf, iconSource, paddingCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TextSuggestItem[] newArray(int i12) {
            return new TextSuggestItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextSuggestItem(@k AttributedText attributedText, @l String str, @l Integer num, @l IconSource iconSource, @l Padding padding, @l List<? extends SuggestAction> list) {
        super(null);
        this.title = attributedText;
        this.description = str;
        this.minHeight = num;
        this.icon = iconSource;
        this.padding = padding;
        this.actions = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<SuggestAction> getActions() {
        return this.actions;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final IconSource getIcon() {
        return this.icon;
    }

    @l
    public final Integer getMinHeight() {
        return this.minHeight;
    }

    @l
    public final Padding getPadding() {
        return this.padding;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeString(this.description);
        Integer num = this.minHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.icon, flags);
        Padding padding = this.padding;
        if (padding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            padding.writeToParcel(parcel, flags);
        }
        List<SuggestAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
