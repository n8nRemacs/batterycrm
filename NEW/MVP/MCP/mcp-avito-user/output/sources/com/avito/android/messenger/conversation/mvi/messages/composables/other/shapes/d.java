package com.avito.android.messenger.conversation.mvi.messages.composables.other.shapes;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import l0.n;

/* compiled from: AssistantAvatarClipShape32.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/other/shapes/d;", "Landroidx/compose/ui/graphics/h1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements h1 {
    @Override // androidx.compose.ui.graphics.h1
    @Y61.k
    public final D0 a(long j12, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar) {
        n.a aVar = n.f413402b;
        float fMax = Math.max(Float.intBitsToFloat((int) ((j12 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j12 & 2147483647L))) / 32.0f;
        C22277p c22277pA = C22315w.a();
        float f12 = fMax * 16.0f;
        float f13 = fMax * 0.0f;
        c22277pA.i(f12, f13);
        float f14 = fMax * 24.837f;
        float f15 = 32.0f * fMax;
        float f16 = fMax * 7.163f;
        c22277pA.m(f14, f13, f15, f16, f15, f12);
        float f17 = fMax * 16.562f;
        float f18 = fMax * 31.401f;
        float f19 = fMax * 16.903f;
        float f22 = fMax * 30.875f;
        float f23 = fMax * 16.705f;
        c22277pA.m(f15, f17, f18, f19, f22, f23);
        float f24 = fMax * 29.67f;
        float f25 = fMax * 16.25f;
        float f26 = fMax * 28.364f;
        float f27 = fMax * 27.0f;
        c22277pA.m(f24, f25, f26, f12, f27, f12);
        float f28 = fMax * 20.925f;
        c22277pA.m(f28, f12, f12, f28, f12, f27);
        c22277pA.m(f12, f26, f25, f24, f23, f22);
        c22277pA.m(f19, f18, f17, f15, f12, f15);
        c22277pA.m(f16, f15, f13, f14, f13, f12);
        c22277pA.m(f13, f16, f16, f13, f12, f13);
        c22277pA.close();
        return new D0.a(c22277pA);
    }
}
