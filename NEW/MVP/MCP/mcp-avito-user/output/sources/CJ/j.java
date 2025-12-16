package cJ;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LcJ/j;", "", "a", "b", "LcJ/j$a;", "LcJ/j$b;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface j {

    /* compiled from: Api2HotelByItemIdSearchOffersGetResponse.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B]\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"LcJ/j$a;", "LcJ/j;", "", "LcJ/a;", "amenities", "LcJ/h;", "bookingAvailableItems", "", "id", "Lcom/avito/android/remote/model/Image;", "images", "", "limit", "Lcom/avito/android/remote/model/text/AttributedText;", "moreButton", "title", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/util/List;", "getAmenities", "()Ljava/util/List;", "getBookingAvailableItems", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getImages", "Ljava/lang/Long;", "getLimit", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/text/AttributedText;", "getMoreButton", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements j {

        @com.google.gson.annotations.c("amenities")
        @Y61.l
        private final List<C27043a> amenities;

        @com.google.gson.annotations.c("bookingAvailableItems")
        @Y61.l
        private final List<h> bookingAvailableItems;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("images")
        @Y61.l
        private final List<Image> images;

        @com.google.gson.annotations.c("limit")
        @Y61.l
        private final Long limit;

        @com.google.gson.annotations.c("moreButton")
        @Y61.l
        private final AttributedText moreButton;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        public a(@Y61.l List<C27043a> list, @Y61.l List<h> list2, @Y61.k String str, @Y61.l List<Image> list3, @Y61.l Long l12, @Y61.l AttributedText attributedText, @Y61.l String str2) {
            this.amenities = list;
            this.bookingAvailableItems = list2;
            this.id = str;
            this.images = list3;
            this.limit = l12;
            this.moreButton = attributedText;
            this.title = str2;
        }
    }

    /* compiled from: Api2HotelByItemIdSearchOffersGetResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"LcJ/j$b;", "LcJ/j;", "LcJ/k;", "action", "LcJ/c;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LcJ/l;", "image", "LcJ/d;", "onShowEvent", "title", "<init>", "(LcJ/k;LcJ/c;Lcom/avito/android/remote/model/text/AttributedText;LcJ/l;LcJ/d;Lcom/avito/android/remote/model/text/AttributedText;)V", "LcJ/k;", "getAction", "()LcJ/k;", "LcJ/c;", "getBackground", "()LcJ/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "LcJ/l;", "getImage", "()LcJ/l;", "LcJ/d;", "getOnShowEvent", "()LcJ/d;", "getTitle", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements j {

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final k action;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @Y61.l
        private final C27045c background;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("image")
        @Y61.l
        private final l image;

        @com.google.gson.annotations.c("onShowEvent")
        @Y61.l
        private final C27046d onShowEvent;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final AttributedText title;

        public b(@Y61.l k kVar, @Y61.l C27045c c27045c, @Y61.l AttributedText attributedText, @Y61.l l lVar, @Y61.l C27046d c27046d, @Y61.l AttributedText attributedText2) {
            this.action = kVar;
            this.background = c27045c;
            this.description = attributedText;
            this.image = lVar;
            this.onShowEvent = c27046d;
            this.title = attributedText2;
        }
    }
}
