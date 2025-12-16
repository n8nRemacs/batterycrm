package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.BeduinScreenSettings;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.network.model.BeduinTitleAlignment;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenUniversalPageV2Action.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÝ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0088\u0002\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b2\u0010\u001fJ\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000203HÖ\u0001¢\u0006\u0004\b:\u00105J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000203HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\bC\u0010\u001fJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0016HÂ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÂ\u0003¢\u0006\u0004\bF\u0010BR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bI\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bJ\u0010\u001fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bM\u0010#R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bN\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bP\u0010'R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bQ\u0010\u001fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bR\u0010#R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bS\u0010#R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bT\u0010#R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bU\u0010#R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bV\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0015\u0010G\u0012\u0004\bW\u0010XR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010Y\u0012\u0004\bZ\u0010XR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010[R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\\\u001a\u0004\b]\u0010/R\u001e\u0010^\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b^\u0010[\u0012\u0004\b_\u0010XR\u0013\u0010a\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b`\u0010B¨\u0006b"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinUniversalPageContentImpl;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "Landroid/os/Parcelable;", "", "topFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "mainComponents", "bottomComponents", "Lcom/avito/android/beduin/common/component/model/BeduinScreenSettings;", "settings", "screenName", "Lcom/avito/android/beduin_models/BeduinAction;", "onOpenActions", BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS, "onBackButtonActions", "onDisappearActions", "onAppearActions", "title", "Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "titleAlignment", "Lcom/avito/android/beduin/common/action/BeduinNavigationBar;", "_navigationBar", "", "closeOnBack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/BeduinScreenSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;Lcom/avito/android/beduin/common/action/BeduinNavigationBar;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lcom/avito/android/beduin/common/component/model/BeduinScreenSettings;", "component8", "component9", "component10", "component11", "component12", "component13", "component17", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/BeduinScreenSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;Lcom/avito/android/beduin/common/action/BeduinNavigationBar;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/action/BeduinUniversalPageContentImpl;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "getSaturatedNavigationBar", "()Lcom/avito/android/beduin/common/action/BeduinNavigationBar;", "component14", "component15", "()Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "component16", "Ljava/lang/String;", "getTopFormId", "getMainFormId", "getBottomFormId", "Ljava/util/List;", "getTopComponents", "getMainComponents", "getBottomComponents", "Lcom/avito/android/beduin/common/component/model/BeduinScreenSettings;", "getSettings", "getScreenName", "getOnOpenActions", "getOnCloseActions", "getOnBackButtonActions", "getOnDisappearActions", "getOnAppearActions", "getTitle$annotations", "()V", "Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "getTitleAlignment$annotations", "Lcom/avito/android/beduin/common/action/BeduinNavigationBar;", "Ljava/lang/Boolean;", "getCloseOnBack", "saturatedNavBar", "getSaturatedNavBar$annotations", "getNavigationBar", "navigationBar", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinUniversalPageContentImpl implements BeduinUniversalPageContent, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinUniversalPageContentImpl> CREATOR = new a();

    @com.google.gson.annotations.c("navigationBar")
    @l
    private final BeduinNavigationBar _navigationBar;

    @com.google.gson.annotations.c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @com.google.gson.annotations.c("bottomFormId")
    @l
    private final String bottomFormId;

    @com.google.gson.annotations.c("closeOnBack")
    @l
    private final Boolean closeOnBack;

    @com.google.gson.annotations.c("mainComponents")
    @Y61.k
    private final List<BeduinModel> mainComponents;

    @com.google.gson.annotations.c("mainFormId")
    @l
    private final String mainFormId;

    @com.google.gson.annotations.c("onAppearActions")
    @l
    private final List<BeduinAction> onAppearActions;

    @com.google.gson.annotations.c("onBackButtonActions")
    @l
    private final List<BeduinAction> onBackButtonActions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS)
    @l
    private final List<BeduinAction> onCloseActions;

    @com.google.gson.annotations.c("onDisappearActions")
    @l
    private final List<BeduinAction> onDisappearActions;

    @com.google.gson.annotations.c("onOpenActions")
    @l
    private final List<BeduinAction> onOpenActions;

    @l
    private BeduinNavigationBar saturatedNavBar;

    @com.google.gson.annotations.c("screenName")
    @Y61.k
    private final String screenName;

    @com.google.gson.annotations.c("settings")
    @l
    private final BeduinScreenSettings settings;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("titleAlignment")
    @l
    private final BeduinTitleAlignment titleAlignment;

    @com.google.gson.annotations.c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @com.google.gson.annotations.c("topFormId")
    @l
    private final String topFormId;

    /* compiled from: BeduinOpenUniversalPageV2Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinUniversalPageContentImpl> {
        @Override // android.os.Parcelable.Creator
        public final BeduinUniversalPageContentImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList9, iL2, 1);
                }
                arrayList = arrayList9;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList10, iL3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList2, iL4, 1);
                }
            }
            BeduinScreenSettings beduinScreenSettingsCreateFromParcel = parcel.readInt() == 0 ? null : BeduinScreenSettings.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList3, iL5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList4 = new ArrayList(i16);
                int iL6 = 0;
                while (iL6 != i16) {
                    iL6 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList4, iL6, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList5 = new ArrayList(i17);
                int iL7 = 0;
                while (iL7 != i17) {
                    iL7 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList5, iL7, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i18);
                int iL8 = 0;
                while (iL8 != i18) {
                    iL8 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList11, iL8, 1);
                    i18 = i18;
                }
                arrayList6 = arrayList11;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList6;
                arrayList8 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i19);
                arrayList7 = arrayList6;
                int iL9 = 0;
                while (iL9 != i19) {
                    iL9 = com.avito.android.actions_sheet.a.l(BeduinUniversalPageContentImpl.class, parcel, arrayList12, iL9, 1);
                    i19 = i19;
                }
                arrayList8 = arrayList12;
            }
            String string5 = parcel.readString();
            BeduinTitleAlignment beduinTitleAlignmentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinTitleAlignment.CREATOR.createFromParcel(parcel);
            BeduinNavigationBar beduinNavigationBarCreateFromParcel = parcel.readInt() == 0 ? null : BeduinNavigationBar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinUniversalPageContentImpl(string, string2, string3, arrayList, arrayList10, arrayList2, beduinScreenSettingsCreateFromParcel, string4, arrayList3, arrayList4, arrayList5, arrayList7, arrayList8, string5, beduinTitleAlignmentCreateFromParcel, beduinNavigationBarCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinUniversalPageContentImpl[] newArray(int i12) {
            return new BeduinUniversalPageContentImpl[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinUniversalPageContentImpl(@l String str, @l String str2, @l String str3, @l List<? extends BeduinModel> list, @Y61.k List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @l BeduinScreenSettings beduinScreenSettings, @Y61.k String str4, @l List<? extends BeduinAction> list4, @l List<? extends BeduinAction> list5, @l List<? extends BeduinAction> list6, @l List<? extends BeduinAction> list7, @l List<? extends BeduinAction> list8, @l String str5, @l BeduinTitleAlignment beduinTitleAlignment, @l BeduinNavigationBar beduinNavigationBar, @l Boolean bool) {
        this.topFormId = str;
        this.mainFormId = str2;
        this.bottomFormId = str3;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomComponents = list3;
        this.settings = beduinScreenSettings;
        this.screenName = str4;
        this.onOpenActions = list4;
        this.onCloseActions = list5;
        this.onBackButtonActions = list6;
        this.onDisappearActions = list7;
        this.onAppearActions = list8;
        this.title = str5;
        this.titleAlignment = beduinTitleAlignment;
        this._navigationBar = beduinNavigationBar;
        this.closeOnBack = bool;
    }

    /* renamed from: component14, reason: from getter */
    private final String getTitle() {
        return this.title;
    }

    /* renamed from: component15, reason: from getter */
    private final BeduinTitleAlignment getTitleAlignment() {
        return this.titleAlignment;
    }

    /* renamed from: component16, reason: from getter */
    private final BeduinNavigationBar get_navigationBar() {
        return this._navigationBar;
    }

    private final BeduinNavigationBar getSaturatedNavigationBar() {
        BeduinNavigationBar beduinNavigationBarCopy$default;
        BeduinNavigationBar beduinNavigationBar = this.saturatedNavBar;
        if (beduinNavigationBar != null) {
            return beduinNavigationBar;
        }
        BeduinNavigationBar beduinNavigationBar2 = this._navigationBar;
        if ((beduinNavigationBar2 != null ? beduinNavigationBar2.getScreenTitle() : null) != null || this.title == null) {
            return this._navigationBar;
        }
        ScreenTitle screenTitle = new ScreenTitle(this.title, null, null, this.titleAlignment, 6, null);
        BeduinNavigationBar beduinNavigationBar3 = this._navigationBar;
        BeduinNavigationBar beduinNavigationBar4 = (beduinNavigationBar3 == null || (beduinNavigationBarCopy$default = BeduinNavigationBar.copy$default(beduinNavigationBar3, screenTitle, null, null, 6, null)) == null) ? new BeduinNavigationBar(screenTitle, null, null, 6, null) : beduinNavigationBarCopy$default;
        this.saturatedNavBar = beduinNavigationBar4;
        return beduinNavigationBar4;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @l
    public final List<BeduinAction> component10() {
        return this.onCloseActions;
    }

    @l
    public final List<BeduinAction> component11() {
        return this.onBackButtonActions;
    }

    @l
    public final List<BeduinAction> component12() {
        return this.onDisappearActions;
    }

    @l
    public final List<BeduinAction> component13() {
        return this.onAppearActions;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Boolean getCloseOnBack() {
        return this.closeOnBack;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> component4() {
        return this.topComponents;
    }

    @Y61.k
    public final List<BeduinModel> component5() {
        return this.mainComponents;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.bottomComponents;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinScreenSettings getSettings() {
        return this.settings;
    }

    @Y61.k
    /* renamed from: component8, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    @l
    public final List<BeduinAction> component9() {
        return this.onOpenActions;
    }

    @Y61.k
    public final BeduinUniversalPageContentImpl copy(@l String topFormId, @l String mainFormId, @l String bottomFormId, @l List<? extends BeduinModel> topComponents, @Y61.k List<? extends BeduinModel> mainComponents, @l List<? extends BeduinModel> bottomComponents, @l BeduinScreenSettings settings, @Y61.k String screenName, @l List<? extends BeduinAction> onOpenActions, @l List<? extends BeduinAction> onCloseActions, @l List<? extends BeduinAction> onBackButtonActions, @l List<? extends BeduinAction> onDisappearActions, @l List<? extends BeduinAction> onAppearActions, @l String title, @l BeduinTitleAlignment titleAlignment, @l BeduinNavigationBar _navigationBar, @l Boolean closeOnBack) {
        return new BeduinUniversalPageContentImpl(topFormId, mainFormId, bottomFormId, topComponents, mainComponents, bottomComponents, settings, screenName, onOpenActions, onCloseActions, onBackButtonActions, onDisappearActions, onAppearActions, title, titleAlignment, _navigationBar, closeOnBack);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinUniversalPageContentImpl)) {
            return false;
        }
        BeduinUniversalPageContentImpl beduinUniversalPageContentImpl = (BeduinUniversalPageContentImpl) other;
        return L.f(this.topFormId, beduinUniversalPageContentImpl.topFormId) && L.f(this.mainFormId, beduinUniversalPageContentImpl.mainFormId) && L.f(this.bottomFormId, beduinUniversalPageContentImpl.bottomFormId) && L.f(this.topComponents, beduinUniversalPageContentImpl.topComponents) && L.f(this.mainComponents, beduinUniversalPageContentImpl.mainComponents) && L.f(this.bottomComponents, beduinUniversalPageContentImpl.bottomComponents) && L.f(this.settings, beduinUniversalPageContentImpl.settings) && L.f(this.screenName, beduinUniversalPageContentImpl.screenName) && L.f(this.onOpenActions, beduinUniversalPageContentImpl.onOpenActions) && L.f(this.onCloseActions, beduinUniversalPageContentImpl.onCloseActions) && L.f(this.onBackButtonActions, beduinUniversalPageContentImpl.onBackButtonActions) && L.f(this.onDisappearActions, beduinUniversalPageContentImpl.onDisappearActions) && L.f(this.onAppearActions, beduinUniversalPageContentImpl.onAppearActions) && L.f(this.title, beduinUniversalPageContentImpl.title) && this.titleAlignment == beduinUniversalPageContentImpl.titleAlignment && L.f(this._navigationBar, beduinUniversalPageContentImpl._navigationBar) && L.f(this.closeOnBack, beduinUniversalPageContentImpl.closeOnBack);
    }

    @l
    public List<BeduinModel> getBottomComponents() {
        return this.bottomComponents;
    }

    @l
    public String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final Boolean getCloseOnBack() {
        return this.closeOnBack;
    }

    @Y61.k
    public List<BeduinModel> getMainComponents() {
        return this.mainComponents;
    }

    @l
    public String getMainFormId() {
        return this.mainFormId;
    }

    @l
    public final BeduinNavigationBar getNavigationBar() {
        return getSaturatedNavigationBar();
    }

    @l
    public final List<BeduinAction> getOnAppearActions() {
        return this.onAppearActions;
    }

    @l
    public final List<BeduinAction> getOnBackButtonActions() {
        return this.onBackButtonActions;
    }

    @l
    public final List<BeduinAction> getOnCloseActions() {
        return this.onCloseActions;
    }

    @l
    public final List<BeduinAction> getOnDisappearActions() {
        return this.onDisappearActions;
    }

    @l
    public final List<BeduinAction> getOnOpenActions() {
        return this.onOpenActions;
    }

    @Override // com.avito.android.beduin_models.BeduinUniversalPageContent
    @Y61.k
    public String getScreenName() {
        return this.screenName;
    }

    @l
    public final BeduinScreenSettings getSettings() {
        return this.settings;
    }

    @l
    public List<BeduinModel> getTopComponents() {
        return this.topComponents;
    }

    @l
    public String getTopFormId() {
        return this.topFormId;
    }

    public int hashCode() {
        String str = this.topFormId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mainFormId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomFormId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BeduinModel> list = this.topComponents;
        int iE2 = H.e((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.mainComponents);
        List<BeduinModel> list2 = this.bottomComponents;
        int iHashCode4 = (iE2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BeduinScreenSettings beduinScreenSettings = this.settings;
        int iD2 = H.d((iHashCode4 + (beduinScreenSettings == null ? 0 : beduinScreenSettings.hashCode())) * 31, 31, this.screenName);
        List<BeduinAction> list3 = this.onOpenActions;
        int iHashCode5 = (iD2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinAction> list4 = this.onCloseActions;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BeduinAction> list5 = this.onBackButtonActions;
        int iHashCode7 = (iHashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<BeduinAction> list6 = this.onDisappearActions;
        int iHashCode8 = (iHashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<BeduinAction> list7 = this.onAppearActions;
        int iHashCode9 = (iHashCode8 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BeduinTitleAlignment beduinTitleAlignment = this.titleAlignment;
        int iHashCode11 = (iHashCode10 + (beduinTitleAlignment == null ? 0 : beduinTitleAlignment.hashCode())) * 31;
        BeduinNavigationBar beduinNavigationBar = this._navigationBar;
        int iHashCode12 = (iHashCode11 + (beduinNavigationBar == null ? 0 : beduinNavigationBar.hashCode())) * 31;
        Boolean bool = this.closeOnBack;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinUniversalPageContentImpl(topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", topComponents=");
        sb2.append(this.topComponents);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomComponents=");
        sb2.append(this.bottomComponents);
        sb2.append(", settings=");
        sb2.append(this.settings);
        sb2.append(", screenName=");
        sb2.append(this.screenName);
        sb2.append(", onOpenActions=");
        sb2.append(this.onOpenActions);
        sb2.append(", onCloseActions=");
        sb2.append(this.onCloseActions);
        sb2.append(", onBackButtonActions=");
        sb2.append(this.onBackButtonActions);
        sb2.append(", onDisappearActions=");
        sb2.append(this.onDisappearActions);
        sb2.append(", onAppearActions=");
        sb2.append(this.onAppearActions);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", titleAlignment=");
        sb2.append(this.titleAlignment);
        sb2.append(", _navigationBar=");
        sb2.append(this._navigationBar);
        sb2.append(", closeOnBack=");
        return C0.g(sb2, this.closeOnBack, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.topFormId);
        parcel.writeString(this.mainFormId);
        parcel.writeString(this.bottomFormId);
        List<BeduinModel> list = this.topComponents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.mainComponents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinModel> list2 = this.bottomComponents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        BeduinScreenSettings beduinScreenSettings = this.settings;
        if (beduinScreenSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinScreenSettings.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.screenName);
        List<BeduinAction> list3 = this.onOpenActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        List<BeduinAction> list4 = this.onCloseActions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), flags);
            }
        }
        List<BeduinAction> list5 = this.onBackButtonActions;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
            while (itA5.hasNext()) {
                parcel.writeParcelable((Parcelable) itA5.next(), flags);
            }
        }
        List<BeduinAction> list6 = this.onDisappearActions;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA6 = com.avito.android.actions_sheet.a.A(list6, parcel, 1);
            while (itA6.hasNext()) {
                parcel.writeParcelable((Parcelable) itA6.next(), flags);
            }
        }
        List<BeduinAction> list7 = this.onAppearActions;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA7 = com.avito.android.actions_sheet.a.A(list7, parcel, 1);
            while (itA7.hasNext()) {
                parcel.writeParcelable((Parcelable) itA7.next(), flags);
            }
        }
        parcel.writeString(this.title);
        BeduinTitleAlignment beduinTitleAlignment = this.titleAlignment;
        if (beduinTitleAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinTitleAlignment.writeToParcel(parcel, flags);
        }
        BeduinNavigationBar beduinNavigationBar = this._navigationBar;
        if (beduinNavigationBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinNavigationBar.writeToParcel(parcel, flags);
        }
        Boolean bool = this.closeOnBack;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    private static /* synthetic */ void getSaturatedNavBar$annotations() {
    }

    @InterfaceC42830m
    private static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC42830m
    private static /* synthetic */ void getTitleAlignment$annotations() {
    }
}
