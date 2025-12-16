package com.avito.android.mnz_common.ui.compose.model;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.button.t;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzButtonCompose.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/compose/model/a;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f198002a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f198003b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final p<A, Integer, t> f198004c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f198005d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @l DeepLink deepLink, @l p<? super A, ? super Integer, t> pVar, @l Boolean bool) {
        this.f198002a = str;
        this.f198003b = deepLink;
        this.f198004c = pVar;
        this.f198005d = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f198002a, aVar.f198002a) && L.f(this.f198003b, aVar.f198003b) && L.f(this.f198004c, aVar.f198004c) && L.f(this.f198005d, aVar.f198005d);
    }

    public final int hashCode() {
        int iHashCode = this.f198002a.hashCode() * 31;
        DeepLink deepLink = this.f198003b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        p<A, Integer, t> pVar = this.f198004c;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Boolean bool = this.f198005d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzButtonCompose(title=");
        sb2.append(this.f198002a);
        sb2.append(", deeplink=");
        sb2.append(this.f198003b);
        sb2.append(", style=");
        sb2.append(this.f198004c);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f198005d, ')');
    }

    public /* synthetic */ a(String str, DeepLink deepLink, p pVar, Boolean bool, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : pVar, (i12 & 8) != 0 ? null : bool);
    }
}
