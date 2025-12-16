package com.avito.android.remote.model.universalDeliveryType;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.UniversalMapSettingsDto;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: UniversalDeliveryTypeContent.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent;", "Landroid/os/Parcelable;", "", "title", "", "selectedTabIndex", "", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "tabs", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$TabsStyle;", "tabsStyle", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$TabsStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$TabsStyle;", "copy", "(Ljava/lang/String;ILjava/util/List;Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$TabsStyle;)Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "I", "getSelectedTabIndex", "Ljava/util/List;", "getTabs", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$TabsStyle;", "getTabsStyle", "Tab", "TabsStyle", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalDeliveryTypeContent implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalDeliveryTypeContent> CREATOR = new Creator();

    @c("selectedTabIndex")
    private final int selectedTabIndex;

    @c("tabs")
    @k
    private final List<Tab> tabs;

    @c("tabsStyle")
    @l
    private final TabsStyle tabsStyle;

    @c("title")
    @k
    private final String title;

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalDeliveryTypeContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalDeliveryTypeContent createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = a.l(UniversalDeliveryTypeContent.class, parcel, arrayList, iL2, 1);
            }
            return new UniversalDeliveryTypeContent(string, i12, arrayList, parcel.readInt() == 0 ? null : TabsStyle.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalDeliveryTypeContent[] newArray(int i12) {
            return new UniversalDeliveryTypeContent[i12];
        }
    }

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "Landroid/os/Parcelable;", "()V", "isEnabled", "", "()Z", "onManualSelectActions", "", "Lcom/avito/android/beduin_models/BeduinAction;", "getOnManualSelectActions", "()Ljava/util/List;", "onSelectActions", "getOnSelectActions", "tabType", "", "getTabType", "()Ljava/lang/String;", "title", "getTitle", "Courier", "PvzOnUniversalMap", "ShippingCompetition", "Unknown", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$Courier;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$ShippingCompetition;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$Unknown;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Tab implements Parcelable {

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u009e\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0014R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b8\u0010\u0014R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00058\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b9\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b:\u0010\u0014R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b;\u0010\u0017R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b<\u0010\u0017¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$Courier;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "", "tabType", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "onManualSelectActions", "", "isEnabled", "mainFormId", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "bottomFormId", "bottomComponents", "onInitActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$Courier;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabType", "getTitle", "Ljava/util/List;", "getOnSelectActions", "getOnManualSelectActions", "Z", "getMainFormId", "getMainComponents", "getBottomFormId", "getBottomComponents", "getOnInitActions", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Courier extends Tab {

            @k
            public static final Parcelable.Creator<Courier> CREATOR = new Creator();

            @l
            private final List<BeduinModel> bottomComponents;

            @l
            private final String bottomFormId;
            private final boolean isEnabled;

            @k
            private final List<BeduinModel> mainComponents;

            @k
            private final String mainFormId;

            @l
            private final List<BeduinAction> onInitActions;

            @l
            private final List<BeduinAction> onManualSelectActions;

            @l
            private final List<BeduinAction> onSelectActions;

            @k
            private final String tabType;

            @k
            private final String title;

            /* compiled from: UniversalDeliveryTypeContent.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Courier> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Courier createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int iL2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList5 = new ArrayList(i12);
                        int iL3 = 0;
                        while (iL3 != i12) {
                            iL3 = a.l(Courier.class, parcel, arrayList5, iL3, 1);
                        }
                        arrayList = arrayList5;
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        arrayList2 = new ArrayList(i13);
                        int iL4 = 0;
                        while (iL4 != i13) {
                            iL4 = a.l(Courier.class, parcel, arrayList2, iL4, 1);
                        }
                    }
                    boolean z12 = parcel.readInt() != 0;
                    String string3 = parcel.readString();
                    int i14 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i14);
                    int iL5 = 0;
                    while (iL5 != i14) {
                        iL5 = a.l(Courier.class, parcel, arrayList6, iL5, 1);
                    }
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList3 = null;
                    } else {
                        int i15 = parcel.readInt();
                        arrayList3 = new ArrayList(i15);
                        int iL6 = 0;
                        while (iL6 != i15) {
                            iL6 = a.l(Courier.class, parcel, arrayList3, iL6, 1);
                        }
                    }
                    if (parcel.readInt() == 0) {
                        arrayList4 = null;
                    } else {
                        int i16 = parcel.readInt();
                        arrayList4 = new ArrayList(i16);
                        while (iL2 != i16) {
                            iL2 = a.l(Courier.class, parcel, arrayList4, iL2, 1);
                        }
                    }
                    return new Courier(string, string2, arrayList, arrayList2, z12, string3, arrayList6, string4, arrayList3, arrayList4);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Courier[] newArray(int i12) {
                    return new Courier[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Courier(@k String str, @k String str2, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, boolean z12, @k String str3, @k List<? extends BeduinModel> list3, @l String str4, @l List<? extends BeduinModel> list4, @l List<? extends BeduinAction> list5) {
                super(null);
                this.tabType = str;
                this.title = str2;
                this.onSelectActions = list;
                this.onManualSelectActions = list2;
                this.isEnabled = z12;
                this.mainFormId = str3;
                this.mainComponents = list3;
                this.bottomFormId = str4;
                this.bottomComponents = list4;
                this.onInitActions = list5;
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTabType() {
                return this.tabType;
            }

            @l
            public final List<BeduinAction> component10() {
                return this.onInitActions;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            public final List<BeduinAction> component3() {
                return this.onSelectActions;
            }

            @l
            public final List<BeduinAction> component4() {
                return this.onManualSelectActions;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            /* renamed from: component6, reason: from getter */
            public final String getMainFormId() {
                return this.mainFormId;
            }

            @k
            public final List<BeduinModel> component7() {
                return this.mainComponents;
            }

            @l
            /* renamed from: component8, reason: from getter */
            public final String getBottomFormId() {
                return this.bottomFormId;
            }

            @l
            public final List<BeduinModel> component9() {
                return this.bottomComponents;
            }

            @k
            public final Courier copy(@k String tabType, @k String title, @l List<? extends BeduinAction> onSelectActions, @l List<? extends BeduinAction> onManualSelectActions, boolean isEnabled, @k String mainFormId, @k List<? extends BeduinModel> mainComponents, @l String bottomFormId, @l List<? extends BeduinModel> bottomComponents, @l List<? extends BeduinAction> onInitActions) {
                return new Courier(tabType, title, onSelectActions, onManualSelectActions, isEnabled, mainFormId, mainComponents, bottomFormId, bottomComponents, onInitActions);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Courier)) {
                    return false;
                }
                Courier courier = (Courier) other;
                return L.f(this.tabType, courier.tabType) && L.f(this.title, courier.title) && L.f(this.onSelectActions, courier.onSelectActions) && L.f(this.onManualSelectActions, courier.onManualSelectActions) && this.isEnabled == courier.isEnabled && L.f(this.mainFormId, courier.mainFormId) && L.f(this.mainComponents, courier.mainComponents) && L.f(this.bottomFormId, courier.bottomFormId) && L.f(this.bottomComponents, courier.bottomComponents) && L.f(this.onInitActions, courier.onInitActions);
            }

            @l
            public final List<BeduinModel> getBottomComponents() {
                return this.bottomComponents;
            }

            @l
            public final String getBottomFormId() {
                return this.bottomFormId;
            }

            @k
            public final List<BeduinModel> getMainComponents() {
                return this.mainComponents;
            }

            @k
            public final String getMainFormId() {
                return this.mainFormId;
            }

            @l
            public final List<BeduinAction> getOnInitActions() {
                return this.onInitActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnManualSelectActions() {
                return this.onManualSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnSelectActions() {
                return this.onSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTabType() {
                return this.tabType;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iD2 = H.d(this.tabType.hashCode() * 31, 31, this.title);
                List<BeduinAction> list = this.onSelectActions;
                int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
                List<BeduinAction> list2 = this.onManualSelectActions;
                int iE2 = H.e(H.d(r.i((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isEnabled), 31, this.mainFormId), 31, this.mainComponents);
                String str = this.bottomFormId;
                int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
                List<BeduinModel> list3 = this.bottomComponents;
                int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<BeduinAction> list4 = this.onInitActions;
                return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            /* renamed from: isEnabled */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Courier(tabType=");
                sb2.append(this.tabType);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", onSelectActions=");
                sb2.append(this.onSelectActions);
                sb2.append(", onManualSelectActions=");
                sb2.append(this.onManualSelectActions);
                sb2.append(", isEnabled=");
                sb2.append(this.isEnabled);
                sb2.append(", mainFormId=");
                sb2.append(this.mainFormId);
                sb2.append(", mainComponents=");
                sb2.append(this.mainComponents);
                sb2.append(", bottomFormId=");
                sb2.append(this.bottomFormId);
                sb2.append(", bottomComponents=");
                sb2.append(this.bottomComponents);
                sb2.append(", onInitActions=");
                return H.p(sb2, this.onInitActions, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.tabType);
                parcel.writeString(this.title);
                List<BeduinAction> list = this.onSelectActions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                List<BeduinAction> list2 = this.onManualSelectActions;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA2.next(), flags);
                    }
                }
                parcel.writeInt(this.isEnabled ? 1 : 0);
                parcel.writeString(this.mainFormId);
                Iterator itJ = C0.j(this.mainComponents, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
                parcel.writeString(this.bottomFormId);
                List<BeduinModel> list3 = this.bottomComponents;
                if (list3 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA3 = a.A(list3, parcel, 1);
                    while (itA3.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA3.next(), flags);
                    }
                }
                List<BeduinAction> list4 = this.onInitActions;
                if (list4 == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA4 = a.A(list4, parcel, 1);
                while (itA4.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA4.next(), flags);
                }
            }
        }

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u00016BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014Jn\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0019R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b5\u0010\u0014¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "", "tabType", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "onManualSelectActions", "", "isEnabled", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;", "params", "onInitActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Z", "component6", "()Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;Ljava/util/List;)Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabType", "getTitle", "Ljava/util/List;", "getOnSelectActions", "getOnManualSelectActions", "Z", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;", "getParams", "getOnInitActions", "MapParams", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class PvzOnUniversalMap extends Tab {

            @k
            public static final Parcelable.Creator<PvzOnUniversalMap> CREATOR = new Creator();
            private final boolean isEnabled;

            @l
            private final List<BeduinAction> onInitActions;

            @l
            private final List<BeduinAction> onManualSelectActions;

            @l
            private final List<BeduinAction> onSelectActions;

            @k
            private final MapParams params;

            @k
            private final String tabType;

            @k
            private final String title;

            /* compiled from: UniversalDeliveryTypeContent.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PvzOnUniversalMap> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PvzOnUniversalMap createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    ArrayList arrayList3 = null;
                    int iL2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL3 = 0;
                        while (iL3 != i12) {
                            iL3 = a.l(PvzOnUniversalMap.class, parcel, arrayList, iL3, 1);
                        }
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        arrayList2 = new ArrayList(i13);
                        int iL4 = 0;
                        while (iL4 != i13) {
                            iL4 = a.l(PvzOnUniversalMap.class, parcel, arrayList2, iL4, 1);
                        }
                    }
                    boolean z12 = parcel.readInt() != 0;
                    MapParams mapParamsCreateFromParcel = MapParams.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int i14 = parcel.readInt();
                        arrayList3 = new ArrayList(i14);
                        while (iL2 != i14) {
                            iL2 = a.l(PvzOnUniversalMap.class, parcel, arrayList3, iL2, 1);
                        }
                    }
                    return new PvzOnUniversalMap(string, string2, arrayList, arrayList2, z12, mapParamsCreateFromParcel, arrayList3);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PvzOnUniversalMap[] newArray(int i12) {
                    return new PvzOnUniversalMap[i12];
                }
            }

            /* compiled from: UniversalDeliveryTypeContent.kt */
            @Keep
            @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJo\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0019R(\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010\u001d¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;", "Landroid/os/Parcelable;", "", "pointListRequest", "pointInfoRequest", "filtersInfoRequest", "Lcom/avito/android/universal_map/UniversalMapParams$ToolbarSettings;", "toolbarSettings", "Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "mapSettings", "", "", "LK51/e;", "extraParameters", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onOpenEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/universal_map/UniversalMapParams$ToolbarSettings;Lcom/avito/android/universal_map/UniversalMapSettingsDto;Ljava/util/Map;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/universal_map/UniversalMapParams$ToolbarSettings;", "component5", "()Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "component6", "()Ljava/util/Map;", "component7", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/universal_map/UniversalMapParams$ToolbarSettings;Lcom/avito/android/universal_map/UniversalMapSettingsDto;Ljava/util/Map;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$PvzOnUniversalMap$MapParams;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPointListRequest", "getPointInfoRequest", "getFiltersInfoRequest", "Lcom/avito/android/universal_map/UniversalMapParams$ToolbarSettings;", "getToolbarSettings", "Lcom/avito/android/universal_map/UniversalMapSettingsDto;", "getMapSettings", "Ljava/util/Map;", "getExtraParameters", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getOnOpenEvent", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class MapParams implements Parcelable {

                @k
                public static final Parcelable.Creator<MapParams> CREATOR = new Creator();

                @k
                private final Map<String, Object> extraParameters;

                @l
                private final String filtersInfoRequest;

                @l
                private final UniversalMapSettingsDto mapSettings;

                @l
                private final ParametrizedEvent onOpenEvent;

                @k
                private final String pointInfoRequest;

                @k
                private final String pointListRequest;

                @l
                private final UniversalMapParams.ToolbarSettings toolbarSettings;

                /* compiled from: UniversalDeliveryTypeContent.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<MapParams> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final MapParams createFromParcel(@k Parcel parcel) {
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        UniversalMapParams.ToolbarSettings toolbarSettings = (UniversalMapParams.ToolbarSettings) parcel.readParcelable(MapParams.class.getClassLoader());
                        UniversalMapSettingsDto universalMapSettingsDto = (UniversalMapSettingsDto) parcel.readParcelable(MapParams.class.getClassLoader());
                        int i12 = parcel.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = h.c(MapParams.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                        }
                        return new MapParams(string, string2, string3, toolbarSettings, universalMapSettingsDto, linkedHashMap, (ParametrizedEvent) parcel.readParcelable(MapParams.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final MapParams[] newArray(int i12) {
                        return new MapParams[i12];
                    }
                }

                public MapParams(@k String str, @k String str2, @l String str3, @l UniversalMapParams.ToolbarSettings toolbarSettings, @l UniversalMapSettingsDto universalMapSettingsDto, @k Map<String, ? extends Object> map, @l ParametrizedEvent parametrizedEvent) {
                    this.pointListRequest = str;
                    this.pointInfoRequest = str2;
                    this.filtersInfoRequest = str3;
                    this.toolbarSettings = toolbarSettings;
                    this.mapSettings = universalMapSettingsDto;
                    this.extraParameters = map;
                    this.onOpenEvent = parametrizedEvent;
                }

                public static /* synthetic */ MapParams copy$default(MapParams mapParams, String str, String str2, String str3, UniversalMapParams.ToolbarSettings toolbarSettings, UniversalMapSettingsDto universalMapSettingsDto, Map map, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = mapParams.pointListRequest;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = mapParams.pointInfoRequest;
                    }
                    String str4 = str2;
                    if ((i12 & 4) != 0) {
                        str3 = mapParams.filtersInfoRequest;
                    }
                    String str5 = str3;
                    if ((i12 & 8) != 0) {
                        toolbarSettings = mapParams.toolbarSettings;
                    }
                    UniversalMapParams.ToolbarSettings toolbarSettings2 = toolbarSettings;
                    if ((i12 & 16) != 0) {
                        universalMapSettingsDto = mapParams.mapSettings;
                    }
                    UniversalMapSettingsDto universalMapSettingsDto2 = universalMapSettingsDto;
                    if ((i12 & 32) != 0) {
                        map = mapParams.extraParameters;
                    }
                    Map map2 = map;
                    if ((i12 & 64) != 0) {
                        parametrizedEvent = mapParams.onOpenEvent;
                    }
                    return mapParams.copy(str, str4, str5, toolbarSettings2, universalMapSettingsDto2, map2, parametrizedEvent);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getPointListRequest() {
                    return this.pointListRequest;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getPointInfoRequest() {
                    return this.pointInfoRequest;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getFiltersInfoRequest() {
                    return this.filtersInfoRequest;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final UniversalMapParams.ToolbarSettings getToolbarSettings() {
                    return this.toolbarSettings;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final UniversalMapSettingsDto getMapSettings() {
                    return this.mapSettings;
                }

                @k
                public final Map<String, Object> component6() {
                    return this.extraParameters;
                }

                @l
                /* renamed from: component7, reason: from getter */
                public final ParametrizedEvent getOnOpenEvent() {
                    return this.onOpenEvent;
                }

                @k
                public final MapParams copy(@k String pointListRequest, @k String pointInfoRequest, @l String filtersInfoRequest, @l UniversalMapParams.ToolbarSettings toolbarSettings, @l UniversalMapSettingsDto mapSettings, @k Map<String, ? extends Object> extraParameters, @l ParametrizedEvent onOpenEvent) {
                    return new MapParams(pointListRequest, pointInfoRequest, filtersInfoRequest, toolbarSettings, mapSettings, extraParameters, onOpenEvent);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapParams)) {
                        return false;
                    }
                    MapParams mapParams = (MapParams) other;
                    return L.f(this.pointListRequest, mapParams.pointListRequest) && L.f(this.pointInfoRequest, mapParams.pointInfoRequest) && L.f(this.filtersInfoRequest, mapParams.filtersInfoRequest) && L.f(this.toolbarSettings, mapParams.toolbarSettings) && L.f(this.mapSettings, mapParams.mapSettings) && L.f(this.extraParameters, mapParams.extraParameters) && L.f(this.onOpenEvent, mapParams.onOpenEvent);
                }

                @k
                public final Map<String, Object> getExtraParameters() {
                    return this.extraParameters;
                }

                @l
                public final String getFiltersInfoRequest() {
                    return this.filtersInfoRequest;
                }

                @l
                public final UniversalMapSettingsDto getMapSettings() {
                    return this.mapSettings;
                }

                @l
                public final ParametrizedEvent getOnOpenEvent() {
                    return this.onOpenEvent;
                }

                @k
                public final String getPointInfoRequest() {
                    return this.pointInfoRequest;
                }

                @k
                public final String getPointListRequest() {
                    return this.pointListRequest;
                }

                @l
                public final UniversalMapParams.ToolbarSettings getToolbarSettings() {
                    return this.toolbarSettings;
                }

                public int hashCode() {
                    int iD2 = H.d(this.pointListRequest.hashCode() * 31, 31, this.pointInfoRequest);
                    String str = this.filtersInfoRequest;
                    int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                    UniversalMapParams.ToolbarSettings toolbarSettings = this.toolbarSettings;
                    int iHashCode2 = (iHashCode + (toolbarSettings == null ? 0 : toolbarSettings.hashCode())) * 31;
                    UniversalMapSettingsDto universalMapSettingsDto = this.mapSettings;
                    int iC2 = AK.c.c((iHashCode2 + (universalMapSettingsDto == null ? 0 : universalMapSettingsDto.hashCode())) * 31, 31, this.extraParameters);
                    ParametrizedEvent parametrizedEvent = this.onOpenEvent;
                    return iC2 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("MapParams(pointListRequest=");
                    sb2.append(this.pointListRequest);
                    sb2.append(", pointInfoRequest=");
                    sb2.append(this.pointInfoRequest);
                    sb2.append(", filtersInfoRequest=");
                    sb2.append(this.filtersInfoRequest);
                    sb2.append(", toolbarSettings=");
                    sb2.append(this.toolbarSettings);
                    sb2.append(", mapSettings=");
                    sb2.append(this.mapSettings);
                    sb2.append(", extraParameters=");
                    sb2.append(this.extraParameters);
                    sb2.append(", onOpenEvent=");
                    return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onOpenEvent, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.pointListRequest);
                    parcel.writeString(this.pointInfoRequest);
                    parcel.writeString(this.filtersInfoRequest);
                    parcel.writeParcelable(this.toolbarSettings, flags);
                    parcel.writeParcelable(this.mapSettings, flags);
                    Iterator itI = C0.i(parcel, this.extraParameters);
                    while (itI.hasNext()) {
                        Map.Entry entry = (Map.Entry) itI.next();
                        h.h(parcel, (String) entry.getKey(), entry);
                    }
                    parcel.writeParcelable(this.onOpenEvent, flags);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public PvzOnUniversalMap(@k String str, @k String str2, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, boolean z12, @k MapParams mapParams, @l List<? extends BeduinAction> list3) {
                super(null);
                this.tabType = str;
                this.title = str2;
                this.onSelectActions = list;
                this.onManualSelectActions = list2;
                this.isEnabled = z12;
                this.params = mapParams;
                this.onInitActions = list3;
            }

            public static /* synthetic */ PvzOnUniversalMap copy$default(PvzOnUniversalMap pvzOnUniversalMap, String str, String str2, List list, List list2, boolean z12, MapParams mapParams, List list3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = pvzOnUniversalMap.tabType;
                }
                if ((i12 & 2) != 0) {
                    str2 = pvzOnUniversalMap.title;
                }
                String str3 = str2;
                if ((i12 & 4) != 0) {
                    list = pvzOnUniversalMap.onSelectActions;
                }
                List list4 = list;
                if ((i12 & 8) != 0) {
                    list2 = pvzOnUniversalMap.onManualSelectActions;
                }
                List list5 = list2;
                if ((i12 & 16) != 0) {
                    z12 = pvzOnUniversalMap.isEnabled;
                }
                boolean z13 = z12;
                if ((i12 & 32) != 0) {
                    mapParams = pvzOnUniversalMap.params;
                }
                MapParams mapParams2 = mapParams;
                if ((i12 & 64) != 0) {
                    list3 = pvzOnUniversalMap.onInitActions;
                }
                return pvzOnUniversalMap.copy(str, str3, list4, list5, z13, mapParams2, list3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTabType() {
                return this.tabType;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            public final List<BeduinAction> component3() {
                return this.onSelectActions;
            }

            @l
            public final List<BeduinAction> component4() {
                return this.onManualSelectActions;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            /* renamed from: component6, reason: from getter */
            public final MapParams getParams() {
                return this.params;
            }

            @l
            public final List<BeduinAction> component7() {
                return this.onInitActions;
            }

            @k
            public final PvzOnUniversalMap copy(@k String tabType, @k String title, @l List<? extends BeduinAction> onSelectActions, @l List<? extends BeduinAction> onManualSelectActions, boolean isEnabled, @k MapParams params, @l List<? extends BeduinAction> onInitActions) {
                return new PvzOnUniversalMap(tabType, title, onSelectActions, onManualSelectActions, isEnabled, params, onInitActions);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PvzOnUniversalMap)) {
                    return false;
                }
                PvzOnUniversalMap pvzOnUniversalMap = (PvzOnUniversalMap) other;
                return L.f(this.tabType, pvzOnUniversalMap.tabType) && L.f(this.title, pvzOnUniversalMap.title) && L.f(this.onSelectActions, pvzOnUniversalMap.onSelectActions) && L.f(this.onManualSelectActions, pvzOnUniversalMap.onManualSelectActions) && this.isEnabled == pvzOnUniversalMap.isEnabled && L.f(this.params, pvzOnUniversalMap.params) && L.f(this.onInitActions, pvzOnUniversalMap.onInitActions);
            }

            @l
            public final List<BeduinAction> getOnInitActions() {
                return this.onInitActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnManualSelectActions() {
                return this.onManualSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnSelectActions() {
                return this.onSelectActions;
            }

            @k
            public final MapParams getParams() {
                return this.params;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTabType() {
                return this.tabType;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iD2 = H.d(this.tabType.hashCode() * 31, 31, this.title);
                List<BeduinAction> list = this.onSelectActions;
                int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
                List<BeduinAction> list2 = this.onManualSelectActions;
                int iHashCode2 = (this.params.hashCode() + r.i((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isEnabled)) * 31;
                List<BeduinAction> list3 = this.onInitActions;
                return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            /* renamed from: isEnabled */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("PvzOnUniversalMap(tabType=");
                sb2.append(this.tabType);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", onSelectActions=");
                sb2.append(this.onSelectActions);
                sb2.append(", onManualSelectActions=");
                sb2.append(this.onManualSelectActions);
                sb2.append(", isEnabled=");
                sb2.append(this.isEnabled);
                sb2.append(", params=");
                sb2.append(this.params);
                sb2.append(", onInitActions=");
                return H.p(sb2, this.onInitActions, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.tabType);
                parcel.writeString(this.title);
                List<BeduinAction> list = this.onSelectActions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                List<BeduinAction> list2 = this.onManualSelectActions;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA2.next(), flags);
                    }
                }
                parcel.writeInt(this.isEnabled ? 1 : 0);
                this.params.writeToParcel(parcel, flags);
                List<BeduinAction> list3 = this.onInitActions;
                if (list3 == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA3 = a.A(list3, parcel, 1);
                while (itA3.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA3.next(), flags);
                }
            }
        }

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014Jn\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b\n\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b2\u0010\u0011R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b3\u0010\u0014¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$ShippingCompetition;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "", "tabType", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "onManualSelectActions", "", "isEnabled", "mainFormId", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$ShippingCompetition;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabType", "getTitle", "Ljava/util/List;", "getOnSelectActions", "getOnManualSelectActions", "Z", "getMainFormId", "getMainComponents", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ShippingCompetition extends Tab {

            @k
            public static final Parcelable.Creator<ShippingCompetition> CREATOR = new Creator();
            private final boolean isEnabled;

            @k
            private final List<BeduinModel> mainComponents;

            @l
            private final String mainFormId;

            @l
            private final List<BeduinAction> onManualSelectActions;

            @l
            private final List<BeduinAction> onSelectActions;

            @k
            private final String tabType;

            @k
            private final String title;

            /* compiled from: UniversalDeliveryTypeContent.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ShippingCompetition> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ShippingCompetition createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    ArrayList arrayList2 = null;
                    int iL2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL3 = 0;
                        while (iL3 != i12) {
                            iL3 = a.l(ShippingCompetition.class, parcel, arrayList, iL3, 1);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        int i13 = parcel.readInt();
                        arrayList2 = new ArrayList(i13);
                        int iL4 = 0;
                        while (iL4 != i13) {
                            iL4 = a.l(ShippingCompetition.class, parcel, arrayList2, iL4, 1);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    boolean z12 = parcel.readInt() != 0;
                    String string3 = parcel.readString();
                    int i14 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i14);
                    while (iL2 != i14) {
                        iL2 = a.l(ShippingCompetition.class, parcel, arrayList4, iL2, 1);
                    }
                    return new ShippingCompetition(string, string2, arrayList, arrayList3, z12, string3, arrayList4);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ShippingCompetition[] newArray(int i12) {
                    return new ShippingCompetition[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ShippingCompetition(@k String str, @k String str2, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, boolean z12, @l String str3, @k List<? extends BeduinModel> list3) {
                super(null);
                this.tabType = str;
                this.title = str2;
                this.onSelectActions = list;
                this.onManualSelectActions = list2;
                this.isEnabled = z12;
                this.mainFormId = str3;
                this.mainComponents = list3;
            }

            public static /* synthetic */ ShippingCompetition copy$default(ShippingCompetition shippingCompetition, String str, String str2, List list, List list2, boolean z12, String str3, List list3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = shippingCompetition.tabType;
                }
                if ((i12 & 2) != 0) {
                    str2 = shippingCompetition.title;
                }
                String str4 = str2;
                if ((i12 & 4) != 0) {
                    list = shippingCompetition.onSelectActions;
                }
                List list4 = list;
                if ((i12 & 8) != 0) {
                    list2 = shippingCompetition.onManualSelectActions;
                }
                List list5 = list2;
                if ((i12 & 16) != 0) {
                    z12 = shippingCompetition.isEnabled;
                }
                boolean z13 = z12;
                if ((i12 & 32) != 0) {
                    str3 = shippingCompetition.mainFormId;
                }
                String str5 = str3;
                if ((i12 & 64) != 0) {
                    list3 = shippingCompetition.mainComponents;
                }
                return shippingCompetition.copy(str, str4, list4, list5, z13, str5, list3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTabType() {
                return this.tabType;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            public final List<BeduinAction> component3() {
                return this.onSelectActions;
            }

            @l
            public final List<BeduinAction> component4() {
                return this.onManualSelectActions;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @l
            /* renamed from: component6, reason: from getter */
            public final String getMainFormId() {
                return this.mainFormId;
            }

            @k
            public final List<BeduinModel> component7() {
                return this.mainComponents;
            }

            @k
            public final ShippingCompetition copy(@k String tabType, @k String title, @l List<? extends BeduinAction> onSelectActions, @l List<? extends BeduinAction> onManualSelectActions, boolean isEnabled, @l String mainFormId, @k List<? extends BeduinModel> mainComponents) {
                return new ShippingCompetition(tabType, title, onSelectActions, onManualSelectActions, isEnabled, mainFormId, mainComponents);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShippingCompetition)) {
                    return false;
                }
                ShippingCompetition shippingCompetition = (ShippingCompetition) other;
                return L.f(this.tabType, shippingCompetition.tabType) && L.f(this.title, shippingCompetition.title) && L.f(this.onSelectActions, shippingCompetition.onSelectActions) && L.f(this.onManualSelectActions, shippingCompetition.onManualSelectActions) && this.isEnabled == shippingCompetition.isEnabled && L.f(this.mainFormId, shippingCompetition.mainFormId) && L.f(this.mainComponents, shippingCompetition.mainComponents);
            }

            @k
            public final List<BeduinModel> getMainComponents() {
                return this.mainComponents;
            }

            @l
            public final String getMainFormId() {
                return this.mainFormId;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnManualSelectActions() {
                return this.onManualSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnSelectActions() {
                return this.onSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTabType() {
                return this.tabType;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iD2 = H.d(this.tabType.hashCode() * 31, 31, this.title);
                List<BeduinAction> list = this.onSelectActions;
                int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
                List<BeduinAction> list2 = this.onManualSelectActions;
                int i12 = r.i((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isEnabled);
                String str = this.mainFormId;
                return this.mainComponents.hashCode() + ((i12 + (str != null ? str.hashCode() : 0)) * 31);
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            /* renamed from: isEnabled */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ShippingCompetition(tabType=");
                sb2.append(this.tabType);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", onSelectActions=");
                sb2.append(this.onSelectActions);
                sb2.append(", onManualSelectActions=");
                sb2.append(this.onManualSelectActions);
                sb2.append(", isEnabled=");
                sb2.append(this.isEnabled);
                sb2.append(", mainFormId=");
                sb2.append(this.mainFormId);
                sb2.append(", mainComponents=");
                return H.p(sb2, this.mainComponents, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.tabType);
                parcel.writeString(this.title);
                List<BeduinAction> list = this.onSelectActions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                List<BeduinAction> list2 = this.onManualSelectActions;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA2.next(), flags);
                    }
                }
                parcel.writeInt(this.isEnabled ? 1 : 0);
                parcel.writeString(this.mainFormId);
                Iterator itJ = C0.j(this.mainComponents, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab$Unknown;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$Tab;", "", "tabType", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "onManualSelectActions", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabType", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOnSelectActions", "()Ljava/util/List;", "getOnManualSelectActions", "Z", "()Z", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Unknown extends Tab {

            @k
            public static final Parcelable.Creator<Unknown> CREATOR = new Creator();
            private final boolean isEnabled;

            @l
            private final List<BeduinAction> onManualSelectActions;

            @l
            private final List<BeduinAction> onSelectActions;

            @k
            private final String tabType;

            @k
            private final String title;

            /* compiled from: UniversalDeliveryTypeContent.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Unknown> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Unknown createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    ArrayList arrayList2 = null;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = a.l(Unknown.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        int i13 = parcel.readInt();
                        arrayList2 = new ArrayList(i13);
                        int iL3 = 0;
                        while (iL3 != i13) {
                            iL3 = a.l(Unknown.class, parcel, arrayList2, iL3, 1);
                        }
                    }
                    return new Unknown(string, string2, arrayList, arrayList2, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Unknown[] newArray(int i12) {
                    return new Unknown[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Unknown(@k String str, @k String str2, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, boolean z12) {
                super(null);
                this.tabType = str;
                this.title = str2;
                this.onSelectActions = list;
                this.onManualSelectActions = list2;
                this.isEnabled = z12;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnManualSelectActions() {
                return this.onManualSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @l
            public List<BeduinAction> getOnSelectActions() {
                return this.onSelectActions;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTabType() {
                return this.tabType;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            @k
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent.Tab
            /* renamed from: isEnabled, reason: from getter */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.tabType);
                parcel.writeString(this.title);
                List<BeduinAction> list = this.onSelectActions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                List<BeduinAction> list2 = this.onManualSelectActions;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA2.next(), flags);
                    }
                }
                parcel.writeInt(this.isEnabled ? 1 : 0);
            }
        }

        public /* synthetic */ Tab(C42822w c42822w) {
            this();
        }

        @l
        public abstract List<BeduinAction> getOnManualSelectActions();

        @l
        public abstract List<BeduinAction> getOnSelectActions();

        @k
        public abstract String getTabType();

        @k
        public abstract String getTitle();

        /* renamed from: isEnabled */
        public abstract boolean getIsEnabled();

        private Tab() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalDeliveryTypeContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent$TabsStyle;", "", "(Ljava/lang/String;I)V", "CHIPS", "SEGMENTS", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TabsStyle {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ TabsStyle[] $VALUES;

        @c("chips")
        public static final TabsStyle CHIPS = new TabsStyle("CHIPS", 0);

        @c("segments")
        public static final TabsStyle SEGMENTS = new TabsStyle("SEGMENTS", 1);

        private static final /* synthetic */ TabsStyle[] $values() {
            return new TabsStyle[]{CHIPS, SEGMENTS};
        }

        static {
            TabsStyle[] tabsStyleArr$values = $values();
            $VALUES = tabsStyleArr$values;
            $ENTRIES = kotlin.enums.c.a(tabsStyleArr$values);
        }

        private TabsStyle(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<TabsStyle> getEntries() {
            return $ENTRIES;
        }

        public static TabsStyle valueOf(String str) {
            return (TabsStyle) Enum.valueOf(TabsStyle.class, str);
        }

        public static TabsStyle[] values() {
            return (TabsStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalDeliveryTypeContent(@k String str, int i12, @k List<? extends Tab> list, @l TabsStyle tabsStyle) {
        this.title = str;
        this.selectedTabIndex = i12;
        this.tabs = list;
        this.tabsStyle = tabsStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalDeliveryTypeContent copy$default(UniversalDeliveryTypeContent universalDeliveryTypeContent, String str, int i12, List list, TabsStyle tabsStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = universalDeliveryTypeContent.title;
        }
        if ((i13 & 2) != 0) {
            i12 = universalDeliveryTypeContent.selectedTabIndex;
        }
        if ((i13 & 4) != 0) {
            list = universalDeliveryTypeContent.tabs;
        }
        if ((i13 & 8) != 0) {
            tabsStyle = universalDeliveryTypeContent.tabsStyle;
        }
        return universalDeliveryTypeContent.copy(str, i12, list, tabsStyle);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @k
    public final List<Tab> component3() {
        return this.tabs;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final TabsStyle getTabsStyle() {
        return this.tabsStyle;
    }

    @k
    public final UniversalDeliveryTypeContent copy(@k String title, int selectedTabIndex, @k List<? extends Tab> tabs, @l TabsStyle tabsStyle) {
        return new UniversalDeliveryTypeContent(title, selectedTabIndex, tabs, tabsStyle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalDeliveryTypeContent)) {
            return false;
        }
        UniversalDeliveryTypeContent universalDeliveryTypeContent = (UniversalDeliveryTypeContent) other;
        return L.f(this.title, universalDeliveryTypeContent.title) && this.selectedTabIndex == universalDeliveryTypeContent.selectedTabIndex && L.f(this.tabs, universalDeliveryTypeContent.tabs) && this.tabsStyle == universalDeliveryTypeContent.tabsStyle;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @k
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @l
    public final TabsStyle getTabsStyle() {
        return this.tabsStyle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = H.e(r.e(this.selectedTabIndex, this.title.hashCode() * 31, 31), 31, this.tabs);
        TabsStyle tabsStyle = this.tabsStyle;
        return iE2 + (tabsStyle == null ? 0 : tabsStyle.hashCode());
    }

    @k
    public String toString() {
        return "UniversalDeliveryTypeContent(title=" + this.title + ", selectedTabIndex=" + this.selectedTabIndex + ", tabs=" + this.tabs + ", tabsStyle=" + this.tabsStyle + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeInt(this.selectedTabIndex);
        Iterator itJ = C0.j(this.tabs, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        TabsStyle tabsStyle = this.tabsStyle;
        if (tabsStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tabsStyle.name());
        }
    }
}
