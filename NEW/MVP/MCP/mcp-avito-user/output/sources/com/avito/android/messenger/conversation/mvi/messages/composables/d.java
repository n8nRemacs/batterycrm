package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<T1> f192195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends T1> list) {
        super(2);
        this.f192195l = list;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
            g0.b bVar = new g0.b(0);
            n.a(this.f192195l, b.f192193l, c.f192194l, interfaceC43160iW, vVarB, bVar, a13, 4536);
        }
        return G0.f406611a;
    }
}
