package com.avito.android.virtual_deal_room_client_creation.create;

import androidx.compose.foundation.layout.InterfaceC20640y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CreateScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class E extends N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ QN0.a f326729l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f326730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(QN0.a aVar, Y41.l lVar) {
        super(3);
        this.f326729l = aVar;
        this.f326730m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            String str = this.f326729l.f13702a;
            if (str != null) {
                C43066x.K(str);
            }
        }
        return G0.f406611a;
    }
}
