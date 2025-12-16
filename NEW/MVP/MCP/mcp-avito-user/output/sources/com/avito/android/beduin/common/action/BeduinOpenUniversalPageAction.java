package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenUniversalPageAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJv\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u000f¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "requestUrl", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "presentationStyle", "", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "screenName", "forcedThemeMode", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/ScreenStyle;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/ScreenStyle;", "component3", "()Ljava/util/Map;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/ScreenStyle;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRequestUrl", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "getPresentationStyle", "Ljava/util/Map;", "getFormParamsMap", "getScreenName", "getForcedThemeMode", "getTheme", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenUniversalPageAction implements BeduinAction {

    @l
    private final String forcedThemeMode;

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @l
    private final ScreenStyle presentationStyle;

    @l
    private final String requestUrl;

    @l
    private final String screenName;

    @l
    private final String theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenUniversalPageAction> CREATOR = new b();

    @Y61.k
    private static final Class<BeduinOpenUniversalPageAction> action = BeduinOpenUniversalPageAction.class;

    @Y61.k
    private static final String type = "openUniversalPage";

    /* compiled from: BeduinOpenUniversalPageAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinOpenUniversalPageAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinOpenUniversalPageAction> getAction() {
            return BeduinOpenUniversalPageAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinOpenUniversalPageAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenUniversalPageAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenUniversalPageAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenUniversalPageAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            ScreenStyle screenStyleValueOf = parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    String string2 = parcel.readString();
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap.put(string2, linkedHashMap2);
                }
            }
            return new BeduinOpenUniversalPageAction(string, screenStyleValueOf, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenUniversalPageAction[] newArray(int i12) {
            return new BeduinOpenUniversalPageAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOpenUniversalPageAction(@l String str, @l ScreenStyle screenStyle, @l Map<String, ? extends Map<String, String>> map, @l String str2, @l String str3, @l String str4) {
        this.requestUrl = str;
        this.presentationStyle = screenStyle;
        this.formParamsMap = map;
        this.screenName = str2;
        this.forcedThemeMode = str3;
        this.theme = str4;
    }

    public static /* synthetic */ BeduinOpenUniversalPageAction copy$default(BeduinOpenUniversalPageAction beduinOpenUniversalPageAction, String str, ScreenStyle screenStyle, Map map, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinOpenUniversalPageAction.requestUrl;
        }
        if ((i12 & 2) != 0) {
            screenStyle = beduinOpenUniversalPageAction.presentationStyle;
        }
        ScreenStyle screenStyle2 = screenStyle;
        if ((i12 & 4) != 0) {
            map = beduinOpenUniversalPageAction.formParamsMap;
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            str2 = beduinOpenUniversalPageAction.screenName;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = beduinOpenUniversalPageAction.forcedThemeMode;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            str4 = beduinOpenUniversalPageAction.theme;
        }
        return beduinOpenUniversalPageAction.copy(str, screenStyle2, map2, str5, str6, str4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getRequestUrl() {
        return this.requestUrl;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ScreenStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    public final Map<String, Map<String, String>> component3() {
        return this.formParamsMap;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getForcedThemeMode() {
        return this.forcedThemeMode;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @Y61.k
    public final BeduinOpenUniversalPageAction copy(@l String requestUrl, @l ScreenStyle presentationStyle, @l Map<String, ? extends Map<String, String>> formParamsMap, @l String screenName, @l String forcedThemeMode, @l String theme) {
        return new BeduinOpenUniversalPageAction(requestUrl, presentationStyle, formParamsMap, screenName, forcedThemeMode, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenUniversalPageAction)) {
            return false;
        }
        BeduinOpenUniversalPageAction beduinOpenUniversalPageAction = (BeduinOpenUniversalPageAction) other;
        return L.f(this.requestUrl, beduinOpenUniversalPageAction.requestUrl) && this.presentationStyle == beduinOpenUniversalPageAction.presentationStyle && L.f(this.formParamsMap, beduinOpenUniversalPageAction.formParamsMap) && L.f(this.screenName, beduinOpenUniversalPageAction.screenName) && L.f(this.forcedThemeMode, beduinOpenUniversalPageAction.forcedThemeMode) && L.f(this.theme, beduinOpenUniversalPageAction.theme);
    }

    @l
    public final String getForcedThemeMode() {
        return this.forcedThemeMode;
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @l
    public final ScreenStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    public final String getRequestUrl() {
        return this.requestUrl;
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
        String str = this.requestUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ScreenStyle screenStyle = this.presentationStyle;
        int iHashCode2 = (iHashCode + (screenStyle == null ? 0 : screenStyle.hashCode())) * 31;
        Map<String, Map<String, String>> map = this.formParamsMap;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.screenName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.forcedThemeMode;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.theme;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenUniversalPageAction(requestUrl=");
        sb2.append(this.requestUrl);
        sb2.append(", presentationStyle=");
        sb2.append(this.presentationStyle);
        sb2.append(", formParamsMap=");
        sb2.append(this.formParamsMap);
        sb2.append(", screenName=");
        sb2.append(this.screenName);
        sb2.append(", forcedThemeMode=");
        sb2.append(this.forcedThemeMode);
        sb2.append(", theme=");
        return C22026a.c(sb2, this.theme, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.requestUrl);
        ScreenStyle screenStyle = this.presentationStyle;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
        Map<String, Map<String, String>> map = this.formParamsMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                Iterator itI = C0.i(parcel, (Map) entry.getValue());
                while (itI.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) itI.next();
                    parcel.writeString((String) entry2.getKey());
                    parcel.writeString((String) entry2.getValue());
                }
            }
        }
        parcel.writeString(this.screenName);
        parcel.writeString(this.forcedThemeMode);
        parcel.writeString(this.theme);
    }

    public /* synthetic */ BeduinOpenUniversalPageAction(String str, ScreenStyle screenStyle, Map map, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, screenStyle, map, str2, (i12 & 16) != 0 ? null : str3, str4);
    }
}
