package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: EntryPoint.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001:\u0003@ABB\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b6\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b7\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b>\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b?\u0010:¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "emptyOffersTitle", "errorOffersTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/credit_broker/EntryPoint$Action;", "action", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$CreditBrokerLinkType;", "type", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;", "leftPart", "rightPart", "bottomPart", "", "textPartsSpacing", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "topMargin", "bottomMargin", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/credit_broker/EntryPoint$Action;Lcom/avito/android/remote/model/credit_broker/EntryPoint$CreditBrokerLinkType;Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getEmptyOffersTitle", "getErrorOffersTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$Action;", "getAction", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint$Action;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$CreditBrokerLinkType;", "getType", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint$CreditBrokerLinkType;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;", "getLeftPart", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;", "getRightPart", "getBottomPart", "Ljava/lang/Integer;", "getTextPartsSpacing", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "()Lcom/avito/android/remote/model/UniversalImage;", "getTopMargin", "getBottomMargin", "Action", "CreditBrokerLinkType", "Part", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EntryPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<EntryPoint> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("attributedTitle")
    @l
    private final AttributedText attributedTitle;

    @c("bottomMargin")
    @l
    private final Integer bottomMargin;

    @c("bottomPart")
    @l
    private final Part bottomPart;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("emptyOffersTitle")
    @l
    private final String emptyOffersTitle;

    @c("errorOffersTitle")
    @l
    private final String errorOffersTitle;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("leftPart")
    @l
    private final Part leftPart;

    @c("rightPart")
    @l
    private final Part rightPart;

    @c("textPartsSpacing")
    @l
    private final Integer textPartsSpacing;

    @c("title")
    @l
    private final String title;

    @c("topMargin")
    @l
    private final Integer topMargin;

    @c("type")
    @l
    private final CreditBrokerLinkType type;

    /* compiled from: EntryPoint.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/EntryPoint$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "isContest", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("color")
        @l
        private final UniversalColor color;

        @c("isContest")
        @l
        private final Boolean isContest;

        @c("title")
        @l
        private final String title;

        /* compiled from: EntryPoint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                UniversalColor universalColor = (UniversalColor) parcel.readParcelable(Action.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Action(string, universalColor, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@l String str, @l UniversalColor universalColor, @l Boolean bool) {
            this.title = str;
            this.color = universalColor;
            this.isContest = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: isContest, reason: from getter */
        public final Boolean getIsContest() {
            return this.isContest;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.color, flags);
            Boolean bool = this.isContest;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: EntryPoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EntryPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EntryPoint createFromParcel(@k Parcel parcel) {
            return new EntryPoint(parcel.readString(), (AttributedText) parcel.readParcelable(EntryPoint.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(EntryPoint.class.getClassLoader()), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CreditBrokerLinkType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Part.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Part.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Part.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalImage) parcel.readParcelable(EntryPoint.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EntryPoint[] newArray(int i12) {
            return new EntryPoint[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EntryPoint.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/EntryPoint$CreditBrokerLinkType;", "", "(Ljava/lang/String;I)V", "TEXT_WITH_ARROW", "CUSTOM", "DEFAULT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreditBrokerLinkType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CreditBrokerLinkType[] $VALUES;

        @c("textWithArrow")
        public static final CreditBrokerLinkType TEXT_WITH_ARROW = new CreditBrokerLinkType("TEXT_WITH_ARROW", 0);

        @c("custom")
        public static final CreditBrokerLinkType CUSTOM = new CreditBrokerLinkType("CUSTOM", 1);
        public static final CreditBrokerLinkType DEFAULT = new CreditBrokerLinkType("DEFAULT", 2);

        private static final /* synthetic */ CreditBrokerLinkType[] $values() {
            return new CreditBrokerLinkType[]{TEXT_WITH_ARROW, CUSTOM, DEFAULT};
        }

        static {
            CreditBrokerLinkType[] creditBrokerLinkTypeArr$values = $values();
            $VALUES = creditBrokerLinkTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(creditBrokerLinkTypeArr$values);
        }

        private CreditBrokerLinkType(String str, int i12) {
        }

        @k
        public static a<CreditBrokerLinkType> getEntries() {
            return $ENTRIES;
        }

        public static CreditBrokerLinkType valueOf(String str) {
            return (CreditBrokerLinkType) Enum.valueOf(CreditBrokerLinkType.class, str);
        }

        public static CreditBrokerLinkType[] values() {
            return (CreditBrokerLinkType[]) $VALUES.clone();
        }
    }

    /* compiled from: EntryPoint.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001'BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part$HighlightType;", "highlightType", "Lcom/avito/android/remote/model/UniversalColor;", "highlightColor", "Lcom/avito/android/remote/model/credit_broker/Icon;", "leftIcon", "rightIcon", "", "spacing", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part$HighlightType;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/credit_broker/Icon;Lcom/avito/android/remote/model/credit_broker/Icon;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part$HighlightType;", "getHighlightType", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part$HighlightType;", "Lcom/avito/android/remote/model/UniversalColor;", "getHighlightColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/credit_broker/Icon;", "getLeftIcon", "()Lcom/avito/android/remote/model/credit_broker/Icon;", "getRightIcon", "Ljava/lang/Integer;", "getSpacing", "()Ljava/lang/Integer;", "HighlightType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Part implements Parcelable {

        @k
        public static final Parcelable.Creator<Part> CREATOR = new Creator();

        @c("attributedText")
        @l
        private final AttributedText attributedText;

        @c("highlightColor")
        @l
        private final UniversalColor highlightColor;

        @c("highlightType")
        @l
        private final HighlightType highlightType;

        @c("leftIcon")
        @l
        private final Icon leftIcon;

        @c("rightIcon")
        @l
        private final Icon rightIcon;

        @c("iconsSpacing")
        @l
        private final Integer spacing;

        /* compiled from: EntryPoint.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Part> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Part createFromParcel(@k Parcel parcel) {
                return new Part((AttributedText) parcel.readParcelable(Part.class.getClassLoader()), parcel.readInt() == 0 ? null : HighlightType.valueOf(parcel.readString()), (UniversalColor) parcel.readParcelable(Part.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Part[] newArray(int i12) {
                return new Part[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: EntryPoint.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/EntryPoint$Part$HighlightType;", "", "(Ljava/lang/String;I)V", "BORDER", "FILLED_BORDER", "FLAG", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HighlightType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ HighlightType[] $VALUES;

            @c("border")
            public static final HighlightType BORDER = new HighlightType("BORDER", 0);

            @c("filledBorder")
            public static final HighlightType FILLED_BORDER = new HighlightType("FILLED_BORDER", 1);

            @c("flag")
            public static final HighlightType FLAG = new HighlightType("FLAG", 2);

            private static final /* synthetic */ HighlightType[] $values() {
                return new HighlightType[]{BORDER, FILLED_BORDER, FLAG};
            }

            static {
                HighlightType[] highlightTypeArr$values = $values();
                $VALUES = highlightTypeArr$values;
                $ENTRIES = kotlin.enums.c.a(highlightTypeArr$values);
            }

            private HighlightType(String str, int i12) {
            }

            @k
            public static a<HighlightType> getEntries() {
                return $ENTRIES;
            }

            public static HighlightType valueOf(String str) {
                return (HighlightType) Enum.valueOf(HighlightType.class, str);
            }

            public static HighlightType[] values() {
                return (HighlightType[]) $VALUES.clone();
            }
        }

        public Part(@l AttributedText attributedText, @l HighlightType highlightType, @l UniversalColor universalColor, @l Icon icon, @l Icon icon2, @l Integer num) {
            this.attributedText = attributedText;
            this.highlightType = highlightType;
            this.highlightColor = universalColor;
            this.leftIcon = icon;
            this.rightIcon = icon2;
            this.spacing = num;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @l
        public final UniversalColor getHighlightColor() {
            return this.highlightColor;
        }

        @l
        public final HighlightType getHighlightType() {
            return this.highlightType;
        }

        @l
        public final Icon getLeftIcon() {
            return this.leftIcon;
        }

        @l
        public final Icon getRightIcon() {
            return this.rightIcon;
        }

        @l
        public final Integer getSpacing() {
            return this.spacing;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.attributedText, flags);
            HighlightType highlightType = this.highlightType;
            if (highlightType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(highlightType.name());
            }
            parcel.writeParcelable(this.highlightColor, flags);
            Icon icon = this.leftIcon;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, flags);
            }
            Icon icon2 = this.rightIcon;
            if (icon2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon2.writeToParcel(parcel, flags);
            }
            Integer num = this.spacing;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    public EntryPoint(@l String str, @l AttributedText attributedText, @l String str2, @l String str3, @l DeepLink deepLink, @l Action action, @l CreditBrokerLinkType creditBrokerLinkType, @l Part part, @l Part part2, @l Part part3, @l Integer num, @l UniversalImage universalImage, @l Integer num2, @l Integer num3) {
        this.title = str;
        this.attributedTitle = attributedText;
        this.emptyOffersTitle = str2;
        this.errorOffersTitle = str3;
        this.deepLink = deepLink;
        this.action = action;
        this.type = creditBrokerLinkType;
        this.leftPart = part;
        this.rightPart = part2;
        this.bottomPart = part3;
        this.textPartsSpacing = num;
        this.icon = universalImage;
        this.topMargin = num2;
        this.bottomMargin = num3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    @l
    public final Part getBottomPart() {
        return this.bottomPart;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getEmptyOffersTitle() {
        return this.emptyOffersTitle;
    }

    @l
    public final String getErrorOffersTitle() {
        return this.errorOffersTitle;
    }

    @l
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    public final Part getLeftPart() {
        return this.leftPart;
    }

    @l
    public final Part getRightPart() {
        return this.rightPart;
    }

    @l
    public final Integer getTextPartsSpacing() {
        return this.textPartsSpacing;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @l
    public final CreditBrokerLinkType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.attributedTitle, flags);
        parcel.writeString(this.emptyOffersTitle);
        parcel.writeString(this.errorOffersTitle);
        parcel.writeParcelable(this.deepLink, flags);
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
        CreditBrokerLinkType creditBrokerLinkType = this.type;
        if (creditBrokerLinkType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(creditBrokerLinkType.name());
        }
        Part part = this.leftPart;
        if (part == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part.writeToParcel(parcel, flags);
        }
        Part part2 = this.rightPart;
        if (part2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part2.writeToParcel(parcel, flags);
        }
        Part part3 = this.bottomPart;
        if (part3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            part3.writeToParcel(parcel, flags);
        }
        Integer num = this.textPartsSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.icon, flags);
        Integer num2 = this.topMargin;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.bottomMargin;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
    }
}
