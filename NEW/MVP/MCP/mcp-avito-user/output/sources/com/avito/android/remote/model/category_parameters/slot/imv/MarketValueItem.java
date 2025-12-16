package com.avito.android.remote.model.category_parameters.slot.imv;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstantMarketValueResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem;", "", "()V", "Bubbles", "Description", "Notification", "Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem$Bubbles;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem$Description;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem$Notification;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class MarketValueItem {

    /* compiled from: InstantMarketValueResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem$Bubbles;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem;", "list", "", "Lcom/avito/android/remote/model/category_parameters/slot/imv/BubbleInfo;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Bubbles extends MarketValueItem {

        @c("list")
        @k
        private final List<BubbleInfo> list;

        public Bubbles(@k List<BubbleInfo> list) {
            super(null);
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Bubbles copy$default(Bubbles bubbles, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = bubbles.list;
            }
            return bubbles.copy(list);
        }

        @k
        public final List<BubbleInfo> component1() {
            return this.list;
        }

        @k
        public final Bubbles copy(@k List<BubbleInfo> list) {
            return new Bubbles(list);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Bubbles) && L.f(this.list, ((Bubbles) other).list);
        }

        @k
        public final List<BubbleInfo> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("Bubbles(list="), this.list, ')');
        }
    }

    /* compiled from: InstantMarketValueResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem$Description;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem;", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Description extends MarketValueItem {

        @c("description")
        @k
        private final AttributedText text;

        public Description(@k AttributedText attributedText) {
            super(null);
            this.text = attributedText;
        }

        public static /* synthetic */ Description copy$default(Description description, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = description.text;
            }
            return description.copy(attributedText);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final Description copy(@k AttributedText text) {
            return new Description(text);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Description) && L.f(this.text, ((Description) other).text);
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @k
        public String toString() {
            return a.w(new StringBuilder("Description(text="), this.text, ')');
        }
    }

    /* compiled from: InstantMarketValueResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem$Notification;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/MarketValueItem;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo;", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo;)V", "getInfo", "()Lcom/avito/android/remote/model/category_parameters/slot/imv/NotificationInfo;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Notification extends MarketValueItem {

        @c(NotificationsSettings.Section.SECTION_PAID_SERVICES)
        @k
        private final NotificationInfo info;

        public Notification(@k NotificationInfo notificationInfo) {
            super(null);
            this.info = notificationInfo;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, NotificationInfo notificationInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                notificationInfo = notification.info;
            }
            return notification.copy(notificationInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final NotificationInfo getInfo() {
            return this.info;
        }

        @k
        public final Notification copy(@k NotificationInfo info) {
            return new Notification(info);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Notification) && L.f(this.info, ((Notification) other).info);
        }

        @k
        public final NotificationInfo getInfo() {
            return this.info;
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        @k
        public String toString() {
            return "Notification(info=" + this.info + ')';
        }
    }

    public /* synthetic */ MarketValueItem(C42822w c42822w) {
        this();
    }

    private MarketValueItem() {
    }
}
