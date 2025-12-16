package com.avito.android.messenger.conversation.mvi.messages.composables.messages;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageStub.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i12) {
        super(2);
        this.f192224l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192224l | 1);
        B bE2 = a12.E(-1510830908);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            a.f192214a.getClass();
            com.akita.compose.theme.re23.c.a(false, a.f192218e, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(iA2);
        }
        return G0.f406611a;
    }
}
