package com.avito.android.ai_assistant.screens.chat;

import com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment;
import com.avito.android.favorites.InterfaceC30683q0;
import com.avito.android.favorites.di.C30647e;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements InterfaceC41342b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89171b;

    public /* synthetic */ a(Object obj, int i12) {
        this.f89170a = i12;
        this.f89171b = obj;
    }

    @Override // iT.InterfaceC41342b
    public final InterfaceC41341a invoke() {
        Object obj = this.f89171b;
        switch (this.f89170a) {
            case 0:
                AiAssistantChatFragment.a aVar = AiAssistantChatFragment.f89144v0;
                return ((AiAssistantChatFragment) obj).q5();
            default:
                C30647e c30647e = C30647e.f157320a;
                return (InterfaceC30683q0) obj;
        }
    }
}
