package com.avito.android.mortgage.root.list.items.borrower_action;

import KZ.L;
import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BorrowerActionItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_action/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202437c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f202438d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f202439e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f202440f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f202441g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final DeepLink f202442h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final L f202443i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f202444j;

    public c(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @l AttributedText attributedText, @k DeepLink deepLink, @l L l12, boolean z12) {
        this.f202436b = str;
        this.f202437c = str2;
        this.f202438d = str3;
        this.f202439e = str4;
        this.f202440f = str5;
        this.f202441g = attributedText;
        this.f202442h = deepLink;
        this.f202443i = l12;
        this.f202444j = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202436b, this.f202437c, this.f202438d, this.f202439e, this.f202440f, this.f202441g, this.f202442h, this.f202443i, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.L.f(this.f202436b, cVar.f202436b) && kotlin.jvm.internal.L.f(this.f202437c, cVar.f202437c) && kotlin.jvm.internal.L.f(this.f202438d, cVar.f202438d) && kotlin.jvm.internal.L.f(this.f202439e, cVar.f202439e) && kotlin.jvm.internal.L.f(this.f202440f, cVar.f202440f) && kotlin.jvm.internal.L.f(this.f202441g, cVar.f202441g) && kotlin.jvm.internal.L.f(this.f202442h, cVar.f202442h) && kotlin.jvm.internal.L.f(this.f202443i, cVar.f202443i) && this.f202444j == cVar.f202444j;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202644f() {
        return this.f202444j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79389b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82954f() {
        return this.f202436b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f202436b.hashCode() * 31, 31, this.f202437c), 31, this.f202438d);
        String str = this.f202439e;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f202440f);
        AttributedText attributedText = this.f202441g;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f202442h, (iD3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
        L l12 = this.f202443i;
        return Boolean.hashCode(this.f202444j) + ((iE2 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorrowerActionItem(stringId=");
        sb2.append(this.f202436b);
        sb2.append(", applicantId=");
        sb2.append(this.f202437c);
        sb2.append(", iconName=");
        sb2.append(this.f202438d);
        sb2.append(", iconBadgeColor=");
        sb2.append(this.f202439e);
        sb2.append(", title=");
        sb2.append(this.f202440f);
        sb2.append(", subtitle=");
        sb2.append(this.f202441g);
        sb2.append(", action=");
        sb2.append(this.f202442h);
        sb2.append(", context=");
        sb2.append(this.f202443i);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202444j, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, AttributedText attributedText, DeepLink deepLink, L l12, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, attributedText, deepLink, l12, (i12 & 256) != 0 ? true : z12);
    }
}
