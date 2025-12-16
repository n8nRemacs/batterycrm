package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenUniversalPageV2Action.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001>BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJX\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u0010J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001fR*\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageV2Action;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin/common/action/RequestInfo;", "request", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "presentationStyle", "", "screenName", "forcedThemeMode", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings;", "bottomSheetContentPaddings", "<init>", "(Lcom/avito/android/beduin/common/action/RequestInfo;Lcom/avito/android/deep_linking/links/ScreenStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/avito/android/beduin/common/action/RequestInfo;", "component2", "()Lcom/avito/android/deep_linking/links/ScreenStyle;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings;", "copy", "(Lcom/avito/android/beduin/common/action/RequestInfo;Lcom/avito/android/deep_linking/links/ScreenStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings;)Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageV2Action;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/RequestInfo;", "getRequest", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "getPresentationStyle", "Ljava/lang/String;", "getScreenName", "getForcedThemeMode", "getTheme", "Lcom/avito/android/deep_linking/links/BottomSheetContentPaddings;", "getBottomSheetContentPaddings", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "content", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "getContent", "()Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "setContent", "(Lcom/avito/android/beduin_models/BeduinUniversalPageContent;)V", "getContent$annotations", "()V", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenUniversalPageV2Action implements BeduinAction {

    @l
    private final BottomSheetContentPaddings bottomSheetContentPaddings;

    @l
    private BeduinUniversalPageContent content;

    @l
    private final String forcedThemeMode;

    @l
    private final ScreenStyle presentationStyle;

    @l
    private final RequestInfo request;

    @l
    private final String screenName;

    @l
    private final String theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenUniversalPageV2Action> CREATOR = new b();

    @Y61.k
    private static final Class<BeduinOpenUniversalPageV2Action> action = BeduinOpenUniversalPageV2Action.class;

    @Y61.k
    private static final String type = "openUniversalPageV2";

    /* compiled from: BeduinOpenUniversalPageV2Action.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageV2Action$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinOpenUniversalPageV2Action$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinOpenUniversalPageV2Action> getAction() {
            return BeduinOpenUniversalPageV2Action.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinOpenUniversalPageV2Action.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenUniversalPageV2Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenUniversalPageV2Action> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenUniversalPageV2Action createFromParcel(Parcel parcel) {
            return new BeduinOpenUniversalPageV2Action(parcel.readInt() == 0 ? null : RequestInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BottomSheetContentPaddings.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenUniversalPageV2Action[] newArray(int i12) {
            return new BeduinOpenUniversalPageV2Action[i12];
        }
    }

    public BeduinOpenUniversalPageV2Action(@l RequestInfo requestInfo, @l ScreenStyle screenStyle, @l String str, @l String str2, @l String str3, @l BottomSheetContentPaddings bottomSheetContentPaddings) {
        this.request = requestInfo;
        this.presentationStyle = screenStyle;
        this.screenName = str;
        this.forcedThemeMode = str2;
        this.theme = str3;
        this.bottomSheetContentPaddings = bottomSheetContentPaddings;
    }

    public static /* synthetic */ BeduinOpenUniversalPageV2Action copy$default(BeduinOpenUniversalPageV2Action beduinOpenUniversalPageV2Action, RequestInfo requestInfo, ScreenStyle screenStyle, String str, String str2, String str3, BottomSheetContentPaddings bottomSheetContentPaddings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            requestInfo = beduinOpenUniversalPageV2Action.request;
        }
        if ((i12 & 2) != 0) {
            screenStyle = beduinOpenUniversalPageV2Action.presentationStyle;
        }
        ScreenStyle screenStyle2 = screenStyle;
        if ((i12 & 4) != 0) {
            str = beduinOpenUniversalPageV2Action.screenName;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = beduinOpenUniversalPageV2Action.forcedThemeMode;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = beduinOpenUniversalPageV2Action.theme;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            bottomSheetContentPaddings = beduinOpenUniversalPageV2Action.bottomSheetContentPaddings;
        }
        return beduinOpenUniversalPageV2Action.copy(requestInfo, screenStyle2, str4, str5, str6, bottomSheetContentPaddings);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final RequestInfo getRequest() {
        return this.request;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ScreenStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getForcedThemeMode() {
        return this.forcedThemeMode;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BottomSheetContentPaddings getBottomSheetContentPaddings() {
        return this.bottomSheetContentPaddings;
    }

    @Y61.k
    public final BeduinOpenUniversalPageV2Action copy(@l RequestInfo request, @l ScreenStyle presentationStyle, @l String screenName, @l String forcedThemeMode, @l String theme, @l BottomSheetContentPaddings bottomSheetContentPaddings) {
        return new BeduinOpenUniversalPageV2Action(request, presentationStyle, screenName, forcedThemeMode, theme, bottomSheetContentPaddings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenUniversalPageV2Action)) {
            return false;
        }
        BeduinOpenUniversalPageV2Action beduinOpenUniversalPageV2Action = (BeduinOpenUniversalPageV2Action) other;
        return L.f(this.request, beduinOpenUniversalPageV2Action.request) && this.presentationStyle == beduinOpenUniversalPageV2Action.presentationStyle && L.f(this.content, beduinOpenUniversalPageV2Action.content) && L.f(this.screenName, beduinOpenUniversalPageV2Action.screenName) && L.f(this.forcedThemeMode, beduinOpenUniversalPageV2Action.forcedThemeMode) && L.f(this.theme, beduinOpenUniversalPageV2Action.theme) && this.bottomSheetContentPaddings == beduinOpenUniversalPageV2Action.bottomSheetContentPaddings;
    }

    @l
    public final BottomSheetContentPaddings getBottomSheetContentPaddings() {
        return this.bottomSheetContentPaddings;
    }

    @l
    public final BeduinUniversalPageContent getContent() {
        return this.content;
    }

    @l
    public final String getForcedThemeMode() {
        return this.forcedThemeMode;
    }

    @l
    public final ScreenStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    public final RequestInfo getRequest() {
        return this.request;
    }

    @l
    public final String getScreenName() {
        return this.screenName;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        RequestInfo requestInfo = this.request;
        int iHashCode = (requestInfo != null ? requestInfo.hashCode() : 0) * 31;
        ScreenStyle screenStyle = this.presentationStyle;
        int iHashCode2 = (iHashCode + (screenStyle != null ? screenStyle.hashCode() : 0)) * 31;
        BeduinUniversalPageContent beduinUniversalPageContent = this.content;
        int iHashCode3 = (iHashCode2 + (beduinUniversalPageContent != null ? beduinUniversalPageContent.hashCode() : 0)) * 31;
        String str = this.screenName;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.forcedThemeMode;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.theme;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        BottomSheetContentPaddings bottomSheetContentPaddings = this.bottomSheetContentPaddings;
        return iHashCode6 + (bottomSheetContentPaddings != null ? bottomSheetContentPaddings.hashCode() : 0);
    }

    public final void setContent(@l BeduinUniversalPageContent beduinUniversalPageContent) {
        this.content = beduinUniversalPageContent;
    }

    @Y61.k
    public String toString() {
        return "BeduinOpenUniversalPageV2Action(request=" + this.request + ", presentationStyle=" + this.presentationStyle + ", screenName=" + this.screenName + ", forcedThemeMode=" + this.forcedThemeMode + ", theme=" + this.theme + ", bottomSheetContentPaddings=" + this.bottomSheetContentPaddings + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        RequestInfo requestInfo = this.request;
        if (requestInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            requestInfo.writeToParcel(parcel, flags);
        }
        ScreenStyle screenStyle = this.presentationStyle;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
        parcel.writeString(this.screenName);
        parcel.writeString(this.forcedThemeMode);
        parcel.writeString(this.theme);
        BottomSheetContentPaddings bottomSheetContentPaddings = this.bottomSheetContentPaddings;
        if (bottomSheetContentPaddings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bottomSheetContentPaddings.name());
        }
    }

    public /* synthetic */ BeduinOpenUniversalPageV2Action(RequestInfo requestInfo, ScreenStyle screenStyle, String str, String str2, String str3, BottomSheetContentPaddings bottomSheetContentPaddings, int i12, C42822w c42822w) {
        this(requestInfo, screenStyle, str, (i12 & 8) != 0 ? null : str2, str3, (i12 & 32) != 0 ? null : bottomSheetContentPaddings);
    }

    public static /* synthetic */ void getContent$annotations() {
    }
}
