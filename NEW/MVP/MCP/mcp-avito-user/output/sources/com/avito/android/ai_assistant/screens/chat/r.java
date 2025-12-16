package com.avito.android.ai_assistant.screens.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class r extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f89510l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar) {
        super(0);
        this.f89510l = qVar;
    }

    @Override // Y41.a
    public final Integer invoke() {
        q qVar = this.f89510l;
        return Integer.valueOf(qVar.f89485f.getVisibility() == 0 ? qVar.f89485f.getMeasuredHeight() : 0);
    }
}
