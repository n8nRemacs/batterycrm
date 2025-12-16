package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.platform.Q0;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MessageList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.q<InterfaceC20793y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0.b f192198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g0.b bVar) {
        super(3);
        this.f192198l = bVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            C20608p2.a(a13, C20588k2.f(androidx.compose.ui.v.f42878y1, ((androidx.compose.ui.unit.d) a13.o(Q0.f41199h)).J(((Number) ((C22082i3) this.f192198l.f192967a).getF42167b()).intValue())));
        }
        return G0.f406611a;
    }
}
