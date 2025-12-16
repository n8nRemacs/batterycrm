package com.avito.android.remote.model.inn.items;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationGroupItem.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00011Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationGroupItem;", "Lcom/avito/android/remote/model/inn/items/VerificationInnItem;", "id", "", "hiddenIf", "", "", "title", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "image", "Lcom/avito/android/remote/model/UniversalImage;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/inn/items/VerificationGroupItem$State;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/inn/items/VerificationGroupItem$State;Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;)V", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getHiddenIf", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "getState", "()Lcom/avito/android/remote/model/inn/items/VerificationGroupItem$State;", "getStyle", "()Lcom/avito/android/remote/model/inn/items/VerificationInnItem$Style;", "getTitle", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "State", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationGroupItem implements VerificationInnItem {

    @c("description")
    @l
    private final AttributedText description;

    @c("hiddenIf")
    @l
    private final Map<String, Boolean> hiddenIf;

    @c("id")
    @k
    private final String id;

    @c("image")
    @l
    private final UniversalImage image;

    @c(VoiceInfo.STATE)
    @l
    private final State state;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final VerificationInnItem.Style style;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationGroupItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationGroupItem$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "PENDING", "FAILURE", "SUCCESS", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public VerificationGroupItem(@k String str, @l Map<String, Boolean> map, @l String str2, @l AttributedText attributedText, @l UniversalImage universalImage, @l DeepLink deepLink, @l State state, @l VerificationInnItem.Style style) {
        this.id = str;
        this.hiddenIf = map;
        this.title = str2;
        this.description = attributedText;
        this.image = universalImage;
        this.uri = deepLink;
        this.state = state;
        this.style = style;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final Map<String, Boolean> component2() {
        return this.hiddenIf;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final VerificationInnItem.Style getStyle() {
        return this.style;
    }

    @k
    public final VerificationGroupItem copy(@k String id2, @l Map<String, Boolean> hiddenIf, @l String title, @l AttributedText description, @l UniversalImage image, @l DeepLink uri, @l State state, @l VerificationInnItem.Style style) {
        return new VerificationGroupItem(id2, hiddenIf, title, description, image, uri, state, style);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationGroupItem)) {
            return false;
        }
        VerificationGroupItem verificationGroupItem = (VerificationGroupItem) other;
        return L.f(this.id, verificationGroupItem.id) && L.f(this.hiddenIf, verificationGroupItem.hiddenIf) && L.f(this.title, verificationGroupItem.title) && L.f(this.description, verificationGroupItem.description) && L.f(this.image, verificationGroupItem.image) && L.f(this.uri, verificationGroupItem.uri) && this.state == verificationGroupItem.state && L.f(this.style, verificationGroupItem.style);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final Map<String, Boolean> getHiddenIf() {
        return this.hiddenIf;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final State getState() {
        return this.state;
    }

    @Override // com.avito.android.remote.model.inn.items.VerificationInnItem
    @l
    public VerificationInnItem.Style getStyle() {
        return this.style;
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
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Boolean> map = this.hiddenIf;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.uri;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        State state = this.state;
        int iHashCode7 = (iHashCode6 + (state == null ? 0 : state.hashCode())) * 31;
        VerificationInnItem.Style style = this.style;
        return iHashCode7 + (style != null ? style.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationGroupItem(id=" + this.id + ", hiddenIf=" + this.hiddenIf + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", uri=" + this.uri + ", state=" + this.state + ", style=" + this.style + ')';
    }

    public /* synthetic */ VerificationGroupItem(String str, Map map, String str2, AttributedText attributedText, UniversalImage universalImage, DeepLink deepLink, State state, VerificationInnItem.Style style, int i12, C42822w c42822w) {
        this(str, map, str2, attributedText, universalImage, deepLink, state, (i12 & 128) != 0 ? null : style);
    }
}
