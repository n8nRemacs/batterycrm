package com.avito.android.comfortable_deal_invite.lead;

import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/a;", "Lcom/akita/compose/component/chips/b;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal_invite.lead.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final /* data */ class C29496a implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f123628b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123629c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f123630d;

    public C29496a(String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        z12 = (i12 & 2) != 0 ? false : z12;
        z13 = (i12 & 4) != 0 ? true : z13;
        this.f123628b = str;
        this.f123629c = z12;
        this.f123630d = z13;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @Y61.l
    public final Integer c() {
        return null;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @Y61.l
    public final Integer d() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29496a)) {
            return false;
        }
        C29496a c29496a = (C29496a) obj;
        return kotlin.jvm.internal.L.f(this.f123628b, c29496a.f123628b) && this.f123629c == c29496a.f123629c && this.f123630d == c29496a.f123630d;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF123628b() {
        return this.f123628b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123630d) + androidx.appcompat.app.r.i(this.f123628b.hashCode() * 31, 31, this.f123629c);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    public final boolean isActive() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF123630d() {
        return this.f123630d;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF123629c() {
        return this.f123629c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Chip(title=");
        sb2.append(this.f123628b);
        sb2.append(", isSelected=");
        sb2.append(this.f123629c);
        sb2.append(", isEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f123630d, ')');
    }
}
