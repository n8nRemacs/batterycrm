package com.avito.android.ai_assistant.di.host;

import com.avito.android.ai_assistant.di.host.a;
import com.avito.android.ai_assistant.screens.AiAssistantHostFragment;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerAiAssistantHostComponent.java */
@e
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: DaggerAiAssistantHostComponent.java */
    public static final class b implements com.avito.android.ai_assistant.di.host.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.ai_assistant.di.host.b f89033a;

        public b(com.avito.android.ai_assistant.di.host.b bVar, a aVar) {
            this.f89033a = bVar;
        }

        @Override // com.avito.android.ai_assistant.di.host.a
        public final void a(AiAssistantHostFragment aiAssistantHostFragment) {
            com.avito.android.ui.status_bar.e eVarB0 = this.f89033a.b0();
            t.c(eVarB0);
            aiAssistantHostFragment.f89141v0 = eVarB0;
        }
    }

    /* compiled from: DaggerAiAssistantHostComponent.java */
    /* renamed from: com.avito.android.ai_assistant.di.host.c$c, reason: collision with other inner class name */
    public static final class C2633c implements a.InterfaceC2632a {
        public C2633c() {
        }

        @Override // com.avito.android.ai_assistant.di.host.a.InterfaceC2632a
        public final com.avito.android.ai_assistant.di.host.a a(com.avito.android.ai_assistant.di.host.b bVar) {
            return new b(bVar, null);
        }
    }

    public static a.InterfaceC2632a a() {
        return new C2633c();
    }
}
