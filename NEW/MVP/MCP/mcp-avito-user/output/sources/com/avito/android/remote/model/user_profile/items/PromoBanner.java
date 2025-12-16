package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoBanner.kt */
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u00039:;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\\\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001a¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PromoBanner;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "", "Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Image;", "images", "Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;", "clickAction", "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Ljava/util/List;Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;", "component6", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Ljava/util/List;Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/user_profile/items/PromoBanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Ljava/util/List;", "getImages", "Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;", "getClickAction", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getShowEvent", "ClickAction", "Image", "Position", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoBanner extends UserProfileItem {

    @k
    public static final Parcelable.Creator<PromoBanner> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("clickAction")
    @l
    private final ClickAction clickAction;

    @c("images")
    @l
    private final List<Image> images;

    @c("showEvent")
    @l
    private final ParametrizedEvent showEvent;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: PromoBanner.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/ParametrizedEvent;", "event", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/user_profile/items/PromoBanner$ClickAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getEvent", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ClickAction> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        @c("event")
        @l
        private final ParametrizedEvent event;

        /* compiled from: PromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ClickAction createFromParcel(@k Parcel parcel) {
                return new ClickAction((DeepLink) parcel.readParcelable(ClickAction.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(ClickAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ClickAction[] newArray(int i12) {
                return new ClickAction[i12];
            }
        }

        public ClickAction(@k DeepLink deepLink, @l ParametrizedEvent parametrizedEvent) {
            this.deeplink = deepLink;
            this.event = parametrizedEvent;
        }

        public static /* synthetic */ ClickAction copy$default(ClickAction clickAction, DeepLink deepLink, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = clickAction.deeplink;
            }
            if ((i12 & 2) != 0) {
                parametrizedEvent = clickAction.event;
            }
            return clickAction.copy(deepLink, parametrizedEvent);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final ParametrizedEvent getEvent() {
            return this.event;
        }

        @k
        public final ClickAction copy(@k DeepLink deeplink, @l ParametrizedEvent event) {
            return new ClickAction(deeplink, event);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClickAction)) {
                return false;
            }
            ClickAction clickAction = (ClickAction) other;
            return L.f(this.deeplink, clickAction.deeplink) && L.f(this.event, clickAction.event);
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final ParametrizedEvent getEvent() {
            return this.event;
        }

        public int hashCode() {
            int iHashCode = this.deeplink.hashCode() * 31;
            ParametrizedEvent parametrizedEvent = this.event;
            return iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ClickAction(deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", event=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.event, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeParcelable(this.event, flags);
        }
    }

    /* compiled from: PromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBanner createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PromoBanner.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(PromoBanner.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(PromoBanner.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Image.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new PromoBanner(attributedText, attributedText2, universalColor, arrayList, parcel.readInt() != 0 ? ClickAction.CREATOR.createFromParcel(parcel) : null, (ParametrizedEvent) parcel.readParcelable(PromoBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBanner[] newArray(int i12) {
            return new PromoBanner[i12];
        }
    }

    /* compiled from: PromoBanner.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Image;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Position;", "position", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Position;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Position;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Position;)Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Image;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Position;", "getPosition", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @c("image")
        @k
        private final UniversalImage image;

        @c("position")
        @l
        private final Position position;

        /* compiled from: PromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image((UniversalImage) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() == 0 ? null : Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@k UniversalImage universalImage, @l Position position) {
            this.image = universalImage;
            this.position = position;
        }

        public static /* synthetic */ Image copy$default(Image image, UniversalImage universalImage, Position position, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = image.image;
            }
            if ((i12 & 2) != 0) {
                position = image.position;
            }
            return image.copy(universalImage, position);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        @k
        public final Image copy(@k UniversalImage image, @l Position position) {
            return new Image(image, position);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return L.f(this.image, image.image) && this.position == image.position;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        public final Position getPosition() {
            return this.position;
        }

        public int hashCode() {
            int iHashCode = this.image.hashCode() * 31;
            Position position = this.position;
            return iHashCode + (position == null ? 0 : position.hashCode());
        }

        @k
        public String toString() {
            return "Image(image=" + this.image + ", position=" + this.position + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            Position position = this.position;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromoBanner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PromoBanner$Position;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "RIGHT", "FULL", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Position implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;

        @k
        public static final Parcelable.Creator<Position> CREATOR;

        @c("right")
        public static final Position RIGHT = new Position("RIGHT", 0);

        @c("full")
        public static final Position FULL = new Position("FULL", 1);

        /* compiled from: PromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position createFromParcel(@k Parcel parcel) {
                return Position.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position[] newArray(int i12) {
                return new Position[i12];
            }
        }

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{RIGHT, FULL};
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = kotlin.enums.c.a(positionArr$values);
            CREATOR = new Creator();
        }

        private Position(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    public PromoBanner(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor, @l List<Image> list, @l ClickAction clickAction, @l ParametrizedEvent parametrizedEvent) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.backgroundColor = universalColor;
        this.images = list;
        this.clickAction = clickAction;
        this.showEvent = parametrizedEvent;
    }

    public static /* synthetic */ PromoBanner copy$default(PromoBanner promoBanner, AttributedText attributedText, AttributedText attributedText2, UniversalColor universalColor, List list, ClickAction clickAction, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = promoBanner.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = promoBanner.subtitle;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 4) != 0) {
            universalColor = promoBanner.backgroundColor;
        }
        UniversalColor universalColor2 = universalColor;
        if ((i12 & 8) != 0) {
            list = promoBanner.images;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            clickAction = promoBanner.clickAction;
        }
        ClickAction clickAction2 = clickAction;
        if ((i12 & 32) != 0) {
            parametrizedEvent = promoBanner.showEvent;
        }
        return promoBanner.copy(attributedText, attributedText3, universalColor2, list2, clickAction2, parametrizedEvent);
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
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final List<Image> component4() {
        return this.images;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @k
    public final PromoBanner copy(@k AttributedText title, @l AttributedText subtitle, @l UniversalColor backgroundColor, @l List<Image> images, @l ClickAction clickAction, @l ParametrizedEvent showEvent) {
        return new PromoBanner(title, subtitle, backgroundColor, images, clickAction, showEvent);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBanner)) {
            return false;
        }
        PromoBanner promoBanner = (PromoBanner) other;
        return L.f(this.title, promoBanner.title) && L.f(this.subtitle, promoBanner.subtitle) && L.f(this.backgroundColor, promoBanner.backgroundColor) && L.f(this.images, promoBanner.images) && L.f(this.clickAction, promoBanner.clickAction) && L.f(this.showEvent, promoBanner.showEvent);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    @l
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
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
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        List<Image> list = this.images;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ClickAction clickAction = this.clickAction;
        int iHashCode5 = (iHashCode4 + (clickAction == null ? 0 : clickAction.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.showEvent;
        return iHashCode5 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBanner(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", clickAction=");
        sb2.append(this.clickAction);
        sb2.append(", showEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.showEvent, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Image) itA.next()).writeToParcel(parcel, flags);
            }
        }
        ClickAction clickAction = this.clickAction;
        if (clickAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clickAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.showEvent, flags);
    }
}
