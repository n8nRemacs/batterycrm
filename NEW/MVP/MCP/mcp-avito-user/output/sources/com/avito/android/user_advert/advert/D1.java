package com.avito.android.user_advert.advert;

import com.avito.android.user_advert.advert.z1;
import kotlin.Metadata;

/* compiled from: Delegates.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D1 extends kotlin.properties.e<z1.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f308227b;

    /* JADX WARN: Illegal instructions before constructor call */
    public D1(z1 z1Var) {
        z1.b bVar = z1.b.f310671b;
        this.f308227b = z1Var;
        super(bVar);
    }

    @Override // kotlin.properties.e
    public final void afterChange(kotlin.reflect.n<?> nVar, z1.b bVar, z1.b bVar2) {
        z1.b bVar3 = bVar2;
        if (bVar == bVar3 || bVar3 == z1.b.f310671b) {
            return;
        }
        InterfaceC35426j0 interfaceC35426j0 = this.f308227b.f310668b;
        bVar3.getClass();
        interfaceC35426j0.b(bVar3 == z1.b.f310672c);
    }
}
