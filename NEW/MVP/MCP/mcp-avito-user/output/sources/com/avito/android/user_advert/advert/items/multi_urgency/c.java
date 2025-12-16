package com.avito.android.user_advert.advert.items.multi_urgency;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiUrgencyBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/c;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309638b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309639c;

    /* renamed from: d, reason: collision with root package name */
    public final long f309640d;

    /* renamed from: e, reason: collision with root package name */
    public final long f309641e;

    /* renamed from: f, reason: collision with root package name */
    public final long f309642f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f309643g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AttributedText f309644h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<l> f309645i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f309646j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f309647k;

    public c(@Y61.k String str, @Y61.k String str2, long j12, long j13, long j14, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k List<l> list, boolean z12, boolean z13) {
        this.f309638b = str;
        this.f309639c = str2;
        this.f309640d = j12;
        this.f309641e = j13;
        this.f309642f = j14;
        this.f309643g = attributedText;
        this.f309644h = attributedText2;
        this.f309645i = list;
        this.f309646j = z12;
        this.f309647k = z13;
    }

    public static c a(c cVar, long j12, ArrayList arrayList, boolean z12, int i12) {
        String str = cVar.f309638b;
        String str2 = cVar.f309639c;
        long j13 = cVar.f309640d;
        long j14 = cVar.f309641e;
        long j15 = (i12 & 16) != 0 ? cVar.f309642f : j12;
        AttributedText attributedText = cVar.f309643g;
        AttributedText attributedText2 = cVar.f309644h;
        List<l> list = (i12 & 128) != 0 ? cVar.f309645i : arrayList;
        boolean z13 = (i12 & 256) != 0 ? cVar.f309646j : true;
        boolean z14 = (i12 & 512) != 0 ? cVar.f309647k : z12;
        cVar.getClass();
        return new c(str, str2, j13, j14, j15, attributedText, attributedText2, list, z13, z14);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f309638b, cVar.f309638b) && L.f(this.f309639c, cVar.f309639c) && this.f309640d == cVar.f309640d && this.f309641e == cVar.f309641e && this.f309642f == cVar.f309642f && L.f(this.f309643g, cVar.f309643g) && L.f(this.f309644h, cVar.f309644h) && L.f(this.f309645i, cVar.f309645i) && this.f309646j == cVar.f309646j && this.f309647k == cVar.f309647k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return getF309638b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309638b() {
        return this.f309638b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309647k) + r.i(H.e(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(r.g(r.g(r.g(H.d(this.f309638b.hashCode() * 31, 31, this.f309639c), 31, this.f309640d), 31, this.f309641e), 31, this.f309642f), 31, this.f309643g), 31, this.f309644h), 31, this.f309645i), 31, this.f309646j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiUrgencyBlockItem(stringId=");
        sb2.append(this.f309638b);
        sb2.append(", advertId=");
        sb2.append(this.f309639c);
        sb2.append(", categoryId=");
        sb2.append(this.f309640d);
        sb2.append(", microCategoryId=");
        sb2.append(this.f309641e);
        sb2.append(", selectedId=");
        sb2.append(this.f309642f);
        sb2.append(", title=");
        sb2.append(this.f309643g);
        sb2.append(", subtitle=");
        sb2.append(this.f309644h);
        sb2.append(", types=");
        sb2.append(this.f309645i);
        sb2.append(", isLoading=");
        sb2.append(this.f309646j);
        sb2.append(", isSwitchOn=");
        return r.x(sb2, this.f309647k, ')');
    }
}
