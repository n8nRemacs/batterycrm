package com.avito.android.remote.model.adverts;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoBlockData.kt */
@d
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u0004YZ[\\B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b)\u0010*J\u009c\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.HÖ\u0001¢\u0006\u0004\b5\u00100J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020.HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0017HÂ\u0003¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010 R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u0010(R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u0010*R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010RR\u0011\u0010T\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bS\u0010@R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\bU\u0010=R\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8F¢\u0006\u0006\u001a\u0004\bW\u0010=¨\u0006]"}, d2 = {"Lcom/avito/android/remote/model/adverts/PromoBlockData;", "Landroid/os/Parcelable;", "", "id", "", "title", "Lcom/avito/android/remote/model/adverts/PromoBlockData$ProgressBar;", "progressBar", "", "Lcom/avito/android/remote/model/adverts/PromoBlockData$Insight;", "_insights", "Lcom/avito/android/remote/model/SimpleAction;", "_actions", "Lcom/avito/android/remote/model/text/AttributedText;", "footer", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockType;", "type", "Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockPosition;", "position", "", "closable", "Lcom/avito/android/remote/model/search/Theme;", "_theme", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/PromoBlockData$ProgressBar;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockType;Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockPosition;ZLcom/avito/android/remote/model/search/Theme;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/adverts/PromoBlockData$ProgressBar;", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "component8", "()Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockType;", "component9", "()Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockPosition;", "component10", "()Z", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/PromoBlockData$ProgressBar;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockType;Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockPosition;ZLcom/avito/android/remote/model/search/Theme;)Lcom/avito/android/remote/model/adverts/PromoBlockData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component4", "()Ljava/util/List;", "component5", "component11", "()Lcom/avito/android/remote/model/search/Theme;", "Ljava/lang/Long;", "getId", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/adverts/PromoBlockData$ProgressBar;", "getProgressBar", "Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getFooter", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getStyle", "Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockType;", "getType", "Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockPosition;", "getPosition", "Z", "getClosable", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "getInsights", "insights", "getActions", "actions", "Insight", "MyAdvertPromoBlockPosition", "MyAdvertPromoBlockType", "ProgressBar", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoBlockData implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoBlockData> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<SimpleAction> _actions;

    @c("insights")
    @l
    private final List<Insight> _insights;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final Theme _theme;

    @c("closable")
    private final boolean closable;

    @c("footer")
    @l
    private final AttributedText footer;

    @c("id")
    @l
    private final Long id;

    @c("position")
    @l
    private final MyAdvertPromoBlockPosition position;

    @c("progressBar")
    @l
    private final ProgressBar progressBar;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final PromoStyle style;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final MyAdvertPromoBlockType type;

    /* compiled from: PromoBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoBlockData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBlockData createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            ProgressBar progressBarCreateFromParcel = parcel.readInt() == 0 ? null : ProgressBar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Insight.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = a.l(PromoBlockData.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new PromoBlockData(lValueOf, string, progressBarCreateFromParcel, arrayList, arrayList2, (AttributedText) parcel.readParcelable(PromoBlockData.class.getClassLoader()), (PromoStyle) parcel.readParcelable(PromoBlockData.class.getClassLoader()), parcel.readInt() == 0 ? null : MyAdvertPromoBlockType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MyAdvertPromoBlockPosition.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? Theme.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBlockData[] newArray(int i12) {
            return new PromoBlockData[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromoBlockData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockPosition;", "", "(Ljava/lang/String;I)V", "TOP", "DEFAULT", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyAdvertPromoBlockPosition {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ MyAdvertPromoBlockPosition[] $VALUES;

        @c("top")
        public static final MyAdvertPromoBlockPosition TOP = new MyAdvertPromoBlockPosition("TOP", 0);

        @c("default")
        public static final MyAdvertPromoBlockPosition DEFAULT = new MyAdvertPromoBlockPosition("DEFAULT", 1);

        private static final /* synthetic */ MyAdvertPromoBlockPosition[] $values() {
            return new MyAdvertPromoBlockPosition[]{TOP, DEFAULT};
        }

        static {
            MyAdvertPromoBlockPosition[] myAdvertPromoBlockPositionArr$values = $values();
            $VALUES = myAdvertPromoBlockPositionArr$values;
            $ENTRIES = kotlin.enums.c.a(myAdvertPromoBlockPositionArr$values);
        }

        private MyAdvertPromoBlockPosition(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<MyAdvertPromoBlockPosition> getEntries() {
            return $ENTRIES;
        }

        public static MyAdvertPromoBlockPosition valueOf(String str) {
            return (MyAdvertPromoBlockPosition) Enum.valueOf(MyAdvertPromoBlockPosition.class, str);
        }

        public static MyAdvertPromoBlockPosition[] values() {
            return (MyAdvertPromoBlockPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromoBlockData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/adverts/PromoBlockData$MyAdvertPromoBlockType;", "", "(Ljava/lang/String;I)V", "DEFAULT", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyAdvertPromoBlockType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ MyAdvertPromoBlockType[] $VALUES;

        @InterfaceC19823a
        public static final MyAdvertPromoBlockType DEFAULT = new MyAdvertPromoBlockType("DEFAULT", 0);

        private static final /* synthetic */ MyAdvertPromoBlockType[] $values() {
            return new MyAdvertPromoBlockType[]{DEFAULT};
        }

        static {
            MyAdvertPromoBlockType[] myAdvertPromoBlockTypeArr$values = $values();
            $VALUES = myAdvertPromoBlockTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(myAdvertPromoBlockTypeArr$values);
        }

        private MyAdvertPromoBlockType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<MyAdvertPromoBlockType> getEntries() {
            return $ENTRIES;
        }

        public static MyAdvertPromoBlockType valueOf(String str) {
            return (MyAdvertPromoBlockType) Enum.valueOf(MyAdvertPromoBlockType.class, str);
        }

        public static MyAdvertPromoBlockType[] values() {
            return (MyAdvertPromoBlockType[]) $VALUES.clone();
        }
    }

    /* compiled from: PromoBlockData.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/PromoBlockData$ProgressBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "value", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;F)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "F", "getValue", "()F", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProgressBar implements Parcelable {

        @k
        public static final Parcelable.Creator<ProgressBar> CREATOR = new Creator();

        @c("title")
        @k
        private final AttributedText title;

        @c("value")
        private final float value;

        /* compiled from: PromoBlockData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProgressBar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProgressBar createFromParcel(@k Parcel parcel) {
                return new ProgressBar((AttributedText) parcel.readParcelable(ProgressBar.class.getClassLoader()), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProgressBar[] newArray(int i12) {
                return new ProgressBar[i12];
            }
        }

        public ProgressBar(@k AttributedText attributedText, float f12) {
            this.title = attributedText;
            this.value = f12;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final AttributedText getTitle() {
            return this.title;
        }

        public final float getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.title, flags);
            parcel.writeFloat(this.value);
        }
    }

    public PromoBlockData(@l Long l12, @l String str, @l ProgressBar progressBar, @l List<Insight> list, @l List<SimpleAction> list2, @l AttributedText attributedText, @k PromoStyle promoStyle, @l MyAdvertPromoBlockType myAdvertPromoBlockType, @l MyAdvertPromoBlockPosition myAdvertPromoBlockPosition, boolean z12, @l Theme theme) {
        this.id = l12;
        this.title = str;
        this.progressBar = progressBar;
        this._insights = list;
        this._actions = list2;
        this.footer = attributedText;
        this.style = promoStyle;
        this.type = myAdvertPromoBlockType;
        this.position = myAdvertPromoBlockPosition;
        this.closable = z12;
        this._theme = theme;
    }

    /* renamed from: component11, reason: from getter */
    private final Theme get_theme() {
        return this._theme;
    }

    private final List<Insight> component4() {
        return this._insights;
    }

    private final List<SimpleAction> component5() {
        return this._actions;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getClosable() {
        return this.closable;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getFooter() {
        return this.footer;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final PromoStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final MyAdvertPromoBlockType getType() {
        return this.type;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final MyAdvertPromoBlockPosition getPosition() {
        return this.position;
    }

    @k
    public final PromoBlockData copy(@l Long id2, @l String title, @l ProgressBar progressBar, @l List<Insight> _insights, @l List<SimpleAction> _actions, @l AttributedText footer, @k PromoStyle style, @l MyAdvertPromoBlockType type, @l MyAdvertPromoBlockPosition position, boolean closable, @l Theme _theme) {
        return new PromoBlockData(id2, title, progressBar, _insights, _actions, footer, style, type, position, closable, _theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBlockData)) {
            return false;
        }
        PromoBlockData promoBlockData = (PromoBlockData) other;
        return L.f(this.id, promoBlockData.id) && L.f(this.title, promoBlockData.title) && L.f(this.progressBar, promoBlockData.progressBar) && L.f(this._insights, promoBlockData._insights) && L.f(this._actions, promoBlockData._actions) && L.f(this.footer, promoBlockData.footer) && this.style == promoBlockData.style && this.type == promoBlockData.type && this.position == promoBlockData.position && this.closable == promoBlockData.closable && this._theme == promoBlockData._theme;
    }

    @k
    public final List<SimpleAction> getActions() {
        List<SimpleAction> list = this._actions;
        return list == null ? C42784z0.f406748b : list;
    }

    public final boolean getClosable() {
        return this.closable;
    }

    @l
    public final AttributedText getFooter() {
        return this.footer;
    }

    @l
    public final Long getId() {
        return this.id;
    }

    @k
    public final List<Insight> getInsights() {
        List<Insight> list = this._insights;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final MyAdvertPromoBlockPosition getPosition() {
        return this.position;
    }

    @l
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    @k
    public final PromoStyle getStyle() {
        return this.style;
    }

    @k
    public final Theme getTheme() {
        Theme theme = this._theme;
        return theme == null ? Theme.AVITO_LOOK_AND_FEEL : theme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final MyAdvertPromoBlockType getType() {
        return this.type;
    }

    public int hashCode() {
        Long l12 = this.id;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProgressBar progressBar = this.progressBar;
        int iHashCode3 = (iHashCode2 + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        List<Insight> list = this._insights;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<SimpleAction> list2 = this._actions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AttributedText attributedText = this.footer;
        int iHashCode6 = (this.style.hashCode() + ((iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        MyAdvertPromoBlockType myAdvertPromoBlockType = this.type;
        int iHashCode7 = (iHashCode6 + (myAdvertPromoBlockType == null ? 0 : myAdvertPromoBlockType.hashCode())) * 31;
        MyAdvertPromoBlockPosition myAdvertPromoBlockPosition = this.position;
        int i12 = r.i((iHashCode7 + (myAdvertPromoBlockPosition == null ? 0 : myAdvertPromoBlockPosition.hashCode())) * 31, 31, this.closable);
        Theme theme = this._theme;
        return i12 + (theme != null ? theme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PromoBlockData(id=" + this.id + ", title=" + this.title + ", progressBar=" + this.progressBar + ", _insights=" + this._insights + ", _actions=" + this._actions + ", footer=" + this.footer + ", style=" + this.style + ", type=" + this.type + ", position=" + this.position + ", closable=" + this.closable + ", _theme=" + this._theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.title);
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            progressBar.writeToParcel(parcel, flags);
        }
        List<Insight> list = this._insights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Insight) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<SimpleAction> list2 = this._actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeParcelable(this.footer, flags);
        parcel.writeParcelable(this.style, flags);
        MyAdvertPromoBlockType myAdvertPromoBlockType = this.type;
        if (myAdvertPromoBlockType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(myAdvertPromoBlockType.name());
        }
        MyAdvertPromoBlockPosition myAdvertPromoBlockPosition = this.position;
        if (myAdvertPromoBlockPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(myAdvertPromoBlockPosition.name());
        }
        parcel.writeInt(this.closable ? 1 : 0);
        Theme theme = this._theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
    }

    /* compiled from: PromoBlockData.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/adverts/PromoBlockData$Insight;", "Landroid/os/Parcelable;", "", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "iconColor", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "getIconColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Insight implements Parcelable {

        @k
        public static final Parcelable.Creator<Insight> CREATOR = new Creator();

        @c("icon")
        @l
        private final String icon;

        @c("iconColor")
        @l
        private final UniversalColor iconColor;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: PromoBlockData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Insight> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Insight createFromParcel(@k Parcel parcel) {
                return new Insight(parcel.readString(), (UniversalColor) parcel.readParcelable(Insight.class.getClassLoader()), (AttributedText) parcel.readParcelable(Insight.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Insight[] newArray(int i12) {
                return new Insight[i12];
            }
        }

        public Insight(@l String str, @l UniversalColor universalColor, @k AttributedText attributedText) {
            this.icon = str;
            this.iconColor = universalColor;
            this.text = attributedText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final UniversalColor getIconColor() {
            return this.iconColor;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.icon);
            parcel.writeParcelable(this.iconColor, flags);
            parcel.writeParcelable(this.text, flags);
        }

        public /* synthetic */ Insight(String str, UniversalColor universalColor, AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : universalColor, attributedText);
        }
    }

    public /* synthetic */ PromoBlockData(Long l12, String str, ProgressBar progressBar, List list, List list2, AttributedText attributedText, PromoStyle promoStyle, MyAdvertPromoBlockType myAdvertPromoBlockType, MyAdvertPromoBlockPosition myAdvertPromoBlockPosition, boolean z12, Theme theme, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : progressBar, list, list2, (i12 & 32) != 0 ? null : attributedText, (i12 & 64) != 0 ? PromoStyle.WARMGRAY : promoStyle, (i12 & 128) != 0 ? MyAdvertPromoBlockType.DEFAULT : myAdvertPromoBlockType, (i12 & 256) != 0 ? MyAdvertPromoBlockPosition.DEFAULT : myAdvertPromoBlockPosition, (i12 & 512) != 0 ? false : z12, theme);
    }
}
