package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.J3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import zK0.C50480a;

/* compiled from: WizardParameter.kt */
@InterfaceC19823a
@s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b(\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u000b\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R*\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00107\u001a\u00020\n8F¢\u0006\f\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010*R\u0011\u00108\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u0010*¨\u00069"}, d2 = {"Lcom/avito/android/remote/model/WizardParameter;", "Lcom/avito/android/remote/model/CategoryModel;", "Lcom/avito/android/remote/model/Navigation;", "navigation", "", "title", "description", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "rootNavigation", "", "isVerticalChange", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/Navigation;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Navigation;ZLcom/avito/android/deep_linking/links/DeepLink;)V", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "parent", "Lkotlin/G0;", "setupParentLinks", "(Ljava/util/List;Lcom/avito/android/remote/model/WizardParameter;)V", "findNodeByNavigation", "(Lcom/avito/android/remote/model/Navigation;)Lcom/avito/android/remote/model/WizardParameter;", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Navigation;", "getNavigation", "()Lcom/avito/android/remote/model/Navigation;", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "getRootNavigation", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/WizardParameter;", "getParent", "()Lcom/avito/android/remote/model/WizardParameter;", "setParent", "(Lcom/avito/android/remote/model/WizardParameter;)V", "getParent$annotations", "()V", "getHasChildren", "getHasChildren$annotations", "hasChildren", "isRoot", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@com.avito.android.gson.d
/* loaded from: classes17.dex */
public final class WizardParameter extends CategoryModel {

    @k
    public static final Parcelable.Creator<WizardParameter> CREATOR = new Creator();

    @k
    private final List<WizardParameter> children;

    @l
    private final DeepLink deeplink;

    @l
    private final String description;
    private final boolean isVerticalChange;

    @k
    private final Navigation navigation;

    @l
    private WizardParameter parent;

    @l
    private final Navigation rootNavigation;

    @k
    private final String title;

    /* compiled from: WizardParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WizardParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WizardParameter[] newArray(int i12) {
            return new WizardParameter[i12];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WizardParameter createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<Navigation> creator = Navigation.CREATOR;
            Navigation navigationCreateFromParcel = creator.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            C50480a.f444023a.getClass();
            List listA = J3.a(parcel, C50480a.class.getClassLoader());
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            return new WizardParameter(navigationCreateFromParcel, string, string2, listA, parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(WizardParameter.class.getClassLoader()));
        }
    }

    /* compiled from: WizardParameter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/WizardParameter;", "child", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.WizardParameter$findNodeByNavigation$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<WizardParameter, WizardParameter> {
        final /* synthetic */ Navigation $navigation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Navigation navigation2) {
            super(1);
            this.$navigation = navigation2;
        }

        @Override // Y41.l
        @l
        public final WizardParameter invoke(@k WizardParameter wizardParameter) {
            return wizardParameter.findNodeByNavigation(this.$navigation);
        }
    }

    public WizardParameter(@k Navigation navigation2, @k String str, @l String str2, @k List<WizardParameter> list, @l Navigation navigation3, boolean z12, @l DeepLink deepLink) {
        super(navigation2, str, str2, navigation3, z12);
        this.navigation = navigation2;
        this.title = str;
        this.description = str2;
        this.children = list;
        this.rootNavigation = navigation3;
        this.isVerticalChange = z12;
        this.deeplink = deepLink;
        setupParentLinks(list, this);
    }

    private final void setupParentLinks(List<WizardParameter> parameters, WizardParameter parent) {
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            ((WizardParameter) it.next()).parent = parent;
        }
    }

    @l
    public final WizardParameter findNodeByNavigation(@k Navigation navigation2) {
        return navigation2.equals(getNavigation()) ? this : (WizardParameter) C43033p.n(C43033p.y(new C42770s0(this.children), new AnonymousClass1(navigation2)));
    }

    @k
    public final List<WizardParameter> getChildren() {
        return this.children;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Override // com.avito.android.remote.model.CategoryModel
    @l
    public String getDescription() {
        return this.description;
    }

    public final boolean getHasChildren() {
        return !this.children.isEmpty();
    }

    @Override // com.avito.android.remote.model.CategoryModel
    @k
    public Navigation getNavigation() {
        return this.navigation;
    }

    @l
    public final WizardParameter getParent() {
        return this.parent;
    }

    @Override // com.avito.android.remote.model.CategoryModel
    @l
    public Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    @Override // com.avito.android.remote.model.CategoryModel
    @k
    public String getTitle() {
        return this.title;
    }

    public final boolean isRoot() {
        return this.parent == null;
    }

    @Override // com.avito.android.remote.model.CategoryModel
    /* renamed from: isVerticalChange, reason: from getter */
    public boolean getIsVerticalChange() {
        return this.isVerticalChange;
    }

    public final void setParent(@l WizardParameter wizardParameter) {
        this.parent = wizardParameter;
    }

    @Override // com.avito.android.remote.model.CategoryModel
    @k
    public String toString() {
        return "WizardParameter(navigation=" + getNavigation() + ", title='" + getTitle() + "', description=" + getDescription() + ", children=" + this.children + ", rootNavigation=" + getRootNavigation() + ", isVerticalChange=" + getIsVerticalChange() + ')';
    }

    @Override // com.avito.android.remote.model.CategoryModel, android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.navigation.writeToParcel(parcel, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        C50480a c50480a = C50480a.f444023a;
        List<WizardParameter> list = this.children;
        c50480a.getClass();
        J3.e(list, parcel, flags);
        Navigation navigation2 = this.rootNavigation;
        if (navigation2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            navigation2.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isVerticalChange ? 1 : 0);
        parcel.writeParcelable(this.deeplink, flags);
    }

    public WizardParameter(Navigation navigation2, String str, String str2, List list, Navigation navigation3, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this(navigation2, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? null : navigation3, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? null : deepLink);
    }

    public static /* synthetic */ void getHasChildren$annotations() {
    }

    public static /* synthetic */ void getParent$annotations() {
    }
}
