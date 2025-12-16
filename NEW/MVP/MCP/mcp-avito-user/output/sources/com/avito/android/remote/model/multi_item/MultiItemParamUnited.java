package com.avito.android.remote.model.multi_item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.multi_item.MultiItemModification;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemParam.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited;", "Landroid/os/Parcelable;", "MultiItemParam", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Parameters;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MultiItemParamUnited extends Parcelable {

    /* compiled from: MultiItemParam.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u000f\u0010\u0011\u0012\u0013\u0014R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited;", "modifications", "", "Lcom/avito/android/remote/model/multi_item/MultiItemModification;", "getModifications", "()Ljava/util/List;", "title", "", "getTitle", "()Ljava/lang/String;", "titleRightAction", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "getTitleRightAction", "()Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "AnalyticsInfo", "Chips", "ImageType", "Images", "Parameters", "TitleRightAction", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Chips;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Images;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MultiItemParam extends MultiItemParamUnited {

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;", "Landroid/os/Parcelable;", "", "xHash", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getXHash", "getContext", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AnalyticsInfo implements Parcelable {

            @k
            public static final Parcelable.Creator<AnalyticsInfo> CREATOR = new Creator();

            @c("context")
            @l
            private final String context;

            @c("xHash")
            @l
            private final String xHash;

            /* compiled from: MultiItemParam.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AnalyticsInfo> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AnalyticsInfo createFromParcel(@k Parcel parcel) {
                    return new AnalyticsInfo(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AnalyticsInfo[] newArray(int i12) {
                    return new AnalyticsInfo[i12];
                }
            }

            public AnalyticsInfo(@l String str, @l String str2) {
                this.xHash = str;
                this.context = str2;
            }

            public static /* synthetic */ AnalyticsInfo copy$default(AnalyticsInfo analyticsInfo, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = analyticsInfo.xHash;
                }
                if ((i12 & 2) != 0) {
                    str2 = analyticsInfo.context;
                }
                return analyticsInfo.copy(str, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getXHash() {
                return this.xHash;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            @k
            public final AnalyticsInfo copy(@l String xHash, @l String context) {
                return new AnalyticsInfo(xHash, context);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnalyticsInfo)) {
                    return false;
                }
                AnalyticsInfo analyticsInfo = (AnalyticsInfo) other;
                return L.f(this.xHash, analyticsInfo.xHash) && L.f(this.context, analyticsInfo.context);
            }

            @l
            public final String getContext() {
                return this.context;
            }

            @l
            public final String getXHash() {
                return this.xHash;
            }

            public int hashCode() {
                String str = this.xHash;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.context;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AnalyticsInfo(xHash=");
                sb2.append(this.xHash);
                sb2.append(", context=");
                return C22026a.c(sb2, this.context, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.xHash);
                parcel.writeString(this.context);
            }
        }

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Chips;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam;", "", "title", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "titleRightAction", "", "Lcom/avito/android/remote/model/multi_item/MultiItemModification$Chips;", "modifications", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;Ljava/util/List;)Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Chips;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "getTitleRightAction", "Ljava/util/List;", "getModifications", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Chips implements MultiItemParam {

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

            @Override // com.avito.android.remote.model.multi_item.MultiItemParamUnited.MultiItemParam
            @k
            public List<MultiItemModification.Chips> getModifications() {
                return this.modifications;
            }

            @Override // com.avito.android.remote.model.multi_item.MultiItemParamUnited.MultiItemParam
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.multi_item.MultiItemParamUnited.MultiItemParam
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MultiItemParam.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$ImageType;", "", "(Ljava/lang/String;I)V", "Square", "Portrait", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ImageType {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ ImageType[] $VALUES;

            @c("square")
            public static final ImageType Square = new ImageType("Square", 0);

            @c("portrait")
            public static final ImageType Portrait = new ImageType("Portrait", 1);

            private static final /* synthetic */ ImageType[] $values() {
                return new ImageType[]{Square, Portrait};
            }

            static {
                ImageType[] imageTypeArr$values = $values();
                $VALUES = imageTypeArr$values;
                $ENTRIES = kotlin.enums.c.a(imageTypeArr$values);
            }

            private ImageType(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<ImageType> getEntries() {
                return $ENTRIES;
            }

            public static ImageType valueOf(String str) {
                return (ImageType) Enum.valueOf(ImageType.class, str);
            }

            public static ImageType[] values() {
                return (ImageType[]) $VALUES.clone();
            }
        }

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014R\u0011\u0010/\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Images;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam;", "", "title", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$ImageType;", "_imageType", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "titleRightAction", "", "Lcom/avito/android/remote/model/multi_item/MultiItemModification$Images;", "modifications", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$ImageType;Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;Ljava/util/List;)V", "component2", "()Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$ImageType;", "component1", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$ImageType;Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;Ljava/util/List;)Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Images;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$ImageType;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "getTitleRightAction", "Ljava/util/List;", "getModifications", "getImageType", "imageType", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Images implements MultiItemParam {

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

            @Override // com.avito.android.remote.model.multi_item.MultiItemParamUnited.MultiItemParam
            @k
            public List<MultiItemModification.Images> getModifications() {
                return this.modifications;
            }

            @Override // com.avito.android.remote.model.multi_item.MultiItemParamUnited.MultiItemParam
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.multi_item.MultiItemParamUnited.MultiItemParam
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

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Parameters;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited;", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;", "analyticsInfo", "<init>", "(Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;)V", "component1", "()Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;", "copy", "(Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;)Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$Parameters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$AnalyticsInfo;", "getAnalyticsInfo", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Parameters implements MultiItemParamUnited {

            @k
            public static final Parcelable.Creator<Parameters> CREATOR = new Creator();

            @c("analyticsInfo")
            @k
            private final AnalyticsInfo analyticsInfo;

            /* compiled from: MultiItemParam.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Parameters> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Parameters createFromParcel(@k Parcel parcel) {
                    return new Parameters(AnalyticsInfo.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Parameters[] newArray(int i12) {
                    return new Parameters[i12];
                }
            }

            public Parameters(@k AnalyticsInfo analyticsInfo) {
                this.analyticsInfo = analyticsInfo;
            }

            public static /* synthetic */ Parameters copy$default(Parameters parameters, AnalyticsInfo analyticsInfo, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    analyticsInfo = parameters.analyticsInfo;
                }
                return parameters.copy(analyticsInfo);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final AnalyticsInfo getAnalyticsInfo() {
                return this.analyticsInfo;
            }

            @k
            public final Parameters copy(@k AnalyticsInfo analyticsInfo) {
                return new Parameters(analyticsInfo);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Parameters) && L.f(this.analyticsInfo, ((Parameters) other).analyticsInfo);
            }

            @k
            public final AnalyticsInfo getAnalyticsInfo() {
                return this.analyticsInfo;
            }

            public int hashCode() {
                return this.analyticsInfo.hashCode();
            }

            @k
            public String toString() {
                return "Parameters(analyticsInfo=" + this.analyticsInfo + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.analyticsInfo.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: MultiItemParam.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/multi_item/MultiItemParamUnited$MultiItemParam$TitleRightAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TitleRightAction implements Parcelable {

            @k
            public static final Parcelable.Creator<TitleRightAction> CREATOR = new Creator();

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink deepLink;

            @c("title")
            @k
            private final String title;

            /* compiled from: MultiItemParam.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TitleRightAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final TitleRightAction createFromParcel(@k Parcel parcel) {
                    return new TitleRightAction(parcel.readString(), (DeepLink) parcel.readParcelable(TitleRightAction.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final TitleRightAction[] newArray(int i12) {
                    return new TitleRightAction[i12];
                }
            }

            public TitleRightAction(@k String str, @k DeepLink deepLink) {
                this.title = str;
                this.deepLink = deepLink;
            }

            public static /* synthetic */ TitleRightAction copy$default(TitleRightAction titleRightAction, String str, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = titleRightAction.title;
                }
                if ((i12 & 2) != 0) {
                    deepLink = titleRightAction.deepLink;
                }
                return titleRightAction.copy(str, deepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final TitleRightAction copy(@k String title, @k DeepLink deepLink) {
                return new TitleRightAction(title, deepLink);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TitleRightAction)) {
                    return false;
                }
                TitleRightAction titleRightAction = (TitleRightAction) other;
                return L.f(this.title, titleRightAction.title) && L.f(this.deepLink, titleRightAction.deepLink);
            }

            @k
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.deepLink.hashCode() + (this.title.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("TitleRightAction(title=");
                sb2.append(this.title);
                sb2.append(", deepLink=");
                return a.v(sb2, this.deepLink, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.deepLink, flags);
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
