package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message;

import Y41.q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.I3;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.slider.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VoiceMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/slider/q;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/slider/q;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements q<com.akita.compose.component.slider.q, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f192669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I3<m> f192670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.compose.foundation.interaction.m mVar, I3<m> i32) {
        super(3);
        this.f192669l = mVar;
        this.f192670m = i32;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.slider.q qVar, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            float f12 = l.f192690a;
            if (this.f192670m.getF42167b().f192697e) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                t.a(this.f192669l, null, com.akita.compose.theme.re23.b.f63984b.f63938l.c(a13), 6, a13, 3078, 2);
            }
        }
        return G0.f406611a;
    }
}
