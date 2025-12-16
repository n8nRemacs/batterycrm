package com.avito.android.beduin.network.model.screen;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pi.C47090a;
import pi.C47093d;
import pi.e;
import qi.C47404e;
import qi.InterfaceC47401b;
import ri.C47659b;

/* compiled from: BottomSheetScreenModel.kt */
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001CBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b#\u0010$J~\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0016J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010$R\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0016¨\u0006D"}, d2 = {"Lcom/avito/android/beduin/network/model/screen/BottomSheetScreenModel;", "Lqi/b;", "", "id", "screenName", "Lpi/e;", "navBar", "bottomSheetNavBar", "Lpi/d;", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "", "Lcom/avito/android/beduin_models/BeduinModel;", "extraContent", "Lpi/a;", "analyticsParams", "Lqi/e;", "bottomSheet", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpi/e;Lpi/e;Lpi/d;Ljava/util/List;Lpi/a;Lqi/e;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lpi/e;", "component4", "component5", "()Lpi/d;", "component6", "()Ljava/util/List;", "component7", "()Lpi/a;", "component8", "()Lqi/e;", "component9", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lpi/e;Lpi/e;Lpi/d;Ljava/util/List;Lpi/a;Lqi/e;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/network/model/screen/BottomSheetScreenModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getScreenName", "Lpi/e;", "getNavBar", "getBottomSheetNavBar", "Lpi/d;", "getGallery", "Ljava/util/List;", "getExtraContent", "Lpi/a;", "getAnalyticsParams", "Lqi/e;", "getBottomSheet", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getType", "type", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BottomSheetScreenModel implements InterfaceC47401b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final C47659b REGISTRY_ENTRY = new C47659b(BottomSheetScreenModel.class, Collections.singletonList("bottomSheet"));

    @k
    public static final String TYPE = "bottomSheet";

    @c("analyticsParams")
    @l
    private final C47090a analyticsParams;

    @c("bottomSheetScreen")
    @k
    private final C47404e bottomSheet;

    @c("bottomSheetNavBar")
    @l
    private final e bottomSheetNavBar;

    @c("extraContent")
    @l
    private final List<BeduinModel> extraContent;

    @c(AdvertDetailsBlockIdKt.GALLERY_BLOCK)
    @l
    private final C47093d gallery;

    @c("id")
    @k
    private final String id;

    @c("navBar")
    @l
    private final e navBar;

    @c("name")
    @l
    private final String screenName;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BottomSheetScreenModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/network/model/screen/BottomSheetScreenModel$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.network.model.screen.BottomSheetScreenModel$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScreenModel(@k String str, @l String str2, @l e eVar, @l e eVar2, @l C47093d c47093d, @l List<? extends BeduinModel> list, @l C47090a c47090a, @k C47404e c47404e, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.screenName = str2;
        this.navBar = eVar;
        this.bottomSheetNavBar = eVar2;
        this.gallery = c47093d;
        this.extraContent = list;
        this.analyticsParams = c47090a;
        this.bottomSheet = c47404e;
        this.theme = beduinComponentTheme;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final e getNavBar() {
        return this.navBar;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final e getBottomSheetNavBar() {
        return this.bottomSheetNavBar;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final C47093d getGallery() {
        return this.gallery;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.extraContent;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final C47090a getAnalyticsParams() {
        return this.analyticsParams;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final C47404e getBottomSheet() {
        return this.bottomSheet;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final BottomSheetScreenModel copy(@k String id2, @l String screenName, @l e navBar, @l e bottomSheetNavBar, @l C47093d gallery, @l List<? extends BeduinModel> extraContent, @l C47090a analyticsParams, @k C47404e bottomSheet, @l BeduinComponentTheme theme) {
        return new BottomSheetScreenModel(id2, screenName, navBar, bottomSheetNavBar, gallery, extraContent, analyticsParams, bottomSheet, theme);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetScreenModel)) {
            return false;
        }
        BottomSheetScreenModel bottomSheetScreenModel = (BottomSheetScreenModel) other;
        return L.f(this.id, bottomSheetScreenModel.id) && L.f(this.screenName, bottomSheetScreenModel.screenName) && L.f(this.navBar, bottomSheetScreenModel.navBar) && L.f(this.bottomSheetNavBar, bottomSheetScreenModel.bottomSheetNavBar) && L.f(this.gallery, bottomSheetScreenModel.gallery) && L.f(this.extraContent, bottomSheetScreenModel.extraContent) && L.f(this.analyticsParams, bottomSheetScreenModel.analyticsParams) && L.f(this.bottomSheet, bottomSheetScreenModel.bottomSheet) && this.theme == bottomSheetScreenModel.theme;
    }

    @l
    public final C47090a getAnalyticsParams() {
        return this.analyticsParams;
    }

    @k
    public final C47404e getBottomSheet() {
        return this.bottomSheet;
    }

    @l
    public final e getBottomSheetNavBar() {
        return this.bottomSheetNavBar;
    }

    @l
    public final List<BeduinModel> getExtraContent() {
        return this.extraContent;
    }

    @l
    public final C47093d getGallery() {
        return this.gallery;
    }

    @Override // qi.InterfaceC47401b
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final e getNavBar() {
        return this.navBar;
    }

    @Override // qi.InterfaceC47401b
    @l
    public String getScreenName() {
        return this.screenName;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Override // qi.InterfaceC47401b
    @k
    public String getType() {
        return "bottomSheet";
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.screenName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.navBar;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.bottomSheetNavBar;
        int iHashCode4 = (iHashCode3 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        C47093d c47093d = this.gallery;
        int iHashCode5 = (iHashCode4 + (c47093d == null ? 0 : c47093d.hashCode())) * 31;
        List<BeduinModel> list = this.extraContent;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C47090a c47090a = this.analyticsParams;
        int iHashCode7 = (this.bottomSheet.hashCode() + ((iHashCode6 + (c47090a == null ? 0 : c47090a.hashCode())) * 31)) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode7 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BottomSheetScreenModel(id=" + this.id + ", screenName=" + this.screenName + ", navBar=" + this.navBar + ", bottomSheetNavBar=" + this.bottomSheetNavBar + ", gallery=" + this.gallery + ", extraContent=" + this.extraContent + ", analyticsParams=" + this.analyticsParams + ", bottomSheet=" + this.bottomSheet + ", theme=" + this.theme + ')';
    }

    public /* synthetic */ BottomSheetScreenModel(String str, String str2, e eVar, e eVar2, C47093d c47093d, List list, C47090a c47090a, C47404e c47404e, BeduinComponentTheme beduinComponentTheme, int i12, C42822w c42822w) {
        this(str, str2, eVar, eVar2, c47093d, list, c47090a, c47404e, (i12 & 256) != 0 ? null : beduinComponentTheme);
    }
}
