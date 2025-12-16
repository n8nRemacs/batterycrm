package com.avito.android.user_advert.advert.items.multi_urgency;

import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiUrgencyBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/l;", "Lcom/avito/android/lib/design/selector_card/r;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class l implements r {

    /* renamed from: b, reason: collision with root package name */
    public final long f309665b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f309666c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f309667d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309668e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f309669f;

    public l(long j12, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, boolean z12, boolean z13) {
        this.f309665b = j12;
        this.f309666c = attributedText;
        this.f309667d = attributedText2;
        this.f309668e = z12;
        this.f309669f = z13;
    }

    public static l b(l lVar, boolean z12, boolean z13, int i12) {
        if ((i12 & 16) != 0) {
            z13 = lVar.f309669f;
        }
        return new l(lVar.f309665b, lVar.f309666c, lVar.f309667d, z12, z13);
    }

    @Override // com.avito.android.lib.design.selector_card.r
    public final boolean a(@Y61.k r rVar) {
        return (rVar instanceof l) && equals(rVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f309665b == lVar.f309665b && L.f(this.f309666c, lVar.f309666c) && L.f(this.f309667d, lVar.f309667d) && this.f309668e == lVar.f309668e && this.f309669f == lVar.f309669f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309669f) + androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(Long.hashCode(this.f309665b) * 31, 31, this.f309666c), 31, this.f309667d), 31, this.f309668e);
    }

    @Override // com.avito.android.lib.design.selector_card.r
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF309669f() {
        return this.f309669f;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiUrgencyTypeItem(id=");
        sb2.append(this.f309665b);
        sb2.append(", title=");
        sb2.append(this.f309666c);
        sb2.append(", subtitle=");
        sb2.append(this.f309667d);
        sb2.append(", isSelected=");
        sb2.append(this.f309668e);
        sb2.append(", isEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f309669f, ')');
    }
}
