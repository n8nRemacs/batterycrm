package com.avito.android.advert.item.select.parameters_v3;

import androidx.compose.runtime.C22126m3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectParametersV3View.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f79554l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e12) {
        super(2);
        this.f79554l = e12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            E e12 = this.f79554l;
            x.b(C22126m3.b(e12.f79559e, a13), new A(e12), new B(1, e12, E.class, "bindPhone", "bindPhone(Ljava/lang/String;)V", 0), new C(e12), null, a13, 0);
        }
        return G0.f406611a;
    }
}
