package com.avito.android.beduin.v2.page.impl.compose;

import androidx.compose.runtime.internal.P;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2PageComposeViewModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/m;", "", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC40048c f104990a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Hi.d f104991b;

    public m(@Y61.k AbstractC40048c abstractC40048c, @Y61.k Hi.d dVar) {
        this.f104990a = abstractC40048c;
        this.f104991b = dVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f104990a, mVar.f104990a) && L.f(this.f104991b, mVar.f104991b);
    }

    public final int hashCode() {
        return this.f104991b.f7618a.hashCode() + (this.f104990a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "PageState(beduinState=" + this.f104990a + ", screenState=" + this.f104991b + ')';
    }
}
