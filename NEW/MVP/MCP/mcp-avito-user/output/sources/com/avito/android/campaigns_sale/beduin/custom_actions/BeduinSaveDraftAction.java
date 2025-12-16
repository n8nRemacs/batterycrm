package com.avito.android.campaigns_sale.beduin.custom_actions;

import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.adjust.sdk.Constants;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSaveDraftAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006 "}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSaveDraftAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSaveDraftAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Companion", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BeduinSaveDraftAction implements BeduinAction {

    @l
    private final DeepLink deeplink;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSaveDraftAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSaveDraftAction.class;

    @k
    private static final String type = "avitoSalesSaveDraft";

    /* compiled from: BeduinSaveDraftAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSaveDraftAction$a;", "LUi/c;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.campaigns_sale.beduin.custom_actions.BeduinSaveDraftAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSaveDraftAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinSaveDraftAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSaveDraftAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSaveDraftAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSaveDraftAction createFromParcel(Parcel parcel) {
            return new BeduinSaveDraftAction((DeepLink) parcel.readParcelable(BeduinSaveDraftAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSaveDraftAction[] newArray(int i12) {
            return new BeduinSaveDraftAction[i12];
        }
    }

    public BeduinSaveDraftAction(@l DeepLink deepLink) {
        this.deeplink = deepLink;
    }

    public static /* synthetic */ BeduinSaveDraftAction copy$default(BeduinSaveDraftAction beduinSaveDraftAction, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = beduinSaveDraftAction.deeplink;
        }
        return beduinSaveDraftAction.copy(deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final BeduinSaveDraftAction copy(@l DeepLink deeplink) {
        return new BeduinSaveDraftAction(deeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSaveDraftAction) && L.f(this.deeplink, ((BeduinSaveDraftAction) other).deeplink);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        DeepLink deepLink = this.deeplink;
        if (deepLink == null) {
            return 0;
        }
        return deepLink.hashCode();
    }

    @k
    public String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("BeduinSaveDraftAction(deeplink="), this.deeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.deeplink, flags);
    }
}
