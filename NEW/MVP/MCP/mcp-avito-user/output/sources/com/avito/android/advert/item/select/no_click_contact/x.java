package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectNoClickContactView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class x extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f79497l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        super(2);
        this.f79497l = yVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            y yVar = this.f79497l;
            r.a(C22126m3.b(yVar.f79502e, a13), new u(yVar), new v(1, yVar, y.class, "bindPhone", "bindPhone(Ljava/lang/String;)V", 0), new w(yVar), null, a13, 0);
        }
        return G0.f406611a;
    }
}
