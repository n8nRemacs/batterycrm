package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\rHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselValue;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "canEnable", "", "enabled", "items", "", "Lcom/avito/android/remote/model/extended/CarouselValue$AdvertItem;", "nameId", "", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZZLjava/util/List;I)V", "getCanEnable", "()Z", "getEnabled", "getItems", "()Ljava/util/List;", "getNameId", "()I", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", PluralsKeys.OTHER, "hashCode", "toString", "AdvertItem", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarouselValue {

    @c("canEnable")
    private final boolean canEnable;

    @c("enabled")
    private final boolean enabled;

    @c("items")
    @k
    private final List<AdvertItem> items;

    @c("nameId")
    private final int nameId;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselValue$AdvertItem;", "", "type", "", "value", "Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel;)V", "getType", "()Ljava/lang/String;", "getValue", "()Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertItem {

        @c("type")
        @k
        private final String type;

        @c("value")
        @k
        private final ExtendedProfileAdvertModel value;

        public AdvertItem(@k String str, @k ExtendedProfileAdvertModel extendedProfileAdvertModel) {
            this.type = str;
            this.value = extendedProfileAdvertModel;
        }

        public static /* synthetic */ AdvertItem copy$default(AdvertItem advertItem, String str, ExtendedProfileAdvertModel extendedProfileAdvertModel, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = advertItem.type;
            }
            if ((i12 & 2) != 0) {
                extendedProfileAdvertModel = advertItem.value;
            }
            return advertItem.copy(str, extendedProfileAdvertModel);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final ExtendedProfileAdvertModel getValue() {
            return this.value;
        }

        @k
        public final AdvertItem copy(@k String type, @k ExtendedProfileAdvertModel value) {
            return new AdvertItem(type, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvertItem)) {
                return false;
            }
            AdvertItem advertItem = (AdvertItem) other;
            return L.f(this.type, advertItem.type) && L.f(this.value, advertItem.value);
        }

        @k
        public final String getType() {
            return this.type;
        }

        @k
        public final ExtendedProfileAdvertModel getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        @k
        public String toString() {
            return "AdvertItem(type=" + this.type + ", value=" + this.value + ')';
        }
    }

    public CarouselValue(@k String str, @l AttributedText attributedText, boolean z12, boolean z13, @k List<AdvertItem> list, int i12) {
        this.title = str;
        this.subtitle = attributedText;
        this.canEnable = z12;
        this.enabled = z13;
        this.items = list;
        this.nameId = i12;
    }

    public static /* synthetic */ CarouselValue copy$default(CarouselValue carouselValue, String str, AttributedText attributedText, boolean z12, boolean z13, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = carouselValue.title;
        }
        if ((i13 & 2) != 0) {
            attributedText = carouselValue.subtitle;
        }
        AttributedText attributedText2 = attributedText;
        if ((i13 & 4) != 0) {
            z12 = carouselValue.canEnable;
        }
        boolean z14 = z12;
        if ((i13 & 8) != 0) {
            z13 = carouselValue.enabled;
        }
        boolean z15 = z13;
        if ((i13 & 16) != 0) {
            list = carouselValue.items;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            i12 = carouselValue.nameId;
        }
        return carouselValue.copy(str, attributedText2, z14, z15, list2, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanEnable() {
        return this.canEnable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @k
    public final List<AdvertItem> component5() {
        return this.items;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @k
    public final CarouselValue copy(@k String title, @l AttributedText subtitle, boolean canEnable, boolean enabled, @k List<AdvertItem> items, int nameId) {
        return new CarouselValue(title, subtitle, canEnable, enabled, items, nameId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselValue)) {
            return false;
        }
        CarouselValue carouselValue = (CarouselValue) other;
        return L.f(this.title, carouselValue.title) && L.f(this.subtitle, carouselValue.subtitle) && this.canEnable == carouselValue.canEnable && this.enabled == carouselValue.enabled && L.f(this.items, carouselValue.items) && this.nameId == carouselValue.nameId;
    }

    public final boolean getCanEnable() {
        return this.canEnable;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @k
    public final List<AdvertItem> getItems() {
        return this.items;
    }

    public final int getNameId() {
        return this.nameId;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        return Integer.hashCode(this.nameId) + H.e(r.i(r.i((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.canEnable), 31, this.enabled), 31, this.items);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselValue(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", canEnable=");
        sb2.append(this.canEnable);
        sb2.append(", enabled=");
        sb2.append(this.enabled);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", nameId=");
        return r.t(sb2, this.nameId, ')');
    }
}
