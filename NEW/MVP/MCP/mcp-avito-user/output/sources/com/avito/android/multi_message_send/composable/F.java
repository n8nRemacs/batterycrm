package com.avito.android.multi_message_send.composable;

import F20.e;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import com.avito.android.multi_message_send.model.MultiSendAnchor;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MultiSendContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class F extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f206476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(int i12) {
        super(2);
        this.f206476l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.B b12;
        num.intValue();
        int iA2 = C22066f2.a(this.f206476l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1677359420);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            G20.f fVar = new G20.f(false, C42745f0.U(new e.c("Избранное", "AnchorIdent1"), new e.a(123L, "Name", "55555", "SellerName", "Address", null, new F20.f(4.4d, 5L), null, true, "AnchorIdent", true), new e.c("Просмотренное", "AnchorIdent2"), new e.a(1234L, "Name", "55555", "SellerName", "Address", null, new F20.f(4.4d, 5L), null, true, "AnchorIdent2", true)), Collections.singletonList(new MultiSendAnchor("title", false, "anchor")), new G20.a(0, "Продаете?", true, false, true), Boolean.TRUE);
            E e12 = E.f206475l;
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                b12 = bE2;
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, b12);
                b12.H(objT);
            } else {
                b12 = bE2;
            }
            C32878z.a(fVar, e12, interfaceC43160iW, (kotlinx.coroutines.T) objT, null, b12, 4664, 16);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new F(iA2);
        }
        return G0.f406611a;
    }
}
