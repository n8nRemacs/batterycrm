package com.avito.android.comfortable_deal.deal.item.teammember;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TeamMemberItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/teammember/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121538b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f121539c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f121540d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TeamMemberPhone f121541e;

    public c(@k String str, @l Image image, @k String str2, @k TeamMemberPhone teamMemberPhone) {
        this.f121538b = str;
        this.f121539c = image;
        this.f121540d = str2;
        this.f121541e = teamMemberPhone;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f121538b, cVar.f121538b) && L.f(this.f121539c, cVar.f121539c) && L.f(this.f121540d, cVar.f121540d) && L.f(this.f121541e, cVar.f121541e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return -676121904;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF84834c() {
        return "team_member_seller_item";
    }

    public final int hashCode() {
        int iD2 = H.d(515057456, 31, this.f121538b);
        Image image = this.f121539c;
        return this.f121541e.hashCode() + H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f121540d);
    }

    @k
    public final String toString() {
        return "TeamMemberItem(stringId=team_member_seller_item, memberId=" + this.f121538b + ", avatar=" + this.f121539c + ", name=" + this.f121540d + ", phone=" + this.f121541e + ')';
    }
}
