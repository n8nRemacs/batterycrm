package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SpamActionsContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192829l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i12) {
        super(2);
        this.f192829l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192829l | 1);
        B bE2 = a12.E(506339866);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            d.f192746a.getClass();
            com.akita.compose.theme.re23.c.a(false, d.f192749d, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(iA2);
        }
        return G0.f406611a;
    }
}
