package com.avito.android.remote.model.category_parameters.slot.card_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CardSelectSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ8\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\r¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelect;", "cards", "Lcom/avito/android/remote/model/UniversalColor;", "checkedBackgroundColor", "defaultBackgroundColor", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getCards", "setCards", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getCheckedBackgroundColor", "getDefaultBackgroundColor", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CardSelectSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<CardSelectSlotConfig> CREATOR = new Creator();

    @c("cards")
    @k
    private List<CardSelect> cards;

    @c("checkedBackgroundColor")
    @l
    private final UniversalColor checkedBackgroundColor;

    @c("defaultBackgroundColor")
    @l
    private final UniversalColor defaultBackgroundColor;

    /* compiled from: CardSelectSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardSelectSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CardSelectSlotConfig createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(CardSelect.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CardSelectSlotConfig(arrayList, (UniversalColor) parcel.readParcelable(CardSelectSlotConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(CardSelectSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CardSelectSlotConfig[] newArray(int i12) {
            return new CardSelectSlotConfig[i12];
        }
    }

    public CardSelectSlotConfig(@k List<CardSelect> list, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.cards = list;
        this.checkedBackgroundColor = universalColor;
        this.defaultBackgroundColor = universalColor2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardSelectSlotConfig copy$default(CardSelectSlotConfig cardSelectSlotConfig, List list, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = cardSelectSlotConfig.cards;
        }
        if ((i12 & 2) != 0) {
            universalColor = cardSelectSlotConfig.checkedBackgroundColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = cardSelectSlotConfig.defaultBackgroundColor;
        }
        return cardSelectSlotConfig.copy(list, universalColor, universalColor2);
    }

    @k
    public final List<CardSelect> component1() {
        return this.cards;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getCheckedBackgroundColor() {
        return this.checkedBackgroundColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @k
    public final CardSelectSlotConfig copy(@k List<CardSelect> cards, @l UniversalColor checkedBackgroundColor, @l UniversalColor defaultBackgroundColor) {
        return new CardSelectSlotConfig(cards, checkedBackgroundColor, defaultBackgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSelectSlotConfig)) {
            return false;
        }
        CardSelectSlotConfig cardSelectSlotConfig = (CardSelectSlotConfig) other;
        return L.f(this.cards, cardSelectSlotConfig.cards) && L.f(this.checkedBackgroundColor, cardSelectSlotConfig.checkedBackgroundColor) && L.f(this.defaultBackgroundColor, cardSelectSlotConfig.defaultBackgroundColor);
    }

    @k
    public final List<CardSelect> getCards() {
        return this.cards;
    }

    @l
    public final UniversalColor getCheckedBackgroundColor() {
        return this.checkedBackgroundColor;
    }

    @l
    public final UniversalColor getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    public int hashCode() {
        int iHashCode = this.cards.hashCode() * 31;
        UniversalColor universalColor = this.checkedBackgroundColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.defaultBackgroundColor;
        return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
    }

    public final void setCards(@k List<CardSelect> list) {
        this.cards = list;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CardSelectSlotConfig(cards=");
        sb2.append(this.cards);
        sb2.append(", checkedBackgroundColor=");
        sb2.append(this.checkedBackgroundColor);
        sb2.append(", defaultBackgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.defaultBackgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.cards, parcel);
        while (itJ.hasNext()) {
            ((CardSelect) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.checkedBackgroundColor, flags);
        parcel.writeParcelable(this.defaultBackgroundColor, flags);
    }
}
