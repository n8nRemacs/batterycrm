package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u000289BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJb\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001b¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/search/Tab;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/search/Tab$TabValue;", "value", "", "selected", "badgeText", "badgeShowId", "", "badgeShowCount", "Lcom/avito/android/remote/model/search/Tab$Onboarding;", "onboarding", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/Tab$TabValue;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/Tab$Onboarding;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/search/Tab$TabValue;", "component3", "()Z", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/avito/android/remote/model/search/Tab$Onboarding;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/Tab$TabValue;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/Tab$Onboarding;)Lcom/avito/android/remote/model/search/Tab;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/search/Tab$TabValue;", "getValue", "Z", "getSelected", "getBadgeText", "getBadgeShowId", "Ljava/lang/Integer;", "getBadgeShowCount", "Lcom/avito/android/remote/model/search/Tab$Onboarding;", "getOnboarding", "Onboarding", "TabValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Tab implements Parcelable {

    @k
    public static final Parcelable.Creator<Tab> CREATOR = new Creator();

    @c("badgeShowCount")
    @l
    private final Integer badgeShowCount;

    @c("badgeShowId")
    @l
    private final String badgeShowId;

    @c("badgeText")
    @l
    private final String badgeText;

    @c("onboarding")
    @l
    private final Onboarding onboarding;

    @c("selected")
    private final boolean selected;

    @c("title")
    @l
    private final String title;

    @c("value")
    @l
    private final TabValue value;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Tab> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Tab createFromParcel(@k Parcel parcel) {
            return new Tab(parcel.readString(), parcel.readInt() == 0 ? null : TabValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Onboarding.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Tab[] newArray(int i12) {
            return new Tab[i12];
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016Jp\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b3\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b4\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b5\u0010\u0016¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/search/Tab$Onboarding;", "Landroid/os/Parcelable;", "", "priority", "", "title", "text", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "onceShowId", "onShow", "onDismiss", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/search/Tab$Onboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getPriority", "Ljava/lang/String;", "getTitle", "getText", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getOnceShowId", "getOnShow", "getOnDismiss", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Onboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("onDismiss")
        @l
        private final DeepLink onDismiss;

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
                return new Onboarding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding[] newArray(int i12) {
                return new Onboarding[i12];
            }
        }

        public Onboarding() {
            this(null, null, null, null, null, null, null, null, 255, null);
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

        @l
        /* renamed from: component8, reason: from getter */
        public final DeepLink getOnDismiss() {
            return this.onDismiss;
        }

        @k
        public final Onboarding copy(@l Integer priority, @l String title, @l String text, @l String buttonTitle, @l DeepLink deeplink, @l String onceShowId, @l DeepLink onShow, @l DeepLink onDismiss) {
            return new Onboarding(priority, title, text, buttonTitle, deeplink, onceShowId, onShow, onDismiss);
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
            return L.f(this.priority, onboarding.priority) && L.f(this.title, onboarding.title) && L.f(this.text, onboarding.text) && L.f(this.buttonTitle, onboarding.buttonTitle) && L.f(this.deeplink, onboarding.deeplink) && L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.onShow, onboarding.onShow) && L.f(this.onDismiss, onboarding.onDismiss);
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
        public final DeepLink getOnDismiss() {
            return this.onDismiss;
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
            int iHashCode7 = (iHashCode6 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
            DeepLink deepLink3 = this.onDismiss;
            return iHashCode7 + (deepLink3 != null ? deepLink3.hashCode() : 0);
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
            sb2.append(this.onShow);
            sb2.append(", onDismiss=");
            return a.v(sb2, this.onDismiss, ')');
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
            parcel.writeParcelable(this.onDismiss, flags);
        }

        public Onboarding(@l Integer num, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l String str4, @l DeepLink deepLink2, @l DeepLink deepLink3) {
            this.priority = num;
            this.title = str;
            this.text = str2;
            this.buttonTitle = str3;
            this.deeplink = deepLink;
            this.onceShowId = str4;
            this.onShow = deepLink2;
            this.onDismiss = deepLink3;
        }

        public /* synthetic */ Onboarding(Integer num, String str, String str2, String str3, DeepLink deepLink, String str4, DeepLink deepLink2, DeepLink deepLink3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : deepLink2, (i12 & 128) == 0 ? deepLink3 : null);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/search/Tab$TabValue;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/search/Tab$TabValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TabValue implements Parcelable {

        @k
        public static final Parcelable.Creator<TabValue> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deepLink;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TabValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TabValue createFromParcel(@k Parcel parcel) {
                return new TabValue((DeepLink) parcel.readParcelable(TabValue.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TabValue[] newArray(int i12) {
                return new TabValue[i12];
            }
        }

        public TabValue(@l DeepLink deepLink) {
            this.deepLink = deepLink;
        }

        public static /* synthetic */ TabValue copy$default(TabValue tabValue, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = tabValue.deepLink;
            }
            return tabValue.copy(deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final TabValue copy(@l DeepLink deepLink) {
            return new TabValue(deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TabValue) && L.f(this.deepLink, ((TabValue) other).deepLink);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        public int hashCode() {
            DeepLink deepLink = this.deepLink;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public String toString() {
            return a.v(new StringBuilder("TabValue(deepLink="), this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    public Tab(@l String str, @l TabValue tabValue, boolean z12, @l String str2, @l String str3, @l Integer num, @l Onboarding onboarding) {
        this.title = str;
        this.value = tabValue;
        this.selected = z12;
        this.badgeText = str2;
        this.badgeShowId = str3;
        this.badgeShowCount = num;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ Tab copy$default(Tab tab, String str, TabValue tabValue, boolean z12, String str2, String str3, Integer num, Onboarding onboarding, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tab.title;
        }
        if ((i12 & 2) != 0) {
            tabValue = tab.value;
        }
        TabValue tabValue2 = tabValue;
        if ((i12 & 4) != 0) {
            z12 = tab.selected;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            str2 = tab.badgeText;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            str3 = tab.badgeShowId;
        }
        String str5 = str3;
        if ((i12 & 32) != 0) {
            num = tab.badgeShowCount;
        }
        Integer num2 = num;
        if ((i12 & 64) != 0) {
            onboarding = tab.onboarding;
        }
        return tab.copy(str, tabValue2, z13, str4, str5, num2, onboarding);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final TabValue getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getBadgeShowId() {
        return this.badgeShowId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getBadgeShowCount() {
        return this.badgeShowCount;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final Tab copy(@l String title, @l TabValue value, boolean selected, @l String badgeText, @l String badgeShowId, @l Integer badgeShowCount, @l Onboarding onboarding) {
        return new Tab(title, value, selected, badgeText, badgeShowId, badgeShowCount, onboarding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) other;
        return L.f(this.title, tab.title) && L.f(this.value, tab.value) && this.selected == tab.selected && L.f(this.badgeText, tab.badgeText) && L.f(this.badgeShowId, tab.badgeShowId) && L.f(this.badgeShowCount, tab.badgeShowCount) && L.f(this.onboarding, tab.onboarding);
    }

    @l
    public final Integer getBadgeShowCount() {
        return this.badgeShowCount;
    }

    @l
    public final String getBadgeShowId() {
        return this.badgeShowId;
    }

    @l
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final TabValue getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TabValue tabValue = this.value;
        int i12 = r.i((iHashCode + (tabValue == null ? 0 : tabValue.hashCode())) * 31, 31, this.selected);
        String str2 = this.badgeText;
        int iHashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeShowId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.badgeShowCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return iHashCode4 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Tab(title=" + this.title + ", value=" + this.value + ", selected=" + this.selected + ", badgeText=" + this.badgeText + ", badgeShowId=" + this.badgeShowId + ", badgeShowCount=" + this.badgeShowCount + ", onboarding=" + this.onboarding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        TabValue tabValue = this.value;
        if (tabValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabValue.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeString(this.badgeText);
        parcel.writeString(this.badgeShowId);
        Integer num = this.badgeShowCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
    }
}
