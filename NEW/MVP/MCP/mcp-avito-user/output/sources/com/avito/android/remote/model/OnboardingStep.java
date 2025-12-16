package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStep.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u000201B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/OnboardingStep;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "showMore", "Lcom/avito/android/remote/model/OnboardingStep$Button;", "button", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/OnboardingStep$Button;Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/OnboardingStep$Button;", "component5", "()Lcom/avito/android/remote/model/Image;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/OnboardingStep$Button;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/OnboardingStep;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "getShowMore", "Lcom/avito/android/remote/model/OnboardingStep$Button;", "getButton", "Lcom/avito/android/remote/model/Image;", "getImage", "Button", "Event", "_avito-discouraged_avito-api_onboarding"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OnboardingStep implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingStep> CREATOR = new Creator();

    @c("button")
    @l
    private final Button button;

    @c("images")
    @l
    private final Image image;

    @c("showMore")
    @l
    private final AttributedText showMore;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: OnboardingStep.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/OnboardingStep$Button;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/OnboardingStep$Event;", "event", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "closeOnClick", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/OnboardingStep$Event;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/OnboardingStep$Event;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/OnboardingStep$Event;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/OnboardingStep$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/OnboardingStep$Event;", "getEvent", "getStyle", "Ljava/lang/Boolean;", "getCloseOnClick", "_avito-discouraged_avito-api_onboarding"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c("closeOnClick")
        @l
        private final Boolean closeOnClick;

        @c("link")
        @l
        private final DeepLink deeplink;

        @c("clickEvent")
        @l
        private final Event event;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: OnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Button.class.getClassLoader());
                Event eventCreateFromParcel = parcel.readInt() == 0 ? null : Event.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Button(string, deepLink, eventCreateFromParcel, string2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l DeepLink deepLink, @l Event event, @l String str2, @l Boolean bool) {
            this.title = str;
            this.deeplink = deepLink;
            this.event = event;
            this.style = str2;
            this.closeOnClick = bool;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, DeepLink deepLink, Event event, String str2, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = button.deeplink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 4) != 0) {
                event = button.event;
            }
            Event event2 = event;
            if ((i12 & 8) != 0) {
                str2 = button.style;
            }
            String str3 = str2;
            if ((i12 & 16) != 0) {
                bool = button.closeOnClick;
            }
            return button.copy(str, deepLink2, event2, str3, bool);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Event getEvent() {
            return this.event;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Boolean getCloseOnClick() {
            return this.closeOnClick;
        }

        @k
        public final Button copy(@k String title, @l DeepLink deeplink, @l Event event, @l String style, @l Boolean closeOnClick) {
            return new Button(title, deeplink, event, style, closeOnClick);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.title, button.title) && L.f(this.deeplink, button.deeplink) && L.f(this.event, button.event) && L.f(this.style, button.style) && L.f(this.closeOnClick, button.closeOnClick);
        }

        @l
        public final Boolean getCloseOnClick() {
            return this.closeOnClick;
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final Event getEvent() {
            return this.event;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deeplink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Event event = this.event;
            int iHashCode3 = (iHashCode2 + (event == null ? 0 : event.hashCode())) * 31;
            String str = this.style;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.closeOnClick;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", event=");
            sb2.append(this.event);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", closeOnClick=");
            return C0.g(sb2, this.closeOnClick, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deeplink, flags);
            Event event = this.event;
            if (event == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                event.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.style);
            Boolean bool = this.closeOnClick;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingStep> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingStep createFromParcel(@k Parcel parcel) {
            return new OnboardingStep((AttributedText) parcel.readParcelable(OnboardingStep.class.getClassLoader()), (AttributedText) parcel.readParcelable(OnboardingStep.class.getClassLoader()), (AttributedText) parcel.readParcelable(OnboardingStep.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), (Image) parcel.readParcelable(OnboardingStep.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingStep[] newArray(int i12) {
            return new OnboardingStep[i12];
        }
    }

    /* compiled from: OnboardingStep.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/OnboardingStep$Event;", "Landroid/os/Parcelable;", "", "eventId", "version", "", "", "params", "<init>", "(IILjava/util/Map;)V", "component1", "()I", "component2", "component3", "()Ljava/util/Map;", "copy", "(IILjava/util/Map;)Lcom/avito/android/remote/model/OnboardingStep$Event;", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getEventId", "getVersion", "Ljava/util/Map;", "getParams", "_avito-discouraged_avito-api_onboarding"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Event implements Parcelable {

        @k
        public static final Parcelable.Creator<Event> CREATOR = new Creator();

        @c("eventId")
        private final int eventId;

        @c("params")
        @l
        private final Map<String, String> params;

        @c("version")
        private final int version;

        /* compiled from: OnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Event> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Event createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Event(i12, i13, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Event[] newArray(int i12) {
                return new Event[i12];
            }
        }

        public Event(int i12, int i13, @l Map<String, String> map) {
            this.eventId = i12;
            this.version = i13;
            this.params = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, int i12, int i13, Map map, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = event.eventId;
            }
            if ((i14 & 2) != 0) {
                i13 = event.version;
            }
            if ((i14 & 4) != 0) {
                map = event.params;
            }
            return event.copy(i12, i13, map);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        @l
        public final Map<String, String> component3() {
            return this.params;
        }

        @k
        public final Event copy(int eventId, int version, @l Map<String, String> params) {
            return new Event(eventId, version, params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return this.eventId == event.eventId && this.version == event.version && L.f(this.params, event.params);
        }

        public final int getEventId() {
            return this.eventId;
        }

        @l
        public final Map<String, String> getParams() {
            return this.params;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iE2 = r.e(this.version, Integer.hashCode(this.eventId) * 31, 31);
            Map<String, String> map = this.params;
            return iE2 + (map == null ? 0 : map.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Event(eventId=");
            sb2.append(this.eventId);
            sb2.append(", version=");
            sb2.append(this.version);
            sb2.append(", params=");
            return r.w(sb2, this.params, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.eventId);
            parcel.writeInt(this.version);
            Map<String, String> map = this.params;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    public OnboardingStep(@k AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l Button button, @l Image image) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.showMore = attributedText3;
        this.button = button;
        this.image = image;
    }

    public static /* synthetic */ OnboardingStep copy$default(OnboardingStep onboardingStep, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, Button button, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = onboardingStep.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = onboardingStep.subtitle;
        }
        AttributedText attributedText4 = attributedText2;
        if ((i12 & 4) != 0) {
            attributedText3 = onboardingStep.showMore;
        }
        AttributedText attributedText5 = attributedText3;
        if ((i12 & 8) != 0) {
            button = onboardingStep.button;
        }
        Button button2 = button;
        if ((i12 & 16) != 0) {
            image = onboardingStep.image;
        }
        return onboardingStep.copy(attributedText, attributedText4, attributedText5, button2, image);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getShowMore() {
        return this.showMore;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    public final OnboardingStep copy(@k AttributedText title, @l AttributedText subtitle, @l AttributedText showMore, @l Button button, @l Image image) {
        return new OnboardingStep(title, subtitle, showMore, button, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingStep)) {
            return false;
        }
        OnboardingStep onboardingStep = (OnboardingStep) other;
        return L.f(this.title, onboardingStep.title) && L.f(this.subtitle, onboardingStep.subtitle) && L.f(this.showMore, onboardingStep.showMore) && L.f(this.button, onboardingStep.button) && L.f(this.image, onboardingStep.image);
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final AttributedText getShowMore() {
        return this.showMore;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.showMore;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Button button = this.button;
        int iHashCode4 = (iHashCode3 + (button == null ? 0 : button.hashCode())) * 31;
        Image image = this.image;
        return iHashCode4 + (image != null ? image.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingStep(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", showMore=");
        sb2.append(this.showMore);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", image=");
        return AK.c.o(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.showMore, flags);
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
    }
}
