package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.user_profile.items.EntryPointCrmCandidates;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvProfileItem.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/CvProfileItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "subtitle", "Lcom/avito/android/remote/model/user_profile/items/EntryPointCrmCandidates$Action;", "action", "Lcom/avito/android/remote/model/user_profile/items/CvProfileItem$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/EntryPointCrmCandidates$Action;Lcom/avito/android/remote/model/user_profile/items/CvProfileItem$Style;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/user_profile/items/EntryPointCrmCandidates$Action;", "getAction", "()Lcom/avito/android/remote/model/user_profile/items/EntryPointCrmCandidates$Action;", "Lcom/avito/android/remote/model/user_profile/items/CvProfileItem$Style;", "getStyle", "()Lcom/avito/android/remote/model/user_profile/items/CvProfileItem$Style;", "Action", "Style", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvProfileItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<CvProfileItem> CREATOR = new Creator();

    @c("action")
    @k
    private final EntryPointCrmCandidates.Action action;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("description")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: CvProfileItem.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/CvProfileItem$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("title")
        @k
        private final String title;

        /* compiled from: CvProfileItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: CvProfileItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvProfileItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvProfileItem createFromParcel(@k Parcel parcel) {
            return new CvProfileItem(parcel.readString(), parcel.readString(), EntryPointCrmCandidates.Action.CREATOR.createFromParcel(parcel), Style.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvProfileItem[] newArray(int i12) {
            return new CvProfileItem[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CvProfileItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/CvProfileItem$Style;", "", "(Ljava/lang/String;I)V", "BIG", "SMALL", "DEFAULT", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @c("big")
        public static final Style BIG = new Style("BIG", 0);

        @c(Constants.SMALL)
        public static final Style SMALL = new Style("SMALL", 1);

        @com.avito.android.gson.c
        public static final Style DEFAULT = new Style("DEFAULT", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{BIG, SMALL, DEFAULT};
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

    public /* synthetic */ CvProfileItem(String str, String str2, EntryPointCrmCandidates.Action action, Style style, int i12, C42822w c42822w) {
        this(str, str2, action, (i12 & 8) != 0 ? Style.DEFAULT : style);
    }

    @k
    public final EntryPointCrmCandidates.Action getAction() {
        return this.action;
    }

    @k
    public final Style getStyle() {
        return this.style;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.action.writeToParcel(parcel, flags);
        parcel.writeString(this.style.name());
    }

    public CvProfileItem(@k String str, @k String str2, @k EntryPointCrmCandidates.Action action, @k Style style) {
        this.title = str;
        this.subtitle = str2;
        this.action = action;
        this.style = style;
    }
}
