package com.avito.android.remote.model.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import org.webrtc.h;

/* compiled from: OnboradingCarousel.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001-BX\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R-\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/onboarding/AdditionalAction;", "Landroid/os/Parcelable;", "", "buttonTitle", "Lcom/avito/android/remote/model/onboarding/ButtonAction;", "buttonAction", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "", "", "LK51/e;", "params", "Lcom/avito/android/remote/model/onboarding/RequestType;", "requestType", "Lcom/avito/android/remote/model/onboarding/AdditionalAction$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/onboarding/ButtonAction;Landroid/net/Uri;Ljava/util/Map;Lcom/avito/android/remote/model/onboarding/RequestType;Lcom/avito/android/remote/model/onboarding/AdditionalAction$Style;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/onboarding/ButtonAction;", "getButtonAction", "()Lcom/avito/android/remote/model/onboarding/ButtonAction;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/onboarding/RequestType;", "getRequestType", "()Lcom/avito/android/remote/model/onboarding/RequestType;", "Lcom/avito/android/remote/model/onboarding/AdditionalAction$Style;", "getStyle", "()Lcom/avito/android/remote/model/onboarding/AdditionalAction$Style;", "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdditionalAction implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalAction> CREATOR = new Creator();

    @c("buttonAction")
    @l
    private final ButtonAction buttonAction;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("params")
    @l
    private final Map<String, Object> params;

    @c("requestType")
    @l
    private final RequestType requestType;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final Uri uri;

    /* compiled from: OnboradingCarousel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalAction createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            ButtonAction buttonActionValueOf = parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString());
            Uri uri = (Uri) parcel.readParcelable(AdditionalAction.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(AdditionalAction.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AdditionalAction(string, buttonActionValueOf, uri, linkedHashMap, parcel.readInt() == 0 ? null : RequestType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalAction[] newArray(int i12) {
            return new AdditionalAction[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnboradingCarousel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/onboarding/AdditionalAction$Style;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @c("primary")
        public static final Style PRIMARY = new Style("PRIMARY", 0);

        @c("secondary")
        public static final Style SECONDARY = new Style("SECONDARY", 1);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{PRIMARY, SECONDARY};
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

    public AdditionalAction(@l String str, @l ButtonAction buttonAction, @l Uri uri, @l Map<String, ? extends Object> map, @l RequestType requestType, @l Style style) {
        this.buttonTitle = str;
        this.buttonAction = buttonAction;
        this.uri = uri;
        this.params = map;
        this.requestType = requestType;
        this.style = style;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @l
    public final RequestType getRequestType() {
        return this.requestType;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final Uri getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.buttonTitle);
        ButtonAction buttonAction = this.buttonAction;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        parcel.writeParcelable(this.uri, flags);
        Map<String, Object> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        RequestType requestType = this.requestType;
        if (requestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(requestType.name());
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
    }

    public /* synthetic */ AdditionalAction(String str, ButtonAction buttonAction, Uri uri, Map map, RequestType requestType, Style style, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : buttonAction, uri, map, requestType, (i12 & 32) != 0 ? Style.PRIMARY : style);
    }
}
