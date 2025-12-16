package com.avito.android.comfortable_deal.client_room;

import androidx.compose.runtime.C22126m3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientRoomFragment f119930l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ClientRoomFragment clientRoomFragment) {
        super(2);
        this.f119930l = clientRoomFragment;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ClientRoomFragment clientRoomFragment = this.f119930l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) clientRoomFragment.f119790q0.getValue(), androidx.compose.runtime.internal.r.c(1030828111, new m(clientRoomFragment, C22126m3.b(((F) clientRoomFragment.f119788o0.getValue()).getState(), a13)), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
