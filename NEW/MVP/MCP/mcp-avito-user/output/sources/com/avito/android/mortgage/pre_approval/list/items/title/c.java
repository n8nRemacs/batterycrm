package com.avito.android.mortgage.pre_approval.list.items.title;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/list/items/title/c;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f201958b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f201959c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f201960d;

    public c(@k PrintableText printableText, @k String str, boolean z12) {
        this.f201958b = str;
        this.f201959c = printableText;
        this.f201960d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f201958b, cVar.f201958b) && L.f(this.f201959c, cVar.f201959c) && this.f201960d == cVar.f201960d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171602b() {
        return this.f201958b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201960d) + com.avito.android.actions_sheet.a.f(this.f201959c, this.f201958b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f201958b);
        sb2.append(", text=");
        sb2.append(this.f201959c);
        sb2.append(", hasAnimatedEllipsis=");
        return r.x(sb2, this.f201960d, ')');
    }

    public /* synthetic */ c(String str, PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
        this(printableText, str, (i12 & 4) != 0 ? false : z12);
    }
}
