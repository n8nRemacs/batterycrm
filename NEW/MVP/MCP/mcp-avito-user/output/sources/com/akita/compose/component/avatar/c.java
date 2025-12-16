package com.akita.compose.component.avatar;

import Y41.q;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.M1;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Avatar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f60288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar) {
        super(3);
        this.f60288l = iVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            i iVar = this.f60288l;
            p.b("A", iVar.f60329d, M1.c(0.0f, iVar.f60330e, 1, v.f42878y1), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
        }
        return G0.f406611a;
    }
}
