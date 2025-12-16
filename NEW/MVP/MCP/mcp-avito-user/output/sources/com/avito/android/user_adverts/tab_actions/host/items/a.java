package com.avito.android.user_adverts.tab_actions.host.items;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertActionItem.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f314314b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f314315c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final UserAdvertActionAttentionInfo f314316d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f314317e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UserAdvertActionType.Multiple f314318f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f314319g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final DeepLink f314320h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final UserAdvertActionsInfoDomain.BadgeInfo f314321i;

    /* renamed from: j, reason: collision with root package name */
    public final int f314322j;

    public a(@Y61.k String str, @Y61.k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map, @Y61.l UserAdvertActionAttentionInfo userAdvertActionAttentionInfo, @Y61.k String str2, @Y61.k UserAdvertActionType.Multiple multiple, boolean z12, @Y61.l DeepLink deepLink, @Y61.l UserAdvertActionsInfoDomain.BadgeInfo badgeInfo) {
        this.f314314b = str;
        this.f314315c = map;
        this.f314316d = userAdvertActionAttentionInfo;
        this.f314317e = str2;
        this.f314318f = multiple;
        this.f314319g = z12;
        this.f314320h = deepLink;
        this.f314321i = badgeInfo;
        Iterator<T> it = map.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((UserAdvertsGroupInfo) it.next()).f312184b.size();
        }
        this.f314322j = size;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f314314b, aVar.f314314b) && L.f(this.f314315c, aVar.f314315c) && L.f(this.f314316d, aVar.f314316d) && L.f(this.f314317e, aVar.f314317e) && this.f314318f == aVar.f314318f && this.f314319g == aVar.f314319g && L.f(this.f314320h, aVar.f314320h) && L.f(this.f314321i, aVar.f314321i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF309891b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF309891b() {
        return this.f314318f.f312180b;
    }

    public final int hashCode() {
        int iC2 = AK.c.c(this.f314314b.hashCode() * 31, 31, this.f314315c);
        UserAdvertActionAttentionInfo userAdvertActionAttentionInfo = this.f314316d;
        int i12 = androidx.appcompat.app.r.i((this.f314318f.hashCode() + H.d((iC2 + (userAdvertActionAttentionInfo == null ? 0 : userAdvertActionAttentionInfo.hashCode())) * 31, 31, this.f314317e)) * 31, 31, this.f314319g);
        DeepLink deepLink = this.f314320h;
        int iHashCode = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UserAdvertActionsInfoDomain.BadgeInfo badgeInfo = this.f314321i;
        return iHashCode + (badgeInfo != null ? badgeInfo.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "UserAdvertActionItem(text=" + this.f314314b + ", selectedGroupInfo=" + this.f314315c + ", attentionInfo=" + this.f314316d + ", currentShortcut=" + this.f314317e + ", type=" + this.f314318f + ", isLoading=" + this.f314319g + ", deeplink=" + this.f314320h + ", badgeInfo=" + this.f314321i + ')';
    }

    public /* synthetic */ a(String str, Map map, UserAdvertActionAttentionInfo userAdvertActionAttentionInfo, String str2, UserAdvertActionType.Multiple multiple, boolean z12, DeepLink deepLink, UserAdvertActionsInfoDomain.BadgeInfo badgeInfo, int i12, C42822w c42822w) {
        this(str, map, userAdvertActionAttentionInfo, str2, multiple, z12, (i12 & 64) != 0 ? null : deepLink, (i12 & 128) != 0 ? null : badgeInfo);
    }
}
