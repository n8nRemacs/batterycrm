package com.avito.android.bundles.viewmodel;

import Y61.l;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasBundlesViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/viewmodel/k;", "", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P2<Dk.h> f108763a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<TV0.a> f108764b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ButtonAction f108765c;

    public k() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f108763a, kVar.f108763a) && L.f(this.f108764b, kVar.f108764b) && L.f(this.f108765c, kVar.f108765c);
    }

    public final int hashCode() {
        int iHashCode = this.f108763a.hashCode() * 31;
        List<TV0.a> list = this.f108764b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ButtonAction buttonAction = this.f108765c;
        return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasBundlesViewState(loadingState=");
        sb2.append(this.f108763a);
        sb2.append(", bundles=");
        sb2.append(this.f108764b);
        sb2.append(", emptyAction=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f108765c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k P2<? super Dk.h> p22, @l List<? extends TV0.a> list, @l ButtonAction buttonAction) {
        this.f108763a = p22;
        this.f108764b = list;
        this.f108765c = buttonAction;
    }

    public /* synthetic */ k(P2 p22, List list, ButtonAction buttonAction, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? P2.c.f318721a : p22, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : buttonAction);
    }
}
