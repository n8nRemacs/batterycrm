package com.avito.android.orders.api.model;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOrdersResponse.kt */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003Jo\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006%"}, d2 = {"Lcom/avito/android/orders/api/model/BeduinOrdersResponse;", "", "topFormId", "", "topComponents", "", "Lcom/avito/android/beduin_models/BeduinModel;", "mainFormId", "mainComponents", "bottomFormId", "bottomComponents", "onRefreshScreenActions", "Lcom/avito/android/beduin_models/BeduinAction;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getBottomComponents", "()Ljava/util/List;", "getBottomFormId", "()Ljava/lang/String;", "getMainComponents", "getMainFormId", "getOnRefreshScreenActions", "getTopComponents", "getTopFormId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BeduinOrdersResponse {

    @l
    private final List<BeduinModel> bottomComponents;

    @l
    private final String bottomFormId;

    @k
    private final List<BeduinModel> mainComponents;

    @k
    private final String mainFormId;

    @k
    private final List<BeduinAction> onRefreshScreenActions;

    @l
    private final List<BeduinModel> topComponents;

    @l
    private final String topFormId;

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOrdersResponse(@l String str, @l List<? extends BeduinModel> list, @k String str2, @k List<? extends BeduinModel> list2, @l String str3, @l List<? extends BeduinModel> list3, @k List<? extends BeduinAction> list4) {
        this.topFormId = str;
        this.topComponents = list;
        this.mainFormId = str2;
        this.mainComponents = list2;
        this.bottomFormId = str3;
        this.bottomComponents = list3;
        this.onRefreshScreenActions = list4;
    }

    public static /* synthetic */ BeduinOrdersResponse copy$default(BeduinOrdersResponse beduinOrdersResponse, String str, List list, String str2, List list2, String str3, List list3, List list4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinOrdersResponse.topFormId;
        }
        if ((i12 & 2) != 0) {
            list = beduinOrdersResponse.topComponents;
        }
        List list5 = list;
        if ((i12 & 4) != 0) {
            str2 = beduinOrdersResponse.mainFormId;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            list2 = beduinOrdersResponse.mainComponents;
        }
        List list6 = list2;
        if ((i12 & 16) != 0) {
            str3 = beduinOrdersResponse.bottomFormId;
        }
        String str5 = str3;
        if ((i12 & 32) != 0) {
            list3 = beduinOrdersResponse.bottomComponents;
        }
        List list7 = list3;
        if ((i12 & 64) != 0) {
            list4 = beduinOrdersResponse.onRefreshScreenActions;
        }
        return beduinOrdersResponse.copy(str, list5, str4, list6, str5, list7, list4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @l
    public final List<BeduinModel> component2() {
        return this.topComponents;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @k
    public final List<BeduinModel> component4() {
        return this.mainComponents;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.bottomComponents;
    }

    @k
    public final List<BeduinAction> component7() {
        return this.onRefreshScreenActions;
    }

    @k
    public final BeduinOrdersResponse copy(@l String topFormId, @l List<? extends BeduinModel> topComponents, @k String mainFormId, @k List<? extends BeduinModel> mainComponents, @l String bottomFormId, @l List<? extends BeduinModel> bottomComponents, @k List<? extends BeduinAction> onRefreshScreenActions) {
        return new BeduinOrdersResponse(topFormId, topComponents, mainFormId, mainComponents, bottomFormId, bottomComponents, onRefreshScreenActions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOrdersResponse)) {
            return false;
        }
        BeduinOrdersResponse beduinOrdersResponse = (BeduinOrdersResponse) other;
        return L.f(this.topFormId, beduinOrdersResponse.topFormId) && L.f(this.topComponents, beduinOrdersResponse.topComponents) && L.f(this.mainFormId, beduinOrdersResponse.mainFormId) && L.f(this.mainComponents, beduinOrdersResponse.mainComponents) && L.f(this.bottomFormId, beduinOrdersResponse.bottomFormId) && L.f(this.bottomComponents, beduinOrdersResponse.bottomComponents) && L.f(this.onRefreshScreenActions, beduinOrdersResponse.onRefreshScreenActions);
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

    @k
    public final List<BeduinAction> getOnRefreshScreenActions() {
        return this.onRefreshScreenActions;
    }

    @l
    public final List<BeduinModel> getTopComponents() {
        return this.topComponents;
    }

    @l
    public final String getTopFormId() {
        return this.topFormId;
    }

    public int hashCode() {
        String str = this.topFormId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BeduinModel> list = this.topComponents;
        int iE2 = H.e(H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.mainFormId), 31, this.mainComponents);
        String str2 = this.bottomFormId;
        int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BeduinModel> list2 = this.bottomComponents;
        return this.onRefreshScreenActions.hashCode() + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOrdersResponse(topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", topComponents=");
        sb2.append(this.topComponents);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", bottomComponents=");
        sb2.append(this.bottomComponents);
        sb2.append(", onRefreshScreenActions=");
        return H.p(sb2, this.onRefreshScreenActions, ')');
    }
}
