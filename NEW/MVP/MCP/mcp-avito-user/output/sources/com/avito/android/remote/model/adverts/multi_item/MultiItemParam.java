package com.avito.android.remote.model.adverts.multi_item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.adverts.multi_item.MultiItemModification;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemParam.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam;", "Landroid/os/Parcelable;", "CopyEntryPoint", "ModificationsParam", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$CopyEntryPoint;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MultiItemParam extends Parcelable {

    /* compiled from: MultiItemParam.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$CopyEntryPoint;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam;", "", "buttonText", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "iconName", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$CopyEntryPoint;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getIconName", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CopyEntryPoint implements MultiItemParam {

        @k
        public static final Parcelable.Creator<CopyEntryPoint> CREATOR = new Creator();

        @c("buttonText")
        @k
        private final String buttonText;

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("iconName")
        @k
        private final String iconName;

        /* compiled from: MultiItemParam.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CopyEntryPoint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CopyEntryPoint createFromParcel(@k Parcel parcel) {
                return new CopyEntryPoint(parcel.readString(), (DeepLink) parcel.readParcelable(CopyEntryPoint.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CopyEntryPoint[] newArray(int i12) {
                return new CopyEntryPoint[i12];
            }
        }

        public CopyEntryPoint(@k String str, @k DeepLink deepLink, @k String str2) {
            this.buttonText = str;
            this.deeplink = deepLink;
            this.iconName = str2;
        }

        public static /* synthetic */ CopyEntryPoint copy$default(CopyEntryPoint copyEntryPoint, String str, DeepLink deepLink, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = copyEntryPoint.buttonText;
            }
            if ((i12 & 2) != 0) {
                deepLink = copyEntryPoint.deeplink;
            }
            if ((i12 & 4) != 0) {
                str2 = copyEntryPoint.iconName;
            }
            return copyEntryPoint.copy(str, deepLink, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @k
        public final CopyEntryPoint copy(@k String buttonText, @k DeepLink deeplink, @k String iconName) {
            return new CopyEntryPoint(buttonText, deeplink, iconName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyEntryPoint)) {
                return false;
            }
            CopyEntryPoint copyEntryPoint = (CopyEntryPoint) other;
            return L.f(this.buttonText, copyEntryPoint.buttonText) && L.f(this.deeplink, copyEntryPoint.deeplink) && L.f(this.iconName, copyEntryPoint.iconName);
        }

        @k
        public final String getButtonText() {
            return this.buttonText;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getIconName() {
            return this.iconName;
        }

        public int hashCode() {
            return this.iconName.hashCode() + a.e(this.deeplink, this.buttonText.hashCode() * 31, 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CopyEntryPoint(buttonText=");
            sb2.append(this.buttonText);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", iconName=");
            return C22026a.c(sb2, this.iconName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.buttonText);
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeString(this.iconName);
        }
    }

    /* compiled from: MultiItemParam.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000f\u0010R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam;", "modifications", "", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification;", "getModifications", "()Ljava/util/List;", "title", "", "getTitle", "()Ljava/lang/String;", "titleRightAction", "Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "getTitleRightAction", "()Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "Chips", "Images", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam$Chips;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam$Images;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ModificationsParam extends MultiItemParam {

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam$Chips;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam;", "", "title", "Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "titleRightAction", "", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Chips;", "modifications", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;Ljava/util/List;)Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam$Chips;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "getTitleRightAction", "Ljava/util/List;", "getModifications", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Chips implements ModificationsParam {

            @k
            public static final Parcelable.Creator<Chips> CREATOR = new Creator();

            @c("modifications")
            @k
            private final List<MultiItemModification.Chips> modifications;

            @c("title")
            @k
            private final String title;

            @c("titleRightAction")
            @l
            private final TitleRightAction titleRightAction;

            /* compiled from: MultiItemParam.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Chips> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Chips createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    TitleRightAction titleRightActionCreateFromParcel = parcel.readInt() == 0 ? null : TitleRightAction.CREATOR.createFromParcel(parcel);
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(MultiItemModification.Chips.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Chips(string, titleRightActionCreateFromParcel, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Chips[] newArray(int i12) {
                    return new Chips[i12];
                }
            }

            public Chips(@k String str, @l TitleRightAction titleRightAction, @k List<MultiItemModification.Chips> list) {
                this.title = str;
                this.titleRightAction = titleRightAction;
                this.modifications = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Chips copy$default(Chips chips, String str, TitleRightAction titleRightAction, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = chips.title;
                }
                if ((i12 & 2) != 0) {
                    titleRightAction = chips.titleRightAction;
                }
                if ((i12 & 4) != 0) {
                    list = chips.modifications;
                }
                return chips.copy(str, titleRightAction, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final TitleRightAction getTitleRightAction() {
                return this.titleRightAction;
            }

            @k
            public final List<MultiItemModification.Chips> component3() {
                return this.modifications;
            }

            @k
            public final Chips copy(@k String title, @l TitleRightAction titleRightAction, @k List<MultiItemModification.Chips> modifications) {
                return new Chips(title, titleRightAction, modifications);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Chips)) {
                    return false;
                }
                Chips chips = (Chips) other;
                return L.f(this.title, chips.title) && L.f(this.titleRightAction, chips.titleRightAction) && L.f(this.modifications, chips.modifications);
            }

            @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemParam.ModificationsParam
            @k
            public List<MultiItemModification.Chips> getModifications() {
                return this.modifications;
            }

            @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemParam.ModificationsParam
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemParam.ModificationsParam
            @l
            public TitleRightAction getTitleRightAction() {
                return this.titleRightAction;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                TitleRightAction titleRightAction = this.titleRightAction;
                return this.modifications.hashCode() + ((iHashCode + (titleRightAction == null ? 0 : titleRightAction.hashCode())) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Chips(title=");
                sb2.append(this.title);
                sb2.append(", titleRightAction=");
                sb2.append(this.titleRightAction);
                sb2.append(", modifications=");
                return H.p(sb2, this.modifications, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                TitleRightAction titleRightAction = this.titleRightAction;
                if (titleRightAction == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    titleRightAction.writeToParcel(parcel, flags);
                }
                Iterator itJ = C0.j(this.modifications, parcel);
                while (itJ.hasNext()) {
                    ((MultiItemModification.Chips) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014R\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam$Images;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam;", "", "title", "Lcom/avito/android/remote/model/adverts/multi_item/ImageType;", "_imageType", "Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "titleRightAction", "", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Images;", "modifications", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/ImageType;Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;Ljava/util/List;)V", "component2", "()Lcom/avito/android/remote/model/adverts/multi_item/ImageType;", "component1", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/ImageType;Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;Ljava/util/List;)Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam$ModificationsParam$Images;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/adverts/multi_item/ImageType;", "Lcom/avito/android/remote/model/adverts/multi_item/TitleRightAction;", "getTitleRightAction", "Ljava/util/List;", "getModifications", "getImageType", "imageType", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Images implements ModificationsParam {

            @k
            public static final Parcelable.Creator<Images> CREATOR = new Creator();

            @c("imageType")
            @l
            private final ImageType _imageType;

            @c("modifications")
            @k
            private final List<MultiItemModification.Images> modifications;

            @c("title")
            @k
            private final String title;

            @c("titleRightAction")
            @l
            private final TitleRightAction titleRightAction;

            /* compiled from: MultiItemParam.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Images> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Images createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    ImageType imageTypeValueOf = parcel.readInt() == 0 ? null : ImageType.valueOf(parcel.readString());
                    TitleRightAction titleRightActionCreateFromParcel = parcel.readInt() != 0 ? TitleRightAction.CREATOR.createFromParcel(parcel) : null;
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(MultiItemModification.Images.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Images(string, imageTypeValueOf, titleRightActionCreateFromParcel, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Images[] newArray(int i12) {
                    return new Images[i12];
                }
            }

            public Images(@k String str, @l ImageType imageType, @l TitleRightAction titleRightAction, @k List<MultiItemModification.Images> list) {
                this.title = str;
                this._imageType = imageType;
                this.titleRightAction = titleRightAction;
                this.modifications = list;
            }

            /* renamed from: component2, reason: from getter */
            private final ImageType get_imageType() {
                return this._imageType;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Images copy$default(Images images, String str, ImageType imageType, TitleRightAction titleRightAction, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = images.title;
                }
                if ((i12 & 2) != 0) {
                    imageType = images._imageType;
                }
                if ((i12 & 4) != 0) {
                    titleRightAction = images.titleRightAction;
                }
                if ((i12 & 8) != 0) {
                    list = images.modifications;
                }
                return images.copy(str, imageType, titleRightAction, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final TitleRightAction getTitleRightAction() {
                return this.titleRightAction;
            }

            @k
            public final List<MultiItemModification.Images> component4() {
                return this.modifications;
            }

            @k
            public final Images copy(@k String title, @l ImageType _imageType, @l TitleRightAction titleRightAction, @k List<MultiItemModification.Images> modifications) {
                return new Images(title, _imageType, titleRightAction, modifications);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Images)) {
                    return false;
                }
                Images images = (Images) other;
                return L.f(this.title, images.title) && this._imageType == images._imageType && L.f(this.titleRightAction, images.titleRightAction) && L.f(this.modifications, images.modifications);
            }

            @k
            public final ImageType getImageType() {
                ImageType imageType = this._imageType;
                return imageType == null ? ImageType.Square : imageType;
            }

            @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemParam.ModificationsParam
            @k
            public List<MultiItemModification.Images> getModifications() {
                return this.modifications;
            }

            @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemParam.ModificationsParam
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemParam.ModificationsParam
            @l
            public TitleRightAction getTitleRightAction() {
                return this.titleRightAction;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                ImageType imageType = this._imageType;
                int iHashCode2 = (iHashCode + (imageType == null ? 0 : imageType.hashCode())) * 31;
                TitleRightAction titleRightAction = this.titleRightAction;
                return this.modifications.hashCode() + ((iHashCode2 + (titleRightAction != null ? titleRightAction.hashCode() : 0)) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Images(title=");
                sb2.append(this.title);
                sb2.append(", _imageType=");
                sb2.append(this._imageType);
                sb2.append(", titleRightAction=");
                sb2.append(this.titleRightAction);
                sb2.append(", modifications=");
                return H.p(sb2, this.modifications, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                ImageType imageType = this._imageType;
                if (imageType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(imageType.name());
                }
                TitleRightAction titleRightAction = this.titleRightAction;
                if (titleRightAction == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    titleRightAction.writeToParcel(parcel, flags);
                }
                Iterator itJ = C0.j(this.modifications, parcel);
                while (itJ.hasNext()) {
                    ((MultiItemModification.Images) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        @k
        List<MultiItemModification> getModifications();

        @k
        String getTitle();

        @l
        TitleRightAction getTitleRightAction();
    }
}
