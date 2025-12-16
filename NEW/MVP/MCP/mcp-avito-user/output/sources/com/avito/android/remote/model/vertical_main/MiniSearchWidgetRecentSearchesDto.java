package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MiniSearchWidget.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$ItemDto;", "items", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;", "analytics", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;)Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;", "getAnalytics", "AnalyticsDto", "ItemDto", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MiniSearchWidgetRecentSearchesDto implements Parcelable {

    @k
    public static final Parcelable.Creator<MiniSearchWidgetRecentSearchesDto> CREATOR = new Creator();

    @c("analytics")
    @l
    private final AnalyticsDto analytics;

    @c("items")
    @l
    private final List<ItemDto> items;

    /* compiled from: MiniSearchWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "<init>", "(Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$AnalyticsDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getOnShowEvent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticsDto implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticsDto> CREATOR = new Creator();

        @c("onShow")
        @l
        private final ParametrizedEvent onShowEvent;

        /* compiled from: MiniSearchWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticsDto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticsDto createFromParcel(@k Parcel parcel) {
                return new AnalyticsDto(parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticsDto[] newArray(int i12) {
                return new AnalyticsDto[i12];
            }
        }

        public AnalyticsDto(@l ParametrizedEvent parametrizedEvent) {
            this.onShowEvent = parametrizedEvent;
        }

        public static /* synthetic */ AnalyticsDto copy$default(AnalyticsDto analyticsDto, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                parametrizedEvent = analyticsDto.onShowEvent;
            }
            return analyticsDto.copy(parametrizedEvent);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final ParametrizedEvent getOnShowEvent() {
            return this.onShowEvent;
        }

        @k
        public final AnalyticsDto copy(@l ParametrizedEvent onShowEvent) {
            return new AnalyticsDto(onShowEvent);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnalyticsDto) && L.f(this.onShowEvent, ((AnalyticsDto) other).onShowEvent);
        }

        @l
        public final ParametrizedEvent getOnShowEvent() {
            return this.onShowEvent;
        }

        public int hashCode() {
            ParametrizedEvent parametrizedEvent = this.onShowEvent;
            if (parametrizedEvent == null) {
                return 0;
            }
            return parametrizedEvent.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("AnalyticsDto(onShowEvent="), this.onShowEvent, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            ParametrizedEvent parametrizedEvent = this.onShowEvent;
            if (parametrizedEvent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parametrizedEvent.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MiniSearchWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniSearchWidgetRecentSearchesDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniSearchWidgetRecentSearchesDto createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ItemDto.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new MiniSearchWidgetRecentSearchesDto(arrayList, parcel.readInt() != 0 ? AnalyticsDto.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniSearchWidgetRecentSearchesDto[] newArray(int i12) {
            return new MiniSearchWidgetRecentSearchesDto[i12];
        }
    }

    /* compiled from: MiniSearchWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$ItemDto;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto$ItemDto;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemDto implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemDto> CREATOR = new Creator();

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: MiniSearchWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ItemDto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemDto createFromParcel(@k Parcel parcel) {
                return new ItemDto(parcel.readString(), (DeepLink) parcel.readParcelable(ItemDto.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemDto[] newArray(int i12) {
                return new ItemDto[i12];
            }
        }

        public ItemDto(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ ItemDto copy$default(ItemDto itemDto, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = itemDto.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = itemDto.uri;
            }
            return itemDto.copy(str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final ItemDto copy(@l String title, @l DeepLink uri) {
            return new ItemDto(title, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDto)) {
                return false;
            }
            ItemDto itemDto = (ItemDto) other;
            return L.f(this.title, itemDto.title) && L.f(this.uri, itemDto.uri);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ItemDto(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    public MiniSearchWidgetRecentSearchesDto(@l List<ItemDto> list, @l AnalyticsDto analyticsDto) {
        this.items = list;
        this.analytics = analyticsDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MiniSearchWidgetRecentSearchesDto copy$default(MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto, List list, AnalyticsDto analyticsDto, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = miniSearchWidgetRecentSearchesDto.items;
        }
        if ((i12 & 2) != 0) {
            analyticsDto = miniSearchWidgetRecentSearchesDto.analytics;
        }
        return miniSearchWidgetRecentSearchesDto.copy(list, analyticsDto);
    }

    @l
    public final List<ItemDto> component1() {
        return this.items;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AnalyticsDto getAnalytics() {
        return this.analytics;
    }

    @k
    public final MiniSearchWidgetRecentSearchesDto copy(@l List<ItemDto> items, @l AnalyticsDto analytics) {
        return new MiniSearchWidgetRecentSearchesDto(items, analytics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniSearchWidgetRecentSearchesDto)) {
            return false;
        }
        MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto = (MiniSearchWidgetRecentSearchesDto) other;
        return L.f(this.items, miniSearchWidgetRecentSearchesDto.items) && L.f(this.analytics, miniSearchWidgetRecentSearchesDto.analytics);
    }

    @l
    public final AnalyticsDto getAnalytics() {
        return this.analytics;
    }

    @l
    public final List<ItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<ItemDto> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AnalyticsDto analyticsDto = this.analytics;
        return iHashCode + (analyticsDto != null ? analyticsDto.hashCode() : 0);
    }

    @k
    public String toString() {
        return "MiniSearchWidgetRecentSearchesDto(items=" + this.items + ", analytics=" + this.analytics + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<ItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ItemDto) itA.next()).writeToParcel(parcel, flags);
            }
        }
        AnalyticsDto analyticsDto = this.analytics;
        if (analyticsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsDto.writeToParcel(parcel, flags);
        }
    }
}
