package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u00018BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJb\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b\n\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b5\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001b¨\u00069"}, d2 = {"Lcom/avito/android/remote/model/search/EntryPoint;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "universalPage", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "text", "leftIcon", "", "isAutoOpen", "cancelButtonDeeplink", "Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;", "onboarding", "<init>", "(Lcom/avito/android/beduin_models/BeduinUniversalPageContent;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;)V", "component1", "()Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;", "copy", "(Lcom/avito/android/beduin_models/BeduinUniversalPageContent;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;)Lcom/avito/android/remote/model/search/EntryPoint;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "getUniversalPage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Ljava/lang/String;", "getText", "getLeftIcon", "Ljava/lang/Boolean;", "getCancelButtonDeeplink", "Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;", "getOnboarding", "Onboarding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EntryPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<EntryPoint> CREATOR = new Creator();

    @c("cancelButtonDeeplink")
    @l
    private final DeepLink cancelButtonDeeplink;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("isAutoOpen")
    @l
    private final Boolean isAutoOpen;

    @c("leftIcon")
    @l
    private final String leftIcon;

    @c("onboarding")
    @l
    private final Onboarding onboarding;

    @c("text")
    @k
    private final String text;

    @c("universalPage")
    @l
    private final BeduinUniversalPageContent universalPage;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EntryPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EntryPoint createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            BeduinUniversalPageContent beduinUniversalPageContent = (BeduinUniversalPageContent) parcel.readParcelable(EntryPoint.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(EntryPoint.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EntryPoint(beduinUniversalPageContent, deepLink, string, string2, boolValueOf, (DeepLink) parcel.readParcelable(EntryPoint.class.getClassLoader()), parcel.readInt() != 0 ? Onboarding.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EntryPoint[] newArray(int i12) {
            return new EntryPoint[i12];
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015Jd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b1\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b2\u0010\u0015¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;", "Landroid/os/Parcelable;", "", "priority", "", "title", "text", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "onceShowId", "onShow", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/search/EntryPoint$Onboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getPriority", "Ljava/lang/String;", "getTitle", "getText", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getOnceShowId", "getOnShow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Onboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("onShow")
        @l
        private final DeepLink onShow;

        @c("onceShowId")
        @l
        private final String onceShowId;

        @c("priority")
        @l
        private final Integer priority;

        @c("text")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Onboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding createFromParcel(@k Parcel parcel) {
                return new Onboarding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding[] newArray(int i12) {
                return new Onboarding[i12];
            }
        }

        public Onboarding() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, Integer num, String str, String str2, String str3, DeepLink deepLink, String str4, DeepLink deepLink2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = onboarding.priority;
            }
            if ((i12 & 2) != 0) {
                str = onboarding.title;
            }
            String str5 = str;
            if ((i12 & 4) != 0) {
                str2 = onboarding.text;
            }
            String str6 = str2;
            if ((i12 & 8) != 0) {
                str3 = onboarding.buttonTitle;
            }
            String str7 = str3;
            if ((i12 & 16) != 0) {
                deepLink = onboarding.deeplink;
            }
            DeepLink deepLink3 = deepLink;
            if ((i12 & 32) != 0) {
                str4 = onboarding.onceShowId;
            }
            String str8 = str4;
            if ((i12 & 64) != 0) {
                deepLink2 = onboarding.onShow;
            }
            return onboarding.copy(num, str5, str6, str7, deepLink3, str8, deepLink2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final DeepLink getOnShow() {
            return this.onShow;
        }

        @k
        public final Onboarding copy(@l Integer priority, @l String title, @l String text, @l String buttonTitle, @l DeepLink deeplink, @l String onceShowId, @l DeepLink onShow) {
            return new Onboarding(priority, title, text, buttonTitle, deeplink, onceShowId, onShow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return L.f(this.priority, onboarding.priority) && L.f(this.title, onboarding.title) && L.f(this.text, onboarding.text) && L.f(this.buttonTitle, onboarding.buttonTitle) && L.f(this.deeplink, onboarding.deeplink) && L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.onShow, onboarding.onShow);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final DeepLink getOnShow() {
            return this.onShow;
        }

        @l
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.priority;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.deeplink;
            int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str4 = this.onceShowId;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            DeepLink deepLink2 = this.onShow;
            return iHashCode6 + (deepLink2 != null ? deepLink2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Onboarding(priority=");
            sb2.append(this.priority);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", onceShowId=");
            sb2.append(this.onceShowId);
            sb2.append(", onShow=");
            return a.v(sb2, this.onShow, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.priority;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonTitle);
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeString(this.onceShowId);
            parcel.writeParcelable(this.onShow, flags);
        }

        public Onboarding(@l Integer num, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l String str4, @l DeepLink deepLink2) {
            this.priority = num;
            this.title = str;
            this.text = str2;
            this.buttonTitle = str3;
            this.deeplink = deepLink;
            this.onceShowId = str4;
            this.onShow = deepLink2;
        }

        public /* synthetic */ Onboarding(Integer num, String str, String str2, String str3, DeepLink deepLink, String str4, DeepLink deepLink2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : deepLink2);
        }
    }

    public EntryPoint(@l BeduinUniversalPageContent beduinUniversalPageContent, @l DeepLink deepLink, @k String str, @l String str2, @l Boolean bool, @l DeepLink deepLink2, @l Onboarding onboarding) {
        this.universalPage = beduinUniversalPageContent;
        this.deeplink = deepLink;
        this.text = str;
        this.leftIcon = str2;
        this.isAutoOpen = bool;
        this.cancelButtonDeeplink = deepLink2;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ EntryPoint copy$default(EntryPoint entryPoint, BeduinUniversalPageContent beduinUniversalPageContent, DeepLink deepLink, String str, String str2, Boolean bool, DeepLink deepLink2, Onboarding onboarding, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinUniversalPageContent = entryPoint.universalPage;
        }
        if ((i12 & 2) != 0) {
            deepLink = entryPoint.deeplink;
        }
        DeepLink deepLink3 = deepLink;
        if ((i12 & 4) != 0) {
            str = entryPoint.text;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            str2 = entryPoint.leftIcon;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            bool = entryPoint.isAutoOpen;
        }
        Boolean bool2 = bool;
        if ((i12 & 32) != 0) {
            deepLink2 = entryPoint.cancelButtonDeeplink;
        }
        DeepLink deepLink4 = deepLink2;
        if ((i12 & 64) != 0) {
            onboarding = entryPoint.onboarding;
        }
        return entryPoint.copy(beduinUniversalPageContent, deepLink3, str3, str4, bool2, deepLink4, onboarding);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BeduinUniversalPageContent getUniversalPage() {
        return this.universalPage;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsAutoOpen() {
        return this.isAutoOpen;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getCancelButtonDeeplink() {
        return this.cancelButtonDeeplink;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final EntryPoint copy(@l BeduinUniversalPageContent universalPage, @l DeepLink deeplink, @k String text, @l String leftIcon, @l Boolean isAutoOpen, @l DeepLink cancelButtonDeeplink, @l Onboarding onboarding) {
        return new EntryPoint(universalPage, deeplink, text, leftIcon, isAutoOpen, cancelButtonDeeplink, onboarding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryPoint)) {
            return false;
        }
        EntryPoint entryPoint = (EntryPoint) other;
        return L.f(this.universalPage, entryPoint.universalPage) && L.f(this.deeplink, entryPoint.deeplink) && L.f(this.text, entryPoint.text) && L.f(this.leftIcon, entryPoint.leftIcon) && L.f(this.isAutoOpen, entryPoint.isAutoOpen) && L.f(this.cancelButtonDeeplink, entryPoint.cancelButtonDeeplink) && L.f(this.onboarding, entryPoint.onboarding);
    }

    @l
    public final DeepLink getCancelButtonDeeplink() {
        return this.cancelButtonDeeplink;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    @l
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final BeduinUniversalPageContent getUniversalPage() {
        return this.universalPage;
    }

    public int hashCode() {
        BeduinUniversalPageContent beduinUniversalPageContent = this.universalPage;
        int iHashCode = (beduinUniversalPageContent == null ? 0 : beduinUniversalPageContent.hashCode()) * 31;
        DeepLink deepLink = this.deeplink;
        int iD2 = H.d((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.text);
        String str = this.leftIcon;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAutoOpen;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink2 = this.cancelButtonDeeplink;
        int iHashCode4 = (iHashCode3 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return iHashCode4 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    @l
    public final Boolean isAutoOpen() {
        return this.isAutoOpen;
    }

    @k
    public String toString() {
        return "EntryPoint(universalPage=" + this.universalPage + ", deeplink=" + this.deeplink + ", text=" + this.text + ", leftIcon=" + this.leftIcon + ", isAutoOpen=" + this.isAutoOpen + ", cancelButtonDeeplink=" + this.cancelButtonDeeplink + ", onboarding=" + this.onboarding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.universalPage, flags);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeString(this.text);
        parcel.writeString(this.leftIcon);
        Boolean bool = this.isAutoOpen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.cancelButtonDeeplink, flags);
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ EntryPoint(BeduinUniversalPageContent beduinUniversalPageContent, DeepLink deepLink, String str, String str2, Boolean bool, DeepLink deepLink2, Onboarding onboarding, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : beduinUniversalPageContent, (i12 & 2) != 0 ? null : deepLink, str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : deepLink2, (i12 & 64) != 0 ? null : onboarding);
    }
}
