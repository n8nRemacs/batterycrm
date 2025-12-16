package com.avito.android.messenger.conversation.mvi.messages.composables.other.icons;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.graphics.vector.U;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Close.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/other/icons/g;", "Lcom/avito/android/messenger/conversation/mvi/messages/composables/other/icons/k;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final g f192786a = new g();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static C22293d f192787b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public static C22293d f192788c;

    @Override // com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k
    @InterfaceC22132o
    @Y61.k
    public final C22293d a(@Y61.l A a12) {
        a12.C(1496039159);
        boolean zBooleanValue = ((Boolean) a12.o(com.akita.compose.foundation.b.f63571a)).booleanValue();
        C22293d c22293d = f192787b;
        if (c22293d != null && !zBooleanValue) {
            a12.h();
            return c22293d;
        }
        C22293d c22293d2 = f192788c;
        if (c22293d2 != null && zBooleanValue) {
            a12.h();
            return c22293d2;
        }
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        C22293d.a aVar2 = new C22293d.a("Close", 10.0f, 10.0f, 10.0f, 10.0f, 0L, 0, false, 96, null);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
        k1 k1Var = new k1(aVar3.f63938l.c(a12), null);
        com.akita.compose.foundation.p pVar = aVar3.f63900Y;
        k1 k1Var2 = new k1(pVar.c(a12), null);
        m1.f39698b.getClass();
        int i12 = m1.f39699c;
        n1.f39707b.getClass();
        int i13 = n1.f39708c;
        C42784z0 c42784z0 = U.f39811a;
        C22295f c22295f = new C22295f();
        c22295f.j(1.5713f, 1.5714f);
        c22295f.h(8.4284f, 8.4286f);
        C22293d.a.c(aVar2, c22295f.f39885a, 0, k1Var, 1.0f, k1Var2, 1.0f, 2.0f, i12, i13, 4.0f, 14336);
        k1 k1Var3 = new k1(aVar3.f63938l.c(a12), null);
        k1 k1Var4 = new k1(pVar.c(a12), null);
        C22295f c22295f2 = new C22295f();
        c22295f2.j(8.4287f, 1.5714f);
        c22295f2.h(1.5716f, 8.4286f);
        C22293d.a.c(aVar2, c22295f2.f39885a, 0, k1Var3, 1.0f, k1Var4, 1.0f, 2.0f, i12, i13, 4.0f, 14336);
        C22293d c22293dD = aVar2.d();
        if (zBooleanValue) {
            f192788c = c22293dD;
        } else {
            f192787b = c22293dD;
        }
        a12.h();
        return c22293dD;
    }
}
