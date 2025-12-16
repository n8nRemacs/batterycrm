package com.avito.android.universal_transaction.transaction;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TransactionDebugMenu.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<BG0.a> f306587l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC22204y1<BG0.a> interfaceC22204y1) {
        super(1);
        this.f306587l = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        InterfaceC22204y1<BG0.a> interfaceC22204y1 = this.f306587l;
        BG0.a f42167b = interfaceC22204y1.getF42167b();
        if (str2.length() == 0) {
            str2 = null;
        }
        interfaceC22204y1.setValue(BG0.a.a(f42167b, null, null, null, str2, null, null, null, null, 991));
        return G0.f406611a;
    }
}
