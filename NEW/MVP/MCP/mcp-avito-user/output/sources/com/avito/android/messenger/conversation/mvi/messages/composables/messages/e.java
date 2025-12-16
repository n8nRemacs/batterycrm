package com.avito.android.messenger.conversation.mvi.messages.composables.messages;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.MessageDeliveryStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageStub.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12) {
        super(2);
        this.f192253l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192253l | 1);
        B bE2 = a12.E(1002899365);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186166e;
            v vVarD = C20588k2.d(v.f42878y1, 1.0f);
            a.f192214a.getClass();
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.v.a(null, "12:45", messageDeliveryStatus, null, vVarD, null, null, null, null, null, null, null, null, a.f192216c, bE2, 28086, 3072, 8160);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(iA2);
        }
        return G0.f406611a;
    }
}
