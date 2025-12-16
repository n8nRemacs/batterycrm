package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2FeesMethodItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/fees_method/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f158353b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f158354c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f158355d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f158356e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f158357f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f158358g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final wZ.l f158359h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f158360i;

    /* compiled from: FeesMethodsV2FeesMethodItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/fees_method/a$a;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4627a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f158361a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DockingBadgeType.Predefined f158362b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DockingBadgeEdgeType f158363c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DockingBadgeEdgeType f158364d;

        public C4627a(@k String str, @l DockingBadgeType.Predefined predefined, @l DockingBadgeEdgeType dockingBadgeEdgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType2) {
            this.f158361a = str;
            this.f158362b = predefined;
            this.f158363c = dockingBadgeEdgeType;
            this.f158364d = dockingBadgeEdgeType2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4627a)) {
                return false;
            }
            C4627a c4627a = (C4627a) obj;
            return L.f(this.f158361a, c4627a.f158361a) && L.f(this.f158362b, c4627a.f158362b) && this.f158363c == c4627a.f158363c && this.f158364d == c4627a.f158364d;
        }

        public final int hashCode() {
            int iHashCode = this.f158361a.hashCode() * 31;
            DockingBadgeType.Predefined predefined = this.f158362b;
            int iHashCode2 = (iHashCode + (predefined == null ? 0 : predefined.hashCode())) * 31;
            DockingBadgeEdgeType dockingBadgeEdgeType = this.f158363c;
            int iHashCode3 = (iHashCode2 + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31;
            DockingBadgeEdgeType dockingBadgeEdgeType2 = this.f158364d;
            return iHashCode3 + (dockingBadgeEdgeType2 != null ? dockingBadgeEdgeType2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "BadgeData(title=" + this.f158361a + ", badgeType=" + this.f158362b + ", leftEdgeStyle=" + this.f158363c + ", rightEdgeStyle=" + this.f158364d + ')';
        }
    }

    public a(@k String str, @k String str2, @k String str3, @l AttributedText attributedText, @l AttributedText attributedText2, @l ArrayList arrayList, @l wZ.l lVar, @k DeepLink deepLink) {
        this.f158353b = str;
        this.f158354c = str2;
        this.f158355d = str3;
        this.f158356e = attributedText;
        this.f158357f = attributedText2;
        this.f158358g = arrayList;
        this.f158359h = lVar;
        this.f158360i = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f158353b, aVar.f158353b) && L.f(this.f158354c, aVar.f158354c) && L.f(this.f158355d, aVar.f158355d) && L.f(this.f158356e, aVar.f158356e) && L.f(this.f158357f, aVar.f158357f) && L.f(this.f158358g, aVar.f158358g) && L.f(this.f158359h, aVar.f158359h) && L.f(this.f158360i, aVar.f158360i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF145099b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145099b() {
        return this.f158353b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f158353b.hashCode() * 31, 31, this.f158354c), 31, this.f158355d);
        AttributedText attributedText = this.f158356e;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f158357f;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        ArrayList arrayList = this.f158358g;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        wZ.l lVar = this.f158359h;
        return this.f158360i.hashCode() + ((iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeesMethodsV2FeesMethodItem(stringId=");
        sb2.append(this.f158353b);
        sb2.append(", feesMethodId=");
        sb2.append(this.f158354c);
        sb2.append(", title=");
        sb2.append(this.f158355d);
        sb2.append(", description=");
        sb2.append(this.f158356e);
        sb2.append(", price=");
        sb2.append(this.f158357f);
        sb2.append(", badges=");
        sb2.append(this.f158358g);
        sb2.append(", icon=");
        sb2.append(this.f158359h);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f158360i, ')');
    }
}
