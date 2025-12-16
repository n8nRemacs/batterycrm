package com.avito.android.mortgage.root.list.items.immutable_info;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImmutableInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202552b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202553c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f202554d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f202555e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202556f;

    public c(@k AttributedText attributedText, @k String str, @k String str2, @k String str3, boolean z12) {
        this.f202552b = str;
        this.f202553c = str2;
        this.f202554d = attributedText;
        this.f202555e = str3;
        this.f202556f = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202554d, this.f202552b, this.f202553c, this.f202555e, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202552b, cVar.f202552b) && L.f(this.f202553c, cVar.f202553c) && L.f(this.f202554d, cVar.f202554d) && L.f(this.f202555e, cVar.f202555e) && this.f202556f == cVar.f202556f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202669d() {
        return this.f202556f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137415b() {
        return this.f202552b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202556f) + H.d(com.avito.android.actions_sheet.a.b(H.d(this.f202552b.hashCode() * 31, 31, this.f202553c), 31, this.f202554d), 31, this.f202555e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoItem(stringId=");
        sb2.append(this.f202552b);
        sb2.append(", title=");
        sb2.append(this.f202553c);
        sb2.append(", content=");
        sb2.append(this.f202554d);
        sb2.append(", actionTitle=");
        sb2.append(this.f202555e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202556f, ')');
    }

    public /* synthetic */ c(String str, String str2, AttributedText attributedText, String str3, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, str, str2, str3, (i12 & 16) != 0 ? true : z12);
    }
}
