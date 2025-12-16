package com.avito.android.universal_transaction.transaction;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.bottom_sheet.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* compiled from: TransactionDebugMenu.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f306596l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I f306597m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<BG0.a, G0> f306598n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<BG0.a> f306599o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(T t12, I i12, Y41.l<? super BG0.a, G0> lVar, InterfaceC22204y1<BG0.a> interfaceC22204y1) {
        super(0);
        this.f306596l = t12;
        this.f306597m = i12;
        this.f306598n = lVar;
        this.f306599o = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        N0 n0D = C43259k.d(this.f306596l, null, null, new i(this.f306597m, null), 3);
        V0 v02 = (V0) n0D;
        v02.k(new j(this.f306598n, this.f306599o));
        return G0.f406611a;
    }
}
