package com.avito.android.services_portfolio.project.components;

import Y41.l;
import androidx.compose.ui.platform.InterfaceC22520r2;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: TextWithLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f280167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22520r2 f280168m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C22602e c22602e, InterfaceC22520r2 interfaceC22520r2) {
        super(1);
        this.f280167l = c22602e;
        this.f280168m = interfaceC22520r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C22602e.C1684e c1684e = (C22602e.C1684e) C42745f0.G(this.f280167l.c(iIntValue, iIntValue, "URL"));
        if (c1684e != null) {
            this.f280168m.a((String) c1684e.f42138a);
        }
        return G0.f406611a;
    }
}
