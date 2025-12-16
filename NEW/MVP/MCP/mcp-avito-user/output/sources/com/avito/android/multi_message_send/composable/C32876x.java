package com.avito.android.multi_message_send.composable;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import com.avito.android.multi_message_send.model.MultiSendAnchor;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MultiMessageSendScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "innerPadding", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.multi_message_send.composable.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32876x extends kotlin.jvm.internal.N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G20.f f206582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<G20.b, G0> f206583m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<G20.c> f206584n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f206585o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32876x(G20.f fVar, Y41.l<? super G20.b, G0> lVar, InterfaceC43160i<? extends G20.c> interfaceC43160i, kotlinx.coroutines.T t12) {
        super(3);
        this.f206582l = fVar;
        this.f206583m = lVar;
        this.f206584n = interfaceC43160i;
        this.f206585o = t12;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
        List<MultiSendAnchor> list;
        T1 t13 = t12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            G20.f fVar = this.f206582l;
            if (fVar.f6258a || ((list = fVar.f6260c) != null && list.isEmpty())) {
                a13.C(-960070633);
                L.a(0, this.f206583m, a13, R1.h(androidx.compose.ui.v.f42878y1, t13));
                a13.h();
            } else {
                a13.C(-959956553);
                C32878z.a(fVar, this.f206583m, this.f206584n, this.f206585o, R1.h(androidx.compose.ui.v.f42878y1, t13), a13, 4616, 0);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
