package com.avito.android.remote.model.search.suggest;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SuggestItem.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/search/suggest/BannerSuggestItem;", "Lcom/avito/android/remote/model/search/suggest/SuggestItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/search/suggest/PaddingInfo;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "actions", "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/search/suggest/PaddingInfo;Ljava/util/List;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/search/suggest/PaddingInfo;", "getPadding", "()Lcom/avito/android/remote/model/search/suggest/PaddingInfo;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getShowEvent", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BannerSuggestItem extends SuggestItem {

    @k
    public static final Parcelable.Creator<BannerSuggestItem> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<SuggestAction> actions;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("image")
    @l
    private final UniversalImage image;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final PaddingInfo padding;

    @c("showEvent")
    @l
    private final ParametrizedEvent showEvent;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BannerSuggestItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerSuggestItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BannerSuggestItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(BannerSuggestItem.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(BannerSuggestItem.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(BannerSuggestItem.class.getClassLoader());
            PaddingInfo paddingInfoCreateFromParcel = parcel.readInt() == 0 ? null : PaddingInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(BannerSuggestItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BannerSuggestItem(attributedText, attributedText2, universalColor, universalImage, paddingInfoCreateFromParcel, arrayList, parcel.readInt() != 0 ? ParametrizedEvent.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerSuggestItem[] newArray(int i12) {
            return new BannerSuggestItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerSuggestItem(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor, @l UniversalImage universalImage, @l PaddingInfo paddingInfo, @l List<? extends SuggestAction> list, @l ParametrizedEvent parametrizedEvent) {
        super(null);
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.backgroundColor = universalColor;
        this.image = universalImage;
        this.padding = paddingInfo;
        this.actions = list;
        this.showEvent = parametrizedEvent;
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
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final PaddingInfo getPadding() {
        return this.padding;
    }

    @l
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.image, flags);
        PaddingInfo paddingInfo = this.padding;
        if (paddingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paddingInfo.writeToParcel(parcel, flags);
        }
        List<SuggestAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ParametrizedEvent parametrizedEvent = this.showEvent;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, flags);
        }
    }
}
