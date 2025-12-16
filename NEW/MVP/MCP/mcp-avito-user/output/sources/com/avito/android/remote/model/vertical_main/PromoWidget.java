package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.FavoriteElement;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010 R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b&\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u0011\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b2\u0010 ¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/PromoWidget;", "Lcom/avito/android/remote/model/FavoriteElement;", "", "title", "text", "promoId", "", "Lcom/avito/android/remote/model/vertical_main/PromoAction;", "actions", "image", "Lcom/avito/android/remote/model/vertical_main/MovableImage;", "movableImage", "Lcom/avito/android/remote/model/vertical_main/PromoAnalyticParams;", "analyticParams", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isUnifiedConfig", "view", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/MovableImage;Lcom/avito/android/remote/model/vertical_main/PromoAnalyticParams;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "getPromoId", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getImage", "Lcom/avito/android/remote/model/vertical_main/MovableImage;", "getMovableImage", "()Lcom/avito/android/remote/model/vertical_main/MovableImage;", "Lcom/avito/android/remote/model/vertical_main/PromoAnalyticParams;", "getAnalyticParams", "()Lcom/avito/android/remote/model/vertical_main/PromoAnalyticParams;", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getStyle", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getView", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoWidget implements FavoriteElement {

    @k
    public static final Parcelable.Creator<PromoWidget> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<PromoAction> actions;

    @c("analyticParams")
    @l
    private final PromoAnalyticParams analyticParams;

    @c("image")
    @l
    private final String image;

    @c("isUnifiedConfig")
    @l
    private final Boolean isUnifiedConfig;

    @c("movableImage")
    @l
    private final MovableImage movableImage;

    @c("promoId")
    @l
    private final String promoId;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final PromoStyle style;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    @c("view")
    @l
    private final String view;

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(PromoAction.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            String string4 = parcel.readString();
            MovableImage movableImageCreateFromParcel = parcel.readInt() == 0 ? null : MovableImage.CREATOR.createFromParcel(parcel);
            PromoAnalyticParams promoAnalyticParamsCreateFromParcel = parcel.readInt() == 0 ? null : PromoAnalyticParams.CREATOR.createFromParcel(parcel);
            PromoStyle promoStyleCreateFromParcel = parcel.readInt() == 0 ? null : PromoStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PromoWidget(string, string2, string3, arrayList, string4, movableImageCreateFromParcel, promoAnalyticParamsCreateFromParcel, promoStyleCreateFromParcel, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoWidget[] newArray(int i12) {
            return new PromoWidget[i12];
        }
    }

    public PromoWidget(@l String str, @l String str2, @l String str3, @l List<PromoAction> list, @l String str4, @l MovableImage movableImage, @l PromoAnalyticParams promoAnalyticParams, @l PromoStyle promoStyle, @l Boolean bool, @l String str5) {
        this.title = str;
        this.text = str2;
        this.promoId = str3;
        this.actions = list;
        this.image = str4;
        this.movableImage = movableImage;
        this.analyticParams = promoAnalyticParams;
        this.style = promoStyle;
        this.isUnifiedConfig = bool;
        this.view = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<PromoAction> getActions() {
        return this.actions;
    }

    @l
    public final PromoAnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final MovableImage getMovableImage() {
        return this.movableImage;
    }

    @l
    public final String getPromoId() {
        return this.promoId;
    }

    @l
    public final PromoStyle getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getView() {
        return this.view;
    }

    @l
    /* renamed from: isUnifiedConfig, reason: from getter */
    public final Boolean getIsUnifiedConfig() {
        return this.isUnifiedConfig;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.promoId);
        List<PromoAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((PromoAction) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.image);
        MovableImage movableImage = this.movableImage;
        if (movableImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            movableImage.writeToParcel(parcel, flags);
        }
        PromoAnalyticParams promoAnalyticParams = this.analyticParams;
        if (promoAnalyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoAnalyticParams.writeToParcel(parcel, flags);
        }
        PromoStyle promoStyle = this.style;
        if (promoStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoStyle.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isUnifiedConfig;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.view);
    }

    public PromoWidget(String str, String str2, String str3, List list, String str4, MovableImage movableImage, PromoAnalyticParams promoAnalyticParams, PromoStyle promoStyle, Boolean bool, String str5, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : movableImage, (i12 & 64) != 0 ? null : promoAnalyticParams, (i12 & 128) != 0 ? null : promoStyle, (i12 & 256) != 0 ? null : bool, (i12 & 512) == 0 ? str5 : null);
    }
}
