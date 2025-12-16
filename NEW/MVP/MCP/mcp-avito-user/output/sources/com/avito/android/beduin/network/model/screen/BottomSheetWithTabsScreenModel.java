package com.avito.android.beduin.network.model.screen;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pi.C47093d;
import pi.e;
import qi.C47403d;
import qi.InterfaceC47401b;
import ri.C47659b;

/* compiled from: BottomSheetWithTabsScreenModel.kt */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00014BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJZ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001aR\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0011¨\u00065"}, d2 = {"Lcom/avito/android/beduin/network/model/screen/BottomSheetWithTabsScreenModel;", "Lqi/b;", "", "id", "screenName", "Lpi/e;", "navBar", "Lpi/d;", AdvertDetailsBlockIdKt.GALLERY_BLOCK, "", "Lcom/avito/android/beduin_models/BeduinModel;", "extraContent", "Lqi/d;", "bottomSheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpi/e;Lpi/d;Ljava/util/List;Lqi/d;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lpi/e;", "component4", "()Lpi/d;", "component5", "()Ljava/util/List;", "component6", "()Lqi/d;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lpi/e;Lpi/d;Ljava/util/List;Lqi/d;)Lcom/avito/android/beduin/network/model/screen/BottomSheetWithTabsScreenModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getScreenName", "Lpi/e;", "getNavBar", "Lpi/d;", "getGallery", "Ljava/util/List;", "getExtraContent", "Lqi/d;", "getBottomSheet", "getType", "type", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BottomSheetWithTabsScreenModel implements InterfaceC47401b {

    @c("bottomSheetScreen")
    @k
    private final C47403d bottomSheet;

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

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final String TYPE = "bottomSheetWithTabs";

    @k
    private static final C47659b REGISTRY_ENTRY = new C47659b(BottomSheetWithTabsScreenModel.class, Collections.singletonList(TYPE));

    /* compiled from: BottomSheetWithTabsScreenModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/network/model/screen/BottomSheetWithTabsScreenModel$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.network.model.screen.BottomSheetWithTabsScreenModel$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetWithTabsScreenModel(@k String str, @l String str2, @l e eVar, @l C47093d c47093d, @l List<? extends BeduinModel> list, @k C47403d c47403d) {
        this.id = str;
        this.screenName = str2;
        this.navBar = eVar;
        this.gallery = c47093d;
        this.extraContent = list;
        this.bottomSheet = c47403d;
    }

    public static /* synthetic */ BottomSheetWithTabsScreenModel copy$default(BottomSheetWithTabsScreenModel bottomSheetWithTabsScreenModel, String str, String str2, e eVar, C47093d c47093d, List list, C47403d c47403d, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bottomSheetWithTabsScreenModel.id;
        }
        if ((i12 & 2) != 0) {
            str2 = bottomSheetWithTabsScreenModel.screenName;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            eVar = bottomSheetWithTabsScreenModel.navBar;
        }
        e eVar2 = eVar;
        if ((i12 & 8) != 0) {
            c47093d = bottomSheetWithTabsScreenModel.gallery;
        }
        C47093d c47093d2 = c47093d;
        if ((i12 & 16) != 0) {
            list = bottomSheetWithTabsScreenModel.extraContent;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            c47403d = bottomSheetWithTabsScreenModel.bottomSheet;
        }
        return bottomSheetWithTabsScreenModel.copy(str, str3, eVar2, c47093d2, list2, c47403d);
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
    public final C47093d getGallery() {
        return this.gallery;
    }

    @l
    public final List<BeduinModel> component5() {
        return this.extraContent;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final C47403d getBottomSheet() {
        return this.bottomSheet;
    }

    @k
    public final BottomSheetWithTabsScreenModel copy(@k String id2, @l String screenName, @l e navBar, @l C47093d gallery, @l List<? extends BeduinModel> extraContent, @k C47403d bottomSheet) {
        return new BottomSheetWithTabsScreenModel(id2, screenName, navBar, gallery, extraContent, bottomSheet);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetWithTabsScreenModel)) {
            return false;
        }
        BottomSheetWithTabsScreenModel bottomSheetWithTabsScreenModel = (BottomSheetWithTabsScreenModel) other;
        return L.f(this.id, bottomSheetWithTabsScreenModel.id) && L.f(this.screenName, bottomSheetWithTabsScreenModel.screenName) && L.f(this.navBar, bottomSheetWithTabsScreenModel.navBar) && L.f(this.gallery, bottomSheetWithTabsScreenModel.gallery) && L.f(this.extraContent, bottomSheetWithTabsScreenModel.extraContent) && L.f(this.bottomSheet, bottomSheetWithTabsScreenModel.bottomSheet);
    }

    @k
    public final C47403d getBottomSheet() {
        return this.bottomSheet;
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

    @Override // qi.InterfaceC47401b
    @k
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.screenName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.navBar;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C47093d c47093d = this.gallery;
        int iHashCode4 = (iHashCode3 + (c47093d == null ? 0 : c47093d.hashCode())) * 31;
        List<BeduinModel> list = this.extraContent;
        return this.bottomSheet.hashCode() + ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "BottomSheetWithTabsScreenModel(id=" + this.id + ", screenName=" + this.screenName + ", navBar=" + this.navBar + ", gallery=" + this.gallery + ", extraContent=" + this.extraContent + ", bottomSheet=" + this.bottomSheet + ')';
    }
}
