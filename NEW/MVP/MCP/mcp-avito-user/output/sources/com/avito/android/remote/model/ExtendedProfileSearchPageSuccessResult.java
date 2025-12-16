package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003456BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b\u000b\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b\f\u0010\u0018¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult;", "Lcom/avito/android/remote/model/ExtendedProfileSearchPageResult;", "", "baseProfileUrl", "shareS", "title", "Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;", SingleLineInputModel.STYLE_SEARCH, "Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;", "back", "", "isNeedToHideItemImages", "isSearchSuggestsEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;", "component5", "()Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBaseProfileUrl", "getShareS", "getTitle", "Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;", "getSearch", "Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;", "getBack", "Ljava/lang/Boolean;", "AnalyticParams", "BackNavigation", "Search", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileSearchPageSuccessResult implements ExtendedProfileSearchPageResult {

    @k
    public static final Parcelable.Creator<ExtendedProfileSearchPageSuccessResult> CREATOR = new Creator();

    @c("back")
    @l
    private final BackNavigation back;

    @c("baseProfileUrl")
    @l
    private final String baseProfileUrl;

    @c("isNeedToHideItemImages")
    @l
    private final Boolean isNeedToHideItemImages;

    @c("isSearchSuggestsEnabled")
    @l
    private final Boolean isSearchSuggestsEnabled;

    @c(SingleLineInputModel.STYLE_SEARCH)
    @l
    private final Search search;

    @c("shareS")
    @l
    private final String shareS;

    @c("title")
    @l
    private final String title;

    /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;", "Landroid/os/Parcelable;", "", "fromPage", "profileSession", "", "fromBlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFromPage", "getProfileSession", "Ljava/lang/Integer;", "getFromBlock", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticParams implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticParams> CREATOR = new Creator();

        @c("fromBlock")
        @l
        private final Integer fromBlock;

        @c("fromPage")
        @l
        private final String fromPage;

        @c("bpSession")
        @l
        private final String profileSession;

        /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticParams createFromParcel(@k Parcel parcel) {
                return new AnalyticParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticParams[] newArray(int i12) {
                return new AnalyticParams[i12];
            }
        }

        public AnalyticParams(@l String str, @l String str2, @l Integer num) {
            this.fromPage = str;
            this.profileSession = str2;
            this.fromBlock = num;
        }

        public static /* synthetic */ AnalyticParams copy$default(AnalyticParams analyticParams, String str, String str2, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = analyticParams.fromPage;
            }
            if ((i12 & 2) != 0) {
                str2 = analyticParams.profileSession;
            }
            if ((i12 & 4) != 0) {
                num = analyticParams.fromBlock;
            }
            return analyticParams.copy(str, str2, num);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getProfileSession() {
            return this.profileSession;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getFromBlock() {
            return this.fromBlock;
        }

        @k
        public final AnalyticParams copy(@l String fromPage, @l String profileSession, @l Integer fromBlock) {
            return new AnalyticParams(fromPage, profileSession, fromBlock);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticParams)) {
                return false;
            }
            AnalyticParams analyticParams = (AnalyticParams) other;
            return L.f(this.fromPage, analyticParams.fromPage) && L.f(this.profileSession, analyticParams.profileSession) && L.f(this.fromBlock, analyticParams.fromBlock);
        }

        @l
        public final Integer getFromBlock() {
            return this.fromBlock;
        }

        @l
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        public final String getProfileSession() {
            return this.profileSession;
        }

        public int hashCode() {
            String str = this.fromPage;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.profileSession;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.fromBlock;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticParams(fromPage=");
            sb2.append(this.fromPage);
            sb2.append(", profileSession=");
            sb2.append(this.profileSession);
            sb2.append(", fromBlock=");
            return s.j(sb2, this.fromBlock, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fromPage);
            parcel.writeString(this.profileSession);
            Integer num = this.fromBlock;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$BackNavigation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackNavigation implements Parcelable {

        @k
        public static final Parcelable.Creator<BackNavigation> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BackNavigation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackNavigation createFromParcel(@k Parcel parcel) {
                return new BackNavigation((DeepLink) parcel.readParcelable(BackNavigation.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackNavigation[] newArray(int i12) {
                return new BackNavigation[i12];
            }
        }

        public BackNavigation(@l DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        public static /* synthetic */ BackNavigation copy$default(BackNavigation backNavigation, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = backNavigation.deeplink;
            }
            return backNavigation.copy(deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final BackNavigation copy(@l DeepLink deeplink) {
            return new BackNavigation(deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackNavigation) && L.f(this.deeplink, ((BackNavigation) other).deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            DeepLink deepLink = this.deeplink;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public String toString() {
            return a.v(new StringBuilder("BackNavigation(deeplink="), this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileSearchPageSuccessResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSearchPageSuccessResult createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Search searchCreateFromParcel = parcel.readInt() == 0 ? null : Search.CREATOR.createFromParcel(parcel);
            BackNavigation backNavigationCreateFromParcel = parcel.readInt() == 0 ? null : BackNavigation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExtendedProfileSearchPageSuccessResult(string, string2, string3, searchCreateFromParcel, backNavigationCreateFromParcel, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSearchPageSuccessResult[] newArray(int i12) {
            return new ExtendedProfileSearchPageSuccessResult[i12];
        }
    }

    /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;", "Landroid/os/Parcelable;", "", "form", "", "pageSize", "Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;", "analyticParams", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;)Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$Search;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getForm", "Ljava/lang/Integer;", "getPageSize", "Lcom/avito/android/remote/model/ExtendedProfileSearchPageSuccessResult$AnalyticParams;", "getAnalyticParams", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Search implements Parcelable {

        @k
        public static final Parcelable.Creator<Search> CREATOR = new Creator();

        @c("analyticParams")
        @l
        private final AnalyticParams analyticParams;

        @c("form")
        @l
        private final String form;

        @c("pageSize")
        @l
        private final Integer pageSize;

        /* compiled from: ExtendedProfileSearchPageSuccessResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Search> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Search createFromParcel(@k Parcel parcel) {
                return new Search(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? AnalyticParams.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Search[] newArray(int i12) {
                return new Search[i12];
            }
        }

        public Search(@l String str, @l Integer num, @l AnalyticParams analyticParams) {
            this.form = str;
            this.pageSize = num;
            this.analyticParams = analyticParams;
        }

        public static /* synthetic */ Search copy$default(Search search, String str, Integer num, AnalyticParams analyticParams, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = search.form;
            }
            if ((i12 & 2) != 0) {
                num = search.pageSize;
            }
            if ((i12 & 4) != 0) {
                analyticParams = search.analyticParams;
            }
            return search.copy(str, num, analyticParams);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getForm() {
            return this.form;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getPageSize() {
            return this.pageSize;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AnalyticParams getAnalyticParams() {
            return this.analyticParams;
        }

        @k
        public final Search copy(@l String form, @l Integer pageSize, @l AnalyticParams analyticParams) {
            return new Search(form, pageSize, analyticParams);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Search)) {
                return false;
            }
            Search search = (Search) other;
            return L.f(this.form, search.form) && L.f(this.pageSize, search.pageSize) && L.f(this.analyticParams, search.analyticParams);
        }

        @l
        public final AnalyticParams getAnalyticParams() {
            return this.analyticParams;
        }

        @l
        public final String getForm() {
            return this.form;
        }

        @l
        public final Integer getPageSize() {
            return this.pageSize;
        }

        public int hashCode() {
            String str = this.form;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.pageSize;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            AnalyticParams analyticParams = this.analyticParams;
            return iHashCode2 + (analyticParams != null ? analyticParams.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Search(form=" + this.form + ", pageSize=" + this.pageSize + ", analyticParams=" + this.analyticParams + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.form);
            Integer num = this.pageSize;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            AnalyticParams analyticParams = this.analyticParams;
            if (analyticParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                analyticParams.writeToParcel(parcel, flags);
            }
        }
    }

    public ExtendedProfileSearchPageSuccessResult(@l String str, @l String str2, @l String str3, @l Search search, @l BackNavigation backNavigation, @l Boolean bool, @l Boolean bool2) {
        this.baseProfileUrl = str;
        this.shareS = str2;
        this.title = str3;
        this.search = search;
        this.back = backNavigation;
        this.isNeedToHideItemImages = bool;
        this.isSearchSuggestsEnabled = bool2;
    }

    public static /* synthetic */ ExtendedProfileSearchPageSuccessResult copy$default(ExtendedProfileSearchPageSuccessResult extendedProfileSearchPageSuccessResult, String str, String str2, String str3, Search search, BackNavigation backNavigation, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileSearchPageSuccessResult.baseProfileUrl;
        }
        if ((i12 & 2) != 0) {
            str2 = extendedProfileSearchPageSuccessResult.shareS;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = extendedProfileSearchPageSuccessResult.title;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            search = extendedProfileSearchPageSuccessResult.search;
        }
        Search search2 = search;
        if ((i12 & 16) != 0) {
            backNavigation = extendedProfileSearchPageSuccessResult.back;
        }
        BackNavigation backNavigation2 = backNavigation;
        if ((i12 & 32) != 0) {
            bool = extendedProfileSearchPageSuccessResult.isNeedToHideItemImages;
        }
        Boolean bool3 = bool;
        if ((i12 & 64) != 0) {
            bool2 = extendedProfileSearchPageSuccessResult.isSearchSuggestsEnabled;
        }
        return extendedProfileSearchPageSuccessResult.copy(str, str4, str5, search2, backNavigation2, bool3, bool2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getBaseProfileUrl() {
        return this.baseProfileUrl;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getShareS() {
        return this.shareS;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Search getSearch() {
        return this.search;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BackNavigation getBack() {
        return this.back;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsNeedToHideItemImages() {
        return this.isNeedToHideItemImages;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsSearchSuggestsEnabled() {
        return this.isSearchSuggestsEnabled;
    }

    @k
    public final ExtendedProfileSearchPageSuccessResult copy(@l String baseProfileUrl, @l String shareS, @l String title, @l Search search, @l BackNavigation back, @l Boolean isNeedToHideItemImages, @l Boolean isSearchSuggestsEnabled) {
        return new ExtendedProfileSearchPageSuccessResult(baseProfileUrl, shareS, title, search, back, isNeedToHideItemImages, isSearchSuggestsEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileSearchPageSuccessResult)) {
            return false;
        }
        ExtendedProfileSearchPageSuccessResult extendedProfileSearchPageSuccessResult = (ExtendedProfileSearchPageSuccessResult) other;
        return L.f(this.baseProfileUrl, extendedProfileSearchPageSuccessResult.baseProfileUrl) && L.f(this.shareS, extendedProfileSearchPageSuccessResult.shareS) && L.f(this.title, extendedProfileSearchPageSuccessResult.title) && L.f(this.search, extendedProfileSearchPageSuccessResult.search) && L.f(this.back, extendedProfileSearchPageSuccessResult.back) && L.f(this.isNeedToHideItemImages, extendedProfileSearchPageSuccessResult.isNeedToHideItemImages) && L.f(this.isSearchSuggestsEnabled, extendedProfileSearchPageSuccessResult.isSearchSuggestsEnabled);
    }

    @l
    public final BackNavigation getBack() {
        return this.back;
    }

    @l
    public final String getBaseProfileUrl() {
        return this.baseProfileUrl;
    }

    @l
    public final Search getSearch() {
        return this.search;
    }

    @l
    public final String getShareS() {
        return this.shareS;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.baseProfileUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shareS;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Search search = this.search;
        int iHashCode4 = (iHashCode3 + (search == null ? 0 : search.hashCode())) * 31;
        BackNavigation backNavigation = this.back;
        int iHashCode5 = (iHashCode4 + (backNavigation == null ? 0 : backNavigation.hashCode())) * 31;
        Boolean bool = this.isNeedToHideItemImages;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSearchSuggestsEnabled;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    public final Boolean isNeedToHideItemImages() {
        return this.isNeedToHideItemImages;
    }

    @l
    public final Boolean isSearchSuggestsEnabled() {
        return this.isSearchSuggestsEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSearchPageSuccessResult(baseProfileUrl=");
        sb2.append(this.baseProfileUrl);
        sb2.append(", shareS=");
        sb2.append(this.shareS);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", search=");
        sb2.append(this.search);
        sb2.append(", back=");
        sb2.append(this.back);
        sb2.append(", isNeedToHideItemImages=");
        sb2.append(this.isNeedToHideItemImages);
        sb2.append(", isSearchSuggestsEnabled=");
        return C0.g(sb2, this.isSearchSuggestsEnabled, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.baseProfileUrl);
        parcel.writeString(this.shareS);
        parcel.writeString(this.title);
        Search search = this.search;
        if (search == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            search.writeToParcel(parcel, flags);
        }
        BackNavigation backNavigation = this.back;
        if (backNavigation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            backNavigation.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isNeedToHideItemImages;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isSearchSuggestsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    public /* synthetic */ ExtendedProfileSearchPageSuccessResult(String str, String str2, String str3, Search search, BackNavigation backNavigation, Boolean bool, Boolean bool2, int i12, C42822w c42822w) {
        this(str, str2, str3, search, backNavigation, (i12 & 32) != 0 ? null : bool, bool2);
    }
}
