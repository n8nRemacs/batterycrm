package Mb;

import com.avito.android.ai_assistant.AiAssistantOpenLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AiAssistantOpenLinkModule_ProvideAiAssistantOpenLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Mb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14465b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.ai_assistant.link.c f10830a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.ai_assistant.link.e f10831b;

    public C14465b(com.avito.android.ai_assistant.link.c cVar, com.avito.android.ai_assistant.link.e eVar) {
        this.f10830a = cVar;
        this.f10831b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f10831b.getClass();
        com.avito.android.ai_assistant.link.d dVar = new com.avito.android.ai_assistant.link.d();
        com.avito.android.ai_assistant.link.c cVar = this.f10830a;
        C14464a.f10829a.getClass();
        return new C43834a(AiAssistantOpenLink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AiAssistantOpenLink.class), cVar));
    }
}
