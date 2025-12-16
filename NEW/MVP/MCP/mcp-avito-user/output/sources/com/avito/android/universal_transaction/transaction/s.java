package com.avito.android.universal_transaction.transaction;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TransactionDebugMenu.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBG0/a;", "params", "Lkotlin/G0;", "invoke", "(LBG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class s extends N implements Y41.l<BG0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<BG0.a, G0> f306624l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f306625m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Y41.l<? super BG0.a, G0> lVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
        super(1);
        this.f306624l = lVar;
        this.f306625m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(BG0.a aVar) {
        ((w) this.f306624l).invoke(aVar);
        this.f306625m.setValue(Boolean.TRUE);
        return G0.f406611a;
    }
}
