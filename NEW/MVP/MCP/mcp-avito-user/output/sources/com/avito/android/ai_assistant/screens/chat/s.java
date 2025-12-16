package com.avito.android.ai_assistant.screens.chat;

import Vb.InterfaceC15661a;
import cU0.InterfaceC27108f;
import com.avito.android.ai_assistant.screens.chat.mvi.B;
import com.avito.beduin.v2.engine.component.z;
import iT.C41343c;
import iT.InterfaceC41341a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;

/* compiled from: AiAssistantChatViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/s;", "Lcom/avito/android/arch/mvi/android/j;", "LVb/a;", "LVb/i;", "LVb/h;", "LiT/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s extends com.avito.android.arch.mvi.android.j<InterfaceC15661a, Vb.i, Vb.h> implements InterfaceC41341a {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C41343c f89511N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public s(@Y61.k B b12, @Y61.k C41343c c41343c) {
        super(b12, i2.a.f411432b);
        i2.f411430a.getClass();
        this.f89511N = c41343c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f89511N.f398527c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final z H4() {
        return this.f89511N.f398526b;
    }
}
