package com.avito.android.messenger.conversation.mvi.messages.composables.other.icons;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AssistantAvatarOverlay.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192782l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12) {
        super(2);
        this.f192782l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192782l | 1);
        B bE2 = a12.E(-1227135846);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            i.f192789a.getClass();
            com.akita.compose.theme.re23.c.a(false, i.f192790b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(iA2);
        }
        return G0.f406611a;
    }
}
