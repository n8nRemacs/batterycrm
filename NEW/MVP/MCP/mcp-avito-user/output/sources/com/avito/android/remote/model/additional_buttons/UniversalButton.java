package com.avito.android.remote.model.additional_buttons;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdditionalButtons.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/additional_buttons/UniversalButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/ParametrizedEvent;", "clickEvent", "showEvent", "Lcom/avito/android/remote/model/additional_buttons/UniversalButton$ShowCondition;", "showCondition", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/additional_buttons/UniversalButton$ShowCondition;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "component4", "component5", "()Lcom/avito/android/remote/model/additional_buttons/UniversalButton$ShowCondition;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/additional_buttons/UniversalButton$ShowCondition;)Lcom/avito/android/remote/model/additional_buttons/UniversalButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getClickEvent", "getShowEvent", "Lcom/avito/android/remote/model/additional_buttons/UniversalButton$ShowCondition;", "getShowCondition", "ShowCondition", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalButton implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalButton> CREATOR = new Creator();

    @c("clickEvent")
    @l
    private final ParametrizedEvent clickEvent;

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("showCondition")
    @k
    private final ShowCondition showCondition;

    @c("showEvent")
    @l
    private final ParametrizedEvent showEvent;

    @c("title")
    @k
    private final String title;

    /* compiled from: AdditionalButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalButton createFromParcel(@k Parcel parcel) {
            return new UniversalButton(parcel.readString(), (DeepLink) parcel.readParcelable(UniversalButton.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(UniversalButton.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(UniversalButton.class.getClassLoader()), ShowCondition.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalButton[] newArray(int i12) {
            return new UniversalButton[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdditionalButtons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/additional_buttons/UniversalButton$ShowCondition;", "", "(Ljava/lang/String;I)V", "ITEMS_ARE_DISPLAYED", "ALL_ITEMS_VIEWED", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowCondition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ShowCondition[] $VALUES;

        @c("itemsAreDisplayed")
        public static final ShowCondition ITEMS_ARE_DISPLAYED = new ShowCondition("ITEMS_ARE_DISPLAYED", 0);

        @c("allItemsViewed")
        public static final ShowCondition ALL_ITEMS_VIEWED = new ShowCondition("ALL_ITEMS_VIEWED", 1);

        private static final /* synthetic */ ShowCondition[] $values() {
            return new ShowCondition[]{ITEMS_ARE_DISPLAYED, ALL_ITEMS_VIEWED};
        }

        static {
            ShowCondition[] showConditionArr$values = $values();
            $VALUES = showConditionArr$values;
            $ENTRIES = kotlin.enums.c.a(showConditionArr$values);
        }

        private ShowCondition(String str, int i12) {
        }

        @k
        public static a<ShowCondition> getEntries() {
            return $ENTRIES;
        }

        public static ShowCondition valueOf(String str) {
            return (ShowCondition) Enum.valueOf(ShowCondition.class, str);
        }

        public static ShowCondition[] values() {
            return (ShowCondition[]) $VALUES.clone();
        }
    }

    public UniversalButton(@k String str, @k DeepLink deepLink, @l ParametrizedEvent parametrizedEvent, @l ParametrizedEvent parametrizedEvent2, @k ShowCondition showCondition) {
        this.title = str;
        this.deeplink = deepLink;
        this.clickEvent = parametrizedEvent;
        this.showEvent = parametrizedEvent2;
        this.showCondition = showCondition;
    }

    public static /* synthetic */ UniversalButton copy$default(UniversalButton universalButton, String str, DeepLink deepLink, ParametrizedEvent parametrizedEvent, ParametrizedEvent parametrizedEvent2, ShowCondition showCondition, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalButton.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = universalButton.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            parametrizedEvent = universalButton.clickEvent;
        }
        ParametrizedEvent parametrizedEvent3 = parametrizedEvent;
        if ((i12 & 8) != 0) {
            parametrizedEvent2 = universalButton.showEvent;
        }
        ParametrizedEvent parametrizedEvent4 = parametrizedEvent2;
        if ((i12 & 16) != 0) {
            showCondition = universalButton.showCondition;
        }
        return universalButton.copy(str, deepLink2, parametrizedEvent3, parametrizedEvent4, showCondition);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ParametrizedEvent getClickEvent() {
        return this.clickEvent;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final ShowCondition getShowCondition() {
        return this.showCondition;
    }

    @k
    public final UniversalButton copy(@k String title, @k DeepLink deeplink, @l ParametrizedEvent clickEvent, @l ParametrizedEvent showEvent, @k ShowCondition showCondition) {
        return new UniversalButton(title, deeplink, clickEvent, showEvent, showCondition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalButton)) {
            return false;
        }
        UniversalButton universalButton = (UniversalButton) other;
        return L.f(this.title, universalButton.title) && L.f(this.deeplink, universalButton.deeplink) && L.f(this.clickEvent, universalButton.clickEvent) && L.f(this.showEvent, universalButton.showEvent) && this.showCondition == universalButton.showCondition;
    }

    @l
    public final ParametrizedEvent getClickEvent() {
        return this.clickEvent;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final ShowCondition getShowCondition() {
        return this.showCondition;
    }

    @l
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.deeplink, this.title.hashCode() * 31, 31);
        ParametrizedEvent parametrizedEvent = this.clickEvent;
        int iHashCode = (iE2 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent2 = this.showEvent;
        return this.showCondition.hashCode() + ((iHashCode + (parametrizedEvent2 != null ? parametrizedEvent2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "UniversalButton(title=" + this.title + ", deeplink=" + this.deeplink + ", clickEvent=" + this.clickEvent + ", showEvent=" + this.showEvent + ", showCondition=" + this.showCondition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeParcelable(this.clickEvent, flags);
        parcel.writeParcelable(this.showEvent, flags);
        parcel.writeString(this.showCondition.name());
    }

    public /* synthetic */ UniversalButton(String str, DeepLink deepLink, ParametrizedEvent parametrizedEvent, ParametrizedEvent parametrizedEvent2, ShowCondition showCondition, int i12, C42822w c42822w) {
        this(str, deepLink, parametrizedEvent, parametrizedEvent2, (i12 & 16) != 0 ? ShowCondition.ITEMS_ARE_DISPLAYED : showCondition);
    }
}
