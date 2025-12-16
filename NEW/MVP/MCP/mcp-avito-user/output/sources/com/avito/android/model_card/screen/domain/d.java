package com.avito.android.model_card.screen.domain;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModelCardContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/avito/android/model_card/screen/domain/d;", "", "", "navBarFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "navBarComponents", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "navBarRightItems", "mainComponents", "bottomComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "g", "c", "a", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @com.google.gson.annotations.c("bottomFormId")
    @l
    private final String bottomFormId;

    @com.google.gson.annotations.c("mainComponents")
    @l
    private final List<BeduinModel> mainComponents;

    @com.google.gson.annotations.c("mainFormId")
    @l
    private final String mainFormId;

    @com.google.gson.annotations.c("navigationBarComponents")
    @l
    private final List<BeduinModel> navBarComponents;

    @com.google.gson.annotations.c("navigationBarFormId")
    @l
    private final String navBarFormId;

    @com.google.gson.annotations.c("navigationBarRightItems")
    @l
    private final List<NavigationBarItem> navBarRightItems;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l String str, @l String str2, @l String str3, @l List<? extends BeduinModel> list, @l List<? extends NavigationBarItem> list2, @l List<? extends BeduinModel> list3, @l List<? extends BeduinModel> list4) {
        this.navBarFormId = str;
        this.mainFormId = str2;
        this.bottomFormId = str3;
        this.navBarComponents = list;
        this.navBarRightItems = list2;
        this.mainComponents = list3;
        this.bottomComponents = list4;
    }

    @l
    public final List<BeduinModel> a() {
        return this.bottomComponents;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> c() {
        return this.mainComponents;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    public final List<BeduinModel> e() {
        return this.navBarComponents;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.navBarFormId, dVar.navBarFormId) && L.f(this.mainFormId, dVar.mainFormId) && L.f(this.bottomFormId, dVar.bottomFormId) && L.f(this.navBarComponents, dVar.navBarComponents) && L.f(this.navBarRightItems, dVar.navBarRightItems) && L.f(this.mainComponents, dVar.mainComponents) && L.f(this.bottomComponents, dVar.bottomComponents);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getNavBarFormId() {
        return this.navBarFormId;
    }

    @l
    public final List<NavigationBarItem> g() {
        return this.navBarRightItems;
    }

    public final int hashCode() {
        String str = this.navBarFormId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mainFormId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomFormId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BeduinModel> list = this.navBarComponents;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<NavigationBarItem> list2 = this.navBarRightItems;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinModel> list3 = this.mainComponents;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinModel> list4 = this.bottomComponents;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelCardContent(navBarFormId=");
        sb2.append(this.navBarFormId);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", navBarComponents=");
        sb2.append(this.navBarComponents);
        sb2.append(", navBarRightItems=");
        sb2.append(this.navBarRightItems);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomComponents=");
        return H.p(sb2, this.bottomComponents, ')');
    }
}
