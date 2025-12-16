package com.avito.android.remote.model.common.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusItem.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002:;BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001b¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationStatusItem;", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "Lcom/avito/android/remote/model/common/items/VerificationStatusItem$State;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/common/items/VerificationStatusItem$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "body", "Lcom/avito/android/remote/model/common/VerificationAction;", "action", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/common/items/VerificationStatusItem$State;Lcom/avito/android/remote/model/common/items/VerificationStatusItem$Style;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/common/VerificationAction;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/common/items/VerificationStatusItem$State;", "component2", "()Lcom/avito/android/remote/model/common/items/VerificationStatusItem$Style;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Lcom/avito/android/remote/model/common/VerificationAction;", "component6", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/common/items/VerificationStatusItem$State;Lcom/avito/android/remote/model/common/items/VerificationStatusItem$Style;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/common/VerificationAction;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/common/items/VerificationStatusItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/common/items/VerificationStatusItem$State;", "getState", "Lcom/avito/android/remote/model/common/items/VerificationStatusItem$Style;", "getStyle", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getBody", "Lcom/avito/android/remote/model/common/VerificationAction;", "getAction", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "State", "Style", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationStatusItem implements VerificationListItem {

    @k
    public static final Parcelable.Creator<VerificationStatusItem> CREATOR = new Creator();

    @c("action")
    @l
    private final VerificationAction action;

    @c("body")
    @l
    private final AttributedText body;

    @c("image")
    @l
    private final UniversalImage image;

    @c(VoiceInfo.STATE)
    @l
    private final State state;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationStatusItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationStatusItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStatusItem createFromParcel(@k Parcel parcel) {
            return new VerificationStatusItem(parcel.readInt() == 0 ? null : State.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readString(), (AttributedText) parcel.readParcelable(VerificationStatusItem.class.getClassLoader()), parcel.readInt() != 0 ? VerificationAction.CREATOR.createFromParcel(parcel) : null, (UniversalImage) parcel.readParcelable(VerificationStatusItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStatusItem[] newArray(int i12) {
            return new VerificationStatusItem[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationStatusItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationStatusItem$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "PENDING", "FAILURE", "SUCCESS", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @c("default")
        public static final State DEFAULT = new State("DEFAULT", 0);

        @c("pending")
        public static final State PENDING = new State("PENDING", 1);

        @c("failure")
        public static final State FAILURE = new State("FAILURE", 2);

        @c("success")
        public static final State SUCCESS = new State("SUCCESS", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DEFAULT, PENDING, FAILURE, SUCCESS};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = kotlin.enums.c.a(stateArr$values);
        }

        private State(String str, int i12) {
        }

        @k
        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationStatusItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationStatusItem$Style;", "", "(Ljava/lang/String;I)V", "DEFAULT", "GROUPS", "MODERN", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @c("default")
        public static final Style DEFAULT = new Style("DEFAULT", 0);

        @c("groups")
        public static final Style GROUPS = new Style("GROUPS", 1);

        @c("modern")
        public static final Style MODERN = new Style("MODERN", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{DEFAULT, GROUPS, MODERN};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = kotlin.enums.c.a(styleArr$values);
        }

        private Style(String str, int i12) {
        }

        @k
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public VerificationStatusItem(@l State state, @l Style style, @l String str, @l AttributedText attributedText, @l VerificationAction verificationAction, @l UniversalImage universalImage) {
        this.state = state;
        this.style = style;
        this.title = str;
        this.body = attributedText;
        this.action = verificationAction;
        this.image = universalImage;
    }

    public static /* synthetic */ VerificationStatusItem copy$default(VerificationStatusItem verificationStatusItem, State state, Style style, String str, AttributedText attributedText, VerificationAction verificationAction, UniversalImage universalImage, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            state = verificationStatusItem.state;
        }
        if ((i12 & 2) != 0) {
            style = verificationStatusItem.style;
        }
        Style style2 = style;
        if ((i12 & 4) != 0) {
            str = verificationStatusItem.title;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            attributedText = verificationStatusItem.body;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 16) != 0) {
            verificationAction = verificationStatusItem.action;
        }
        VerificationAction verificationAction2 = verificationAction;
        if ((i12 & 32) != 0) {
            universalImage = verificationStatusItem.image;
        }
        return verificationStatusItem.copy(state, style2, str2, attributedText2, verificationAction2, universalImage);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getBody() {
        return this.body;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final VerificationAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final VerificationStatusItem copy(@l State state, @l Style style, @l String title, @l AttributedText body, @l VerificationAction action, @l UniversalImage image) {
        return new VerificationStatusItem(state, style, title, body, action, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationStatusItem)) {
            return false;
        }
        VerificationStatusItem verificationStatusItem = (VerificationStatusItem) other;
        return this.state == verificationStatusItem.state && this.style == verificationStatusItem.style && L.f(this.title, verificationStatusItem.title) && L.f(this.body, verificationStatusItem.body) && L.f(this.action, verificationStatusItem.action) && L.f(this.image, verificationStatusItem.image);
    }

    @l
    public final VerificationAction getAction() {
        return this.action;
    }

    @l
    public final AttributedText getBody() {
        return this.body;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final State getState() {
        return this.state;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        State state = this.state;
        int iHashCode = (state == null ? 0 : state.hashCode()) * 31;
        Style style = this.style;
        int iHashCode2 = (iHashCode + (style == null ? 0 : style.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.body;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        VerificationAction verificationAction = this.action;
        int iHashCode5 = (iHashCode4 + (verificationAction == null ? 0 : verificationAction.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        return iHashCode5 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStatusItem(state=");
        sb2.append(this.state);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        State state = this.state;
        if (state == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(state.name());
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.body, flags);
        VerificationAction verificationAction = this.action;
        if (verificationAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
    }
}
