package com.avito.android.wallet.page.topup.form.items.input;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TopUpInputItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/input/a;", "Lcom/avito/conveyor_item/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f328315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f328316c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f328317d;

    public a(@k String str, @k String str2, boolean z12) {
        this.f328315b = str;
        this.f328316c = str2;
        this.f328317d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f328315b, aVar.f328315b) && L.f(this.f328316c, aVar.f328316c) && this.f328317d == aVar.f328317d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF324863b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324863b() {
        return this.f328315b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f328317d) + H.d(this.f328315b.hashCode() * 31, 31, this.f328316c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TopUpInputItem(stringId=");
        sb2.append(this.f328315b);
        sb2.append(", value=");
        sb2.append(this.f328316c);
        sb2.append(", hasUpdate=");
        return r.x(sb2, this.f328317d, ')');
    }

    public /* synthetic */ a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12);
    }
}
