package eJ;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LeJ/n;", "", "a", "b", "LeJ/n$a;", "LeJ/n$b;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface n {

    /* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001Bc\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006&"}, d2 = {"LeJ/n$a;", "LeJ/n;", "", "LeJ/a;", "amenities", "LeJ/d;", "bookingAvailableItems", "", "id", "Lcom/avito/android/remote/model/Image;", "images", "", "limit", "Lcom/avito/android/remote/model/text/AttributedText;", "moreButton", "Lcom/avito/android/deep_linking/links/DeepLink;", "roomInfoDeeplink", "title", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;JLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "J", "e", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "h", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements n {

        @com.google.gson.annotations.c("amenities")
        @Y61.l
        private final List<C40009a> amenities;

        @com.google.gson.annotations.c("bookingAvailableItems")
        @Y61.l
        private final List<C40012d> bookingAvailableItems;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("images")
        @Y61.l
        private final List<Image> images;

        @com.google.gson.annotations.c("limit")
        private final long limit;

        @com.google.gson.annotations.c("moreButton")
        @Y61.l
        private final AttributedText moreButton;

        @com.google.gson.annotations.c("roomInfoDeeplink")
        @Y61.l
        private final DeepLink roomInfoDeeplink;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public a(@Y61.l List<C40009a> list, @Y61.l List<C40012d> list2, @Y61.k String str, @Y61.l List<Image> list3, long j12, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.k String str2) {
            this.amenities = list;
            this.bookingAvailableItems = list2;
            this.id = str;
            this.images = list3;
            this.limit = j12;
            this.moreButton = attributedText;
            this.roomInfoDeeplink = deepLink;
            this.title = str2;
        }

        @Y61.l
        public final List<C40009a> a() {
            return this.amenities;
        }

        @Y61.l
        public final List<C40012d> b() {
            return this.bookingAvailableItems;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.l
        public final List<Image> d() {
            return this.images;
        }

        /* renamed from: e, reason: from getter */
        public final long getLimit() {
            return this.limit;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final AttributedText getMoreButton() {
            return this.moreButton;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final DeepLink getRoomInfoDeeplink() {
            return this.roomInfoDeeplink;
        }

        @Y61.k
        /* renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"LeJ/n$b;", "LeJ/n;", "LeJ/o;", "action", "LeJ/c;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LeJ/p;", "image", "LeJ/f;", "onShowEvent", "title", "<init>", "(LeJ/o;LeJ/c;Lcom/avito/android/remote/model/text/AttributedText;LeJ/p;LeJ/f;Lcom/avito/android/remote/model/text/AttributedText;)V", "LeJ/o;", "a", "()LeJ/o;", "LeJ/c;", "b", "()LeJ/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LeJ/p;", "d", "()LeJ/p;", "LeJ/f;", "e", "()LeJ/f;", "f", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements n {

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final o action;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @Y61.l
        private final C40011c background;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("image")
        @Y61.l
        private final p image;

        @com.google.gson.annotations.c("onShowEvent")
        @Y61.l
        private final f onShowEvent;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final AttributedText title;

        public b(@Y61.l o oVar, @Y61.l C40011c c40011c, @Y61.l AttributedText attributedText, @Y61.l p pVar, @Y61.l f fVar, @Y61.l AttributedText attributedText2) {
            this.action = oVar;
            this.background = c40011c;
            this.description = attributedText;
            this.image = pVar;
            this.onShowEvent = fVar;
            this.title = attributedText2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final o getAction() {
            return this.action;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final C40011c getBackground() {
            return this.background;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final p getImage() {
            return this.image;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final f getOnShowEvent() {
            return this.onShowEvent;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }
}
