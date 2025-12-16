package com.avito.android.mortgage.root.list.items.status;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatusItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/status/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Image f202833c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f202834d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f202835e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202836f;

    public c(@k String str, @k Image image, @k AttributedText attributedText, @k AttributedText attributedText2, boolean z12) {
        this.f202832b = str;
        this.f202833c = image;
        this.f202834d = attributedText;
        this.f202835e = attributedText2;
        this.f202836f = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202832b, this.f202833c, this.f202834d, this.f202835e, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202832b, cVar.f202832b) && L.f(this.f202833c, cVar.f202833c) && L.f(this.f202834d, cVar.f202834d) && L.f(this.f202835e, cVar.f202835e) && this.f202836f == cVar.f202836f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202708g() {
        return this.f202836f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77564b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF157670b() {
        return this.f202832b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202836f) + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.g(this.f202833c, this.f202832b.hashCode() * 31, 31), 31, this.f202834d), 31, this.f202835e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatusItem(stringId=");
        sb2.append(this.f202832b);
        sb2.append(", image=");
        sb2.append(this.f202833c);
        sb2.append(", title=");
        sb2.append(this.f202834d);
        sb2.append(", subtitle=");
        sb2.append(this.f202835e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202836f, ')');
    }

    public /* synthetic */ c(String str, Image image, AttributedText attributedText, AttributedText attributedText2, boolean z12, int i12, C42822w c42822w) {
        this(str, image, attributedText, attributedText2, (i12 & 16) != 0 ? true : z12);
    }
}
