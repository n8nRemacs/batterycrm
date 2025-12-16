package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: EarlyAccessScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f145417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f145418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N(Y41.l lVar, C22602e c22602e) {
        super(1);
        this.f145417l = c22602e;
        this.f145418m = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C22602e.C1684e c1684e = (C22602e.C1684e) C42745f0.G(this.f145417l.c(iIntValue, iIntValue, "URL"));
        if (c1684e != null) {
            this.f145418m.invoke(new InterfaceC14538a.C0709a((String) c1684e.f42138a));
        }
        return G0.f406611a;
    }
}
