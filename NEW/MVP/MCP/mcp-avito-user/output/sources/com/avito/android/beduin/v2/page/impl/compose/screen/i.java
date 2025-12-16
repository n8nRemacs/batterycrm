package com.avito.android.beduin.v2.page.impl.compose.screen;

import com.avito.android.beduin.v2.page.impl.compose.k;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.v2.page.impl.compose.d f105056l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.v2.page.impl.compose.j f105057m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.avito.android.beduin.v2.page.impl.compose.d dVar, com.avito.android.beduin.v2.page.impl.compose.j jVar) {
        super(0);
        this.f105056l = dVar;
        this.f105057m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.beduin.v2.page.impl.compose.j jVar = this.f105057m;
        InterfaceC40047a.c cVar = new InterfaceC40047a.c(jVar.f104983a, jVar.f104985c);
        com.avito.android.beduin.v2.page.impl.compose.d dVar = this.f105056l;
        dVar.getClass();
        dVar.accept(new k.a(cVar));
        return G0.f406611a;
    }
}
