package com.avito.android.mortgage.root.list.items.bank_banner;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BankBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_banner/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202392b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f202393c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f202394d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f202395e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f202396f;

    public c(@l UniversalImage universalImage, @k String str, @k AttributedText attributedText, @k DeepLink deepLink, boolean z12) {
        this.f202392b = str;
        this.f202393c = universalImage;
        this.f202394d = attributedText;
        this.f202395e = deepLink;
        this.f202396f = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202393c, this.f202392b, this.f202394d, this.f202395e, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202392b, cVar.f202392b) && L.f(this.f202393c, cVar.f202393c) && L.f(this.f202394d, cVar.f202394d) && L.f(this.f202395e, cVar.f202395e) && this.f202396f == cVar.f202396f;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202481g() {
        return this.f202396f;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200563b() {
        return this.f202392b;
    }

    public final int hashCode() {
        int iHashCode = this.f202392b.hashCode() * 31;
        UniversalImage universalImage = this.f202393c;
        return Boolean.hashCode(this.f202396f) + com.avito.android.actions_sheet.a.e(this.f202395e, com.avito.android.actions_sheet.a.b((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f202394d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankBannerItem(stringId=");
        sb2.append(this.f202392b);
        sb2.append(", image=");
        sb2.append(this.f202393c);
        sb2.append(", text=");
        sb2.append(this.f202394d);
        sb2.append(", deeplink=");
        sb2.append(this.f202395e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202396f, ')');
    }

    public /* synthetic */ c(String str, UniversalImage universalImage, AttributedText attributedText, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(universalImage, str, attributedText, deepLink, (i12 & 16) != 0 ? true : z12);
    }
}
